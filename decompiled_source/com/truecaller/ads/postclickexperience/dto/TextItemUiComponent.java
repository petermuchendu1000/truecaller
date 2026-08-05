package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/TextItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TextItemUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.TextItemUiComponent> CREATOR = new k90.bar(8);
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextItemUiComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
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
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.TextItemUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.TextItemUiComponent textItemUiComponent = (com.truecaller.ads.postclickexperience.dto.TextItemUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, textItemUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, textItemUiComponent.c) && kotlin.jvm.internal.Intrinsics.b(this.d, textItemUiComponent.d) && kotlin.jvm.internal.Intrinsics.b(this.e, textItemUiComponent.e);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.b.hashCode() * 31, 31, this.c);
        int i = 0;
        java.lang.String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final java.lang.String toString() {
        return bar.x(ro0.f.E("TextItemUiComponent(type=", this.b, ", text=", this.c, ", textColor="), this.d, ", bgColor=", this.e, ")");
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
