package com.truecaller.premium.interstitial;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/premium/interstitial/InterstitialDeeplinkAction;", "", "", "actionId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "qb2/f", "UPDATE_SPAM_PROTECTION_MANUALLY", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InterstitialDeeplinkAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.interstitial.InterstitialDeeplinkAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final qb2.f Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionId;
    public static final com.truecaller.premium.interstitial.InterstitialDeeplinkAction UPDATE_SPAM_PROTECTION_MANUALLY = new com.truecaller.premium.interstitial.InterstitialDeeplinkAction("UPDATE_SPAM_PROTECTION_MANUALLY", 0, "update_manually");
    public static final com.truecaller.premium.interstitial.InterstitialDeeplinkAction UNKNOWN = new com.truecaller.premium.interstitial.InterstitialDeeplinkAction("UNKNOWN", 1, "unknown");

    private static final /* synthetic */ com.truecaller.premium.interstitial.InterstitialDeeplinkAction[] $values() {
        return new com.truecaller.premium.interstitial.InterstitialDeeplinkAction[]{UPDATE_SPAM_PROTECTION_MANUALLY, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, qb2.f] */
    static {
        com.truecaller.premium.interstitial.InterstitialDeeplinkAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private InterstitialDeeplinkAction(java.lang.String str, int i, java.lang.String str2) {
        this.actionId = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.interstitial.InterstitialDeeplinkAction fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return qb2.f.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.interstitial.InterstitialDeeplinkAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.interstitial.InterstitialDeeplinkAction) java.lang.Enum.valueOf(com.truecaller.premium.interstitial.InterstitialDeeplinkAction.class, str);
    }

    public static com.truecaller.premium.interstitial.InterstitialDeeplinkAction[] values() {
        return (com.truecaller.premium.interstitial.InterstitialDeeplinkAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionId() {
        return this.actionId;
    }
}
