package com.uidemo.truecaller.update;

import android.app.Activity;
import android.app.AlertDialog;

import com.gumloop.updater.UpdateChecker;
import com.gumloop.updater.UpdateChecker.UpdateInfo;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Launch-time OTA update check for the Truecaller UI app.
 */
public final class AppUpdater {

    // Self-hosted update manifest.
    public static final String MANIFEST_URL = "https://raw.githubusercontent.com/petermuchendu1000/truecaller/main/ota/version.json";

    private static final ExecutorService IO = Executors.newSingleThreadExecutor();

    private AppUpdater() {}

    public static void checkOnLaunch(Activity activity) {
        IO.execute(() -> {
            try {
                UpdateInfo info = UpdateChecker.check(activity, MANIFEST_URL);
                if (info != null) {
                    activity.runOnUiThread(() -> showDialog(activity, info));
                }
            } catch (Exception ignored) {
                // Stay silent on launch when the check fails (offline, server down, etc.)
            }
        });
    }

    private static void showDialog(Activity activity, UpdateInfo info) {
        if (activity.isFinishing() || activity.isDestroyed()) return;
        boolean mandatory;
        try {
            mandatory = info.isMandatory(UpdateChecker.currentVersionCode(activity));
        } catch (Exception e) {
            mandatory = false;
        }
        AlertDialog.Builder b = new AlertDialog.Builder(activity)
                .setTitle("Update available — " + info.versionName)
                .setMessage(info.notes.isEmpty() ? "A new version is available." : info.notes)
                .setPositiveButton("Update now", (d, w) -> downloadAndInstall(activity, info))
                .setCancelable(!mandatory);
        if (!mandatory) b.setNegativeButton("Later", null);
        b.show();
    }

    private static void downloadAndInstall(Activity activity, UpdateInfo info) {
        IO.execute(() -> {
            try {
                File apk = UpdateChecker.downloadVerified(activity, info);
                activity.runOnUiThread(() -> UpdateChecker.install(activity, apk));
            } catch (Exception e) {
                activity.runOnUiThread(() -> new AlertDialog.Builder(activity)
                        .setTitle("Update failed")
                        .setMessage(e.getMessage() == null ? "Could not download the update." : e.getMessage())
                        .setPositiveButton("OK", null)
                        .show());
            }
        });
    }
}
