package com.truecaller.insights.models.updates;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b2\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00064"}, d2 = {"Lcom/truecaller/insights/models/updates/UpdateCategory;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "nw1/baz", "TransactionUpdate", "OTP", "ChequeStatus", "Finance", "LoanUpdate", "Transfer", "Travel", "Event", "PaymentReminder", "MobileRecharge", "Appointment", "Delivery", "Rx", "School", "TaxReturns", "Vaccine", "Weather", "PaymentSuccessful", "MobileBalance", "Investments", "MobileData", "SecurityAlert", "CallNotification", "VoiceMail", "LowBalance", "MissedCall", "Betting", "MissedCalls", "Offers", "TransactionDeclined", "TransactionSuccessful", "TransactionPending", "TransactionProcessing", "PaymentReceived", "LoanApproved", "LoanDue", "LoanOverdue", "LoanClosed", "BeneficiaryCredited", "AccountUpdate", "Alert", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UpdateCategory {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.updates.UpdateCategory[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final nw1.baz Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.models.updates.UpdateCategory> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.models.updates.UpdateCategory TransactionUpdate = new com.truecaller.insights.models.updates.UpdateCategory("TransactionUpdate", 0, "Transaction");
    public static final com.truecaller.insights.models.updates.UpdateCategory OTP = new com.truecaller.insights.models.updates.UpdateCategory("OTP", 1, "OTP");
    public static final com.truecaller.insights.models.updates.UpdateCategory ChequeStatus = new com.truecaller.insights.models.updates.UpdateCategory("ChequeStatus", 2, "Cheque status");
    public static final com.truecaller.insights.models.updates.UpdateCategory Finance = new com.truecaller.insights.models.updates.UpdateCategory("Finance", 3, "Finance");
    public static final com.truecaller.insights.models.updates.UpdateCategory LoanUpdate = new com.truecaller.insights.models.updates.UpdateCategory("LoanUpdate", 4, "Loan update");
    public static final com.truecaller.insights.models.updates.UpdateCategory Transfer = new com.truecaller.insights.models.updates.UpdateCategory("Transfer", 5, "Transfer");
    public static final com.truecaller.insights.models.updates.UpdateCategory Travel = new com.truecaller.insights.models.updates.UpdateCategory("Travel", 6, "Travel");
    public static final com.truecaller.insights.models.updates.UpdateCategory Event = new com.truecaller.insights.models.updates.UpdateCategory("Event", 7, "Event");
    public static final com.truecaller.insights.models.updates.UpdateCategory PaymentReminder = new com.truecaller.insights.models.updates.UpdateCategory("PaymentReminder", 8, "Payment reminder");
    public static final com.truecaller.insights.models.updates.UpdateCategory MobileRecharge = new com.truecaller.insights.models.updates.UpdateCategory("MobileRecharge", 9, "Mobile recharge");
    public static final com.truecaller.insights.models.updates.UpdateCategory Appointment = new com.truecaller.insights.models.updates.UpdateCategory("Appointment", 10, "Appointment");
    public static final com.truecaller.insights.models.updates.UpdateCategory Delivery = new com.truecaller.insights.models.updates.UpdateCategory("Delivery", 11, "Delivery");
    public static final com.truecaller.insights.models.updates.UpdateCategory Rx = new com.truecaller.insights.models.updates.UpdateCategory("Rx", 12, "Rx");
    public static final com.truecaller.insights.models.updates.UpdateCategory School = new com.truecaller.insights.models.updates.UpdateCategory("School", 13, "School");
    public static final com.truecaller.insights.models.updates.UpdateCategory TaxReturns = new com.truecaller.insights.models.updates.UpdateCategory("TaxReturns", 14, "Tax returns");
    public static final com.truecaller.insights.models.updates.UpdateCategory Vaccine = new com.truecaller.insights.models.updates.UpdateCategory("Vaccine", 15, "Vaccine");
    public static final com.truecaller.insights.models.updates.UpdateCategory Weather = new com.truecaller.insights.models.updates.UpdateCategory("Weather", 16, "Weather");
    public static final com.truecaller.insights.models.updates.UpdateCategory PaymentSuccessful = new com.truecaller.insights.models.updates.UpdateCategory("PaymentSuccessful", 17, "Payment successful");
    public static final com.truecaller.insights.models.updates.UpdateCategory MobileBalance = new com.truecaller.insights.models.updates.UpdateCategory("MobileBalance", 18, "Mobile balance");
    public static final com.truecaller.insights.models.updates.UpdateCategory Investments = new com.truecaller.insights.models.updates.UpdateCategory("Investments", 19, "Investments");
    public static final com.truecaller.insights.models.updates.UpdateCategory MobileData = new com.truecaller.insights.models.updates.UpdateCategory("MobileData", 20, "Mobile data");
    public static final com.truecaller.insights.models.updates.UpdateCategory SecurityAlert = new com.truecaller.insights.models.updates.UpdateCategory("SecurityAlert", 21, "Security alert");
    public static final com.truecaller.insights.models.updates.UpdateCategory CallNotification = new com.truecaller.insights.models.updates.UpdateCategory("CallNotification", 22, "Call notification");
    public static final com.truecaller.insights.models.updates.UpdateCategory VoiceMail = new com.truecaller.insights.models.updates.UpdateCategory("VoiceMail", 23, "Voice mail");
    public static final com.truecaller.insights.models.updates.UpdateCategory LowBalance = new com.truecaller.insights.models.updates.UpdateCategory("LowBalance", 24, "Low balance");
    public static final com.truecaller.insights.models.updates.UpdateCategory MissedCall = new com.truecaller.insights.models.updates.UpdateCategory("MissedCall", 25, "Missed call");
    public static final com.truecaller.insights.models.updates.UpdateCategory Betting = new com.truecaller.insights.models.updates.UpdateCategory("Betting", 26, "Betting");
    public static final com.truecaller.insights.models.updates.UpdateCategory MissedCalls = new com.truecaller.insights.models.updates.UpdateCategory("MissedCalls", 27, "Missed calls");
    public static final com.truecaller.insights.models.updates.UpdateCategory Offers = new com.truecaller.insights.models.updates.UpdateCategory("Offers", 28, "Offers");
    public static final com.truecaller.insights.models.updates.UpdateCategory TransactionDeclined = new com.truecaller.insights.models.updates.UpdateCategory("TransactionDeclined", 29, "Transaction declined");
    public static final com.truecaller.insights.models.updates.UpdateCategory TransactionSuccessful = new com.truecaller.insights.models.updates.UpdateCategory("TransactionSuccessful", 30, "Transaction successful");
    public static final com.truecaller.insights.models.updates.UpdateCategory TransactionPending = new com.truecaller.insights.models.updates.UpdateCategory("TransactionPending", 31, "Transaction pending");
    public static final com.truecaller.insights.models.updates.UpdateCategory TransactionProcessing = new com.truecaller.insights.models.updates.UpdateCategory("TransactionProcessing", 32, "Transaction processing");
    public static final com.truecaller.insights.models.updates.UpdateCategory PaymentReceived = new com.truecaller.insights.models.updates.UpdateCategory("PaymentReceived", 33, "Payment received");
    public static final com.truecaller.insights.models.updates.UpdateCategory LoanApproved = new com.truecaller.insights.models.updates.UpdateCategory("LoanApproved", 34, "Loan approved");
    public static final com.truecaller.insights.models.updates.UpdateCategory LoanDue = new com.truecaller.insights.models.updates.UpdateCategory("LoanDue", 35, "Loan due");
    public static final com.truecaller.insights.models.updates.UpdateCategory LoanOverdue = new com.truecaller.insights.models.updates.UpdateCategory("LoanOverdue", 36, "Loan overdue");
    public static final com.truecaller.insights.models.updates.UpdateCategory LoanClosed = new com.truecaller.insights.models.updates.UpdateCategory("LoanClosed", 37, "Loan closed");
    public static final com.truecaller.insights.models.updates.UpdateCategory BeneficiaryCredited = new com.truecaller.insights.models.updates.UpdateCategory("BeneficiaryCredited", 38, "Beneficiary credited");
    public static final com.truecaller.insights.models.updates.UpdateCategory AccountUpdate = new com.truecaller.insights.models.updates.UpdateCategory("AccountUpdate", 39, "Account update");
    public static final com.truecaller.insights.models.updates.UpdateCategory Alert = new com.truecaller.insights.models.updates.UpdateCategory("Alert", 40, "Alert");

    private static final /* synthetic */ com.truecaller.insights.models.updates.UpdateCategory[] $values() {
        return new com.truecaller.insights.models.updates.UpdateCategory[]{TransactionUpdate, OTP, ChequeStatus, Finance, LoanUpdate, Transfer, Travel, Event, PaymentReminder, MobileRecharge, Appointment, Delivery, Rx, School, TaxReturns, Vaccine, Weather, PaymentSuccessful, MobileBalance, Investments, MobileData, SecurityAlert, CallNotification, VoiceMail, LowBalance, MissedCall, Betting, MissedCalls, Offers, TransactionDeclined, TransactionSuccessful, TransactionPending, TransactionProcessing, PaymentReceived, LoanApproved, LoanDue, LoanOverdue, LoanClosed, BeneficiaryCredited, AccountUpdate, Alert};
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [nw1.baz, java.lang.Object] */
    static {
        com.truecaller.insights.models.updates.UpdateCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.models.updates.UpdateCategory[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b >= 16 ? b : 16);
        for (com.truecaller.insights.models.updates.UpdateCategory updateCategory : values) {
            java.lang.String str = updateCategory.key;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashMap.put(ax1.bar.r(locale, "ENGLISH", str, locale, "toLowerCase(...)"), updateCategory);
        }
        map = linkedHashMap;
    }

    private UpdateCategory(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.updates.UpdateCategory valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.updates.UpdateCategory) java.lang.Enum.valueOf(com.truecaller.insights.models.updates.UpdateCategory.class, str);
    }

    public static com.truecaller.insights.models.updates.UpdateCategory[] values() {
        return (com.truecaller.insights.models.updates.UpdateCategory[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
