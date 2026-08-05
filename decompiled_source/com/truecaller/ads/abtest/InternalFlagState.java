package com.truecaller.ads.abtest;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/ads/abtest/InternalFlagState;", "", "<init>", "(Ljava/lang/String;I)V", "NotApplicable", "On", "Off", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InternalFlagState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.abtest.InternalFlagState[] $VALUES;
    public static final com.truecaller.ads.abtest.InternalFlagState NotApplicable = new com.truecaller.ads.abtest.InternalFlagState("NotApplicable", 0);
    public static final com.truecaller.ads.abtest.InternalFlagState On = new com.truecaller.ads.abtest.InternalFlagState("On", 1);
    public static final com.truecaller.ads.abtest.InternalFlagState Off = new com.truecaller.ads.abtest.InternalFlagState("Off", 2);

    private static final /* synthetic */ com.truecaller.ads.abtest.InternalFlagState[] $values() {
        return new com.truecaller.ads.abtest.InternalFlagState[]{NotApplicable, On, Off};
    }

    static {
        com.truecaller.ads.abtest.InternalFlagState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InternalFlagState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.abtest.InternalFlagState valueOf(java.lang.String str) {
        return (com.truecaller.ads.abtest.InternalFlagState) java.lang.Enum.valueOf(com.truecaller.ads.abtest.InternalFlagState.class, str);
    }

    public static com.truecaller.ads.abtest.InternalFlagState[] values() {
        return (com.truecaller.ads.abtest.InternalFlagState[]) $VALUES.clone();
    }
}
