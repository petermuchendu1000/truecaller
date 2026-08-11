package com.gumloop.updater;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

import androidx.core.content.FileProvider;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;

/** Self-hosted OTA updater for sideloaded apps (no Google Play). */
public final class UpdateChecker {

    public static final class UpdateInfo {
        public final int versionCode;
        public final String versionName;
        public final String apkUrl;
        public final String sha256;
        public final String notes;
        public final int minSupportedVersionCode;

        UpdateInfo(int versionCode, String versionName, String apkUrl, String sha256,
                   String notes, int minSupportedVersionCode) {
            this.versionCode = versionCode;
            this.versionName = versionName;
            this.apkUrl = apkUrl;
            this.sha256 = sha256;
            this.notes = notes;
            this.minSupportedVersionCode = minSupportedVersionCode;
        }

        public boolean isMandatory(int currentVersionCode) {
            return currentVersionCode < minSupportedVersionCode;
        }
    }

    private UpdateChecker() {}

    public static UpdateInfo parseManifest(String json) throws Exception {
        JSONObject o = new JSONObject(json);
        return new UpdateInfo(
                o.getInt("versionCode"),
                o.optString("versionName", ""),
                o.getString("url"),
                o.getString("sha256").toLowerCase(),
                o.optString("notes", ""),
                o.optInt("minSupportedVersionCode", 1));
    }

    public static boolean isUpdateAvailable(int currentVersionCode, UpdateInfo info) {
        return info.versionCode > currentVersionCode;
    }

    public static UpdateInfo check(Context ctx, String manifestUrl) throws Exception {
        UpdateInfo info = parseManifest(httpGet(manifestUrl, 10_000, 10_000));
        return isUpdateAvailable(currentVersionCode(ctx), info) ? info : null;
    }

    public static File downloadVerified(Context ctx, UpdateInfo info) throws Exception {
        File out = new File(ctx.getExternalFilesDir(null), "update-" + info.versionCode + ".apk");
        HttpURLConnection c = (HttpURLConnection) new URL(info.apkUrl).openConnection();
        c.setConnectTimeout(15_000);
        c.setReadTimeout(60_000);
        try (InputStream in = c.getInputStream(); FileOutputStream fos = new FileOutputStream(out)) {
            byte[] buf = new byte[65536];
            for (int n; (n = in.read(buf)) >= 0; ) fos.write(buf, 0, n);
        }
        String digest = sha256Hex(out);
        if (!digest.equals(info.sha256)) {
            out.delete();
            throw new SecurityException(
                    "APK hash mismatch: expected " + info.sha256 + ", got " + digest);
        }
        return out;
    }

    public static void install(Context ctx, File apk) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
                && !ctx.getPackageManager().canRequestPackageInstalls()) {
            Intent i = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                    Uri.parse("package:" + ctx.getPackageName()))
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            ctx.startActivity(i);
            return;
        }
        Uri uri = FileProvider.getUriForFile(ctx, ctx.getPackageName() + ".updateprovider", apk);
        Intent i = new Intent(Intent.ACTION_VIEW)
                .setDataAndType(uri, "application/vnd.android.package-archive")
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                .addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        ctx.startActivity(i);
    }

    public static int currentVersionCode(Context ctx) throws Exception {
        PackageInfo pi = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 0);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return (int) pi.getLongVersionCode();
        }
        @SuppressWarnings("deprecation")
        int vc = pi.versionCode;
        return vc;
    }

    static String httpGet(String url, int connectTimeoutMs, int readTimeoutMs) throws Exception {
        HttpURLConnection c = (HttpURLConnection) new URL(url).openConnection();
        c.setConnectTimeout(connectTimeoutMs);
        c.setReadTimeout(readTimeoutMs);
        if (c.getResponseCode() < 200 || c.getResponseCode() > 299) {
            throw new java.io.IOException("HTTP " + c.getResponseCode());
        }
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (InputStream in = c.getInputStream()) {
            byte[] buf = new byte[8192];
            for (int n; (n = in.read(buf)) >= 0; ) out.write(buf, 0, n);
        }
        return out.toString("UTF-8");
    }

    static String sha256Hex(File f) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        try (InputStream in = new FileInputStream(f)) {
            byte[] buf = new byte[65536];
            for (int n; (n = in.read(buf)) >= 0; ) md.update(buf, 0, n);
        }
        StringBuilder hex = new StringBuilder();
        for (byte b : md.digest()) hex.append(String.format("%02x", b));
        return hex.toString();
    }
}
