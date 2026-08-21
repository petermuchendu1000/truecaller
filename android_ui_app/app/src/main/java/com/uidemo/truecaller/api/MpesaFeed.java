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
        MpesaMsg m = new MpesaMsg(t.createdAtMs, "in".equals(t.direction), t.mpesaAmountText,
                t.mpesaParty, t.mpesaCode, t.mpesaMessage, false);
        m.txId = t.id;   // real ledger id -> id-based (clock-independent) notification de-dup
        return m;
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
     * only seed the cursors (no burst of historical alerts). Advances the cursors to newest.
     *
     * De-dup strategy differs by message kind:
     *  - REAL invest254 transactions (txId > 0) are keyed on the monotonic ledger id. This is
     *    clock-INDEPENDENT: a device whose clock runs ahead of the server can no longer seed the
     *    timestamp cursor past a withdrawal's server timestamp and silently swallow its alert
     *    (the exact bug that stopped truecaller from showing marketer withdrawal messages while
     *    the M-PESA app — which already keys off the ledger id — kept working).
     *  - Simulated filler SMS (txId == 0) keep the timestamp cursor, since they have no ledger id.
     */
    public static void notifyNew(Context ctx, List<MpesaMsg> merged) {
        ApiClient client = ApiClient.get(ctx);
        long lastNotifiedMs = client.getLastNotifiedMs();
        long lastNotifiedTxId = client.getLastNotifiedTxId();
        long maxTs = lastNotifiedMs, maxTxId = lastNotifiedTxId;
        for (MpesaMsg m : merged) {
            if (m.ts > maxTs) maxTs = m.ts;
            if (m.txId > maxTxId) maxTxId = m.txId;
        }

        if (!client.isFeedSeeded()) {           // first ever poll — don't spam history
            client.setLastNotifiedMs(maxTs);
            client.setLastReadMs(maxTs);
            client.setLastNotifiedTxId(maxTxId);
            client.setFeedSeeded();
            return;
        }
        // oldest-first so the newest alert ends up on top of the shade
        for (int i = merged.size() - 1; i >= 0; i--) {
            MpesaMsg m = merged.get(i);
            boolean isNew = (m.txId > 0)
                    ? m.txId > lastNotifiedTxId     // real tx: monotonic ledger id (clock-independent)
                    : m.ts > lastNotifiedMs;        // simulated SMS: timestamp cursor
            if (isNew) TcNotifications.showSms(ctx, m);
        }
        client.setLastNotifiedMs(maxTs);
        client.setLastNotifiedTxId(maxTxId);
    }
}
