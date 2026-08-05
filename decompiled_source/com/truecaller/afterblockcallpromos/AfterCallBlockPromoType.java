package com.truecaller.afterblockcallpromos;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/afterblockcallpromos/AfterCallBlockPromoType;", "Ljava/io/Serializable;", "", "", "action", "", "actionResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "I", "getActionResId", "()I", "Companion", "zb0/d", "RateApp", "BlockSettings", "ReferApp", "Details", "after-block-call-promos_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AfterCallBlockPromoType implements java.io.Serializable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final zb0.d Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String action;
    private final int actionResId;
    public static final com.truecaller.afterblockcallpromos.AfterCallBlockPromoType RateApp = new com.truecaller.afterblockcallpromos.AfterCallBlockPromoType("RateApp", 0, "rate-app", 2132019426);
    public static final com.truecaller.afterblockcallpromos.AfterCallBlockPromoType BlockSettings = new com.truecaller.afterblockcallpromos.AfterCallBlockPromoType("BlockSettings", 1, "explore-block-settings", 2132019423);
    public static final com.truecaller.afterblockcallpromos.AfterCallBlockPromoType ReferApp = new com.truecaller.afterblockcallpromos.AfterCallBlockPromoType("ReferApp", 2, "refer-app", 2132019427);
    public static final com.truecaller.afterblockcallpromos.AfterCallBlockPromoType Details = new com.truecaller.afterblockcallpromos.AfterCallBlockPromoType("Details", 3, "show-detail-view", 2132019425);

    private static final /* synthetic */ com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[] $values() {
        return new com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[]{RateApp, BlockSettings, ReferApp, Details};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, zb0.d] */
    static {
        com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AfterCallBlockPromoType(java.lang.String str, int i, java.lang.String str2, int i2) {
        this.action = str2;
        this.actionResId = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.afterblockcallpromos.AfterCallBlockPromoType valueOf(java.lang.String str) {
        return (com.truecaller.afterblockcallpromos.AfterCallBlockPromoType) java.lang.Enum.valueOf(com.truecaller.afterblockcallpromos.AfterCallBlockPromoType.class, str);
    }

    public static com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[] values() {
        return (com.truecaller.afterblockcallpromos.AfterCallBlockPromoType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return this.action;
    }

    public final int getActionResId() {
        return this.actionResId;
    }
}
