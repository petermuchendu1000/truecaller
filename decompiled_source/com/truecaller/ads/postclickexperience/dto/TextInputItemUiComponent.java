package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/TextInputItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/InputItemUiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TextInputItemUiComponent extends com.truecaller.ads.postclickexperience.dto.InputItemUiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent> CREATOR = new k90.bar(7);
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputItemUiComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        super(str, str3, str4, str5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "key");
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent
    /* renamed from: a, reason: from getter */
    public java.lang.String getF() {
        return this.f;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: b, reason: from getter */
    public java.lang.String getH() {
        return this.h;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: c, reason: from getter */
    public java.lang.String getJ() {
        return this.j;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: d, reason: from getter */
    public java.lang.String getI() {
        return this.i;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public java.lang.String getG() {
        return this.g;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
    }
}
