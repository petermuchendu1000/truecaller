package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/BankUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "UI_TRX_DETAIL", "ICON_TRX_TYPE", "ACC_NUM", "UI_DATE", "TRX_CURRENCY", "TRX_AMT", "UI_ACC_TYPE", "UI_ACC_DETAIL", "SENDER_ID", "MESSAGE_ID", "UI_TIME", "UI_DAY", "ENABLE_EXPERIMENTAL_SENDER", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class BankUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.BankUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_TRX_DETAIL = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_TRX_DETAIL", 0);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties ICON_TRX_TYPE = new com.truecaller.insights.commons.utils.domain.BankUiProperties("ICON_TRX_TYPE", 1);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties ACC_NUM = new com.truecaller.insights.commons.utils.domain.BankUiProperties("ACC_NUM", 2);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_DATE = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_DATE", 3);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties TRX_CURRENCY = new com.truecaller.insights.commons.utils.domain.BankUiProperties("TRX_CURRENCY", 4);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties TRX_AMT = new com.truecaller.insights.commons.utils.domain.BankUiProperties("TRX_AMT", 5);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_ACC_TYPE = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_ACC_TYPE", 6);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_ACC_DETAIL = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_ACC_DETAIL", 7);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.BankUiProperties("SENDER_ID", 8);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.BankUiProperties("MESSAGE_ID", 9);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_TIME = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_TIME", 10);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties UI_DAY = new com.truecaller.insights.commons.utils.domain.BankUiProperties("UI_DAY", 11);
    public static final com.truecaller.insights.commons.utils.domain.BankUiProperties ENABLE_EXPERIMENTAL_SENDER = new com.truecaller.insights.commons.utils.domain.BankUiProperties("ENABLE_EXPERIMENTAL_SENDER", 12);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.BankUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.BankUiProperties[]{UI_TRX_DETAIL, ICON_TRX_TYPE, ACC_NUM, UI_DATE, TRX_CURRENCY, TRX_AMT, UI_ACC_TYPE, UI_ACC_DETAIL, SENDER_ID, MESSAGE_ID, UI_TIME, UI_DAY, ENABLE_EXPERIMENTAL_SENDER};
    }

    static {
        com.truecaller.insights.commons.utils.domain.BankUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BankUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.BankUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.BankUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.BankUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.BankUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.BankUiProperties[]) $VALUES.clone();
    }
}
