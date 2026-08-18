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
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.uidemo.truecaller.MainActivity;
import com.uidemo.truecaller.R;
import com.uidemo.truecaller.model.MpesaMsg;

/**
 * Truecaller-styled SMS notification for M-PESA messages, matching the real app's alert:
 *
 *   Header:     Truecaller • SMS from MPESA • now      (app name • subText • time)
 *   Large icon: circular M-PESA logo
 *   Small icon: Truecaller glyph, tinted brand blue (#146FF5)
 *   Body:       "UH5JG1P0XL received Ksh50.00 from PETER MUCHENDU 0713***703."  (AI-summary form)
 *   Expanded:   the full M-PESA SMS body
 *   Action:     Mark as read
 *
 * Truecaller renders the sender as the notification's subtitle ("SMS from MPESA"), NOT as a bold
 * content title — so we set subText and leave the title empty, and the OS shows the app label
 * "Truecaller" first. The collapsed line is the parsed AI summary, not the raw SMS.
 */
public class TcNotifications {
    public static final String CHANNEL_ID = "tc_sms";
    private static final String CHANNEL_NAME = "SMS messages";
    private static final int TRUECALLER_BLUE = 0xFF146FF5;

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

    /** Post a Truecaller-style "SMS from MPESA" notification for one message. */
    public static void showSms(Context ctx, MpesaMsg m) {
        ensureChannel(ctx);
        if (!canPost(ctx)) return;

        int id = (int) (m.ts % Integer.MAX_VALUE);

        Intent open = new Intent(ctx, MainActivity.class)
                .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP)
                .putExtra("openMessages", true);
        PendingIntent openPi = PendingIntent.getActivity(ctx, id, open,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        Intent markRead = new Intent(ctx, MarkReadReceiver.class)
                .setAction(MarkReadReceiver.ACTION_MARK_READ)
                .putExtra(MarkReadReceiver.EXTRA_TS, m.ts);
        PendingIntent markReadPi = PendingIntent.getBroadcast(ctx, id, markRead,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        // Custom Truecaller-style layout (matches the reference): blue-circle message icon top-left,
        // "Truecaller · SMS from MPESA · now" header, circular white-bg M-PESA logo, AI summary,
        // "✨ AI summary" label, and a left-aligned "Mark as read" action.
        // The system draws the header row (white-bubble small icon in a blue circle, app name
        // "Truecaller", subText "SMS from MPESA", time, expander) via DecoratedCustomViewStyle.
        // Our custom view supplies only the body: circular M-PESA logo, the AI-summary line, a
        // golden "AI summary" sparkle, and a left-aligned "Mark as read" action.
        RemoteViews content = new RemoteViews(ctx.getPackageName(), R.layout.notification_mpesa);
        content.setTextViewText(R.id.ntf_summary, m.summary());
        content.setOnClickPendingIntent(R.id.ntf_mark_read, markReadPi);

        NotificationCompat.Builder b = new NotificationCompat.Builder(ctx, CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_notif_msg)
                .setColor(TRUECALLER_BLUE)
                .setSubText("SMS from MPESA")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setAutoCancel(true)
                .setContentIntent(openPi)
                .setCustomContentView(content)
                .setCustomBigContentView(content)
                .setStyle(new NotificationCompat.DecoratedCustomViewStyle());

        NotificationManagerCompat.from(ctx).notify(id, b.build());
    }

    /** Circular white-background M-PESA logo bitmap for the standard-template fallback. */
    private static Bitmap mpesaLogo(Context ctx) {
        try {
            int size = (int) (ctx.getResources().getDisplayMetrics().density * 96);
            Bitmap src = BitmapFactory.decodeResource(ctx.getResources(), R.mipmap.av_mpesa_circle);
            if (src == null) return null;
            return Bitmap.createScaledBitmap(src, size, size, true);
        } catch (Exception e) { return null; }
    }
}
