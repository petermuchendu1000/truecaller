package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class c1 {
    public final int a;

    public c1(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.details_view.ui.c1) && this.a == ((com.truecaller.details_view.ui.c1) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final java.lang.String toString() {
        return y.o.d(this.a, "BadgeCounts(messages=", ")");
    }
}
