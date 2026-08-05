package com.truecaller.voicemail.presentation.deactivate;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c {
    public final int a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final com.truecaller.voicemail.presentation.deactivate.DeactivationState e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public c(int i, int i2, int i3, java.lang.String str, com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "shortCodeText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivationState, "deactivationState");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = deactivationState;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    public static com.truecaller.voicemail.presentation.deactivate.c a(com.truecaller.voicemail.presentation.deactivate.c cVar, java.lang.String str, com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState, boolean z, boolean z2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z3;
        if ((i & 1) != 0) {
            i2 = cVar.a;
        } else {
            i2 = 2132023766;
        }
        int i5 = i2;
        if ((i & 2) != 0) {
            i3 = cVar.b;
        } else {
            i3 = 2132023764;
        }
        int i6 = i3;
        if ((i & 4) != 0) {
            i4 = cVar.c;
        } else {
            i4 = 2132023763;
        }
        int i7 = i4;
        if ((i & 8) != 0) {
            str = cVar.d;
        }
        java.lang.String str2 = str;
        if ((i & 16) != 0) {
            deactivationState = cVar.e;
        }
        com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState2 = deactivationState;
        if ((i & 32) != 0) {
            z = cVar.f;
        }
        boolean z4 = z;
        if ((i & 64) != 0) {
            z2 = cVar.g;
        }
        boolean z5 = z2;
        if ((i & com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE) != 0) {
            z3 = cVar.h;
        } else {
            z3 = false;
        }
        boolean z6 = z3;
        cVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "shortCodeText");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivationState2, "deactivationState");
        return new com.truecaller.voicemail.presentation.deactivate.c(i5, i6, i7, str2, deactivationState2, z4, z5, z6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.truecaller.voicemail.presentation.deactivate.c)) {
            return false;
        }
        com.truecaller.voicemail.presentation.deactivate.c cVar = (com.truecaller.voicemail.presentation.deactivate.c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && kotlin.jvm.internal.Intrinsics.b(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = (this.e.hashCode() + ax1.bar.e(((((this.a * 31) + this.b) * 31) + this.c) * 31, 31, this.d)) * 31;
        int i3 = 1237;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (hashCode + i) * 31;
        if (this.g) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.h) {
            i3 = 1231;
        }
        return i5 + i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder e = z0.a0.e(this.a, this.b, "UiState(titleResId=", ", subtitleResId=", ", noteResId=");
        uf.qux.q(this.c, ", shortCodeText=", this.d, ", deactivationState=", e);
        e.append(this.e);
        e.append(", showError=");
        e.append(this.f);
        e.append(", showDisableDialog=");
        return ax1.bar.q(e, this.g, ", isLoading=", this.h, ")");
    }

    public /* synthetic */ c() {
        this(2132023766, 2132023764, 2132023763, "", com.truecaller.voicemail.presentation.deactivate.DeactivationState.IDLE, false, false, true);
    }
}
