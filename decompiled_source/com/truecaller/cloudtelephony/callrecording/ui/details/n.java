package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class n extends of0.baz implements p01.baz {
    public final kotlin.coroutines.CoroutineContext d;
    public final qo1.f e;
    public final com.truecaller.settings.impl.ui.j f;
    public final u03.b0 g;
    public final qz0.bar h;
    public final rz0.x i;
    public com.truecaller.cloudtelephony.callrecording.data.CallRecording j;
    public final com.truecaller.common.ui.avatar.AvatarXConfig k;
    public final boolean l;
    public final kotlin.coroutines.CoroutineContext m;
    public final op2.baz n;
    public final wj2.qux o;
    public final s01.h p;
    public final zz0.a q;
    public boolean r;
    public com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor s;
    public fg3.k2 t;
    public fg3.k2 u;
    public int v;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(kotlin.coroutines.CoroutineContext coroutineContext, qo1.f fVar, com.truecaller.settings.impl.ui.j jVar, u03.b0 b0Var, qz0.bar barVar, rz0.x xVar, com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording, com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig, boolean z, kotlin.coroutines.CoroutineContext coroutineContext2, op2.baz bazVar, wj2.qux quxVar, s01.h hVar, zz0.a aVar) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "inventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "repository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "resourceProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "callRecordingAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecording, "recording");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "feedbackSender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "configs");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "shareHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "callRecordingStorageHelper");
        this.d = coroutineContext;
        this.e = fVar;
        this.f = jVar;
        this.g = b0Var;
        this.h = barVar;
        this.i = xVar;
        this.j = callRecording;
        this.k = avatarXConfig;
        this.l = z;
        this.m = coroutineContext2;
        this.n = bazVar;
        this.o = quxVar;
        this.p = hVar;
        this.q = aVar;
    }

    public static final java.lang.Object c2(com.truecaller.cloudtelephony.callrecording.ui.details.n nVar, ff3.g gVar) {
        com.truecaller.settings.impl.ui.j jVar = nVar.f;
        java.lang.String str = nVar.j.a;
        sz0.baz c = jVar.c();
        java.lang.Object q = mc.f.q(c.a, false, true, new s93.baz(3, c, new sz0.b(str)), gVar);
        ef3.bar barVar = ef3.bar.a;
        if (q != barVar) {
            q = kotlin.Unit.a;
        }
        if (q != barVar) {
            q = kotlin.Unit.a;
        }
        if (q == barVar) {
            return q;
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d2(com.truecaller.cloudtelephony.callrecording.ui.details.n nVar, ff3.qux quxVar) {
        com.truecaller.cloudtelephony.callrecording.ui.details.l lVar;
        int i;
        boolean z;
        if (quxVar instanceof com.truecaller.cloudtelephony.callrecording.ui.details.l) {
            lVar = (com.truecaller.cloudtelephony.callrecording.ui.details.l) quxVar;
            int i2 = lVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = lVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = lVar.A;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        nVar = lVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String str = nVar.j.h;
                    if (str != null && str.length() != 0 && nVar.j.i != com.truecaller.cloudtelephony.callrecording.data.CallRecordingSummaryStatus.TOO_SHORT && (z = nVar.l)) {
                        if (z) {
                            i3 = 0;
                        } else {
                            rz0.x xVar = nVar.i;
                            lVar.x = nVar;
                            lVar.A = 1;
                            obj = ef0.a.D(0, lVar, xVar.b(), rz0.y.d);
                            if (obj == barVar) {
                                return barVar;
                            }
                        }
                    }
                    nVar.v = i3;
                    return kotlin.Unit.a;
                }
                i3 = ((java.lang.Number) obj).intValue();
                nVar.v = i3;
                return kotlin.Unit.a;
            }
        }
        lVar = new com.truecaller.cloudtelephony.callrecording.ui.details.l(nVar, quxVar);
        java.lang.Object obj2 = lVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = lVar.A;
        int i32 = 1;
        if (i == 0) {
        }
        i32 = ((java.lang.Number) obj2).intValue();
        nVar.v = i32;
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r1.c() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (r7.j.n != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object e2(com.truecaller.cloudtelephony.callrecording.ui.details.n nVar, long j, ff3.qux quxVar) {
        com.truecaller.cloudtelephony.callrecording.ui.details.m mVar;
        int i;
        int g;
        java.lang.Object f;
        wj2.qux quxVar2 = nVar.o;
        if (quxVar instanceof com.truecaller.cloudtelephony.callrecording.ui.details.m) {
            mVar = (com.truecaller.cloudtelephony.callrecording.ui.details.m) quxVar;
            int i2 = mVar.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.B = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = mVar.z;
                ef3.bar barVar = ef3.bar.a;
                i = mVar.B;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        int i3 = mVar.y;
                        long j2 = mVar.x;
                        od.p.E(obj);
                        g = i3;
                        j = j2;
                        f = obj;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    g = quxVar2.a.g(7, "callRecordingFeedbackListening_52814");
                    com.truecaller.settings.impl.ui.j jVar = nVar.f;
                    java.lang.String str = nVar.j.a;
                    mVar.x = j;
                    mVar.y = g;
                    mVar.B = 1;
                    f = jVar.f(str, mVar);
                    if (f == barVar) {
                        return barVar;
                    }
                }
                if (!((java.lang.Boolean) f).booleanValue()) {
                    qo1.g gVar = nVar.e;
                    if (!gVar.b()) {
                        if (!gVar.d()) {
                        }
                    }
                    if (quxVar2.a.d("callRecordingFeedBackForm_47488", "https://forms.gle/E3Nk2PETL4jRpaYB8").length() > 0) {
                        if (j >= java.util.concurrent.TimeUnit.SECONDS.toMillis(g)) {
                        }
                    }
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            }
        }
        mVar = new com.truecaller.cloudtelephony.callrecording.ui.details.m(nVar, quxVar);
        java.lang.Object obj2 = mVar.z;
        ef3.bar barVar2 = ef3.bar.a;
        i = mVar.B;
        boolean z2 = true;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) f).booleanValue()) {
        }
        z2 = false;
        return java.lang.Boolean.valueOf(z2);
    }

    public static final void f2(com.truecaller.cloudtelephony.callrecording.ui.details.n nVar) {
        java.lang.String h = nVar.g.h(2132017574, new java.lang.Object[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
        java.lang.String e = org.joda.time.format.bar.a("d MMM yyyy '" + h + "' h:mm a").e(nVar.j.c.getTime());
        java.lang.String str = nVar.j.j;
        if (str == null || str.length() == 0 || !nVar.e.b.a("featureCallRecordingSubject", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            str = e;
        }
        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
        if (gVar != null) {
            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = nVar.k;
            com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = (com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "config");
            ((w31.c) callRecordingDetailsActivity.m0.getValue()).C2(avatarXConfig, false);
            kotlin.jvm.internal.Intrinsics.d(e);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "date");
            ((android.widget.TextView) callRecordingDetailsActivity.t0().h.d).setText(e);
            java.lang.String r = ye0.k.r(nVar.j);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r, "name");
            ((android.widget.TextView) callRecordingDetailsActivity.t0().h.e).setText(r);
            kotlin.jvm.internal.Intrinsics.d(str);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "subject");
            callRecordingDetailsActivity.t0().g.setText(str);
        }
    }

    @Override // p01.baz
    public final void I1(com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callRecording, "callRecording");
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(this, callRecording, (df3.bar) null, 26), 3);
    }

    @Override // p01.baz
    public final void S(com.truecaller.cloudtelephony.callrecording.data.CallRecording callRecording) {
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(this, (df3.bar) null, 28), 3);
    }

    public final void g2(int i, java.lang.Integer num) {
        java.lang.String str;
        if (num != null && i == num.intValue()) {
            return;
        }
        if (num != null && num.intValue() == 0) {
            str = "CTRecordingDetailsSummary-10017";
        } else if (num != null && num.intValue() == 1) {
            str = "CTRecordingDetailsTranscription-10017";
        } else if (num == null) {
            str = "CTRecordedCalls-10016";
        } else {
            return;
        }
        qz0.bar barVar = this.h;
        if (i == 0) {
            qz0.qux quxVar = (qz0.qux) barVar;
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
            bd.bar.u(quxVar.a, "CTRecordingDetailsSummary-10017", str);
            z42.bar.M(new v03.qux("CTRecordingDetailsSummary", quxVar.d()), quxVar.b, quxVar.d);
            return;
        }
        qz0.qux quxVar2 = (qz0.qux) barVar;
        quxVar2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "analyticsContext");
        bd.bar.u(quxVar2.a, "CTRecordingDetailsTranscription-10017", str);
        z42.bar.M(new v03.qux("CTRecordingDetailsTranscription", quxVar2.d()), quxVar2.b, quxVar2.d);
    }

    public final void h2(i01.bar barVar) {
        if (this.t == null) {
            this.t = fg3.h0.J(this, this.m, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(this, barVar, (df3.bar) null, 29), 2);
        }
    }

    public final void j2() {
        com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection selection;
        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) this).a;
        if (gVar != null) {
            w21.h hVar = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar).o0;
            if (hVar != null) {
                selection = hVar.l;
            } else {
                selection = null;
            }
            if (selection != null) {
                int i = com.truecaller.cloudtelephony.callrecording.ui.details.h.a[selection.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.RuntimeException();
                        }
                        return;
                    }
                    com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack feedBack = com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.NEUTRAL;
                    com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor feedBackFor = this.s;
                    if (feedBackFor != null) {
                        h2(new i01.bar(feedBackFor, feedBack));
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("feedBackFor");
                        throw null;
                    }
                }
                com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack feedBack2 = com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.NEGATIVE;
                com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor feedBackFor2 = this.s;
                if (feedBackFor2 != null) {
                    h2(new i01.bar(feedBackFor2, feedBack2));
                } else {
                    kotlin.jvm.internal.Intrinsics.n("feedBackFor");
                    throw null;
                }
            }
        }
    }

    public final void k2() {
        com.truecaller.common.cloudtelephony.ui.EmojiFeedBackDialog.Selection selection;
        int i;
        java.lang.Integer num;
        w21.h hVar;
        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) this).a;
        if (gVar != null && (hVar = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar).o0) != null) {
            selection = hVar.l;
        } else {
            selection = null;
        }
        if (selection == null) {
            i = -1;
        } else {
            i = com.truecaller.cloudtelephony.callrecording.ui.details.h.a[selection.ordinal()];
        }
        int i2 = 3;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        num = java.lang.Integer.valueOf(com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.POSITIVE.getValue());
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                } else {
                    num = java.lang.Integer.valueOf(com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.NEUTRAL.getValue());
                }
            } else {
                num = java.lang.Integer.valueOf(com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.NEGATIVE.getValue());
            }
        } else {
            num = null;
        }
        java.lang.String str = this.j.a;
        com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor feedBackFor = this.s;
        if (feedBackFor != null) {
            int i3 = com.truecaller.cloudtelephony.callrecording.ui.details.h.b[feedBackFor.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i2 = 5;
                    } else {
                        throw new java.lang.RuntimeException();
                    }
                }
            } else {
                i2 = 4;
            }
            boolean z = this.w;
            qz0.qux quxVar = (qz0.qux) this.h;
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "callId");
            hi3.e eVar = new hi3.e(qx2.z2.j, qx2.z2.k);
            hi3.e.d(eVar.b[2], str);
            ((qx2.w0) eVar).e = str;
            eVar.c[2] = true;
            eVar.o();
            eVar.n(java.lang.Integer.valueOf(i2));
            eVar.i(num);
            eVar.l("CTRecordingDetails-10017");
            eVar.q("CTRecordingFeedback");
            eVar.m(java.lang.Boolean.valueOf(z));
            qx2.z2 g = eVar.g();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "build(...)");
            j71.g.K(g, quxVar.a);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("feedBackFor");
        throw null;
    }

    public final void u0(java.lang.Object obj) {
        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "presenterView");
        ((com.truecaller.sdk.bar) this).a = gVar;
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(this, gVar, (df3.bar) null, 25), 3);
    }
}
