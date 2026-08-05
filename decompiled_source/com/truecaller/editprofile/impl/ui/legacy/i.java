package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class i {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final java.lang.String i;
    public final java.lang.String j;
    public final java.lang.String k;
    public final java.lang.String l;
    public final java.lang.Long m;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "streetAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "zipCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "company");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "jobTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "website");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "bio");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "birthday");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "gender");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = l;
    }

    public static com.truecaller.editprofile.impl.ui.legacy.i a(com.truecaller.editprofile.impl.ui.legacy.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, int i) {
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String str20;
        java.lang.String str21;
        java.lang.String str22;
        java.lang.String str23;
        if ((i & 1) != 0) {
            str = iVar.a;
        }
        java.lang.String str24 = str;
        if ((i & 2) != 0) {
            str13 = iVar.b;
        } else {
            str13 = str2;
        }
        if ((i & 4) != 0) {
            str14 = iVar.c;
        } else {
            str14 = str3;
        }
        if ((i & 8) != 0) {
            str15 = iVar.d;
        } else {
            str15 = str4;
        }
        if ((i & 16) != 0) {
            str16 = iVar.e;
        } else {
            str16 = str5;
        }
        if ((i & 32) != 0) {
            str17 = iVar.f;
        } else {
            str17 = str6;
        }
        if ((i & 64) != 0) {
            str18 = iVar.g;
        } else {
            str18 = str7;
        }
        if ((i & 128) != 0) {
            str19 = iVar.h;
        } else {
            str19 = str8;
        }
        if ((i & 256) != 0) {
            str20 = iVar.i;
        } else {
            str20 = str9;
        }
        if ((i & 512) != 0) {
            str21 = iVar.j;
        } else {
            str21 = str10;
        }
        if ((i & 1024) != 0) {
            str22 = iVar.k;
        } else {
            str22 = str11;
        }
        if ((i & 2048) != 0) {
            str23 = iVar.l;
        } else {
            str23 = str12;
        }
        java.lang.Long l = iVar.m;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str24, "firstName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "lastName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "email");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "streetAddress");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "zipCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str17, "city");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str18, "company");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str19, "jobTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str20, "website");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str21, "bio");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str22, "birthday");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str23, "gender");
        return new com.truecaller.editprofile.impl.ui.legacy.i(str24, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, l);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.editprofile.impl.ui.legacy.i)) {
            return false;
        }
        com.truecaller.editprofile.impl.ui.legacy.i iVar = (com.truecaller.editprofile.impl.ui.legacy.i) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, iVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, iVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, iVar.c) && kotlin.jvm.internal.Intrinsics.b(this.d, iVar.d) && kotlin.jvm.internal.Intrinsics.b(this.e, iVar.e) && kotlin.jvm.internal.Intrinsics.b(this.f, iVar.f) && kotlin.jvm.internal.Intrinsics.b(this.g, iVar.g) && kotlin.jvm.internal.Intrinsics.b(this.h, iVar.h) && kotlin.jvm.internal.Intrinsics.b(this.i, iVar.i) && kotlin.jvm.internal.Intrinsics.b(this.j, iVar.j) && kotlin.jvm.internal.Intrinsics.b(this.k, iVar.k) && kotlin.jvm.internal.Intrinsics.b(this.l, iVar.l) && kotlin.jvm.internal.Intrinsics.b(this.m, iVar.m);
    }

    public final int hashCode() {
        int hashCode;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        java.lang.Long l = this.m;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return e + hashCode;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder E = ro0.f.E("TempProfile(firstName=", this.a, ", lastName=", this.b, ", email=");
        bar.E(E, this.c, ", streetAddress=", this.d, ", zipCode=");
        bar.E(E, this.e, ", city=", this.f, ", company=");
        bar.E(E, this.g, ", jobTitle=", this.h, ", website=");
        bar.E(E, this.i, ", bio=", this.j, ", birthday=");
        bar.E(E, this.k, ", gender=", this.l, ", tagId=");
        return bar.w(E, this.m, ")");
    }
}
