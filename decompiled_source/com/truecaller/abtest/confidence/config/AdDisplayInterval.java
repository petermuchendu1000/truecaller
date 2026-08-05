package com.truecaller.abtest.confidence.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/abtest/confidence/config/AdDisplayInterval;", "", "noAdDays", "", "adDays", "<init>", "(II)V", "getNoAdDays", "()I", "getAdDays", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "abtest_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdDisplayInterval {

    @bw.qux("durationindays")
    private final int adDays;

    @bw.qux("frequencyindays")
    private final int noAdDays;

    public AdDisplayInterval(int i, int i2) {
        this.noAdDays = i;
        this.adDays = i2;
    }

    public static /* synthetic */ com.truecaller.abtest.confidence.config.AdDisplayInterval copy$default(com.truecaller.abtest.confidence.config.AdDisplayInterval adDisplayInterval, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = adDisplayInterval.noAdDays;
        }
        if ((i3 & 2) != 0) {
            i2 = adDisplayInterval.adDays;
        }
        return adDisplayInterval.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNoAdDays() {
        return this.noAdDays;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAdDays() {
        return this.adDays;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.abtest.confidence.config.AdDisplayInterval copy(int noAdDays, int adDays) {
        return new com.truecaller.abtest.confidence.config.AdDisplayInterval(noAdDays, adDays);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.abtest.confidence.config.AdDisplayInterval)) {
            return false;
        }
        com.truecaller.abtest.confidence.config.AdDisplayInterval adDisplayInterval = (com.truecaller.abtest.confidence.config.AdDisplayInterval) other;
        return this.noAdDays == adDisplayInterval.noAdDays && this.adDays == adDisplayInterval.adDays;
    }

    public final int getAdDays() {
        return this.adDays;
    }

    public final int getNoAdDays() {
        return this.noAdDays;
    }

    public int hashCode() {
        return (this.noAdDays * 31) + this.adDays;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h0.b.P(this.noAdDays, this.adDays, "AdDisplayInterval(noAdDays=", ", adDays=", ")");
    }
}
