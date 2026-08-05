package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/ButtonItemUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "OnClick", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ButtonItemUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent> CREATOR = new java.lang.Object();
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick d;
    public final java.lang.String e;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/ButtonItemUiComponent$OnClick;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class OnClick implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;

        public OnClick(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "action");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "url");
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick)) {
                return false;
            }
            com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick onClick = (com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, onClick.a) && kotlin.jvm.internal.Intrinsics.b(this.b, onClick.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final java.lang.String toString() {
            return y.o.e("OnClick(action=", this.a, ", url=", this.b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonItemUiComponent(java.lang.String str, java.lang.String str2, com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent.OnClick onClick, java.lang.String str3) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.b = str;
        this.c = str2;
        this.d = onClick;
        this.e = str3;
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
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent buttonItemUiComponent = (com.truecaller.ads.postclickexperience.dto.ButtonItemUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, buttonItemUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, buttonItemUiComponent.c) && kotlin.jvm.internal.Intrinsics.b(this.d, buttonItemUiComponent.d) && kotlin.jvm.internal.Intrinsics.b(this.e, buttonItemUiComponent.e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.hashCode() + ax1.bar.e(this.b.hashCode() * 31, 31, this.c)) * 31;
        java.lang.String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("ButtonItemUiComponent(type=", this.b, ", text=", this.c, ", onClick=");
        E.append(this.d);
        E.append(", bgColor=");
        E.append(this.e);
        E.append(")");
        return E.toString();
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
    }
}
