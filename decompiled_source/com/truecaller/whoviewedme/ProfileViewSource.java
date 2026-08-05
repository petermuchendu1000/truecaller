package com.truecaller.whoviewedme;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/whoviewedme/ProfileViewSource;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "AFTER_CALL", "AFTER_CALL_PB", "CONTACT_DETAIL", "CONTACT_DETAIL_PB", "CONTACT_REQUEST_WVM", "CONTACT_REQUEST_WVM_PB", "whoviewedme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ProfileViewSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whoviewedme.ProfileViewSource[] $VALUES;
    public static final com.truecaller.whoviewedme.ProfileViewSource UNKNOWN = new com.truecaller.whoviewedme.ProfileViewSource("UNKNOWN", 0);
    public static final com.truecaller.whoviewedme.ProfileViewSource AFTER_CALL = new com.truecaller.whoviewedme.ProfileViewSource("AFTER_CALL", 1);
    public static final com.truecaller.whoviewedme.ProfileViewSource AFTER_CALL_PB = new com.truecaller.whoviewedme.ProfileViewSource("AFTER_CALL_PB", 2);
    public static final com.truecaller.whoviewedme.ProfileViewSource CONTACT_DETAIL = new com.truecaller.whoviewedme.ProfileViewSource("CONTACT_DETAIL", 3);
    public static final com.truecaller.whoviewedme.ProfileViewSource CONTACT_DETAIL_PB = new com.truecaller.whoviewedme.ProfileViewSource("CONTACT_DETAIL_PB", 4);
    public static final com.truecaller.whoviewedme.ProfileViewSource CONTACT_REQUEST_WVM = new com.truecaller.whoviewedme.ProfileViewSource("CONTACT_REQUEST_WVM", 5);
    public static final com.truecaller.whoviewedme.ProfileViewSource CONTACT_REQUEST_WVM_PB = new com.truecaller.whoviewedme.ProfileViewSource("CONTACT_REQUEST_WVM_PB", 6);

    private static final /* synthetic */ com.truecaller.whoviewedme.ProfileViewSource[] $values() {
        return new com.truecaller.whoviewedme.ProfileViewSource[]{UNKNOWN, AFTER_CALL, AFTER_CALL_PB, CONTACT_DETAIL, CONTACT_DETAIL_PB, CONTACT_REQUEST_WVM, CONTACT_REQUEST_WVM_PB};
    }

    static {
        com.truecaller.whoviewedme.ProfileViewSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ProfileViewSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whoviewedme.ProfileViewSource valueOf(java.lang.String str) {
        return (com.truecaller.whoviewedme.ProfileViewSource) java.lang.Enum.valueOf(com.truecaller.whoviewedme.ProfileViewSource.class, str);
    }

    public static com.truecaller.whoviewedme.ProfileViewSource[] values() {
        return (com.truecaller.whoviewedme.ProfileViewSource[]) $VALUES.clone();
    }
}
