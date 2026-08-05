package com.truecaller.premium.giveaway;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/giveaway/GiveawayGrantDialogAction;", "", "", "actionCode", "<init>", "(Ljava/lang/String;II)V", "I", "getActionCode", "()I", "Companion", "cb2/b", "CHECK_OUT_PREMIUM", "GOT_IT", "DISMISS", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GiveawayGrantDialogAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.giveaway.GiveawayGrantDialogAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final cb2.b Companion;
    private final int actionCode;
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogAction CHECK_OUT_PREMIUM = new com.truecaller.premium.giveaway.GiveawayGrantDialogAction("CHECK_OUT_PREMIUM", 0, 0);
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogAction GOT_IT = new com.truecaller.premium.giveaway.GiveawayGrantDialogAction("GOT_IT", 1, 1);
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogAction DISMISS = new com.truecaller.premium.giveaway.GiveawayGrantDialogAction("DISMISS", 2, 2);
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogAction UNKNOWN = new com.truecaller.premium.giveaway.GiveawayGrantDialogAction("UNKNOWN", 3, -1);

    private static final /* synthetic */ com.truecaller.premium.giveaway.GiveawayGrantDialogAction[] $values() {
        return new com.truecaller.premium.giveaway.GiveawayGrantDialogAction[]{CHECK_OUT_PREMIUM, GOT_IT, DISMISS, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cb2.b, java.lang.Object] */
    static {
        com.truecaller.premium.giveaway.GiveawayGrantDialogAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private GiveawayGrantDialogAction(java.lang.String str, int i, int i2) {
        this.actionCode = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogAction fromActionCode(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        Companion.getClass();
        return cb2.b.a(num);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.giveaway.GiveawayGrantDialogAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.giveaway.GiveawayGrantDialogAction) java.lang.Enum.valueOf(com.truecaller.premium.giveaway.GiveawayGrantDialogAction.class, str);
    }

    public static com.truecaller.premium.giveaway.GiveawayGrantDialogAction[] values() {
        return (com.truecaller.premium.giveaway.GiveawayGrantDialogAction[]) $VALUES.clone();
    }

    public final int getActionCode() {
        return this.actionCode;
    }
}
