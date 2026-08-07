package com.uidemo.truecaller.model;

/**
 * One M-PESA message shown in the MPESA conversation. Unifies real invest254 wallet
 * transactions and locally-simulated M-PESA SMS so the Messages screen, the conversation
 * thread and the notification listener all work on a single timestamp-ordered type.
 */
public class MpesaMsg {
    public long ts;             // epoch ms (used for ordering + read/notify cursors)
    public boolean credit;      // true = money in, false = money out
    public String amountText;   // "Ksh50.00" (M-PESA style)
    public String party;        // counterparty as shown after "from"/"to" (may include masked phone)
    public String code;         // 10-char transaction code
    public String fullBody;     // full SMS body rendered in the thread
    public boolean sim;         // true = locally simulated filler, false = real invest254 tx
    public boolean fuliza;      // true = Fuliza service SMS (fee / repayment) — no +/- amount row
    public boolean failed;      // true = declined transaction (insufficient funds) — no money moved

    public MpesaMsg() {}

    public MpesaMsg(long ts, boolean credit, String amountText, String party, String code, String fullBody, boolean sim) {
        this(ts, credit, amountText, party, code, fullBody, sim, false, false);
    }

    public MpesaMsg(long ts, boolean credit, String amountText, String party, String code, String fullBody, boolean sim, boolean fuliza) {
        this(ts, credit, amountText, party, code, fullBody, sim, fuliza, false);
    }

    public MpesaMsg(long ts, boolean credit, String amountText, String party, String code, String fullBody, boolean sim, boolean fuliza, boolean failed) {
        this.ts = ts; this.credit = credit; this.amountText = amountText;
        this.party = party; this.code = code; this.fullBody = fullBody; this.sim = sim;
        this.fuliza = fuliza; this.failed = failed;
    }

    /** Short list/thread label — per spec, received money reads simply "Received". */
    public String subtitle() { return failed ? "Failed" : (fuliza ? "Fuliza" : (credit ? "Received" : "Sent")); }

    /** Signed amount for the row/card, e.g. "+ KSH 50.00" / "- KSH 700.00". Fuliza service and failed SMS show no amount. */
    public String amountRow() { return (fuliza || failed) ? null : ((credit ? "+ " : "- ") + amountText.replace("Ksh", "KSH ")); }

    /** Truecaller AI-summary line, e.g. "UH5JG1P0XL received Ksh50.00 from PETER MUCHENDU 0713***703." */
    public String summary() {
        return code + (credit ? " received " : " sent ") + amountText + (credit ? " from " : " to ") + party + ".";
    }
}
