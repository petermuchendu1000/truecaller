package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/NativeVideoUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NativeVideoUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.NativeVideoUiComponent> CREATOR = new k90.bar(4);
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.Integer h;
    public final boolean i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeVideoUiComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, boolean z, int i) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "landingPageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "cta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "url");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = num;
        this.i = z;
        this.j = i;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent
    /* renamed from: a, reason: from getter */
    public final java.lang.String getB() {
        return this.b;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.NativeVideoUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.NativeVideoUiComponent nativeVideoUiComponent = (com.truecaller.ads.postclickexperience.dto.NativeVideoUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, nativeVideoUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, nativeVideoUiComponent.c) && kotlin.jvm.internal.Intrinsics.b(this.d, nativeVideoUiComponent.d) && kotlin.jvm.internal.Intrinsics.b(this.e, nativeVideoUiComponent.e) && kotlin.jvm.internal.Intrinsics.b(this.f, nativeVideoUiComponent.f) && kotlin.jvm.internal.Intrinsics.b(this.g, nativeVideoUiComponent.g) && kotlin.jvm.internal.Intrinsics.b(this.h, nativeVideoUiComponent.h) && this.i == nativeVideoUiComponent.i && this.j == nativeVideoUiComponent.j;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
        int i2 = 0;
        java.lang.String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (e + hashCode) * 31;
        java.lang.String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        java.lang.Integer num = this.h;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((i5 + i) * 31) + this.j;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("NativeVideoUiComponent(type=", this.b, ", landingPageUrl=", this.c, ", cta=");
        bar.E(E, this.d, ", url=", this.e, ", topBanner=");
        bar.E(E, this.f, ", bottomBanner=", this.g, ", resizeMode=");
        E.append(this.h);
        E.append(", clickToRedirect=");
        E.append(this.i);
        E.append(", closeDelay=");
        return bar.m(this.j, ")", E);
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        java.lang.Integer num = this.h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j);
    }
}
