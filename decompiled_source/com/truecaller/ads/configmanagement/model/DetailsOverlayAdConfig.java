package com.truecaller.ads.configmanagement.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/configmanagement/model/DetailsOverlayAdConfig;", "", "timer", "", "<init>", "(I)V", "getTimer", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DetailsOverlayAdConfig {
    public static final int $stable = 0;

    @bw.qux("timer")
    private final int timer;

    public DetailsOverlayAdConfig() {
        this(0, 1, null);
    }

    public static /* synthetic */ com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig copy$default(com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = detailsOverlayAdConfig.timer;
        }
        return detailsOverlayAdConfig.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTimer() {
        return this.timer;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig copy(int timer) {
        return new com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig(timer);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig) && this.timer == ((com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig) other).timer;
    }

    public final int getTimer() {
        return this.timer;
    }

    public int hashCode() {
        return this.timer;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.d(this.timer, "DetailsOverlayAdConfig(timer=", ")");
    }

    public DetailsOverlayAdConfig(int i) {
        this.timer = i;
    }

    public /* synthetic */ DetailsOverlayAdConfig(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
