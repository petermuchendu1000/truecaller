package com.truecaller.search.global;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class h implements android.widget.AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ h(java.lang.Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        switch (this.a) {
            case 0:
                com.truecaller.search.global.m mVar = (com.truecaller.search.global.m) this.b;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapterView, "parent");
                com.truecaller.search.global.a0 a0Var = mVar.i;
                java.lang.String str = null;
                if (a0Var != null) {
                    java.lang.Object item = adapterView.getAdapter().getItem(i);
                    kotlin.jvm.internal.Intrinsics.e(item, "null cannot be cast to non-null type com.truecaller.data.country.CountryListDto.Country");
                    com.truecaller.data.country.CountryListDto.bar barVar = (com.truecaller.data.country.CountryListDto.bar) item;
                    com.truecaller.search.global.h0 h0Var = (com.truecaller.search.global.h0) a0Var;
                    if (!((qo1.r) h0Var.M.get()).g()) {
                        com.truecaller.data.country.CountryListDto.bar barVar2 = h0Var.j0;
                        h0Var.j0 = h0Var.g0;
                        h0Var.E2(barVar, barVar.equals(t41.f.a(((m03.m) h0Var.p).a)));
                        if (barVar2 != null) {
                            java.lang.String str2 = barVar2.c;
                            com.truecaller.data.country.CountryListDto.bar barVar3 = h0Var.g0;
                            if (barVar3 != null) {
                                str = barVar3.c;
                            }
                            if (!kotlin.jvm.internal.Intrinsics.b(str2, str)) {
                                return;
                            }
                        }
                        if (h0Var.e0.length() > 0) {
                            h0Var.r2(kotlin.collections.h0.a);
                            h0Var.D2();
                        }
                        com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch globalSearch = com.truecaller.analytics.common.event.ViewActionEvent.GlobalSearch.CHANGE_COUNTRY;
                        java.lang.String str3 = barVar.b;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("globalSearch", "context");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalSearch, "action");
                        java.lang.String value = globalSearch.getValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "action");
                        nc0.u1.e(new rc0.b(value, str3, "globalSearch"), h0Var.q);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("mGlobalSearchPresenter");
                throw null;
            case 1:
                com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity bottomSheetOAuthActivity = (com.truecaller.sdk.oAuth.view.consentScreen.BottomSheetOAuthActivity) this.b;
                android.widget.ListPopupWindow listPopupWindow = bottomSheetOAuthActivity.g0;
                if (listPopupWindow != null) {
                    listPopupWindow.dismiss();
                    rz1.baz bazVar = (rz1.baz) ro2.bar.b.get(i);
                    yo2.qux quxVar = bottomSheetOAuthActivity.e0;
                    if (quxVar != null) {
                        quxVar.c2(bazVar.b);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                throw null;
            default:
                zo2.baz bazVar2 = (zo2.baz) this.b;
                android.widget.ListPopupWindow listPopupWindow2 = bazVar2.k;
                if (listPopupWindow2 != null) {
                    listPopupWindow2.dismiss();
                    rz1.baz bazVar3 = (rz1.baz) ro2.bar.b.get(i);
                    yo2.qux quxVar2 = bazVar2.i;
                    if (quxVar2 != null) {
                        quxVar2.c2(bazVar3.b);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("languageSelectorPopupWindow");
                throw null;
        }
    }
}
