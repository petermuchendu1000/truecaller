package com.truecaller.insights.fraud.url.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/insights/fraud/url/api/SenderType;", "", "<init>", "(Ljava/lang/String;I)V", "UNSPECIFIED", "PHONE_NUMBER", "SHORTCODE", "ALPHANUMERIC", "BIZ_IM", "P2P_IM", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SenderType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.url.api.SenderType[] $VALUES;
    public static final com.truecaller.insights.fraud.url.api.SenderType UNSPECIFIED = new com.truecaller.insights.fraud.url.api.SenderType("UNSPECIFIED", 0);
    public static final com.truecaller.insights.fraud.url.api.SenderType PHONE_NUMBER = new com.truecaller.insights.fraud.url.api.SenderType("PHONE_NUMBER", 1);
    public static final com.truecaller.insights.fraud.url.api.SenderType SHORTCODE = new com.truecaller.insights.fraud.url.api.SenderType("SHORTCODE", 2);
    public static final com.truecaller.insights.fraud.url.api.SenderType ALPHANUMERIC = new com.truecaller.insights.fraud.url.api.SenderType("ALPHANUMERIC", 3);
    public static final com.truecaller.insights.fraud.url.api.SenderType BIZ_IM = new com.truecaller.insights.fraud.url.api.SenderType("BIZ_IM", 4);
    public static final com.truecaller.insights.fraud.url.api.SenderType P2P_IM = new com.truecaller.insights.fraud.url.api.SenderType("P2P_IM", 5);

    private static final /* synthetic */ com.truecaller.insights.fraud.url.api.SenderType[] $values() {
        return new com.truecaller.insights.fraud.url.api.SenderType[]{UNSPECIFIED, PHONE_NUMBER, SHORTCODE, ALPHANUMERIC, BIZ_IM, P2P_IM};
    }

    static {
        com.truecaller.insights.fraud.url.api.SenderType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SenderType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.url.api.SenderType valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.url.api.SenderType) java.lang.Enum.valueOf(com.truecaller.insights.fraud.url.api.SenderType.class, str);
    }

    public static com.truecaller.insights.fraud.url.api.SenderType[] values() {
        return (com.truecaller.insights.fraud.url.api.SenderType[]) $VALUES.clone();
    }
}
