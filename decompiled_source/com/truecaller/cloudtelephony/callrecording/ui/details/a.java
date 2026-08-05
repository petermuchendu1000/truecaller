package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity b;

    public /* synthetic */ a(com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity, int i) {
        this.a = i;
        this.b = callRecordingDetailsActivity;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        w21.h hVar;
        w21.h hVar2;
        w21.h hVar3;
        w21.h hVar4;
        w21.h hVar5;
        w21.h hVar6;
        int i = this.a;
        com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity = this.b;
        switch (i) {
            case 0:
                w21.g gVar = (w21.g) obj;
                int i2 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "it");
                com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = callRecordingDetailsActivity.g0;
                if (nVar != null) {
                    kotlin.coroutines.CoroutineContext coroutineContext = nVar.m;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gVar, "result");
                    if (!kotlin.jvm.internal.Intrinsics.b(gVar, w21.b.a) && !kotlin.jvm.internal.Intrinsics.b(gVar, w21.a.a)) {
                        if (kotlin.jvm.internal.Intrinsics.b(gVar, w21.d.a)) {
                            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar2 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                            if (gVar2 != null && (hVar6 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar2).o0) != null) {
                                w41.bar barVar = hVar6.k;
                                if (barVar != null) {
                                    barVar.c.setVisibility(0);
                                    barVar.d.setVisibility(0);
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.b(gVar, w21.e.a)) {
                            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar3 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                            if (gVar3 != null && (hVar5 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar3).o0) != null) {
                                w41.bar barVar2 = hVar5.k;
                                if (barVar2 != null) {
                                    barVar2.c.setVisibility(0);
                                    barVar2.d.setVisibility(0);
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.b(gVar, w21.f.a)) {
                            com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack feedBack = com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBack.POSITIVE;
                            com.truecaller.cloudtelephony.callrecording.ui.feedback.FeedBackFor feedBackFor = nVar.s;
                            if (feedBackFor != null) {
                                nVar.h2(new i01.bar(feedBackFor, feedBack));
                                nVar.k2();
                                fg3.h0.J(nVar, coroutineContext, (fg3.f0) null, new com.truecaller.cloudtelephony.callrecording.ui.details.i(3, nVar, null), 2);
                                bd3.qux quxVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                                if (quxVar != null) {
                                    android.widget.Toast.makeText((android.content.Context) quxVar, 2132020797, 1).show();
                                }
                                com.truecaller.cloudtelephony.callrecording.ui.details.g gVar4 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                                if (gVar4 != null && (hVar4 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar4).o0) != null) {
                                    hVar4.dismiss();
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("feedBackFor");
                                throw null;
                            }
                        } else if (kotlin.jvm.internal.Intrinsics.b(gVar, w21.c.a)) {
                            nVar.w = true;
                            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar5 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                            if (gVar5 != null) {
                                java.lang.String d = nVar.o.a.d("callRecordingFeedBackForm_47488", "https://forms.gle/E3Nk2PETL4jRpaYB8");
                                com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity callRecordingDetailsActivity2 = (com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar5;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d, "url");
                                try {
                                    g.baz bazVar = callRecordingDetailsActivity2.h0;
                                    if (bazVar != null) {
                                        bazVar.a(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(d)), (ea.c) null);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("feedBackActivityResultLauncher");
                                        throw null;
                                    }
                                } catch (java.lang.Exception unused) {
                                    com.truecaller.cloudtelephony.callrecording.ui.details.n nVar2 = callRecordingDetailsActivity2.g0;
                                    if (nVar2 != null) {
                                        bd3.qux quxVar2 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar2).a;
                                        if (quxVar2 != null) {
                                            android.widget.Toast.makeText((android.content.Context) quxVar2, 2132020797, 1).show();
                                        }
                                        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar6 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar2).a;
                                        if (gVar6 != null && (hVar3 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar6).o0) != null) {
                                            hVar3.dismiss();
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("presenter");
                                        throw null;
                                    }
                                }
                            }
                            com.truecaller.cloudtelephony.callrecording.ui.details.g gVar7 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                            if (gVar7 != null && (hVar2 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar7).o0) != null) {
                                hVar2.dismiss();
                            }
                            nVar.j2();
                            nVar.k2();
                            fg3.h0.J(nVar, coroutineContext, (fg3.f0) null, new com.truecaller.cloudtelephony.callrecording.ui.details.i(4, nVar, null), 2);
                        } else {
                            throw new java.lang.RuntimeException();
                        }
                    } else {
                        com.truecaller.cloudtelephony.callrecording.ui.details.g gVar8 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                        if (gVar8 != null && (hVar = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar8).o0) != null) {
                            hVar.dismiss();
                        }
                        nVar.j2();
                        nVar.k2();
                        fg3.h0.J(nVar, coroutineContext, (fg3.f0) null, new com.truecaller.cloudtelephony.callrecording.ui.details.i(2, nVar, null), 2);
                    }
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            default:
                java.lang.String str = (java.lang.String) obj;
                int i3 = com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity.r0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "currentPlaybackSpeed");
                b91.c cVar = c01.baz.n;
                androidx.fragment.app.g1 supportFragmentManager = callRecordingDetailsActivity.getSupportFragmentManager();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                com.truecaller.cloudtelephony.callrecording.ui.details.d dVar = new com.truecaller.cloudtelephony.callrecording.ui.details.d(callRecordingDetailsActivity);
                cVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportFragmentManager, "fragmentManager");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "currentPlaybackSpeed");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "listener");
                new c01.baz(str, dVar).show(supportFragmentManager, (java.lang.String) null);
                return kotlin.Unit.a;
        }
    }
}
