package com.truecaller.whosearchedforme.network.data;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/whosearchedforme/network/data/WSFMProfileSearchSummary;", "", "viewedCount", "", "unViewedCount", "<init>", "(II)V", "getViewedCount", "()I", "getUnViewedCount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "whosearchedforme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class WSFMProfileSearchSummary {

    @bw.qux("unViewedCount")
    private final int unViewedCount;

    @bw.qux("viewedCount")
    private final int viewedCount;

    public WSFMProfileSearchSummary(int i, int i2) {
        this.viewedCount = i;
        this.unViewedCount = i2;
    }

    public static /* synthetic */ com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary copy$default(com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary wSFMProfileSearchSummary, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = wSFMProfileSearchSummary.viewedCount;
        }
        if ((i3 & 2) != 0) {
            i2 = wSFMProfileSearchSummary.unViewedCount;
        }
        return wSFMProfileSearchSummary.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getViewedCount() {
        return this.viewedCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUnViewedCount() {
        return this.unViewedCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary copy(int viewedCount, int unViewedCount) {
        return new com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary(viewedCount, unViewedCount);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary)) {
            return false;
        }
        com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary wSFMProfileSearchSummary = (com.truecaller.whosearchedforme.network.data.WSFMProfileSearchSummary) other;
        return this.viewedCount == wSFMProfileSearchSummary.viewedCount && this.unViewedCount == wSFMProfileSearchSummary.unViewedCount;
    }

    public final int getUnViewedCount() {
        return this.unViewedCount;
    }

    public final int getViewedCount() {
        return this.viewedCount;
    }

    public int hashCode() {
        return (this.viewedCount * 31) + this.unViewedCount;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h0.b.P(this.viewedCount, this.unViewedCount, "WSFMProfileSearchSummary(viewedCount=", ", unViewedCount=", ")");
    }
}
