package com.truecaller.clevertap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/clevertap/ProfileSearchCountSegment;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "jz0/s", "NONE", "ONE_TO_FIVE", "SIX_TO_TEN", "ELEVEN_TO_TWENTY", "TWENTY_ONE_TO_THIRTY", "THIRTY_ONE_MORE", "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ProfileSearchCountSegment {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.clevertap.ProfileSearchCountSegment[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final jz0.s Companion;
    public static final com.truecaller.clevertap.ProfileSearchCountSegment NONE = new com.truecaller.clevertap.ProfileSearchCountSegment("NONE", 0);
    public static final com.truecaller.clevertap.ProfileSearchCountSegment ONE_TO_FIVE = new com.truecaller.clevertap.ProfileSearchCountSegment("ONE_TO_FIVE", 1);
    public static final com.truecaller.clevertap.ProfileSearchCountSegment SIX_TO_TEN = new com.truecaller.clevertap.ProfileSearchCountSegment("SIX_TO_TEN", 2);
    public static final com.truecaller.clevertap.ProfileSearchCountSegment ELEVEN_TO_TWENTY = new com.truecaller.clevertap.ProfileSearchCountSegment("ELEVEN_TO_TWENTY", 3);
    public static final com.truecaller.clevertap.ProfileSearchCountSegment TWENTY_ONE_TO_THIRTY = new com.truecaller.clevertap.ProfileSearchCountSegment("TWENTY_ONE_TO_THIRTY", 4);
    public static final com.truecaller.clevertap.ProfileSearchCountSegment THIRTY_ONE_MORE = new com.truecaller.clevertap.ProfileSearchCountSegment("THIRTY_ONE_MORE", 5);

    private static final /* synthetic */ com.truecaller.clevertap.ProfileSearchCountSegment[] $values() {
        return new com.truecaller.clevertap.ProfileSearchCountSegment[]{NONE, ONE_TO_FIVE, SIX_TO_TEN, ELEVEN_TO_TWENTY, TWENTY_ONE_TO_THIRTY, THIRTY_ONE_MORE};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [jz0.s, java.lang.Object] */
    static {
        com.truecaller.clevertap.ProfileSearchCountSegment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ProfileSearchCountSegment(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.clevertap.ProfileSearchCountSegment valueOf(java.lang.String str) {
        return (com.truecaller.clevertap.ProfileSearchCountSegment) java.lang.Enum.valueOf(com.truecaller.clevertap.ProfileSearchCountSegment.class, str);
    }

    public static com.truecaller.clevertap.ProfileSearchCountSegment[] values() {
        return (com.truecaller.clevertap.ProfileSearchCountSegment[]) $VALUES.clone();
    }
}
