package com.uidemo.truecaller.api;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.uidemo.truecaller.model.MpesaMsg;
import com.uidemo.truecaller.notify.TcNotifications;

/**
 * Builds the unified MPESA conversation feed: real invest254 wallet transactions merged with
 * locally-simulated M-PESA SMS, newest-first by timestamp. Also raises Truecaller-style
 * notifications for messages newer than the notify cursor (works from foreground poll and the
 * background worker alike).
 */
public final class MpesaFeed {
    private MpesaFeed() {}

    /** Map one real invest254 transaction to the unified message type. */
    public static MpesaMsg fromTx(Invest254Api.Tx t) {
        return new MpesaMsg(t.createdAtMs, "in".equals(t.direction), t.mpesaAmountText,
                t.mpesaParty, t.mpesaCode, t.mpesaMessage, false);
    }

    /** Merge real transactions with simulated SMS, newest-first. */
    public static List<MpesaMsg> merge(Context ctx, List<Invest254Api.Tx> real) {
        List<MpesaMsg> out = new ArrayList<>();
        if (real != null) for (Invest254Api.Tx t : real) out.add(fromTx(t));
        out.addAll(new MpesaSim(ctx).syncAndGetAll());
        Collections.sort(out, new Comparator<MpesaMsg>() {
            @Override public int compare(MpesaMsg a, MpesaMsg b) { return Long.compare(b.ts, a.ts); }
        });
        return out;
    }

    /**
     * Raise notifications for every message newer than the notify cursor. On the very first run we
     * only seed the cursors (no burst of historical alerts). Advances the notify cursor to newest.
     */
    public static void notifyNew(Context ctx, List<MpesaMsg> merged) {
        ApiClient client = ApiClient.get(ctx);
        long lastNotified = client.getLastNotifiedMs();
        long maxTs = lastNotified;
        for (MpesaMsg m : merged) if (m.ts > maxTs) maxTs = m.ts;

        if (!client.isFeedSeeded()) {           // first ever poll — don't spam history
            client.setLastNotifiedMs(maxTs);
            client.setLastReadMs(maxTs);
            client.setFeedSeeded();
            return;
        }
        // oldest-first so the newest alert ends up on top of the shade
        for (int i = merged.size() - 1; i >= 0; i--) {
            MpesaMsg m = merged.get(i);
            if (m.ts > lastNotified) TcNotifications.showSms(ctx, m);
        }
        client.setLastNotifiedMs(maxTs);
    }
}
