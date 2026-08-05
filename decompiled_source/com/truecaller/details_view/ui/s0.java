package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class s0 {
    public com.truecaller.details_view.ui.q0 a;
    public com.truecaller.details_view.ui.r0 b;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy c;

    public s0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy) {
        this.c = detailsViewActivityLegacy;
    }

    public static final void d(com.truecaller.details_view.ui.s0 s0Var, xb1.f fVar, java.lang.Float f, java.lang.Integer num) {
        if ((f != null && f.floatValue() > 0.5f) || (num != null && num.intValue() == 2131363068)) {
            s0Var.g(fVar.b);
        } else {
            s0Var.g(fVar.a);
        }
    }

    public final void a() {
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.c;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            android.widget.TextView textView = barVar.v;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "source");
            gj.m.f0(textView);
            ea1.bar barVar2 = detailsViewActivityLegacy.C0;
            if (barVar2 != null) {
                android.widget.ImageView imageView = barVar2.w;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "sourceIcon");
                gj.m.f0(imageView);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void b() {
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.c;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            android.widget.TextView textView = barVar.x;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "spamCategoryAndCount");
            gj.m.f0(textView);
            ea1.bar barVar2 = detailsViewActivityLegacy.C0;
            if (barVar2 != null) {
                android.widget.ImageView imageView = barVar2.y;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "spamCategoryIcon");
                gj.m.f0(imageView);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void c() {
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.c;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            androidx.fragment.app.FragmentContainerView fragmentContainerView = barVar.A;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "surveyContainer");
            gj.m.k0(fragmentContainerView, false);
            androidx.fragment.app.g1 supportFragmentManager = detailsViewActivityLegacy.getSupportFragmentManager();
            androidx.fragment.app.Fragment G = supportFragmentManager.G("DetailsViewSurveyControllerFragment");
            if (G != null) {
                androidx.fragment.app.bar barVar2 = new androidx.fragment.app.bar(supportFragmentManager);
                barVar2.s(G);
                barVar2.m(true, true);
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void e(int i) {
        androidx.appcompat.widget.AppCompatImageView appCompatImageView;
        android.graphics.drawable.Drawable drawable;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.c;
        ea1.bar barVar = detailsViewActivityLegacy.C0;
        if (barVar != null) {
            android.graphics.drawable.Drawable navigationIcon = barVar.E.getNavigationIcon();
            if (navigationIcon != null) {
                ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                if (barVar2 != null) {
                    androidx.appcompat.widget.Toolbar toolbar = barVar2.E;
                    android.graphics.drawable.Drawable mutate = navigationIcon.mutate();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate, "mutate(...)");
                    mutate.setTint(i);
                    toolbar.setNavigationIcon(mutate);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("binding");
                    throw null;
                }
            }
            ea1.bar barVar3 = detailsViewActivityLegacy.C0;
            if (barVar3 != null) {
                android.view.Menu menu = barVar3.E.getMenu();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
                u6.p pVar = new u6.p(menu);
                while (pVar.hasNext()) {
                    android.view.MenuItem menuItem = (android.view.MenuItem) pVar.next();
                    if (menuItem.getItemId() == 2131365309) {
                        android.view.View actionView = menuItem.getActionView();
                        if (actionView != null) {
                            appCompatImageView = actionView.findViewById(2131365364);
                        } else {
                            appCompatImageView = null;
                        }
                        if (appCompatImageView != null) {
                            android.graphics.drawable.Drawable drawable2 = appCompatImageView.getDrawable();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawable2, "getDrawable(...)");
                            android.graphics.drawable.Drawable mutate2 = drawable2.mutate();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mutate2, "mutate(...)");
                            mutate2.setTint(i);
                            appCompatImageView.setImageDrawable(mutate2);
                        }
                    } else {
                        android.graphics.drawable.Drawable icon = menuItem.getIcon();
                        if (icon != null) {
                            drawable = icon.mutate();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(drawable, "mutate(...)");
                            drawable.setTint(i);
                        } else {
                            drawable = null;
                        }
                        menuItem.setIcon(drawable);
                    }
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("binding");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void f(int i, int i2) {
        ea1.bar barVar = this.c.C0;
        if (barVar != null) {
            androidx.constraintlayout.motion.widget.MotionLayout motionLayout = barVar.p;
            if (motionLayout.getProgress() > 0.5f || motionLayout.getCurrentState() == 2131363068) {
                i = i2;
            }
            e(i);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("binding");
        throw null;
    }

    public final void g(com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance statusBarAppearance$Appearance) {
        int i = com.truecaller.details_view.ui.p0.a[statusBarAppearance$Appearance.ordinal()];
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.c;
        if (i != 1) {
            if (i == 2) {
                q6.baz bazVar = detailsViewActivityLegacy.D0;
                if (bazVar != null) {
                    bazVar.v(true);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("windowInsetsControllerCompat");
                    throw null;
                }
            }
            throw new java.lang.RuntimeException();
        }
        q6.baz bazVar2 = detailsViewActivityLegacy.D0;
        if (bazVar2 != null) {
            bazVar2.v(false);
        } else {
            kotlin.jvm.internal.Intrinsics.n("windowInsetsControllerCompat");
            throw null;
        }
    }
}
