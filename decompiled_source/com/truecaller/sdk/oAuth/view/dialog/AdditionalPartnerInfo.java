package com.truecaller.sdk.oAuth.view.dialog;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006 "}, d2 = {"Lcom/truecaller/sdk/oAuth/view/dialog/AdditionalPartnerInfo;", "Landroid/os/Parcelable;", "partnerDetails", "Lcom/truecaller/sdk/oAuth/networking/data/PartnerDetailsResponse;", "sdkOptionsDataBundle", "Lcom/truecaller/android/sdk/oAuth/SdkOptionsDataBundle;", "isRectangleShapeRequested", "", "<init>", "(Lcom/truecaller/sdk/oAuth/networking/data/PartnerDetailsResponse;Lcom/truecaller/android/sdk/oAuth/SdkOptionsDataBundle;Z)V", "getPartnerDetails", "()Lcom/truecaller/sdk/oAuth/networking/data/PartnerDetailsResponse;", "getSdkOptionsDataBundle", "()Lcom/truecaller/android/sdk/oAuth/SdkOptionsDataBundle;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class AdditionalPartnerInfo implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo> CREATOR = new a11.bar(3);
    private final boolean isRectangleShapeRequested;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetails;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle;

    public AdditionalPartnerInfo(@org.jetbrains.annotations.NotNull com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetailsResponse, @org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerDetailsResponse, "partnerDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkOptionsDataBundle, "sdkOptionsDataBundle");
        this.partnerDetails = partnerDetailsResponse;
        this.sdkOptionsDataBundle = sdkOptionsDataBundle;
        this.isRectangleShapeRequested = z;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo copy$default(com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo additionalPartnerInfo, com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetailsResponse, com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partnerDetailsResponse = additionalPartnerInfo.partnerDetails;
        }
        if ((i & 2) != 0) {
            sdkOptionsDataBundle = additionalPartnerInfo.sdkOptionsDataBundle;
        }
        if ((i & 4) != 0) {
            z = additionalPartnerInfo.isRectangleShapeRequested;
        }
        return additionalPartnerInfo.copy(partnerDetailsResponse, sdkOptionsDataBundle, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse getPartnerDetails() {
        return this.partnerDetails;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle getSdkOptionsDataBundle() {
        return this.sdkOptionsDataBundle;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRectangleShapeRequested() {
        return this.isRectangleShapeRequested;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo copy(@org.jetbrains.annotations.NotNull com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetails, @org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle, boolean isRectangleShapeRequested) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerDetails, "partnerDetails");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkOptionsDataBundle, "sdkOptionsDataBundle");
        return new com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo(partnerDetails, sdkOptionsDataBundle, isRectangleShapeRequested);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo)) {
            return false;
        }
        com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo additionalPartnerInfo = (com.truecaller.sdk.oAuth.view.dialog.AdditionalPartnerInfo) other;
        return kotlin.jvm.internal.Intrinsics.b(this.partnerDetails, additionalPartnerInfo.partnerDetails) && kotlin.jvm.internal.Intrinsics.b(this.sdkOptionsDataBundle, additionalPartnerInfo.sdkOptionsDataBundle) && this.isRectangleShapeRequested == additionalPartnerInfo.isRectangleShapeRequested;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse getPartnerDetails() {
        return this.partnerDetails;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle getSdkOptionsDataBundle() {
        return this.sdkOptionsDataBundle;
    }

    public int hashCode() {
        return ((this.sdkOptionsDataBundle.hashCode() + (this.partnerDetails.hashCode() * 31)) * 31) + (this.isRectangleShapeRequested ? 1231 : 1237);
    }

    public final boolean isRectangleShapeRequested() {
        return this.isRectangleShapeRequested;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.sdk.oAuth.networking.data.PartnerDetailsResponse partnerDetailsResponse = this.partnerDetails;
        com.truecaller.android.sdk.oAuth.SdkOptionsDataBundle sdkOptionsDataBundle = this.sdkOptionsDataBundle;
        boolean z = this.isRectangleShapeRequested;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AdditionalPartnerInfo(partnerDetails=");
        sb.append(partnerDetailsResponse);
        sb.append(", sdkOptionsDataBundle=");
        sb.append(sdkOptionsDataBundle);
        sb.append(", isRectangleShapeRequested=");
        return h8.s0.s(sb, z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.partnerDetails.writeToParcel(dest, flags);
        dest.writeParcelable(this.sdkOptionsDataBundle, flags);
        dest.writeInt(this.isRectangleShapeRequested ? 1 : 0);
    }
}
