package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlAuctionType$Priority", "Lw20/bar;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlAuctionType$Priority implements w20.bar {
    public final java.util.List a;
    public final com.truecaller.ads.api.internal.dl.model.DlEmitMode b;
    public final com.truecaller.ads.api.internal.dl.model.DlTierResolutionMode c;
    public final com.truecaller.ads.api.internal.dl.model.DlBackfillRanking d;

    public DlAuctionType$Priority(java.util.List list, com.truecaller.ads.api.internal.dl.model.DlEmitMode dlEmitMode, com.truecaller.ads.api.internal.dl.model.DlTierResolutionMode dlTierResolutionMode, com.truecaller.ads.api.internal.dl.model.DlBackfillRanking dlBackfillRanking) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "entries");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlEmitMode, "mode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlTierResolutionMode, "tierResolutionMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dlBackfillRanking, "backfillRanking");
        this.a = list;
        this.b = dlEmitMode;
        this.c = dlTierResolutionMode;
        this.d = dlBackfillRanking;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.api.internal.dl.model.DlAuctionType$Priority)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlAuctionType$Priority dlAuctionType$Priority = (com.truecaller.ads.api.internal.dl.model.DlAuctionType$Priority) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, dlAuctionType$Priority.a) && this.b == dlAuctionType$Priority.b && this.c == dlAuctionType$Priority.c && this.d == dlAuctionType$Priority.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Priority(entries=" + this.a + ", mode=" + this.b + ", tierResolutionMode=" + this.c + ", backfillRanking=" + this.d + ")";
    }
}
