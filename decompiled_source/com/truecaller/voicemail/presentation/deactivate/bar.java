package com.truecaller.voicemail.presentation.deactivate;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class bar {
    public static final d3.qux a = new d3.qux(-1076932224, new ce1.bar(24), false);
    public static final d3.qux b = new d3.qux(1838249759, new ce1.bar(25), false);
    public static final d3.qux c = new d3.qux(219301985, new aj0.g(24), false);
    public static final d3.qux d = new d3.qux(-1160483328, new aj0.g(25), false);
    public static final d3.qux e = new d3.qux(877319640, new aj0.g(26), false);
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;

    public static final void a(kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        boolean z;
        nVar.b0(1159534978);
        if (nVar.h(function0)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i3 & 1, z)) {
            r2.h5.i((j3.q) null, 0.0f, ((y41.i) nVar.j(y41.j.a)).g().e, nVar, 0, 3);
            m1.c.h(m1.c2.f(u51.e.d(3, (java.lang.String) null), 4), nVar);
            j51.b bVar = j51.b.e;
            java.lang.String u = qk.b1.u(2132023753, nVar);
            float f2 = 16;
            float f3 = 20;
            bVar.v("continue_btn", m1.c.G(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), f2), (com.truecaller.compose.ui.components.TrueButton.ButtonStylePrimary) null, com.truecaller.compose.ui.components.TrueButton.ButtonSize.LARGE, new m1.s1(f2, f3, f2, f3), false, u, (v3.baz) null, (r2.n0) null, false, function0, nVar, 27654, i3 & 14, 932);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a03.f(i, 8, function0);
        }
    }

    public static final void b(int i, v2.n nVar) {
        boolean z;
        v2.n nVar2;
        nVar.b0(1147964709);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i & 1, z)) {
            j3.q d2 = m1.c2.d(u51.e.d(3, (java.lang.String) null), 1.0f);
            h4.a1 d3 = m1.n.d(j3.qux.a, false);
            long j = nVar.T;
            int i2 = (int) (j ^ (j >>> 32));
            v2.e1 l = nVar.l();
            j3.q c2 = j3.bar.c(d2, nVar);
            j4.e.K9.getClass();
            j4.c cVar = j4.d.b;
            nVar.d0();
            if (nVar.S) {
                nVar.k(cVar);
            } else {
                nVar.n0();
            }
            v2.f.A(d3, j4.d.g, nVar);
            v2.f.A(l, j4.d.f, nVar);
            v2.f.t(nVar, java.lang.Integer.valueOf(i2), j4.d.j);
            v2.f.x(j4.d.k, nVar);
            v2.f.A(c2, j4.d.d, nVar);
            nVar2 = nVar;
            r2.d5.a(m1.r.a.b(u51.e.b(j3.n.a, "voicemail_deactivation_screen_loading", true), j3.qux.e), ((y41.i) nVar.j(y41.j.a)).g().m, 0.0f, 0L, 0, 0.0f, nVar2, 0, 60);
            nVar2.p(true);
        } else {
            nVar2 = nVar;
            nVar2.S();
        }
        v2.h1 r = nVar2.r();
        if (r != null) {
            r.d = new ce1.bar(i, 26);
        }
    }

    public static final void c(java.lang.String str, com.truecaller.voicemail.presentation.deactivate.DeactivationState deactivationState, kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        p53.qux quxVar;
        nVar.b0(-60317444);
        if (nVar.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (nVar.d(deactivationState.ordinal())) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (nVar.h(function0)) {
            i4 = 256;
        } else {
            i4 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i7 & 1, z)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deactivationState, "<this>");
            nVar.Z(1410441777);
            y41.i iVar = (y41.i) nVar.j(y41.j.a);
            int i8 = p53.baz.a[deactivationState.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        nVar.Z(806794770);
                        quxVar = new p53.qux(qk.b1.u(2132023765, nVar), iVar.d().b, iVar.g().n, iVar.e().b, false);
                        nVar.p(false);
                        nVar.p(false);
                    } else {
                        throw ro0.f.G(-1775113606, nVar, false);
                    }
                } else {
                    nVar.Z(806443478);
                    quxVar = new p53.qux(qk.b1.u(2132023759, nVar), iVar.d().a, iVar.g().m, iVar.e().a, true);
                    nVar.p(false);
                    nVar.p(false);
                }
            } else {
                nVar.Z(806076934);
                quxVar = new p53.qux(qk.b1.u(2132023762, nVar), iVar.d().a, iVar.g().m, iVar.e().a, false);
                nVar.p(false);
                nVar.p(false);
            }
            p53.qux quxVar2 = quxVar;
            r2.h5.e(m1.c2.e(u51.e.d(3, (java.lang.String) null), 1.0f), u1.b.b(16), r2.h5.w(quxVar2.b, nVar, 0), (r2.q0) null, (e1.s) null, d3.a.d(993146058, new com.truecaller.voicemail.presentation.deactivate.i(deactivationState, quxVar2, function0, str, 0), nVar), nVar, 196608, 24);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new a2.j(str, deactivationState, function0, i, 18);
        }
    }

    public static final void d(com.truecaller.voicemail.presentation.deactivate.h hVar, kotlin.jvm.functions.Function0 function0, v2.n nVar, int i) {
        int i2;
        int i3;
        boolean z;
        com.truecaller.voicemail.presentation.deactivate.h hVar2;
        kotlin.jvm.functions.Function0 function02;
        r2.m6 m6Var;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "finish");
        nVar.b0(200372712);
        if (nVar.h(hVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (nVar.h(function0)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i5 & 1, z)) {
            nVar.U();
            if ((i & 1) != 0 && !nVar.z()) {
                nVar.S();
            }
            nVar.q();
            v2.t0 r = mf0.o.r(hVar.f, nVar, 0, 7);
            java.lang.Object M = nVar.M();
            v2.c cVar = v2.k.a;
            java.lang.Object obj = M;
            if (M == cVar) {
                obj = qb.qux.u(nVar);
            }
            r2.m6 m6Var2 = (r2.m6) obj;
            androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) nVar.j(y8.c.a);
            android.content.res.Resources resources = (android.content.res.Resources) nVar.j(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.c);
            hg3.e eVar = hVar.d;
            boolean h = nVar.h(d0Var) | nVar.h(hVar) | nVar.h(resources);
            java.lang.Object M2 = nVar.M();
            if (!h && M2 != cVar) {
                m6Var = m6Var2;
            } else {
                com.truecaller.profile.impl.remote.e eVar2 = new com.truecaller.profile.impl.remote.e(d0Var, hVar, m6Var2, resources, (df3.bar) null, 2);
                m6Var = m6Var2;
                nVar.k0(eVar2);
                M2 = eVar2;
            }
            v2.f.h(eVar, (kotlin.jvm.functions.Function2) M2, nVar);
            com.truecaller.voicemail.presentation.deactivate.c cVar2 = (com.truecaller.voicemail.presentation.deactivate.c) r.getValue();
            boolean h2 = nVar.h(hVar);
            java.lang.Object M3 = nVar.M();
            if (h2 || M3 == cVar) {
                com.truecaller.blockinglevel.presentation.qux quxVar = new com.truecaller.blockinglevel.presentation.qux(0, hVar, com.truecaller.voicemail.presentation.deactivate.h.class, "onDeactivateBtnClicked", "onDeactivateBtnClicked()V", 0, 12);
                nVar.k0(quxVar);
                M3 = quxVar;
            }
            kotlin.jvm.functions.Function0 function03 = (kotlin.reflect.KFunction) M3;
            boolean h3 = nVar.h(hVar);
            java.lang.Object M4 = nVar.M();
            if (h3 || M4 == cVar) {
                com.truecaller.blockinglevel.presentation.qux quxVar2 = new com.truecaller.blockinglevel.presentation.qux(0, hVar, com.truecaller.voicemail.presentation.deactivate.h.class, "onDialogDisabledSuccessfullyClicked", "onDialogDisabledSuccessfullyClicked()V", 0, 13);
                nVar.k0(quxVar2);
                M4 = quxVar2;
            }
            kotlin.jvm.functions.Function0 function04 = (kotlin.reflect.KFunction) M4;
            boolean h4 = nVar.h(hVar);
            java.lang.Object M5 = nVar.M();
            if (!h4 && M5 != cVar) {
                hVar2 = hVar;
            } else {
                com.truecaller.blockinglevel.presentation.qux quxVar3 = new com.truecaller.blockinglevel.presentation.qux(0, hVar, com.truecaller.voicemail.presentation.deactivate.h.class, "onDialogDismissed", "onDialogDismissed()V", 0, 14);
                hVar2 = hVar;
                nVar.k0(quxVar3);
                M5 = quxVar3;
            }
            function02 = function0;
            e(cVar2, m6Var, function02, function03, function04, (kotlin.reflect.KFunction) M5, function0, nVar, ((i5 << 3) & 896) | 48 | ((i5 << 15) & 3670016));
        } else {
            hVar2 = hVar;
            function02 = function0;
            nVar.S();
        }
        v2.h1 r2 = nVar.r();
        if (r2 != null) {
            r2.d = new ce1.a(hVar2, function02, i, 12);
        }
    }

    public static final void e(com.truecaller.voicemail.presentation.deactivate.c cVar, r2.m6 m6Var, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, v2.n nVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        v2.n nVar2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        nVar.b0(-1658561105);
        if ((i & 6) == 0) {
            if (nVar.f(cVar)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (nVar.f(m6Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (nVar.h(function0)) {
                i7 = 256;
            } else {
                i7 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_TPAT_KEY_VALUE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (nVar.h(function02)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (nVar.h(function03)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (nVar.h(function04)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (nVar.h(function05)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (nVar.P(i2 & 1, z)) {
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            java.lang.Object M = nVar.M();
            java.lang.Object obj = v2.k.a;
            if (z2 || M == obj) {
                M = new al2.v(18, function0);
                nVar.k0(M);
            }
            com.moloco.sdk.internal.publisher.b0.b(0, 1, (kotlin.jvm.functions.Function0) M, nVar, false);
            if (cVar.g) {
                nVar.Z(-889633646);
                j51.o oVar = j51.o.a;
                d3.qux d2 = d3.a.d(458464446, new a03.f(9, function03), nVar);
                d3.qux d3 = d3.a.d(-921320867, new a03.f(10, function04), nVar);
                java.lang.Object M2 = nVar.M();
                if (M2 == obj) {
                    M2 = new com.truecaller.ads.util.u0(22);
                    nVar.k0(M2);
                }
                z3 = false;
                oVar.b("voicemail_deactivation_screen_disable_confirmation_dialog", (l5.r) null, (kotlin.jvm.functions.Function2) null, a, b, d2, d3, (kotlin.jvm.functions.Function0) M2, nVar, 14380032, 6);
                nVar2 = nVar;
            } else {
                nVar2 = nVar;
                z3 = false;
                nVar2.Z(-894399245);
            }
            nVar2.p(z3);
            r2.n5.a((j3.q) null, d3.a.d(1701612147, new a03.f(11, function0), nVar2), (kotlin.jvm.functions.Function2) null, d3.a.d(1037619829, new com.truecaller.call_assistant.presentation.onboarding.a(m6Var, 3), nVar2), (kotlin.jvm.functions.Function2) null, 0, ((y41.i) nVar2.j(y41.j.a)).g().a, 0L, (m1.o2) null, d3.a.d(-20800706, new ab0.baz(cVar, function05, function02, 4), nVar2), nVar, 805309488, 437);
        } else {
            nVar.S();
        }
        v2.h1 r = nVar.r();
        if (r != null) {
            r.d = new an1.r(cVar, m6Var, function0, function02, function03, function04, function05, i, 4);
        }
    }
}
