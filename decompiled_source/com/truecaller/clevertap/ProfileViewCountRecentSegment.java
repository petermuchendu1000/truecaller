package com.truecaller.clevertap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/clevertap/ProfileViewCountRecentSegment;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "jz0/t", "NONE", "ONE", "TWO", "THREE", "FOUR_TO_SEVEN", "EIGHT_TO_FIFTEEN", "SIXTEEN_TO_THIRTY", "THIRTY_ONE_MORE", "clevertap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ProfileViewCountRecentSegment {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.clevertap.ProfileViewCountRecentSegment[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final jz0.t Companion;
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment NONE = new com.truecaller.clevertap.ProfileViewCountRecentSegment("NONE", 0);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment ONE = new com.truecaller.clevertap.ProfileViewCountRecentSegment("ONE", 1);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment TWO = new com.truecaller.clevertap.ProfileViewCountRecentSegment("TWO", 2);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment THREE = new com.truecaller.clevertap.ProfileViewCountRecentSegment("THREE", 3);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment FOUR_TO_SEVEN = new com.truecaller.clevertap.ProfileViewCountRecentSegment("FOUR_TO_SEVEN", 4);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment EIGHT_TO_FIFTEEN = new com.truecaller.clevertap.ProfileViewCountRecentSegment("EIGHT_TO_FIFTEEN", 5);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment SIXTEEN_TO_THIRTY = new com.truecaller.clevertap.ProfileViewCountRecentSegment("SIXTEEN_TO_THIRTY", 6);
    public static final com.truecaller.clevertap.ProfileViewCountRecentSegment THIRTY_ONE_MORE = new com.truecaller.clevertap.ProfileViewCountRecentSegment("THIRTY_ONE_MORE", 7);

    private static final /* synthetic */ com.truecaller.clevertap.ProfileViewCountRecentSegment[] $values() {
        return new com.truecaller.clevertap.ProfileViewCountRecentSegment[]{NONE, ONE, TWO, THREE, FOUR_TO_SEVEN, EIGHT_TO_FIFTEEN, SIXTEEN_TO_THIRTY, THIRTY_ONE_MORE};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, jz0.t] */
    static {
        com.truecaller.clevertap.ProfileViewCountRecentSegment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ProfileViewCountRecentSegment(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.clevertap.ProfileViewCountRecentSegment valueOf(java.lang.String str) {
        return (com.truecaller.clevertap.ProfileViewCountRecentSegment) java.lang.Enum.valueOf(com.truecaller.clevertap.ProfileViewCountRecentSegment.class, str);
    }

    public static com.truecaller.clevertap.ProfileViewCountRecentSegment[] values() {
        return (com.truecaller.clevertap.ProfileViewCountRecentSegment[]) $VALUES.clone();
    }
}
