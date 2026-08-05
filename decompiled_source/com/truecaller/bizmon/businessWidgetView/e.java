package com.truecaller.bizmon.businessWidgetView;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class e extends of0.baz implements wg0.c {
    public final kotlin.coroutines.CoroutineContext d;
    public final kotlin.coroutines.CoroutineContext e;
    public final qc3.bar f;
    public final qc3.bar g;
    public final qc3.bar h;
    public final qc3.bar i;
    public final qc3.bar j;
    public final qc3.bar k;
    public final qc3.bar l;
    public com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig m;
    public final java.util.HashSet n;
    public com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord o;
    public qh0.bar p;
    public p23.f q;
    public com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizCallMeBackState r;
    public com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState s;
    public com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizVideoState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, qc3.bar barVar4, qc3.bar barVar5, qc3.bar barVar6, qc3.bar barVar7) {
        super(coroutineContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "uiContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext2, "asyncContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bizMonCallMeBackManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "bizCallSurveyManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "videoPlayerConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar4, "bizVideoButtonAnalyticHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar5, "bizmonFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar6, "bizCallSurveySettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar7, "resourceProvider");
        this.d = coroutineContext;
        this.e = coroutineContext2;
        this.f = barVar;
        this.g = barVar2;
        this.h = barVar3;
        this.i = barVar4;
        this.j = barVar5;
        this.k = barVar6;
        this.l = barVar7;
        this.n = new java.util.HashSet();
        this.r = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizCallMeBackState.DISABLED;
        this.s = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.DISABLED;
        this.t = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizVideoState.DISABLED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a5, code lost:
    
        if (r1 != null) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c2(com.truecaller.bizmon.businessWidgetView.e eVar, ff3.qux quxVar) {
        wg0.e eVar2;
        int i;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig;
        int i2;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig2;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Object obj;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig3;
        java.lang.Object obj2;
        kotlin.Unit unit;
        com.truecaller.bizmon.businessWidgetView.qux quxVar2;
        int i3;
        qc3.bar barVar = eVar.j;
        java.util.HashSet hashSet = eVar.n;
        if (quxVar instanceof wg0.e) {
            eVar2 = (wg0.e) quxVar;
            int i4 = eVar2.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar2.B = i4 - Integer.MIN_VALUE;
                java.lang.Object obj3 = eVar2.z;
                java.lang.Object obj4 = ef3.bar.a;
                i = eVar2.B;
                int i5 = 1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj3);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = eVar2.y;
                    bizViewAcsConfig = eVar2.x;
                    od.p.E(obj3);
                } else {
                    od.p.E(obj3);
                    bizViewAcsConfig = eVar.m;
                    kotlin.jvm.internal.Intrinsics.e(bizViewAcsConfig, "null cannot be cast to non-null type com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig");
                    eVar.r = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizCallMeBackState.DISABLED;
                    eVar.s = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.DISABLED;
                    eVar.t = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizVideoState.DISABLED;
                    hashSet.clear();
                    com.truecaller.bizmon.businessWidgetView.qux quxVar3 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                    if (quxVar3 != null) {
                        ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar3).j();
                    }
                    eVar2.x = bizViewAcsConfig;
                    eVar2.y = 0;
                    eVar2.B = 1;
                    if (eVar.d2(eVar2) == obj4) {
                        return obj4;
                    }
                    i2 = 0;
                }
                bizViewAcsConfig2 = eVar.m;
                if (bizViewAcsConfig2 == null) {
                    z = java.lang.Boolean.valueOf(bizViewAcsConfig2.c).equals(java.lang.Boolean.TRUE);
                } else {
                    z = false;
                }
                if (!z && ((qo1.qux) barVar.get()).b.a("featureBizPacsCallFeedbackSingleView", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG) && eVar.r == com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizCallMeBackState.DISABLED && eVar.t == com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizVideoState.DISABLED && eVar.s == com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.ENABLED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    com.truecaller.bizmon.businessWidgetView.qux quxVar4 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                    if (quxVar4 != null && eVar.p != null) {
                        com.truecaller.data.entity.Contact contact = bizViewAcsConfig.a;
                        boolean z4 = bizViewAcsConfig.f;
                        boolean z5 = bizViewAcsConfig.c;
                        int i6 = bizViewAcsConfig.d;
                        boolean z6 = bizViewAcsConfig.e;
                        if (i6 == 1) {
                            if (z6) {
                                i5 = 7;
                            }
                            i3 = i5;
                        } else {
                            i3 = i6;
                        }
                        ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar4).l(contact, i3, bizViewAcsConfig.b, g2(z5, z4), com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.AUTO, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.LETS_START, com.truecaller.bizmon.callSurvey.BizSurveyScreen.PACS, f2(z5, z4).getValue());
                    }
                    if (((qo1.qux) barVar.get()).b.a("featureBizFeedbackStackForMPACS", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                        com.truecaller.bizmon.businessWidgetView.qux quxVar5 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                        if (quxVar5 != null) {
                            ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar5).g();
                        }
                        com.truecaller.bizmon.businessWidgetView.qux quxVar6 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                        if (quxVar6 != null) {
                            ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar6).h(bizViewAcsConfig.c);
                        }
                        eVar.h2(bizViewAcsConfig);
                    }
                } else if (!z2) {
                    com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig4 = eVar.m;
                    if (bizViewAcsConfig4 != null) {
                        z3 = java.lang.Boolean.valueOf(bizViewAcsConfig4.c).equals(java.lang.Boolean.FALSE);
                    } else {
                        z3 = false;
                    }
                    if (z3 && (quxVar2 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a) != null) {
                        ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar2).n();
                    }
                    if (eVar.o != null) {
                        hashSet.add(0);
                        com.truecaller.bizmon.businessWidgetView.qux quxVar7 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                        if (quxVar7 != null) {
                            ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar7).m(bizViewAcsConfig);
                        }
                        if (bizViewAcsConfig.c) {
                            com.truecaller.bizmon.businessWidgetView.qux quxVar8 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                            if (quxVar8 != null) {
                                quxVar8.setCMBPACSBackground(bi3.a.s(((u03.f0) eVar.l.get()).a, 2130970621));
                                unit = kotlin.Unit.a;
                            }
                            unit = null;
                        } else if (((qo1.qux) barVar.get()).d()) {
                            com.truecaller.bizmon.businessWidgetView.qux quxVar9 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                            if (quxVar9 != null) {
                                quxVar9.setCMBFACSBackground(2131231449);
                                unit = kotlin.Unit.a;
                            }
                            unit = null;
                        } else {
                            com.truecaller.bizmon.businessWidgetView.qux quxVar10 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                            if (quxVar10 != null) {
                                quxVar10.setCMBFACSBackground(2131231448);
                                unit = kotlin.Unit.a;
                            }
                            unit = null;
                        }
                    }
                    com.truecaller.bizmon.businessWidgetView.qux quxVar11 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                    if (quxVar11 != null) {
                        ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar11).g();
                        kotlin.Unit unit2 = kotlin.Unit.a;
                    }
                    if (eVar.s == com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.DISABLED) {
                        com.truecaller.bizmon.businessWidgetView.qux quxVar12 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                        if (quxVar12 != null) {
                            ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar12).h(bizViewAcsConfig.c);
                        }
                    } else {
                        qh0.bar barVar2 = eVar.p;
                        if (barVar2 != null) {
                            java.lang.String str = barVar2.a;
                            boolean z7 = bizViewAcsConfig.c;
                            com.truecaller.data.entity.Contact contact2 = bizViewAcsConfig.a;
                            boolean z8 = bizViewAcsConfig.f;
                            if (z7) {
                                hashSet.add(1);
                                com.truecaller.bizmon.businessWidgetView.qux quxVar13 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                                if (quxVar13 != null) {
                                    ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar13).o(contact2, str, g2(true, z8), f2(true, z8).getValue());
                                }
                            } else {
                                com.truecaller.bizmon.businessWidgetView.qux quxVar14 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) eVar).a;
                                if (quxVar14 != null) {
                                    java.lang.String g2 = g2(false, z8);
                                    java.lang.String value = f2(false, z8).getValue();
                                    com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = (com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar14;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "analyticSource");
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "appViewVisitedV2Context");
                                    com.truecaller.bizmon.callSurvey.mvp.surveyButton.StartBizCallSurveyButtonView startBizCallSurveyButtonView = bizFeatureViewsContainer.i;
                                    if (startBizCallSurveyButtonView != null) {
                                        gj.m.j0(startBizCallSurveyButtonView);
                                        obj = obj4;
                                        dh0.p pVar = new dh0.p(startBizCallSurveyButtonView, 1);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "analyticSource");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "appViewVisitedV2Context");
                                        gj.m.j0(startBizCallSurveyButtonView);
                                        startBizCallSurveyButtonView.f = pVar;
                                        fi0.s sVar = startBizCallSurveyButtonView.d;
                                        sVar.c.setOnClickListener(startBizCallSurveyButtonView);
                                        sVar.d.setOnClickListener(startBizCallSurveyButtonView);
                                        ((sh0.e) startBizCallSurveyButtonView.getPresenter()).e2(contact2, str, g2, value);
                                        startBizCallSurveyButtonView.setTakeSurveyClickListener(new v6.g(bizFeatureViewsContainer));
                                        eVar.l2(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.AUTO, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.LETS_START, str);
                                        eVar2.x = null;
                                        eVar2.y = i2;
                                        eVar2.B = 2;
                                        bizViewAcsConfig3 = eVar.m;
                                        if (bizViewAcsConfig3 != null && (java.lang.Boolean.valueOf(bizViewAcsConfig3.c).equals(java.lang.Boolean.FALSE) || !hashSet.containsAll(kotlin.collections.y.j(new java.lang.Integer[]{new java.lang.Integer(0), new java.lang.Integer(1)})))) {
                                            eVar.e2(bizViewAcsConfig3);
                                        }
                                        obj2 = obj;
                                        if (kotlin.Unit.a == obj2) {
                                            return obj2;
                                        }
                                    }
                                }
                                obj = obj4;
                                eVar.l2(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction.AUTO, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType.LETS_START, str);
                                eVar2.x = null;
                                eVar2.y = i2;
                                eVar2.B = 2;
                                bizViewAcsConfig3 = eVar.m;
                                if (bizViewAcsConfig3 != null) {
                                    eVar.e2(bizViewAcsConfig3);
                                }
                                obj2 = obj;
                                if (kotlin.Unit.a == obj2) {
                                }
                            }
                        }
                    }
                    obj = obj4;
                    eVar2.x = null;
                    eVar2.y = i2;
                    eVar2.B = 2;
                    bizViewAcsConfig3 = eVar.m;
                    if (bizViewAcsConfig3 != null) {
                    }
                    obj2 = obj;
                    if (kotlin.Unit.a == obj2) {
                    }
                } else {
                    throw new java.lang.RuntimeException();
                }
                return kotlin.Unit.a;
            }
        }
        eVar2 = new wg0.e(eVar, quxVar);
        java.lang.Object obj32 = eVar2.z;
        java.lang.Object obj42 = ef3.bar.a;
        i = eVar2.B;
        int i52 = 1;
        if (i == 0) {
        }
        bizViewAcsConfig2 = eVar.m;
        if (bizViewAcsConfig2 == null) {
        }
        if (!z) {
        }
        z2 = false;
        if (!z2) {
        }
        return kotlin.Unit.a;
    }

    public static com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context f2(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context.NEO_PACS;
            }
            return com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context.NEO_FACS;
        }
        if (z) {
            return com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context.PACS;
        }
        return com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context.FACS;
    }

    public static java.lang.String g2(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource.NEO_PACS_V2_CALL_SURVEY.getValue();
            }
            return com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource.NEO_FACS_V2_CALL_SURVEY.getValue();
        }
        if (z) {
            return com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource.PACS_V2_CALL_SURVEY.getValue();
        }
        return com.truecaller.bizmon.callSurvey.analytic.BizCallSurveySource.FACS_V2_CALL_SURVEY.getValue();
    }

    public static void k2(com.truecaller.bizmon.businessWidgetView.e eVar, com.truecaller.bizmon.analytic.BizVideoButtonAction bizVideoButtonAction) {
        com.truecaller.bizmon.analytic.BizVideoButtonContext bizVideoButtonContext;
        java.lang.String str;
        com.truecaller.data.country.CountryListDto.bar b;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig = eVar.m;
        if (bizViewAcsConfig == null) {
            return;
        }
        boolean z = bizViewAcsConfig.c;
        if (bizViewAcsConfig.f) {
            if (z) {
                bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.NEO_PACS_V2;
            } else {
                bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.NEO_FACS_V2;
            }
        } else if (z) {
            bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.PACS_V2;
        } else {
            bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.FACS_V2;
        }
        hg0.baz bazVar = (hg0.baz) eVar.i.get();
        java.lang.String str2 = bizViewAcsConfig.b;
        hg0.qux quxVar = (hg0.qux) bazVar;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizVideoButtonContext, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizVideoButtonAction, "action");
        java.lang.String str3 = null;
        if (str2 != null && (b = ((com.truecaller.data.country.g) quxVar.b.get()).b(str2)) != null) {
            str = b.d;
        } else {
            str = null;
        }
        nc0.bar barVar = (nc0.bar) quxVar.a.get();
        if (str2 != null) {
            str3 = f0.qux.P(str2);
        }
        ((nc0.a) barVar).d(new hg0.bar(bizVideoButtonContext, bizVideoButtonAction, str, str3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d2(ff3.qux quxVar) {
        wg0.d dVar;
        java.lang.Object obj;
        ef3.bar barVar;
        int i;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig;
        boolean a;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig;
        int i4;
        int i5;
        int i6;
        java.lang.Object W;
        qh0.bar barVar2;
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig2;
        com.truecaller.bizmon.businessWidgetView.e eVar;
        if (quxVar instanceof wg0.d) {
            dVar = (wg0.d) quxVar;
            int i7 = dVar.D;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dVar.D = i7 - Integer.MIN_VALUE;
                obj = dVar.B;
                barVar = ef3.bar.a;
                i = dVar.D;
                kotlin.coroutines.CoroutineContext coroutineContext = this.e;
                int i8 = 1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    eVar = dVar.z;
                                    od.p.E(obj);
                                    eVar.q = (p23.f) obj;
                                    if (this.q != null) {
                                        this.t = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizVideoState.ENABLED;
                                    }
                                    return kotlin.Unit.a;
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            i4 = dVar.A;
                            barVar2 = dVar.y;
                            bizMultiViewConfig2 = dVar.x;
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue() && barVar2 != null) {
                                if (((qo1.qux) this.j.get()).b.a("featureBizFeedbackStackForMPACS", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                                    qc3.bar barVar3 = this.k;
                                    ((yh0.bar) barVar3.get()).g0("biz_call_survey__active_request_id", barVar2.e);
                                    ((yh0.bar) barVar3.get()).g0("biz_call_survey_active_survey_id", barVar2.a);
                                    ((yh0.bar) barVar3.get()).g0("biz_call_survey_active_survey_call_id", barVar2.d);
                                }
                                this.s = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.ENABLED;
                            }
                            com.truecaller.bizmon.businessWidgetView.a aVar = new com.truecaller.bizmon.businessWidgetView.a(this, bizMultiViewConfig2, null);
                            dVar.x = null;
                            dVar.y = null;
                            dVar.z = this;
                            dVar.A = i4;
                            dVar.D = 4;
                            obj = fg3.h0.W(coroutineContext, aVar, dVar);
                            if (obj != barVar) {
                                eVar = this;
                                eVar.q = (p23.f) obj;
                                if (this.q != null) {
                                }
                                return kotlin.Unit.a;
                            }
                            return barVar;
                        }
                        i4 = dVar.A;
                        bizMultiViewConfig = dVar.x;
                        od.p.E(obj);
                        qh0.bar barVar4 = (qh0.bar) obj;
                        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig2 = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) bizMultiViewConfig;
                        dVar.x = bizMultiViewConfig;
                        dVar.y = barVar4;
                        dVar.A = i4;
                        dVar.D = 3;
                        com.truecaller.data.entity.Contact contact = bizViewAcsConfig2.a;
                        i5 = bizViewAcsConfig2.d;
                        java.lang.String str = bizViewAcsConfig2.b;
                        kh0.qux quxVar2 = (kh0.qux) this.g.get();
                        boolean z5 = bizViewAcsConfig2.e;
                        if (i5 != 1) {
                            if (z5) {
                                i8 = 7;
                            }
                            i6 = i8;
                        } else {
                            i6 = i5;
                        }
                        W = fg3.h0.W(quxVar2.g, new ag2.h(str, quxVar2, contact, bizViewAcsConfig2.c, i6, (df3.bar) null), dVar);
                        if (W != barVar) {
                            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig bizMultiViewConfig3 = bizMultiViewConfig;
                            barVar2 = barVar4;
                            obj = W;
                            bizMultiViewConfig2 = bizMultiViewConfig3;
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                if (((qo1.qux) this.j.get()).b.a("featureBizFeedbackStackForMPACS", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                                }
                                this.s = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizSurveyState.ENABLED;
                            }
                            com.truecaller.bizmon.businessWidgetView.a aVar2 = new com.truecaller.bizmon.businessWidgetView.a(this, bizMultiViewConfig2, null);
                            dVar.x = null;
                            dVar.y = null;
                            dVar.z = this;
                            dVar.A = i4;
                            dVar.D = 4;
                            obj = fg3.h0.W(coroutineContext, aVar2, dVar);
                            if (obj != barVar) {
                            }
                        }
                        return barVar;
                    }
                    i3 = dVar.A;
                    ?? r11 = dVar.x;
                    od.p.E(obj);
                    bizViewAcsConfig = r11;
                } else {
                    od.p.E(obj);
                    bizViewAcsConfig = this.m;
                    if (bizViewAcsConfig != null) {
                        xg0.f fVar = (xg0.f) this.f.get();
                        com.truecaller.data.entity.Contact contact2 = bizViewAcsConfig.a;
                        boolean z6 = bizViewAcsConfig.c;
                        qc3.bar barVar5 = fVar.d;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                        if (z6) {
                            a = ((qo1.qux) barVar5.get()).b.a("featureBizPACSCallMeBackForBusinesses", com.truecaller.featuretoggles.FeatureState.DISABLED);
                        } else {
                            a = ((qo1.qux) barVar5.get()).b.a("featureBizFACSCallMeBackForBusinesses", com.truecaller.featuretoggles.FeatureState.DISABLED);
                        }
                        i2 = 0;
                        if (a) {
                            java.lang.String str2 = contact2.I;
                            if (str2 != null && str2.length() != 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (!z4 && i71.g.G(contact2)) {
                                z = true;
                                if (z) {
                                    int i9 = bizViewAcsConfig.d;
                                    boolean z7 = bizViewAcsConfig.e;
                                    if (3 != i9 && (1 != i9 || !z7)) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        z2 = true;
                                        if (z2) {
                                            java.lang.String str3 = bizViewAcsConfig.b;
                                            dVar.x = bizViewAcsConfig;
                                            dVar.A = 0;
                                            dVar.D = 1;
                                            obj = fg3.h0.W(coroutineContext, new uz.f(this, str3, (df3.bar) null), dVar);
                                            if (obj != barVar) {
                                                i3 = 0;
                                                bizViewAcsConfig = bizViewAcsConfig;
                                            }
                                            return barVar;
                                        }
                                        dVar.x = bizViewAcsConfig;
                                        dVar.A = i2;
                                        dVar.D = 2;
                                        obj = j2(bizViewAcsConfig, dVar);
                                        if (obj != barVar) {
                                            bizMultiViewConfig = bizViewAcsConfig;
                                            i4 = i2;
                                            qh0.bar barVar42 = (qh0.bar) obj;
                                            com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig22 = (com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig) bizMultiViewConfig;
                                            dVar.x = bizMultiViewConfig;
                                            dVar.y = barVar42;
                                            dVar.A = i4;
                                            dVar.D = 3;
                                            com.truecaller.data.entity.Contact contact3 = bizViewAcsConfig22.a;
                                            i5 = bizViewAcsConfig22.d;
                                            java.lang.String str4 = bizViewAcsConfig22.b;
                                            kh0.qux quxVar22 = (kh0.qux) this.g.get();
                                            boolean z52 = bizViewAcsConfig22.e;
                                            if (i5 != 1) {
                                            }
                                            W = fg3.h0.W(quxVar22.g, new ag2.h(str4, quxVar22, contact3, bizViewAcsConfig22.c, i6, (df3.bar) null), dVar);
                                            if (W != barVar) {
                                            }
                                        }
                                        return barVar;
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                                dVar.x = bizViewAcsConfig;
                                dVar.A = i2;
                                dVar.D = 2;
                                obj = j2(bizViewAcsConfig, dVar);
                                if (obj != barVar) {
                                }
                                return barVar;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                        z2 = false;
                        if (z2) {
                        }
                        dVar.x = bizViewAcsConfig;
                        dVar.A = i2;
                        dVar.D = 2;
                        obj = j2(bizViewAcsConfig, dVar);
                        if (obj != barVar) {
                        }
                        return barVar;
                    }
                    return kotlin.Unit.a;
                }
                if (obj != null) {
                    this.r = com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainerMvp$BizCallMeBackState.ENABLED;
                }
                i2 = i3;
                dVar.x = bizViewAcsConfig;
                dVar.A = i2;
                dVar.D = 2;
                obj = j2(bizViewAcsConfig, dVar);
                if (obj != barVar) {
                }
                return barVar;
            }
        }
        dVar = new wg0.d(this, quxVar);
        obj = dVar.B;
        barVar = ef3.bar.a;
        i = dVar.D;
        kotlin.coroutines.CoroutineContext coroutineContext2 = this.e;
        int i82 = 1;
        if (i == 0) {
        }
        if (obj != null) {
        }
        i2 = i3;
        dVar.x = bizViewAcsConfig;
        dVar.A = i2;
        dVar.D = 2;
        obj = j2(bizViewAcsConfig, dVar);
        if (obj != barVar) {
        }
        return barVar;
    }

    public final void e2(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig) {
        com.truecaller.bizmon.analytic.BizVideoButtonContext bizVideoButtonContext;
        com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId bizAppViewVisitedV2ViewId;
        java.util.HashSet hashSet = this.n;
        if (!hashSet.contains(2)) {
            p23.f fVar = this.q;
            if (fVar != null) {
                hashSet.add(2);
                k2(this, com.truecaller.bizmon.analytic.BizVideoButtonAction.SHOW_VIDEO_BUTTON);
                com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig2 = this.m;
                if (bizViewAcsConfig2 != null) {
                    hg0.baz bazVar = (hg0.baz) this.i.get();
                    boolean z = bizViewAcsConfig2.c;
                    if (z) {
                        bizAppViewVisitedV2ViewId = com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId.BIZ_LANDSCAPE_VIDEO;
                    } else {
                        bizAppViewVisitedV2ViewId = com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId.BIZ_VIDEO_BUTTON;
                    }
                    java.lang.String value = bizAppViewVisitedV2ViewId.getValue();
                    java.lang.String value2 = f2(z, bizViewAcsConfig2.f).getValue();
                    hg0.qux quxVar = (hg0.qux) bazVar;
                    quxVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "viewId");
                    java.lang.Object obj = quxVar.a.get();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    nc0.bar barVar = (nc0.bar) obj;
                    if (value2 == null) {
                        value2 = "";
                    }
                    bd.bar.u(barVar, value, value2);
                }
                boolean z2 = bizViewAcsConfig.c;
                if (bizViewAcsConfig.f) {
                    if (z2) {
                        bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.NEO_PACS_V2;
                    } else {
                        bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.NEO_FACS_V2;
                    }
                } else if (z2) {
                    bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.PACS_V2;
                } else {
                    bizVideoButtonContext = com.truecaller.bizmon.analytic.BizVideoButtonContext.FACS_V2;
                }
                java.lang.String value3 = bizVideoButtonContext.getValue();
                kotlin.Unit unit = null;
                if (bizViewAcsConfig.c) {
                    com.truecaller.bizmon.businessWidgetView.qux quxVar2 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) this).a;
                    if (quxVar2 != null) {
                        ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar2).p(fVar, value3);
                        unit = kotlin.Unit.a;
                    }
                } else {
                    com.truecaller.bizmon.businessWidgetView.qux quxVar3 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) this).a;
                    if (quxVar3 != null) {
                        com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer bizFeatureViewsContainer = (com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar3;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "videoConfig");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value3, "analyticContext");
                        android.widget.Button button = bizFeatureViewsContainer.j;
                        if (button != null) {
                            gj.m.j0(button);
                            button.setOnClickListener(new wg0.qux(bizFeatureViewsContainer, 0));
                        }
                        unit = kotlin.Unit.a;
                    }
                }
                if (unit != null) {
                    return;
                }
            }
            h2(bizViewAcsConfig);
        }
    }

    public final void h2(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig) {
        android.widget.Button button;
        if (bizViewAcsConfig.c) {
            com.truecaller.bizmon.businessWidgetView.qux quxVar = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) this).a;
            if (quxVar != null) {
                ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar).i();
                return;
            }
            return;
        }
        com.truecaller.bizmon.businessWidgetView.qux quxVar2 = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) this).a;
        if (quxVar2 != null && (button = ((com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) quxVar2).j) != null) {
            gj.m.f0(button);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object j2(com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig, ff3.qux quxVar) {
        com.truecaller.bizmon.businessWidgetView.b bVar;
        int i;
        com.truecaller.bizmon.businessWidgetView.e eVar;
        if (quxVar instanceof com.truecaller.bizmon.businessWidgetView.b) {
            bVar = (com.truecaller.bizmon.businessWidgetView.b) quxVar;
            int i2 = bVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = bVar.A;
                if (i == 0) {
                    if (i == 1) {
                        eVar = bVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    kh0.qux quxVar2 = (kh0.qux) this.g.get();
                    com.truecaller.data.entity.Contact contact = bizViewAcsConfig.a;
                    int i3 = bizViewAcsConfig.d;
                    boolean z = bizViewAcsConfig.e;
                    if (i3 == 1) {
                        if (z) {
                            i3 = 7;
                        } else {
                            i3 = 1;
                        }
                    }
                    java.lang.String str = bizViewAcsConfig.b;
                    bVar.x = this;
                    bVar.A = 1;
                    obj = fg3.h0.W(quxVar2.g, new be1.w(str, quxVar2, i3, (df3.bar) null), bVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                    eVar = this;
                }
                eVar.p = (qh0.bar) obj;
                return this.p;
            }
        }
        bVar = new com.truecaller.bizmon.businessWidgetView.b(this, quxVar);
        java.lang.Object obj2 = bVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = bVar.A;
        if (i == 0) {
        }
        eVar.p = (qh0.bar) obj2;
        return this.p;
    }

    public final void l2(com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyAction bizCallSurveyAction, com.truecaller.bizmon.callSurvey.analytic.BizCallSurveyActionType bizCallSurveyActionType, java.lang.String str) {
        com.truecaller.bizmon.callSurvey.BizSurveyScreen bizSurveyScreen;
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyAction, "surveyAction");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyActionType, "surveyActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "surveyId");
        com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig bizViewAcsConfig = this.m;
        kotlin.jvm.internal.Intrinsics.e(bizViewAcsConfig, "null cannot be cast to non-null type com.truecaller.bizmon.businessWidgetView.BizMultiViewConfig.BizViewAcsConfig");
        boolean z = bizViewAcsConfig.f;
        boolean z2 = bizViewAcsConfig.c;
        ua1.g gVar = (com.truecaller.bizmon.businessWidgetView.qux) ((com.truecaller.sdk.bar) this).a;
        if (gVar != null) {
            android.os.Parcelable parcelable = bizViewAcsConfig.a;
            int i = bizViewAcsConfig.d;
            boolean z3 = bizViewAcsConfig.e;
            if (i == 1) {
                if (z3) {
                    i = 7;
                } else {
                    i = 1;
                }
            }
            java.lang.String str3 = bizViewAcsConfig.b;
            java.lang.String g2 = g2(z2, z);
            if (z2) {
                bizSurveyScreen = com.truecaller.bizmon.callSurvey.BizSurveyScreen.PACS;
            } else {
                bizSurveyScreen = com.truecaller.bizmon.callSurvey.BizSurveyScreen.FACS;
            }
            java.lang.String value = f2(z2, z).getValue();
            ua1.g gVar2 = (com.truecaller.bizmon.businessWidgetView.BizFeatureViewsContainer) gVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "analyticSource");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyAction, "surveyAction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizCallSurveyActionType, "surveyActionType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizSurveyScreen, "surveyScreen");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "appViewVisitedV2Context");
            androidx.fragment.app.Fragment v = mk.m.v(gVar2);
            com.truecaller.bizmon.callSurvey.BizSurveyScreen bizSurveyScreen2 = bizSurveyScreen;
            v.getChildFragmentManager().h0("close_action", v.getViewLifecycleOwner(), new q9.x(gVar2, 27));
            h02.qux quxVar = kh0.a.o;
            androidx.fragment.app.g1 childFragmentManager = v.getChildFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            java.lang.String value2 = bizCallSurveyAction.getValue();
            java.lang.String value3 = bizCallSurveyActionType.getValue();
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(childFragmentManager, "fragmentManager");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "analyticSource");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value2, "surveyAction");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value3, "surveyActionType");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "appViewVisitedV2Context");
            kh0.a aVar = new kh0.a();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("biz_contact", parcelable);
            bundle.putInt("call_type", i);
            bundle.putString("normalized_number", str3);
            bundle.putString("analyticSource", g2);
            bundle.putString("survey_action", value2);
            bundle.putString("survey_action_type", value3);
            if (bizSurveyScreen2 != null) {
                str2 = bizSurveyScreen2.getValue();
            } else {
                str2 = null;
            }
            bundle.putString("survey_context", str2);
            bundle.putString("appViewVistedV2Context", value);
            aVar.setArguments(bundle);
            if (childFragmentManager.G(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(kh0.a.class).getSimpleName()) == null) {
                f0.qux.m(childFragmentManager, aVar);
            }
        }
    }
}
