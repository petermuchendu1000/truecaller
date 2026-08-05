package com.truecaller.deactivation.impl.ui.confirmation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/confirmation/DeactivationConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationConfirmationFragment extends a42.bar {
    public static final /* synthetic */ kotlin.reflect.KProperty[] m = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentDeactivationConfirmationBinding;", com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;
    public final rb.g l;

    public DeactivationConfirmationFragment() {
        super(25);
        j23.b bVar = new j23.b(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "viewBinder");
        this.j = new j13.bar(bVar);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new hv2.baz(new j91.qux(this, 1), 12));
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.k = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(j91.e.class), new iq1.c(lazy, 6), new iq1.d(5, this, lazy), new iq1.c(lazy, 7));
        this.l = new rb.g(l0Var.getOrCreateKotlinClass(j91.a.class), new j91.qux(this, 0));
    }

    public final h91.bar Z5() {
        return (h91.bar) this.j.a(this, m[0]);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        j91.e eVar = (j91.e) this.k.getValue();
        com.truecaller.deactivation.impl.common.QuestionnaireReason questionnaireReason = ((j91.a) this.l.getValue()).a;
        eVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(questionnaireReason, "context");
        g91.baz bazVar = eVar.c;
        bazVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(questionnaireReason, "context");
        bd.bar.u(bazVar.a, "confirmDeactivation", g91.baz.b(questionnaireReason));
        final int i = 0;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: j91.bar
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.Object value;
                int i2 = i;
                com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment deactivationConfirmationFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment.m;
                        j91.e eVar2 = (j91.e) deactivationConfirmationFragment.k.getValue();
                        eVar2.c.e("confirmDeactivation");
                        ig3.h2 h2Var = eVar2.d;
                        do {
                            value = h2Var.getValue();
                        } while (!h2Var.n(value, j91.c.a((j91.c) value, false, false, null, 13)));
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment.m;
                        j91.e eVar3 = (j91.e) deactivationConfirmationFragment.k.getValue();
                        rb.g gVar = deactivationConfirmationFragment.l;
                        com.truecaller.deactivation.impl.ui.questionnaire.CommentType commentType = ((j91.a) gVar.getValue()).c;
                        java.lang.String str = ((j91.a) gVar.getValue()).b;
                        com.truecaller.deactivation.impl.common.QuestionnaireReason questionnaireReason2 = ((j91.a) gVar.getValue()).a;
                        eVar3.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentType, "commentType");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "comment");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(questionnaireReason2, "analyticsReason");
                        g91.baz bazVar2 = eVar3.c;
                        bazVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("confirmDeactivation", "context");
                        java.lang.String a = g91.baz.a(questionnaireReason2);
                        qx2.d3 h = qx2.hg.h();
                        h.m("confirmDeactivation");
                        h.l("continueDeactivate");
                        h.o(a);
                        qx2.hg h2 = h.h();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                        j71.g.K(h2, bazVar2.a);
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hu1.b(eVar3, commentType, str, (df3.bar) null), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: j91.bar
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                java.lang.Object value;
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment deactivationConfirmationFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment.m;
                        j91.e eVar2 = (j91.e) deactivationConfirmationFragment.k.getValue();
                        eVar2.c.e("confirmDeactivation");
                        ig3.h2 h2Var = eVar2.d;
                        do {
                            value = h2Var.getValue();
                        } while (!h2Var.n(value, j91.c.a((j91.c) value, false, false, null, 13)));
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.confirmation.DeactivationConfirmationFragment.m;
                        j91.e eVar3 = (j91.e) deactivationConfirmationFragment.k.getValue();
                        rb.g gVar = deactivationConfirmationFragment.l;
                        com.truecaller.deactivation.impl.ui.questionnaire.CommentType commentType = ((j91.a) gVar.getValue()).c;
                        java.lang.String str = ((j91.a) gVar.getValue()).b;
                        com.truecaller.deactivation.impl.common.QuestionnaireReason questionnaireReason2 = ((j91.a) gVar.getValue()).a;
                        eVar3.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(commentType, "commentType");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "comment");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(questionnaireReason2, "analyticsReason");
                        g91.baz bazVar2 = eVar3.c;
                        bazVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("confirmDeactivation", "context");
                        java.lang.String a = g91.baz.a(questionnaireReason2);
                        qx2.d3 h = qx2.hg.h();
                        h.m("confirmDeactivation");
                        h.l("continueDeactivate");
                        h.o(a);
                        qx2.hg h2 = h.h();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "build(...)");
                        j71.g.K(h2, bazVar2.a);
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hu1.b(eVar3, commentType, str, (df3.bar) null), 3);
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new j91.baz(this, null, 1), 3);
    }
}
