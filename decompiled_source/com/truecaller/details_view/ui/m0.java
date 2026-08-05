package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* synthetic */ class m0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.details_view.ui.DetailsViewActivityLegacy b;

    public /* synthetic */ m0(com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy, int i) {
        this.a = i;
        this.b = detailsViewActivityLegacy;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    /* JADX WARN: Type inference failed for: r9v19, types: [android.content.Context, com.truecaller.details_view.ui.DetailsViewActivityLegacy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i = this.a;
        df3.bar barVar = null;
        com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = this.b;
        switch (i) {
            case 0:
                int i2 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                gb1.d z0 = detailsViewActivityLegacy.z0();
                ((qa1.a) z0.n).g(com.truecaller.analytics.common.event.ViewActionEvent.DetailsWidget.HEADER);
                com.truecaller.details_view.ui.s0 s0Var = (com.truecaller.details_view.ui.s0) ((com.truecaller.sdk.bar) z0).a;
                if (s0Var != null) {
                    com.truecaller.details_view.ui.d1 d1Var = z0.D;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact = d1Var.a;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "contact");
                        ?? r0 = s0Var.c;
                        e93.c cVar = r0.x0;
                        if (cVar != null) {
                            android.content.Intent u = cVar.u((android.content.Context) r0, contact, "details");
                            g.baz bazVar = r0.O0;
                            if (bazVar != null) {
                                bazVar.a(u, (ea.c) null);
                                return;
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("nameSuggestionLauncher");
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.Intrinsics.n("nameSuggestionRouter");
                        throw null;
                    }
                    kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                    throw null;
                }
                return;
            case 1:
                int i3 = com.truecaller.details_view.ui.DetailsViewActivityLegacy.Q0;
                gb1.d z03 = detailsViewActivityLegacy.z0();
                ea1.bar barVar2 = detailsViewActivityLegacy.C0;
                if (barVar2 != null) {
                    android.widget.ImageView imageView = barVar2.G;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(imageView, "verifiedIcon");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "<this>");
                    int[] iArr = new int[2];
                    imageView.getLocationInWindow(iArr);
                    fg3.h0.J(z03, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new gb1.a(z03, iArr[0], barVar, 0), 3);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("binding");
                throw null;
            case 2:
                gb1.d z04 = detailsViewActivityLegacy.z0();
                fg3.h0.J(z04, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new g03.bar(z04, (df3.bar) null, 5), 3);
                return;
            default:
                com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) ((com.truecaller.details_view.ui.i0) detailsViewActivityLegacy.B0())).a;
                if (uVar != null) {
                    ?? r9 = ((com.truecaller.details_view.ui.x0) uVar).b;
                    ia1.a aVar = r9.h0;
                    if (aVar != null) {
                        android.app.Activity O = ye0.k.O((android.content.Context) r9);
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(O, "activity");
                        java.lang.Object obj = aVar.g.get();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                        O.startActivity(wi0.bar.f((com.truecaller.ui.b0) obj, O, (com.truecaller.bottombar.BottomBarButtonType) null, "DetailsViewV2", com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.FAVORITE, 58));
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("callingRouter");
                    throw null;
                }
                return;
        }
    }
}
