package com.truecaller.details_view.ui.presence;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PresenceView extends androidx.constraintlayout.widget.ConstraintLayout implements pb1.baz, androidx.lifecycle.d, bd3.qux {
    public yc3.d s;
    public final boolean t;
    public pb1.bar u;
    public final d91.c v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresenceView(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(android.graphics.drawable.Drawable drawable, yf2.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "icon");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "presence");
        d91.c cVar = this.v;
        ((android.widget.ImageView) cVar.d).setImageDrawable(drawable);
        android.widget.TextView textView = (android.widget.TextView) cVar.c;
        android.content.Context context = getContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setText(ll.baz.u(barVar, context));
        gj.m.j0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object X3() {
        if (this.s == null) {
            this.s = new yc3.d(this);
        }
        return this.s.X3();
    }

    @org.jetbrains.annotations.NotNull
    public final pb1.bar getPresenter() {
        pb1.bar barVar = this.u;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    public final /* bridge */ void k(androidx.lifecycle.d0 d0Var) {
        bar.d(d0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.ViewGroup*/.onAttachedToWindow();
        gj.m.a0(this).getLifecycle().a(this);
        ((pb1.b) getPresenter()).u0(this);
    }

    public final void onDestroy(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        gj.m.a0(this).getLifecycle().c(this);
        ((pb1.b) getPresenter()).m1();
        super/*android.view.ViewGroup*/.onDetachedFromWindow();
    }

    public final void onPause(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public final /* bridge */ void onResume(androidx.lifecycle.d0 d0Var) {
        bar.e(d0Var);
    }

    public final void onStart(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        bar.f(d0Var);
        ((pb1.b) getPresenter()).b.f();
    }

    public final void onStop(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        ((pb1.b) getPresenter()).b.e();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public final void set(@org.jetbrains.annotations.NotNull com.truecaller.details_view.ui.d1 d1Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "detailsViewModel");
        pb1.b bVar = (pb1.b) getPresenter();
        bVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d1Var, "detailsViewModel");
        if (d1Var.b instanceof com.truecaller.details_view.ui.r) {
            androidx.lifecycle.d dVar = (pb1.baz) ((com.truecaller.sdk.bar) bVar).a;
            if (dVar != null) {
                gj.m.f0((com.truecaller.details_view.ui.presence.PresenceView) dVar);
                return;
            }
            return;
        }
        com.truecaller.data.entity.Contact contact = d1Var.a;
        mp2.bar barVar = bVar.h;
        if (barVar != null) {
            barVar.b();
        }
        mp2.baz bazVar = bVar.b;
        java.lang.String[] strArr = (java.lang.String[]) i71.g.u(contact).toArray(new java.lang.String[0]);
        mp2.bar a = bazVar.a((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
        bVar.h = a;
        if (a != null) {
            a.a(bVar);
        }
    }

    public final void setPresenter(@org.jetbrains.annotations.NotNull pb1.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.u = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresenceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresenceView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PresenceView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PresenceView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode() && !this.t) {
            this.t = true;
            tx.w wVar = ((pb1.c) X3()).e.f;
            this.u = new pb1.b((xf2.baz) wVar.E7.get(), (u03.f0) wVar.q9.get());
        }
        android.view.LayoutInflater.from(context).inflate(2131561061, (android.view.ViewGroup) this);
        int i3 = 2131362374;
        android.widget.TextView textView = (android.widget.TextView) df0.qux.o(2131362374, this);
        if (textView != null) {
            i3 = 2131364521;
            android.widget.ImageView imageView = (android.widget.ImageView) df0.qux.o(2131364521, this);
            if (imageView != null) {
                d91.c cVar = new d91.c(this, textView, imageView, 3);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cVar, "inflate(...)");
                this.v = cVar;
                return;
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i3)));
    }
}
