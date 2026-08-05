package com.truecaller.ads.postclickexperience.dto;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/HtmlPageUiComponent;", "Lcom/truecaller/ads/postclickexperience/dto/UiComponent;", "Landroid/os/Parcelable;", "OnClick", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class HtmlPageUiComponent extends com.truecaller.ads.postclickexperience.dto.UiComponent implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent> CREATOR = new java.lang.Object();
    public final java.lang.String b;
    public final java.lang.String c;
    public final com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick d;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/ads/postclickexperience/dto/HtmlPageUiComponent$OnClick;", "Landroid/os/Parcelable;", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class OnClick implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick> CREATOR = new java.lang.Object();
        public final java.lang.String a;

        public OnClick(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "url");
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("OnClick(url=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlPageUiComponent(java.lang.String str, java.lang.String str2, com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent.OnClick onClick) {
        super(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "html");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.b = str;
        this.c = str2;
        this.d = onClick;
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
        if (!(obj instanceof com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent)) {
            return false;
        }
        com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent htmlPageUiComponent = (com.truecaller.ads.postclickexperience.dto.HtmlPageUiComponent) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.b, htmlPageUiComponent.b) && kotlin.jvm.internal.Intrinsics.b(this.c, htmlPageUiComponent.c) && kotlin.jvm.internal.Intrinsics.b(this.d, htmlPageUiComponent.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ax1.bar.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("HtmlPageUiComponent(type=", this.b, ", html=", this.c, ", onClick=");
        E.append(this.d);
        E.append(")");
        return E.toString();
    }

    @Override // com.truecaller.ads.postclickexperience.dto.UiComponent, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
    }
}
