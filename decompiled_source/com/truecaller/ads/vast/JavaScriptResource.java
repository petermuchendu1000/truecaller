package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/vast/JavaScriptResource;", "Landroid/os/Parcelable;", "apiFramework", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getApiFramework", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class JavaScriptResource implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.vast.JavaScriptResource> CREATOR = new rz0.b0(18);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String apiFramework;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JavaScriptResource() {
        this(r0, r0, 3, r0);
        java.lang.String str = null;
    }

    public static /* synthetic */ com.truecaller.ads.vast.JavaScriptResource copy$default(com.truecaller.ads.vast.JavaScriptResource javaScriptResource, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = javaScriptResource.apiFramework;
        }
        if ((i & 2) != 0) {
            str2 = javaScriptResource.value;
        }
        return javaScriptResource.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getApiFramework() {
        return this.apiFramework;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.JavaScriptResource copy(@hl.qux(isAttribute = true, localName = "apiFramework") @org.jetbrains.annotations.Nullable java.lang.String apiFramework, @ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String value) {
        return new com.truecaller.ads.vast.JavaScriptResource(apiFramework, value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.JavaScriptResource)) {
            return false;
        }
        com.truecaller.ads.vast.JavaScriptResource javaScriptResource = (com.truecaller.ads.vast.JavaScriptResource) other;
        return kotlin.jvm.internal.Intrinsics.b(this.apiFramework, javaScriptResource.apiFramework) && kotlin.jvm.internal.Intrinsics.b(this.value, javaScriptResource.value);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getApiFramework() {
        return this.apiFramework;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        java.lang.String str = this.apiFramework;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.value;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("JavaScriptResource(apiFramework=", this.apiFramework, ", value=", this.value, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.apiFramework);
        dest.writeString(this.value);
    }

    public JavaScriptResource(@hl.qux(isAttribute = true, localName = "apiFramework") @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.apiFramework = str;
        this.value = str2;
    }

    public /* synthetic */ JavaScriptResource(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
