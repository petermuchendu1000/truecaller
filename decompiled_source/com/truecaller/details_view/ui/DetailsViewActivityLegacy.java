package com.truecaller.details_view.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/truecaller/details_view/ui/DetailsViewActivityLegacy;", "Lcom/truecaller/dynamicfeaturesupport/DynamicFeatureActivity;", "Lr82/j0;", "Le41/v;", "<init>", "()V", "com/truecaller/details_view/ui/x0", "com/truecaller/details_view/ui/s0", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewActivityLegacy extends com.truecaller.details_view.ui.Hilt_DetailsViewActivityLegacy implements r82.j0, e41.v {
    public static final /* synthetic */ int Q0 = 0;
    public mk.e A0;
    public oc1.bar B0;
    public ea1.bar C0;
    public q6.baz D0;
    public o80.bar F0;
    public o80.bar G0;
    public na1.baz H0;
    public oa1.bar I0;
    public lb1.c J0;
    public com.truecaller.verifiedcampaign.uicomponents.composables.VerifiedCampaignsCarouselViewGroup K0;
    public int L0;
    public g.baz N0;
    public g.baz O0;
    public mk.e d0;
    public com.truecaller.details_view.ui.t e0;
    public gb1.d f0;
    public u03.f0 g0;
    public ia1.a h0;
    public ia1.b i0;
    public com.google.firebase.messaging.o j0;
    public ac0.baz k0;
    public com.moloco.sdk.acm.http.a l0;
    public i.d0 m0;
    public tf2.k n0;
    public tf2.l o0;
    public qz1.bar p0;
    public p.c3 q0;
    public gk2.n r0;
    public hk2.s s0;
    public gk2.qux t0;
    public h0.s u0;
    public xj0.bar v0;
    public qo1.f w0;
    public e93.c x0;
    public e70.c y0;
    public qc3.bar z0;
    public java.lang.ref.WeakReference E0 = new java.lang.ref.WeakReference(null);
    public final java.util.ArrayList M0 = new java.util.ArrayList();
    public final co.t P0 = new co.t(this, 7);

    public static final boolean t0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy) {
        android.graphics.Rect rect = new android.graphics.Rect();
        androidx.constraintlayout.widget.ConstraintLayout y0 = detailsViewActivityLegacy.y0();
        if (y0 != null && y0.getGlobalVisibleRect(rect) && rect.height() == y0.getHeight() && rect.width() > 0) {
            return true;
        }
        return false;
    }

    public final com.google.firebase.messaging.o A0() {
        com.google.firebase.messaging.o oVar = this.j0;
        if (oVar != null) {
            return oVar;
        }
        kotlin.jvm.internal.Intrinsics.n("detailsOptionsMenuHelper");
        throw null;
    }

    public final com.truecaller.details_view.ui.t B0() {
        com.truecaller.details_view.ui.t tVar = this.e0;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.Intrinsics.n("detailsPresenter");
        throw null;
    }

    public final oa1.bar C0() {
        oa1.bar barVar = this.I0;
        if (barVar == null) {
            ea1.bar barVar2 = this.C0;
            if (barVar2 != null) {
                android.widget.FrameLayout frameLayout = barVar2.m;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(frameLayout, "headerAdContainer");
                oa1.bar barVar3 = (oa1.bar) frameLayout.findViewWithTag("HEADER_AD");
                this.I0 = barVar3;
                return barVar3;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        return barVar;
    }

    public final u03.f0 D0() {
        u03.f0 f0Var = this.g0;
        if (f0Var != null) {
            return f0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    public final void E0(boolean z) {
        oa1.bar C0 = C0();
        if (C0 != null) {
            ((ma1.qux) C0.getPresenter()).R0(z);
        }
        o80.bar v0 = v0();
        if (v0 != null) {
            v0.l(z);
        }
        o80.bar x0 = x0();
        if (x0 != null) {
            x0.l(z);
        }
        na1.baz w0 = w0();
        if (w0 != null) {
            ((ma1.qux) w0.getPresenter()).R0(z);
        }
    }

    public final void L3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != 923797822) {
                if (hashCode == 1613085732 && tag.equals("TAG_DELETE_CONTACT_CONFIRMATION_DIALOG")) {
                    qa1.a aVar = (qa1.a) ((com.truecaller.details_view.ui.i0) B0()).q;
                    aVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("dismiss", "action");
                    nc0.u1.e(new rc0.b("dismiss", (java.lang.String) null, "deleteContact"), aVar.a);
                    return;
                }
                return;
            }
            if (tag.equals("TAG_DELETE_IDENTIFIED_CONTACT_CONFIRMATION_DIALOG")) {
                qa1.a aVar2 = (qa1.a) ((com.truecaller.details_view.ui.i0) B0()).q;
                aVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("dismiss", "action");
                nc0.u1.e(new rc0.b("dismiss", (java.lang.String) null, "deleteIdentifiedContact"), aVar2.a);
            }
        }
    }

    public final void e2(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != 923797822) {
                if (hashCode == 1613085732 && tag.equals("TAG_DELETE_CONTACT_CONFIRMATION_DIALOG")) {
                    qa1.a aVar = (qa1.a) ((com.truecaller.details_view.ui.i0) B0()).q;
                    aVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cancel", "action");
                    nc0.u1.e(new rc0.b("cancel", (java.lang.String) null, "deleteContact"), aVar.a);
                    return;
                }
                return;
            }
            if (tag.equals("TAG_DELETE_IDENTIFIED_CONTACT_CONFIRMATION_DIALOG")) {
                qa1.a aVar2 = (qa1.a) ((com.truecaller.details_view.ui.i0) B0()).q;
                aVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("cancel", "action");
                nc0.u1.e(new rc0.b("cancel", (java.lang.String) null, "deleteIdentifiedContact"), aVar2.a);
            }
        }
    }

    public final void f(mk.e eVar) {
        this.d0 = eVar;
    }

    public final void f3(com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
        java.lang.String tag = tcSystemDialog.getTag();
        if (tag != null) {
            int hashCode = tag.hashCode();
            df3.bar barVar = null;
            if (hashCode != 923797822) {
                if (hashCode == 1613085732 && tag.equals("TAG_DELETE_CONTACT_CONFIRMATION_DIALOG")) {
                    com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) B0();
                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var, barVar, 4), 3);
                    qa1.a aVar = (qa1.a) i0Var.q;
                    aVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("removeConfirmation", "action");
                    nc0.u1.e(new rc0.b("removeConfirmation", (java.lang.String) null, "deleteContact"), aVar.a);
                    return;
                }
                return;
            }
            if (tag.equals("TAG_DELETE_IDENTIFIED_CONTACT_CONFIRMATION_DIALOG")) {
                com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) B0();
                fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var2, barVar, 5), 3);
                qa1.a aVar2 = (qa1.a) i0Var2.q;
                aVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("confirm", "action");
                nc0.u1.e(new rc0.b("confirm", (java.lang.String) null, "deleteIdentifiedContact"), aVar2.a);
            }
        }
    }

    public final void k4(java.lang.String str, com.truecaller.common.ui.dialogs.TcSystemDialog tcSystemDialog) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcSystemDialog, "dialog");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        com.truecaller.data.entity.Contact contact;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        java.lang.String str = null;
        if (i != 1) {
            if (i != 4) {
                if (i == 21 && i2 == 3) {
                    finish();
                    return;
                }
                return;
            }
            if (i2 == -1 && intent != null && (contact = (com.truecaller.data.entity.Contact) ((android.os.Parcelable) g6.b.g(intent, "contact", com.truecaller.data.entity.Contact.class))) != null) {
                com.truecaller.details_view.ui.t B0 = B0();
                java.lang.String stringExtra = intent.getStringExtra("originalContactName");
                com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) B0;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                i0Var.h0 = fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new ag2.qux(contact, stringExtra, i0Var, (df3.bar) null, 27), 3);
                return;
            }
            return;
        }
        if (i2 == -1) {
            zj0.baz bazVar = this.v0;
            if (bazVar != null) {
                com.truecaller.blocking.ui.BlockResult c = bazVar.c(intent);
                if (c != null) {
                    com.truecaller.details_view.ui.i0 i0Var2 = (com.truecaller.details_view.ui.i0) B0();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "blockResult");
                    fg3.h0.J(i0Var2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new by1.b(i0Var2, c, str, 28), 3);
                    if (i0Var2.h2()) {
                        ax1.baz bazVar2 = i0Var2.H;
                        com.truecaller.details_view.ui.d1 d1Var = i0Var2.d0;
                        if (d1Var != null) {
                            java.util.List C = d1Var.a.C();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
                            com.truecaller.data.entity.Number number = (com.truecaller.data.entity.Number) kotlin.collections.CollectionsKt.firstOrNull(C);
                            if (number != null) {
                                str = number.f;
                            }
                            ax1.bar.c(bazVar2, str, c, "profile", com.truecaller.insights.feedbackrevamp.RevampFeedbackType.FRAUD);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("blockingActivityRouter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.details_view.ui.Hilt_DetailsViewActivityLegacy, com.truecaller.dynamicfeaturesupport.DynamicFeatureActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        int i = 2;
        yy.qux.C(this, 2);
        super.onCreate(bundle);
        int i2 = 0;
        com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor inflate = android.view.LayoutInflater.from(this).inflate(2131558470, (android.view.ViewGroup) null, false);
        int i3 = 2131361913;
        com.truecaller.details_view.ui.actionbutton.ActionButtonBarView actionButtonBarView = (com.truecaller.details_view.ui.actionbutton.ActionButtonBarView) df0.qux.o(2131361913, inflate);
        if (actionButtonBarView != null) {
            i3 = 2131362230;
            android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131362230, inflate);
            if (textView != null) {
                i3 = 2131362267;
                com.google.android.material.appbar.AppBarLayout o = df0.qux.o(2131362267, inflate);
                if (o != null) {
                    i3 = 2131362381;
                    com.truecaller.common.ui.avatar.AvatarXView o2 = df0.qux.o(2131362381, inflate);
                    if (o2 != null) {
                        i3 = 2131362391;
                        android.view.View o3 = df0.qux.o(2131362391, inflate);
                        if (o3 != null) {
                            i3 = 2131362624;
                            com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView businessAwarenessView = (com.truecaller.details_view.ui.businessAwareness.BusinessAwarenessView) df0.qux.o(2131362624, inflate);
                            if (businessAwarenessView != null) {
                                i3 = 2131362764;
                                androidx.compose.ui.platform.ComposeView o4 = df0.qux.o(2131362764, inflate);
                                if (o4 != null) {
                                    i3 = 2131363151;
                                    androidx.core.widget.NestedScrollView o5 = df0.qux.o(2131363151, inflate);
                                    if (o5 != null) {
                                        i3 = 2131363154;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) df0.qux.o(2131363154, inflate);
                                        if (linearLayout != null) {
                                            i3 = 2131363486;
                                            com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = (com.truecaller.details_view.ui.ads.DetailsOverlayAdView) df0.qux.o(2131363486, inflate);
                                            if (detailsOverlayAdView != null) {
                                                i3 = 2131363905;
                                                android.widget.TextView textView2 = (android.widget.TextView) df0.qux.o(2131363905, inflate);
                                                if (textView2 != null) {
                                                    i3 = 2131364414;
                                                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) df0.qux.o(2131364414, inflate);
                                                    if (frameLayout != null) {
                                                        i3 = 2131364415;
                                                        android.view.View o6 = df0.qux.o(2131364415, inflate);
                                                        if (o6 != null) {
                                                            i3 = 2131364418;
                                                            android.view.View o7 = df0.qux.o(2131364418, inflate);
                                                            if (o7 != null) {
                                                                i3 = 2131365370;
                                                                androidx.constraintlayout.motion.widget.MotionLayout o8 = df0.qux.o(2131365370, inflate);
                                                                if (o8 != null) {
                                                                    i3 = 2131365412;
                                                                    if (df0.qux.o(2131365412, inflate) != null) {
                                                                        i3 = 2131365416;
                                                                        android.widget.TextView textView3 = (android.widget.TextView) df0.qux.o(2131365416, inflate);
                                                                        if (textView3 != null) {
                                                                            i3 = 2131365417;
                                                                            android.widget.TextView textView4 = (android.widget.TextView) df0.qux.o(2131365417, inflate);
                                                                            if (textView4 != null) {
                                                                                i3 = 2131365802;
                                                                                com.truecaller.details_view.ui.presence.PresenceView presenceView = (com.truecaller.details_view.ui.presence.PresenceView) df0.qux.o(2131365802, inflate);
                                                                                if (presenceView != null) {
                                                                                    i3 = 2131365803;
                                                                                    if (df0.qux.o(2131365803, inflate) != null) {
                                                                                        i3 = 2131365804;
                                                                                        if (df0.qux.o(2131365804, inflate) != null) {
                                                                                            i3 = 2131365829;
                                                                                            android.widget.TextView textView5 = (android.widget.TextView) df0.qux.o(2131365829, inflate);
                                                                                            if (textView5 != null) {
                                                                                                i3 = 2131366274;
                                                                                                android.widget.TextView textView6 = (android.widget.TextView) df0.qux.o(2131366274, inflate);
                                                                                                if (textView6 != null) {
                                                                                                    i3 = 2131366548;
                                                                                                    android.widget.TextView textView7 = (android.widget.TextView) df0.qux.o(2131366548, inflate);
                                                                                                    if (textView7 != null) {
                                                                                                        i3 = 2131366549;
                                                                                                        android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131366549, inflate);
                                                                                                        if (imageView != null) {
                                                                                                            i3 = 2131366562;
                                                                                                            android.widget.TextView textView8 = (android.widget.TextView) df0.qux.o(2131366562, inflate);
                                                                                                            if (textView8 != null) {
                                                                                                                i3 = 2131366564;
                                                                                                                android.widget.ImageView imageView2 = (android.widget.ImageView) df0.qux.o(2131366564, inflate);
                                                                                                                if (imageView2 != null) {
                                                                                                                    i3 = 2131366709;
                                                                                                                    android.widget.ImageView imageView3 = (android.widget.ImageView) df0.qux.o(2131366709, inflate);
                                                                                                                    if (imageView3 != null) {
                                                                                                                        i3 = 2131366725;
                                                                                                                        androidx.fragment.app.FragmentContainerView o9 = df0.qux.o(2131366725, inflate);
                                                                                                                        if (o9 != null) {
                                                                                                                            i3 = 2131366745;
                                                                                                                            com.truecaller.common.ui.SwipeRefreshLayoutWithNestedScrollSupport o10 = df0.qux.o(2131366745, inflate);
                                                                                                                            if (o10 != null) {
                                                                                                                                i3 = 2131366782;
                                                                                                                                com.truecaller.common.ui.tag.TagXView o11 = df0.qux.o(2131366782, inflate);
                                                                                                                                if (o11 != null) {
                                                                                                                                    i3 = 2131367017;
                                                                                                                                    com.truecaller.timezone.TimezoneView o13 = df0.qux.o(2131367017, inflate);
                                                                                                                                    if (o13 != null) {
                                                                                                                                        i3 = 2131367108;
                                                                                                                                        androidx.appcompat.widget.Toolbar o14 = df0.qux.o(2131367108, inflate);
                                                                                                                                        if (o14 != null) {
                                                                                                                                            i3 = 2131367154;
                                                                                                                                            com.truecaller.truecontext.TrueContext o15 = df0.qux.o(2131367154, inflate);
                                                                                                                                            if (o15 != null) {
                                                                                                                                                i3 = 2131367371;
                                                                                                                                                android.widget.ImageView imageView4 = (android.widget.ImageView) df0.qux.o(2131367371, inflate);
                                                                                                                                                if (imageView4 != null) {
                                                                                                                                                    i3 = 2131367373;
                                                                                                                                                    androidx.constraintlayout.widget.ConstraintLayout o16 = df0.qux.o(2131367373, inflate);
                                                                                                                                                    if (o16 != null) {
                                                                                                                                                        i3 = 2131367408;
                                                                                                                                                        android.widget.ImageView imageView5 = (android.widget.ImageView) df0.qux.o(2131367408, inflate);
                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                            com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor constraintLayoutWithTouchInterceptor = inflate;
                                                                                                                                                            ea1.bar barVar = new ea1.bar(constraintLayoutWithTouchInterceptor, actionButtonBarView, textView, o, o2, o3, businessAwarenessView, o4, o5, linearLayout, detailsOverlayAdView, textView2, frameLayout, o6, o7, o8, textView3, textView4, presenceView, textView5, textView6, textView7, imageView, textView8, imageView2, imageView3, o9, o10, o11, o13, o14, o15, imageView4, o16, imageView5);
                                                                                                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(barVar, "inflate(...)");
                                                                                                                                                            this.C0 = barVar;
                                                                                                                                                            setContentView(constraintLayoutWithTouchInterceptor);
                                                                                                                                                            registerReceiver(this.P0, new android.content.IntentFilter("android.intent.action.USER_PRESENT"));
                                                                                                                                                            this.N0 = registerForActivityResult(new androidx.fragment.app.a1(8), new com.truecaller.details_view.ui.j0(this, i2));
                                                                                                                                                            this.O0 = registerForActivityResult(new androidx.fragment.app.a1(8), new com.truecaller.details_view.ui.j0(this, i));
                                                                                                                                                            this.D0 = new q6.baz(getWindow().getDecorView(), getWindow());
                                                                                                                                                            ea1.bar barVar2 = this.C0;
                                                                                                                                                            if (barVar2 != null) {
                                                                                                                                                                setSupportActionBar(barVar2.E);
                                                                                                                                                                i.baz supportActionBar = getSupportActionBar();
                                                                                                                                                                if (supportActionBar != null) {
                                                                                                                                                                    supportActionBar.v(2131233387);
                                                                                                                                                                }
                                                                                                                                                                i.baz supportActionBar2 = getSupportActionBar();
                                                                                                                                                                int i4 = 1;
                                                                                                                                                                if (supportActionBar2 != null) {
                                                                                                                                                                    supportActionBar2.p(true);
                                                                                                                                                                }
                                                                                                                                                                i.baz supportActionBar3 = getSupportActionBar();
                                                                                                                                                                if (supportActionBar3 != null) {
                                                                                                                                                                    supportActionBar3.t(false);
                                                                                                                                                                }
                                                                                                                                                                getWindow().getDecorView().setSystemUiVisibility(1280);
                                                                                                                                                                getWindow().setStatusBarColor(getColor(android.R.color.transparent));
                                                                                                                                                                ea1.bar barVar3 = this.C0;
                                                                                                                                                                if (barVar3 != null) {
                                                                                                                                                                    androidx.constraintlayout.motion.widget.MotionLayout motionLayout = barVar3.p;
                                                                                                                                                                    com.truecaller.details_view.ui.j0 j0Var = new com.truecaller.details_view.ui.j0(this, i4);
                                                                                                                                                                    java.util.WeakHashMap weakHashMap = u6.t0.a;
                                                                                                                                                                    u6.k0.m(motionLayout, j0Var);
                                                                                                                                                                    q6.baz bazVar = this.D0;
                                                                                                                                                                    if (bazVar != null) {
                                                                                                                                                                        dx2.bar barVar4 = dx2.bar.a;
                                                                                                                                                                        if (!(dx2.bar.a() instanceof dx2.qux) && !(dx2.bar.a() instanceof dx2.b)) {
                                                                                                                                                                            z = false;
                                                                                                                                                                        } else {
                                                                                                                                                                            z = true;
                                                                                                                                                                        }
                                                                                                                                                                        bazVar.u(z);
                                                                                                                                                                        ea1.bar barVar5 = this.C0;
                                                                                                                                                                        if (barVar5 != null) {
                                                                                                                                                                            barVar5.q.setSelected(true);
                                                                                                                                                                            ea1.bar barVar6 = this.C0;
                                                                                                                                                                            if (barVar6 != null) {
                                                                                                                                                                                android.widget.ImageView imageView6 = barVar6.w;
                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView6, "sourceIcon");
                                                                                                                                                                                gj.m.f0(imageView6);
                                                                                                                                                                                ea1.bar barVar7 = this.C0;
                                                                                                                                                                                if (barVar7 != null) {
                                                                                                                                                                                    android.widget.ImageView imageView7 = barVar7.z;
                                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView7, "suggestName");
                                                                                                                                                                                    gj.m.f0(imageView7);
                                                                                                                                                                                    ea1.bar barVar8 = this.C0;
                                                                                                                                                                                    if (barVar8 != null) {
                                                                                                                                                                                        com.truecaller.common.ui.tag.TagXView tagXView = barVar8.C;
                                                                                                                                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagXView, "tag");
                                                                                                                                                                                        gj.m.f0(tagXView);
                                                                                                                                                                                        ea1.bar barVar9 = this.C0;
                                                                                                                                                                                        if (barVar9 != null) {
                                                                                                                                                                                            barVar9.z.setOnClickListener(new com.truecaller.details_view.ui.m0(this, i2));
                                                                                                                                                                                            ea1.bar barVar10 = this.C0;
                                                                                                                                                                                            if (barVar10 != null) {
                                                                                                                                                                                                barVar10.G.setOnClickListener(new com.truecaller.details_view.ui.m0(this, i4));
                                                                                                                                                                                                ((com.truecaller.details_view.ui.i0) B0()).u0(new com.truecaller.details_view.ui.x0(this));
                                                                                                                                                                                                z0().a = new com.truecaller.details_view.ui.s0(this);
                                                                                                                                                                                                ge0.i.m(getOnBackPressedDispatcher(), this, new com.truecaller.details_view.ui.l0(this, 1), 2);
                                                                                                                                                                                                android.content.Intent intent = getIntent();
                                                                                                                                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                                                                                                                                                                                                ((com.truecaller.details_view.ui.i0) B0()).n2(ef0.a.w(intent, bundle, "onCreate"));
                                                                                                                                                                                                ea1.bar barVar11 = this.C0;
                                                                                                                                                                                                if (barVar11 != null) {
                                                                                                                                                                                                    barVar11.a.setOnSingleTapListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 17));
                                                                                                                                                                                                    ea1.bar barVar12 = this.C0;
                                                                                                                                                                                                    if (barVar12 != null) {
                                                                                                                                                                                                        androidx.compose.ui.platform.ComposeView composeView = barVar12.h;
                                                                                                                                                                                                        composeView.setViewCompositionStrategy(k4.r1.e);
                                                                                                                                                                                                        composeView.setContent(new d3.qux(507113566, new com.truecaller.details_view.ui.k0(this, 0), true));
                                                                                                                                                                                                        fg3.h0.J(androidx.lifecycle.g1.j(this), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.a1(this, null, 1), 3);
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
                                                                                                                                                                    kotlin.jvm.internal.Intrinsics.n("windowInsetsControllerCompat");
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
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onCreateOptionsMenu(android.view.Menu menu) {
        o.g gVar;
        if (menu != null) {
            getMenuInflater().inflate(2131689490, menu);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = this.M0;
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (next instanceof mb1.bar) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it2 = arrayList.iterator();
            while (true) {
                gVar = null;
                if (!it2.hasNext()) {
                    break;
                }
                mb1.bar barVar = (mb1.bar) it2.next();
                android.view.MenuItem findItem = menu.findItem(((com.truecaller.details_view.ui.optionmenu.OptionMenu) ((ld0.bar) barVar).c).getId());
                if (findItem != null) {
                    findItem.setVisible(((ld0.bar) barVar).a);
                    findItem.setShowAsAction(1);
                    findItem.setIcon(((ld0.bar) barVar).b);
                    findItem.setTitle((java.lang.CharSequence) null);
                }
            }
            android.view.View actionView = menu.findItem(2131365309).getActionView();
            if (actionView != null) {
                android.app.Activity O = ye0.k.O(this);
                p.y1 y1Var = new p.y1(O, actionView, 8388613);
                n.f fVar = new n.f(O);
                o.g gVar2 = y1Var.b;
                fVar.inflate(2131689491, gVar2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    java.lang.Object next2 = it3.next();
                    if (next2 instanceof mb1.baz) {
                        arrayList3.add(next2);
                    }
                }
                java.util.Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    mb1.baz bazVar = (mb1.baz) it4.next();
                    com.truecaller.details_view.ui.optionmenu.OptionMenu optionMenu = (com.truecaller.details_view.ui.optionmenu.OptionMenu) ((ld0.bar) bazVar).c;
                    int i = ((ld0.bar) bazVar).b;
                    android.view.MenuItem findItem2 = gVar2.findItem(optionMenu.getId());
                    if (findItem2 != null) {
                        findItem2.setVisible(((ld0.bar) bazVar).a);
                        if (((com.truecaller.details_view.ui.optionmenu.OptionMenu) ((ld0.bar) bazVar).c).getId() == 2131362054) {
                            f0.qux.q(findItem2, D0().d(i), (java.lang.Integer) null, 6);
                        } else {
                            f0.qux.q(findItem2, D0().d(i), java.lang.Integer.valueOf(bi3.a.s(D0().a, 2130970935)), 4);
                        }
                    }
                }
                y1Var.e = new com.truecaller.details_view.ui.j0(this, 3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(gVar2, "getMenu(...)");
                if (gVar2 != null) {
                    gVar = gVar2;
                }
                if (gVar != null) {
                    gVar.s = true;
                }
                if (gVar2 != null) {
                    gVar2.x = true;
                } else if (android.os.Build.VERSION.SDK_INT >= 28) {
                    gVar2.x = true;
                }
                actionView.setOnClickListener(new com.truecaller.details_view.ui.n0(y1Var, 0));
                gb1.d z0 = z0();
                com.truecaller.details_view.ui.d1 d1Var = z0.D;
                if (d1Var != null) {
                    xb1.c cVar = d1Var.c.a;
                    com.truecaller.details_view.ui.s0 s0Var = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) z0).a;
                    if (s0Var != null) {
                        s0Var.f(cVar.f, cVar.g);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.details_view.ui.Hilt_DetailsViewActivityLegacy
    public final void onDestroy() {
        ((com.truecaller.details_view.ui.i0) B0()).m1();
        z0().m1();
        unregisterReceiver(this.P0);
        ea1.bar barVar = this.C0;
        if (barVar != null) {
            barVar.k.g();
            super.onDestroy();
        } else {
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
    }

    public final boolean onMenuOpened(int i, android.view.Menu menu) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menu, "menu");
        qa1.a aVar = (qa1.a) ((com.truecaller.details_view.ui.i0) B0()).q;
        aVar.b("OverflowMenu", aVar.h);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        super/*androidx.activity.ComponentActivity*/.onNewIntent(intent);
        setIntent(intent);
        ((com.truecaller.details_view.ui.i0) B0()).n2(ef0.a.w(intent, (android.os.Bundle) null, "onNewIntent"));
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        java.lang.String n;
        java.lang.String s;
        java.lang.String Q;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "item");
        com.truecaller.details_view.ui.t B0 = B0();
        int itemId = menuItem.getItemId();
        com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) B0;
        qa1.baz bazVar = i0Var.q;
        boolean z = true;
        if (itemId == 16908332) {
            com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
            if (uVar != null) {
                ((com.truecaller.details_view.ui.x0) uVar).b.finish();
                return true;
            }
        } else {
            java.lang.String str5 = null;
            if (itemId == 2131362068) {
                qa1.a aVar = (qa1.a) bazVar;
                java.lang.String str6 = aVar.h;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction contactDetailsAction = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.SHARE;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction contactDetailsSubAction = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDetailsAction, "action");
                java.lang.String value = contactDetailsAction.getValue();
                if (contactDetailsSubAction != null) {
                    str4 = contactDetailsSubAction.getValue();
                } else {
                    str4 = null;
                }
                nc0.u1.e(uf.qux.p(value, "action", value, str4, str6), aVar.a);
                fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var, str5, 6), 3);
                return true;
            }
            boolean z2 = false;
            if (itemId == 2131361998) {
                qa1.a aVar2 = (qa1.a) bazVar;
                java.lang.String str7 = aVar2.h;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction contactDetailsAction2 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.COPY_NUMBER;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction contactDetailsSubAction2 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDetailsAction2, "action");
                java.lang.String value2 = contactDetailsAction2.getValue();
                if (contactDetailsSubAction2 != null) {
                    str3 = contactDetailsSubAction2.getValue();
                } else {
                    str3 = null;
                }
                nc0.u1.e(uf.qux.p(value2, "action", value2, str3, str7), aVar2.a);
                com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar2 != null) {
                    com.truecaller.details_view.ui.d1 d1Var = i0Var.d0;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact = d1Var.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                        com.google.firebase.messaging.o A0 = ((com.truecaller.details_view.ui.x0) uVar2).b.A0();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                        java.lang.String o = contact.o();
                        android.content.Context context = (android.content.Context) A0.a;
                        if (o != null) {
                            ((i.d0) A0.c).h(o);
                            p40.l.z(context, o, "copiedFromTC");
                            android.widget.Toast.makeText(context, 2132020435, 0).show();
                            return true;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
            } else if (itemId == 2131361996) {
                qa1.a aVar3 = (qa1.a) bazVar;
                java.lang.String str8 = aVar3.h;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction contactDetailsAction3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.COPY;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction contactDetailsSubAction3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDetailsAction3, "action");
                java.lang.String value3 = contactDetailsAction3.getValue();
                if (contactDetailsSubAction3 != null) {
                    str2 = contactDetailsSubAction3.getValue();
                } else {
                    str2 = null;
                }
                nc0.u1.e(uf.qux.p(value3, "action", value3, str2, str8), aVar3.a);
                com.truecaller.details_view.ui.u uVar3 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar3 != null) {
                    com.truecaller.details_view.ui.d1 d1Var2 = i0Var.d0;
                    if (d1Var2 != null) {
                        com.truecaller.data.entity.Contact contact2 = d1Var2.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                        com.google.firebase.messaging.o A02 = ((com.truecaller.details_view.ui.x0) uVar3).b.A0();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact2, "contact");
                        java.lang.String str9 = contact2.I;
                        java.lang.String y = contact2.y();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(y, "getJobDetails(...)");
                        java.lang.String o2 = contact2.o();
                        java.lang.String e = contact2.e();
                        java.lang.String str10 = contact2.N;
                        if (!jj3.bar.i(str10)) {
                            str5 = bar.t("\"", str10, "\"");
                        }
                        java.lang.String C = u03.e0.C(", ", new java.lang.String[]{str9, y, o2, e, str5});
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "combineDefault(...)");
                        android.content.Context context2 = (android.content.Context) A02.a;
                        p40.l.z(context2, C, "copiedFromTC");
                        android.widget.Toast.makeText(context2, 2132020435, 0).show();
                        return true;
                    }
                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                    throw null;
                }
            } else if (itemId == 2131361997) {
                qa1.a aVar4 = (qa1.a) bazVar;
                java.lang.String str11 = aVar4.h;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction contactDetailsAction4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsAction.COPY_NAME;
                com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction contactDetailsSubAction4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str11, "context");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactDetailsAction4, "action");
                java.lang.String value4 = contactDetailsAction4.getValue();
                if (contactDetailsSubAction4 != null) {
                    str = contactDetailsSubAction4.getValue();
                } else {
                    str = null;
                }
                nc0.u1.e(uf.qux.p(value4, "action", value4, str, str11), aVar4.a);
                com.truecaller.details_view.ui.u uVar4 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                if (uVar4 != null) {
                    com.truecaller.details_view.ui.d1 d1Var3 = i0Var.d0;
                    if (d1Var3 != null) {
                        com.truecaller.data.entity.Contact contact3 = d1Var3.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                        com.google.firebase.messaging.o A03 = ((com.truecaller.details_view.ui.x0) uVar4).b.A0();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact3, "contact");
                        java.lang.String s2 = contact3.s();
                        if (s2 != null) {
                            android.content.Context context3 = (android.content.Context) A03.a;
                            p40.l.z(context3, s2, "copiedFromTC");
                            android.widget.Toast.makeText(context3, 2132020435, 0).show();
                            return true;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
            } else {
                if (itemId == 2131362057) {
                    com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget detailsWidget = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.OVERFLOW_MENU;
                    qa1.a aVar5 = (qa1.a) bazVar;
                    aVar5.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsWidget, "widget");
                    java.lang.String str12 = aVar5.h;
                    com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.SAVE;
                    java.lang.String value5 = detailsWidget.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str12, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction, "action");
                    java.lang.String value6 = contactAction.getValue();
                    nc0.u1.e(uf.qux.p(value6, "action", value6, value5, str12), aVar5.a);
                    fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.c0(i0Var, str5, 2), 3);
                    return true;
                }
                if (itemId == 2131362062) {
                    qa1.a aVar6 = (qa1.a) bazVar;
                    java.lang.String str13 = aVar6.h;
                    com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction2 = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.SEARCH_WEB;
                    java.lang.String value7 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str13, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction2, "action");
                    java.lang.String value8 = contactAction2.getValue();
                    nc0.u1.e(uf.qux.p(value8, "action", value8, value7, str13), aVar6.a);
                    com.truecaller.details_view.ui.u uVar5 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                    if (uVar5 != null) {
                        com.truecaller.details_view.ui.d1 d1Var4 = i0Var.d0;
                        if (d1Var4 != null) {
                            com.truecaller.data.entity.Contact contact4 = d1Var4.a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "contact");
                            com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar5).b;
                            com.google.firebase.messaging.o A04 = detailsViewActivityLegacy.A0();
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "contact");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsViewActivityLegacy, "activity");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "<this>");
                            java.lang.String s3 = contact4.s();
                            if (s3 != null && s3.length() != 0 && (Q = gj.m.Q(contact4)) != null && Q.length() != 0 && !kotlin.jvm.internal.Intrinsics.b(contact4.s(), gj.m.Q(contact4)) && contact4.G() != 20) {
                                tb1.b.k.getClass();
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact4, "contact");
                                tb1.b bVar = new tb1.b();
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putParcelable("contact_arg", contact4);
                                bVar.setArguments(bundle);
                                bVar.show(detailsViewActivityLegacy.getSupportFragmentManager(), (java.lang.String) null);
                                return true;
                            }
                            if (contact4.G() == 20) {
                                z2 = true;
                            }
                            com.truecaller.data.entity.Number r = contact4.r();
                            if (r == null || (n = r.d()) == null) {
                                n = contact4.n();
                            }
                            if (!z2 && (s = contact4.s()) != null && s.length() != 0) {
                                n = contact4.s();
                            }
                            if (n != null && n.length() != 0) {
                                i61.bar.t((android.content.Context) A04.a, h6.e.M(n, gj.m.p(contact4)));
                                return true;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    }
                } else {
                    if (itemId == 2131362013) {
                        fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.d0(i0Var, z, str5, 1 == true ? 1 : 0), 3);
                        return true;
                    }
                    if (itemId == 2131362080) {
                        fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.d0(i0Var, z2, str5, 1 == true ? 1 : 0), 3);
                        return true;
                    }
                    if (itemId == 2131362009) {
                        com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget detailsWidget2 = com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.OVERFLOW_MENU;
                        qa1.a aVar7 = (qa1.a) bazVar;
                        aVar7.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsWidget2, "widget");
                        java.lang.String str14 = aVar7.h;
                        com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.EDIT;
                        java.lang.String value9 = detailsWidget2.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str14, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction3, "action");
                        java.lang.String value10 = contactAction3.getValue();
                        nc0.u1.e(uf.qux.p(value10, "action", value10, value9, str14), aVar7.a);
                        com.truecaller.details_view.ui.u uVar6 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar6 != null) {
                            com.truecaller.details_view.ui.d1 d1Var5 = i0Var.d0;
                            if (d1Var5 != null) {
                                ((com.truecaller.details_view.ui.x0) uVar6).b(d1Var5.a);
                                return true;
                            }
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    } else if (itemId == 2131362004) {
                        qa1.a aVar8 = (qa1.a) bazVar;
                        java.lang.String str15 = aVar8.h;
                        com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction4 = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.DELETE;
                        java.lang.String value11 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str15, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction4, "action");
                        java.lang.String value12 = contactAction4.getValue();
                        nc0.u1.e(uf.qux.p(value12, "action", value12, value11, str15), aVar8.a);
                        com.truecaller.details_view.ui.u uVar7 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar7 != null) {
                            androidx.fragment.app.g1 supportFragmentManager = ((com.truecaller.details_view.ui.x0) uVar7).b.getSupportFragmentManager();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager, "TAG_DELETE_CONTACT_CONFIRMATION_DIALOG", 2132020437, 2132020436, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                            return true;
                        }
                    } else if (itemId == 2131362005) {
                        qa1.a aVar9 = (qa1.a) bazVar;
                        java.lang.String str16 = aVar9.h;
                        com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction5 = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.DELETE_IDENTIFIED;
                        java.lang.String value13 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str16, "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction5, "action");
                        java.lang.String value14 = contactAction5.getValue();
                        nc0.u1.e(uf.qux.p(value14, "action", value14, value13, str16), aVar9.a);
                        com.truecaller.details_view.ui.u uVar8 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar8 != null) {
                            androidx.fragment.app.g1 supportFragmentManager2 = ((com.truecaller.details_view.ui.x0) uVar8).b.getSupportFragmentManager();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                            com.truecaller.common.ui.dialogs.qux.b(supportFragmentManager2, "TAG_DELETE_IDENTIFIED_CONTACT_CONFIRMATION_DIALOG", 2132020439, 2132020438, (java.lang.Integer) null, 2132021640, 2132021579, (com.truecaller.common.ui.dialogs.TcSystemDialog.ButtonsOrientation) null, 400);
                            return true;
                        }
                    } else if (itemId == 2131362054) {
                        qa1.a aVar10 = (qa1.a) bazVar;
                        nc0.u1.e(uf.qux.p("ReportProfile", "action", "ReportProfile", "OverflowMenu", aVar10.h), aVar10.a);
                        com.truecaller.details_view.ui.u uVar9 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar9 != null) {
                            com.truecaller.details_view.ui.d1 d1Var6 = i0Var.d0;
                            if (d1Var6 != null) {
                                android.os.Parcelable parcelable = d1Var6.a;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "contact");
                                bd3.qux quxVar = ((com.truecaller.details_view.ui.x0) uVar9).b;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "context");
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcelable, "contact");
                                android.content.Intent intent = new android.content.Intent((android.content.Context) quxVar, (java.lang.Class<?>) com.truecaller.surveys.ui.reportProfile.ReportProfileSurveyActivity.class);
                                intent.putExtra("KEY_CONTACT", parcelable);
                                quxVar.startActivity(intent);
                                return true;
                            }
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                    } else {
                        if (itemId == 2131362073) {
                            com.truecaller.details_view.ui.d1 d1Var7 = i0Var.d0;
                            if (d1Var7 != null) {
                                i0Var.p2(d1Var7.a);
                                return true;
                            }
                            kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                            throw null;
                        }
                        if (itemId != 2131361993) {
                            return false;
                        }
                        fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var, str5, 7), 3);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    public final void onPause() {
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        B0();
        oa1.bar C0 = C0();
        if (C0 != null) {
            ma1.qux quxVar = (ma1.qux) C0.getPresenter();
            quxVar.k = false;
            quxVar.c2(false);
        }
        o80.bar v0 = v0();
        if (v0 != null) {
            v0.g();
        }
        o80.bar x0 = x0();
        if (x0 != null) {
            x0.g();
        }
        ea1.bar barVar = this.C0;
        if (barVar != null) {
            com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = barVar.k;
            if (detailsOverlayAdView.getVisibility() == 0) {
                android.animation.ValueAnimator valueAnimator = detailsOverlayAdView.f;
                if (valueAnimator != null) {
                    valueAnimator.pause();
                }
                android.os.CountDownTimer countDownTimer = detailsOverlayAdView.g;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                detailsOverlayAdView.g = null;
            }
            na1.baz w0 = w0();
            if (w0 != null) {
                ma1.qux quxVar2 = (ma1.qux) w0.getPresenter();
                quxVar2.k = false;
                quxVar2.c2(false);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void onPaymentError(int i, java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.d0;
        if (eVar != null) {
            eVar.l(i);
        }
    }

    public final void onPaymentSuccess(java.lang.String str, com.razorpay.PaymentData paymentData) {
        mk.e eVar = this.d0;
        if (eVar != null) {
            eVar.k(paymentData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestart() {
        super/*android.app.Activity*/.onRestart();
        com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) B0();
        if (i0Var.i0) {
            i0Var.i0 = false;
            i0Var.k2(com.truecaller.details_view.analytics.SourceType.CallFromDV);
        }
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        com.truecaller.details_view.ui.i0 i0Var = (com.truecaller.details_view.ui.i0) B0();
        df3.bar barVar = null;
        if (i0Var.d0 != null) {
            fg3.h0.J(i0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.details_view.ui.w(i0Var, barVar, 9), 3);
        }
        oa1.bar C0 = C0();
        if (C0 != null) {
            ma1.qux quxVar = (ma1.qux) C0.getPresenter();
            quxVar.k = true;
            quxVar.R0(true);
        }
        o80.bar v0 = v0();
        if (v0 != null) {
            v0.i();
        }
        o80.bar x0 = x0();
        if (x0 != null) {
            x0.i();
        }
        ea1.bar barVar2 = this.C0;
        if (barVar2 != null) {
            com.truecaller.details_view.ui.ads.DetailsOverlayAdView detailsOverlayAdView = barVar2.k;
            if (detailsOverlayAdView.getVisibility() == 0) {
                if (detailsOverlayAdView.k) {
                    detailsOverlayAdView.g();
                    gj.m.f0(detailsOverlayAdView);
                    kotlin.jvm.functions.Function0 function0 = detailsOverlayAdView.l;
                    if (function0 != null) {
                        function0.invoke();
                    }
                } else {
                    android.animation.ValueAnimator valueAnimator = detailsOverlayAdView.f;
                    if (valueAnimator != null) {
                        valueAnimator.resume();
                    }
                    long j = detailsOverlayAdView.h;
                    if (j > 0) {
                        android.os.CountDownTimer countDownTimer = detailsOverlayAdView.g;
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        detailsOverlayAdView.g = new com.truecaller.sdk.d(j, detailsOverlayAdView, 5).start();
                    }
                }
            }
            na1.baz w0 = w0();
            if (w0 != null) {
                ma1.qux quxVar2 = (ma1.qux) w0.getPresenter();
                quxVar2.k = true;
                quxVar2.R0(true);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void reportFullyDrawn() {
        try {
            mk.e eVar = this.A0;
            if (eVar != null) {
                eVar.m();
                super/*androidx.activity.ComponentActivity*/.reportFullyDrawn();
            } else {
                kotlin.jvm.internal.Intrinsics.n("viewFullyDrawnReporter");
                throw null;
            }
        } catch (java.lang.SecurityException e) {
            o82.a.C(e);
        }
    }

    public final e70.c u0() {
        e70.c cVar = this.y0;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.Intrinsics.n("adInterstitialManager");
        throw null;
    }

    public final o80.bar v0() {
        int childCount;
        o80.bar barVar = this.F0;
        if (barVar == null) {
            ea1.bar barVar2 = this.C0;
            if (barVar2 != null) {
                android.widget.LinearLayout linearLayout = barVar2.j;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "contentContainer");
                o80.bar findViewWithTag = linearLayout.findViewWithTag("AD_WIDGET");
                if (findViewWithTag == null && (childCount = linearLayout.getChildCount()) >= 0) {
                    int i = 0;
                    while (true) {
                        androidx.lifecycle.d childAt = linearLayout.getChildAt(i);
                        if (childAt instanceof db1.s) {
                            findViewWithTag = (o80.bar) ((db1.s) childAt).findViewWithTag("AD_WIDGET");
                            break;
                        }
                        if (i == childCount) {
                            break;
                        }
                        i++;
                    }
                }
                this.F0 = findViewWithTag;
                return findViewWithTag;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        return barVar;
    }

    public final na1.baz w0() {
        na1.baz bazVar = this.H0;
        if (bazVar == null) {
            ea1.bar barVar = this.C0;
            if (barVar != null) {
                android.widget.LinearLayout linearLayout = barVar.j;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "contentContainer");
                na1.baz bazVar2 = (na1.baz) linearLayout.findViewWithTag("BOTTOM_AD");
                this.H0 = bazVar2;
                return bazVar2;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        return bazVar;
    }

    public final o80.bar x0() {
        o80.bar barVar = this.G0;
        if (barVar == null) {
            ea1.bar barVar2 = this.C0;
            if (barVar2 != null) {
                android.widget.LinearLayout linearLayout = barVar2.j;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "contentContainer");
                o80.bar findViewWithTag = linearLayout.findViewWithTag("DV_BOTTOM_AD_WIDGET");
                this.G0 = findViewWithTag;
                return findViewWithTag;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        return barVar;
    }

    public final lb1.c y0() {
        lb1.c cVar = this.J0;
        if (cVar == null) {
            ea1.bar barVar = this.C0;
            lb1.c cVar2 = null;
            if (barVar != null) {
                android.widget.LinearLayout linearLayout = barVar.j;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "contentContainer");
                u6.x0 it = new u6.w0(linearLayout).iterator();
                while (true) {
                    u6.x0 x0Var = it;
                    if (!x0Var.hasNext()) {
                        break;
                    }
                    android.view.View view = (android.view.View) x0Var.next();
                    if (view instanceof kb1.h) {
                        cVar2 = (lb1.c) view.findViewWithTag("CallAndRecordView");
                        break;
                    }
                }
                this.J0 = cVar2;
                return cVar2;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        return cVar;
    }

    public final gb1.d z0() {
        gb1.d dVar = this.f0;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.Intrinsics.n("detailsHeaderPresenter");
        throw null;
    }
}
