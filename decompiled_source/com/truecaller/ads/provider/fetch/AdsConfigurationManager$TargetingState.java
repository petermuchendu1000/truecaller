package com.truecaller.ads.provider.fetch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/truecaller/ads/provider/fetch/AdsConfigurationManager$TargetingState", "", "Lcom/truecaller/ads/provider/fetch/AdsConfigurationManager$TargetingState;", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "UNKNOWN", "TARGETING", "NON_TARGETING", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsConfigurationManager$TargetingState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState UNKNOWN = new com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState("UNKNOWN", 0, "");
    public static final com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState TARGETING = new com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState("TARGETING", 1, "T");
    public static final com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState NON_TARGETING = new com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState("NON_TARGETING", 2, "N");

    private static final /* synthetic */ com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[] $values() {
        return new com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[]{UNKNOWN, TARGETING, NON_TARGETING};
    }

    static {
        com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdsConfigurationManager$TargetingState(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState valueOf(java.lang.String str) {
        return (com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState) java.lang.Enum.valueOf(com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState.class, str);
    }

    public static com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[] values() {
        return (com.truecaller.ads.provider.fetch.AdsConfigurationManager$TargetingState[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
