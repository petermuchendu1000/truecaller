package com.truecaller.blocking.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/truecaller/blocking/ui/BlockResult;", "Landroid/os/Parcelable;", "BlockedData", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BlockResult implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockResult> CREATOR = new java.lang.Object();
    public final java.lang.String a;
    public final int b;
    public final java.util.List c;
    public final java.lang.String d;
    public final boolean e;
    public final boolean f;
    public final java.lang.Long g;
    public final java.lang.String h;
    public final boolean i;
    public final boolean j;
    public final java.lang.String k;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/blocking/ui/BlockResult$BlockedData;", "Landroid/os/Parcelable;", "blocking-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class BlockedData implements android.os.Parcelable {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.blocking.ui.BlockResult.BlockedData> CREATOR = new java.lang.Object();
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;

        public BlockedData(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.blocking.ui.BlockResult.BlockedData)) {
                return false;
            }
            com.truecaller.blocking.ui.BlockResult.BlockedData blockedData = (com.truecaller.blocking.ui.BlockResult.BlockedData) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, blockedData.a) && kotlin.jvm.internal.Intrinsics.b(this.b, blockedData.b) && kotlin.jvm.internal.Intrinsics.b(this.c, blockedData.c);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.v(this.c, ")", ro0.f.E("BlockedData(name=", this.a, ", number=", this.b, ", type="));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    public BlockResult(java.lang.String str, int i, java.util.List list, java.lang.String str2, boolean z, boolean z2, java.lang.Long l, java.lang.String str3, boolean z3, boolean z4, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "blockedData");
        this.a = str;
        this.b = i;
        this.c = list;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = l;
        this.h = str3;
        this.i = z3;
        this.j = z4;
        this.k = str4;
    }

    public static com.truecaller.blocking.ui.BlockResult a(com.truecaller.blocking.ui.BlockResult blockResult, java.lang.String str, int i, java.util.List list, java.lang.String str2, boolean z, boolean z2, java.lang.Long l, java.lang.String str3, int i2) {
        java.lang.String str4;
        int i3;
        java.util.List list2;
        java.lang.String str5;
        boolean z3;
        boolean z4;
        java.lang.Long l2;
        java.lang.String str6;
        if ((i2 & 1) != 0) {
            str4 = blockResult.a;
        } else {
            str4 = str;
        }
        if ((i2 & 2) != 0) {
            i3 = blockResult.b;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            list2 = blockResult.c;
        } else {
            list2 = list;
        }
        if ((i2 & 8) != 0) {
            str5 = blockResult.d;
        } else {
            str5 = str2;
        }
        if ((i2 & 16) != 0) {
            z3 = blockResult.e;
        } else {
            z3 = z;
        }
        if ((i2 & 32) != 0) {
            z4 = blockResult.f;
        } else {
            z4 = z2;
        }
        if ((i2 & 64) != 0) {
            l2 = blockResult.g;
        } else {
            l2 = l;
        }
        if ((i2 & 128) != 0) {
            str6 = blockResult.h;
        } else {
            str6 = str3;
        }
        boolean z5 = blockResult.i;
        boolean z6 = blockResult.j;
        java.lang.String str7 = blockResult.k;
        blockResult.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "blockedData");
        return new com.truecaller.blocking.ui.BlockResult(str4, i3, list2, str5, z3, z4, l2, str6, z5, z6, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blocking.ui.BlockResult)) {
            return false;
        }
        com.truecaller.blocking.ui.BlockResult blockResult = (com.truecaller.blocking.ui.BlockResult) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, blockResult.a) && this.b == blockResult.b && kotlin.jvm.internal.Intrinsics.b(this.c, blockResult.c) && kotlin.jvm.internal.Intrinsics.b(this.d, blockResult.d) && this.e == blockResult.e && this.f == blockResult.f && kotlin.jvm.internal.Intrinsics.b(this.g, blockResult.g) && kotlin.jvm.internal.Intrinsics.b(this.h, blockResult.h) && this.i == blockResult.i && this.j == blockResult.j && kotlin.jvm.internal.Intrinsics.b(this.k, blockResult.k);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int i2;
        int hashCode3;
        int hashCode4;
        int i3;
        int i4 = 0;
        java.lang.String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int g = uf.qux.g(((hashCode * 31) + this.b) * 31, 31, this.c);
        java.lang.String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (g + hashCode2) * 31;
        int i6 = 1237;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = (i5 + i) * 31;
        if (this.f) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i8 = (i7 + i2) * 31;
        java.lang.Long l = this.g;
        if (l == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l.hashCode();
        }
        int i9 = (i8 + hashCode3) * 31;
        java.lang.String str3 = this.h;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i11 = (i9 + hashCode4) * 31;
        if (this.i) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i12 = (i11 + i3) * 31;
        if (this.j) {
            i6 = 1231;
        }
        int i13 = (i12 + i6) * 31;
        java.lang.String str4 = this.k;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i13 + i4;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder z = bar.z("BlockResult(name=", this.b, this.a, ", blockedCount=", ", blockedData=");
        os0.bar.B(", comment=", this.d, ", hasComment=", z, this.c);
        nc0.k1.p(z, this.e, ", isBusiness=", this.f, ", categoryId=");
        z.append(this.g);
        z.append(", categoryName=");
        z.append(this.h);
        z.append(", consentGiven=");
        nc0.k1.p(z, this.i, ", isFraudSender=", this.j, ", actionInfo=");
        return bar.v(this.k, ")", z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        java.util.Iterator f = z0.a0.f(this.c, parcel);
        while (f.hasNext()) {
            ((com.truecaller.blocking.ui.BlockResult.BlockedData) f.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        java.lang.Long l = this.g;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k);
    }

    public BlockResult(java.lang.String str, int i, java.util.List list, java.lang.String str2, boolean z, boolean z2, java.lang.Long l, java.lang.String str3, boolean z3, boolean z4, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? kotlin.collections.h0.a : list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? null : l, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (java.lang.String) null);
    }
}
