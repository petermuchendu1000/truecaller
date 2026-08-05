package com.truecaller.ads.installedapps;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    public final long d;
    public final long e;

    public bar(long j, java.lang.String str, java.lang.String str2, long j2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "packageName");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.truecaller.ads.installedapps.bar) {
            com.truecaller.ads.installedapps.bar barVar = (com.truecaller.ads.installedapps.bar) obj;
            if (kotlin.jvm.internal.Intrinsics.b(barVar.a, this.a) && kotlin.jvm.internal.Intrinsics.b(barVar.b, this.b) && barVar.c == this.c && barVar.d == this.d && barVar.e == this.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
