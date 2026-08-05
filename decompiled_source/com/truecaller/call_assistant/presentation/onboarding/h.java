package com.truecaller.call_assistant.presentation.onboarding;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/call_assistant/presentation/onboarding/h;", "Landroidx/lifecycle/n1;", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class h extends androidx.lifecycle.n1 {
    public final bs0.g b;
    public final tr0.bar c;
    public final ig3.p1 d;

    public h(bs0.g gVar, tr0.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "coordinator");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.b = gVar;
        this.c = barVar;
        this.d = ig3.w1.J(new androidx.room.o(7, ig3.w1.I(gVar.c), this), androidx.lifecycle.g1.l(this), ig3.z1.a(2, 5000L), 1);
    }
}
