package com.truecaller.referrals.domain.entity;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/referrals/domain/entity/ReferralContactImpl;", "Landroid/os/Parcelable;", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ReferralContactImpl implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.referrals.domain.entity.ReferralContactImpl> CREATOR = new rz0.b0(8);
    public final java.lang.String a;
    public final com.truecaller.referrals.domain.entity.NumberImpl b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;
    public final java.lang.Long f;
    public final java.util.ArrayList g;
    public final int h;
    public final java.lang.Long i;
    public final java.lang.String j;

    public ReferralContactImpl(java.lang.String str, com.truecaller.referrals.domain.entity.NumberImpl numberImpl, java.lang.String str2, boolean z, boolean z2, java.lang.Long l, java.util.ArrayList arrayList, int i, java.lang.Long l2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "displayNameOrNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "numbers");
        this.a = str;
        this.b = numberImpl;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = l;
        this.g = arrayList;
        this.h = i;
        this.i = l2;
        this.j = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        com.truecaller.referrals.domain.entity.NumberImpl numberImpl = this.b;
        if (numberImpl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            numberImpl.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        java.lang.Long l = this.f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        java.util.ArrayList arrayList = this.g;
        parcel.writeInt(arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.truecaller.referrals.domain.entity.NumberImpl) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.h);
        java.lang.Long l2 = this.i;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.j);
    }
}
