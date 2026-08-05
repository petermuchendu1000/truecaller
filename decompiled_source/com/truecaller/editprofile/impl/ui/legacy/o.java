package com.truecaller.editprofile.impl.ui.legacy;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class o extends rf3.qux {
    public final /* synthetic */ int b;
    public final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, java.lang.Object obj, java.lang.Object obj2) {
        super(obj);
        this.b = i;
        this.c = obj2;
    }

    public final void afterChange(kotlin.reflect.KProperty kProperty, java.lang.Object obj, java.lang.Object obj2) {
        com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource businessCallReasonSource;
        java.lang.String value;
        com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource businessCallReasonSource2;
        java.lang.String value2;
        kotlin.collections.h0 c;
        kotlin.collections.h0 c2;
        kotlin.collections.h0 c3;
        kotlin.collections.h0 c4;
        int i = this.b;
        java.lang.Object obj3 = this.c;
        switch (i) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                com.truecaller.editprofile.impl.ui.legacy.s sVar = (com.truecaller.editprofile.impl.ui.legacy.s) obj3;
                if (!kotlin.jvm.internal.Intrinsics.b((com.truecaller.editprofile.impl.ui.legacy.i) obj2, sVar.u)) {
                    com.truecaller.editprofile.impl.ui.legacy.h hVar = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                    if (hVar != null) {
                        java.lang.String h = sVar.g.h(2132020774, new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                        com.truecaller.editprofile.impl.ui.legacy.d dVar = (com.truecaller.editprofile.impl.ui.legacy.d) hVar;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "text");
                        dVar.p6(h, dVar.h0);
                        return;
                    }
                    return;
                }
                com.truecaller.editprofile.impl.ui.legacy.h hVar2 = (com.truecaller.editprofile.impl.ui.legacy.h) ((com.truecaller.sdk.bar) sVar).a;
                if (hVar2 != null) {
                    com.truecaller.common.ui.button.ProgressButton e6 = ((com.truecaller.editprofile.impl.ui.legacy.d) hVar2).e6();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e6, "<get-saveLoaderButton>(...)");
                    gj.m.f0(e6);
                    return;
                }
                return;
            case 1:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, com.truecaller.ui.r0.b)).c((com.truecaller.ui.s0) obj3);
                return;
            case 2:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, com.truecaller.ui.r0.c)).c((com.truecaller.ui.e1) obj3);
                return;
            case 3:
                ei0.f0 f0Var = (ei0.f0) obj3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                if (!kotlin.jvm.internal.Intrinsics.b((java.lang.String) obj, (java.lang.String) obj2) && ((qo1.a) ((qo1.qux) f0Var.b.get())).b.a("featureBizAnalyticRevamp", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    fg3.h0.J(androidx.lifecycle.g1.l(f0Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ei0.d0(f0Var, (df3.bar) null, 0), 3);
                    return;
                }
                return;
            case 4:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                ((gc2.g4) obj3).notifyDataSetChanged();
                return;
            case 5:
                ih0.baz bazVar = (ih0.baz) obj3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                java.lang.String str = (java.lang.String) obj2;
                if (!kotlin.jvm.internal.Intrinsics.b((java.lang.String) obj, str)) {
                    tp2.bar barVar = (tp2.bar) bazVar.e.get();
                    f6.v0 v0Var = bazVar.h;
                    if (v0Var != null) {
                        com.truecaller.searchwarnings.data.analytics.BusinessCallReasonContext businessCallReasonContext = (com.truecaller.searchwarnings.data.analytics.BusinessCallReasonContext) v0Var.b;
                        int i2 = ih0.bar.a[bazVar.i.ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                businessCallReasonSource = com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource.PRIORITY;
                            } else {
                                throw new java.lang.IllegalArgumentException("Call reason badge should be either verified business or priority");
                            }
                        } else {
                            businessCallReasonSource = com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource.VERIFIED_BUSINESS;
                        }
                        barVar.a(businessCallReasonContext, businessCallReasonSource, str);
                        if (((qo1.a) ((qo1.qux) bazVar.f.get())).b.a("featureBizAnalyticRevamp", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            java.lang.Object obj4 = bazVar.g.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                            hg0.b bVar = (hg0.b) obj4;
                            f6.v0 v0Var2 = bazVar.h;
                            if (v0Var2 != null) {
                                if (v0Var2 instanceof ih0.e) {
                                    value = com.truecaller.bizmon.analytic.BizmonAnalyticContext.DETAILS_VIEW_CALL_REASON.getValue();
                                } else if (v0Var2 instanceof ih0.b) {
                                    value = com.truecaller.bizmon.analytic.BizmonAnalyticContext.POPUP_CALLER_ID_CALL_REASON.getValue();
                                } else if (v0Var2 instanceof ih0.qux) {
                                    value = com.truecaller.bizmon.analytic.BizmonAnalyticContext.FACS_ACS_CALL_REASON.getValue();
                                } else if (v0Var2 instanceof ih0.a) {
                                    value = com.truecaller.bizmon.analytic.BizmonAnalyticContext.PACS_ACS_CALL_REASON.getValue();
                                } else {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String str2 = value;
                                f6.v0 v0Var3 = bazVar.h;
                                if (v0Var3 != null) {
                                    java.lang.String str3 = ((ih0.d) v0Var3.c).a;
                                    java.lang.String str4 = (java.lang.String) bazVar.j.getValue(bazVar, ih0.baz.k[0]);
                                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                                    f6.v0 v0Var4 = bazVar.h;
                                    if (v0Var4 != null) {
                                        boolean z = v0Var4 instanceof ih0.b;
                                        ih0.d dVar2 = (ih0.d) v0Var4.c;
                                        h8.s0.h(bVar, str2, str3, str4, (java.lang.String) null, (java.lang.String) null, bool, (java.lang.String) null, (java.lang.String) null, (com.truecaller.bizmon.analytic.SearchInitiatedFrom) null, (java.lang.Boolean) null, z, (java.lang.Integer) null, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.k, dVar2.j, dVar2.l, dVar2.m, 392952);
                                        return;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("config");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("config");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("config");
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("config");
                    throw null;
                }
                return;
            case 6:
                ih0.g gVar = (ih0.g) obj3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                java.lang.String str5 = (java.lang.String) obj2;
                if (!kotlin.jvm.internal.Intrinsics.b((java.lang.String) obj, str5)) {
                    tp2.bar barVar2 = gVar.f;
                    f6.v0 v0Var5 = gVar.k;
                    if (v0Var5 != null) {
                        com.truecaller.searchwarnings.data.analytics.BusinessCallReasonContext businessCallReasonContext2 = (com.truecaller.searchwarnings.data.analytics.BusinessCallReasonContext) v0Var5.b;
                        int i3 = ih0.f.a[gVar.l.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                businessCallReasonSource2 = com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource.VERIFIED_BUSINESS;
                            } else {
                                throw new java.lang.IllegalArgumentException("Call reason badge should be either verified business or priority");
                            }
                        } else {
                            businessCallReasonSource2 = com.truecaller.searchwarnings.data.analytics.BusinessCallReasonSource.PRIORITY;
                        }
                        barVar2.a(businessCallReasonContext2, businessCallReasonSource2, str5);
                        if (((qo1.a) gVar.h).b.a("featureBizAnalyticRevamp", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            hg0.b bVar2 = gVar.i;
                            f6.v0 v0Var6 = gVar.k;
                            if (v0Var6 != null) {
                                if (v0Var6 instanceof ih0.e) {
                                    value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.DETAILS_VIEW_CALL_REASON.getValue();
                                } else if (v0Var6 instanceof ih0.b) {
                                    value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.POPUP_CALLER_ID_CALL_REASON.getValue();
                                } else if (v0Var6 instanceof ih0.qux) {
                                    value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.FACS_ACS_CALL_REASON.getValue();
                                } else if (v0Var6 instanceof ih0.a) {
                                    value2 = com.truecaller.bizmon.analytic.BizmonAnalyticContext.PACS_ACS_CALL_REASON.getValue();
                                } else {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String str6 = value2;
                                f6.v0 v0Var7 = gVar.k;
                                if (v0Var7 != null) {
                                    java.lang.String str7 = ((ih0.d) v0Var7.c).a;
                                    java.lang.String str8 = (java.lang.String) gVar.o.getValue(gVar, ih0.g.p[0]);
                                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                                    f6.v0 v0Var8 = gVar.k;
                                    if (v0Var8 != null) {
                                        boolean z2 = v0Var8 instanceof ih0.b;
                                        java.lang.Integer num = (java.lang.Integer) v0Var8.d;
                                        ih0.d dVar3 = (ih0.d) v0Var8.c;
                                        h8.s0.h(bVar2, str6, str7, str8, (java.lang.String) null, (java.lang.String) null, bool2, (java.lang.String) null, (java.lang.String) null, (com.truecaller.bizmon.analytic.SearchInitiatedFrom) null, (java.lang.Boolean) null, z2, num, dVar3.d, dVar3.e, dVar3.f, dVar3.g, dVar3.k, dVar3.j, dVar3.l, dVar3.m, 130808);
                                        return;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("config");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("config");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("config");
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("config");
                    throw null;
                }
                return;
            case 7:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar(kotlin.collections.y.k((qv2.bar) obj), kotlin.collections.y.k((qv2.bar) obj2), lv2.baz.b)).c((lv2.qux) obj3);
                return;
            case 8:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, lv2.baz.c)).c((lv2.b) obj3);
                return;
            case 9:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                if (!booleanValue2) {
                    c = kotlin.collections.h0.a;
                } else if (booleanValue2) {
                    c = kotlin.collections.x.c(java.lang.Boolean.TRUE);
                } else {
                    throw new java.lang.RuntimeException();
                }
                if (!booleanValue) {
                    c2 = kotlin.collections.h0.a;
                } else if (booleanValue) {
                    c2 = kotlin.collections.x.c(java.lang.Boolean.TRUE);
                } else {
                    throw new java.lang.RuntimeException();
                }
                androidx.recyclerview.widget.a.a(new u31.bar(c, c2, lv2.baz.d)).c((lv2.d) obj3);
                return;
            case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                boolean booleanValue3 = ((java.lang.Boolean) obj2).booleanValue();
                boolean booleanValue4 = ((java.lang.Boolean) obj).booleanValue();
                if (!booleanValue4) {
                    c3 = kotlin.collections.h0.a;
                } else if (booleanValue4) {
                    c3 = kotlin.collections.x.c(java.lang.Boolean.TRUE);
                } else {
                    throw new java.lang.RuntimeException();
                }
                if (!booleanValue3) {
                    c4 = kotlin.collections.h0.a;
                } else if (booleanValue3) {
                    c4 = kotlin.collections.x.c(java.lang.Boolean.TRUE);
                } else {
                    throw new java.lang.RuntimeException();
                }
                androidx.recyclerview.widget.a.a(new u31.bar(c3, c4, lv2.baz.e)).c((lv2.f) obj3);
                return;
            case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.ArrayList) obj, (java.util.ArrayList) obj2, oy2.baz.a)).c((oy2.qux) obj3);
                return;
            case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, qu2.qux.a)).c((qu2.a) obj3);
                return;
            case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, qv2.qux.a)).c((qv2.a) obj3);
                return;
            case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, uu2.b.a)).c((uu2.c) obj3);
                return;
            case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                com.truecaller.messaging.views.ChatSwitchView.G((com.truecaller.messaging.views.ChatSwitchView) obj3, (com.truecaller.messaging.views.Switch) obj2);
                return;
            case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, yt2.baz.b)).c((yt2.qux) obj3);
                return;
            case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, yt2.baz.c)).c((yt2.c) obj3);
                return;
            case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar(kotlin.collections.x.c(kProperty), kotlin.collections.x.c((java.util.List) obj), za1.p.b)).c((za1.q) obj3);
                return;
            case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar(kotlin.collections.y.k((java.lang.String) obj), kotlin.collections.y.k((java.lang.String) obj2), za1.p.c)).c((za1.s) obj3);
                return;
            case 20:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                androidx.recyclerview.widget.a.a(new u31.bar((java.util.List) obj, (java.util.List) obj2, za1.p.d)).c((za1.a0) obj3);
                return;
            default:
                zp2.e eVar = (zp2.e) obj3;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "property");
                com.truecaller.searchwarnings.data.SearchWarningViewModel searchWarningViewModel = (com.truecaller.searchwarnings.data.SearchWarningViewModel) obj2;
                com.truecaller.searchwarnings.data.SearchWarningViewModel searchWarningViewModel2 = (com.truecaller.searchwarnings.data.SearchWarningViewModel) obj;
                if (searchWarningViewModel != null && !kotlin.jvm.internal.Intrinsics.b(searchWarningViewModel2, searchWarningViewModel)) {
                    ak0.qux quxVar = eVar.f;
                    a8.d dVar4 = eVar.h;
                    if (dVar4 != null) {
                        int i4 = dVar4.a;
                        com.truecaller.searchwarnings.data.analytics.SearchWarningSource searchWarningSource = (com.truecaller.searchwarnings.data.analytics.SearchWarningSource) dVar4.b;
                        java.lang.String id = searchWarningViewModel.getId();
                        java.lang.String ruleId = searchWarningViewModel.getRuleId();
                        java.lang.String ruleName = searchWarningViewModel.getRuleName();
                        a8.d dVar5 = eVar.h;
                        if (dVar5 != null) {
                            java.lang.String d2 = zp2.e.d2(dVar5);
                            quxVar.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchWarningSource, "source");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d2, "context");
                            hi3.e eVar2 = new hi3.e(qx2.ld.j, qx2.ld.k);
                            bi3.j0[] j0VarArr = eVar2.b;
                            bi3.j0 j0Var = j0VarArr[2];
                            ((qx2.p5) eVar2).h = "Shown";
                            boolean[] zArr = eVar2.c;
                            zArr[2] = true;
                            bi3.j0 j0Var2 = j0VarArr[3];
                            ((qx2.p5) eVar2).i = d2;
                            zArr[3] = true;
                            bi3.j0 j0Var3 = j0VarArr[4];
                            ((qx2.p5) eVar2).e = i4;
                            zArr[4] = true;
                            hi3.e.d(j0VarArr[5], id);
                            ((qx2.p5) eVar2).f = id;
                            zArr[5] = true;
                            java.lang.String name = searchWarningSource.name();
                            hi3.e.d(j0VarArr[6], name);
                            ((qx2.p5) eVar2).g = name;
                            zArr[6] = true;
                            hi3.e.d(j0VarArr[7], ruleId);
                            ((qx2.p5) eVar2).j = ruleId;
                            zArr[7] = true;
                            if (ruleName == null) {
                                ruleName = "Unknown";
                            }
                            bi3.j0 j0Var4 = j0VarArr[8];
                            ((qx2.p5) eVar2).k = ruleName;
                            zArr[8] = true;
                            qx2.ld e = eVar2.e();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(e, "build(...)");
                            j71.g.K(e, quxVar.a);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("config");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("config");
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, java.lang.Object obj, boolean z) {
        super((java.lang.Object) null);
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(java.lang.Object obj, int i) {
        super("");
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(lv2.d dVar) {
        super(r0);
        this.b = 9;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.c = dVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(lv2.f fVar) {
        super(r0);
        this.b = 10;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.c = fVar;
    }
}
