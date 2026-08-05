package com.truecaller.videocallerid.ui.manageincomingvideo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ManagePreferencesView extends androidx.constraintlayout.widget.ConstraintLayout implements com.truecaller.videocallerid.ui.manageincomingvideo.c, bd3.qux {
    public static final /* synthetic */ int x = 0;
    public yc3.d s;
    public final boolean t;
    public com.truecaller.videocallerid.ui.manageincomingvideo.b u;
    public final kotlin.Lazy v;
    public final kotlin.Lazy w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManagePreferencesView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final g23.c getBinding() {
        return (g23.c) this.v.getValue();
    }

    private final int getPadding() {
        return ((java.lang.Number) this.w.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String F(int i) {
        java.lang.String string = getContext().getString(i, getContext().getString(2132023734));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final void G() {
        I(false);
        getBinding().f.setChecked(false);
        K(false);
    }

    public final void H() {
        androidx.constraintlayout.widget.Group group = getBinding().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "contactOptionGroup");
        gj.m.k0(group, false);
    }

    public final void I(boolean z) {
        getBinding().h.setChecked(z);
    }

    public final void J() {
        androidx.constraintlayout.widget.Group group = getBinding().k;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "everyoneOptionGroup");
        gj.m.k0(group, true);
    }

    public final void K(boolean z) {
        getBinding().n.setChecked(z);
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
    public final com.truecaller.videocallerid.ui.manageincomingvideo.b getPresenter$video_caller_id_googlePlayRelease() {
        com.truecaller.videocallerid.ui.manageincomingvideo.b bVar = this.u;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        getPresenter$video_caller_id_googlePlayRelease().u0(this);
        g23.c binding = getBinding();
        final int i = 0;
        binding.g.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.qux
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, true);
                        return;
                    case 1:
                        int i4 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, true);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, true);
                        return;
                }
            }
        });
        binding.h.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.a
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                int i2 = i;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, z);
                        return;
                    case 1:
                        int i4 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, z);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, z);
                        return;
                }
            }
        });
        final int i2 = 1;
        binding.e.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.qux
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, true);
                        return;
                    case 1:
                        int i4 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, true);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, true);
                        return;
                }
            }
        });
        binding.f.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.a
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                int i22 = i2;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, z);
                        return;
                    case 1:
                        int i4 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, z);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, z);
                        return;
                }
            }
        });
        final int i3 = 2;
        binding.m.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.qux
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i3;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, true);
                        return;
                    case 1:
                        int i4 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, true);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, true);
                        return;
                }
            }
        });
        final int i4 = 2;
        binding.n.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener(this) { // from class: com.truecaller.videocallerid.ui.manageincomingvideo.a
            public final /* synthetic */ com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView b;

            {
                this.b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                int i22 = i4;
                com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView managePreferencesView = this.b;
                switch (i22) {
                    case 0:
                        int i32 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Everyone, z);
                        return;
                    case 1:
                        int i42 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.Contacts, z);
                        return;
                    default:
                        int i5 = com.truecaller.videocallerid.ui.manageincomingvideo.ManagePreferencesView.x;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        managePreferencesView.getPresenter$video_caller_id_googlePlayRelease().c2(com.truecaller.videocallerid.utils.ReceiveVideoPreferences.NoOne, z);
                        return;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
        ((com.truecaller.sdk.bar) getPresenter$video_caller_id_googlePlayRelease()).m1();
    }

    public final void setPresenter$video_caller_id_googlePlayRelease(@org.jetbrains.annotations.NotNull com.truecaller.videocallerid.ui.manageincomingvideo.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.u = bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ManagePreferencesView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ManagePreferencesView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ManagePreferencesView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            tx.w wVar = ((com.truecaller.videocallerid.ui.manageincomingvideo.d) X3()).c;
            this.u = new ac0.qux((r23.m) wVar.kk.get(), (r23.n) wVar.jk.get());
        }
        kotlin.k kVar = kotlin.k.c;
        this.v = kotlin.LazyKt.lazy(kVar, new by2.a(24, context, this));
        this.w = kotlin.LazyKt.lazy(kVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 25));
        setPaddingRelative(getPadding(), getPadding(), 0, getPadding());
        g23.c binding = getBinding();
        binding.i.setText(F(2132023733));
        binding.l.setText(F(2132023730));
        binding.b.setText(F(2132023727));
    }
}
