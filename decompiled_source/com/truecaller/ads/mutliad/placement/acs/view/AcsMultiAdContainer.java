package com.truecaller.ads.mutliad.placement.acs.view;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AcsMultiAdContainer extends com.truecaller.ads.mutliad.ui.container.MultiAdContainer {
    public boolean j;
    public qc3.bar k;
    public p80.c l;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcsMultiAdContainer(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @javax.inject.Named("acsMultiAdContainerPresenter")
    public static /* synthetic */ void getAcsMultiAdContainerPresenter$annotations() {
    }

    @Override // com.truecaller.ads.mutliad.ui.container.MultiAdContainer, p80.qux
    public final void b(boolean z) {
        p80.c o;
        if (this.l == null) {
            try {
                kotlin.o oVar = kotlin.q.b;
                p80.c v = mk.m.v(this);
                if (v instanceof p80.c) {
                    o = v;
                } else {
                    o = null;
                }
            } catch (java.lang.Throwable th) {
                kotlin.o oVar2 = kotlin.q.b;
                o = od.p.o(th);
            }
            if (o instanceof kotlin.p) {
                o = null;
            }
            this.l = o;
        }
        q52.o oVar3 = this.l;
        if (oVar3 != null) {
            o52.f0 f0Var = oVar3.j;
            if (f0Var != null) {
                f0Var.Q3(z);
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
    }

    @Override // com.truecaller.ads.mutliad.ui.container.MultiAdContainer, p80.qux
    public final void d(h10.b bVar, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
        q52.o oVar = this.l;
        if (oVar != null) {
            q52.o oVar2 = oVar;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "ad");
            if (bf0.s2.Q(bVar)) {
                oVar2.H0(bVar, com.truecaller.ads.AdLayoutTypeX.ACS_2, function0);
            } else {
                oVar2.k0(bVar, com.truecaller.ads.AdLayoutTypeX.ACS_2, function0);
            }
        }
    }

    @Override // com.truecaller.ads.mutliad.ui.container.MultiAdContainer, p80.qux
    public final void e(int i) {
        q52.o oVar = this.l;
        if (oVar != null) {
            oVar.g2(i, true);
        }
    }

    @org.jetbrains.annotations.NotNull
    public final qc3.bar getAcsMultiAdContainerPresenter() {
        qc3.bar barVar = this.k;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("acsMultiAdContainerPresenter");
        throw null;
    }

    @Override // com.truecaller.ads.mutliad.ui.container.MultiAdContainer, o80.bar
    public final void j(com.truecaller.data.entity.Contact contact, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
        super.j(contact, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = null;
    }

    @Override // com.truecaller.ads.mutliad.ui.container.MultiAdContainer
    public final void q() {
        if (!this.j) {
            this.j = true;
            this.k = cd3.baz.a(((tx.d0) ((f80.baz) X3())).e.W1);
        }
    }

    public final void setAcsMultiAdContainerPresenter(@org.jetbrains.annotations.NotNull qc3.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.k = barVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AcsMultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcsMultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!isInEditMode()) {
            q();
        }
        setTag("ACS_MULTI_AD_CONTAINER");
    }

    public /* synthetic */ AcsMultiAdContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
