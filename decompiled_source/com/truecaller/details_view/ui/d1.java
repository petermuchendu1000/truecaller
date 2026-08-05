package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d1 {
    public final com.truecaller.data.entity.Contact a;
    public final ne0.baz b;
    public final xb1.baz c;
    public final java.util.List d;
    public final com.truecaller.data.entity.HistoryEvent e;
    public final java.util.List f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final com.truecaller.details_view.ui.c1 l;
    public final java.lang.Long m;
    public final com.truecaller.blocking.FilterMatch n;
    public final dj0.n o;
    public final com.truecaller.details_view.analytics.SourceType p;

    public d1(com.truecaller.data.entity.Contact contact, ne0.baz bazVar, xb1.baz bazVar2, java.util.List list, com.truecaller.data.entity.HistoryEvent historyEvent, java.util.List list2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, com.truecaller.details_view.ui.c1 c1Var, java.lang.Long l, com.truecaller.blocking.FilterMatch filterMatch, dj0.n nVar, com.truecaller.details_view.analytics.SourceType sourceType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "contactType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "appearance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "externalAppActions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "numbers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "badgeCounts");
        this.a = contact;
        this.b = bazVar;
        this.c = bazVar2;
        this.d = list;
        this.e = historyEvent;
        this.f = list2;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = c1Var;
        this.m = l;
        this.n = filterMatch;
        this.o = nVar;
        this.p = sourceType;
    }

    public static com.truecaller.details_view.ui.d1 a(com.truecaller.details_view.ui.d1 d1Var, com.truecaller.details_view.analytics.SourceType sourceType) {
        com.truecaller.data.entity.Contact contact = d1Var.a;
        ne0.baz bazVar = d1Var.b;
        xb1.baz bazVar2 = d1Var.c;
        java.util.List list = d1Var.d;
        com.truecaller.data.entity.HistoryEvent historyEvent = d1Var.e;
        java.util.List list2 = d1Var.f;
        boolean z = d1Var.g;
        boolean z2 = d1Var.h;
        boolean z3 = d1Var.i;
        boolean z4 = d1Var.j;
        boolean z5 = d1Var.k;
        com.truecaller.details_view.ui.c1 c1Var = d1Var.l;
        java.lang.Long l = d1Var.m;
        com.truecaller.blocking.FilterMatch filterMatch = d1Var.n;
        dj0.n nVar = d1Var.o;
        d1Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "contactType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar2, "appearance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "externalAppActions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "numbers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c1Var, "badgeCounts");
        return new com.truecaller.details_view.ui.d1(contact, bazVar, bazVar2, list, historyEvent, list2, z, z2, z3, z4, z5, c1Var, l, filterMatch, nVar, sourceType);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.details_view.ui.d1)) {
            return false;
        }
        com.truecaller.details_view.ui.d1 d1Var = (com.truecaller.details_view.ui.d1) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, d1Var.a) && kotlin.jvm.internal.Intrinsics.b(this.b, d1Var.b) && kotlin.jvm.internal.Intrinsics.b(this.c, d1Var.c) && kotlin.jvm.internal.Intrinsics.b(this.d, d1Var.d) && kotlin.jvm.internal.Intrinsics.b(this.e, d1Var.e) && kotlin.jvm.internal.Intrinsics.b(this.f, d1Var.f) && this.g == d1Var.g && this.h == d1Var.h && this.i == d1Var.i && this.j == d1Var.j && this.k == d1Var.k && kotlin.jvm.internal.Intrinsics.b(this.l, d1Var.l) && kotlin.jvm.internal.Intrinsics.b(this.m, d1Var.m) && kotlin.jvm.internal.Intrinsics.b(this.n, d1Var.n) && kotlin.jvm.internal.Intrinsics.b(this.o, d1Var.o) && this.p == d1Var.p;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int i2;
        int i3;
        int i4;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int g = uf.qux.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        int i5 = 0;
        com.truecaller.data.entity.HistoryEvent historyEvent = this.e;
        if (historyEvent == null) {
            hashCode = 0;
        } else {
            hashCode = historyEvent.hashCode();
        }
        int g2 = uf.qux.g((g + hashCode) * 31, 31, this.f);
        int i6 = 1237;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i7 = (g2 + i) * 31;
        if (this.h) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i8 = (i7 + i2) * 31;
        if (this.i) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i9 = (i8 + i3) * 31;
        if (this.j) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (i9 + i4) * 31;
        if (this.k) {
            i6 = 1231;
        }
        int i11 = (((i10 + i6) * 31) + this.l.a) * 31;
        java.lang.Long l = this.m;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i13 = (i11 + hashCode2) * 31;
        com.truecaller.blocking.FilterMatch filterMatch = this.n;
        if (filterMatch == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = filterMatch.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        dj0.n nVar = this.o;
        if (nVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = nVar.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        com.truecaller.details_view.analytics.SourceType sourceType = this.p;
        if (sourceType != null) {
            i5 = sourceType.hashCode();
        }
        return i15 + i5;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DetailsViewModelLegacy(contact=");
        sb.append(this.a);
        sb.append(", contactType=");
        sb.append(this.b);
        sb.append(", appearance=");
        sb.append(this.c);
        sb.append(", externalAppActions=");
        sb.append(this.d);
        sb.append(", lastOutgoingCall=");
        sb.append(this.e);
        sb.append(", numbers=");
        sb.append(this.f);
        sb.append(", isContactRequestAvailable=");
        nc0.k1.p(sb, this.g, ", isInitialLoading=", this.h, ", forceRefreshed=");
        nc0.k1.p(sb, this.i, ", isWhitelisted=", this.j, ", isBlacklisted=");
        sb.append(this.k);
        sb.append(", badgeCounts=");
        sb.append(this.l);
        sb.append(", blockedStateChangedDate=");
        sb.append(this.m);
        sb.append(", filterMatch=");
        sb.append(this.n);
        sb.append(", blockProtectionLevel=");
        sb.append(this.o);
        sb.append(", sourceType=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }
}
