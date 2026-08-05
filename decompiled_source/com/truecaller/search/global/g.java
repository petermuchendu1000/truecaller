package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class g implements g.bar, ey2.qux, androidx.fragment.app.l1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.search.global.m b;

    public /* synthetic */ g(com.truecaller.search.global.m mVar, int i) {
        this.a = i;
        this.b = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.content.Context, com.truecaller.search.global.GlobalSearchResultActivity, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.truecaller.sdk.bar, com.truecaller.search.global.h0] */
    @Override // ey2.qux
    public void f(int i) {
        com.truecaller.search.global.i0 i0Var;
        nc0.a aVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        com.truecaller.search.global.a0 a0Var = this.b.i;
        if (a0Var != null) {
            ?? r2 = (com.truecaller.search.global.h0) a0Var;
            nc0.a aVar2 = r2.q;
            com.truecaller.search.global.d dVar = r2.l;
            com.truecaller.log.AssertionUtil.isNotNull(r2.a, new java.lang.String[0]);
            int h = r2.r0.h(i);
            if (h == 2131364293) {
                dVar.a.t(Integer.MAX_VALUE);
                com.truecaller.search.global.f fVar = dVar.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fVar, "contacts(...)");
                r2.r0 = fVar;
                r2.v2(2132021622);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ShowMore", "action");
                nc0.u1.e(new rc0.b("ShowMore", (java.lang.String) null, "Contacts"), aVar2);
                return;
            }
            if (h == 2131364294) {
                dVar.b.t(Integer.MAX_VALUE);
                com.truecaller.search.global.s0 s0Var = dVar.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s0Var, "groups(...)");
                r2.r0 = s0Var;
                r2.v2(2132021623);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ShowMore", "action");
                nc0.u1.e(new rc0.b("ShowMore", (java.lang.String) null, "Groups"), aVar2);
                return;
            }
            if (h == 2131364295) {
                dVar.c.t(Integer.MAX_VALUE);
                com.truecaller.search.global.x0 x0Var = dVar.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(x0Var, "messages(...)");
                r2.r0 = x0Var;
                r2.v2(2132021625);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ShowMore", "action");
                nc0.u1.e(new rc0.b("ShowMore", (java.lang.String) null, "Messages"), aVar2);
                return;
            }
            if (h == 2131364296) {
                dVar.a().t(Integer.MAX_VALUE);
                com.truecaller.search.global.b a = dVar.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "truecallerSearch(...)");
                r2.r0 = a;
                r2.v2(2132021626);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ShowMore", "action");
                nc0.u1.e(new rc0.b("ShowMore", (java.lang.String) null, "Truecaller"), aVar2);
                return;
            }
            if (h == 2131364282) {
                r2.m2(r2.d2(h, i), com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.PHONE_BOOK);
                return;
            }
            if (h == 2131364283) {
                if (r2.p0) {
                    com.truecaller.search.global.i0 i0Var2 = (com.truecaller.search.global.i0) r2.a;
                    if (i0Var2 != null) {
                        ((com.truecaller.search.global.m) i0Var2).y.a((java.lang.Object) null, (ea.c) null);
                    }
                } else {
                    com.truecaller.messaging.data.types.Conversation conversation = (com.truecaller.messaging.data.types.Conversation) r2.b0.get(r2.r0.e(i));
                    com.truecaller.search.global.i0 i0Var3 = (com.truecaller.search.global.i0) r2.a;
                    if (i0Var3 != null) {
                        long j = conversation.a;
                        com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) i0Var3;
                        android.content.Intent intent = new android.content.Intent((android.content.Context) mVar.getActivity(), (java.lang.Class<?>) com.truecaller.messaging.conversation.ConversationActivity.class);
                        intent.putExtra("conversation_id", j);
                        intent.putExtra("launch_source", "globalSearch");
                        mVar.startActivity(intent);
                    }
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("searchResults", "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("message", "action");
                aVar2.d(new rc0.b("message", (java.lang.String) null, "searchResults"));
                return;
            }
            if (h == 2131364291) {
                r2.m2(r2.d2(h, i), com.truecaller.analytics.common.event.ViewActionEvent.DetailsSubAction.TRUECALLER);
                return;
            }
            if (h == 2131364288) {
                if (r2.p0) {
                    com.truecaller.search.global.i0 i0Var4 = (com.truecaller.search.global.i0) r2.a;
                    if (i0Var4 != null) {
                        ((com.truecaller.search.global.m) i0Var4).y.a((java.lang.Object) null, (ea.c) null);
                    }
                    aVar = aVar2;
                    str = "message";
                    str5 = "context";
                    str3 = "action";
                    str6 = "searchResults";
                } else {
                    com.truecaller.messaging.data.types.Message message = (com.truecaller.messaging.data.types.Message) r2.c0.get(r2.r0.e(i));
                    com.truecaller.search.global.i0 i0Var5 = (com.truecaller.search.global.i0) r2.a;
                    aVar = aVar2;
                    if (i0Var5 == null) {
                        str = "message";
                        str2 = "context";
                        str3 = "action";
                        str4 = "searchResults";
                    } else {
                        long j2 = message.b;
                        str = "message";
                        long j3 = message.a;
                        str2 = "context";
                        str3 = "action";
                        long i2 = message.e.i();
                        int i3 = message.t;
                        com.truecaller.search.global.m mVar2 = (com.truecaller.search.global.m) i0Var5;
                        str4 = "searchResults";
                        android.content.Intent intent2 = new android.content.Intent((android.content.Context) mVar2.getActivity(), (java.lang.Class<?>) com.truecaller.messaging.conversation.ConversationActivity.class);
                        intent2.putExtra("conversation_id", j2);
                        intent2.putExtra("message_id", j3);
                        intent2.putExtra("message_date", i2);
                        intent2.putExtra("launch_source", "globalSearch");
                        intent2.putExtra("filter", i3);
                        mVar2.startActivity(intent2);
                    }
                    if (r2.I.i.a.a("featureInsightsSearchSmartCards", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        wt.l lVar = r2.H;
                        long j4 = message.a;
                        java.lang.String str7 = r2.e0;
                        int e = r2.r0.e(i);
                        lVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "searchToken");
                        vu1.baz z = lVar.z(e, str7, "click", j4);
                        if (z != null) {
                            ((zr1.g) lVar.c).e(z);
                        }
                    }
                    str5 = str2;
                    str6 = str4;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, str5);
                java.lang.String str8 = str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, str3);
                aVar.d(new rc0.b(str8, (java.lang.String) null, str6));
                return;
            }
            if (h == 2131364292) {
                com.truecaller.log.AssertionUtil.isNotNull(r2.X, new java.lang.String[0]);
                ?? r0 = r2.X;
                if (r0 != 0) {
                    r0.l0.d(r0, com.truecaller.wizard.api.WizardStartContext.GLOBAL_SEARCH);
                    r0.w0();
                    r0.finish();
                    return;
                }
                return;
            }
            if (h == 2131364286) {
                dVar.a().h = true;
                com.truecaller.search.global.i0 i0Var6 = (com.truecaller.search.global.i0) r2.a;
                if (i0Var6 != null) {
                    ((com.truecaller.search.global.m) i0Var6).c6();
                }
                r2.y2(0L, true);
                nc0.u1.e(uf.qux.p("SearchInTruecaller", "action", "SearchInTruecaller", (java.lang.String) null, "globalSearch"), aVar2);
                return;
            }
            if (h == 2131364284) {
                com.truecaller.search.global.i0 i0Var7 = (com.truecaller.search.global.i0) r2.a;
                if (i0Var7 != null) {
                    com.truecaller.search.global.m mVar3 = (com.truecaller.search.global.m) i0Var7;
                    qo1.v vVar = mVar3.t;
                    if (vVar != null) {
                        if (vVar.b()) {
                            com.truecaller.search.global.i1 i1Var = mVar3.u;
                            if (i1Var != null) {
                                c2.a aVar3 = new c2.a(mVar3, 25);
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar3, "callback");
                                ((sw2.b) i1Var.e.getValue()).c(new c2.a(aVar3, 26));
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("searchPermissionUtil");
                            throw null;
                        }
                        g.baz bazVar = mVar3.x;
                        qw2.a0 a0Var2 = mVar3.n;
                        if (a0Var2 != null) {
                            bazVar.a(((qw2.b0) a0Var2).g(), (ea.c) null);
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("tcPermissionUtil");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.Intrinsics.n("userGrowthFeaturesInventory");
                    throw null;
                }
                return;
            }
            if (h == 2131364290 && (i0Var = (com.truecaller.search.global.i0) r2.a) != null) {
                com.truecaller.search.global.m mVar4 = (com.truecaller.search.global.m) i0Var;
                mVar4.startActivity(com.truecaller.messaging.defaultsms.DefaultSmsActivity.t0(mVar4.requireContext(), "search-nonDmaBanner"));
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
        throw null;
    }

    public void h(android.os.Bundle bundle, java.lang.String str) {
        switch (this.a) {
            case 3:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<unused var>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "<unused var>");
                this.b.w = false;
                return;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<unused var>");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "<unused var>");
                this.b.w = true;
                return;
        }
    }

    public void onActivityResult(java.lang.Object obj) {
        boolean n;
        switch (this.a) {
            case 0:
                com.truecaller.search.global.m mVar = this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.util.Map) obj, "it");
                com.truecaller.search.global.a0 a0Var = mVar.i;
                if (a0Var != null) {
                    qo1.v vVar = mVar.t;
                    if (vVar != null) {
                        if (vVar.b()) {
                            com.truecaller.search.global.i1 i1Var = mVar.u;
                            if (i1Var != null) {
                                n = i1Var.f.a();
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("searchPermissionUtil");
                                throw null;
                            }
                        } else {
                            qw2.a0 a0Var2 = mVar.n;
                            if (a0Var2 != null) {
                                n = ((qw2.b0) a0Var2).n();
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("tcPermissionUtil");
                                throw null;
                            }
                        }
                        ((com.truecaller.search.global.h0) a0Var).k2(n);
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("userGrowthFeaturesInventory");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                throw null;
            default:
                com.truecaller.search.global.m mVar2 = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.truecaller.search.global.a0 a0Var3 = mVar2.i;
                if (a0Var3 != null) {
                    com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) a0Var3;
                    if (booleanValue) {
                        h0Var.p0 = false;
                        h0Var.C2(h0Var.e0);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                throw null;
        }
    }
}
