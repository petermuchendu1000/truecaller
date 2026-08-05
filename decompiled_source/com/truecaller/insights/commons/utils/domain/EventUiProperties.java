package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/EventUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_ID", "SENDER_ID", "EVENT_TYPE", "EVENT_STATUS", "NAME", "TITLE", "SUBTITLE", "BOOKING_ID", "SECRET_CODE", "LOCATION", "PRIMARY_ICON", "SMALL_TICK_MARK", "BIG_TICK_MARK", "ENABLE_EXPERIMENTAL_SENDER", "ACTION_PRIMARY", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EventUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.EventUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.EventUiProperties("MESSAGE_ID", 0);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.EventUiProperties("SENDER_ID", 1);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties EVENT_TYPE = new com.truecaller.insights.commons.utils.domain.EventUiProperties("EVENT_TYPE", 2);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties EVENT_STATUS = new com.truecaller.insights.commons.utils.domain.EventUiProperties("EVENT_STATUS", 3);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties NAME = new com.truecaller.insights.commons.utils.domain.EventUiProperties("NAME", 4);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties TITLE = new com.truecaller.insights.commons.utils.domain.EventUiProperties("TITLE", 5);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties SUBTITLE = new com.truecaller.insights.commons.utils.domain.EventUiProperties("SUBTITLE", 6);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties BOOKING_ID = new com.truecaller.insights.commons.utils.domain.EventUiProperties("BOOKING_ID", 7);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties SECRET_CODE = new com.truecaller.insights.commons.utils.domain.EventUiProperties("SECRET_CODE", 8);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties LOCATION = new com.truecaller.insights.commons.utils.domain.EventUiProperties("LOCATION", 9);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties PRIMARY_ICON = new com.truecaller.insights.commons.utils.domain.EventUiProperties("PRIMARY_ICON", 10);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties SMALL_TICK_MARK = new com.truecaller.insights.commons.utils.domain.EventUiProperties("SMALL_TICK_MARK", 11);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties BIG_TICK_MARK = new com.truecaller.insights.commons.utils.domain.EventUiProperties("BIG_TICK_MARK", 12);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties ENABLE_EXPERIMENTAL_SENDER = new com.truecaller.insights.commons.utils.domain.EventUiProperties("ENABLE_EXPERIMENTAL_SENDER", 13);
    public static final com.truecaller.insights.commons.utils.domain.EventUiProperties ACTION_PRIMARY = new com.truecaller.insights.commons.utils.domain.EventUiProperties("ACTION_PRIMARY", 14);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.EventUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.EventUiProperties[]{MESSAGE_ID, SENDER_ID, EVENT_TYPE, EVENT_STATUS, NAME, TITLE, SUBTITLE, BOOKING_ID, SECRET_CODE, LOCATION, PRIMARY_ICON, SMALL_TICK_MARK, BIG_TICK_MARK, ENABLE_EXPERIMENTAL_SENDER, ACTION_PRIMARY};
    }

    static {
        com.truecaller.insights.commons.utils.domain.EventUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EventUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.EventUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.EventUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.EventUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.EventUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.EventUiProperties[]) $VALUES.clone();
    }
}
