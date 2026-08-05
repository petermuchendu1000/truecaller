package com.truecaller.deactivation.impl.ui.questionnaire.questions.other;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/questions/other/DeactivationOtherFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationOtherFragment extends kc0.t {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentQuestionOtherBinding;", com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationOtherFragment() {
        super(25);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new ob2.b(new ob2.b(this, 15), 16));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(q91.h.class), new nb2.c(lazy, 23), new nu2.a(14, this, lazy), new nb2.c(lazy, 24));
    }

    public final h91.e a6() {
        return (h91.e) this.j.a(this, l[0]);
    }

    public final q91.h b6() {
        return (q91.h) this.k.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = a6().a;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ak.r0.i(constraintLayout, com.truecaller.common.ui.insets.InsetType.Ime);
        final int i = 0;
        a6().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment deactivationOtherFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment.l;
                        q91.h b6 = deactivationOtherFragment.b6();
                        b6.b.e("otherTroubleshoot_unusedAppReasons");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.g(b6, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment.l;
                        q91.h b63 = deactivationOtherFragment.b6();
                        f63.qux.y(b63.b, "otherTroubleshoot_unusedAppReasons");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.g(b63, null, 2), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        a6().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: q91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment deactivationOtherFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment.l;
                        q91.h b6 = deactivationOtherFragment.b6();
                        b6.b.e("otherTroubleshoot_unusedAppReasons");
                        fg3.h0.J(androidx.lifecycle.g1.l(b6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.g(b6, null, 1), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.other.DeactivationOtherFragment.l;
                        q91.h b63 = deactivationOtherFragment.b6();
                        f63.qux.y(b63.b, "otherTroubleshoot_unusedAppReasons");
                        fg3.h0.J(androidx.lifecycle.g1.l(b63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.g(b63, null, 2), 3);
                        return;
                }
            }
        });
        a6().d.setOnTouchListener(new cc3.a(this, 14));
        com.google.android.material.textfield.TextInputEditText textInputEditText = a6().d;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textInputEditText, "deactivationInput");
        ge0.i.n(textInputEditText, new pt2.a(this, 6));
        java.lang.String string = requireContext().getString(2132019242);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a6().d.setOnFocusChangeListener(new q91.a(0, this, string));
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.b(this, null, 1), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q91.b(this, null, 3), 3);
    }
}
