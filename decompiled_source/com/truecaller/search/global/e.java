package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e {
    public final com.truecaller.data.entity.Contact a;
    public final java.lang.String b;
    public final com.truecaller.blocking.FilterMatch c;
    public final boolean d;
    public final boolean e;

    public e(com.truecaller.data.entity.Contact contact, java.lang.String str, com.truecaller.blocking.FilterMatch filterMatch, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "matchedValue");
        this.a = contact;
        this.b = str;
        this.c = filterMatch;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.search.global.e)) {
            return false;
        }
        com.truecaller.search.global.e eVar = (com.truecaller.search.global.e) obj;
        return kotlin.jvm.internal.Intrinsics.b(this.a, eVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, eVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int e = ax1.bar.e(this.a.hashCode() * 31, 31, this.b);
        com.truecaller.blocking.FilterMatch filterMatch = this.c;
        if (filterMatch == null) {
            hashCode = 0;
        } else {
            hashCode = filterMatch.hashCode();
        }
        int i2 = (e + hashCode) * 31;
        int i3 = 1237;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (i2 + i) * 31;
        if (this.e) {
            i3 = 1231;
        }
        return i4 + i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactWithMetadata(contact=");
        sb.append(this.a);
        sb.append(", matchedValue=");
        sb.append(this.b);
        sb.append(", filterMatch=");
        sb.append(this.c);
        sb.append(", isInCallLog=");
        sb.append(this.d);
        sb.append(", hasMessages=");
        return h8.s0.s(sb, this.e, ")");
    }
}
