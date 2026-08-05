package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/AutoCompleteTextInputItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/TextInputItemUiComponent;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AutoCompleteTextInputItemUiComponent extends com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.AutoCompleteTextInputItemUiComponent> CREATOR = new hn.bar(27);
    public final java.lang.String k;
    public final java.lang.String l;
    public final java.lang.String m;
    public final java.lang.String n;
    public final java.lang.String o;
    public java.util.List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCompleteTextInputItemUiComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list) {
        super(str, str2, str3, str4, str5);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "options");
        this.k = str;
        this.l = str2;
        this.m = str3;
        this.n = str4;
        this.o = str5;
        this.p = list;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent
    /* renamed from: a, reason: from getter */
    public final java.lang.String getK() {
        return this.k;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: b, reason: from getter */
    public final java.lang.String getM() {
        return this.m;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: c, reason: from getter */
    public final java.lang.String getO() {
        return this.o;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent
    /* renamed from: d, reason: from getter */
    public final java.lang.String getN() {
        return this.n;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent
    /* renamed from: e, reason: from getter */
    public final java.lang.String getL() {
        return this.l;
    }

    @Override // com.truecaller.ads.postclickexperience.dto.TextInputItemUiComponent, com.truecaller.ads.postclickexperience.dto.InputItemUiComponent, com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeStringList(this.p);
    }
}
