package com.truecaller.abtest.confidence.config;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/truecaller/abtest/confidence/config/AdDisplaySchedule;", "", "initialNoAdDays", "", "initialAdDays", "repeatCycle", "Lcom/truecaller/abtest/confidence/config/AdDisplayInterval;", "<init>", "(IILcom/truecaller/abtest/confidence/config/AdDisplayInterval;)V", "getInitialNoAdDays", "()I", "getInitialAdDays", "getRepeatCycle", "()Lcom/truecaller/abtest/confidence/config/AdDisplayInterval;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "abtest_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdDisplaySchedule {

    @bw.qux("initialpromoperiodendday")
    private final int initialAdDays;

    @bw.qux("initialpromoperiodstartday")
    private final int initialNoAdDays;

    @bw.qux("repeatatinterval")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.abtest.confidence.config.AdDisplayInterval repeatCycle;

    public AdDisplaySchedule(int i, int i2, @org.jetbrains.annotations.NotNull com.truecaller.abtest.confidence.config.AdDisplayInterval adDisplayInterval) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adDisplayInterval, "repeatCycle");
        this.initialNoAdDays = i;
        this.initialAdDays = i2;
        this.repeatCycle = adDisplayInterval;
    }

    public static /* synthetic */ com.truecaller.abtest.confidence.config.AdDisplaySchedule copy$default(com.truecaller.abtest.confidence.config.AdDisplaySchedule adDisplaySchedule, int i, int i2, com.truecaller.abtest.confidence.config.AdDisplayInterval adDisplayInterval, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = adDisplaySchedule.initialNoAdDays;
        }
        if ((i3 & 2) != 0) {
            i2 = adDisplaySchedule.initialAdDays;
        }
        if ((i3 & 4) != 0) {
            adDisplayInterval = adDisplaySchedule.repeatCycle;
        }
        return adDisplaySchedule.copy(i, i2, adDisplayInterval);
    }

    /* renamed from: component1, reason: from getter */
    public final int getInitialNoAdDays() {
        return this.initialNoAdDays;
    }

    /* renamed from: component2, reason: from getter */
    public final int getInitialAdDays() {
        return this.initialAdDays;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.abtest.confidence.config.AdDisplayInterval getRepeatCycle() {
        return this.repeatCycle;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.abtest.confidence.config.AdDisplaySchedule copy(int initialNoAdDays, int initialAdDays, @org.jetbrains.annotations.NotNull com.truecaller.abtest.confidence.config.AdDisplayInterval repeatCycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatCycle, "repeatCycle");
        return new com.truecaller.abtest.confidence.config.AdDisplaySchedule(initialNoAdDays, initialAdDays, repeatCycle);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.abtest.confidence.config.AdDisplaySchedule)) {
            return false;
        }
        com.truecaller.abtest.confidence.config.AdDisplaySchedule adDisplaySchedule = (com.truecaller.abtest.confidence.config.AdDisplaySchedule) other;
        return this.initialNoAdDays == adDisplaySchedule.initialNoAdDays && this.initialAdDays == adDisplaySchedule.initialAdDays && kotlin.jvm.internal.Intrinsics.b(this.repeatCycle, adDisplaySchedule.repeatCycle);
    }

    public final int getInitialAdDays() {
        return this.initialAdDays;
    }

    public final int getInitialNoAdDays() {
        return this.initialNoAdDays;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.abtest.confidence.config.AdDisplayInterval getRepeatCycle() {
        return this.repeatCycle;
    }

    public int hashCode() {
        return this.repeatCycle.hashCode() + (((this.initialNoAdDays * 31) + this.initialAdDays) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.initialNoAdDays;
        int i2 = this.initialAdDays;
        com.truecaller.abtest.confidence.config.AdDisplayInterval adDisplayInterval = this.repeatCycle;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "AdDisplaySchedule(initialNoAdDays=", ", initialAdDays=", ", repeatCycle=");
        e.append(adDisplayInterval);
        e.append(")");
        return e.toString();
    }
}
