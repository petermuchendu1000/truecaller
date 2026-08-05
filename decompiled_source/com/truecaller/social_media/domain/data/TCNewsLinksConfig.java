package com.truecaller.social_media.domain.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/truecaller/social_media/domain/data/TCNewsLinksConfig;", "", "config", "", "Lcom/truecaller/social_media/domain/data/TCNewsLinksForRegion;", "<init>", "(Ljava/util/List;)V", "getConfig", "()Ljava/util/List;", "social-media_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public class TCNewsLinksConfig {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.social_media.domain.data.TCNewsLinksForRegion> config;

    public TCNewsLinksConfig() {
        this(null, 1, null);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.social_media.domain.data.TCNewsLinksForRegion> getConfig() {
        return this.config;
    }

    public TCNewsLinksConfig(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.social_media.domain.data.TCNewsLinksForRegion> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "config");
        this.config = list;
    }

    public TCNewsLinksConfig(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? kotlin.collections.h0.a : list);
    }
}
