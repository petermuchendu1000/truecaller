package com.truecaller.ads.acsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/truecaller/ads/acsrules/model/AcsDelayedRulesData;", "", "delay", "", "<init>", "(J)V", "getDelay", "()J", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AcsDelayedRulesData {
    public static final int $stable = 0;
    private final long delay;

    public AcsDelayedRulesData(long j) {
        this.delay = j;
    }

    public static /* synthetic */ com.truecaller.ads.acsrules.model.AcsDelayedRulesData copy$default(com.truecaller.ads.acsrules.model.AcsDelayedRulesData acsDelayedRulesData, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = acsDelayedRulesData.delay;
        }
        return acsDelayedRulesData.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.acsrules.model.AcsDelayedRulesData copy(long delay) {
        return new com.truecaller.ads.acsrules.model.AcsDelayedRulesData(delay);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.acsrules.model.AcsDelayedRulesData) && this.delay == ((com.truecaller.ads.acsrules.model.AcsDelayedRulesData) other).delay;
    }

    public final long getDelay() {
        return this.delay;
    }

    public int hashCode() {
        long j = this.delay;
        return (int) (j ^ (j >>> 32));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.m(this.delay, "AcsDelayedRulesData(delay=", ")");
    }
}
