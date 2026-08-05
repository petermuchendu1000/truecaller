package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class j1 {
    public final boolean a;

    public j1(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ui.j1) && this.a == ((com.truecaller.ui.j1) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final java.lang.String toString() {
        return ro0.f.D("StatsUiState(canShare=", ")", this.a);
    }
}
