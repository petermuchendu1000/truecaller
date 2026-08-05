package com.truecaller.messaging.clevertap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/messaging/clevertap/NUMBERS;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "ZERO", "ONE", "TWO", "TWO_FOUR", "TWO_FIVE", "THREE_FIVE", "FIVE_SEVEN", "EIGHT_FOURTEEN", "ELEVEN_TWENTY", "SIX_TEN", "TEN_PLUS", "FIFTEEN_THIRTY", "TWENTY_ONE_THIRTY", "THIRTY_PLUS", "THIRTY_ONE_FIFTY", "FIFTY_PLUS", "messaging-storage_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NUMBERS {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.clevertap.NUMBERS[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.messaging.clevertap.NUMBERS NONE = new com.truecaller.messaging.clevertap.NUMBERS("NONE", 0, "None");
    public static final com.truecaller.messaging.clevertap.NUMBERS ZERO = new com.truecaller.messaging.clevertap.NUMBERS("ZERO", 1, "Zero");
    public static final com.truecaller.messaging.clevertap.NUMBERS ONE = new com.truecaller.messaging.clevertap.NUMBERS("ONE", 2, "One");
    public static final com.truecaller.messaging.clevertap.NUMBERS TWO = new com.truecaller.messaging.clevertap.NUMBERS("TWO", 3, "Two");
    public static final com.truecaller.messaging.clevertap.NUMBERS TWO_FOUR = new com.truecaller.messaging.clevertap.NUMBERS("TWO_FOUR", 4, "Two_Four");
    public static final com.truecaller.messaging.clevertap.NUMBERS TWO_FIVE = new com.truecaller.messaging.clevertap.NUMBERS("TWO_FIVE", 5, "Two_Five");
    public static final com.truecaller.messaging.clevertap.NUMBERS THREE_FIVE = new com.truecaller.messaging.clevertap.NUMBERS("THREE_FIVE", 6, "Three_Five");
    public static final com.truecaller.messaging.clevertap.NUMBERS FIVE_SEVEN = new com.truecaller.messaging.clevertap.NUMBERS("FIVE_SEVEN", 7, "Five_Seven");
    public static final com.truecaller.messaging.clevertap.NUMBERS EIGHT_FOURTEEN = new com.truecaller.messaging.clevertap.NUMBERS("EIGHT_FOURTEEN", 8, "Eight_Fourteen");
    public static final com.truecaller.messaging.clevertap.NUMBERS ELEVEN_TWENTY = new com.truecaller.messaging.clevertap.NUMBERS("ELEVEN_TWENTY", 9, "Eleven_Twenty");
    public static final com.truecaller.messaging.clevertap.NUMBERS SIX_TEN = new com.truecaller.messaging.clevertap.NUMBERS("SIX_TEN", 10, "Six_Ten");
    public static final com.truecaller.messaging.clevertap.NUMBERS TEN_PLUS = new com.truecaller.messaging.clevertap.NUMBERS("TEN_PLUS", 11, "Tenplus");
    public static final com.truecaller.messaging.clevertap.NUMBERS FIFTEEN_THIRTY = new com.truecaller.messaging.clevertap.NUMBERS("FIFTEEN_THIRTY", 12, "Fifteen_Thirty");
    public static final com.truecaller.messaging.clevertap.NUMBERS TWENTY_ONE_THIRTY = new com.truecaller.messaging.clevertap.NUMBERS("TWENTY_ONE_THIRTY", 13, "TwentyOne_Thirty");
    public static final com.truecaller.messaging.clevertap.NUMBERS THIRTY_PLUS = new com.truecaller.messaging.clevertap.NUMBERS("THIRTY_PLUS", 14, "Thirtyplus");
    public static final com.truecaller.messaging.clevertap.NUMBERS THIRTY_ONE_FIFTY = new com.truecaller.messaging.clevertap.NUMBERS("THIRTY_ONE_FIFTY", 15, "ThirtyOne_Fifty");
    public static final com.truecaller.messaging.clevertap.NUMBERS FIFTY_PLUS = new com.truecaller.messaging.clevertap.NUMBERS("FIFTY_PLUS", 16, "Fiftyplus");

    private static final /* synthetic */ com.truecaller.messaging.clevertap.NUMBERS[] $values() {
        return new com.truecaller.messaging.clevertap.NUMBERS[]{NONE, ZERO, ONE, TWO, TWO_FOUR, TWO_FIVE, THREE_FIVE, FIVE_SEVEN, EIGHT_FOURTEEN, ELEVEN_TWENTY, SIX_TEN, TEN_PLUS, FIFTEEN_THIRTY, TWENTY_ONE_THIRTY, THIRTY_PLUS, THIRTY_ONE_FIFTY, FIFTY_PLUS};
    }

    static {
        com.truecaller.messaging.clevertap.NUMBERS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NUMBERS(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.clevertap.NUMBERS valueOf(java.lang.String str) {
        return (com.truecaller.messaging.clevertap.NUMBERS) java.lang.Enum.valueOf(com.truecaller.messaging.clevertap.NUMBERS.class, str);
    }

    public static com.truecaller.messaging.clevertap.NUMBERS[] values() {
        return (com.truecaller.messaging.clevertap.NUMBERS[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
