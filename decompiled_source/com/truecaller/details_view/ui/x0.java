package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class x0 implements com.truecaller.details_view.ui.u {
    public final com.truecaller.details_view.ui.v0 a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;

    public x0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy) {
        this.b = detailsViewActivityLegacy;
        this.a = new com.truecaller.details_view.ui.v0(detailsViewActivityLegacy);
    }

    public static final void d(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, java.lang.String str, boolean z) {
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            ur.i k = ur.i.k(barVar.a, str, 0);
            if (z) {
                k.l(2132020507, new com.truecaller.details_view.ui.m0(detailsViewActivityLegacy, 3));
                android.view.View findViewById = ((ur.g) k).i.findViewById(2131366523);
                kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                ((android.widget.TextView) findViewById).setAllCaps(false);
            }
            detailsViewActivityLegacy.E0 = new java.lang.ref.WeakReference(k);
            k.n();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void a(boolean z) {
        int i;
        if (z) {
            i = 128;
        } else {
            i = 64;
        }
        int q = bd.bar.q(i);
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            d6.j L = barVar.p.L(2131363068);
            ea1.bar barVar2 = detailsViewActivityLegacy.C0;
            if (barVar2 != null) {
                L.n(barVar2.i.getId(), q + detailsViewActivityLegacy.L0);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void b(com.truecaller.data.entity.Contact contact) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        androidx.activity.ComponentActivity componentActivity = this.b;
        com.google.firebase.messaging.o A0 = componentActivity.A0();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        a71.bar barVar = (a71.bar) A0.d;
        com.truecaller.contacteditor.api.Source source = com.truecaller.contacteditor.api.Source.DETAILS_VIEW;
        barVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        android.content.Intent a = barVar.a(componentActivity, contact.E(), source, null);
        if (a == null) {
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a, "intent");
        componentActivity.startActivityForResult(a, 21);
    }

    public final void c(com.truecaller.contacteditor.api.model.ContactExtras contactExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactExtras, "contactExtras");
        androidx.activity.ComponentActivity componentActivity = this.b;
        com.google.firebase.messaging.o A0 = componentActivity.A0();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactExtras, "contactExtras");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        a71.bar barVar = (a71.bar) A0.d;
        com.truecaller.contacteditor.api.Source source = com.truecaller.contacteditor.api.Source.DETAILS_VIEW;
        barVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactExtras, "contactExtras");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "activity");
        android.content.Intent b = barVar.b(componentActivity, contactExtras, source, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "intent");
        componentActivity.startActivityForResult(b, 22);
    }

    public final void e(int i) {
        android.widget.Toast.makeText((android.content.Context) this.b, i, 0).show();
    }

    public final void f(h10.b bVar, com.truecaller.ads.configmanagement.model.DetailsOverlayAdConfig detailsOverlayAdConfig, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(detailsOverlayAdConfig, "config");
        int i = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        detailsViewActivityLegacy.E0(false);
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            barVar.k.setOnDismissListener(new by2.a(20, detailsViewActivityLegacy, function0));
            ea1.bar barVar2 = detailsViewActivityLegacy.C0;
            if (barVar2 != null) {
                barVar2.k.h(bVar, detailsOverlayAdConfig);
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void g(int i) {
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        gk2.qux quxVar = detailsViewActivityLegacy.t0;
        if (quxVar != null) {
            ea1.bar barVar = detailsViewActivityLegacy.C0;
            if (barVar != null) {
                com.truecaller.ui.view.ConstraintLayoutWithTouchInterceptor constraintLayoutWithTouchInterceptor = barVar.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayoutWithTouchInterceptor, "getRoot(...)");
                quxVar.K(constraintLayoutWithTouchInterceptor, new gk2.baz(i), com.truecaller.rewardprogram.api.RewardProgramSource.DETAILS_VIEW);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("rewardProgramClaimRewardSnackbar");
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0088. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(java.util.ArrayList arrayList, com.truecaller.details_view.ui.d1 d1Var) {
        java.util.Iterator it;
        aq0.c bVar;
        int i;
        android.widget.LinearLayout.LayoutParams layoutParams;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "widgets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "detailsViewModel");
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        android.util.AttributeSet attributeSet = null;
        if (barVar != null) {
            barVar.j.setOnHierarchyChangeListener(this.a);
            com.moloco.sdk.acm.http.a aVar = detailsViewActivityLegacy.l0;
            if (aVar != null) {
                ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                if (barVar2 != null) {
                    android.widget.LinearLayout linearLayout = barVar2.j;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(linearLayout, "contentContainer");
                    java.util.ArrayList arrayList2 = aVar.b;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linearLayout, "container");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "widgets");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "detailsViewModel");
                    java.util.ArrayList arrayList3 = aVar.a;
                    if (kotlin.jvm.internal.Intrinsics.b(arrayList3, arrayList)) {
                        java.util.Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((zb1.bar) it2.next()).f(d1Var);
                        }
                    } else {
                        linearLayout.removeAllViews();
                        arrayList3.clear();
                        arrayList3.addAll(arrayList);
                        arrayList2.clear();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.util.Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            com.truecaller.details_view.ui.widget.WidgetType widgetType = (com.truecaller.details_view.ui.widget.WidgetType) it3.next();
                            android.content.Context context = linearLayout.getContext();
                            int[] iArr = zb1.a.a;
                            switch (iArr[widgetType.ordinal()]) {
                                case 1:
                                    it = it3;
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new wa1.b(context);
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                        if (i != 23) {
                                            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                            layoutParams.topMargin = bd.bar.q(16);
                                            layoutParams.leftMargin = bd.bar.q(16);
                                            layoutParams.rightMargin = bd.bar.q(16);
                                        } else {
                                            layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                            layoutParams.topMargin = bd.bar.q(16);
                                        }
                                    } else {
                                        layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
                                        layoutParams.topMargin = bd.bar.q(2);
                                        layoutParams.leftMargin = bd.bar.q(16);
                                        layoutParams.rightMargin = bd.bar.q(16);
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                case 2:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new android.widget.LinearLayout(context, null, 0, 0);
                                    if (!bVar.isInEditMode() && !bVar.b) {
                                        bVar.b = true;
                                        tx.d0 d0Var = (eb1.i) bVar.X3();
                                        tx.e eVar = d0Var.e;
                                        tx.w wVar = eVar.f;
                                        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
                                        it = it3;
                                        p.c3 O0 = wVar.b.O0();
                                        ej.b h0 = eVar.h0();
                                        o02.baz g3 = wVar.g3();
                                        tx.f fVar = eVar.g;
                                        bVar.c = new eb1.g(coroutineContext, O0, h0, g3, (qa1.baz) fVar.h.get(), (tc1.bar) fVar.j.get(), eVar.c(), (oc1.bar) fVar.i.get());
                                        bVar.d = eVar.h0();
                                        tx.w wVar2 = d0Var.c;
                                        bVar.e = (i82.t) wVar2.bc.get();
                                        bVar.f = (e70.c) wVar2.b.S2.get();
                                    } else {
                                        it = it3;
                                    }
                                    bVar.setBackground(context.getDrawable(2131234351));
                                    bVar.setOrientation(1);
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 3:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new db1.s(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 4:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new fb1.e(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 5:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new hb1.qux(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 6:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new android.widget.FrameLayout(context, null, 0);
                                    if (!bVar.isInEditMode() && !bVar.b) {
                                        bVar.b = true;
                                        tx.e eVar2 = ((ib1.a) bVar.X3()).e;
                                        n11.g gVar = (n11.g) eVar2.f.F1.get();
                                        tx.f fVar2 = eVar2.g;
                                        bVar.c = new com.truecaller.filters.blockedevents.qux(gVar, (tc1.bar) fVar2.j.get(), (oc1.bar) fVar2.i.get());
                                    }
                                    android.view.View inflate = android.view.LayoutInflater.from(context).inflate(2131561054, (android.view.ViewGroup) bVar, false);
                                    bVar.addView(inflate);
                                    if (inflate != null) {
                                        android.widget.TextView textView = (android.widget.TextView) inflate;
                                        ea1.j jVar = new ea1.j(textView, textView, 1);
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jVar, "inflate(...)");
                                        bVar.d = jVar;
                                        it = it3;
                                        bVar.setVisibility(8);
                                        i = iArr[widgetType.ordinal()];
                                        if (i != 5) {
                                        }
                                        linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                        bVar.f(d1Var);
                                        arrayList4.add(bVar);
                                        it3 = it;
                                        attributeSet = null;
                                    } else {
                                        throw new java.lang.NullPointerException("rootView");
                                    }
                                    break;
                                case 7:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new android.widget.LinearLayout(context, attributeSet, 0, 0);
                                    if (!bVar.isInEditMode() && !bVar.b) {
                                        bVar.b = true;
                                        tx.d0 d0Var2 = (kb1.i) bVar.X3();
                                        tx.e eVar3 = d0Var2.e;
                                        tx.w wVar3 = eVar3.f;
                                        kotlin.coroutines.CoroutineContext coroutineContext2 = (kotlin.coroutines.CoroutineContext) wVar3.V1.get();
                                        y42.f fVar3 = (y42.f) wVar3.h1.get();
                                        ac1.a aVar2 = new ac1.a((xu0.d) wVar3.C7.get(), (cw0.c) wVar3.J7.get(), (nv0.c) wVar3.R7.get(), (rh1.qux) wVar3.T7.get(), (t41.t) wVar3.A1.get());
                                        u03.f0 f0Var = (u03.f0) wVar3.q9.get();
                                        q81.b bVar2 = (q81.b) wVar3.S5.get();
                                        tx.f fVar4 = eVar3.g;
                                        bVar.c = new kb1.g(coroutineContext2, fVar3, aVar2, f0Var, bVar2, (qa1.baz) fVar4.h.get(), (com.truecaller.data.country.d) wVar3.a4.get(), (mg2.bar) wVar3.q4.get(), (m03.n0) wVar3.b.X3.get(), (qo1.r) wVar3.V3.get(), (qo1.f) wVar3.X5.get(), (oc1.bar) fVar4.i.get());
                                        bVar.d = eVar3.n();
                                        bVar.e = new i.d0((mz0.bar) d0Var2.c.b.e6.get());
                                    }
                                    bVar.setBackground(context.getDrawable(2131234351));
                                    bVar.setOrientation(1);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 8:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new wb1.a(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 9:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new vb1.qux(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.VAL2_FIELD_NUMBER /* 10 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new ub1.d(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.VAL3_FIELD_NUMBER /* 11 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new ua1.e(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.VAL4_FIELD_NUMBER /* 12 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new ka1.a(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.VAL5_FIELD_NUMBER /* 13 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new jb1.qux(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.DATETIME_FIELD_NUMBER /* 14 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new com.truecaller.details_view.ui.ads.DetailsAdView(context, null, 0, 6, null);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.DFFVAL1_FIELD_NUMBER /* 15 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new na1.baz(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.DFFVAL2_FIELD_NUMBER /* 16 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new com.truecaller.ads.mutliad.ui.container.MultiAdContainer(context, attributeSet, 0);
                                    if (!bVar.isInEditMode()) {
                                        bVar.q();
                                    }
                                    bVar.setTag("DV_BOTTOM_AD_WIDGET");
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.DFFVAL3_FIELD_NUMBER /* 17 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new androidx.constraintlayout.widget.ConstraintLayout(context, attributeSet, 0, 0);
                                    android.view.LayoutInflater.from(context).inflate(2131561062, (android.view.ViewGroup) bVar);
                                    int i2 = 2131362746;
                                    if (((android.widget.ImageView) df0.qux.o(2131362746, bVar)) != null) {
                                        i2 = 2131365079;
                                        if (((android.widget.TextView) df0.qux.o(2131365079, bVar)) != null) {
                                            i2 = 2131365080;
                                            if (((android.widget.TextView) df0.qux.o(2131365080, bVar)) != null) {
                                                bVar.setBackground(context.getDrawable(2131231245));
                                                it = it3;
                                                bVar.setVisibility(8);
                                                i = iArr[widgetType.ordinal()];
                                                if (i != 5) {
                                                }
                                                linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                                bVar.f(d1Var);
                                                arrayList4.add(bVar);
                                                it3 = it;
                                                attributeSet = null;
                                            }
                                        }
                                    }
                                    throw new java.lang.NullPointerException("Missing required view with ID: ".concat(bVar.getResources().getResourceName(i2)));
                                case fr1.d.DFFVAL4_FIELD_NUMBER /* 18 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new ob1.qux(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case fr1.d.DFFVAL5_FIELD_NUMBER /* 19 */:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new rb1.qux(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 20:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new aq0.c(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 21:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new com.truecaller.bizmon.callMeBack.mvp.BizCallMeBackWithSlotsView(context, attributeSet, 0, 0);
                                    if (!bVar.isInEditMode()) {
                                        bVar.H();
                                    }
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 22:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                                    bVar = new yb1.bar(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                case 23:
                                    kotlin.jvm.internal.Intrinsics.d(context);
                                    bVar = new yb1.c(context);
                                    it = it3;
                                    bVar.setVisibility(8);
                                    i = iArr[widgetType.ordinal()];
                                    if (i != 5) {
                                    }
                                    linearLayout.addView((android.view.View) bVar, (android.view.ViewGroup.LayoutParams) layoutParams);
                                    bVar.f(d1Var);
                                    arrayList4.add(bVar);
                                    it3 = it;
                                    attributeSet = null;
                                    break;
                                default:
                                    throw new java.lang.RuntimeException();
                            }
                        }
                        kotlin.collections.d0.v(arrayList2, arrayList4);
                    }
                    ea1.bar barVar3 = detailsViewActivityLegacy.C0;
                    if (barVar3 != null) {
                        barVar3.j.setOnHierarchyChangeListener(null);
                        oa1.bar C0 = detailsViewActivityLegacy.C0();
                        if (C0 != null) {
                            C0.f(d1Var);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            }
            kotlin.jvm.internal.Intrinsics.n("widgetUpdater");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }
}
