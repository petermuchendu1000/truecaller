package com.truecaller.bizmon.callMeBack.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/analytics/BizCallMeBackContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "FACS_V2", "PACS_V2", "NEO_FACS_V2", "NEO_PACS_V2", "DETAILS_VIEW", "DETAILS_VIEW_BOTTOM_SHEET", "DETAILS_VIEW_NOTIFICATION", "GENERATE_DAY_TIME_SLOTS", "UNKNOWN", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallMeBackContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext FACS_V2 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("FACS_V2", 0, "FacsV2");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext PACS_V2 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("PACS_V2", 1, "PacsV2");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext NEO_FACS_V2 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("NEO_FACS_V2", 2, "NeoFacsV2");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext NEO_PACS_V2 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("NEO_PACS_V2", 3, "NeoPacsV2");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext DETAILS_VIEW = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("DETAILS_VIEW", 4, "DetailsView");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext DETAILS_VIEW_BOTTOM_SHEET = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("DETAILS_VIEW_BOTTOM_SHEET", 5, "DetailsViewBottomSheet");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext DETAILS_VIEW_NOTIFICATION = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("DETAILS_VIEW_NOTIFICATION", 6, "DetailsViewNotification");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext GENERATE_DAY_TIME_SLOTS = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("GENERATE_DAY_TIME_SLOTS", 7, "GenerateDayTimeSlots");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext UNKNOWN = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext("UNKNOWN", 8, "Unknown");

    private static final /* synthetic */ com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[] $values() {
        return new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[]{FACS_V2, PACS_V2, NEO_FACS_V2, NEO_PACS_V2, DETAILS_VIEW, DETAILS_VIEW_BOTTOM_SHEET, DETAILS_VIEW_NOTIFICATION, GENERATE_DAY_TIME_SLOTS, UNKNOWN};
    }

    static {
        com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizCallMeBackContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext) java.lang.Enum.valueOf(com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext.class, str);
    }

    public static com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[] values() {
        return (com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
