package com.truecaller.insights.models.smartcards;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'¨\u0006("}, d2 = {"Lcom/truecaller/insights/models/smartcards/SmartCardCategory;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "isTravel", "()Z", "isDelivery", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "lw1/g", "Transaction", "Loan", "Travel", "Flight", "Bus", "Train", "Event", "Bill", "Recharge", "Appointment", "Delivery", "Prescription", "School", "Tax", "Vaccine", "WeatherAlert", "Balance", "Investments", "DataUsage", "SecurityAlert", "MissedCall", "VoiceMail", "Betting", "Promotion", "OTP", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SmartCardCategory {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.smartcards.SmartCardCategory[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final lw1.g Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.models.smartcards.SmartCardCategory> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Transaction = new com.truecaller.insights.models.smartcards.SmartCardCategory("Transaction", 0, "Transaction");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Loan = new com.truecaller.insights.models.smartcards.SmartCardCategory("Loan", 1, "Loan");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Travel = new com.truecaller.insights.models.smartcards.SmartCardCategory("Travel", 2, "Travel");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Flight = new com.truecaller.insights.models.smartcards.SmartCardCategory("Flight", 3, "Flight");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Bus = new com.truecaller.insights.models.smartcards.SmartCardCategory("Bus", 4, "Bus");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Train = new com.truecaller.insights.models.smartcards.SmartCardCategory("Train", 5, "Train");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Event = new com.truecaller.insights.models.smartcards.SmartCardCategory("Event", 6, "Event");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Bill = new com.truecaller.insights.models.smartcards.SmartCardCategory("Bill", 7, "Bill");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Recharge = new com.truecaller.insights.models.smartcards.SmartCardCategory("Recharge", 8, "Recharge");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Appointment = new com.truecaller.insights.models.smartcards.SmartCardCategory("Appointment", 9, "Appointment");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Delivery = new com.truecaller.insights.models.smartcards.SmartCardCategory("Delivery", 10, "Delivery");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Prescription = new com.truecaller.insights.models.smartcards.SmartCardCategory("Prescription", 11, "Prescription");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory School = new com.truecaller.insights.models.smartcards.SmartCardCategory("School", 12, "School");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Tax = new com.truecaller.insights.models.smartcards.SmartCardCategory("Tax", 13, "Tax");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Vaccine = new com.truecaller.insights.models.smartcards.SmartCardCategory("Vaccine", 14, "Vaccine");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory WeatherAlert = new com.truecaller.insights.models.smartcards.SmartCardCategory("WeatherAlert", 15, "Weather alert");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Balance = new com.truecaller.insights.models.smartcards.SmartCardCategory("Balance", 16, "Balance");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Investments = new com.truecaller.insights.models.smartcards.SmartCardCategory("Investments", 17, "Investments");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory DataUsage = new com.truecaller.insights.models.smartcards.SmartCardCategory("DataUsage", 18, "Data usage");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory SecurityAlert = new com.truecaller.insights.models.smartcards.SmartCardCategory("SecurityAlert", 19, "Security alert");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory MissedCall = new com.truecaller.insights.models.smartcards.SmartCardCategory("MissedCall", 20, "Missed call");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory VoiceMail = new com.truecaller.insights.models.smartcards.SmartCardCategory("VoiceMail", 21, "Voice mail");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Betting = new com.truecaller.insights.models.smartcards.SmartCardCategory("Betting", 22, "Betting");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory Promotion = new com.truecaller.insights.models.smartcards.SmartCardCategory("Promotion", 23, "Promotion");
    public static final com.truecaller.insights.models.smartcards.SmartCardCategory OTP = new com.truecaller.insights.models.smartcards.SmartCardCategory("OTP", 24, "OTP");

    private static final /* synthetic */ com.truecaller.insights.models.smartcards.SmartCardCategory[] $values() {
        return new com.truecaller.insights.models.smartcards.SmartCardCategory[]{Transaction, Loan, Travel, Flight, Bus, Train, Event, Bill, Recharge, Appointment, Delivery, Prescription, School, Tax, Vaccine, WeatherAlert, Balance, Investments, DataUsage, SecurityAlert, MissedCall, VoiceMail, Betting, Promotion, OTP};
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [lw1.g, java.lang.Object] */
    static {
        com.truecaller.insights.models.smartcards.SmartCardCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.models.smartcards.SmartCardCategory[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b >= 16 ? b : 16);
        for (com.truecaller.insights.models.smartcards.SmartCardCategory smartCardCategory : values) {
            java.lang.String str = smartCardCategory.key;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashMap.put(ax1.bar.r(locale, "ENGLISH", str, locale, "toLowerCase(...)"), smartCardCategory);
        }
        map = linkedHashMap;
    }

    private SmartCardCategory(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.smartcards.SmartCardCategory valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.smartcards.SmartCardCategory) java.lang.Enum.valueOf(com.truecaller.insights.models.smartcards.SmartCardCategory.class, str);
    }

    public static com.truecaller.insights.models.smartcards.SmartCardCategory[] values() {
        return (com.truecaller.insights.models.smartcards.SmartCardCategory[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public final boolean isDelivery() {
        if (this == Delivery) {
            return true;
        }
        return false;
    }

    public final boolean isTravel() {
        return kotlin.collections.y.j(new com.truecaller.insights.models.smartcards.SmartCardCategory[]{Travel, Train, Bus, Flight}).contains(this);
    }
}
