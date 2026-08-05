package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/BillUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "UI_DUE_DATE", "DUE_AMT", "DATE", "DUEINS_NUM", "UI_DUEINS_TYPE", "UI_DUE_TYPE", "UI_TRX_DETAIL", "SENDER_ID", "MESSAGE_ID", "TRX_CURRENCY", "UI_DUE_AMT", "UI_TAGS", "ENABLE_EXPERIMENTAL_SENDER", "UI_TRX_TYPE", "BILL_DATE_TIME", "PAST_UI_DUE_DATE", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BillUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.BillUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_DUE_DATE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_DUE_DATE", 0);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties DUE_AMT = new com.truecaller.insights.commons.utils.domain.BillUiProperties("DUE_AMT", 1);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties DATE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("DATE", 2);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties DUEINS_NUM = new com.truecaller.insights.commons.utils.domain.BillUiProperties("DUEINS_NUM", 3);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_DUEINS_TYPE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_DUEINS_TYPE", 4);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_DUE_TYPE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_DUE_TYPE", 5);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_TRX_DETAIL = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_TRX_DETAIL", 6);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.BillUiProperties("SENDER_ID", 7);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.BillUiProperties("MESSAGE_ID", 8);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties TRX_CURRENCY = new com.truecaller.insights.commons.utils.domain.BillUiProperties("TRX_CURRENCY", 9);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_DUE_AMT = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_DUE_AMT", 10);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_TAGS = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_TAGS", 11);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties ENABLE_EXPERIMENTAL_SENDER = new com.truecaller.insights.commons.utils.domain.BillUiProperties("ENABLE_EXPERIMENTAL_SENDER", 12);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties UI_TRX_TYPE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("UI_TRX_TYPE", 13);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties BILL_DATE_TIME = new com.truecaller.insights.commons.utils.domain.BillUiProperties("BILL_DATE_TIME", 14);
    public static final com.truecaller.insights.commons.utils.domain.BillUiProperties PAST_UI_DUE_DATE = new com.truecaller.insights.commons.utils.domain.BillUiProperties("PAST_UI_DUE_DATE", 15);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.BillUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.BillUiProperties[]{UI_DUE_DATE, DUE_AMT, DATE, DUEINS_NUM, UI_DUEINS_TYPE, UI_DUE_TYPE, UI_TRX_DETAIL, SENDER_ID, MESSAGE_ID, TRX_CURRENCY, UI_DUE_AMT, UI_TAGS, ENABLE_EXPERIMENTAL_SENDER, UI_TRX_TYPE, BILL_DATE_TIME, PAST_UI_DUE_DATE};
    }

    static {
        com.truecaller.insights.commons.utils.domain.BillUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BillUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.BillUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.BillUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.BillUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.BillUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.BillUiProperties[]) $VALUES.clone();
    }
}
