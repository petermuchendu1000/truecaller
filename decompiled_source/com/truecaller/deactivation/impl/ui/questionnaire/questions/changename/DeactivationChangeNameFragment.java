package com.truecaller.deactivation.impl.ui.questionnaire.questions.changename;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/questions/changename/DeactivationChangeNameFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationChangeNameFragment extends kc0.t {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentQuestionChangeNameBinding;", com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationChangeNameFragment() {
        super(15);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new k91.d(this, 28), 29));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(o91.e.class), new nb2.c(lazy, 8), new nu2.a(4, this, lazy), new nb2.c(lazy, 9));
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        kotlin.reflect.KProperty[] kPropertyArr = l;
        kotlin.reflect.KProperty kProperty = kPropertyArr[0];
        j13.bar barVar = this.j;
        final int i = 0;
        ((h91.c) barVar.a(this, kProperty)).c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: o91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment deactivationChangeNameFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar.b.e("hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar, null, 1), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar2 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        f63.qux.y(eVar2.b, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar2, null, 2), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar3 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar3.b.f(l91.d.c, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar3, null, 0), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        ((h91.c) barVar.a(this, kPropertyArr[0])).d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: o91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment deactivationChangeNameFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar.b.e("hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar, null, 1), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar2 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        f63.qux.y(eVar2.b, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar2, null, 2), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar3 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar3.b.f(l91.d.c, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar3, null, 0), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        ((h91.c) barVar.a(this, kPropertyArr[0])).b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: o91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i3;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment deactivationChangeNameFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar.b.e("hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar, null, 1), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar2 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        f63.qux.y(eVar2.b, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar2, null, 2), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.changename.DeactivationChangeNameFragment.l;
                        o91.e eVar3 = (o91.e) deactivationChangeNameFragment.k.getValue();
                        eVar3.b.f(l91.d.c, "hideNameTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(eVar3), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.d(eVar3, null, 0), 3);
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o91.qux(this, null, 1), 3);
    }
}
