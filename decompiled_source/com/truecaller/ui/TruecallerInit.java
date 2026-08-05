package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u0010B\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u001a²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"}, d2 = {"Lcom/truecaller/ui/TruecallerInit;", "Lcom/truecaller/ui/FragmentActivityBase;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lpt2/bar;", "Lcom/truecaller/common/ui/k;", "Lf41/baz;", "Lr20/d;", "La70/f;", "Lcom/razorpay/PaymentResultWithDataListener;", "Lr82/j0;", "Lcom/truecaller/ui/r2;", "Lnc0/f1;", "", "Lif1/f;", "Lif1/g;", "Lp41/baz;", "Ltx0/m;", "<init>", "()V", "", "isVisible", "isExpanded", "Lhp1/baz;", "navigationItemsState", "", "selectedTabIndexState", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TruecallerInit extends com.truecaller.ui.Hilt_TruecallerInit implements com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, pt2.bar, com.truecaller.common.ui.k, f41.baz, r20.d, a70.f, com.razorpay.PaymentResultWithDataListener, r82.j0, com.truecaller.ui.r2, nc0.f1, if1.f, if1.g, p41.baz, tx0.m {
    public static final /* synthetic */ int y1 = 0;
    public javax.inject.Provider A0;
    public qc3.bar B0;
    public qc3.bar C0;
    public qc3.bar D0;
    public qc3.bar E0;
    public qc3.bar F0;
    public qc3.bar G0;
    public qc3.bar H0;
    public qc3.bar I0;
    public qc3.bar J0;
    public qc3.bar K0;
    public ah.n L0;
    public ah.f M0;
    public com.google.common.collect.ImmutableSet N0;
    public qc3.bar O0;
    public qc3.bar P0;
    public qc3.bar Q0;
    public cd3.b R0;
    public tx.d S0;
    public final androidx.lifecycle.o1 T0;
    public qc3.bar U0;
    public hc.bar V0;
    public if1.bar W0;
    public b81.z X0;
    public qc3.bar Y0;
    public qc3.bar Z0;
    public qc3.bar a1;
    public qc3.bar b1;
    public qc3.bar c1;
    public qc3.bar d1;
    public jw0.bar e1;
    public qc3.bar f1;
    public final androidx.lifecycle.o1 g1;
    public final androidx.lifecycle.o1 h1;
    public final androidx.lifecycle.o1 i1;
    public qc3.bar j0;
    public final androidx.lifecycle.o1 j1;
    public qc3.bar k0;
    public java.lang.Boolean k1;
    public qc3.bar l0;
    public final androidx.lifecycle.o1 l1;
    public qc3.bar m0;
    public final ig3.h2 m1;
    public tx.v n0;
    public final ig3.h2 n1;
    public qc3.bar o0;
    public final co.t o1;
    public qc3.bar p0;
    public final g.baz p1;
    public qc3.bar q0;
    public com.truecaller.common.ui.o q1;
    public qc3.bar r0;
    public boolean r1;
    public javax.inject.Provider s0;
    public int s1;
    public javax.inject.Provider t0;
    public mk.e t1;
    public javax.inject.Provider u0;
    public java.lang.String u1;
    public javax.inject.Provider v0;
    public com.truecaller.ui.view.SearchBarView v1;
    public javax.inject.Provider w0;
    public d91.e w1;
    public javax.inject.Provider x0;
    public int x1;
    public cd3.bar y0;
    public tx.v z0;

    public TruecallerInit() {
        com.truecaller.ui.p2 p2Var = new com.truecaller.ui.p2(this, 3);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.T0 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(ef1.bar.class), new com.truecaller.ui.p2(this, 12), p2Var, new com.truecaller.ui.p2(this, 13));
        this.g1 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(df1.c.class), new com.truecaller.ui.p2(this, 14), new com.truecaller.ui.p2(this, 4), new com.truecaller.ui.p2(this, 15));
        this.h1 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(com.truecaller.ui.q0.class), new com.truecaller.ui.p2(this, 16), new com.truecaller.ui.p2(this, 5), new com.truecaller.ui.p2(this, 17));
        this.i1 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(hv0.m.class), new com.truecaller.ui.p2(this, 6), new com.truecaller.ui.p2(this, 0), new com.truecaller.ui.p2(this, 7));
        this.j1 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(if1.baz.class), new com.truecaller.ui.p2(this, 8), new com.truecaller.ui.p2(this, 1), new com.truecaller.ui.p2(this, 9));
        this.l1 = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(cn1.i.class), new com.truecaller.ui.p2(this, 10), new com.truecaller.ui.p2(this, 2), new com.truecaller.ui.p2(this, 11));
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.m1 = ig3.w1.c(bool);
        this.n1 = ig3.w1.c(bool);
        this.o1 = new co.t(this, 9);
        this.p1 = registerForActivityResult(new s32.a("inbox"), new com.truecaller.ui.v1(this, 0));
        this.u1 = "appOpen";
    }

    public static final boolean h1(v2.t0 t0Var) {
        return ((java.lang.Boolean) t0Var.getValue()).booleanValue();
    }

    public static void i1(kotlin.jvm.functions.Function1 function1, android.view.View view) {
        if (view.isAttachedToWindow()) {
            to1.e eVar = new to1.e(26, new java.lang.Object(), function1);
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.m(view, eVar);
            u6.z1 a = u6.l0.a(view);
            if (a != null) {
                u6.t0.c(view, a);
                return;
            } else {
                u6.i0.c(view);
                return;
            }
        }
        view.addOnAttachStateChangeListener(new com.google.android.gms.internal.ads.o6(view, 1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0092, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x006e, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object w0(com.truecaller.ui.TruecallerInit truecallerInit, ff3.qux quxVar) {
        com.truecaller.ui.h2 h2Var;
        java.lang.Object obj;
        int i;
        androidx.compose.ui.platform.ComposeView composeView;
        int i2;
        qc3.bar barVar;
        int i3;
        if (quxVar instanceof com.truecaller.ui.h2) {
            h2Var = (com.truecaller.ui.h2) quxVar;
            int i4 = h2Var.B;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                h2Var.B = i4 - Integer.MIN_VALUE;
                obj = h2Var.z;
                java.lang.Object obj2 = ef3.bar.a;
                i = h2Var.B;
                boolean z = false;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                i3 = h2Var.y;
                                od.p.E(obj);
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    if (i3 != 0) {
                                        z = true;
                                    }
                                    com.ironsource.adqualitysdk.sdk.i.bar.A(!z, truecallerInit.n1, (java.lang.Object) null);
                                    d91.e eVar = truecallerInit.w1;
                                    if (eVar != null) {
                                        eVar.j.setContent(new d3.qux(20138084, new com.truecaller.ui.w1(truecallerInit, 2), true));
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                } else {
                                    truecallerInit.q1(16);
                                }
                                truecallerInit.m1();
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        int i5 = !((java.lang.Boolean) obj).booleanValue() ? 1 : 0;
                        h2Var.y = i5;
                        h2Var.B = 3;
                        java.lang.Object X0 = truecallerInit.X0(h2Var);
                        if (X0 != obj2) {
                            i3 = i5;
                            obj = X0;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                            }
                            truecallerInit.m1();
                            return kotlin.Unit.a;
                        }
                        return obj2;
                    }
                    composeView = h2Var.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    if (((sw0.qux) truecallerInit.I0()).b()) {
                        return kotlin.Unit.a;
                    }
                    d91.e eVar2 = truecallerInit.w1;
                    if (eVar2 != null) {
                        composeView = eVar2.j;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(composeView, "familyProtectOnboarding");
                        h2Var.x = composeView;
                        h2Var.B = 1;
                        obj = truecallerInit.X0(h2Var);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                composeView.setVisibility(i2);
                h2Var.x = null;
                h2Var.B = 2;
                barVar = truecallerInit.Q0;
                if (barVar == null) {
                    obj = ((pj1.bar) barVar.get()).h(h2Var);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("familyGroupApi");
                    throw null;
                }
            }
        }
        h2Var = new com.truecaller.ui.h2(truecallerInit, quxVar);
        obj = h2Var.z;
        java.lang.Object obj22 = ef3.bar.a;
        i = h2Var.B;
        boolean z2 = false;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        composeView.setVisibility(i2);
        h2Var.x = null;
        h2Var.B = 2;
        barVar = truecallerInit.Q0;
        if (barVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object x0(com.truecaller.ui.TruecallerInit truecallerInit, ff3.qux quxVar) {
        com.truecaller.ui.o2 o2Var;
        int i;
        boolean booleanValue;
        if (quxVar instanceof com.truecaller.ui.o2) {
            o2Var = (com.truecaller.ui.o2) quxVar;
            int i2 = o2Var.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o2Var.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = o2Var.x;
                java.lang.Object obj2 = ef3.bar.a;
                i = o2Var.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    d91.e eVar = truecallerInit.w1;
                    if (eVar != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = eVar.c;
                        com.truecaller.ui.v1 v1Var = new com.truecaller.ui.v1(truecallerInit, 2);
                        java.util.WeakHashMap weakHashMap = u6.t0.a;
                        u6.k0.m(constraintLayout, v1Var);
                        o2Var.z = 1;
                        obj = truecallerInit.X0(o2Var);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                truecallerInit.z0(truecallerInit.d0, booleanValue);
                if (booleanValue) {
                    d91.e eVar2 = truecallerInit.w1;
                    if (eVar2 != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = eVar2.c;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mainConstraintLayout");
                        android.view.ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                        if (layoutParams != null) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.topMargin = 0;
                            constraintLayout2.setLayoutParams(marginLayoutParams);
                            d91.e eVar3 = truecallerInit.w1;
                            if (eVar3 != null) {
                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = eVar3.c;
                                java.util.WeakHashMap weakHashMap2 = u6.t0.a;
                                u6.k0.m(constraintLayout3, (u6.v) null);
                                d91.e eVar4 = truecallerInit.w1;
                                if (eVar4 != null) {
                                    androidx.cardview.widget.CardView cardView = (com.truecaller.ui.view.SearchBarView) eVar4.s;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cardView, "searchBarView");
                                    i1(new com.truecaller.ui.c2(truecallerInit, 3), cardView);
                                    d91.e eVar5 = truecallerInit.w1;
                                    if (eVar5 != null) {
                                        androidx.compose.ui.platform.ComposeView composeView = eVar5.j;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(composeView, "familyProtectOnboarding");
                                        i1(new com.truecaller.ui.c2(truecallerInit, 4), composeView);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                return kotlin.Unit.a;
            }
        }
        o2Var = new com.truecaller.ui.o2(truecallerInit, quxVar);
        java.lang.Object obj3 = o2Var.x;
        java.lang.Object obj22 = ef3.bar.a;
        i = o2Var.z;
        if (i == 0) {
        }
        booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        truecallerInit.z0(truecallerInit.d0, booleanValue);
        if (booleanValue) {
        }
        return kotlin.Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (fg3.h0.r(100, r0) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0047, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object y0(com.truecaller.ui.TruecallerInit truecallerInit, com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType, com.truecaller.floatingtoolbar.api.CallHistoryTab.Type type, ff3.qux quxVar) {
        com.truecaller.ui.q2 q2Var;
        java.lang.Object obj;
        int i;
        boolean z;
        boolean z2;
        if (quxVar instanceof com.truecaller.ui.q2) {
            q2Var = (com.truecaller.ui.q2) quxVar;
            int i2 = q2Var.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2Var.B = i2 - Integer.MIN_VALUE;
                obj = q2Var.z;
                java.lang.Object obj2 = ef3.bar.a;
                i = q2Var.B;
                z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            truecallerInit.n1();
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    type = q2Var.y;
                    bottomBarButtonType = q2Var.x;
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    q2Var.x = bottomBarButtonType;
                    q2Var.y = type;
                    q2Var.B = 1;
                    obj = truecallerInit.X0(q2Var);
                }
                if (!((java.lang.Boolean) obj).booleanValue() && bottomBarButtonType == com.truecaller.bottombar.BottomBarButtonType.CALLS && type == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((sw0.qux) truecallerInit.I0()).b() || bottomBarButtonType != com.truecaller.bottombar.BottomBarButtonType.CALLS) {
                    z = false;
                }
                com.ironsource.adqualitysdk.sdk.i.bar.A(z2, truecallerInit.m1, (java.lang.Object) null);
                if (z2 && !z) {
                    truecallerInit.n1();
                    q2Var.x = null;
                    q2Var.y = null;
                    q2Var.B = 2;
                } else {
                    truecallerInit.m1();
                    return kotlin.Unit.a;
                }
            }
        }
        q2Var = new com.truecaller.ui.q2(truecallerInit, quxVar);
        obj = q2Var.z;
        java.lang.Object obj22 = ef3.bar.a;
        i = q2Var.B;
        z = true;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        z2 = false;
        if (((sw0.qux) truecallerInit.I0()).b()) {
        }
        z = false;
        com.ironsource.adqualitysdk.sdk.i.bar.A(z2, truecallerInit.m1, (java.lang.Object) null);
        if (z2) {
        }
        truecallerInit.m1();
        return kotlin.Unit.a;
    }

    public final boolean A0() {
        javax.inject.Provider provider = this.s0;
        if (provider != null) {
            if (((qo1.bar) provider.get()).b.a("featureAnchorAds", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG) && z62.d.p()) {
                return false;
            }
            return true;
        }
        kotlin.jvm.internal.Intrinsics.n("adsFeaturesInventory");
        throw null;
    }

    public final void B0(boolean z) {
        if (!z && H0().s() != com.truecaller.bottombar.BottomBarButtonType.CALLS) {
            return;
        }
        d91.e eVar = this.w1;
        if (eVar != null) {
            eVar.q.post(new com.amazon.aps.ads.util.adview.baz(23, eVar, this));
        } else {
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    public final void C0(float f) {
        d91.e eVar = this.w1;
        if (eVar != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.n;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "floatingToolbarGroup");
            d91.e eVar2 = this.w1;
            if (eVar2 != null) {
                android.view.View view = (com.google.android.material.floatingactionbutton.FloatingActionButton) eVar2.q;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(view, "floatingActionButton");
                java.util.Iterator it = kotlin.collections.y.j(new android.view.View[]{frameLayout, view}).iterator();
                while (it.hasNext()) {
                    ((android.view.View) it.next()).animate().translationY(f).setDuration(300L).start();
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0() {
        d91.e eVar = this.w1;
        if (eVar != null) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = eVar.q;
            android.view.ViewGroup.LayoutParams layoutParams = floatingActionButton.getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            e6.b bVar = (e6.b) layoutParams;
            bVar.l = null;
            bVar.k = null;
            bVar.f = -1;
            bVar.d = 0;
            bVar.c = 8388693;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
            bVar.setMarginEnd(ak.r0.r(16, this));
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
            ((android.view.ViewGroup.MarginLayoutParams) bVar).bottomMargin = ak.r0.r(20, this);
            floatingActionButton.setLayoutParams(bVar);
            floatingActionButton.setTranslationX(0.0f);
            floatingActionButton.setTranslationY(0.0f);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void E0() {
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, null, 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0() {
        boolean z;
        if (W0()) {
            if1.baz J0 = J0();
            ig3.h2 h2Var = J0.c;
            J0.b.getClass();
            final int i = 0;
            hp1.baz bazVar = new hp1.baz(kotlin.collections.y.j(new hp1.bar[]{new hp1.bar("Recents", 2131233094, 2131233094, (com.truecaller.floatingtoolbar.api.CallHistoryTab.Type) null), new hp1.bar("Contacts", 2131233433, 2131233434, com.truecaller.floatingtoolbar.api.CallHistoryTab.Type.Contacts), new hp1.bar("Favorites", 2131232635, 2131232636, com.truecaller.floatingtoolbar.api.CallHistoryTab.Type.Favorite)}));
            h2Var.getClass();
            h2Var.p((java.lang.Object) null, bazVar);
            B0(false);
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, null, 4), 3);
            if (H0().s() == com.truecaller.bottombar.BottomBarButtonType.CALLS) {
                z = true;
            } else {
                z = false;
            }
            if1.baz J02 = J0();
            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.g2(this, J02, (df3.bar) null), 3);
            d91.e eVar = this.w1;
            if (eVar != null) {
                androidx.compose.ui.platform.ComposeView composeView = eVar.i;
                composeView.setContent(new d3.qux(-572189399, new ce1.a(10, J02, this), true));
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
                composeView.setElevation(ak.r0.r(2, this));
                composeView.setOutlineProvider(new ar.baz(this, 1));
                composeView.setClipToOutline(false);
                android.view.View view = eVar.g;
                view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.truecaller.ui.y1
                    private final void a(android.view.View view2) {
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        switch (i) {
                            case 0:
                                int i2 = com.truecaller.ui.TruecallerInit.y1;
                                return;
                            case 1:
                                return;
                            case 2:
                                p22.b bVar = q52.o.i0;
                                return;
                            default:
                                kotlin.reflect.KProperty[] kPropertyArr = xy1.z.p;
                                if (view2 instanceof android.widget.TextView) {
                                    android.widget.TextView textView = (android.widget.TextView) view2;
                                    if (textView.getEllipsize() != null) {
                                        textView.setMaxLines(Integer.MAX_VALUE);
                                        textView.setEllipsize(null);
                                        return;
                                    } else {
                                        textView.setMaxLines(5);
                                        textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
                                        return;
                                    }
                                }
                                return;
                        }
                    }
                });
                view.setOnTouchListener(new bx.h(2));
                if (z) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.n;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "floatingToolbarGroup");
                    gj.m.j0(frameLayout);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    public final void G0() {
        boolean z = tx.a1.G;
        if (r11.bar.a().d()) {
            qc3.bar barVar = this.k0;
            if (barVar != null) {
                com.truecaller.ui.t2 t2Var = (com.truecaller.ui.t2) barVar.get();
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                t2Var.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(weakReference, "callback");
                fg3.h0.J(t2Var.g, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.data.country.f(t2Var, weakReference, (df3.bar) null, 18), 3);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("truecallerInitNotificationHelper");
            throw null;
        }
    }

    public final ah.f H0() {
        ah.f fVar = this.M0;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.Intrinsics.n("bottomBarManager");
        throw null;
    }

    public final jw0.bar I0() {
        jw0.bar barVar = this.e1;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("callLogApi");
        throw null;
    }

    public final if1.baz J0() {
        return (if1.baz) this.j1.getValue();
    }

    public final cf1.c K0() {
        if ("appOpen".equals(this.u1)) {
            return new cf1.c("AppStartup");
        }
        java.lang.String str = this.u1;
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (kotlin.text.StringsKt.N(lowerCase, "notification", false)) {
            return new nc0.n1();
        }
        java.lang.String str2 = this.u1;
        java.util.Locale locale2 = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        java.lang.String lowerCase2 = str2.toLowerCase(locale2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        if (kotlin.text.StringsKt.N(lowerCase2, "widget", false)) {
            return new cf1.c("Widget");
        }
        java.lang.String str3 = this.u1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "source");
        return new cf1.c(str3);
    }

    public final void L0(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_PLACEMENT);
        if (z62.d.p()) {
            javax.inject.Provider provider = this.s0;
            if (provider != null) {
                if (((qo1.bar) provider.get()).b.a("featureFloaterAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    d91.e eVar = this.w1;
                    if (eVar != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.m;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "floaterAdContainer");
                        if (frameLayout.getVisibility() == 8) {
                            return;
                        }
                        d91.e eVar2 = this.w1;
                        if (eVar2 != null) {
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) eVar2.m;
                            frameLayout2.setVisibility(8);
                            frameLayout2.removeAllViews();
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("adsFeaturesInventory");
            throw null;
        }
    }

    public final boolean W0() {
        if (this.Z0 != null) {
            return !((cg1.qux) r0.get()).a();
        }
        kotlin.jvm.internal.Intrinsics.n("defaultDialerPermissionHelper");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object X0(ff3.qux quxVar) {
        com.truecaller.ui.i2 i2Var;
        java.lang.Object obj;
        int i;
        com.truecaller.ui.TruecallerInit truecallerInit;
        boolean z;
        if (quxVar instanceof com.truecaller.ui.i2) {
            i2Var = (com.truecaller.ui.i2) quxVar;
            int i2 = i2Var.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i2Var.A = i2 - Integer.MIN_VALUE;
                obj = i2Var.y;
                ef3.bar barVar = ef3.bar.a;
                i = i2Var.A;
                boolean z2 = true;
                if (i == 0) {
                    if (i == 1) {
                        truecallerInit = i2Var.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (I0().b()) {
                        return java.lang.Boolean.FALSE;
                    }
                    java.lang.Boolean bool = this.k1;
                    if (bool != null) {
                        z2 = bool.booleanValue();
                        return java.lang.Boolean.valueOf(z2);
                    }
                    qc3.bar barVar2 = this.Q0;
                    if (barVar2 != null) {
                        pj1.bar barVar3 = (pj1.bar) barVar2.get();
                        i2Var.x = this;
                        i2Var.A = 1;
                        obj = barVar3.o(i2Var);
                        if (obj == barVar) {
                            return barVar;
                        }
                        truecallerInit = this;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("familyGroupApi");
                        throw null;
                    }
                }
                if (((pj1.baz) obj).c) {
                    qc3.bar barVar4 = truecallerInit.Y0;
                    if (barVar4 != null) {
                        if (!((hf1.a) barVar4.get()).a().d()) {
                            z = true;
                            truecallerInit.k1 = java.lang.Boolean.valueOf(z);
                            if (!z) {
                                z2 = false;
                            }
                            return java.lang.Boolean.valueOf(z2);
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("defaultDialerPermissionStrategy");
                        throw null;
                    }
                }
                z = false;
                truecallerInit.k1 = java.lang.Boolean.valueOf(z);
                if (!z) {
                }
                return java.lang.Boolean.valueOf(z2);
            }
        }
        i2Var = new com.truecaller.ui.i2(this, quxVar);
        obj = i2Var.y;
        ef3.bar barVar5 = ef3.bar.a;
        i = i2Var.A;
        boolean z22 = true;
        if (i == 0) {
        }
        if (((pj1.baz) obj).c) {
        }
        z = false;
        truecallerInit.k1 = java.lang.Boolean.valueOf(z);
        if (!z) {
        }
        return java.lang.Boolean.valueOf(z22);
    }

    public final void Y0() {
        if (!"notificationRevokedPermission".equals(this.u1) && !"notificationBlockedCall".equals(this.u1)) {
            return;
        }
        qc3.bar barVar = this.F0;
        if (barVar != null) {
            ((nc0.l1) barVar.get()).c(this.u1, "Opened", new qx2.mi("", "Body"));
        } else {
            kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if (t41.i0.b(r11.getApplicationContext(), r14) != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(android.content.Intent intent, boolean z) {
        java.lang.Object obj;
        com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs floatingToolbarTabs;
        qc3.bar barVar = this.l0;
        y91.baz bazVar = null;
        if (barVar != null) {
            com.truecaller.ui.u1 u1Var = (com.truecaller.ui.u1) barVar.get();
            com.truecaller.bottombar.BottomBarButtonType s = H0().s();
            w82.r1 r1Var = u1Var.c;
            boolean z2 = u1Var.e;
            com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType = u1Var.d;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "current");
            if (intent != null) {
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    s = (com.truecaller.bottombar.BottomBarButtonType) kotlin.collections.CollectionsKt.X(extras.getInt("ARG_FRAGMENT_ORDINAL", -1), com.truecaller.bottombar.BottomBarButtonType.getEntries());
                } else {
                    s = null;
                }
                java.lang.String action = intent.getAction();
                if (!"android.intent.action.DIAL".equals(action)) {
                    if ("android.intent.action.VIEW".equals(action)) {
                        t41.e0 e0Var = u1Var.b;
                        android.content.Context applicationContext = u1Var.a.getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        e0Var.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "context");
                    }
                    if (s == null) {
                        if (!z) {
                            s = null;
                        }
                        s = bottomBarButtonType;
                    } else if (s == com.truecaller.bottombar.BottomBarButtonType.BLOCKING) {
                    }
                }
                s = com.truecaller.bottombar.BottomBarButtonType.CALLS;
            }
            if (s != null) {
                H0().M(s);
            }
            int intExtra = intent.getIntExtra("ARG_FLOATING_TOOLBAR_TAB_ORDINAL", -1);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intExtra);
            if (intExtra == -1) {
                valueOf = null;
            }
            if (valueOf != null && (floatingToolbarTabs = (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) kotlin.collections.CollectionsKt.X(valueOf.intValue(), com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.getEntries())) != null) {
                J0().p(floatingToolbarTabs);
            }
            android.os.Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                int i = com.truecaller.ui.d2.a[H0().s().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        y91.bar barVar2 = com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView.Companion;
                        java.lang.String string = extras2.getString("subview");
                        barVar2.getClass();
                        java.util.Iterator it = com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView.getEntries().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.Intrinsics.b(((com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView) obj).getValue(), string)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView voicemailSubView = (com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView) obj;
                        if (voicemailSubView != null) {
                            java.lang.String string2 = extras2.getString("callId");
                            java.lang.String string3 = extras2.getString("source");
                            if (string3 == null) {
                                string3 = this.u1;
                            }
                            androidx.fragment.app.Fragment fragment = this.d0;
                            if (fragment instanceof y91.baz) {
                                bazVar = (y91.baz) fragment;
                            }
                            if (bazVar != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string3, "analyticsContext");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicemailSubView, "subview");
                                k53.s0 b6 = ((k53.x) bazVar).b6();
                                b6.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string3, "analyticsContext");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(voicemailSubView, "subview");
                                int i2 = k53.h0.a[voicemailSubView.ordinal()];
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        if (i2 != 3) {
                                            if (i2 == 4) {
                                                b6.u(string3, true);
                                            } else {
                                                throw new java.lang.RuntimeException();
                                            }
                                        } else {
                                            b6.u(string3, false);
                                        }
                                    } else if (string2 != null) {
                                        k53.s0.s(b6, string2, string3, 2);
                                    }
                                } else {
                                    b6.t(string3);
                                }
                            }
                        }
                    }
                } else {
                    java.lang.String string4 = extras2.getString("subview");
                    if (string4 != null) {
                        d91.e eVar = this.w1;
                        if (eVar != null) {
                            eVar.e.getView().post(new com.amazon.aps.ads.util.adview.baz(24, this, string4));
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                    }
                }
                if (!"android.intent.action.DIAL".equals(intent.getAction()) && !"android.intent.action.VIEW".equals(intent.getAction())) {
                    intent.removeExtra("ARG_FRAGMENT");
                    intent.removeExtra("ARG_FRAGMENT_ORDINAL");
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("trueCallerInitTabSelectHelper");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0093. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType, com.truecaller.floatingtoolbar.api.CallHistoryTab.Type type) {
        boolean z;
        java.lang.String str;
        com.truecaller.floatingtoolbar.api.CallHistoryTab.Type type2;
        boolean z2;
        java.lang.String stringExtra;
        androidx.fragment.app.Fragment hVar;
        boolean z3;
        java.lang.String str2;
        p41.bar barVar;
        java.lang.String str3;
        android.os.Bundle extras;
        java.lang.String str4;
        android.view.Menu menu;
        com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType2 = com.truecaller.bottombar.BottomBarButtonType.CALLS;
        final int i = 0;
        if (bottomBarButtonType != bottomBarButtonType2) {
            o1(false, false);
        } else {
            if (type == null) {
                z = true;
            } else {
                z = false;
            }
            o1(true, z);
            l1();
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable(this) { // from class: com.truecaller.ui.b2
                public final /* synthetic */ com.truecaller.ui.TruecallerInit b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    com.truecaller.ui.TruecallerInit truecallerInit = this.b;
                    switch (i2) {
                        case 0:
                            int i3 = com.truecaller.ui.TruecallerInit.y1;
                            qc3.bar barVar2 = truecallerInit.Z0;
                            if (barVar2 != null) {
                                if (((cg1.qux) barVar2.get()).a()) {
                                    df1.c cVar = (df1.c) truecallerInit.g1.getValue();
                                    cVar.getClass();
                                    fg3.h0.J(androidx.lifecycle.g1.l(cVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.call_assistant.presentation.disable.c(cVar, (df3.bar) null, 19), 3);
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("defaultDialerPermissionHelper");
                            throw null;
                        default:
                            com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType3 = com.truecaller.bottombar.BottomBarButtonType.CALLS;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType3, "button");
                            truecallerInit.a1(bottomBarButtonType3, null);
                            truecallerInit.F0();
                            truecallerInit.j1();
                            return;
                    }
                }
            });
        }
        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.e2(this, bottomBarButtonType, type, null, 1), 3);
        androidx.fragment.app.g1 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar2, "beginTransaction(...)");
        ((androidx.fragment.app.q1) barVar2).p = true;
        ((androidx.fragment.app.q1) barVar2).f = 0;
        java.lang.String name = bottomBarButtonType.name();
        if (type != null) {
            str = type.name();
        } else {
            str = null;
        }
        java.lang.String str5 = "";
        if (str == null) {
            str = "";
        }
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G(h0.b.Q(name, str));
        if (G != null && ((!this.r1 || bottomBarButtonType != bottomBarButtonType2) && (bottomBarButtonType != bottomBarButtonType2 || W0()))) {
            z3 = true;
        } else {
            switch (com.truecaller.ui.d2.a[bottomBarButtonType.ordinal()]) {
                case 1:
                    type2 = type;
                    z2 = false;
                    G = new zm0.bar();
                    if (G != null) {
                        java.lang.String name2 = bottomBarButtonType.name();
                        if (type2 != null) {
                            str2 = type2.name();
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str5 = str2;
                        }
                        z3 = true;
                        barVar2.f(2131364006, G, h0.b.Q(name2, str5), 1);
                    } else {
                        z3 = true;
                    }
                    this.r1 = z2;
                    break;
                case 2:
                    type2 = type;
                    z2 = false;
                    qc3.bar barVar3 = this.I0;
                    if (barVar3 != null) {
                        ((b53.bar) barVar3.get()).getClass();
                        G = new k53.x();
                        if (G != null) {
                        }
                        this.r1 = z2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("voicemailNavigator");
                        throw null;
                    }
                    break;
                case 3:
                    z2 = false;
                    qc3.bar barVar4 = this.Y0;
                    if (barVar4 != null) {
                        hf1.baz a = ((hf1.a) barVar4.get()).a();
                        if (a.d()) {
                            d91.e eVar = this.w1;
                            if (eVar != null) {
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.n;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "floatingToolbarGroup");
                                frameLayout.setVisibility(8);
                                E0();
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        } else if (!I0().b()) {
                            type2 = type;
                            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.e2(this, bottomBarButtonType, type2, null, 0), 3);
                            stringExtra = getIntent().getStringExtra("AppUserInteraction.Context");
                            if (stringExtra == null) {
                                stringExtra = this.u1;
                            }
                            G = a.r(type2, stringExtra);
                            if (G != null) {
                            }
                            this.r1 = z2;
                            break;
                        }
                        type2 = type;
                        stringExtra = getIntent().getStringExtra("AppUserInteraction.Context");
                        if (stringExtra == null) {
                        }
                        G = a.r(type2, stringExtra);
                        if (G != null) {
                        }
                        this.r1 = z2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("defaultDialerPermissionStrategy");
                        throw null;
                    }
                    break;
                case 4:
                    z2 = false;
                    qc3.bar barVar5 = this.d1;
                    if (barVar5 != null) {
                        if (((f02.baz) barVar5.get()).a()) {
                            G = new j02.f();
                        } else {
                            G = new t22.k0();
                        }
                        type2 = type;
                        if (G != null) {
                        }
                        this.r1 = z2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("businessHomeFeatureHelper");
                        throw null;
                    }
                    break;
                case 5:
                    z2 = false;
                    qc3.bar barVar6 = this.H0;
                    if (barVar6 != null) {
                        uq2.baz bazVar = (uq2.baz) barVar6.get();
                        com.truecaller.settings.api.SettingsSource settingsSource = com.truecaller.settings.api.SettingsSource.BOTTOM_BAR;
                        bazVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("blocking_tab", "analyticsContext");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsSource, "source");
                        com.truecaller.settings.impl.ui.block.BlockSettingsFragment.d0.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("blocking_tab", "analyticsContext");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settingsSource, "source");
                        androidx.fragment.app.Fragment blockSettingsFragment = new com.truecaller.settings.impl.ui.block.BlockSettingsFragment();
                        blockSettingsFragment.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("analytics_context", "blocking_tab"), new kotlin.Pair("source", settingsSource)}));
                        type2 = type;
                        G = blockSettingsFragment;
                        if (G != null) {
                        }
                        this.r1 = z2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("settingsRouter");
                        throw null;
                    }
                    break;
                case 6:
                    z2 = false;
                    qc3.bar barVar7 = this.H0;
                    if (barVar7 != null) {
                        ((uq2.baz) barVar7.get()).getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("FamilyProtectionTab", "analyticsContext");
                        com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettingsFragment.w.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("FamilyProtectionTab", "analyticsLaunchContext");
                        androidx.fragment.app.Fragment familyProtectSettingsFragment = new com.truecaller.settings.impl.ui.familyprotect.FamilyProtectSettingsFragment();
                        familyProtectSettingsFragment.setArguments(ue0.i.t(new kotlin.Pair[]{new kotlin.Pair("analytics_context", "FamilyProtectionTab")}));
                        G = familyProtectSettingsFragment;
                        type2 = type;
                        if (G != null) {
                        }
                        this.r1 = z2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("settingsRouter");
                        throw null;
                    }
                    break;
                case 7:
                    qc3.bar barVar8 = this.P0;
                    if (barVar8 != null) {
                        if (((qo1.o) barVar8.get()).a()) {
                            java.io.Serializable serializable = i82.r.T7;
                            z2 = false;
                            java.lang.String name3 = serializable.getName();
                            java.util.Locale locale = java.util.Locale.getDefault();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            java.lang.String lowerCase = name3.toLowerCase(locale);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable, "launchContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowerCase, "analyticsLaunchContext");
                            hVar = new vb2.j();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putSerializable("launchContext", serializable);
                            bundle.putParcelable("analyticsMetadata", null);
                            bundle.putString("selectedPage", null);
                            bundle.putString("analyticsContext", lowerCase);
                            hVar.setArguments(bundle);
                        } else {
                            z2 = false;
                            java.io.Serializable serializable2 = i82.r.T7;
                            java.lang.String name4 = serializable2.getName();
                            java.util.Locale locale2 = java.util.Locale.getDefault();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                            java.lang.String lowerCase2 = name4.toLowerCase(locale2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializable2, "launchContext");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lowerCase2, "analyticsLaunchContext");
                            hVar = new vb2.h();
                            android.os.Bundle bundle2 = new android.os.Bundle();
                            bundle2.putSerializable("launchContext", serializable2);
                            bundle2.putParcelable("analyticsMetadata", null);
                            bundle2.putString("selectedPage", null);
                            bundle2.putString("analyticsContext", lowerCase2);
                            hVar.setArguments(bundle2);
                        }
                        type2 = type;
                        G = hVar;
                        if (G != null) {
                        }
                        this.r1 = z2;
                        break;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("premiumFeaturesInventory");
                        throw null;
                    }
                    break;
                case 8:
                    qc3.bar barVar9 = this.m0;
                    if (barVar9 != null) {
                        dj2.j jVar = (dj2.j) barVar9.get();
                        if (jVar.a() && jVar.b() && !jVar.e.G()) {
                            tx.d dVar = this.S0;
                            if (dVar != null) {
                                dj2.i iVar = (dj2.i) dVar.get();
                                com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext referralManager$ReferralLaunchContext = com.truecaller.referrals.api.ReferralManager$ReferralLaunchContext.BOTTOM_BAR;
                                iVar.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referralManager$ReferralLaunchContext, "referralLaunchContext");
                                iVar.a.getClass();
                                java.lang.String k = ne0.baz.k("referralCode");
                                java.lang.String k2 = ne0.baz.k("referralLink");
                                if (k.length() != 0 && k2.length() != 0) {
                                    G = iVar.b.i0(k, k2, referralManager$ReferralLaunchContext);
                                    type2 = type;
                                    z2 = false;
                                    if (G != null) {
                                    }
                                    this.r1 = z2;
                                }
                                G = null;
                                type2 = type;
                                z2 = false;
                                if (G != null) {
                                }
                                this.r1 = z2;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("inviteTabProvider");
                                throw null;
                            }
                        } else {
                            type2 = type;
                            G = null;
                            z2 = false;
                            if (G != null) {
                            }
                            this.r1 = z2;
                            break;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("growthMarketUtils");
                        throw null;
                    }
                    break;
                case 9:
                    qc3.bar barVar10 = this.J0;
                    if (barVar10 != null) {
                        if (((kl2.bar) barVar10.get()).a()) {
                            G = new xn2.s0();
                            type2 = type;
                            z2 = false;
                            if (G != null) {
                            }
                            this.r1 = z2;
                            break;
                        }
                        G = null;
                        type2 = type;
                        z2 = false;
                        if (G != null) {
                        }
                        this.r1 = z2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("scamFeedHelper");
                        throw null;
                    }
                    break;
                default:
                    throw new java.lang.RuntimeException();
            }
        }
        if (G != null) {
            p41.bar barVar11 = this.d0;
            if (barVar11 != null && (barVar11 instanceof p41.bar)) {
                barVar11.n4(z3);
            }
            java.util.List f = getSupportFragmentManager().c.f();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getFragments(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : f) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
                if (fragment != null && !fragment.isHidden()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) it.next();
                if (fragment2 instanceof androidx.fragment.app.t) {
                    barVar2.s(fragment2);
                } else {
                    barVar2.r(fragment2);
                }
            }
            androidx.appcompat.widget.Toolbar toolbar = this.h0;
            if (toolbar != null && (menu = toolbar.getMenu()) != null) {
                menu.close();
            }
            barVar2.v(G);
            barVar2.m(true, true);
            p41.bar barVar12 = this.d0;
            this.d0 = G;
            if (!getSupportFragmentManager().K) {
                androidx.fragment.app.g1 supportFragmentManager2 = getSupportFragmentManager();
                boolean B = supportFragmentManager2.B(true);
                supportFragmentManager2.I();
                if (B) {
                    d91.e eVar2 = this.w1;
                    if (eVar2 != null) {
                        eVar2.d.f(true, false, true);
                        b1();
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
            }
            p41.bar barVar13 = this.d0;
            if (barVar13 instanceof p41.bar) {
                barVar = barVar13;
            } else {
                barVar = null;
            }
            if (barVar != null) {
                if (barVar12 instanceof p41.bar) {
                    str4 = barVar12.p();
                } else {
                    str4 = this.u1;
                }
                kotlin.jvm.internal.Intrinsics.d(str4);
                barVar.E(str4);
            }
            r1(this.d0);
            z0(this.d0, kotlin.jvm.internal.Intrinsics.b(this.k1, java.lang.Boolean.TRUE));
            s1(this.d0);
            if (com.truecaller.ui.d2.a[H0().s().ordinal()] == 7) {
                qc3.bar barVar14 = this.o0;
                if (barVar14 != null) {
                    m92.d dVar2 = (m92.d) barVar14.get();
                    qc3.bar barVar15 = this.B0;
                    if (barVar15 != null) {
                        tf2.i0 i0Var = (tf2.i0) barVar15.get();
                        android.content.Intent intent = getIntent();
                        i0Var.getClass();
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            str3 = extras.getString("originalLaunchContext");
                        } else {
                            str3 = null;
                        }
                        dVar2.i = str3;
                        qc3.bar barVar16 = this.B0;
                        if (barVar16 != null) {
                            tf2.i0 i0Var2 = (tf2.i0) barVar16.get();
                            android.content.Intent intent2 = getIntent();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                            i0Var2.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent2, "intent");
                            intent2.removeExtra("originalLaunchContext");
                            setIntent(intent2);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("premiumIntentExtrasExtractor");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("premiumIntentExtrasExtractor");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("premiumTabDeeplinkHelper");
                throw null;
            }
        }
    }

    public final void attachBaseContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "base");
        boolean z = tx.a1.G;
        nz1.b bVar = r11.bar.a().F;
        bVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "baseContext");
        android.content.res.Resources resources = context.getResources();
        kotlin.jvm.internal.Intrinsics.d(resources);
        java.util.Locale locale = bVar.i;
        android.content.res.Configuration configuration = new android.content.res.Configuration(resources.getConfiguration());
        j03.f.o();
        fc.bar.s(configuration, dl.m.h(new java.util.Locale[]{locale}));
        android.content.Context createConfigurationContext = context.createConfigurationContext(configuration);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        super.attachBaseContext(createConfigurationContext);
        this.x1 = createConfigurationContext.getResources().getConfiguration().uiMode & 48;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1() {
        d91.e eVar = this.w1;
        if (eVar != null) {
            com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = eVar.q;
            f41.qux quxVar = this.d0;
            if (quxVar instanceof f41.qux) {
                kotlin.jvm.internal.Intrinsics.e(quxVar, "null cannot be cast to non-null type com.truecaller.common.ui.fab.FabFragment");
                if (quxVar.A3()) {
                    f41.qux quxVar2 = this.d0;
                    kotlin.jvm.internal.Intrinsics.e(quxVar2, "null cannot be cast to non-null type com.truecaller.common.ui.fab.FabFragment");
                    f41.qux quxVar3 = quxVar2;
                    floatingActionButton.setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(quxVar3, 7));
                    floatingActionButton.setImageDrawable(bi3.a.x(this, quxVar3.A4(), 2130970615, android.graphics.PorterDuff.Mode.SRC_IN));
                    floatingActionButton.setVisibility(0);
                    if (H0().s() == com.truecaller.bottombar.BottomBarButtonType.MESSAGES) {
                        f1();
                        return;
                    }
                    return;
                }
            }
            floatingActionButton.setVisibility(8);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void c1() {
        r1(this.d0);
        z0(this.d0, kotlin.jvm.internal.Intrinsics.b(this.k1, java.lang.Boolean.TRUE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [qx2.lg, java.lang.Object, ci3.m] */
    @Override // pt2.bar
    public final void d(com.truecaller.startup_dialogs.StartupDialogType startupDialogType, com.truecaller.startup_dialogs.StartupDialogDismissReason startupDialogDismissReason) {
        android.os.Bundle extras;
        qx2.lh lhVar;
        com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startupDialogType, "dialogType");
        com.truecaller.ui.q0 q0Var = (com.truecaller.ui.q0) this.h1.getValue();
        q0Var.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startupDialogType, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE);
        java.util.Map map = null;
        fg3.h0.J(androidx.lifecycle.g1.l(q0Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.editprofile.impl.ui.legacy.m(q0Var, startupDialogType, startupDialogDismissReason, (df3.bar) null, 7), 3);
        android.content.Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.getBoolean("is_dial_pad_auto_open")) {
            android.content.Intent intent2 = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            Z0(intent2, false);
            qc3.bar barVar = this.p0;
            if (barVar != null) {
                nc0.a aVar = (nc0.bar) barVar.get();
                bi3.y0 y0Var = qx2.lg.f;
                hi3.a aVar2 = qx2.lg.g;
                bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
                boolean[] zArr = new boolean[j0VarArr.length];
                bi3.j0 j0Var = j0VarArr[2];
                zArr[2] = true;
                bi3.j0 j0Var2 = j0VarArr[3];
                zArr[3] = true;
                try {
                    ?? obj = new java.lang.Object();
                    if (zArr[0]) {
                        lhVar = null;
                    } else {
                        bi3.j0 j0Var3 = j0VarArr[0];
                        lhVar = (qx2.lh) aVar2.g(j0Var3.f, aVar2.j(j0Var3));
                    }
                    obj.a = lhVar;
                    if (zArr[1]) {
                        clientHeaderV2 = null;
                    } else {
                        bi3.j0 j0Var4 = j0VarArr[1];
                        clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar2.g(j0Var4.f, aVar2.j(j0Var4));
                    }
                    obj.b = clientHeaderV2;
                    if (zArr[2]) {
                        charSequence = "dialpad";
                    } else {
                        bi3.j0 j0Var5 = j0VarArr[2];
                        charSequence = (java.lang.CharSequence) aVar2.g(j0Var5.f, aVar2.j(j0Var5));
                    }
                    obj.c = charSequence;
                    if (zArr[3]) {
                        charSequence2 = "dialpadShortcut";
                    } else {
                        bi3.j0 j0Var6 = j0VarArr[3];
                        charSequence2 = (java.lang.CharSequence) aVar2.g(j0Var6.f, aVar2.j(j0Var6));
                    }
                    obj.d = charSequence2;
                    if (!zArr[4]) {
                        bi3.j0 j0Var7 = j0VarArr[4];
                        map = (java.util.Map) aVar2.g(j0Var7.f, aVar2.j(j0Var7));
                    }
                    obj.e = map;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj, "build(...)");
                    aVar.c((ci3.m) obj);
                    return;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException(e);
                } catch (bi3.bar e2) {
                    throw e2;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("analytics");
            throw null;
        }
    }

    public final void d1(android.content.Intent intent, android.os.Bundle bundle) {
        com.google.common.collect.ImmutableSet immutableSet = this.N0;
        if (immutableSet != null) {
            java.util.Iterator it = immutableSet.iterator();
            while (it.hasNext()) {
                ((com.truecaller.ui.c0) it.next()).a(intent.getData(), bundle);
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("intentExtrasProcessors");
        throw null;
    }

    public final void e1(com.google.android.material.appbar.MaterialToolbar materialToolbar) {
        i.baz supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(false);
            supportActionBar.x();
            supportActionBar.s(false);
            supportActionBar.A(0);
        }
        setSupportActionBar(materialToolbar);
    }

    public final void f(mk.e eVar) {
        this.t1 = eVar;
    }

    public final void f1() {
        d91.e eVar = this.w1;
        if (eVar != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = eVar.r;
            if (coordinatorLayout.isLaidOut()) {
                D0();
                return;
            } else {
                coordinatorLayout.getViewTreeObserver().addOnGlobalLayoutListener(new com.truecaller.details_view.ui.y0(1, eVar, this));
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void g1(java.lang.String str) {
        java.lang.String str2;
        this.u1 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        androidx.lifecycle.t1 viewModelStore = getViewModelStore();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        androidx.lifecycle.q1 defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "owner");
        a9.qux defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelProviderFactory, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultViewModelCreationExtras, "defaultCreationExtras");
        ej.b z = ro0.f.z(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras, lg2.baz.class, "modelClass");
        kotlin.reflect.KClass r = t.c.r(lg2.baz.class, "modelClass", "modelClass");
        if (r != null) {
            str2 = r.getQualifiedName();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            lg2.baz y = z.y("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2), r);
            java.lang.String str3 = this.u1;
            y.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "<set-?>");
            y.k = str3;
            return;
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final void j1() {
        if (I0().b() || !W0()) {
            return;
        }
        d91.e eVar = this.w1;
        if (eVar != null) {
            eVar.d.a(new b81.e(this, 1));
        } else {
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1(java.lang.String str) {
        float dimension;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.mediation.impression.LevelPlayImpressionData.IMPRESSION_DATA_KEY_PLACEMENT);
        if (z62.d.p()) {
            javax.inject.Provider provider = this.s0;
            if (provider != null) {
                if (((qo1.bar) provider.get()).b.a("featureFloaterAd", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                    int dimension2 = (int) getResources().getDimension(2131165553);
                    d91.e eVar = this.w1;
                    if (eVar != null) {
                        com.google.android.material.floatingactionbutton.FloatingActionButton floatingActionButton = eVar.q;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
                        if (floatingActionButton.getVisibility() == 0) {
                            dimension = getResources().getDimension(2131165306);
                        } else {
                            dimension = getResources().getDimension(2131165529);
                        }
                        int i = (int) dimension;
                        d91.e eVar2 = this.w1;
                        if (eVar2 != null) {
                            android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.FrameLayout) eVar2.m).getLayoutParams();
                            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                                marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                            } else {
                                marginLayoutParams = null;
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.setMargins(0, 0, dimension2, i);
                                d91.e eVar3 = this.w1;
                                if (eVar3 != null) {
                                    ((android.widget.FrameLayout) eVar3.m).setLayoutParams(marginLayoutParams);
                                } else {
                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                    throw null;
                                }
                            }
                            d91.e eVar4 = this.w1;
                            if (eVar4 != null) {
                                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar4.m;
                                frameLayout.setVisibility(0);
                                frameLayout.removeAllViews();
                                a70.e eVar5 = new a70.e(this);
                                eVar5.setTag(2131366787, str);
                                frameLayout.addView(eVar5);
                                return;
                            }
                            kotlin.jvm.internal.Intrinsics.n("binding");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("adsFeaturesInventory");
            throw null;
        }
    }

    public final void l1() {
        C0(0.0f);
    }

    public final void m1() {
        d91.e eVar = this.w1;
        if (eVar != null) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = eVar.c;
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.m(constraintLayout, (u6.v) null);
            d91.e eVar2 = this.w1;
            if (eVar2 != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = eVar2.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout2, "mainConstraintLayout");
                android.view.ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = 0;
                constraintLayout2.setLayoutParams(marginLayoutParams);
                if (!I0().b()) {
                    E0();
                }
                d91.e eVar3 = this.w1;
                if (eVar3 != null) {
                    u6.i0.c((com.truecaller.ui.view.SearchBarView) eVar3.s);
                    d91.e eVar4 = this.w1;
                    if (eVar4 != null) {
                        u6.i0.c(eVar4.j);
                        return;
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void n1() {
        d91.e eVar = this.w1;
        if (eVar != null) {
            androidx.cardview.widget.CardView cardView = (com.truecaller.ui.view.SearchBarView) eVar.s;
            java.util.WeakHashMap weakHashMap = u6.t0.a;
            u6.k0.m(cardView, (u6.v) null);
            d91.e eVar2 = this.w1;
            if (eVar2 != null) {
                u6.k0.m(eVar2.j, (u6.v) null);
                d91.e eVar3 = this.w1;
                if (eVar3 != null) {
                    androidx.cardview.widget.CardView cardView2 = (com.truecaller.ui.view.SearchBarView) eVar3.s;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cardView2, "searchBarView");
                    android.view.ViewGroup.LayoutParams layoutParams = cardView2.getLayoutParams();
                    kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = 12;
                    cardView2.setLayoutParams(marginLayoutParams);
                    d91.e eVar4 = this.w1;
                    if (eVar4 != null) {
                        androidx.compose.ui.platform.ComposeView composeView = eVar4.j;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(composeView, "familyProtectOnboarding");
                        android.view.ViewGroup.LayoutParams layoutParams2 = composeView.getLayoutParams();
                        kotlin.jvm.internal.Intrinsics.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = 0;
                        composeView.setLayoutParams(marginLayoutParams2);
                        d91.e eVar5 = this.w1;
                        if (eVar5 != null) {
                            u6.k0.m(eVar5.c, new com.truecaller.ui.v1(this, 1));
                            d91.e eVar6 = this.w1;
                            if (eVar6 != null) {
                                u6.i0.c(eVar6.c);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("binding");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.n("binding");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void o1(boolean z, boolean z2) {
        int i;
        if (!W0()) {
            return;
        }
        d91.e eVar = this.w1;
        if (eVar != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.n;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "floatingToolbarGroup");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
            if (z2) {
                ig3.h2 h2Var = J0().e;
                h2Var.getClass();
                h2Var.p((java.lang.Object) null, 0);
            }
            if (z) {
                B0(true);
                return;
            } else {
                f1();
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        com.truecaller.ui.q0 q0Var = (com.truecaller.ui.q0) this.h1.getValue();
        q0Var.getClass();
        fg3.h0.J(androidx.lifecycle.g1.l(q0Var), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new bu2.g(q0Var, i, (df3.bar) null, 1), 3);
        java.util.List f = getSupportFragmentManager().c.f();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "getFragments(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f) {
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) obj;
            if (fragment != null && fragment.isAdded() && !fragment.isHidden()) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.Fragment) it.next()).onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        p41.qux quxVar;
        com.truecaller.bottombar.BottomBarButtonType s = H0().s();
        androidx.fragment.app.Fragment G = getSupportFragmentManager().G("PREMIUM");
        if (G == null || !G.isVisible() || !G.getChildFragmentManager().W(-1, 0)) {
            b81.z zVar = this.X0;
            if (zVar != null) {
                if (((java.lang.Boolean) zVar.b.getValue()).booleanValue()) {
                    super/*androidx.activity.ComponentActivity*/.onBackPressed();
                    return;
                }
                if (W0() && s == com.truecaller.bottombar.BottomBarButtonType.CALLS) {
                    int intValue = ((java.lang.Number) J0().f.a.getValue()).intValue();
                    com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs floatingToolbarTabs = com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.CALLS;
                    if (intValue != floatingToolbarTabs.getIndex()) {
                        if1.baz J0 = J0();
                        J0.getClass();
                        J0.p(floatingToolbarTabs);
                        return;
                    }
                }
                p41.qux quxVar2 = this.d0;
                if (quxVar2 instanceof p41.qux) {
                    quxVar = quxVar2;
                } else {
                    quxVar = null;
                }
                if (quxVar == null || !quxVar.onBackPressed()) {
                    if (s == H0().t()) {
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            javax.inject.Provider provider = this.A0;
                            if (provider != null) {
                                if (((com.truecaller.qa.x) provider.get()).z("finish_truecaller_init", false)) {
                                    finish();
                                    return;
                                }
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("qaMenuSettings");
                                throw null;
                            }
                        }
                        super/*androidx.activity.ComponentActivity*/.onBackPressed();
                        return;
                    }
                    ah.f H0 = H0();
                    com.truecaller.bottombar.BottomBarButtonType t = H0.t();
                    if (H0.s() != t) {
                        H0.M(t);
                        return;
                    }
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("contactsTabSearchStateDispatcher");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.FragmentActivityBase
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        dx2.d dVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        if (i != this.x1) {
            this.x1 = i;
            dx2.bar barVar = dx2.bar.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
            dx2.bar.g = configuration;
            if (dx2.bar.f()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "newConfig");
                if (dx2.bar.e(configuration)) {
                    dVar = dx2.bar.e;
                    if (dVar == null) {
                        kotlin.jvm.internal.Intrinsics.n("inheritDark");
                        throw null;
                    }
                } else {
                    dVar = dx2.bar.d;
                    if (dVar == null) {
                        kotlin.jvm.internal.Intrinsics.n("inheritBright");
                        throw null;
                    }
                }
                dx2.bar.g(dVar);
            }
            if (dx2.bar.f()) {
                y90.m6.P(this, com.truecaller.bottombar.BottomBarButtonType.CALLS, this.u1, true);
            }
        }
    }

    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionResult, "connectionResult");
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x014a, code lost:
    
        if (((q11.bar) r5.get()).c("region_za_policy_accepted") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0112, code lost:
    
        if (((q11.bar) r5.get()).c("region_br_policy_accepted") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014c, code lost:
    
        r1 = com.truecaller.adschoices.Source.WizardScreen;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "analyticsSource");
        r2 = new android.content.Intent((android.content.Context) r6, (java.lang.Class<?>) com.truecaller.consentrefresh.ConsentRefreshActivity.class);
        r2.putExtra("AnalyticsSource", (java.io.Serializable) r1);
        r6.startActivity(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027f  */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Object, com.truecaller.ui.n2] */
    @Override // com.truecaller.ui.FragmentActivityBase, com.truecaller.ui.Hilt_FragmentActivityBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        android.os.Bundle extras;
        java.lang.String str;
        com.google.android.material.appbar.AppBarLayout o;
        com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType;
        java.lang.String[] strArr;
        java.lang.String string;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        yy.qux.B(this, true, ex2.a.a);
        super.onCreate(bundle);
        ah.n nVar = this.L0;
        df3.bar barVar = null;
        if (nVar != null) {
            uj2.bar barVar2 = (uj2.bar) ((qc3.bar) nVar.e).get();
            androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) nVar.b;
            barVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
            final int i = 0;
            if (!tx.a1.G) {
                qc3.bar barVar3 = (qc3.bar) nVar.h;
                if (((n11.l) ((qc3.bar) nVar.a).get()).c.r()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentActivity, "context");
                    android.content.Intent intent = new android.content.Intent((android.content.Context) fragmentActivity, (java.lang.Class<?>) com.truecaller.suspension.ui.SuspensionActivity.class);
                    intent.addFlags(268468224);
                    fragmentActivity.startActivity(intent);
                } else if (r11.bar.a().d() && ((q83.qux) ((qc3.bar) nVar.g).get()).b()) {
                    if (!com.truecaller.forcedupdate.ui.ForcedUpdateActivity.t0(fragmentActivity)) {
                        int i2 = 13;
                        if (!((qw2.b0) ((qw2.a0) ((qc3.bar) nVar.c).get())).i()) {
                            java.lang.Object obj = ((qc3.bar) nVar.d).get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            qw2.d0 d0Var = (qw2.d0) obj;
                            com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType2 = com.truecaller.bottombar.BottomBarButtonType.CALLS;
                            d0Var.getClass();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarButtonType2, "tab");
                            d0Var.c.startActivity((android.content.Intent) com.mbridge.msdk.config.component.common.express.operator.baz.i(j0.b.q(d0Var, d0Var.b, new q8.n(d0Var, bottomBarButtonType2, (df3.bar) null, 13), 2)));
                        } else {
                            c61.m mVar = (c61.m) ((qc3.bar) nVar.f).get();
                            qc3.bar barVar4 = mVar.c;
                            android.content.Context context = mVar.a;
                            int i3 = c61.l.a[mVar.b.b().ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    android.content.Context applicationContext = context.getApplicationContext();
                                    if (!(applicationContext instanceof r11.bar)) {
                                        applicationContext = null;
                                    }
                                    r11.bar barVar5 = (r11.bar) applicationContext;
                                    if (barVar5 != null) {
                                        if (barVar5.d()) {
                                        }
                                    } else {
                                        throw new java.lang.RuntimeException(k9.d.q("Application class does not implement ", kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(r11.bar.class).getQualifiedName()));
                                    }
                                }
                                int i4 = 3;
                                if (I0().b()) {
                                    if (getIntent().getBooleanExtra("set_missed_filter", false)) {
                                        sw0.qux I0 = I0();
                                        com.truecaller.calllog.api.FilterType filterType = com.truecaller.calllog.api.FilterType.MISSED;
                                        sw0.qux quxVar = I0;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filterType");
                                        ax0.baz bazVar = (ax0.baz) quxVar.h.get();
                                        bazVar.getClass();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filter");
                                        bazVar.g.o(filterType);
                                        fg3.h0.J(quxVar.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.bar(quxVar, filterType, (df3.bar) null, 1), 3);
                                    } else {
                                        sw0.qux I02 = I0();
                                        ig3.h2 h2Var = ((ax0.baz) I02.h.get()).g;
                                        com.truecaller.calllog.api.FilterType filterType2 = com.truecaller.calllog.api.FilterType.NONE;
                                        h2Var.o(filterType2);
                                        fg3.h0.J(I02.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.bar(I02, filterType2, (df3.bar) null, 1), 3);
                                    }
                                }
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, i4), 3);
                                android.content.Intent intent2 = getIntent();
                                extras = intent2.getExtras();
                                str = "appOpen";
                                if (extras != null && (string = extras.getString("AppUserInteraction.Context", "appOpen")) != null) {
                                    str = string;
                                }
                                g1(str);
                                if (extras != null) {
                                    d1(intent2, extras);
                                }
                                Y0();
                                if (!I0().b()) {
                                    sw0.qux I03 = I0();
                                    com.truecaller.calllog.api.FilterType filterType3 = (com.truecaller.calllog.api.FilterType) ((ax0.baz) I0().h.get()).h.a.getValue();
                                    sw0.qux quxVar2 = I03;
                                    fg3.e0 e0Var = quxVar2.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType3, "filterType");
                                    fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.bar(quxVar2, filterType3, (df3.bar) null, 0), 3);
                                    fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.baz(quxVar2, (df3.bar) null, 0), 3);
                                    fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.baz(quxVar2, (df3.bar) null, 1), 3);
                                } else {
                                    qc3.bar barVar6 = this.D0;
                                    if (barVar6 != null) {
                                        cg1.baz bazVar2 = (cg1.baz) barVar6.get();
                                        fg3.h0.I(fg3.f1.a, bazVar2.a, fg3.f0.d, new by1.baz(bazVar2, (df3.bar) null, 15));
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("callHistoryStartupHelper");
                                        throw null;
                                    }
                                }
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 6), 3);
                                androidx.constraintlayout.widget.ConstraintLayout inflate = getLayoutInflater().inflate(2131558509, (android.view.ViewGroup) null, false);
                                int i5 = 2131362275;
                                o = df0.qux.o(2131362275, inflate);
                                if (o != null) {
                                    i5 = 2131362434;
                                    if (df0.qux.o(2131362434, inflate) != null) {
                                        i5 = 2131362517;
                                        com.truecaller.bottombar.BottomBarView o2 = df0.qux.o(2131362517, inflate);
                                        if (o2 != null) {
                                            i5 = 2131362518;
                                            if (df0.qux.o(2131362518, inflate) != null) {
                                                i5 = 2131362519;
                                                android.view.View o3 = df0.qux.o(2131362519, inflate);
                                                if (o3 != null) {
                                                    i5 = 2131362764;
                                                    androidx.compose.ui.platform.ComposeView o4 = df0.qux.o(2131362764, inflate);
                                                    if (o4 != null) {
                                                        i5 = 2131363096;
                                                        androidx.compose.ui.platform.ComposeView o5 = df0.qux.o(2131363096, inflate);
                                                        if (o5 != null) {
                                                            i5 = 2131363145;
                                                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131363145, inflate);
                                                            if (frameLayout != null) {
                                                                i5 = 2131363818;
                                                                androidx.compose.ui.platform.ComposeView o6 = df0.qux.o(2131363818, inflate);
                                                                if (o6 != null) {
                                                                    i5 = 2131363819;
                                                                    android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) df0.qux.o(2131363819, inflate);
                                                                    if (frameLayout2 != null) {
                                                                        i5 = 2131363970;
                                                                        android.widget.FrameLayout frameLayout3 = (android.widget.FrameLayout) df0.qux.o(2131363970, inflate);
                                                                        if (frameLayout3 != null) {
                                                                            i5 = 2131363974;
                                                                            com.google.android.material.floatingactionbutton.FloatingActionButton o7 = df0.qux.o(2131363974, inflate);
                                                                            if (o7 != null) {
                                                                                i5 = 2131363972;
                                                                                android.view.View o8 = df0.qux.o(2131363972, inflate);
                                                                                if (o8 != null) {
                                                                                    i5 = 2131363973;
                                                                                    android.widget.FrameLayout frameLayout4 = (android.widget.FrameLayout) df0.qux.o(2131363973, inflate);
                                                                                    if (frameLayout4 != null) {
                                                                                        i5 = 2131364006;
                                                                                        android.widget.FrameLayout frameLayout5 = (android.widget.FrameLayout) df0.qux.o(2131364006, inflate);
                                                                                        if (frameLayout5 != null) {
                                                                                            i5 = 2131364007;
                                                                                            android.widget.FrameLayout frameLayout6 = (android.widget.FrameLayout) df0.qux.o(2131364007, inflate);
                                                                                            if (frameLayout6 != null) {
                                                                                                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate;
                                                                                                i5 = 2131365050;
                                                                                                androidx.coordinatorlayout.widget.CoordinatorLayout o9 = df0.qux.o(2131365050, inflate);
                                                                                                if (o9 != null) {
                                                                                                    i5 = 2131366277;
                                                                                                    com.truecaller.ui.view.SearchBarView searchBarView = (com.truecaller.ui.view.SearchBarView) df0.qux.o(2131366277, inflate);
                                                                                                    if (searchBarView != null) {
                                                                                                        i5 = 2131367092;
                                                                                                        androidx.appcompat.widget.AppCompatTextView o10 = df0.qux.o(2131367092, inflate);
                                                                                                        if (o10 != null) {
                                                                                                            d91.e eVar = new d91.e(constraintLayout, o, o2, o3, o4, o5, frameLayout, o6, frameLayout2, frameLayout3, o7, o8, frameLayout4, frameLayout5, frameLayout6, constraintLayout, o9, searchBarView, o10);
                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(eVar, "inflate(...)");
                                                                                                            this.w1 = eVar;
                                                                                                            setContentView(constraintLayout);
                                                                                                            ah.f H0 = H0();
                                                                                                            d91.e eVar2 = this.w1;
                                                                                                            if (eVar2 != null) {
                                                                                                                com.truecaller.bottombar.BottomBarView bottomBarView = eVar2.e;
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bottomBarView, "bottomBar");
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomBarView, "bottomBarView");
                                                                                                                H0.m = bottomBarView;
                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(H0, "listener");
                                                                                                                bottomBarView.g = H0;
                                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 7), 3);
                                                                                                                d91.e eVar3 = this.w1;
                                                                                                                if (eVar3 != null) {
                                                                                                                    androidx.compose.ui.platform.ComposeView composeView = eVar3.h;
                                                                                                                    composeView.setViewCompositionStrategy(k4.r1.e);
                                                                                                                    composeView.setContent(new d3.qux(-1356409316, new com.truecaller.ui.w1(this, 0), true));
                                                                                                                    d91.e eVar4 = this.w1;
                                                                                                                    if (eVar4 != null) {
                                                                                                                        com.truecaller.ui.view.SearchBarView searchBarView2 = (com.truecaller.ui.view.SearchBarView) eVar4.s;
                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(searchBarView2, "searchBarView");
                                                                                                                        this.v1 = searchBarView2;
                                                                                                                        searchBarView2.setAvatarClickListener(new kotlin.jvm.functions.Function0(this) { // from class: com.truecaller.ui.z1
                                                                                                                            public final /* synthetic */ com.truecaller.ui.TruecallerInit b;

                                                                                                                            {
                                                                                                                                this.b = this;
                                                                                                                            }

                                                                                                                            /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, com.truecaller.ui.TruecallerInit] */
                                                                                                                            public final java.lang.Object invoke() {
                                                                                                                                com.truecaller.analytics.AppEvents.UsersHome.NavigationSource navigationSource;
                                                                                                                                int i6 = i;
                                                                                                                                ?? r3 = this.b;
                                                                                                                                switch (i6) {
                                                                                                                                    case 0:
                                                                                                                                        qc3.bar barVar7 = r3.O0;
                                                                                                                                        if (barVar7 != null) {
                                                                                                                                            java.lang.Object obj2 = barVar7.get();
                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                                                                                                                            lz2.a aVar = (lz2.a) obj2;
                                                                                                                                            d91.e eVar5 = r3.w1;
                                                                                                                                            if (eVar5 != null) {
                                                                                                                                                com.truecaller.bottombar.BottomBarButtonType currentButton = eVar5.e.getCurrentButton();
                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentButton, "bottomBarButtonType");
                                                                                                                                                switch (m03.baz.a[currentButton.ordinal()]) {
                                                                                                                                                    case 1:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.CALLS_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 2:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.MESSAGES_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 3:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.BLOCKING_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 4:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.FAMILY_PROTECTION_CONFIG_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 5:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.PREMIUM_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 6:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.ASSISTANT_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 7:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.VOICEMAIL_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 8:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.INVITE_TAB;
                                                                                                                                                        break;
                                                                                                                                                    case 9:
                                                                                                                                                        navigationSource = com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.SCAM_FEED_TAB;
                                                                                                                                                        break;
                                                                                                                                                    default:
                                                                                                                                                        throw new java.lang.RuntimeException();
                                                                                                                                                }
                                                                                                                                                ia0.bar.z(aVar, (android.content.Context) r3, navigationSource);
                                                                                                                                                return kotlin.Unit.a;
                                                                                                                                            }
                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("usersHomeNavigation");
                                                                                                                                        throw null;
                                                                                                                                    case 1:
                                                                                                                                        r3.n1.p((java.lang.Object) null, java.lang.Boolean.valueOf(!((java.lang.Boolean) r0.getValue()).booleanValue()));
                                                                                                                                        return kotlin.Unit.a;
                                                                                                                                    case 2:
                                                                                                                                        qc3.bar barVar8 = r3.b1;
                                                                                                                                        if (barVar8 != null) {
                                                                                                                                            ((jm1.d) barVar8.get()).a();
                                                                                                                                            return kotlin.Unit.a;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("familyProtectScreenOpener");
                                                                                                                                        throw null;
                                                                                                                                    case 3:
                                                                                                                                        int i7 = com.truecaller.ui.TruecallerInit.y1;
                                                                                                                                        qc3.bar barVar9 = r3.c1;
                                                                                                                                        if (barVar9 != null) {
                                                                                                                                            ((jm1.c) barVar9.get()).e(com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext.CALL_TAB_RECENTS);
                                                                                                                                            return kotlin.Unit.a;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("familyGroupRouter");
                                                                                                                                        throw null;
                                                                                                                                    default:
                                                                                                                                        int i8 = com.truecaller.ui.TruecallerInit.y1;
                                                                                                                                        qc3.bar barVar10 = r3.c1;
                                                                                                                                        if (barVar10 != null) {
                                                                                                                                            ((jm1.c) barVar10.get()).c(com.truecaller.familyprotect.api.navigation.FamilyProtectLaunchContext.CALL_TAB_RECENTS);
                                                                                                                                            return kotlin.Unit.a;
                                                                                                                                        }
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("familyGroupRouter");
                                                                                                                                        throw null;
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                        searchBarView2.setToolbarClickListener(new a63.d(searchBarView2, this, searchBarView2, i2));
                                                                                                                        e1(searchBarView2.getToolbar());
                                                                                                                        F0();
                                                                                                                        if (bundle != null) {
                                                                                                                            bottomBarButtonType = qk3.p.x(bundle.getInt("current_selected_bottom_tab", -1));
                                                                                                                        } else {
                                                                                                                            bottomBarButtonType = null;
                                                                                                                        }
                                                                                                                        com.google.android.material.appbar.AppBarLayout.Behavior behavior = new com.google.android.material.appbar.AppBarLayout.Behavior();
                                                                                                                        ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) behavior).o = new java.lang.Object();
                                                                                                                        d91.e eVar5 = this.w1;
                                                                                                                        if (eVar5 != null) {
                                                                                                                            e6.b layoutParams = eVar5.d.getLayoutParams();
                                                                                                                            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                                                                                                                            layoutParams.b(behavior);
                                                                                                                            ah.f H02 = H0();
                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "listener");
                                                                                                                            H02.n = this;
                                                                                                                            H02.N();
                                                                                                                            if (bottomBarButtonType != null) {
                                                                                                                                H0().M(bottomBarButtonType);
                                                                                                                            } else {
                                                                                                                                android.content.Intent intent3 = getIntent();
                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                                                                                                                                Z0(intent3, true);
                                                                                                                            }
                                                                                                                            if (!I0().b()) {
                                                                                                                                E0();
                                                                                                                            }
                                                                                                                            fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 11), 3);
                                                                                                                            j1();
                                                                                                                            javax.inject.Provider provider = this.t0;
                                                                                                                            if (provider != null) {
                                                                                                                                if (((xz1.q) provider.get()).C("spamSearchStatus", 0) == 0) {
                                                                                                                                    tx.v vVar = this.n0;
                                                                                                                                    if (vVar != null) {
                                                                                                                                        ((x12.bar) vVar.get()).a();
                                                                                                                                    } else {
                                                                                                                                        kotlin.jvm.internal.Intrinsics.n("conversationSpamSearcher");
                                                                                                                                        throw null;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 9), 3);
                                                                                                                                ((hv0.m) this.i1.getValue()).b.e(this, new com.truecaller.ui.m2(new com.truecaller.ui.c2(this, 2)));
                                                                                                                                javax.inject.Provider provider2 = this.u0;
                                                                                                                                if (provider2 != null) {
                                                                                                                                    ((u40.qux) provider2.get()).a(this, new b93.b(27));
                                                                                                                                    if (z62.d.p()) {
                                                                                                                                        java.lang.String[] strArr2 = {"HISTORY", "NOTIFICATIONS", "SEARCHRESULTS", "BLOCK", "BLOCK_UPDATE", "CALLLOG", "CONTACTS", "INBOX", "SPAM_INBOX", "PROMOTION_INBOX", "CALL_LOG_PROMO", "AFTERCALL_TOP", "DETAILS_OOP", "ACS_C2P_OOP", "ACS_C2W_OOP", "C2P_OOP", "C2W_OOP", "BLOCK_UPDATE_OOP"};
                                                                                                                                        javax.inject.Provider provider3 = this.v0;
                                                                                                                                        if (provider3 != null) {
                                                                                                                                            f70.qux quxVar3 = (f70.qux) provider3.get();
                                                                                                                                            int i6 = 18;
                                                                                                                                            java.lang.String[] strArr3 = (java.lang.String[]) java.util.Arrays.copyOf(strArr2, 18);
                                                                                                                                            quxVar3.getClass();
                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr3, "placements");
                                                                                                                                            if (!((qo1.bar) quxVar3.d.get()).b.a("featureAdsRestrictCampaignProcessing", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                                                                                                                                quxVar3.h = fg3.h0.J((fg3.e0) quxVar3.i.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.profile.impl.remote.e(strArr3, quxVar3, barVar, i6), 3);
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            kotlin.jvm.internal.Intrinsics.n("adCampaignsManager");
                                                                                                                                            throw null;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    qc3.bar barVar7 = this.r0;
                                                                                                                                    if (barVar7 != null) {
                                                                                                                                        if (((qo1.i) barVar7.get()).a.a("featureBackup_22602", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                                                                                                                                            javax.inject.Provider provider4 = this.w0;
                                                                                                                                            if (provider4 != null) {
                                                                                                                                                java.lang.Object obj2 = provider4.get();
                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                                                                                                                                                ((u62.l) obj2).a(2131366147, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal, "notificationBackup");
                                                                                                                                            } else {
                                                                                                                                                kotlin.jvm.internal.Intrinsics.n("analyticsNotificationManager");
                                                                                                                                                throw null;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        qw2.b0 b0Var = (qw2.b0) this.e0;
                                                                                                                                        u03.z zVar = b0Var.a;
                                                                                                                                        java.lang.String[] d = b0Var.d();
                                                                                                                                        if (!zVar.g((java.lang.String[]) java.util.Arrays.copyOf(d, d.length)) && b0Var.i()) {
                                                                                                                                            strArr = b0Var.d();
                                                                                                                                        } else {
                                                                                                                                            strArr = new java.lang.String[0];
                                                                                                                                        }
                                                                                                                                        if (strArr.length != 0) {
                                                                                                                                            f6.baz.l(this, strArr, 7008);
                                                                                                                                        }
                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 10), 3);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("identityFeaturesInventory");
                                                                                                                                    throw null;
                                                                                                                                }
                                                                                                                                kotlin.jvm.internal.Intrinsics.n("adsConsentManager");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                            kotlin.jvm.internal.Intrinsics.n("messagingSettings");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                    kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                    throw null;
                                                                                                                }
                                                                                                                kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            kotlin.jvm.internal.Intrinsics.n("binding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                            }
                            android.content.Context applicationContext2 = context.getApplicationContext();
                            if (!(applicationContext2 instanceof r11.bar)) {
                                applicationContext2 = null;
                            }
                            r11.bar barVar8 = (r11.bar) applicationContext2;
                            if (barVar8 != null) {
                                if (barVar8.d()) {
                                }
                                int i42 = 3;
                                if (I0().b()) {
                                }
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, i42), 3);
                                android.content.Intent intent22 = getIntent();
                                extras = intent22.getExtras();
                                str = "appOpen";
                                if (extras != null) {
                                    str = string;
                                }
                                g1(str);
                                if (extras != null) {
                                }
                                Y0();
                                if (!I0().b()) {
                                }
                                fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.ui.f2(this, barVar, 6), 3);
                                androidx.constraintlayout.widget.ConstraintLayout inflate2 = getLayoutInflater().inflate(2131558509, (android.view.ViewGroup) null, false);
                                int i52 = 2131362275;
                                o = df0.qux.o(2131362275, inflate2);
                                if (o != null) {
                                }
                                throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i52)));
                            }
                            throw new java.lang.RuntimeException(k9.d.q("Application class does not implement ", kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(r11.bar.class).getQualifiedName()));
                        }
                    }
                } else if (fragmentActivity.getIntent().hasExtra("EXTRA_REG_NUDGE")) {
                    ((q83.a) barVar3.get()).e(fragmentActivity, fragmentActivity.getIntent().getExtras(), com.truecaller.wizard.api.WizardStartContext.NUDGE_NOTIFICATION);
                } else if (fragmentActivity.getIntent().hasExtra("EXTRA_THROTTLED")) {
                    ((q83.a) barVar3.get()).e(fragmentActivity, fragmentActivity.getIntent().getExtras(), com.truecaller.wizard.api.WizardStartContext.THROTTLED_NOTIFICATION);
                } else {
                    ((q83.a) barVar3.get()).e(fragmentActivity, fragmentActivity.getIntent().getExtras(), com.truecaller.wizard.api.WizardStartContext.INIT);
                }
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                ti3.b0.v(this);
            } else {
                overridePendingTransition(0, 0);
            }
            finish();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("truecallerInitPreLaunchChecker");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(2131689506, menu);
        android.view.MenuItem findItem = menu.findItem(2131361990);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findItem, "findItem(...)");
        com.google.android.gms.internal.ads.kc a = r03.d.b(this).a();
        if (r03.d.d(a)) {
            findItem.setVisible(true);
            kotlin.jvm.internal.Intrinsics.d(a);
            findItem.setIcon(a.a);
            findItem.setTitle(a.c);
        }
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }

    @Override // com.truecaller.ui.FragmentActivityBase, com.truecaller.ui.Hilt_FragmentActivityBase
    public final void onDestroy() {
        super.onDestroy();
        ah.f H0 = H0();
        java.util.Iterator it = ((java.util.Map) ((qc3.bar) H0.i).get()).values().iterator();
        while (it.hasNext()) {
            s41.h hVar = ((uy2.bar) it.next()).d;
            if (hVar != null) {
                hVar.dismiss();
            }
        }
        com.truecaller.bottombar.BottomBarView bottomBarView = (nk0.c) H0.m;
        if (bottomBarView != null) {
            bottomBarView.g = null;
        }
        r03.d.a = null;
        this.v1 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        if (intent.getBooleanExtra("set_missed_filter", false)) {
            sw0.qux I0 = I0();
            com.truecaller.calllog.api.FilterType filterType = com.truecaller.calllog.api.FilterType.MISSED;
            sw0.qux quxVar = I0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filterType");
            ax0.baz bazVar = (ax0.baz) quxVar.h.get();
            bazVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filter");
            bazVar.g.o(filterType);
            fg3.h0.J(quxVar.a, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new sw0.bar(quxVar, filterType, (df3.bar) null, 1), 3);
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            d1(intent, extras);
            java.lang.String string = extras.getString("AppUserInteraction.Context");
            if (string != null) {
                g1(string);
            }
        }
        setIntent(intent);
        Y0();
        Z0(intent, false);
        p41.bar barVar = this.d0;
        if (barVar instanceof p41.bar) {
            kotlin.jvm.internal.Intrinsics.e(barVar, "null cannot be cast to non-null type com.truecaller.common.ui.tab.TabFragment");
            barVar.Y1(intent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        if (menuItem.getItemId() == 2131361990) {
            com.google.android.gms.internal.ads.kc a = r03.d.b(this).a();
            if (r03.d.d(a)) {
                android.view.View inflate = android.view.View.inflate(this, 2131560975, null);
                i.e create = new i.d(this).setView(inflate).create();
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131366937);
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, a.b, 0);
                textView.setText(a.c);
                android.widget.ListView listView = (android.widget.ListView) inflate.findViewById(2131364980);
                listView.setAdapter((android.widget.ListAdapter) new i.b(this, 0, getResources().getStringArray(a.d)));
                listView.setOnItemClickListener(new r03.qux(create, this, a));
                create.show();
            }
        }
        return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
    }

    @Override // com.truecaller.ui.FragmentActivityBase
    public final void onPause() {
        super.onPause();
        p41.bar barVar = this.d0;
        if (barVar instanceof p41.bar) {
            kotlin.jvm.internal.Intrinsics.e(barVar, "null cannot be cast to non-null type com.truecaller.common.ui.tab.TabFragment");
            barVar.n4(false);
        }
    }

    public final void onPaymentError(int i, java.lang.String str, com.razorpay.PaymentData paymentData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        mk.e eVar = this.t1;
        if (eVar != null) {
            eVar.l(i);
        }
    }

    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "paymentId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        mk.e eVar = this.t1;
        if (eVar != null) {
            eVar.k(paymentData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        java.lang.String[] strArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 7008) {
            qw2.b0 b0Var = (qw2.b0) this.e0;
            u03.z zVar = b0Var.a;
            java.lang.String[] d = b0Var.d();
            if (!zVar.g((java.lang.String[]) java.util.Arrays.copyOf(d, d.length)) && b0Var.i()) {
                strArr2 = b0Var.d();
            } else {
                strArr2 = new java.lang.String[0];
            }
            if (strArr2.length == 0) {
                return;
            }
            qc3.bar barVar = this.U0;
            if (barVar != null) {
                ((qw2.d0) barVar.get()).h(H0().s());
                finish();
            } else {
                kotlin.jvm.internal.Intrinsics.n("tcPermissionsView");
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        if (((qo1.k) r2.get()).a.a("featureNudgeToSendAsSMSExpanded", com.truecaller.featuretoggles.FeatureState.DISABLED) != false) goto L20;
     */
    @Override // com.truecaller.ui.FragmentActivityBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onResume() {
        super.onResume();
        qc3.bar barVar = this.j0;
        df3.bar barVar2 = null;
        if (barVar != null) {
            ((uj2.bar) barVar.get()).getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "activity");
            ah.f H0 = H0();
            boolean z = true;
            fg3.h0.J((androidx.lifecycle.x) H0.l, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ry2.a(H0, barVar2, 1 == true ? 1 : 0), 3);
            p41.bar barVar3 = this.d0;
            if (barVar3 instanceof p41.bar) {
                kotlin.jvm.internal.Intrinsics.e(barVar3, "null cannot be cast to non-null type com.truecaller.common.ui.tab.TabFragment");
                barVar3.E(this.u1);
                g1("n/a");
            }
            cd3.bar barVar4 = this.y0;
            if (barVar4 != null) {
                ag2.q qVar = (xf2.a) barVar4.get();
                qVar.getClass();
                fg3.h0.J(qVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new a10.n(qVar, (df3.bar) null, 8), 3);
                H0().N();
                G0();
                javax.inject.Provider provider = this.t0;
                if (provider != null) {
                    if (java.util.concurrent.TimeUnit.DAYS.toMillis(1L) + ((xz1.q) provider.get()).D("nudgeToSendNotificationTimestamp", 0L) >= java.lang.System.currentTimeMillis()) {
                        qc3.bar barVar5 = this.C0;
                        if (barVar5 == null) {
                            kotlin.jvm.internal.Intrinsics.n("messagingFeaturesInventory");
                            throw null;
                        }
                    }
                    tx.v vVar = this.z0;
                    if (vVar != null) {
                        java.lang.Object obj = vVar.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        nd.j0 j0Var = (nd.j0) obj;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(j0Var, "workManager");
                        nd.l lVar = nd.l.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.messaging.nudgetosend.MessageToNudgeWorker.class, "workerClass");
                        j0Var.g("NudgeToSendSms", lVar, new f6.v0(com.truecaller.messaging.nudgetosend.MessageToNudgeWorker.class).x(10L, java.util.concurrent.TimeUnit.SECONDS).d());
                        qc3.bar barVar6 = this.q0;
                        if (barVar6 != null) {
                            org.joda.time.DateTime dateTime = new org.joda.time.DateTime(((r31.bar) barVar6.get()).f("clevertapAppLaunchedLastTs", 0L));
                            qc3.bar barVar7 = this.q0;
                            if (barVar7 != null) {
                                if (!((r31.bar) barVar7.get()).c("profileSendRegistrationCompleteEvent") && dateTime.G(20).n()) {
                                    javax.inject.Provider provider2 = this.x0;
                                    if (provider2 != null) {
                                        ((com.truecaller.clevertap.CleverTapManager) provider2.get()).push("TCAppLaunched");
                                        qc3.bar barVar8 = this.q0;
                                        if (barVar8 != null) {
                                            ((r31.bar) barVar8.get()).m("clevertapAppLaunchedLastTs", f63.qux.k());
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("coreSettings");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("cleverTapManager");
                                        throw null;
                                    }
                                }
                                qc3.bar barVar9 = this.E0;
                                if (barVar9 != null) {
                                    qf0.bar barVar10 = (qf0.bar) barVar9.get();
                                    if (barVar10.b == com.truecaller.attribution.AppsFlyerCompletionState.STARTUP_PREMIUM_SCREEN_SHOWN) {
                                        barVar10.b = com.truecaller.attribution.AppsFlyerCompletionState.HOME_SCREEN_SHOWN;
                                        barVar10.a("tc_wizard_firstDialerLaunched", kotlin.collections.r0.f());
                                        qc3.bar barVar11 = this.p0;
                                        if (barVar11 != null) {
                                            ((nc0.bar) barVar11.get()).d(new rf0.bar("WizardFirstDialerLaunched", 0));
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("analytics");
                                            throw null;
                                        }
                                    }
                                    qc3.bar barVar12 = this.K0;
                                    if (barVar12 != null) {
                                        db2.qux quxVar = (db2.qux) barVar12.get();
                                        quxVar.getClass();
                                        try {
                                            if (((w82.x1) quxVar.d.get()).c() && new org.joda.time.DateTime(quxVar.f.f("lastTimeGoogleInAppPaymentFailedSeen", 0L)).B(1).n()) {
                                                fg3.h0.J((fg3.e0) quxVar.i.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new db2.baz(quxVar, (df3.bar) null, 1), 3);
                                            }
                                        } catch (java.lang.Exception e) {
                                            com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash(e.getLocalizedMessage());
                                        }
                                        qc3.bar barVar13 = this.G0;
                                        if (barVar13 != null) {
                                            cu0.b bVar = (cu0.b) barVar13.get();
                                            u03.b bVar2 = bVar.e;
                                            s62.f fVar = bVar.i;
                                            if (bVar.d.j()) {
                                                fVar.a(2131363574, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationDrawOverOtherApps");
                                            }
                                            u03.c cVar = (u03.c) bVar2;
                                            if (cVar.a() && cVar.m()) {
                                                fVar.a(2131362800, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationCallerIDpermission");
                                            }
                                            if (H0().s() != com.truecaller.bottombar.BottomBarButtonType.CALLS) {
                                                z = false;
                                            }
                                            o1(z, false);
                                            return;
                                        }
                                        kotlin.jvm.internal.Intrinsics.n("callNotificationManager");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.Intrinsics.n("googleBillingInAppMessagingHelper");
                                    throw null;
                                }
                                kotlin.jvm.internal.Intrinsics.n("appsFlyerEventsTracker");
                                throw null;
                            }
                            kotlin.jvm.internal.Intrinsics.n("coreSettings");
                            throw null;
                        }
                        kotlin.jvm.internal.Intrinsics.n("coreSettings");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("workManager");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("messagingSettings");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("presenceManager");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("truecallerAppUpdateManager");
        throw null;
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
        bundle.putInt("current_selected_bottom_tab", qk3.p.y(H0().s()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.FragmentActivityBase
    public final void onStart() {
        super.onStart();
        ak.r0.X(this, this.o1, new java.lang.String[]{"com.truecaller.notification.action.NOTIFICATIONS_UPDATED"});
        ah.f H0 = H0();
        ak.r0.X((android.content.Context) H0.h, (co.t) H0.q, new java.lang.String[]{"com.truecaller.action.UPDATE_CALL_BADGE"});
        ty2.c cVar = (ty2.c) ((qc3.bar) H0.a).get();
        qc3.bar barVar = cVar.d;
        y12.t0 t0Var = (y12.t0) barVar.get();
        java.util.ArrayList arrayList = t0Var.o;
        if (!t0Var.k) {
            arrayList.clear();
            v2.x0 x0Var = t0Var.g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(com.truecaller.messaging.data.types.InboxTab.PERSONAL);
            if (((ix1.d) x0Var.b).j()) {
                arrayList2.add(com.truecaller.messaging.data.types.InboxTab.BUSINESS);
            }
            if (((m02.s) x0Var.a).a()) {
                arrayList2.add(com.truecaller.messaging.data.types.InboxTab.PROMOTIONAL);
            }
            arrayList2.add(com.truecaller.messaging.data.types.InboxTab.SPAM);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((com.truecaller.messaging.data.types.InboxTab) next) != com.truecaller.messaging.data.types.InboxTab.BUSINESS) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll(arrayList3);
            t0Var.n = arrayList.contains(com.truecaller.messaging.data.types.InboxTab.PROMOTIONAL);
            t0Var.a.registerContentObserver(h81.a.p(), true, t0Var.p);
            ak.r0.X(t0Var.d.a, t0Var.q, new java.lang.String[]{"com.truecaller.messaging.spam.SEARCH_COMPLETED"});
            t0Var.e.p.add(t0Var);
            t0Var.k = true;
            t0Var.a();
        }
        y12.t0 t0Var2 = (y12.t0) barVar.get();
        t0Var2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "observer");
        if (t0Var2.k && !t0Var2.m) {
            t0Var2.b(cVar);
        }
        t0Var2.h.add(cVar);
        df3.bar barVar2 = null;
        if (((qo1.h) H0.j).a.a("featureFamilyProtect", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            ig3.w1.F(new androidx.room.o(25, ig3.w1.t(((pj1.bar) ((qc3.bar) H0.k).get()).c()), new rv2.b0(H0, barVar2, 4)), (androidx.lifecycle.x) H0.l);
        }
        cd3.b bVar = this.R0;
        if (bVar != null) {
            kj2.baz bazVar = (kj2.baz) bVar.get();
            if (bazVar != null) {
                bazVar.q4();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("referralManagerProvider");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.FragmentActivityBase
    public final void onStop() {
        super.onStop();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(this).unregisterReceiver(this.o1);
        ah.f H0 = H0();
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance((android.content.Context) H0.h).unregisterReceiver((co.t) H0.q);
        ty2.c cVar = (ty2.c) ((qc3.bar) H0.a).get();
        qc3.bar barVar = cVar.d;
        y12.t0 t0Var = (y12.t0) barVar.get();
        t0Var.a.unregisterContentObserver(t0Var.p);
        m03.s sVar = t0Var.d;
        androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(sVar.a).unregisterReceiver(t0Var.q);
        t0Var.e.p.remove(t0Var);
        t0Var.k = false;
        y12.t0 t0Var2 = (y12.t0) barVar.get();
        t0Var2.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "observer");
        t0Var2.h.remove(cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q1(int i) {
        d91.e eVar = this.w1;
        if (eVar != null) {
            android.view.ViewGroup.LayoutParams layoutParams = ((com.truecaller.ui.view.SearchBarView) eVar.s).getLayoutParams();
            kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
            layoutParams2.setMarginEnd(ak.r0.r(i, this));
            d91.e eVar2 = this.w1;
            if (eVar2 != null) {
                ((com.truecaller.ui.view.SearchBarView) eVar2.s).setLayoutParams(layoutParams2);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void r1(androidx.fragment.app.Fragment fragment) {
        if (fragment instanceof com.truecaller.common.ui.l) {
            d91.e eVar = this.w1;
            if (eVar != null) {
                e6.b layoutParams = ((android.widget.FrameLayout) eVar.o).getLayoutParams();
                kotlin.jvm.internal.Intrinsics.e(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                e6.b bVar = layoutParams;
                if (!(fragment instanceof vb2.h) && !(fragment instanceof vb2.j)) {
                    if (bVar.a == null) {
                        bVar.b(new com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior());
                    }
                } else {
                    bVar.b((e6.baz) null);
                }
                int z4 = ((com.truecaller.common.ui.l) fragment).z4();
                d91.e eVar2 = this.w1;
                if (eVar2 != null) {
                    ((com.truecaller.ui.view.SearchBarView) eVar2.s).setVisibility(z4);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s1(androidx.fragment.app.Fragment fragment) {
        com.truecaller.common.ui.o oVar;
        if (fragment instanceof p41.bar) {
            oVar = ((p41.bar) fragment).O4();
        } else {
            oVar = null;
        }
        if (!java.util.Objects.equals(this.q1, oVar)) {
            this.q1 = oVar;
            if (oVar == null) {
                android.view.Window window = getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                yy.qux.l(window);
            } else {
                getWindow().setStatusBarColor(oVar.a);
                android.view.Window window2 = getWindow();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                yy.qux.k(window2, oVar.b);
            }
        }
    }

    @Override // com.truecaller.ui.FragmentActivityBase
    public final int u0() {
        return 2130970935;
    }

    public final void z0(androidx.fragment.app.Fragment fragment, boolean z) {
        int i;
        java.lang.Number number;
        java.lang.Number number2 = 0;
        if (fragment instanceof com.truecaller.common.ui.l) {
            i = ((com.truecaller.common.ui.l) fragment).z4();
        } else {
            i = 8;
        }
        d91.e eVar = this.w1;
        if (eVar != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) eVar.l;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "familyProtectOnboardingContainer");
            if (i == 0) {
                number = java.lang.Float.valueOf(a.bar.v(2));
            } else {
                number = number2;
            }
            if (!z && i == 0) {
                number2 = java.lang.Float.valueOf(a.bar.v(2));
            }
            frameLayout.setPadding(0, number2.intValue(), 0, number.intValue());
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
