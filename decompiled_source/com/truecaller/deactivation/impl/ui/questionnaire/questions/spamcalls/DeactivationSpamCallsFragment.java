package com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/questions/spamcalls/DeactivationSpamCallsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationSpamCallsFragment extends r91.f {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentQuestionSpamCallsBinding;", com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationSpamCallsFragment() {
        super(0);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.b(new ob2.b(this, 25), 26));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(r91.e.class), new qs2.d(lazy, 3), new nu2.a(19, this, lazy), new qs2.d(lazy, 4));
    }

    public final h91.f Z5() {
        return (h91.f) this.j.a(this, l[0]);
    }

    public final j01.qux a6() {
        j01.qux quxVar = this.i;
        if (quxVar != null) {
            return quxVar;
        }
        kotlin.jvm.internal.Intrinsics.n("deactivationNavigator");
        throw null;
    }

    public final r91.e b6() {
        return (r91.e) this.k.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        Z5().e.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: r91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i2 = i;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment deactivationSpamCallsFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b6 = deactivationSpamCallsFragment.b6();
                        b6.c.e("ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b6, null, 4), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b63 = deactivationSpamCallsFragment.b6();
                        f63.qux.y(b63.c, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b63, null, 5), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b64 = deactivationSpamCallsFragment.b6();
                        b64.c.f(l91.d.b, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b64, null, 2), 3);
                        return;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b65 = deactivationSpamCallsFragment.b6();
                        g91.baz bazVar = b65.c;
                        if (((qo1.s) b65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b65, null, 3), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b66 = deactivationSpamCallsFragment.b6();
                        b66.c.f(l91.d.a, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b66), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b66, null, 1), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z5().f.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: r91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment deactivationSpamCallsFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b6 = deactivationSpamCallsFragment.b6();
                        b6.c.e("ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b6, null, 4), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b63 = deactivationSpamCallsFragment.b6();
                        f63.qux.y(b63.c, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b63, null, 5), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b64 = deactivationSpamCallsFragment.b6();
                        b64.c.f(l91.d.b, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b64, null, 2), 3);
                        return;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b65 = deactivationSpamCallsFragment.b6();
                        g91.baz bazVar = b65.c;
                        if (((qo1.s) b65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b65, null, 3), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b66 = deactivationSpamCallsFragment.b6();
                        b66.c.f(l91.d.a, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b66), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b66, null, 1), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: r91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i3;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment deactivationSpamCallsFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b6 = deactivationSpamCallsFragment.b6();
                        b6.c.e("ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b6, null, 4), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b63 = deactivationSpamCallsFragment.b6();
                        f63.qux.y(b63.c, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b63, null, 5), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b64 = deactivationSpamCallsFragment.b6();
                        b64.c.f(l91.d.b, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b64, null, 2), 3);
                        return;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b65 = deactivationSpamCallsFragment.b6();
                        g91.baz bazVar = b65.c;
                        if (((qo1.s) b65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b65, null, 3), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b66 = deactivationSpamCallsFragment.b6();
                        b66.c.f(l91.d.a, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b66), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b66, null, 1), 3);
                        return;
                }
            }
        });
        final int i4 = 3;
        Z5().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: r91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i4;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment deactivationSpamCallsFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b6 = deactivationSpamCallsFragment.b6();
                        b6.c.e("ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b6, null, 4), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b63 = deactivationSpamCallsFragment.b6();
                        f63.qux.y(b63.c, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b63, null, 5), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b64 = deactivationSpamCallsFragment.b6();
                        b64.c.f(l91.d.b, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b64, null, 2), 3);
                        return;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b65 = deactivationSpamCallsFragment.b6();
                        g91.baz bazVar = b65.c;
                        if (((qo1.s) b65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b65, null, 3), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b66 = deactivationSpamCallsFragment.b6();
                        b66.c.f(l91.d.a, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b66), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b66, null, 1), 3);
                        return;
                }
            }
        });
        final int i5 = 4;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: r91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                l91.d dVar;
                int i22 = i5;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment deactivationSpamCallsFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b6 = deactivationSpamCallsFragment.b6();
                        b6.c.e("ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b6, null, 4), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b63 = deactivationSpamCallsFragment.b6();
                        f63.qux.y(b63.c, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b63, null, 5), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b64 = deactivationSpamCallsFragment.b6();
                        b64.c.f(l91.d.b, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b64, null, 2), 3);
                        return;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b65 = deactivationSpamCallsFragment.b6();
                        g91.baz bazVar = b65.c;
                        if (((qo1.s) b65.b).b.a("featureNewDeactivationLiveChat", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                            dVar = l91.d.e;
                        } else {
                            dVar = l91.d.g;
                        }
                        bazVar.f(dVar, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b65, null, 3), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.questionnaire.questions.spamcalls.DeactivationSpamCallsFragment.l;
                        r91.e b66 = deactivationSpamCallsFragment.b6();
                        b66.c.f(l91.d.a, "ineffectiveBlockingTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(b66), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.d(b66, null, 1), 3);
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.qux(this, null, 1), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new r91.qux(this, null, 3), 3);
    }
}
