package com.truecaller.filters.blockedevents;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/filters/blockedevents/b;", "Landroidx/fragment/app/Fragment;", "Lzo1/m;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract class b extends androidx.fragment.app.Fragment implements zo1.m {
    public zo1.l c;
    public ia1.b d;
    public i82.t e;
    public nd1.bar f;
    public zo1.qux g;
    public final kotlin.Lazy h = gj.m.K(this, 2131362492);
    public final kotlin.Lazy i = gj.m.K(this, 2131362491);

    @Override // zo1.m
    public final void B4(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "message");
        i.d dVar = new i.d(requireContext(), 2132083437);
        dVar.a.f = str;
        dVar.setPositiveButton(2132019079, new a42.a(this, 5)).setNegativeButton(2132019047, (android.content.DialogInterface.OnClickListener) null).m();
    }

    @Override // zo1.m
    public final void G3(java.lang.String str, java.lang.String str2, com.truecaller.details_view.routing.ExtraNotificationData extraNotificationData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
        com.truecaller.data.entity.Contact contact = new com.truecaller.data.entity.Contact();
        contact.c(new com.truecaller.data.entity.Number(str2, null));
        contact.I = str;
        ia1.b bVar = this.d;
        if (bVar != null) {
            androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            bVar.c(requireActivity, contact, false, extraNotificationData);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("conversationsRouter");
        throw null;
    }

    @Override // zo1.m
    public final void J2(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
        nd1.bar barVar = this.f;
        if (barVar != null) {
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData detailsViewIntentBuilder$HistoryEventData = null;
            int i = 10;
            startActivity(barVar.a(requireContext, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$ContactData(null, str, str2, null, null, null, 57, null), com.truecaller.detailsview.api.model.DetailsViewSource.SpammersList, detailsViewIntentBuilder$HistoryEventData, i, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.SaveToHistory.INSTANCE, 4, null)));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
        throw null;
    }

    @Override // zo1.m
    public final void J3(int i) {
        ((androidx.recyclerview.widget.RecyclerView) this.h.getValue()).smoothScrollToPosition(i);
    }

    @Override // zo1.m
    public final void P2() {
    }

    /* renamed from: R4 */
    public abstract int getT();

    public final zo1.f S4() {
        zo1.l lVar = this.c;
        if (lVar != null) {
            return lVar;
        }
        kotlin.jvm.internal.Intrinsics.n("blockedListPresenter");
        throw null;
    }

    /* renamed from: T4 */
    public abstract com.truecaller.filters.blockedevents.BlockDialogActivity.DialogType getU();

    /* renamed from: U4 */
    public abstract java.lang.String getS();

    @Override // zo1.m
    public final void i4() {
        android.widget.Toast.makeText(requireContext(), 2132017964, 0).show();
    }

    @Override // zo1.m
    public final void m3() {
        boolean z;
        zo1.qux quxVar = this.g;
        if (quxVar != null) {
            quxVar.notifyDataSetChanged();
            android.widget.TextView textView = (android.widget.TextView) this.i.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(textView, "<get-blockedTitleView>(...)");
            zo1.qux quxVar2 = this.g;
            if (quxVar2 != null) {
                if (quxVar2.getItemCount() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                gj.m.k0(textView, z);
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("blockedListAdapter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("blockedListAdapter");
        throw null;
    }

    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        zo1.f S4 = S4();
        java.lang.String s = getS();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "<set-?>");
        S4.d = s;
        S4().e = false;
        S4().f = getU();
        zo1.qux quxVar = new zo1.qux(S4(), false);
        this.g = quxVar;
        ((com.truecaller.ui.bar) quxVar).n = new com.google.firebase.crashlytics.internal.concurrency.baz(this, 10);
    }

    public void onDestroy() {
        S4().m1();
        super.onDestroy();
    }

    public final void onResume() {
        super.onResume();
        S4().onResume();
    }

    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        kotlin.Lazy lazy = this.h;
        ((androidx.recyclerview.widget.RecyclerView) lazy.getValue()).setItemAnimator((androidx.recyclerview.widget.p1) null);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) lazy.getValue();
        zo1.qux quxVar = this.g;
        if (quxVar != null) {
            recyclerView.setAdapter(quxVar);
            androidx.recyclerview.widget.y yVar = new androidx.recyclerview.widget.y(((androidx.recyclerview.widget.RecyclerView) lazy.getValue()).getContext(), 1);
            yVar.c = new android.graphics.drawable.ColorDrawable(bi3.a.s(requireContext(), 2130970536));
            ((androidx.recyclerview.widget.RecyclerView) lazy.getValue()).addItemDecoration(yVar);
            S4().u0(this);
            ((android.widget.TextView) this.i.getValue()).setText(getString(getT()));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("blockedListAdapter");
        throw null;
    }

    @Override // zo1.m
    public final void w4(i82.r rVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "launchContext");
        i82.u uVar = this.e;
        if (uVar != null) {
            android.content.Context requireContext = requireContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            startActivity(uVar.a(requireContext, rVar, (com.truecaller.premium.data.SubscriptionPromoEventMetaData) null, (com.truecaller.premium.data.feature.PremiumFeature) null, true, (com.truecaller.premium.interstitial.InterstitialAnimation) null));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumScreenNavigator");
        throw null;
    }

    @Override // to1.qux
    public final void y4() {
    }

    @Override // zo1.m
    public final void H3() {
    }
}
