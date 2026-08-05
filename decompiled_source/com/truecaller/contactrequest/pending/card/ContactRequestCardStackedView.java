package com.truecaller.contactrequest.pending.card;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactRequestCardStackedView extends androidx.constraintlayout.motion.widget.MotionLayout implements q71.d, bd3.qux {
    public yc3.d A0;
    public final boolean B0;
    public q71.a C0;
    public final androidx.constraintlayout.motion.widget.MotionLayout D0;
    public final com.truecaller.contactrequest.pending.card.ContactRequestCardView E0;
    public final com.truecaller.contactrequest.pending.card.ContactRequestCardView F0;
    public final com.truecaller.contactrequest.pending.card.ContactRequestCardView G0;
    public final com.truecaller.contactrequest.pending.card.ContactRequestCardView H0;
    public q71.f I0;
    public final androidx.core.widget.NestedScrollView J0;
    public q71.b K0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactRequestCardStackedView(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.A0 == null) {
            this.A0 = new yc3.d(this);
        }
        return this.A0.X3();
    }

    @Override // q71.d
    @org.jetbrains.annotations.NotNull
    public com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState getCurrentViewState() {
        com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState contactRequestStackedMvp$View$ViewState;
        q71.c cVar = com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState.Companion;
        int currentState = this.D0.getCurrentState();
        cVar.getClass();
        com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState[] values = com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                contactRequestStackedMvp$View$ViewState = values[i];
                if (contactRequestStackedMvp$View$ViewState.getId() == currentState) {
                    break;
                }
                i++;
            } else {
                contactRequestStackedMvp$View$ViewState = null;
                break;
            }
        }
        if (contactRequestStackedMvp$View$ViewState == null) {
            return com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState.Unknown;
        }
        return contactRequestStackedMvp$View$ViewState;
    }

    @org.jetbrains.annotations.NotNull
    public final q71.a getPresenter() {
        q71.a aVar = this.C0;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @org.jetbrains.annotations.Nullable
    public q71.f getTopCardDetail() {
        return this.I0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getPresenter().a = this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        getPresenter().m1();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    @Override // q71.d
    public void setBehindCard(@org.jetbrains.annotations.Nullable q71.f fVar) {
        if (fVar != null) {
            this.E0.setContent(fVar);
        }
    }

    @Override // q71.d
    public void setBehindCardShadow(@org.jetbrains.annotations.Nullable q71.f fVar) {
        if (fVar != null) {
            this.F0.setContent(fVar);
        }
    }

    public void setLifecycleOwner(@org.jetbrains.annotations.NotNull androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "lifecycleOwner");
        this.E0.setLifecycleOwner(d0Var);
        this.G0.setLifecycleOwner(d0Var);
    }

    public void setPendingContactsList(@org.jetbrains.annotations.NotNull java.util.List<q71.f> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "pendingRequestModelList");
        dw0.h presenter = getPresenter();
        presenter.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "pendingRequestModelList");
        presenter.c = kotlin.collections.CollectionsKt.I0(list);
        presenter.h2();
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull q71.a aVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.C0 = aVar;
    }

    @Override // q71.d
    public void setTopCard(@org.jetbrains.annotations.Nullable q71.f fVar) {
        java.lang.Long g;
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource;
        this.I0 = fVar;
        if (fVar != null) {
            this.G0.setContent(fVar);
            q71.b bVar = this.K0;
            if (bVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "pendingRequestModel");
                p71.d S4 = ((p71.a) bVar).S4();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "pendingRequestModel");
                yd3.qux quxVar = S4.f;
                com.truecaller.data.entity.Contact contact = fVar.c;
                if (contact != null) {
                    if (((p81.baz) ((p81.bar) quxVar.b)).k(contact)) {
                        g = contact.x();
                    } else {
                        g = contact.g();
                    }
                    if (kotlin.jvm.internal.Intrinsics.b(g, (java.lang.Long) quxVar.c)) {
                        g = null;
                    }
                    if (g != null) {
                        long longValue = g.longValue();
                        android.content.Context context = (android.content.Context) quxVar.a;
                        boolean Q = contact.Q();
                        if (contact.Q()) {
                            profileViewSource = com.truecaller.whoviewedme.ProfileViewSource.CONTACT_REQUEST_WVM_PB;
                        } else {
                            profileViewSource = com.truecaller.whoviewedme.ProfileViewSource.CONTACT_REQUEST_WVM;
                        }
                        b91.d.w(context, longValue, Q, 999, profileViewSource, null, java.lang.Boolean.TRUE);
                        quxVar.c = g;
                        return;
                    }
                    return;
                }
                quxVar.getClass();
            }
        }
    }

    @Override // q71.d
    public void setTopCardShadow(@org.jetbrains.annotations.Nullable q71.f fVar) {
        if (fVar != null) {
            this.H0.setContent(fVar);
        }
    }

    public void setUpdateListener(@org.jetbrains.annotations.NotNull q71.b bVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "listener");
        this.K0 = bVar;
    }

    @Override // q71.d
    public void setViewState(@org.jetbrains.annotations.NotNull com.truecaller.contactrequest.pending.card.ContactRequestStackedMvp$View$ViewState contactRequestStackedMvp$View$ViewState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactRequestStackedMvp$View$ViewState, "viewState");
        this.D0.U(contactRequestStackedMvp$View$ViewState.getId());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactRequestCardStackedView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ContactRequestCardStackedView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContactRequestCardStackedView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.B0) {
            this.B0 = true;
            ((q71.baz) X3()).getClass();
            dw0.h hVar = new dw0.h(3);
            hVar.c = new java.util.ArrayList();
            this.C0 = hVar;
        }
        android.view.View.inflate(context, 2131558940, this);
        androidx.constraintlayout.motion.widget.MotionLayout findViewById = findViewById(2131365370);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        androidx.constraintlayout.motion.widget.MotionLayout motionLayout = findViewById;
        this.D0 = motionLayout;
        java.lang.Object findViewById2 = findViewById(2131362457);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.E0 = (com.truecaller.contactrequest.pending.card.ContactRequestCardView) findViewById2;
        java.lang.Object findViewById3 = findViewById(2131362458);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.F0 = (com.truecaller.contactrequest.pending.card.ContactRequestCardView) findViewById3;
        java.lang.Object findViewById4 = findViewById(2131367120);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.G0 = (com.truecaller.contactrequest.pending.card.ContactRequestCardView) findViewById4;
        java.lang.Object findViewById5 = findViewById(2131367121);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.H0 = (com.truecaller.contactrequest.pending.card.ContactRequestCardView) findViewById5;
        androidx.core.widget.NestedScrollView findViewById6 = findViewById(2131365473);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.J0 = findViewById6;
        motionLayout.setTransitionListener(new q71.bar(this));
    }
}
