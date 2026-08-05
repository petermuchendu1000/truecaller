package com.truecaller.common.ui.avatar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/common/ui/avatar/AvatarXConfig;", "Landroid/os/Parcelable;", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class AvatarXConfig implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.common.ui.avatar.AvatarXConfig> CREATOR = new rz0.b0(14);
    public final java.lang.String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy F;
    public final android.net.Uri a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final java.lang.Integer o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public AvatarXConfig(android.net.Uri uri, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, java.lang.Integer num, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, java.lang.String str4, boolean z22, boolean z23, boolean z24, boolean z25, com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy manualBlockAvatarPolicy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualBlockAvatarPolicy, "manualBlockAvatarPolicy");
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z10;
        this.o = num;
        this.p = z11;
        this.q = z12;
        this.r = z13;
        this.s = z14;
        this.t = z15;
        this.u = z16;
        this.v = z17;
        this.w = z18;
        this.x = z19;
        this.y = z20;
        this.z = z21;
        this.A = str4;
        this.B = z22;
        this.C = z23;
        this.D = z24;
        this.E = z25;
        this.F = manualBlockAvatarPolicy;
    }

    public static com.truecaller.common.ui.avatar.AvatarXConfig a(com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, android.net.Uri uri, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Integer num, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, java.lang.String str2, boolean z10, boolean z11, int i) {
        android.net.Uri uri2 = (i & 1) != 0 ? avatarXConfig.a : uri;
        java.lang.String str3 = (i & 2) != 0 ? avatarXConfig.b : str;
        java.lang.String str4 = avatarXConfig.c;
        java.lang.String str5 = avatarXConfig.d;
        boolean z12 = (i & 16) != 0 ? avatarXConfig.e : z;
        boolean z13 = avatarXConfig.f;
        boolean z14 = avatarXConfig.g;
        boolean z15 = avatarXConfig.h;
        boolean z16 = (i & 256) != 0 ? avatarXConfig.i : z2;
        boolean z17 = (i & 512) != 0 ? avatarXConfig.j : z3;
        boolean z18 = (i & 1024) != 0 ? avatarXConfig.k : false;
        boolean z19 = (i & 2048) != 0 ? avatarXConfig.l : z4;
        boolean z20 = avatarXConfig.m;
        boolean z21 = avatarXConfig.n;
        java.lang.Integer num2 = (i & 16384) != 0 ? avatarXConfig.o : num;
        boolean z22 = (32768 & i) != 0 ? avatarXConfig.p : z5;
        boolean z23 = avatarXConfig.q;
        boolean z24 = avatarXConfig.r;
        boolean z25 = (i & com.ctc.wstx.cfg.InputConfigFlags.CFG_LAZY_PARSING) != 0 ? avatarXConfig.s : z6;
        boolean z26 = (i & 524288) != 0 ? avatarXConfig.t : z7;
        boolean z27 = (i & 1048576) != 0 ? avatarXConfig.u : false;
        boolean z28 = (i & com.ctc.wstx.cfg.InputConfigFlags.CFG_XMLID_TYPING) != 0 ? avatarXConfig.v : false;
        boolean z29 = (i & com.ctc.wstx.cfg.InputConfigFlags.CFG_XMLID_UNIQ_CHECKS) != 0 ? avatarXConfig.w : true;
        boolean z30 = avatarXConfig.x;
        boolean z32 = (i & com.ctc.wstx.cfg.InputConfigFlags.CFG_ALLOW_XML11_ESCAPED_CHARS_IN_XML10) != 0 ? avatarXConfig.y : z8;
        boolean z33 = (i & com.ctc.wstx.cfg.InputConfigFlags.CFG_JAXP_FEATURE_SECURE_PROCESSING) != 0 ? avatarXConfig.z : z9;
        java.lang.String str6 = (i & 67108864) != 0 ? avatarXConfig.A : str2;
        boolean z34 = (i & 134217728) != 0 ? avatarXConfig.B : z10;
        boolean z35 = avatarXConfig.C;
        boolean z36 = avatarXConfig.D;
        boolean z37 = (i & 1073741824) != 0 ? avatarXConfig.E : z11;
        com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy manualBlockAvatarPolicy = (i & Integer.MIN_VALUE) != 0 ? avatarXConfig.F : com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.ProfilePictureManualBlockAvatarPolicy.a;
        avatarXConfig.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manualBlockAvatarPolicy, "manualBlockAvatarPolicy");
        return new com.truecaller.common.ui.avatar.AvatarXConfig(uri2, str3, str4, str5, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, num2, z22, z23, z24, z25, z26, z27, z28, z29, z30, z32, z33, str6, z34, z35, z36, z37, manualBlockAvatarPolicy);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.common.ui.avatar.AvatarXConfig)) {
            return false;
        }
        com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = (com.truecaller.common.ui.avatar.AvatarXConfig) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, avatarXConfig.a) && kotlin.jvm.internal.Intrinsics.b(this.b, avatarXConfig.b) && kotlin.jvm.internal.Intrinsics.b(this.c, avatarXConfig.c) && kotlin.jvm.internal.Intrinsics.b(this.d, avatarXConfig.d) && this.e == avatarXConfig.e && this.f == avatarXConfig.f && this.g == avatarXConfig.g && this.h == avatarXConfig.h && this.i == avatarXConfig.i && this.j == avatarXConfig.j && this.k == avatarXConfig.k && this.l == avatarXConfig.l && this.m == avatarXConfig.m && this.n == avatarXConfig.n && kotlin.jvm.internal.Intrinsics.b(this.o, avatarXConfig.o) && this.p == avatarXConfig.p && this.q == avatarXConfig.q && this.r == avatarXConfig.r && this.s == avatarXConfig.s && this.t == avatarXConfig.t && this.u == avatarXConfig.u && this.v == avatarXConfig.v && this.w == avatarXConfig.w && this.x == avatarXConfig.x && this.y == avatarXConfig.y && this.z == avatarXConfig.z && kotlin.jvm.internal.Intrinsics.b(this.A, avatarXConfig.A) && this.B == avatarXConfig.B && this.C == avatarXConfig.C && this.D == avatarXConfig.D && this.E == avatarXConfig.E && kotlin.jvm.internal.Intrinsics.b(this.F, avatarXConfig.F);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int hashCode5;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = 0;
        android.net.Uri uri = this.a;
        if (uri == null) {
            hashCode = 0;
        } else {
            hashCode = uri.hashCode();
        }
        int i27 = hashCode * 31;
        java.lang.String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i28 = (i27 + hashCode2) * 31;
        java.lang.String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i29 = (i28 + hashCode3) * 31;
        java.lang.String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i30 = (i29 + hashCode4) * 31;
        int i32 = 1237;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i33 = (i30 + i) * 31;
        if (this.f) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i34 = (i33 + i2) * 31;
        if (this.g) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i35 = (i34 + i3) * 31;
        if (this.h) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i36 = (i35 + i4) * 31;
        if (this.i) {
            i5 = 1231;
        } else {
            i5 = 1237;
        }
        int i37 = (i36 + i5) * 31;
        if (this.j) {
            i6 = 1231;
        } else {
            i6 = 1237;
        }
        int i38 = (i37 + i6) * 31;
        if (this.k) {
            i7 = 1231;
        } else {
            i7 = 1237;
        }
        int i39 = (i38 + i7) * 31;
        if (this.l) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i40 = (i39 + i8) * 31;
        if (this.m) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i42 = (i40 + i9) * 31;
        if (this.n) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i43 = (i42 + i10) * 31;
        java.lang.Integer num = this.o;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i44 = (i43 + hashCode5) * 31;
        if (this.p) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i45 = (i44 + i11) * 31;
        if (this.q) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i46 = (i45 + i12) * 31;
        if (this.r) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int i47 = (i46 + i13) * 31;
        if (this.s) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i48 = (i47 + i14) * 31;
        if (this.t) {
            i15 = 1231;
        } else {
            i15 = 1237;
        }
        int i49 = (i48 + i15) * 31;
        if (this.u) {
            i16 = 1231;
        } else {
            i16 = 1237;
        }
        int i50 = (i49 + i16) * 31;
        if (this.v) {
            i17 = 1231;
        } else {
            i17 = 1237;
        }
        int i52 = (i50 + i17) * 31;
        if (this.w) {
            i18 = 1231;
        } else {
            i18 = 1237;
        }
        int i53 = (i52 + i18) * 31;
        if (this.x) {
            i19 = 1231;
        } else {
            i19 = 1237;
        }
        int i54 = (i53 + i19) * 31;
        if (this.y) {
            i20 = 1231;
        } else {
            i20 = 1237;
        }
        int i55 = (i54 + i20) * 31;
        if (this.z) {
            i22 = 1231;
        } else {
            i22 = 1237;
        }
        int i56 = (i55 + i22) * 31;
        java.lang.String str4 = this.A;
        if (str4 != null) {
            i26 = str4.hashCode();
        }
        int i57 = (i56 + i26) * 31;
        if (this.B) {
            i23 = 1231;
        } else {
            i23 = 1237;
        }
        int i58 = (i57 + i23) * 31;
        if (this.C) {
            i24 = 1231;
        } else {
            i24 = 1237;
        }
        int i59 = (i58 + i24) * 31;
        if (this.D) {
            i25 = 1231;
        } else {
            i25 = 1237;
        }
        int i60 = (i59 + i25) * 31;
        if (this.E) {
            i32 = 1231;
        }
        return this.F.hashCode() + ((i60 + i32) * 31);
    }

    public final java.lang.String toString() {
        com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy manualBlockAvatarPolicy = this.F;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AvatarXConfig(photoUri=");
        sb.append(this.a);
        sb.append(", normalizedAddress=");
        sb.append(this.b);
        sb.append(", groupId=");
        bar.E(sb, this.c, ", letter=", this.d, ", isSpam=");
        nc0.k1.p(sb, this.e, ", isGroup=", this.f, ", isAlphanumeric=");
        nc0.k1.p(sb, this.g, ", showTruecallerBadge=", this.h, ", isPremium=");
        nc0.k1.p(sb, this.i, ", isGold=", this.j, ", isVerifiedBusiness=");
        nc0.k1.p(sb, this.k, ", isPriority=", this.l, ", isGovtService=");
        nc0.k1.p(sb, this.m, ", displayAvatarEvenIfSpammerOrBlocked=", this.n, ", avatarBorderColor=");
        sb.append(this.o);
        sb.append(", isBlocked=");
        sb.append(this.p);
        sb.append(", isHidden=");
        nc0.k1.p(sb, this.q, ", showProgress=", this.r, ", showAddPhoto=");
        nc0.k1.p(sb, this.s, ", showEditPhoto=", this.t, ", showBadge=");
        nc0.k1.p(sb, this.u, ", showBadgeRing=", this.v, ", noBackground=");
        nc0.k1.p(sb, this.w, ", isFraud=", this.x, ", isSmallBusinessEnabled=");
        nc0.k1.p(sb, this.y, ", showWarning=", this.z, ", countryFlag=");
        com.google.android.gms.internal.ads.yj.l(this.A, ", isSoftThrottled=", ", isConvictedFraud=", sb, this.B);
        nc0.k1.p(sb, this.C, ", forceBlockIcon=", this.D, ", isManuallyBlocked=");
        sb.append(this.E);
        sb.append(", manualBlockAvatarPolicy=");
        sb.append(manualBlockAvatarPolicy);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        java.lang.Integer num = this.o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            z0.a0.j(parcel, 1, num);
        }
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeString(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C ? 1 : 0);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeInt(this.E ? 1 : 0);
        parcel.writeParcelable(this.F, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AvatarXConfig(android.net.Uri uri, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, java.lang.Integer num, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, java.lang.String str3, boolean z15, boolean z16, int i) {
        this(r4, r5, null, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, false, r0);
        com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy manualBlockAvatarPolicy;
        android.net.Uri uri2 = (i & 1) != 0 ? null : uri;
        java.lang.String str4 = (i & 2) != 0 ? null : str;
        java.lang.String str5 = (i & 8) != 0 ? null : str2;
        boolean z17 = (i & 16) != 0 ? false : z;
        boolean z18 = (i & 32) != 0 ? false : z2;
        boolean z19 = (i & 64) != 0 ? false : z3;
        boolean z20 = (i & com.ctc.wstx.cfg.OutputConfigFlags.CFG_AUTOMATIC_END_ELEMENTS) != 0 ? false : z4;
        boolean z21 = (i & 256) != 0 ? false : z5;
        boolean z22 = (i & 512) != 0 ? false : z6;
        boolean z23 = (i & 1024) != 0 ? false : z7;
        boolean z24 = (i & 2048) != 0 ? false : z8;
        boolean z25 = (i & 4096) != 0 ? false : z9;
        boolean z26 = (i & 8192) == 0;
        java.lang.Integer num2 = (i & 16384) != 0 ? null : num;
        boolean z27 = (32768 & i) != 0 ? false : z10;
        boolean z28 = (65536 & i) == 0;
        boolean z29 = (131072 & i) != 0 ? false : z11;
        boolean z30 = (262144 & i) == 0;
        boolean z32 = (524288 & i) == 0;
        boolean z33 = (1048576 & i) != 0;
        boolean z34 = (2097152 & i) != 0;
        boolean z35 = (4194304 & i) == 0;
        boolean z36 = (8388608 & i) != 0 ? false : z12;
        boolean z37 = (16777216 & i) != 0 ? false : z13;
        boolean z38 = (33554432 & i) != 0 ? false : z14;
        java.lang.String str6 = (67108864 & i) != 0 ? null : str3;
        boolean z39 = (134217728 & i) != 0 ? false : z15;
        boolean z40 = (268435456 & i) != 0 ? false : z16;
        boolean z42 = (536870912 & i) == 0;
        if ((i & Integer.MIN_VALUE) != 0) {
            manualBlockAvatarPolicy = com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.BlockIconManualBlockAvatarPolicy.a;
        } else {
            manualBlockAvatarPolicy = com.truecaller.common.ui.avatar.ManualBlockAvatarPolicy.ProfilePictureManualBlockAvatarPolicy.a;
        }
    }

    public AvatarXConfig(java.lang.String str, java.lang.String str2) {
        this(str != null ? android.net.Uri.parse(str) : null, null, str2, false, false, false, false, false, false, false, false, false, null, false, false, false, false, false, null, false, false, -10);
    }
}
