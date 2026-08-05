package com.truecaller.featuretoggles;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/featuretoggles/FeatureState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "ENABLED_ALPHA_DEBUG", "DISABLED", "feature-toggles-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeatureState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.featuretoggles.FeatureState[] $VALUES;
    public static final com.truecaller.featuretoggles.FeatureState ENABLED = new com.truecaller.featuretoggles.FeatureState("ENABLED", 0);
    public static final com.truecaller.featuretoggles.FeatureState ENABLED_ALPHA_DEBUG = new com.truecaller.featuretoggles.FeatureState("ENABLED_ALPHA_DEBUG", 1);
    public static final com.truecaller.featuretoggles.FeatureState DISABLED = new com.truecaller.featuretoggles.FeatureState("DISABLED", 2);

    private static final /* synthetic */ com.truecaller.featuretoggles.FeatureState[] $values() {
        return new com.truecaller.featuretoggles.FeatureState[]{ENABLED, ENABLED_ALPHA_DEBUG, DISABLED};
    }

    static {
        com.truecaller.featuretoggles.FeatureState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeatureState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.featuretoggles.FeatureState valueOf(java.lang.String str) {
        return (com.truecaller.featuretoggles.FeatureState) java.lang.Enum.valueOf(com.truecaller.featuretoggles.FeatureState.class, str);
    }

    public static com.truecaller.featuretoggles.FeatureState[] values() {
        return (com.truecaller.featuretoggles.FeatureState[]) $VALUES.clone();
    }
}
