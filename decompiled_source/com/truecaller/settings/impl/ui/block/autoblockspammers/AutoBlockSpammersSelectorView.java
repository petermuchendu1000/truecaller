package com.truecaller.settings.impl.ui.block.autoblockspammers;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AutoBlockSpammersSelectorView extends androidx.constraintlayout.widget.ConstraintLayout implements bd3.qux {
    public static final /* synthetic */ int y = 0;
    public yc3.d s;
    public final boolean t;
    public u03.b0 u;
    public final d91.n0 v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoBlockSpammersSelectorView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getTextPrimaryColor() {
        return ((java.lang.Number) this.x.getValue()).intValue();
    }

    private final int getWhiteColor() {
        return ((java.lang.Number) this.w.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(com.google.android.material.button.MaterialButton materialButton, boolean z) {
        d6.j jVar = new d6.j();
        jVar.e(this);
        d91.n0 n0Var = this.v;
        jVar.g(n0Var.b.getId(), 6, materialButton.getId(), 6);
        jVar.g(n0Var.b.getId(), 7, materialButton.getId(), 7);
        zc.n nVar = new zc.n();
        if (z) {
            nVar.c = 100L;
        }
        zc.r.a(this, nVar);
        jVar.b(this);
        materialButton.setTextColor(getTextPrimaryColor());
    }

    public final void G(boolean z) {
        d91.n0 n0Var = this.v;
        ((com.google.android.material.button.MaterialButton) n0Var.f).setTextColor(getWhiteColor());
        ((com.google.android.material.button.MaterialButton) n0Var.e).setTextColor(getWhiteColor());
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) n0Var.d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialButton, "btnBasic");
        F(materialButton, z);
    }

    public final void H(boolean z) {
        d91.n0 n0Var = this.v;
        ((com.google.android.material.button.MaterialButton) n0Var.f).setTextColor(getWhiteColor());
        n0Var.d.setTextColor(getWhiteColor());
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) n0Var.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialButton, "btnMax");
        F(materialButton, z);
    }

    public final void I(boolean z) {
        d91.n0 n0Var = this.v;
        n0Var.d.setTextColor(getWhiteColor());
        ((com.google.android.material.button.MaterialButton) n0Var.e).setTextColor(getWhiteColor());
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) n0Var.f;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(materialButton, "btnOff");
        F(materialButton, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bd3.baz
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d((android.view.View) this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final u03.b0 getResourceProvider() {
        u03.b0 b0Var = this.u;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.Intrinsics.n("resourceProvider");
        throw null;
    }

    public final void setResourceProvider(@org.jetbrains.annotations.NotNull u03.b0 b0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "<set-?>");
        this.u = b0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AutoBlockSpammersSelectorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AutoBlockSpammersSelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoBlockSpammersSelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 1;
        if (!isInEditMode() && !this.t) {
            this.t = true;
            this.u = (u03.b0) ((gr2.qux) X3()).c.v4.get();
        }
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        yy.qux.F(from, true).inflate(2131559890, (android.view.ViewGroup) this);
        int i3 = 2131362464;
        android.view.View o = df0.qux.o(2131362464, this);
        if (o != null) {
            i3 = 2131362604;
            com.google.android.material.button.MaterialButton o2 = df0.qux.o(2131362604, this);
            if (o2 != null) {
                i3 = 2131362618;
                com.google.android.material.button.MaterialButton o3 = df0.qux.o(2131362618, this);
                if (o3 != null) {
                    i3 = 2131362619;
                    com.google.android.material.button.MaterialButton o4 = df0.qux.o(2131362619, this);
                    if (o4 != null) {
                        d91.n0 n0Var = new d91.n0(this, o, o2, o3, o4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(n0Var, "inflate(...)");
                        this.v = n0Var;
                        final int i4 = 0;
                        this.w = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: gr2.baz
                            public final /* synthetic */ com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView b;

                            {
                                this.b = this;
                            }

                            public final java.lang.Object invoke() {
                                int b;
                                int i5 = i4;
                                com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView autoBlockSpammersSelectorView = this.b;
                                switch (i5) {
                                    case 0:
                                        int i6 = com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView.y;
                                        b = ((u03.g0) autoBlockSpammersSelectorView.getResourceProvider()).b(android.R.color.white);
                                        break;
                                    default:
                                        int i7 = com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView.y;
                                        b = ((u03.g0) autoBlockSpammersSelectorView.getResourceProvider()).b(2131101948);
                                        break;
                                }
                                return java.lang.Integer.valueOf(b);
                            }
                        });
                        this.x = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: gr2.baz
                            public final /* synthetic */ com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView b;

                            {
                                this.b = this;
                            }

                            public final java.lang.Object invoke() {
                                int b;
                                int i5 = i2;
                                com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView autoBlockSpammersSelectorView = this.b;
                                switch (i5) {
                                    case 0:
                                        int i6 = com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView.y;
                                        b = ((u03.g0) autoBlockSpammersSelectorView.getResourceProvider()).b(android.R.color.white);
                                        break;
                                    default:
                                        int i7 = com.truecaller.settings.impl.ui.block.autoblockspammers.AutoBlockSpammersSelectorView.y;
                                        b = ((u03.g0) autoBlockSpammersSelectorView.getResourceProvider()).b(2131101948);
                                        break;
                                }
                                return java.lang.Integer.valueOf(b);
                            }
                        });
                        setBackgroundResource(2131231402);
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
