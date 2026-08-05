package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/DeliveryUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "MESSAGE_ID", "SENDER_ID", "ICON", "ORDER_STATUS", "ITEM_NAME", "ENABLE_EXPERIMENTAL_SENDER", "UI_DATE", "ACTION_PRIMARY", "UI_TITLE", "UI_SUBTITLE", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeliveryUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("MESSAGE_ID", 0);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("SENDER_ID", 1);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties ICON = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("ICON", 2);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties ORDER_STATUS = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("ORDER_STATUS", 3);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties ITEM_NAME = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("ITEM_NAME", 4);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties ENABLE_EXPERIMENTAL_SENDER = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("ENABLE_EXPERIMENTAL_SENDER", 5);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties UI_DATE = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("UI_DATE", 6);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties ACTION_PRIMARY = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("ACTION_PRIMARY", 7);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties UI_TITLE = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("UI_TITLE", 8);
    public static final com.truecaller.insights.commons.utils.domain.DeliveryUiProperties UI_SUBTITLE = new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties("UI_SUBTITLE", 9);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[]{MESSAGE_ID, SENDER_ID, ICON, ORDER_STATUS, ITEM_NAME, ENABLE_EXPERIMENTAL_SENDER, UI_DATE, ACTION_PRIMARY, UI_TITLE, UI_SUBTITLE};
    }

    static {
        com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DeliveryUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.DeliveryUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.DeliveryUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.DeliveryUiProperties[]) $VALUES.clone();
    }
}
