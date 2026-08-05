package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/SeatBid;", "", "bid", "", "Lcom/truecaller/ads/mediation/model/rtb/Bid;", "<init>", "(Ljava/util/List;)V", "getBid", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class SeatBid {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.rtb.Bid> bid;

    public SeatBid(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.rtb.Bid> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "bid");
        this.bid = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.SeatBid copy$default(com.truecaller.ads.mediation.model.rtb.SeatBid seatBid, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = seatBid.bid;
        }
        return seatBid.copy(list);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.rtb.Bid> component1() {
        return this.bid;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.SeatBid copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.rtb.Bid> bid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        return new com.truecaller.ads.mediation.model.rtb.SeatBid(bid);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.mediation.model.rtb.SeatBid) && kotlin.jvm.internal.Intrinsics.b(this.bid, ((com.truecaller.ads.mediation.model.rtb.SeatBid) other).bid);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.rtb.Bid> getBid() {
        return this.bid;
    }

    public int hashCode() {
        return this.bid.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("SeatBid(bid=", ")", this.bid);
    }
}
