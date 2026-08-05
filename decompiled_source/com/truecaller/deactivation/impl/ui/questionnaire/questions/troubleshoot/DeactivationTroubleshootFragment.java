package com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/questions/troubleshoot/DeactivationTroubleshootFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationTroubleshootFragment extends r91.f {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentQuestionTroubleshootBinding;", com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationTroubleshootFragment() {
        super(7);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new rq0.a(new rq0.a(this, 20), 21));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(t91.f.class), new qs2.d(lazy, 25), new sz1.b(5, this, lazy), new qs2.d(lazy, 26));
    }

    public final h91.g Z5() {
        return (h91.g) this.j.a(this, l[0]);
    }

    public final t91.f a6() {
        return (t91.f) this.k.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        Z5().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: t91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i2 = i;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment deactivationTroubleshootFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a6 = deactivationTroubleshootFragment.a6();
                        a6.c.e("ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a6, null, 3), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a63 = deactivationTroubleshootFragment.a6();
                        f63.qux.y(a63.c, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a63, null, 4), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a64 = deactivationTroubleshootFragment.a6();
                        a64.c.f(l91.d.b, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a64, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a65 = deactivationTroubleshootFragment.a6();
                        g91.baz bazVar = a65.c;
                        if (((qo1.s) a65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a65, null, 2), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z5().e.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: t91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment deactivationTroubleshootFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a6 = deactivationTroubleshootFragment.a6();
                        a6.c.e("ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a6, null, 3), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a63 = deactivationTroubleshootFragment.a6();
                        f63.qux.y(a63.c, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a63, null, 4), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a64 = deactivationTroubleshootFragment.a6();
                        a64.c.f(l91.d.b, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a64, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a65 = deactivationTroubleshootFragment.a6();
                        g91.baz bazVar = a65.c;
                        if (((qo1.s) a65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a65, null, 2), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: t91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i3;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment deactivationTroubleshootFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a6 = deactivationTroubleshootFragment.a6();
                        a6.c.e("ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a6, null, 3), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a63 = deactivationTroubleshootFragment.a6();
                        f63.qux.y(a63.c, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a63, null, 4), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a64 = deactivationTroubleshootFragment.a6();
                        a64.c.f(l91.d.b, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a64, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a65 = deactivationTroubleshootFragment.a6();
                        g91.baz bazVar = a65.c;
                        if (((qo1.s) a65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a65, null, 2), 3);
                        return;
                }
            }
        });
        final int i4 = 3;
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: t91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i4;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment deactivationTroubleshootFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a6 = deactivationTroubleshootFragment.a6();
                        a6.c.e("ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a6, null, 3), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a63 = deactivationTroubleshootFragment.a6();
                        f63.qux.y(a63.c, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a63, null, 4), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a64 = deactivationTroubleshootFragment.a6();
                        a64.c.f(l91.d.b, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a64, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.troubleshoot.DeactivationTroubleshootFragment.l;
                        t91.f a65 = deactivationTroubleshootFragment.a6();
                        g91.baz bazVar = a65.c;
                        if (((qo1.s) a65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveTCTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.e(a65, null, 2), 3);
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.qux(this, null, 1), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new t91.qux(this, null, 3), 3);
    }
}
