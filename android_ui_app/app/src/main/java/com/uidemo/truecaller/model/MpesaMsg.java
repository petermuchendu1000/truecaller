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

    public MpesaMsg() {}

    public MpesaMsg(long ts, boolean credit, String amountText, String party, String code, String fullBody, boolean sim) {
        this.ts = ts; this.credit = credit; this.amountText = amountText;
        this.party = party; this.code = code; this.fullBody = fullBody; this.sim = sim;
    }

    /** Short list/thread label — per spec, received money reads simply "Received". */
    public String subtitle() { return credit ? "Received" : "Sent"; }

    /** Signed amount for the row/card, e.g. "+ KSH 50.00" / "- KSH 700.00". */
    public String amountRow() { return (credit ? "+ " : "- ") + amountText.replace("Ksh", "KSH "); }

    /** Truecaller AI-summary line, e.g. "UH5JG1P0XL received Ksh50.00 from PETER MUCHENDU 0713***703." */
    public String summary() {
        return code + (credit ? " received " : " sent ") + amountText + (credit ? " from " : " to ") + party + ".";
    }
}
