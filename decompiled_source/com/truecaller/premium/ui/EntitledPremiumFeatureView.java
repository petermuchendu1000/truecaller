package com.truecaller.premium.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EntitledPremiumFeatureView extends androidx.constraintlayout.widget.ConstraintLayout {
    public final kotlin.Lazy A;
    public final kotlin.Lazy B;
    public final kotlin.Lazy C;
    public final kotlin.Lazy D;
    public final kotlin.Lazy E;
    public final kotlin.Lazy F;
    public boolean G;
    public android.graphics.drawable.Drawable H;
    public final android.graphics.drawable.Drawable s;
    public final android.graphics.drawable.ColorDrawable t;
    public final android.graphics.drawable.Drawable u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public final kotlin.Lazy y;
    public final kotlin.Lazy z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitledPremiumFeatureView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final android.widget.ImageView getAlertIcon() {
        return (android.widget.ImageView) this.A.getValue();
    }

    private final android.widget.ImageView getChevronIcon() {
        return (android.widget.ImageView) this.C.getValue();
    }

    private final android.widget.TextView getDescription() {
        return (android.widget.TextView) this.B.getValue();
    }

    private final android.view.View getDivider() {
        return (android.view.View) this.F.getValue();
    }

    private final android.widget.ImageView getIcon() {
        return (android.widget.ImageView) this.x.getValue();
    }

    private final android.widget.ImageView getLockIcon() {
        return (android.widget.ImageView) this.z.getValue();
    }

    private final android.widget.ImageView getNewBadge() {
        return (android.widget.ImageView) this.D.getValue();
    }

    private final android.widget.TextView getNotificationCount() {
        return (android.widget.TextView) this.y.getValue();
    }

    private final android.widget.TextView getRequiredPlan() {
        return (android.widget.TextView) this.E.getValue();
    }

    private final android.view.View getRootLayout() {
        return (android.view.View) this.v.getValue();
    }

    private final android.widget.TextView getTitle() {
        return (android.widget.TextView) this.w.getValue();
    }

    private final void setAlert(boolean z) {
        android.widget.ImageView alertIcon = getAlertIcon();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(alertIcon, "<get-alertIcon>(...)");
        gj.m.k0(alertIcon, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setBackgroundOutline(boolean z) {
        getRootLayout().setOutlineProvider(new be2.b(z, getResources().getDimensionPixelSize(2131166787)));
        getRootLayout().setClipToOutline(true);
    }

    private final void setChevron(boolean z) {
        android.widget.ImageView chevronIcon = getChevronIcon();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chevronIcon, "<get-chevronIcon>(...)");
        gj.m.i0(chevronIcon, z);
    }

    private final void setDescription(java.lang.String str) {
        boolean z;
        android.widget.TextView description = getDescription();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(description, "<get-description>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(description, true ^ z);
        getDescription().setText(str);
    }

    private final void setDivider(boolean z) {
        android.view.View divider = getDivider();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(divider, "<get-divider>(...)");
        gj.m.i0(divider, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHighlighted$lambda$0(com.truecaller.premium.ui.EntitledPremiumFeatureView entitledPremiumFeatureView) {
        if (!entitledPremiumFeatureView.G) {
            entitledPremiumFeatureView.getRootLayout().setBackground(new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{entitledPremiumFeatureView.H, entitledPremiumFeatureView.s}));
        }
        entitledPremiumFeatureView.getRootLayout().setPressed(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHighlighted$lambda$1(com.truecaller.premium.ui.EntitledPremiumFeatureView entitledPremiumFeatureView) {
        entitledPremiumFeatureView.getRootLayout().setPressed(false);
        if (!entitledPremiumFeatureView.G) {
            entitledPremiumFeatureView.getRootLayout().setBackground(entitledPremiumFeatureView.H);
        }
    }

    private final void setIcon(java.lang.Integer num) {
        boolean z;
        android.widget.ImageView icon = getIcon();
        if (num != null) {
            icon.setImageResource(num.intValue());
        }
        kotlin.jvm.internal.Intrinsics.d(icon);
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(icon, z);
    }

    private final void setIsTappable(boolean z) {
        this.G = z;
    }

    private final void setLockedIcon(boolean z) {
        android.widget.ImageView lockIcon = getLockIcon();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lockIcon, "<get-lockIcon>(...)");
        gj.m.k0(lockIcon, z);
        if (z) {
            android.widget.ImageView chevronIcon = getChevronIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(chevronIcon, "<get-chevronIcon>(...)");
            gj.m.f0(chevronIcon);
            android.widget.ImageView alertIcon = getAlertIcon();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(alertIcon, "<get-alertIcon>(...)");
            gj.m.f0(alertIcon);
        }
    }

    private final void setNewBadge(boolean z) {
        android.widget.ImageView newBadge = getNewBadge();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBadge, "<get-newBadge>(...)");
        gj.m.k0(newBadge, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setNotificationCount(int i) {
        boolean z;
        java.lang.String string;
        android.widget.TextView notificationCount = getNotificationCount();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(notificationCount, "<get-notificationCount>(...)");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        gj.m.k0(notificationCount, z);
        android.widget.TextView notificationCount2 = getNotificationCount();
        if (i < 100) {
            string = java.lang.String.valueOf(i);
        } else {
            string = getContext().getString(2132023645);
            kotlin.jvm.internal.Intrinsics.d(string);
        }
        notificationCount2.setText(string);
    }

    private final void setRequiredPlan(java.lang.String str) {
        boolean z;
        android.widget.TextView requiredPlan = getRequiredPlan();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requiredPlan, "<get-requiredPlan>(...)");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(requiredPlan, true ^ z);
        getRequiredPlan().setText(str);
    }

    private final void setTitle(java.lang.String str) {
        boolean z;
        android.widget.TextView title = getTitle();
        title.setText(str);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        gj.m.k0(title, !z);
    }

    public final void setHighlighted(boolean z) {
        if (!z) {
            return;
        }
        final int i = 0;
        getRootLayout().postDelayed(new java.lang.Runnable(this) { // from class: be2.a
            public final /* synthetic */ com.truecaller.premium.ui.EntitledPremiumFeatureView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        com.truecaller.premium.ui.EntitledPremiumFeatureView.setHighlighted$lambda$0(this.b);
                        return;
                    default:
                        com.truecaller.premium.ui.EntitledPremiumFeatureView.setHighlighted$lambda$1(this.b);
                        return;
                }
            }
        }, 200L);
        final int i2 = 1;
        getRootLayout().postDelayed(new java.lang.Runnable(this) { // from class: be2.a
            public final /* synthetic */ com.truecaller.premium.ui.EntitledPremiumFeatureView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        com.truecaller.premium.ui.EntitledPremiumFeatureView.setHighlighted$lambda$0(this.b);
                        return;
                    default:
                        com.truecaller.premium.ui.EntitledPremiumFeatureView.setHighlighted$lambda$1(this.b);
                        return;
                }
            }
        }, 700L);
    }

    public final void setSpec(@org.jetbrains.annotations.NotNull be2.d dVar) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dVar, "entitledPremiumFeatureViewSpec");
        setTitle(dVar.a);
        setDescription(dVar.c);
        setIcon(dVar.b);
        boolean z = dVar.f;
        setChevron(z);
        setIsTappable(z);
        boolean z2 = dVar.m;
        if (!z2) {
            drawable = this.u;
        } else {
            drawable = this.t;
        }
        this.H = drawable;
        android.view.View rootLayout = getRootLayout();
        if (z) {
            drawable2 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{this.H, this.s});
        } else {
            drawable2 = this.H;
        }
        rootLayout.setBackground(drawable2);
        setBackgroundOutline(z2);
        setAlert(dVar.g);
        setLockedIcon(dVar.h);
        setNotificationCount(dVar.i);
        setRequiredPlan(dVar.j);
        setNewBadge(dVar.k);
        setDivider(z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EntitledPremiumFeatureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EntitledPremiumFeatureView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.s = bi3.a.u(2130970235, context);
        this.t = new android.graphics.drawable.ColorDrawable(bi3.a.s(context, 2130970615));
        this.u = yb0.i.w(2131231317, context);
        this.v = gj.m.I(2131366180, this);
        this.w = gj.m.I(2131367033, this);
        this.x = gj.m.I(2131363839, this);
        this.y = gj.m.I(2131365510, this);
        this.z = gj.m.I(2131365021, this);
        this.A = gj.m.I(2131362216, this);
        this.B = gj.m.I(2131363468, this);
        this.C = gj.m.I(2131362898, this);
        this.D = gj.m.I(2131365479, this);
        this.E = gj.m.I(2131366135, this);
        this.F = gj.m.I(2131363542, this);
        yy.qux.z(this, 2131560276, true);
    }

    public /* synthetic */ EntitledPremiumFeatureView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
