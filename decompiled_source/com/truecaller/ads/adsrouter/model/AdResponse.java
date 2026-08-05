package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/AdResponse;", "", "success", "", "ads", "", "Lcom/truecaller/ads/adsrouter/model/Ad;", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "getSuccess", "()Z", "getAds", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdResponse {
    public static final int $stable = 8;

    @bw.qux("ads")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.adsrouter.model.Ad> ads;

    @bw.qux(com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN)
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message;

    @bw.qux("success")
    private final boolean success;

    public AdResponse(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrouter.model.Ad> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "ads");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        this.success = z;
        this.ads = list;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrouter.model.AdResponse copy$default(com.truecaller.ads.adsrouter.model.AdResponse adResponse, boolean z, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = adResponse.success;
        }
        if ((i & 2) != 0) {
            list = adResponse.ads;
        }
        if ((i & 4) != 0) {
            str = adResponse.message;
        }
        return adResponse.copy(z, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrouter.model.Ad> component2() {
        return this.ads;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.AdResponse copy(boolean success, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.adsrouter.model.Ad> ads, @org.jetbrains.annotations.NotNull java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ads, "ads");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
        return new com.truecaller.ads.adsrouter.model.AdResponse(success, ads, message);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.AdResponse)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.AdResponse adResponse = (com.truecaller.ads.adsrouter.model.AdResponse) other;
        return this.success == adResponse.success && kotlin.jvm.internal.Intrinsics.b(this.ads, adResponse.ads) && kotlin.jvm.internal.Intrinsics.b(this.message, adResponse.message);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.adsrouter.model.Ad> getAds() {
        return this.ads;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int i;
        if (this.success) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.message.hashCode() + uf.qux.g(i * 31, 31, this.ads);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.success;
        java.util.List<com.truecaller.ads.adsrouter.model.Ad> list = this.ads;
        java.lang.String str = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdResponse(success=");
        sb.append(z);
        sb.append(", ads=");
        sb.append(list);
        sb.append(", message=");
        return bar.v(str, ")", sb);
    }
}
