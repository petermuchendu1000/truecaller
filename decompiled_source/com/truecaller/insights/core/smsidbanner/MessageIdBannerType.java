package com.truecaller.insights.core.smsidbanner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/core/smsidbanner/MessageIdBannerType;", "", "<init>", "(Ljava/lang/String;I)V", "OTP", "CATEGORY", "FRAUD", "SPAM", "CATEGORY_MODEL", "GOV_UPDATE", "FEEDBACK", "CONVICTED_FRAUD", "REGULAR", "SUMMARY", "USE_CASE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessageIdBannerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.smsidbanner.MessageIdBannerType[] $VALUES;
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType OTP = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("OTP", 0);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType CATEGORY = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("CATEGORY", 1);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType FRAUD = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("FRAUD", 2);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType SPAM = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("SPAM", 3);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType CATEGORY_MODEL = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("CATEGORY_MODEL", 4);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType GOV_UPDATE = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("GOV_UPDATE", 5);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType FEEDBACK = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("FEEDBACK", 6);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType CONVICTED_FRAUD = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("CONVICTED_FRAUD", 7);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType REGULAR = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("REGULAR", 8);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType SUMMARY = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("SUMMARY", 9);
    public static final com.truecaller.insights.core.smsidbanner.MessageIdBannerType USE_CASE = new com.truecaller.insights.core.smsidbanner.MessageIdBannerType("USE_CASE", 10);

    private static final /* synthetic */ com.truecaller.insights.core.smsidbanner.MessageIdBannerType[] $values() {
        return new com.truecaller.insights.core.smsidbanner.MessageIdBannerType[]{OTP, CATEGORY, FRAUD, SPAM, CATEGORY_MODEL, GOV_UPDATE, FEEDBACK, CONVICTED_FRAUD, REGULAR, SUMMARY, USE_CASE};
    }

    static {
        com.truecaller.insights.core.smsidbanner.MessageIdBannerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MessageIdBannerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.smsidbanner.MessageIdBannerType valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.smsidbanner.MessageIdBannerType) java.lang.Enum.valueOf(com.truecaller.insights.core.smsidbanner.MessageIdBannerType.class, str);
    }

    public static com.truecaller.insights.core.smsidbanner.MessageIdBannerType[] values() {
        return (com.truecaller.insights.core.smsidbanner.MessageIdBannerType[]) $VALUES.clone();
    }
}
