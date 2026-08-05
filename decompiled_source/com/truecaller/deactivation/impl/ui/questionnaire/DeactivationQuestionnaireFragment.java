package com.truecaller.deactivation.impl.ui.questionnaire;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/DeactivationQuestionnaireFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/truecaller/ui/qux;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationQuestionnaireFragment extends kc0.t implements com.truecaller.ui.qux {
    public static final /* synthetic */ kotlin.reflect.KProperty[] n = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentDeactivationQuestionnaireBinding;", com.truecaller.deactivation.impl.ui.questionnaire.DeactivationQuestionnaireFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;
    public final kotlin.Lazy l;
    public final rb.g m;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationQuestionnaireFragment() {
        super(3);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.a;
        this.k = new androidx.lifecycle.o1(l0Var.getOrCreateKotlinClass(l91.f.class), new l91.qux(this, 0), new l91.qux(this, 2), new l91.qux(this, 1));
        this.l = kotlin.LazyKt.lazy(new jq0.baz(this, 26));
        this.m = new rb.g(l0Var.getOrCreateKotlinClass(l91.b.class), new l91.qux(this, 3));
    }

    public final l91.f a6() {
        return (l91.f) this.k.getValue();
    }

    public final void onCreate(android.os.Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onCreate(bundle);
        l91.f a6 = a6();
        java.lang.String str = ((l91.b) this.m.getValue()).a;
        a6.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
        g91.baz bazVar = a6.b;
        bazVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
        bd.bar.u(bazVar.a, "deactivateReasons", str);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        kotlin.reflect.KProperty[] kPropertyArr = n;
        kotlin.reflect.KProperty kProperty = kPropertyArr[0];
        j13.bar barVar = this.j;
        ((h91.qux) barVar.a(this, kProperty)).b.setOnClickListener(new gr2.bar(this, 29));
        ((h91.qux) barVar.a(this, kPropertyArr[0])).c.setAdapter((m91.baz) this.l.getValue());
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new l91.baz(this, null, 1), 3);
    }
}
