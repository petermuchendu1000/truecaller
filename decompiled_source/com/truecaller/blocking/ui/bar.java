package com.truecaller.blocking.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar {
    public final int a;
    public final java.util.List b;

    public bar(int i, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "blockedData");
        this.a = i;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.blocking.ui.bar)) {
            return false;
        }
        com.truecaller.blocking.ui.bar barVar = (com.truecaller.blocking.ui.bar) obj;
        return this.a == barVar.a && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final java.lang.String toString() {
        return "Result(blockedCount=" + this.a + ", blockedData=" + this.b + ")";
    }
}
