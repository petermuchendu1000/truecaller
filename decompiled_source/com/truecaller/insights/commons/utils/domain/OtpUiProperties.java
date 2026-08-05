package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/OtpUiProperties;", "", "", "<init>", "(Ljava/lang/String;I)V", "OTP_NUM", "MESSAGE_ID", "OTP_TYPE", "SENDER_ID", "OTP_DATE_TIME", "TRANSACTION_OTP_AMOUNT", "TRANSACTION_OTP_CURRENCY", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OtpUiProperties {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.OtpUiProperties[] $VALUES;
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties OTP_NUM = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("OTP_NUM", 0);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties MESSAGE_ID = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("MESSAGE_ID", 1);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties OTP_TYPE = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("OTP_TYPE", 2);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties SENDER_ID = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("SENDER_ID", 3);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties OTP_DATE_TIME = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("OTP_DATE_TIME", 4);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties TRANSACTION_OTP_AMOUNT = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("TRANSACTION_OTP_AMOUNT", 5);
    public static final com.truecaller.insights.commons.utils.domain.OtpUiProperties TRANSACTION_OTP_CURRENCY = new com.truecaller.insights.commons.utils.domain.OtpUiProperties("TRANSACTION_OTP_CURRENCY", 6);

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.OtpUiProperties[] $values() {
        return new com.truecaller.insights.commons.utils.domain.OtpUiProperties[]{OTP_NUM, MESSAGE_ID, OTP_TYPE, SENDER_ID, OTP_DATE_TIME, TRANSACTION_OTP_AMOUNT, TRANSACTION_OTP_CURRENCY};
    }

    static {
        com.truecaller.insights.commons.utils.domain.OtpUiProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OtpUiProperties(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.OtpUiProperties valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.OtpUiProperties) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.OtpUiProperties.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.OtpUiProperties[] values() {
        return (com.truecaller.insights.commons.utils.domain.OtpUiProperties[]) $VALUES.clone();
    }
}
