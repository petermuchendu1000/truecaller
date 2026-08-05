package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class a2 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ a2(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0674  */
    /* JADX WARN: Type inference failed for: r5v12, types: [kotlin.jvm.internal.j0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.Object obj) {
        dr1.d dVar;
        android.graphics.Bitmap bitmap;
        float ceil;
        boolean z;
        s3.b eVar;
        int i;
        q3.j jVar;
        q3.c0 c0Var;
        q3.c0 c0Var2;
        boolean z2;
        n3.a aVar;
        long j;
        q3.c g;
        s3.baz bazVar;
        rq0.l lVar;
        float f;
        float f2;
        long y;
        w31.c cVar;
        java.lang.String t1;
        int i2;
        java.lang.Integer valueOf;
        java.lang.String t12;
        java.lang.String t14;
        java.lang.String t15;
        java.lang.String t16;
        java.util.List b;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                if1.baz bazVar2 = (if1.baz) this.b;
                int intValue = ((java.lang.Integer) obj).intValue();
                int i3 = com.truecaller.ui.TruecallerInit.y1;
                bazVar2.o(intValue);
                return kotlin.Unit.a;
            case 1:
                d22.baz bazVar3 = (d22.baz) this.b;
                com.truecaller.data.entity.messaging.Participant participant = (com.truecaller.data.entity.messaging.Participant) obj;
                kotlin.jvm.internal.Intrinsics.d(participant);
                bazVar3.getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("{");
                sb.append("id:" + participant.a + ", ");
                qb.qux.w("type:", participant.h(), ", ", sb);
                sb.append("filterAction:" + participant.i + ", ");
                sb.append("source:" + participant.q + ", ");
                qb.qux.w("spamType:", participant.t, ", ", sb);
                sb.append("isTopSpammer:" + participant.l + ", ");
                sb.append("isFraud:" + participant.k + ", ");
                sb.append("badges:" + participant.u);
                sb.append("}");
                return sb.toString();
            case 2:
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (com.truecaller.voicemail.presentation.onboarding.ui.VoicemailOnboardingActivity) this.b;
                tx.n0 n0Var = (tx.n0) obj;
                int i4 = com.truecaller.voicemail.presentation.onboarding.ui.VoicemailOnboardingActivity.e0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n0Var, "it");
                java.lang.String stringExtra = appCompatActivity.getIntent().getStringExtra("voicemailOnboardingAnalyticsContext");
                if (stringExtra == null) {
                    stringExtra = "undefined";
                }
                tx.d dVar2 = n0Var.a;
                return new d53.k(stringExtra, (o33.bar) dVar2.b.b.Ec.get(), (c53.a) dVar2.c.w0.get());
            case 3:
                d82.i iVar = (d82.i) this.b;
                d82.baz bazVar4 = d82.i.o;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((android.view.View) obj, "it");
                d82.m Y5 = iVar.Y5();
                Y5.getClass();
                fg3.h0.J(androidx.lifecycle.g1.l(Y5), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new d82.k(Y5, (df3.bar) null, 3), 3);
                return kotlin.Unit.a;
            case 4:
                return tech.crackle.core_sdk.core.f0.a((tech.crackle.core_sdk.core.o1) this.b, (java.lang.String) obj);
            case 5:
                ef0.g gVar = (ef0.g) this.b;
                ef0.qux quxVar = (ef0.qux) obj;
                gd3.a aVar2 = (gd3.a) ((com.google.android.gms.internal.ads.ej) quxVar).b;
                gd3.n1 n1Var = ef0.a.a;
                if (n1Var == null) {
                    synchronized (ef0.a.class) {
                        try {
                            n1Var = ef0.a.a;
                            if (n1Var == null) {
                                bl.e b2 = gd3.n1.b();
                                b2.e = gd3.m1.a;
                                b2.a = gd3.n1.a("truecaller.truecommunity.api.AnnouncementService", "GetAnnouncements");
                                b2.c = true;
                                ef0.g b3 = ef0.g.b();
                                com.google.protobuf.ExtensionRegistryLite extensionRegistryLite = od3.qux.a;
                                b2.b = new od3.baz(b3);
                                b2.d = new od3.baz(ef0.j.c());
                                n1Var = b2.l();
                                ef0.a.a = n1Var;
                            }
                        } finally {
                        }
                    }
                }
                return (ef0.j) pd3.e.b(aVar2, n1Var, (gd3.qux) ((com.google.android.gms.internal.ads.ej) quxVar).c, gVar);
            case 6:
                dr1.h hVar = (dr1.h) this.b;
                br1.baz bazVar5 = (br1.baz) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar5, "croppingResults");
                hVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar5, "croppingResults");
                java.lang.Object value = hVar.f.a.getValue();
                if (value instanceof dr1.d) {
                    dVar = (dr1.d) value;
                } else {
                    dVar = null;
                }
                if (dVar != null && (bitmap = dVar.a) != null) {
                    fg3.h0.J(androidx.lifecycle.g1.l(hVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(hVar, bitmap, bazVar5, (df3.bar) null, 17), 3);
                }
                return kotlin.Unit.a;
            case 7:
                e1.q qVar = (e1.q) this.b;
                n3.a aVar3 = (n3.a) obj;
                if (aVar3.d() * qVar.r >= 0.0f && p3.b.d(aVar3.a.f()) > 0.0f) {
                    if (h5.c.b(qVar.r, 0.0f)) {
                        ceil = 1.0f;
                    } else {
                        ceil = (float) java.lang.Math.ceil(aVar3.d() * qVar.r);
                    }
                    float f3 = 2;
                    float min = java.lang.Math.min(ceil, (float) java.lang.Math.ceil(p3.b.d(aVar3.a.f()) / f3));
                    float f4 = min / f3;
                    long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(f4) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L);
                    long floatToRawIntBits2 = (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (aVar3.a.f() >> 32)) - min) << 32) | (java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (aVar3.a.f() & 4294967295L)) - min) & 4294967295L);
                    float f5 = min * f3;
                    if (f5 > p3.b.d(aVar3.a.f())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    q3.g0 a = qVar.t.a(aVar3.a.f(), aVar3.a.getLayoutDirection(), aVar3);
                    if (a instanceof q3.g0) {
                        q3.s0 s0Var = qVar.s;
                        q3.g0 g0Var = a;
                        q3.f fVar = g0Var.a;
                        if (z) {
                            return aVar3.a(new c80.p(21, g0Var, s0Var));
                        }
                        if (s0Var instanceof q3.s0) {
                            jVar = new q3.j(q3.r.c(s0Var.a, 1.0f, 0.0f, 0.0f, 0.0f, 14), 5);
                            i = 1;
                        } else {
                            i = 0;
                            jVar = null;
                        }
                        p3.qux a2 = fVar.a();
                        float f6 = a2.b;
                        float f7 = a2.a;
                        if (qVar.q == null) {
                            qVar.q = new e1.m();
                        }
                        e1.m mVar = qVar.q;
                        kotlin.jvm.internal.Intrinsics.d(mVar);
                        q3.f fVar2 = mVar.d;
                        if (fVar2 == null) {
                            fVar2 = q3.i.a();
                            mVar.d = fVar2;
                        }
                        fVar2.f();
                        os0.bar.b(fVar2, a2);
                        fVar2.d(fVar2, fVar, 0);
                        ?? obj2 = new java.lang.Object();
                        long ceil2 = (((int) java.lang.Math.ceil(a2.c - f7)) << 32) | (((int) java.lang.Math.ceil(a2.d - f6)) & 4294967295L);
                        e1.m mVar2 = qVar.q;
                        kotlin.jvm.internal.Intrinsics.d(mVar2);
                        q3.c cVar2 = mVar2.a;
                        q3.baz bazVar6 = mVar2.b;
                        if (cVar2 != null) {
                            c0Var = new q3.c0(cVar2.a());
                        } else {
                            c0Var = null;
                        }
                        try {
                            try {
                                if (c0Var == null || c0Var.a != 0) {
                                    if (cVar2 != null) {
                                        c0Var2 = new q3.c0(cVar2.a());
                                    } else {
                                        c0Var2 = null;
                                    }
                                    if (!d4.t.w(c0Var2) || i != c0Var2.a) {
                                        z2 = false;
                                        if (cVar2 == null && bazVar6 != null) {
                                            aVar = aVar3;
                                            j = ceil2;
                                            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (aVar.a.f() >> 32));
                                            android.graphics.Bitmap bitmap2 = cVar2.a;
                                            if (intBitsToFloat <= bitmap2.getWidth() && java.lang.Float.intBitsToFloat((int) (aVar.a.f() & 4294967295L)) <= bitmap2.getHeight() && z2) {
                                                g = cVar2;
                                                bazVar = mVar2.c;
                                                if (bazVar == null) {
                                                    bazVar = new s3.baz();
                                                    mVar2.c = bazVar;
                                                }
                                                lVar = bazVar.b;
                                                s3.bar barVar = bazVar.a;
                                                s3.baz bazVar7 = bazVar;
                                                long N = com.bumptech.glide.qux.N(j);
                                                h5.j layoutDirection = aVar.a.getLayoutDirection();
                                                q3.f fVar3 = fVar2;
                                                h5.qux quxVar2 = barVar.a;
                                                h5.j jVar2 = barVar.b;
                                                q3.p pVar = barVar.c;
                                                q3.c cVar3 = g;
                                                long j2 = barVar.d;
                                                barVar.a = aVar;
                                                barVar.b = layoutDirection;
                                                barVar.c = bazVar6;
                                                barVar.d = N;
                                                bazVar6.r();
                                                ro0.f.q(bazVar7, q3.r.b, 0L, N, 0.0f, (s3.e) null, 0, 58);
                                                f = -f7;
                                                f2 = -f6;
                                                ((po1.baz) lVar.a).w(f, f2);
                                                ro0.f.n(bazVar7, g0Var.a, s0Var, 0.0f, new s3.e(f5, 0.0f, 0, 0, (q3.g) null, 30), 52);
                                                float f8 = 1;
                                                float intBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32)) + f8) / java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32));
                                                q3.baz bazVar8 = bazVar6;
                                                float intBitsToFloat3 = (java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L)) + f8) / java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L));
                                                long U = bazVar7.U();
                                                y = lVar.y();
                                                lVar.u().r();
                                                ((po1.baz) lVar.a).u(U, intBitsToFloat2, intBitsToFloat3);
                                                ro0.f.n(bazVar7, fVar3, s0Var, 0.0f, (s3.e) null, 28);
                                                ((po1.baz) lVar.a).w(-f, -f2);
                                                bazVar8.o();
                                                barVar.a = quxVar2;
                                                barVar.b = jVar2;
                                                barVar.c = pVar;
                                                barVar.d = j2;
                                                cVar3.a.prepareToDraw();
                                                ((kotlin.jvm.internal.j0) obj2).a = cVar3;
                                                return aVar.a(new e1.p(j, a2, 0, (java.lang.Object) obj2, jVar));
                                            }
                                        } else {
                                            aVar = aVar3;
                                            j = ceil2;
                                        }
                                        g = q3.a0.g((int) (j >> 32), (int) (j & 4294967295L), i);
                                        mVar2.a = g;
                                        bazVar6 = q3.a0.a(g);
                                        mVar2.b = bazVar6;
                                        bazVar = mVar2.c;
                                        if (bazVar == null) {
                                        }
                                        lVar = bazVar.b;
                                        s3.bar barVar2 = bazVar.a;
                                        s3.baz bazVar72 = bazVar;
                                        long N2 = com.bumptech.glide.qux.N(j);
                                        h5.j layoutDirection2 = aVar.a.getLayoutDirection();
                                        q3.f fVar32 = fVar2;
                                        h5.qux quxVar22 = barVar2.a;
                                        h5.j jVar22 = barVar2.b;
                                        q3.p pVar2 = barVar2.c;
                                        q3.c cVar32 = g;
                                        long j22 = barVar2.d;
                                        barVar2.a = aVar;
                                        barVar2.b = layoutDirection2;
                                        barVar2.c = bazVar6;
                                        barVar2.d = N2;
                                        bazVar6.r();
                                        ro0.f.q(bazVar72, q3.r.b, 0L, N2, 0.0f, (s3.e) null, 0, 58);
                                        f = -f7;
                                        f2 = -f6;
                                        ((po1.baz) lVar.a).w(f, f2);
                                        ro0.f.n(bazVar72, g0Var.a, s0Var, 0.0f, new s3.e(f5, 0.0f, 0, 0, (q3.g) null, 30), 52);
                                        float f82 = 1;
                                        float intBitsToFloat22 = (java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32)) + f82) / java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32));
                                        q3.baz bazVar82 = bazVar6;
                                        float intBitsToFloat32 = (java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L)) + f82) / java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L));
                                        long U2 = bazVar72.U();
                                        y = lVar.y();
                                        lVar.u().r();
                                        ((po1.baz) lVar.a).u(U2, intBitsToFloat22, intBitsToFloat32);
                                        ro0.f.n(bazVar72, fVar32, s0Var, 0.0f, (s3.e) null, 28);
                                        ((po1.baz) lVar.a).w(-f, -f2);
                                        bazVar82.o();
                                        barVar2.a = quxVar22;
                                        barVar2.b = jVar22;
                                        barVar2.c = pVar2;
                                        barVar2.d = j22;
                                        cVar32.a.prepareToDraw();
                                        ((kotlin.jvm.internal.j0) obj2).a = cVar32;
                                        return aVar.a(new e1.p(j, a2, 0, (java.lang.Object) obj2, jVar));
                                    }
                                }
                                ((po1.baz) lVar.a).u(U2, intBitsToFloat22, intBitsToFloat32);
                                ro0.f.n(bazVar72, fVar32, s0Var, 0.0f, (s3.e) null, 28);
                                ((po1.baz) lVar.a).w(-f, -f2);
                                bazVar82.o();
                                barVar2.a = quxVar22;
                                barVar2.b = jVar22;
                                barVar2.c = pVar2;
                                barVar2.d = j22;
                                cVar32.a.prepareToDraw();
                                ((kotlin.jvm.internal.j0) obj2).a = cVar32;
                                return aVar.a(new e1.p(j, a2, 0, (java.lang.Object) obj2, jVar));
                            } finally {
                                lVar.u().o();
                                lVar.O(y);
                            }
                            ro0.f.n(bazVar72, g0Var.a, s0Var, 0.0f, new s3.e(f5, 0.0f, 0, 0, (q3.g) null, 30), 52);
                            float f822 = 1;
                            float intBitsToFloat222 = (java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32)) + f822) / java.lang.Float.intBitsToFloat((int) (lVar.y() >> 32));
                            q3.baz bazVar822 = bazVar6;
                            float intBitsToFloat322 = (java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L)) + f822) / java.lang.Float.intBitsToFloat((int) (lVar.y() & 4294967295L));
                            long U22 = bazVar72.U();
                            y = lVar.y();
                            lVar.u().r();
                        } catch (java.lang.Throwable th) {
                            ((po1.baz) lVar.a).w(-f, -f2);
                            throw th;
                        }
                        z2 = true;
                        if (cVar2 == null) {
                        }
                        aVar = aVar3;
                        j = ceil2;
                        g = q3.a0.g((int) (j >> 32), (int) (j & 4294967295L), i);
                        mVar2.a = g;
                        bazVar6 = q3.a0.a(g);
                        mVar2.b = bazVar6;
                        bazVar = mVar2.c;
                        if (bazVar == null) {
                        }
                        lVar = bazVar.b;
                        s3.bar barVar22 = bazVar.a;
                        s3.baz bazVar722 = bazVar;
                        long N22 = com.bumptech.glide.qux.N(j);
                        h5.j layoutDirection22 = aVar.a.getLayoutDirection();
                        q3.f fVar322 = fVar2;
                        h5.qux quxVar222 = barVar22.a;
                        h5.j jVar222 = barVar22.b;
                        q3.p pVar22 = barVar22.c;
                        q3.c cVar322 = g;
                        long j222 = barVar22.d;
                        barVar22.a = aVar;
                        barVar22.b = layoutDirection22;
                        barVar22.c = bazVar6;
                        barVar22.d = N22;
                        bazVar6.r();
                        ro0.f.q(bazVar722, q3.r.b, 0L, N22, 0.0f, (s3.e) null, 0, 58);
                        f = -f7;
                        f2 = -f6;
                        ((po1.baz) lVar.a).w(f, f2);
                    } else {
                        if (a instanceof q3.i0) {
                            q3.n nVar = qVar.s;
                            p3.a aVar4 = ((q3.i0) a).a;
                            if (oj3.e.o(aVar4)) {
                                return aVar3.a(new e1.o(z, nVar, aVar4.e, f4, min, floatToRawIntBits, floatToRawIntBits2, new s3.e(min, 0.0f, 0, 0, (q3.g) null, 30)));
                            }
                            boolean z4 = z;
                            if (qVar.q == null) {
                                qVar.q = new e1.m();
                            }
                            e1.m mVar3 = qVar.q;
                            kotlin.jvm.internal.Intrinsics.d(mVar3);
                            q3.f fVar4 = mVar3.d;
                            if (fVar4 == null) {
                                fVar4 = q3.i.a();
                                mVar3.d = fVar4;
                            }
                            fVar4.f();
                            os0.bar.c(fVar4, aVar4);
                            if (!z4) {
                                q3.f a3 = q3.i.a();
                                os0.bar.c(a3, new p3.a(min, min, aVar4.b() - min, aVar4.a() - min, e1.k.C(aVar4.e, min), e1.k.C(aVar4.f, min), e1.k.C(aVar4.g, min), e1.k.C(aVar4.h, min)));
                                fVar4.d(fVar4, a3, 0);
                            }
                            return aVar3.a(new c80.p(20, fVar4, nVar));
                        }
                        boolean z5 = z;
                        if (a instanceof q3.h0) {
                            q3.n nVar2 = qVar.s;
                            if (z5) {
                                floatToRawIntBits = 0;
                            }
                            long j3 = floatToRawIntBits;
                            if (z5) {
                                floatToRawIntBits2 = aVar3.a.f();
                            }
                            long j4 = floatToRawIntBits2;
                            if (z5) {
                                eVar = s3.d.a;
                            } else {
                                eVar = new s3.e(min, 0.0f, 0, 0, (q3.g) null, 30);
                            }
                            return aVar3.a(new e1.n(nVar2, j3, j4, eVar));
                        }
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    return aVar3.a(new dk3.bar(26));
                }
                break;
            case 8:
                e1.f2 f2Var = (e1.f2) this.b;
                float floatValue = ((java.lang.Float) obj).floatValue();
                float h = f2Var.h() + floatValue + f2Var.f;
                float c = uf3.p.c(h, 0.0f, f2Var.g());
                if (h == c) {
                    z3 = true;
                }
                float h2 = c - f2Var.h();
                int round = java.lang.Math.round(h2);
                f2Var.a.i(f2Var.h() + round);
                f2Var.f = h2 - round;
                if (!z3) {
                    floatValue = h2;
                }
                return java.lang.Float.valueOf(floatValue);
            case 9:
                com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog = (com.truecaller.common.ui.dialogs.TcSystemDialog) this.b;
                java.lang.String str = (java.lang.String) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "it");
                e41.v vVar = tcSystemDialog.c;
                if (vVar != null) {
                    vVar.k4(str, tcSystemDialog);
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("listener");
                throw null;
            case 10:
                nf3.i iVar2 = (nf3.i) this.b;
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "onBSNotAvailable");
                iVar2.invoke(i82.r.A9.getName(), function0, java.lang.Boolean.FALSE);
                return kotlin.Unit.a;
            case 11:
                android.widget.Toast.makeText(((e73.k) this.b).requireContext().getApplicationContext(), (java.lang.String) obj, 0).show();
                return kotlin.Unit.a;
            case 12:
                com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = (com.truecaller.common.ui.avatar.AvatarXConfig) this.b;
                com.truecaller.common.ui.avatar.AvatarXView avatarXView = (com.truecaller.common.ui.avatar.AvatarXView) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXView, "v");
                w31.c presenter = avatarXView.getPresenter();
                if (presenter instanceof w31.c) {
                    cVar = presenter;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.C2(avatarXConfig, true);
                }
                return kotlin.Unit.a;
            case 13:
                com.truecaller.ads.api.model.ad.AdScreen adScreen = (com.truecaller.ads.api.model.ad.AdScreen) this.b;
                tx.p0 p0Var = (tx.p0) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0Var, "it");
                return p0Var.a(adScreen);
            case 14:
                ef1.baz bazVar9 = (ef1.baz) this.b;
                android.view.View view = (android.view.View) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
                java.lang.Object obj3 = bazVar9.a.get();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                return new ef1.f(view, (ef1.c) obj3);
            case 15:
                ef1.c cVar4 = (ef1.c) this.b;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    cVar4.d.a();
                    fg3.h0.J(cVar4, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new be1.w(cVar4, (df3.bar) null, 7), 3);
                } else {
                    int i5 = com.truecaller.tcpermissions.TcPermissionDialogActivity.e0;
                    ik3.s.t(cVar4.b);
                    cf1.a aVar5 = cVar4.f;
                    int i6 = ef1.a.a[cVar4.e.b.a().ordinal()];
                    if (i6 != 1) {
                        if (i6 == 2) {
                            aVar5.b(com.truecaller.calling_common.analytics.AnalyticsContext.SET_DEFAULT_DIALER_ALERT_LONG, com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceViewId.GO_TO_PHONE_SETTINGS_DIALOGUE);
                        }
                    } else {
                        aVar5.b(com.truecaller.calling_common.analytics.AnalyticsContext.SET_DEFAULT_DIALER_ALERT_SHORT, com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceViewId.GO_TO_PHONE_SETTINGS_DIALOGUE);
                    }
                }
                return kotlin.Unit.a;
            case 16:
                ei2.e eVar2 = (ei2.e) this.b;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                eVar2.e.c(bool);
                return kotlin.Unit.a;
            case 17:
                em0.a aVar6 = (em0.a) this.b;
                rc.bar barVar3 = (rc.bar) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "_connection");
                rc.qux z0 = barVar3.z0("SELECT * FROM assistant_campaigns_banners ORDER BY `order` ASC");
                try {
                    int i7 = mc.f.i(z0, "id");
                    int i8 = mc.f.i(z0, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
                    int i9 = mc.f.i(z0, "coolOff");
                    int i10 = mc.f.i(z0, "language");
                    int i11 = mc.f.i(z0, "rules");
                    int i12 = mc.f.i(z0, "occurrence");
                    int i14 = mc.f.i(z0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                    int i15 = mc.f.i(z0, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT);
                    int i16 = mc.f.i(z0, "order");
                    int i17 = mc.f.i(z0, "screens");
                    int i18 = mc.f.i(z0, "backgroundColor");
                    int i19 = mc.f.i(z0, "backgroundColorDark");
                    int i20 = mc.f.i(z0, "dynamicRules");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (z0.v0()) {
                        java.lang.String t17 = z0.t1(i7);
                        java.lang.String t18 = z0.t1(i8);
                        if (z0.isNull(i9)) {
                            t1 = null;
                        } else {
                            t1 = z0.t1(i9);
                        }
                        java.lang.String t19 = z0.t1(i10);
                        int i21 = i7;
                        int i22 = i8;
                        java.util.List b4 = ((fm0.g) aVar6.c.getValue()).b(z0.t1(i11));
                        if (z0.isNull(i12)) {
                            i2 = i9;
                            valueOf = null;
                        } else {
                            i2 = i9;
                            valueOf = java.lang.Integer.valueOf((int) z0.getLong(i12));
                        }
                        int i24 = (int) z0.getLong(i14);
                        int i25 = i2;
                        com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemContent b5 = ((fm0.a) aVar6.d.getValue()).b(z0.t1(i15));
                        int i26 = (int) z0.getLong(i16);
                        if (z0.isNull(i17)) {
                            t12 = null;
                        } else {
                            t12 = z0.t1(i17);
                        }
                        java.util.List a4 = ((fm0.l) aVar6.e.getValue()).a(t12);
                        if (z0.isNull(i18)) {
                            t14 = null;
                        } else {
                            t14 = z0.t1(i18);
                        }
                        if (z0.isNull(i19)) {
                            t15 = null;
                        } else {
                            t15 = z0.t1(i19);
                        }
                        if (z0.isNull(i20)) {
                            t16 = null;
                        } else {
                            t16 = z0.t1(i20);
                        }
                        if (t16 == null) {
                            b = null;
                        } else {
                            b = ((fm0.j) aVar6.f.getValue()).b(t16);
                        }
                        arrayList.add(new com.truecaller.call_assistant.campaigns.data.db.banners.AssistantBannerEntity(t17, t18, t1, t19, b4, valueOf, i24, b5, i26, a4, t14, t15, b));
                        i7 = i21;
                        i8 = i22;
                        i9 = i25;
                    }
                    return arrayList;
                } finally {
                    z0.close();
                }
            case 18:
                float f9 = en1.f.a;
                q3.d dVar3 = (q3.d) this.b;
                s3.a aVar7 = (s3.a) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar7, "$this$onDrawBehind");
                aVar7.S().u().e(0.0f, 0.0f, java.lang.Float.intBitsToFloat((int) (aVar7.f() >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & aVar7.f())), aVar7.D0(f9), aVar7.D0(f9), dVar3);
                return kotlin.Unit.a;
            case 19:
                go2.u1 u1Var = (go2.u1) this.b;
                fn2.q3 q3Var = (fn2.q3) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(q3Var, "action");
                u1Var.c.invoke(q3Var);
                return kotlin.Unit.a;
            case 20:
                ex1.a aVar8 = (ex1.a) this.b;
                java.lang.String str2 = (java.lang.String) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "link");
                android.content.Context context = ((ex1.baz) aVar8).f;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "deeplink");
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setData(android.net.Uri.parse(str2));
                intent.setFlags(268435456);
                t41.p.u(context, intent);
                return kotlin.Unit.a;
            case 21:
                ey2.m mVar4 = (ey2.m) this.b;
                com.truecaller.search.global.s sVar = mVar4.n;
                com.truecaller.ui.components.bar barVar4 = mVar4.o;
                com.truecaller.search.global.w wVar = sVar.a;
                wVar.A.d(p22.bar.A(barVar4.f.asAnalyticsContext(), com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.INVITE));
                kj2.baz bazVar10 = (kj2.baz) wVar.C.get();
                if (bazVar10 != null) {
                    com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.SEARCH_SCREEN_PROMO;
                    if (bazVar10.N3(referralManager$ReferralLaunchContext)) {
                        bazVar10.H1(referralManager$ReferralLaunchContext);
                        return kotlin.Unit.a;
                    }
                }
                t41.p.t(wVar.requireContext(), wVar.getResources().getString(2132018164), wVar.getResources().getString(2132018985), wVar.getResources().getString(2132018984), (android.net.Uri) null);
                wVar.A.d(p22.bar.A("globalSearchHistory", com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.SHARE));
                return kotlin.Unit.a;
            case 22:
                ((f2.i0) this.b).a((z4.d) obj);
                return kotlin.Unit.a;
            case 23:
                f2.q0 q0Var = (f2.q0) this.b;
                h4.a0 a0Var = (h4.a0) obj;
                p3.qux quxVar3 = (p3.qux) q0Var.u.y.getValue();
                if (quxVar3 == null) {
                    quxVar3 = p3.qux.e;
                }
                h4.a0 e = q0Var.s.e();
                if (e != null) {
                    return b2.g.e(quxVar3, e, a0Var);
                }
                l1.bar.d("Required value was null.");
                throw new java.lang.RuntimeException();
            case 24:
                f2.u0 u0Var = (f2.u0) this.b;
                android.content.ClipDescription clipDescription = ((m3.a) obj).a.getClipDescription();
                java.lang.Iterable<f1.bar> iterable = (java.lang.Iterable) u0Var.invoke();
                if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                    for (f1.bar barVar5 : iterable) {
                        if (kotlin.jvm.internal.Intrinsics.b(barVar5, f1.bar.c) || clipDescription.hasMimeType(barVar5.a)) {
                            z3 = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z3);
            case 25:
                d20.d dVar4 = (d20.d) this.b;
                android.content.Context context2 = (android.content.Context) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
                com.google.android.gms.ads.nativead.NativeAdView k = o00.e.k(context2, dVar4.c);
                o00.e.b(k, dVar4.b, dVar4.d, dVar4.c);
                return k;
            case 26:
                f32.e eVar3 = (f32.e) this.b;
                android.view.View view2 = (android.view.View) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view2, "view");
                n00.c cVar5 = eVar3.l;
                if (cVar5 != null) {
                    return new f32.h(view2, cVar5);
                }
                kotlin.jvm.internal.Intrinsics.n("adapter");
                throw null;
            case 27:
                f32.h hVar2 = (f32.h) this.b;
                com.truecaller.messaging.views.Switch r2 = (com.truecaller.messaging.views.Switch) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, "selectedTransport");
                n00.h hVar3 = hVar2.b;
                android.view.View view3 = ((androidx.recyclerview.widget.k2) hVar2).itemView;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                hVar3.k(new n00.d("ItemEvent.CHANGE_TRANSPORT", hVar2, view3, r2));
                return kotlin.Unit.a;
            case 28:
                android.graphics.Bitmap bitmap3 = (android.graphics.Bitmap) this.b;
                java.io.OutputStream outputStream = (java.io.OutputStream) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "out");
                bitmap3.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream);
                return kotlin.Unit.a;
            default:
                byte[] bArr = (byte[]) this.b;
                java.io.OutputStream outputStream2 = (java.io.OutputStream) obj;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream2, "out");
                try {
                    outputStream2.write(bArr);
                } catch (java.io.IOException unused) {
                }
                return kotlin.Unit.a;
        }
    }

    public /* synthetic */ a2(q3.d dVar) {
        this.a = 18;
        float f = en1.f.a;
        this.b = dVar;
    }
}
