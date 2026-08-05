package com.truecaller.deactivation.impl.ui.intro;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/intro/DeactivationIntroFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationIntroFragment extends a42.bar {
    public static final /* synthetic */ kotlin.reflect.KProperty[] l = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/deactivation/impl/databinding/FragmentDeactivationIntroBinding;", com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.class))};
    public j01.qux i;
    public final j13.bar j;
    public final androidx.lifecycle.o1 k;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public DeactivationIntroFragment() {
        super(28);
        ?? obj = new java.lang.Object();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) obj, "viewBinder");
        this.j = new j13.bar((kotlin.jvm.functions.Function1) obj);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new k91.d(new hv2.baz(this, 29), 0));
        this.k = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(k91.l.class), new iq1.c(lazy, 17), new iq1.d(19, this, lazy), new iq1.c(lazy, 18));
    }

    public final h91.baz Z5() {
        return (h91.baz) this.j.a(this, l[0]);
    }

    public final k91.l a6() {
        return (k91.l) this.k.getValue();
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        Z5().b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: k91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        k91.l a6 = deactivationIntroFragment.a6();
                        a6.b.e("deactivateWarning");
                        a6.g.c(k91.g.a);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        k91.l a63 = deactivationIntroFragment.a6();
                        a63.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new k5.l(a63, (df3.bar) null, 6), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z5().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: k91.baz
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        k91.l a6 = deactivationIntroFragment.a6();
                        a6.b.e("deactivateWarning");
                        a6.g.c(k91.g.a);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        k91.l a63 = deactivationIntroFragment.a6();
                        a63.getClass();
                        fg3.h0.J(androidx.lifecycle.g1.l(a63), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new k5.l(a63, (df3.bar) null, 6), 3);
                        return;
                }
            }
        });
        final int i3 = 0;
        Z5().e.setOnCheckedChangeListener(new kotlin.jvm.functions.Function1(this) { // from class: k91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj) {
                int i4 = i3;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                switch (i4) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.CALLER_ID, booleanValue);
                        return kotlin.Unit.a;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.SPAM_PROTECTION, booleanValue);
                        return kotlin.Unit.a;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.TRUECALLER_ACCOUNT, booleanValue);
                        return kotlin.Unit.a;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.ASSISTANT, booleanValue);
                        return kotlin.Unit.a;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.VOICEMAIL, booleanValue);
                        return kotlin.Unit.a;
                }
            }
        });
        final int i4 = 1;
        Z5().f.setOnCheckedChangeListener(new kotlin.jvm.functions.Function1(this) { // from class: k91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj) {
                int i43 = i4;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                switch (i43) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.CALLER_ID, booleanValue);
                        return kotlin.Unit.a;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.SPAM_PROTECTION, booleanValue);
                        return kotlin.Unit.a;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.TRUECALLER_ACCOUNT, booleanValue);
                        return kotlin.Unit.a;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.ASSISTANT, booleanValue);
                        return kotlin.Unit.a;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.VOICEMAIL, booleanValue);
                        return kotlin.Unit.a;
                }
            }
        });
        final int i5 = 2;
        Z5().g.setOnCheckedChangeListener(new kotlin.jvm.functions.Function1(this) { // from class: k91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj) {
                int i43 = i5;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                switch (i43) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.CALLER_ID, booleanValue);
                        return kotlin.Unit.a;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.SPAM_PROTECTION, booleanValue);
                        return kotlin.Unit.a;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.TRUECALLER_ACCOUNT, booleanValue);
                        return kotlin.Unit.a;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.ASSISTANT, booleanValue);
                        return kotlin.Unit.a;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.VOICEMAIL, booleanValue);
                        return kotlin.Unit.a;
                }
            }
        });
        final int i6 = 3;
        Z5().d.setOnCheckedChangeListener(new kotlin.jvm.functions.Function1(this) { // from class: k91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj) {
                int i43 = i6;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                switch (i43) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.CALLER_ID, booleanValue);
                        return kotlin.Unit.a;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.SPAM_PROTECTION, booleanValue);
                        return kotlin.Unit.a;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.TRUECALLER_ACCOUNT, booleanValue);
                        return kotlin.Unit.a;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.ASSISTANT, booleanValue);
                        return kotlin.Unit.a;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.VOICEMAIL, booleanValue);
                        return kotlin.Unit.a;
                }
            }
        });
        final int i7 = 4;
        Z5().h.setOnCheckedChangeListener(new kotlin.jvm.functions.Function1(this) { // from class: k91.qux
            public final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke(java.lang.Object obj) {
                int i43 = i7;
                com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment deactivationIntroFragment = this.b;
                boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                switch (i43) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.CALLER_ID, booleanValue);
                        return kotlin.Unit.a;
                    case 1:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.SPAM_PROTECTION, booleanValue);
                        return kotlin.Unit.a;
                    case 2:
                        kotlin.reflect.KProperty[] kPropertyArr3 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.TRUECALLER_ACCOUNT, booleanValue);
                        return kotlin.Unit.a;
                    case 3:
                        kotlin.reflect.KProperty[] kPropertyArr4 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.ASSISTANT, booleanValue);
                        return kotlin.Unit.a;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr5 = com.truecaller.deactivation.impl.ui.intro.DeactivationIntroFragment.l;
                        deactivationIntroFragment.a6().p(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.VOICEMAIL, booleanValue);
                        return kotlin.Unit.a;
                }
            }
        });
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        df3.bar barVar = null;
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new k91.b(this, barVar, 1), 3);
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new k91.b(this, barVar, 3), 3);
    }
}
