package com.truecaller.calling.domaincallinterstitials;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/calling/domaincallinterstitials/CallInterstitialCoordinator$OutgoingCallSource", "", "Lcom/truecaller/calling/domaincallinterstitials/CallInterstitialCoordinator$OutgoingCallSource;", "<init>", "(Ljava/lang/String;I)V", "CallLog", "Dialpad", "T9Search", "domain-call-interstitials_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallInterstitialCoordinator$OutgoingCallSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[] $VALUES;
    public static final com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource CallLog = new com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource("CallLog", 0);
    public static final com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource Dialpad = new com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource("Dialpad", 1);
    public static final com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource T9Search = new com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource("T9Search", 2);

    private static final /* synthetic */ com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[] $values() {
        return new com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[]{CallLog, Dialpad, T9Search};
    }

    static {
        com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallInterstitialCoordinator$OutgoingCallSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource valueOf(java.lang.String str) {
        return (com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource) java.lang.Enum.valueOf(com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource.class, str);
    }

    public static com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[] values() {
        return (com.truecaller.calling.domaincallinterstitials.CallInterstitialCoordinator$OutgoingCallSource[]) $VALUES.clone();
    }
}
