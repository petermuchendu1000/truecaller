package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/CheckBoxInputItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/InputItemUiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CheckBoxInputItemUiComponent extends com.truecaller.ads.postclickexperience.dto.InputItemUiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.CheckBoxInputItemUiComponent> CREATOR = new k90.bar(0);
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.util.List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckBoxInputItemUiComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list) {
        super(str, str3, str4, str5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "options");
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = list;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent
    /* renamed from: a, reason: from getter */
    public final java.lang.String getF() {
        return this.f;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: b, reason: from getter */
    public final java.lang.String getH() {
        return this.h;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: c, reason: from getter */
    public final java.lang.String getJ() {
        return this.j;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: d, reason: from getter */
    public final java.lang.String getI() {
        return this.i;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.CheckBoxInputItemUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.CheckBoxInputItemUiComponent checkBoxInputItemUiComponent = (com.truecaller.ads.postclickexperience.dto.CheckBoxInputItemUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.f, checkBoxInputItemUiComponent.f) && kotlin.jvm.internal.Intrinsics.b(this.g, checkBoxInputItemUiComponent.g) && kotlin.jvm.internal.Intrinsics.b(this.h, checkBoxInputItemUiComponent.h) && kotlin.jvm.internal.Intrinsics.b(this.i, checkBoxInputItemUiComponent.i) && kotlin.jvm.internal.Intrinsics.b(this.j, checkBoxInputItemUiComponent.j) && kotlin.jvm.internal.Intrinsics.b(this.k, checkBoxInputItemUiComponent.k);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(this.f.hashCode() * 31, 31, this.g), 31, this.h);
        int i = 0;
        java.lang.String str = this.i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        java.lang.String str2 = this.j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.k.hashCode() + ((i2 + i) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("CheckBoxInputItemUiComponent(type=", this.f, ", label=", this.g, ", key=");
        bar.E(E, this.h, ", value=", this.i, ", validationRegex=");
        return z0.a0.d(this.j, ", options=", ")", E, this.k);
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeStringList(this.k);
    }
}
