package com.truecaller.premium.data;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/data/WebPurchaseStateItem;", "Landroid/os/Parcelable;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "code", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class WebPurchaseStateItem implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.premium.data.WebPurchaseStateItem> CREATOR = new rz0.b0(16);

    /* renamed from: a, reason: from kotlin metadata */
    @bw.qux("state")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    /* renamed from: b, reason: from kotlin metadata */
    @bw.qux("code")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String code;

    public WebPurchaseStateItem(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "code");
        this.name = str;
        this.code = str2;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.premium.data.WebPurchaseStateItem)) {
            return false;
        }
        com.truecaller.premium.data.WebPurchaseStateItem webPurchaseStateItem = (com.truecaller.premium.data.WebPurchaseStateItem) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.name, webPurchaseStateItem.name) && kotlin.jvm.internal.Intrinsics.b(this.code, webPurchaseStateItem.code);
    }

    public final int hashCode() {
        return this.code.hashCode() + (this.name.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return y.o.e("WebPurchaseStateItem(name=", this.name, ", code=", this.code, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.name);
        parcel.writeString(this.code);
    }
}
