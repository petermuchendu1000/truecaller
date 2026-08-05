package com.truecaller.insights.catx.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/catx/data/SenderType;", "", "<init>", "(Ljava/lang/String;I)V", "SAVED", "REPLIED", "BLOCKED", "WHITELISTED", "VERIFIED", "BUSINESS", "KNOWN", "BUSINESS_IM", "GOVERNMENT", "PROMOTIONAL", "TEST_SENDER", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SenderType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.data.SenderType[] $VALUES;
    public static final com.truecaller.insights.catx.data.SenderType SAVED = new com.truecaller.insights.catx.data.SenderType("SAVED", 0);
    public static final com.truecaller.insights.catx.data.SenderType REPLIED = new com.truecaller.insights.catx.data.SenderType("REPLIED", 1);
    public static final com.truecaller.insights.catx.data.SenderType BLOCKED = new com.truecaller.insights.catx.data.SenderType("BLOCKED", 2);
    public static final com.truecaller.insights.catx.data.SenderType WHITELISTED = new com.truecaller.insights.catx.data.SenderType("WHITELISTED", 3);
    public static final com.truecaller.insights.catx.data.SenderType VERIFIED = new com.truecaller.insights.catx.data.SenderType("VERIFIED", 4);
    public static final com.truecaller.insights.catx.data.SenderType BUSINESS = new com.truecaller.insights.catx.data.SenderType("BUSINESS", 5);
    public static final com.truecaller.insights.catx.data.SenderType KNOWN = new com.truecaller.insights.catx.data.SenderType("KNOWN", 6);
    public static final com.truecaller.insights.catx.data.SenderType BUSINESS_IM = new com.truecaller.insights.catx.data.SenderType("BUSINESS_IM", 7);
    public static final com.truecaller.insights.catx.data.SenderType GOVERNMENT = new com.truecaller.insights.catx.data.SenderType("GOVERNMENT", 8);
    public static final com.truecaller.insights.catx.data.SenderType PROMOTIONAL = new com.truecaller.insights.catx.data.SenderType("PROMOTIONAL", 9);
    public static final com.truecaller.insights.catx.data.SenderType TEST_SENDER = new com.truecaller.insights.catx.data.SenderType("TEST_SENDER", 10);

    private static final /* synthetic */ com.truecaller.insights.catx.data.SenderType[] $values() {
        return new com.truecaller.insights.catx.data.SenderType[]{SAVED, REPLIED, BLOCKED, WHITELISTED, VERIFIED, BUSINESS, KNOWN, BUSINESS_IM, GOVERNMENT, PROMOTIONAL, TEST_SENDER};
    }

    static {
        com.truecaller.insights.catx.data.SenderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SenderType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.data.SenderType valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.data.SenderType) java.lang.Enum.valueOf(com.truecaller.insights.catx.data.SenderType.class, str);
    }

    public static com.truecaller.insights.catx.data.SenderType[] values() {
        return (com.truecaller.insights.catx.data.SenderType[]) $VALUES.clone();
    }
}
