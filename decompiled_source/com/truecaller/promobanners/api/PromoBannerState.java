package com.truecaller.promobanners.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/promobanners/api/PromoBannerState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "VISIBLE", "HIDDEN", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PromoBannerState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.promobanners.api.PromoBannerState[] $VALUES;
    public static final com.truecaller.promobanners.api.PromoBannerState INITIAL = new com.truecaller.promobanners.api.PromoBannerState("INITIAL", 0);
    public static final com.truecaller.promobanners.api.PromoBannerState VISIBLE = new com.truecaller.promobanners.api.PromoBannerState("VISIBLE", 1);
    public static final com.truecaller.promobanners.api.PromoBannerState HIDDEN = new com.truecaller.promobanners.api.PromoBannerState("HIDDEN", 2);

    private static final /* synthetic */ com.truecaller.promobanners.api.PromoBannerState[] $values() {
        return new com.truecaller.promobanners.api.PromoBannerState[]{INITIAL, VISIBLE, HIDDEN};
    }

    static {
        com.truecaller.promobanners.api.PromoBannerState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PromoBannerState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.promobanners.api.PromoBannerState valueOf(java.lang.String str) {
        return (com.truecaller.promobanners.api.PromoBannerState) java.lang.Enum.valueOf(com.truecaller.promobanners.api.PromoBannerState.class, str);
    }

    public static com.truecaller.promobanners.api.PromoBannerState[] values() {
        return (com.truecaller.promobanners.api.PromoBannerState[]) $VALUES.clone();
    }
}
