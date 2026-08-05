package com.truecaller.deactivation.impl.ui.questionnaire.questions.storage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/questions/storage/DeactivationStorageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationStorageFragment extends r91.f {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentQuestionAppUnusedStorageBinding;", com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationStorageFragment() {
        super(4);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new rq0.a(new rq0.a(this, 7), 8));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(s91.f.class), new qs2.d(lazy, 12), new nu2.a(26, this, lazy), new qs2.d(lazy, 13));
    }

    public final h91.b Z5() {
        return (h91.b) this.j.a(this, l[0]);
    }

    public final s91.f a6() {
        return (s91.f) this.k.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: s91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                df3.bar barVar = null;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment deactivationStorageFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a6 = deactivationStorageFragment.a6();
                        g91.baz bazVar = a6.b;
                        bazVar.getClass();
                        g91.baz.c(bazVar, "extraStorageSpaceTroubleshoot", "clearCache");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o52.w(a6, barVar, 7), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a63 = deactivationStorageFragment.a6();
                        g91.baz bazVar2 = a63.b;
                        bazVar2.getClass();
                        g91.baz.c(bazVar2, "extraStorageSpaceTroubleshoot", "manageStorage");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a63, null, 2), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a64 = deactivationStorageFragment.a6();
                        a64.b.e("extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a64, null, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a65 = deactivationStorageFragment.a6();
                        f63.qux.y(a65.b, "extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a65, null, 1), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: s91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                df3.bar barVar = null;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment deactivationStorageFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a6 = deactivationStorageFragment.a6();
                        g91.baz bazVar = a6.b;
                        bazVar.getClass();
                        g91.baz.c(bazVar, "extraStorageSpaceTroubleshoot", "clearCache");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o52.w(a6, barVar, 7), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a63 = deactivationStorageFragment.a6();
                        g91.baz bazVar2 = a63.b;
                        bazVar2.getClass();
                        g91.baz.c(bazVar2, "extraStorageSpaceTroubleshoot", "manageStorage");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a63, null, 2), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a64 = deactivationStorageFragment.a6();
                        a64.b.e("extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a64, null, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a65 = deactivationStorageFragment.a6();
                        f63.qux.y(a65.b, "extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a65, null, 1), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        Z5().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: s91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i3;
                df3.bar barVar = null;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment deactivationStorageFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a6 = deactivationStorageFragment.a6();
                        g91.baz bazVar = a6.b;
                        bazVar.getClass();
                        g91.baz.c(bazVar, "extraStorageSpaceTroubleshoot", "clearCache");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o52.w(a6, barVar, 7), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a63 = deactivationStorageFragment.a6();
                        g91.baz bazVar2 = a63.b;
                        bazVar2.getClass();
                        g91.baz.c(bazVar2, "extraStorageSpaceTroubleshoot", "manageStorage");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a63, null, 2), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a64 = deactivationStorageFragment.a6();
                        a64.b.e("extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a64, null, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a65 = deactivationStorageFragment.a6();
                        f63.qux.y(a65.b, "extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a65, null, 1), 3);
                        return;
                }
            }
        });
        final int i4 = 3;
        Z5().e.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: s91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i4;
                df3.bar barVar = null;
                com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment deactivationStorageFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a6 = deactivationStorageFragment.a6();
                        g91.baz bazVar = a6.b;
                        bazVar.getClass();
                        g91.baz.c(bazVar, "extraStorageSpaceTroubleshoot", "clearCache");
                        fg3.h0.J(androidx.lifecycle.g1.l(a6), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new o52.w(a6, barVar, 7), 3);
                        return;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a63 = deactivationStorageFragment.a6();
                        g91.baz bazVar2 = a63.b;
                        bazVar2.getClass();
                        g91.baz.c(bazVar2, "extraStorageSpaceTroubleshoot", "manageStorage");
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a63, null, 2), 3);
                        return;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a64 = deactivationStorageFragment.a6();
                        a64.b.e("extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a64), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a64, null, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.questionnaire.questions.storage.DeactivationStorageFragment.l;
                        s91.f a65 = deactivationStorageFragment.a6();
                        f63.qux.y(a65.b, "extraStorageSpaceTroubleshoot");
                        fg3.h0.J(androidx.lifecycle.g1.l(a65), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.e(a65, null, 1), 3);
                        return;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        df3.bar barVar = null;
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.a(this, barVar, 1), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new s91.a(this, barVar, 3), 3);
    }
}
