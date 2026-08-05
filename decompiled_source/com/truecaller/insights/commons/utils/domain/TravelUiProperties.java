package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/TravelUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "LOCATION", "PNR", "TRAVEL_TYPE", "DATETIME", "UI_DATE", "SEAT", "MORE_INFO", "CATEGORY", "MESSAGE_ID", "SENDER_ID", "CONTENT_TITLE", "ICON", "ALERT_TYPE", "ENABLE_EXPERIMENTAL_SENDER", "UI_TAGS", "TRAVEL_DATE_TIME", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TravelUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.TravelUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties LOCATION = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("LOCATION", 0);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties PNR = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("PNR", 1);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties TRAVEL_TYPE = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("TRAVEL_TYPE", 2);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties DATETIME = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("DATETIME", 3);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties UI_DATE = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("UI_DATE", 4);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties SEAT = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("SEAT", 5);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties MORE_INFO = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("MORE_INFO", 6);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties CATEGORY = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("CATEGORY", 7);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("MESSAGE_ID", 8);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("SENDER_ID", 9);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties CONTENT_TITLE = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("CONTENT_TITLE", 10);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties ICON = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("ICON", 11);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties ALERT_TYPE = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("ALERT_TYPE", 12);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties ENABLE_EXPERIMENTAL_SENDER = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("ENABLE_EXPERIMENTAL_SENDER", 13);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties UI_TAGS = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("UI_TAGS", 14);
    public static final com.truecaller.insights.commons.utils.domain.TravelUiProperties TRAVEL_DATE_TIME = new com.truecaller.insights.commons.utils.domain.TravelUiProperties("TRAVEL_DATE_TIME", 15);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.TravelUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.TravelUiProperties[]{LOCATION, PNR, TRAVEL_TYPE, DATETIME, UI_DATE, SEAT, MORE_INFO, CATEGORY, MESSAGE_ID, SENDER_ID, CONTENT_TITLE, ICON, ALERT_TYPE, ENABLE_EXPERIMENTAL_SENDER, UI_TAGS, TRAVEL_DATE_TIME};
    }

    static {
        com.truecaller.insights.commons.utils.domain.TravelUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TravelUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.TravelUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.TravelUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.TravelUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.TravelUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.TravelUiProperties[]) $VALUES.clone();
    }
}
