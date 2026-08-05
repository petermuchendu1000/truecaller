package com.truecaller.ads.rewarded;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/truecaller/ads/rewarded/RewardedRequest;", "Landroid/os/Parcelable;", "placement", "", "adUnit", "adUnitIdKey", "customData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPlacement", "()Ljava/lang/String;", "getAdUnit", "getAdUnitIdKey", "getCustomData", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RewardedRequest implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.rewarded.RewardedRequest> CREATOR = new y02.t(26);

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnit;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adUnitIdKey;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String customData;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    public RewardedRequest(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "adUnitIdKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "customData");
        this.placement = str;
        this.adUnit = str2;
        this.adUnitIdKey = str3;
        this.customData = str4;
    }

    public static /* synthetic */ com.truecaller.ads.rewarded.RewardedRequest copy$default(com.truecaller.ads.rewarded.RewardedRequest rewardedRequest, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = rewardedRequest.placement;
        }
        if ((i & 2) != 0) {
            str2 = rewardedRequest.adUnit;
        }
        if ((i & 4) != 0) {
            str3 = rewardedRequest.adUnitIdKey;
        }
        if ((i & 8) != 0) {
            str4 = rewardedRequest.customData;
        }
        return rewardedRequest.copy(str, str2, str3, str4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdUnit() {
        return this.adUnit;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCustomData() {
        return this.customData;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.rewarded.RewardedRequest copy(@org.jetbrains.annotations.NotNull java.lang.String placement, @org.jetbrains.annotations.NotNull java.lang.String adUnit, @org.jetbrains.annotations.NotNull java.lang.String adUnitIdKey, @org.jetbrains.annotations.NotNull java.lang.String customData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitIdKey, "adUnitIdKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customData, "customData");
        return new com.truecaller.ads.rewarded.RewardedRequest(placement, adUnit, adUnitIdKey, customData);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.rewarded.RewardedRequest)) {
            return false;
        }
        com.truecaller.ads.rewarded.RewardedRequest rewardedRequest = (com.truecaller.ads.rewarded.RewardedRequest) other;
        return kotlin.jvm.internal.Intrinsics.b(this.placement, rewardedRequest.placement) && kotlin.jvm.internal.Intrinsics.b(this.adUnit, rewardedRequest.adUnit) && kotlin.jvm.internal.Intrinsics.b(this.adUnitIdKey, rewardedRequest.adUnitIdKey) && kotlin.jvm.internal.Intrinsics.b(this.customData, rewardedRequest.customData);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnit() {
        return this.adUnit;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdUnitIdKey() {
        return this.adUnitIdKey;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomData() {
        return this.customData;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        return this.customData.hashCode() + ax1.bar.e(ax1.bar.e(this.placement.hashCode() * 31, 31, this.adUnit), 31, this.adUnitIdKey);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.placement;
        java.lang.String str2 = this.adUnit;
        return bar.x(ro0.f.E("RewardedRequest(placement=", str, ", adUnit=", str2, ", adUnitIdKey="), this.adUnitIdKey, ", customData=", this.customData, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.placement);
        dest.writeString(this.adUnit);
        dest.writeString(this.adUnitIdKey);
        dest.writeString(this.customData);
    }
}
