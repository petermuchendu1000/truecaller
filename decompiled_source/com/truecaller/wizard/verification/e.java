package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e implements com.truecaller.wizard.verification.s {
    public final boolean a;

    public e(boolean z) {
        this.a = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.wizard.verification.e) && this.a == ((com.truecaller.wizard.verification.e) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final java.lang.String toString() {
        return ro0.f.D("Loading(withText=", ")", this.a);
    }
}
