package com.truecaller.ads.mediation.helper;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"com/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData", "", "Lcom/truecaller/ads/mediation/model/rtb/Bid;", "bid", "", "rawEcpm", "eCpm", "<init>", "(Lcom/truecaller/ads/mediation/model/rtb/Bid;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/truecaller/ads/mediation/model/rtb/Bid;", "component2", "()Ljava/lang/String;", "component3", "Lcom/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData;", "copy", "(Lcom/truecaller/ads/mediation/model/rtb/Bid;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/ads/mediation/helper/RtbDataHelperImpl$RtbAdData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/truecaller/ads/mediation/model/rtb/Bid;", "getBid", "Ljava/lang/String;", "getRawEcpm", "getECpm", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RtbDataHelperImpl$RtbAdData {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mediation.model.rtb.Bid bid;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eCpm;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawEcpm;

    public RtbDataHelperImpl$RtbAdData(@org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Bid bid, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "rawEcpm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "eCpm");
        this.bid = bid;
        this.rawEcpm = str;
        this.eCpm = str2;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData copy$default(com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData, com.truecaller.ads.mediation.model.rtb.Bid bid, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bid = rtbDataHelperImpl$RtbAdData.bid;
        }
        if ((i & 2) != 0) {
            str = rtbDataHelperImpl$RtbAdData.rawEcpm;
        }
        if ((i & 4) != 0) {
            str2 = rtbDataHelperImpl$RtbAdData.eCpm;
        }
        return rtbDataHelperImpl$RtbAdData.copy(bid, str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Bid getBid() {
        return this.bid;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawEcpm() {
        return this.rawEcpm;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getECpm() {
        return this.eCpm;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData copy(@org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Bid bid, @org.jetbrains.annotations.NotNull java.lang.String rawEcpm, @org.jetbrains.annotations.NotNull java.lang.String eCpm) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawEcpm, "rawEcpm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eCpm, "eCpm");
        return new com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData(bid, rawEcpm, eCpm);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData)) {
            return false;
        }
        com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData rtbDataHelperImpl$RtbAdData = (com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbAdData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.bid, rtbDataHelperImpl$RtbAdData.bid) && kotlin.jvm.internal.Intrinsics.b(this.rawEcpm, rtbDataHelperImpl$RtbAdData.rawEcpm) && kotlin.jvm.internal.Intrinsics.b(this.eCpm, rtbDataHelperImpl$RtbAdData.eCpm);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Bid getBid() {
        return this.bid;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getECpm() {
        return this.eCpm;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawEcpm() {
        return this.rawEcpm;
    }

    public int hashCode() {
        return this.eCpm.hashCode() + ax1.bar.e(this.bid.hashCode() * 31, 31, this.rawEcpm);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.ads.mediation.model.rtb.Bid bid = this.bid;
        java.lang.String str = this.rawEcpm;
        java.lang.String str2 = this.eCpm;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RtbAdData(bid=");
        sb.append(bid);
        sb.append(", rawEcpm=");
        sb.append(str);
        sb.append(", eCpm=");
        return bar.v(str2, ")", sb);
    }
}
