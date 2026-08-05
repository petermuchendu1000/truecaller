package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlAuctionType$ServerAuction", "Lw20/bar;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlAuctionType$ServerAuction implements w20.bar {
    public final int a;
    public final long b;

    public DlAuctionType$ServerAuction(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.api.internal.dl.model.DlAuctionType$ServerAuction)) {
            return false;
        }
        com.truecaller.ads.api.internal.dl.model.DlAuctionType$ServerAuction dlAuctionType$ServerAuction = (com.truecaller.ads.api.internal.dl.model.DlAuctionType$ServerAuction) obj;
        return this.a == dlAuctionType$ServerAuction.a && this.b == dlAuctionType$ServerAuction.b;
    }

    public final int hashCode() {
        int i = this.a * 31;
        long j = this.b;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder o = com.appsflyer.internal.e.o(this.a, "ServerAuction(bidCount=", ", sourceTimeoutMs=", this.b);
        o.append(")");
        return o.toString();
    }
}
