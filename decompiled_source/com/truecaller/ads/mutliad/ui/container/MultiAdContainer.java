package com.truecaller.ads.mutliad.ui.container;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class MultiAdContainer extends o80.bar implements p80.qux, bd3.qux {
    public static final /* synthetic */ int i = 0;
    public yc3.d a;
    public boolean b;
    public final p80.bar c;
    public final o83.b d;
    public final kotlin.Lazy e;
    public p80.baz f;
    public int g;
    public final com.truecaller.cloudtelephony.callrecording.ui.details.b h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiAdContainer(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getItemCount() {
        androidx.recyclerview.widget.h1 adapter = getViewPager().getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 1;
    }

    private final androidx.viewpager2.widget.ViewPager2 getViewPager() {
        java.lang.Object value = this.e.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (androidx.viewpager2.widget.ViewPager2) value;
    }

    public static void m(com.truecaller.ads.mutliad.ui.container.MultiAdContainer multiAdContainer, int i2, y90.m6 m6Var) {
        kotlin.Unit o;
        androidx.recyclerview.widget.h1 adapter;
        try {
            kotlin.o oVar = kotlin.q.b;
            if (multiAdContainer.isAttachedToWindow() && (adapter = multiAdContainer.getViewPager().getAdapter()) != null) {
                adapter.notifyItemChanged(i2, m6Var);
            }
            o = kotlin.Unit.a;
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        java.lang.Throwable a = kotlin.q.a(o);
        if (a != null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
        }
    }

    public static void n(com.truecaller.ads.mutliad.ui.container.MultiAdContainer multiAdContainer) {
        kotlin.Unit o;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int currentItem = (multiAdContainer.getViewPager().getCurrentItem() + 1) % multiAdContainer.getItemCount();
        try {
            kotlin.o oVar = kotlin.q.b;
            androidx.viewpager2.widget.ViewPager2 viewPager = multiAdContainer.getViewPager();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPager, "<this>");
            androidx.recyclerview.widget.RecyclerView childAt = viewPager.getChildAt(0);
            if (childAt instanceof androidx.recyclerview.widget.RecyclerView) {
                recyclerView = childAt;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                cr.g gVar = new cr.g(recyclerView.getContext(), 1);
                ((androidx.recyclerview.widget.v0) gVar).a = currentItem;
                androidx.recyclerview.widget.t1 layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.O0(gVar);
                }
            }
            o = kotlin.Unit.a;
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        java.lang.Throwable a = kotlin.q.a(o);
        if (a != null) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(a);
        }
        multiAdContainer.t();
    }

    public static final void o(com.truecaller.ads.mutliad.ui.container.MultiAdContainer multiAdContainer, p80.f fVar) {
        multiAdContainer.getClass();
        o83.b bVar = multiAdContainer.d;
        p80.bar barVar = multiAdContainer.c;
        if (kotlin.jvm.internal.Intrinsics.b(fVar, p80.d.a)) {
            if (multiAdContainer.getViewPager().getCurrentItem() < multiAdContainer.getItemCount() - 1) {
                barVar.b = false;
                android.os.Handler handler = multiAdContainer.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(bVar);
                }
                multiAdContainer.getViewPager().e(multiAdContainer.getViewPager().getCurrentItem() + 1, true);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.b(fVar, p80.e.a)) {
            if (multiAdContainer.getViewPager().getCurrentItem() <= 0) {
                return;
            }
            barVar.b = false;
            android.os.Handler handler2 = multiAdContainer.getHandler();
            if (handler2 != null) {
                handler2.removeCallbacks(bVar);
            }
            multiAdContainer.getViewPager().e(multiAdContainer.getViewPager().getCurrentItem() - 1, true);
            return;
        }
        throw new java.lang.RuntimeException();
    }

    public final java.lang.Object X3() {
        if (this.a == null) {
            this.a = new yc3.d(this);
        }
        return this.a.X3();
    }

    public void b(boolean z) {
    }

    public void d(h10.b bVar, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
    }

    public void e(int i2) {
    }

    @Override // o80.bar
    public final void g() {
        p80.baz bazVar = this.f;
        if (bazVar != null) {
            bazVar.onPause();
            android.os.Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.d);
            }
        }
    }

    public final int getAdItemCount() {
        androidx.recyclerview.widget.h1 adapter = getViewPager().getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    @Override // o80.bar
    public final void h() {
        p80.baz bazVar = this.f;
        if (bazVar != null) {
            bazVar.w1();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    @Override // o80.bar
    public final void i() {
        p80.baz bazVar = this.f;
        if (bazVar == null) {
            return;
        }
        bazVar.onResume();
        t();
    }

    @Override // o80.bar
    public void j(com.truecaller.data.entity.Contact contact, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        p80.baz bazVar = this.f;
        if (bazVar == null) {
            return;
        }
        bazVar.b0(contact, z);
    }

    @Override // o80.bar
    public final void l(boolean z) {
        p80.baz bazVar = this.f;
        if (bazVar == null) {
            return;
        }
        bazVar.R0(z);
    }

    public final void p() {
        p80.bar barVar = this.c;
        if (!barVar.b && barVar.a && getItemCount() > 1) {
            p80.baz bazVar = this.f;
            if (bazVar != null) {
                if (bazVar.f()) {
                    barVar.b = true;
                    t();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    public void q() {
        if (!this.b) {
            this.b = true;
            ((p80.b) X3()).getClass();
        }
    }

    public final void r() {
        this.g = -1;
        getViewPager().setPaddingRelative(0, 0, 0, 0);
        getViewPager().e(0, false);
    }

    public final void s(int i2, u90.a aVar, o00.baz bazVar) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "layout");
        bx.q0 q0Var = new bx.q0(this, i2, new q80.bar(bazVar, aVar), 11);
        if (i2 == 0) {
            j = 100;
        } else {
            j = 150;
        }
        postDelayed(q0Var, j);
        p();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [bf.i, ed.f, java.lang.Object] */
    @Override // p80.qux
    public <VH extends androidx.recyclerview.widget.k2> void setupAdapter(@org.jetbrains.annotations.NotNull q80.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "adapter");
        if (getViewPager().getAdapter() == null) {
            getViewPager().setAdapter(bazVar);
            getViewPager().setClipToPadding(false);
            getViewPager().setClipChildren(false);
            getViewPager().getChildAt(0).setOverScrollMode(2);
            if (getItemCount() <= 1) {
                return;
            }
            getViewPager().setOffscreenPageLimit(4);
            androidx.viewpager2.widget.ViewPager2 viewPager = getViewPager();
            android.content.Context context = getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int s = ak.r0.s(context, 8);
            ?? obj = new java.lang.Object();
            if (s >= 0) {
                ((bf.i) obj).a = s;
                viewPager.setPageTransformer((ed.f) obj);
                getViewPager().c(this.h);
                androidx.viewpager2.widget.ViewPager2 viewPager2 = getViewPager();
                android.content.Context context2 = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                viewPager2.setOnTouchListener(new p80.a(context2, new np0.f(1, this, com.truecaller.ads.mutliad.ui.container.MultiAdContainer.class, "onTouchScroll", "onTouchScroll(Lcom/truecaller/ads/mutliad/ui/container/ScrollDirection;)V", 0, 9)));
                if (bazVar instanceof f80.bar) {
                    return;
                }
                u(0.0f, 0);
                return;
            }
            throw new java.lang.IllegalArgumentException("Margin must be non-negative");
        }
    }

    public void setupPresenter(@org.jetbrains.annotations.NotNull p80.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "presenter");
        this.f = bazVar;
        if (bazVar != null) {
            bazVar.u0(this);
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    public final void t() {
        p80.bar barVar = this.c;
        if (barVar.b) {
            android.os.Handler handler = getHandler();
            o83.b bVar = this.d;
            if (handler != null) {
                handler.removeCallbacks(bVar);
            }
            android.os.Handler handler2 = getHandler();
            if (handler2 != null) {
                handler2.postDelayed(bVar, barVar.c);
            }
        }
    }

    public final void u(float f, int i2) {
        if (getItemCount() <= 1) {
            return;
        }
        int itemCount = getItemCount();
        int i3 = itemCount - 1;
        float f2 = getResources().getDisplayMetrics().widthPixels;
        int i4 = (int) ((f2 - (0.8f * f2)) / 2);
        if (i2 == itemCount - 2) {
            int i5 = (int) (i4 * f);
            getViewPager().setPaddingRelative(i5, 0, i4 - i5, 0);
        } else if (i2 == i3) {
            getViewPager().setPaddingRelative(i4, 0, 0, 0);
        } else {
            getViewPager().setPaddingRelative(0, 0, i4, 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v2, types: [p80.bar, java.lang.Object] */
    public MultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode()) {
            q();
        }
        ?? obj = new java.lang.Object();
        obj.a = false;
        obj.b = false;
        obj.c = 5000L;
        this.c = obj;
        this.d = new o83.b(this, 12);
        this.e = kotlin.LazyKt.lazy(new o93.k(this, 19));
        this.g = -1;
        this.h = new com.truecaller.cloudtelephony.callrecording.ui.details.b(this, 3);
        li.qux.u(context, "from(...)", true).inflate(2131560201, (android.view.ViewGroup) this, true);
    }

    public /* synthetic */ MultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
