package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, d2 = {"Lcom/truecaller/ads/vast/Verification;", "Landroid/os/Parcelable;", "vendor", "", "apiFramework", "javaScriptResource", "Lcom/truecaller/ads/vast/JavaScriptResource;", "verificationParameters", "trackingEvents", "Lcom/truecaller/ads/vast/TrackingEvents;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/ads/vast/JavaScriptResource;Ljava/lang/String;Lcom/truecaller/ads/vast/TrackingEvents;)V", "getVendor", "()Ljava/lang/String;", "getApiFramework", "getJavaScriptResource", "()Lcom/truecaller/ads/vast/JavaScriptResource;", "getVerificationParameters", "getTrackingEvents", "()Lcom/truecaller/ads/vast/TrackingEvents;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Verification implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.vast.Verification> CREATOR = new rz0.b0(21);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String apiFramework;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.JavaScriptResource javaScriptResource;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.TrackingEvents trackingEvents;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String vendor;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String verificationParameters;

    public Verification() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ com.truecaller.ads.vast.Verification copy$default(com.truecaller.ads.vast.Verification verification, java.lang.String str, java.lang.String str2, com.truecaller.ads.vast.JavaScriptResource javaScriptResource, java.lang.String str3, com.truecaller.ads.vast.TrackingEvents trackingEvents, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = verification.vendor;
        }
        if ((i & 2) != 0) {
            str2 = verification.apiFramework;
        }
        if ((i & 4) != 0) {
            javaScriptResource = verification.javaScriptResource;
        }
        if ((i & 8) != 0) {
            str3 = verification.verificationParameters;
        }
        if ((i & 16) != 0) {
            trackingEvents = verification.trackingEvents;
        }
        com.truecaller.ads.vast.TrackingEvents trackingEvents2 = trackingEvents;
        com.truecaller.ads.vast.JavaScriptResource javaScriptResource2 = javaScriptResource;
        return verification.copy(str, str2, javaScriptResource2, str3, trackingEvents2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVendor() {
        return this.vendor;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getApiFramework() {
        return this.apiFramework;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.vast.JavaScriptResource getJavaScriptResource() {
        return this.javaScriptResource;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getVerificationParameters() {
        return this.verificationParameters;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.ads.vast.TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Verification copy(@hl.qux(isAttribute = true) @org.jetbrains.annotations.Nullable java.lang.String vendor, @hl.qux(isAttribute = true, localName = "apiFramework") @org.jetbrains.annotations.Nullable java.lang.String apiFramework, @ak.f0("JavaScriptResource") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.JavaScriptResource javaScriptResource, @ak.f0("VerificationParameters") @org.jetbrains.annotations.Nullable java.lang.String verificationParameters, @ak.f0("TrackingEvents") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.TrackingEvents trackingEvents) {
        return new com.truecaller.ads.vast.Verification(vendor, apiFramework, javaScriptResource, verificationParameters, trackingEvents);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Verification)) {
            return false;
        }
        com.truecaller.ads.vast.Verification verification = (com.truecaller.ads.vast.Verification) other;
        return kotlin.jvm.internal.Intrinsics.b(this.vendor, verification.vendor) && kotlin.jvm.internal.Intrinsics.b(this.apiFramework, verification.apiFramework) && kotlin.jvm.internal.Intrinsics.b(this.javaScriptResource, verification.javaScriptResource) && kotlin.jvm.internal.Intrinsics.b(this.verificationParameters, verification.verificationParameters) && kotlin.jvm.internal.Intrinsics.b(this.trackingEvents, verification.trackingEvents);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApiFramework() {
        return this.apiFramework;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.JavaScriptResource getJavaScriptResource() {
        return this.javaScriptResource;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.TrackingEvents getTrackingEvents() {
        return this.trackingEvents;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVendor() {
        return this.vendor;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVerificationParameters() {
        return this.verificationParameters;
    }

    public int hashCode() {
        java.lang.String str = this.vendor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.apiFramework;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.truecaller.ads.vast.JavaScriptResource javaScriptResource = this.javaScriptResource;
        int hashCode3 = (hashCode2 + (javaScriptResource == null ? 0 : javaScriptResource.hashCode())) * 31;
        java.lang.String str3 = this.verificationParameters;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.truecaller.ads.vast.TrackingEvents trackingEvents = this.trackingEvents;
        return hashCode4 + (trackingEvents != null ? trackingEvents.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.vendor;
        java.lang.String str2 = this.apiFramework;
        com.truecaller.ads.vast.JavaScriptResource javaScriptResource = this.javaScriptResource;
        java.lang.String str3 = this.verificationParameters;
        com.truecaller.ads.vast.TrackingEvents trackingEvents = this.trackingEvents;
        java.lang.StringBuilder E = ro0.f.E("Verification(vendor=", str, ", apiFramework=", str2, ", javaScriptResource=");
        E.append(javaScriptResource);
        E.append(", verificationParameters=");
        E.append(str3);
        E.append(", trackingEvents=");
        E.append(trackingEvents);
        E.append(")");
        return E.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.vendor);
        dest.writeString(this.apiFramework);
        com.truecaller.ads.vast.JavaScriptResource javaScriptResource = this.javaScriptResource;
        if (javaScriptResource == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            javaScriptResource.writeToParcel(dest, flags);
        }
        dest.writeString(this.verificationParameters);
        com.truecaller.ads.vast.TrackingEvents trackingEvents = this.trackingEvents;
        if (trackingEvents == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            trackingEvents.writeToParcel(dest, flags);
        }
    }

    public Verification(@hl.qux(isAttribute = true) @org.jetbrains.annotations.Nullable java.lang.String str, @hl.qux(isAttribute = true, localName = "apiFramework") @org.jetbrains.annotations.Nullable java.lang.String str2, @ak.f0("JavaScriptResource") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.JavaScriptResource javaScriptResource, @ak.f0("VerificationParameters") @org.jetbrains.annotations.Nullable java.lang.String str3, @ak.f0("TrackingEvents") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.TrackingEvents trackingEvents) {
        this.vendor = str;
        this.apiFramework = str2;
        this.javaScriptResource = javaScriptResource;
        this.verificationParameters = str3;
        this.trackingEvents = trackingEvents;
    }

    public /* synthetic */ Verification(java.lang.String str, java.lang.String str2, com.truecaller.ads.vast.JavaScriptResource javaScriptResource, java.lang.String str3, com.truecaller.ads.vast.TrackingEvents trackingEvents, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : javaScriptResource, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : trackingEvents);
    }
}
