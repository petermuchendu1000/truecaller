package com.uidemo.truecaller.notify;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.uidemo.truecaller.MainActivity;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.api.Invest254Api;

/**
 * Truecaller-styled SMS notifications for invest254 withdrawals.
 *
 * Mirrors the real Truecaller SMS alert (see reference screenshot):
 *   - Header:  "Truecaller • SMS from MPESA • now"   (app name + sender + time, system-rendered)
 *   - Large icon: the circular M-PESA logo (white circle, green M-PESA mark)
 *   - Body:    "UH5JG1P0XL received Ksh50.00 from PETER MUCHENDU 0713***703."
 *              (AI-summary style: code + "received" + amount + party — no "Confirmed.You have")
 *   - Action:  "Mark as read"
 *   - Small icon: Truecaller glyph (white on the brand blue circle, tinted #146FF5)
 *
 * The full M-PESA SMS body (with balance + OneApp link) is what the in-app Messages screen and
 * the expanded BigTextStyle show; the collapsed line is the short summary form.
 */
public class TcNotifications {
    public static final String CHANNEL_ID = "tc_sms";
    private static final String CHANNEL_NAME = "SMS messages";
    private static final int TRUECALLER_BLUE = 0xFF146FF5;

    /** Idempotent high-importance channel so alerts pop heads-up on Android 8+. */
    public static void ensureChannel(Context ctx) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return;
        NotificationManager mgr = ctx.getSystemService(NotificationManager.class);
        if (mgr.getNotificationChannel(CHANNEL_ID) != null) return;
        NotificationChannel ch = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
        ch.setDescription("Incoming M-PESA and transaction SMS alerts");
        ch.enableVibration(true);
        ch.setShowBadge(true);
        mgr.createNotificationChannel(ch);
    }

    public static boolean canPost(Context ctx) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU) return true;
        return ContextCompat.checkSelfPermission(ctx, android.Manifest.permission.POST_NOTIFICATIONS)
                == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * Post a Truecaller-style "SMS from MPESA" notification for one transaction.
     * tx.mpesaMessage is the full SMS; the collapsed text is the short summary form.
     */
    public static void showSms(Context ctx, Invest254Api.Tx tx) {
        ensureChannel(ctx);
        if (!canPost(ctx)) return;

        // Collapsed line: "UH5JG1P0XL received Ksh50.00 from PETER MUCHENDU 0713***703."
        String summary = tx.mpesaCode + " received " + tx.mpesaAmountText + " from " + tx.mpesaParty + ".";
        if (!"in".equals(tx.direction)) {
            summary = tx.mpesaCode + " sent " + tx.mpesaAmountText + " to " + tx.mpesaParty + ".";
        }

        Intent open = new Intent(ctx, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .putExtra("openMessages", true);
        PendingIntent openPi = PendingIntent.getActivity(ctx, tx.hashCode(), open,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        // "Mark as read" action — clears the unread flag for this tx without opening the app.
        Intent markRead = new Intent(ctx, MarkReadReceiver.class)
                .setAction(MarkReadReceiver.ACTION_MARK_READ)
                .putExtra(MarkReadReceiver.EXTRA_TX_ID, tx.id);
        PendingIntent markReadPi = PendingIntent.getBroadcast(ctx, (int) (tx.id % Integer.MAX_VALUE), markRead,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder b = new NotificationCompat.Builder(ctx, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_tc_glyph)
                .setColor(TRUECALLER_BLUE)
                .setLargeIcon(mpesaLogo(ctx))
                .setContentTitle("SMS from MPESA")
                .setContentText(summary)
                .setStyle(new NotificationCompat.BigTextStyle().bigText(tx.mpesaMessage))
                .setSubText("Truecaller")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setContentIntent(openPi)
                .addAction(0, "Mark as read", markReadPi);

        // Stable id per ledger entry: re-polls update rather than duplicate.
        NotificationManagerCompat.from(ctx).notify((int) (tx.id % Integer.MAX_VALUE), b.build());
    }

    /** Circular M-PESA logo bitmap for the notification large icon. */
    private static Bitmap mpesaLogo(Context ctx) {
        Drawable d = ContextCompat.getDrawable(ctx, R.drawable.av_mpesa);
        if (d == null) return null;
        int size = (int) (ctx.getResources().getDisplayMetrics().density * 96);
        Bitmap src = BitmapFactory.decodeResource(ctx.getResources(), R.drawable.av_mpesa);
        Bitmap scaled = Bitmap.createScaledBitmap(src, size, size, true);
        Bitmap out = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(out);
        android.graphics.Paint paint = new android.graphics.Paint(android.graphics.Paint.ANTI_ALIAS_FLAG);
        android.graphics.Path path = new android.graphics.Path();
        path.addCircle(size / 2f, size / 2f, size / 2f, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawBitmap(scaled, 0, 0, paint);
        return out;
    }
}
