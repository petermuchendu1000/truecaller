package com.truecaller.dialer.ui.setting.callhistory;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/dialer/ui/setting/callhistory/CallHistoryTapSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallHistoryTapSettingsFragment extends r91.f {
    public static final /* synthetic */ kotlin.reflect.KProperty[] k = {kotlin.jvm.internal.k0.a.property1(new kotlin.jvm.internal.a0("binding", 0, "getBinding()Lcom/truecaller/dialer/databinding/FragmentCallHistoryTapSettingsBinding;", com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment.class))};
    public final j13.bar i;
    public final androidx.lifecycle.o1 j;

    public CallHistoryTapSettingsFragment() {
        super(13);
        th2.c cVar = new th2.c(9);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "viewBinder");
        this.i = new j13.bar(cVar);
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.k.c, new u91.b(new u91.b(this, 18), 19));
        this.j = new androidx.lifecycle.o1(kotlin.jvm.internal.k0.a.getOrCreateKotlinClass(vf1.g.class), new tf1.qux(lazy, 16), new sz1.b(18, this, lazy), new tf1.qux(lazy, 17));
    }

    public final android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(2131559129, viewGroup, false);
    }

    public final void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        androidx.lifecycle.o1 o1Var = this.j;
        bd.bar.u(((vf1.g) o1Var.getValue()).c, "CallTapSetting", "callsSettings");
        xe1.qux quxVar = (xe1.qux) this.i.a(this, k[0]);
        final int i = 0;
        quxVar.d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: vf1.baz
            public final /* synthetic */ com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i2 = i;
                df3.bar barVar = null;
                com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment callHistoryTapSettingsFragment = this.b;
                switch (i2) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment.k;
                        androidx.lifecycle.d0 viewLifecycleOwner = callHistoryTapSettingsFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new vf1.a(callHistoryTapSettingsFragment, barVar, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment.k;
                        androidx.lifecycle.d0 viewLifecycleOwner2 = callHistoryTapSettingsFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new vf1.a(callHistoryTapSettingsFragment, barVar, 1), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        quxVar.b.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: vf1.baz
            public final /* synthetic */ com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                int i22 = i2;
                df3.bar barVar = null;
                com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment callHistoryTapSettingsFragment = this.b;
                switch (i22) {
                    case 0:
                        kotlin.reflect.KProperty[] kPropertyArr = com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment.k;
                        androidx.lifecycle.d0 viewLifecycleOwner = callHistoryTapSettingsFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new vf1.a(callHistoryTapSettingsFragment, barVar, 0), 3);
                        return;
                    default:
                        kotlin.reflect.KProperty[] kPropertyArr2 = com.truecaller.dialer.ui.setting.callhistory.CallHistoryTapSettingsFragment.k;
                        androidx.lifecycle.d0 viewLifecycleOwner2 = callHistoryTapSettingsFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        fg3.h0.J(androidx.lifecycle.g1.j(viewLifecycleOwner2), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new vf1.a(callHistoryTapSettingsFragment, barVar, 1), 3);
                        return;
                }
            }
        });
        androidx.room.o oVar = new androidx.room.o(25, new ig3.q1(((vf1.g) o1Var.getValue()).d), new td1.f(this, (df3.bar) null, 22));
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ig3.w1.F(oVar, androidx.lifecycle.g1.j(viewLifecycleOwner));
    }
}
