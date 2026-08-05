package com.truecaller.google_onetap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/google_onetap/OneTapAnalyticsManager$OneTapRequestType", "", "Lcom/truecaller/google_onetap/OneTapAnalyticsManager$OneTapRequestType;", "", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAnalyticsName", "()Ljava/lang/String;", "SIGN_IN", "SIGN_UP", "google-onetap_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OneTapAnalyticsManager$OneTapRequestType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[] $VALUES;
    public static final com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType SIGN_IN = new com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType("SIGN_IN", 0, "SignIn");
    public static final com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType SIGN_UP = new com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType("SIGN_UP", 1, "SignUp");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsName;

    private static final /* synthetic */ com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[] $values() {
        return new com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[]{SIGN_IN, SIGN_UP};
    }

    static {
        com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OneTapAnalyticsManager$OneTapRequestType(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType valueOf(java.lang.String str) {
        return (com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType) java.lang.Enum.valueOf(com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType.class, str);
    }

    public static com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[] values() {
        return (com.truecaller.google_onetap.OneTapAnalyticsManager$OneTapRequestType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsName() {
        return this.analyticsName;
    }
}
