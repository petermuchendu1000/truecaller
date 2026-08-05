package com.truecaller.premium.data;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/premium/data/SubscriptionPromoEventMetaData;", "Landroid/os/Parcelable;", "premium-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SubscriptionPromoEventMetaData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.premium.data.SubscriptionPromoEventMetaData> CREATOR = new rz0.b0(15);
    public final java.lang.String a;
    public final java.lang.String b;

    public SubscriptionPromoEventMetaData(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "correlation");
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
        if (!(obj instanceof com.truecaller.premium.data.SubscriptionPromoEventMetaData)) {
            return false;
        }
        com.truecaller.premium.data.SubscriptionPromoEventMetaData subscriptionPromoEventMetaData = (com.truecaller.premium.data.SubscriptionPromoEventMetaData) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, subscriptionPromoEventMetaData.a) && kotlin.jvm.internal.Intrinsics.b(this.b, subscriptionPromoEventMetaData.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final java.lang.String toString() {
        return y.o.e("SubscriptionPromoEventMetaData(campaignId=", this.a, ", correlation=", this.b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public /* synthetic */ SubscriptionPromoEventMetaData(java.lang.String str) {
        this(str, t.c.p("toString(...)"));
    }
}
