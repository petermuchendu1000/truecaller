package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/truecaller/ads/mediation/model/rtb/RtbBidResponse;", "", "bidid", "", "cur", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "seatbid", "", "Lcom/truecaller/ads/mediation/model/rtb/SeatBid;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBidid", "()Ljava/lang/String;", "getCur", "getId", "getSeatbid", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RtbBidResponse {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String bidid;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String cur;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.rtb.SeatBid> seatbid;

    public RtbBidResponse(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.rtb.SeatBid> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bidid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "cur");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "seatbid");
        this.bidid = str;
        this.cur = str2;
        this.id = str3;
        this.seatbid = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.RtbBidResponse copy$default(com.truecaller.ads.mediation.model.rtb.RtbBidResponse rtbBidResponse, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rtbBidResponse.bidid;
        }
        if ((i & 2) != 0) {
            str2 = rtbBidResponse.cur;
        }
        if ((i & 4) != 0) {
            str3 = rtbBidResponse.id;
        }
        if ((i & 8) != 0) {
            list = rtbBidResponse.seatbid;
        }
        return rtbBidResponse.copy(str, str2, str3, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBidid() {
        return this.bidid;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCur() {
        return this.cur;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.rtb.SeatBid> component4() {
        return this.seatbid;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.RtbBidResponse copy(@org.jetbrains.annotations.NotNull java.lang.String bidid, @org.jetbrains.annotations.NotNull java.lang.String cur, @org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.rtb.SeatBid> seatbid) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bidid, "bidid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cur, "cur");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(seatbid, "seatbid");
        return new com.truecaller.ads.mediation.model.rtb.RtbBidResponse(bidid, cur, id, seatbid);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.RtbBidResponse)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.RtbBidResponse rtbBidResponse = (com.truecaller.ads.mediation.model.rtb.RtbBidResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.bidid, rtbBidResponse.bidid) && kotlin.jvm.internal.Intrinsics.b(this.cur, rtbBidResponse.cur) && kotlin.jvm.internal.Intrinsics.b(this.id, rtbBidResponse.id) && kotlin.jvm.internal.Intrinsics.b(this.seatbid, rtbBidResponse.seatbid);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBidid() {
        return this.bidid;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCur() {
        return this.cur;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.rtb.SeatBid> getSeatbid() {
        return this.seatbid;
    }

    public int hashCode() {
        return this.seatbid.hashCode() + ax1.bar.e(ax1.bar.e(this.bidid.hashCode() * 31, 31, this.cur), 31, this.id);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.bidid;
        java.lang.String str2 = this.cur;
        return z0.a0.d(this.id, ", seatbid=", ")", ro0.f.E("RtbBidResponse(bidid=", str, ", cur=", str2, ", id="), this.seatbid);
    }
}
