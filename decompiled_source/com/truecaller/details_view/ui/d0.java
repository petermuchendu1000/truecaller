package com.truecaller.details_view.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class d0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.details_view.ui.i0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(com.truecaller.details_view.ui.i0 i0Var, boolean z, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = i0Var;
        this.A = z;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.details_view.ui.d0(this.z, this.A, barVar, 0);
            default:
                return new com.truecaller.details_view.ui.d0(this.z, this.A, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2 = this.x;
        com.truecaller.details_view.ui.i0 i0Var = this.z;
        switch (i2) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    el0.baz bazVar = (el0.baz) i0Var.R.get();
                    this.y = 1;
                    java.lang.Object d = bazVar.d.d(this, java.lang.Boolean.valueOf(this.A));
                    if (d != barVar) {
                        d = kotlin.Unit.a;
                    }
                    if (d == barVar) {
                        return barVar;
                    }
                }
                return kotlin.Unit.a;
            default:
                qa1.baz bazVar2 = i0Var.q;
                ef3.bar barVar2 = ef3.bar.a;
                int i4 = this.y;
                boolean z = this.A;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    p.c3 c3Var = i0Var.t;
                    com.truecaller.details_view.ui.d1 d1Var = i0Var.d0;
                    if (d1Var != null) {
                        com.truecaller.data.entity.Contact contact = d1Var.a;
                        this.y = 1;
                        java.lang.Object W = fg3.h0.W((kotlin.coroutines.CoroutineContext) c3Var.b, new a00.b(contact, c3Var, z, (df3.bar) null, 1), this);
                        if (W != barVar2) {
                            W = kotlin.Unit.a;
                        }
                        if (W == barVar2) {
                            return barVar2;
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                        throw null;
                    }
                }
                if (z) {
                    qa1.a aVar = (qa1.a) bazVar2;
                    java.lang.String str = aVar.h;
                    com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.FAVORITE;
                    java.lang.String value = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction, "action");
                    java.lang.String value2 = contactAction.getValue();
                    nc0.u1.e(uf.qux.p(value2, "action", value2, value, str), aVar.a);
                } else {
                    qa1.a aVar2 = (qa1.a) bazVar2;
                    java.lang.String str2 = aVar2.h;
                    com.truecaller.analytics.common.event.ViewActionEvent.ContactAction contactAction2 = com.truecaller.analytics.common.event.ViewActionEvent.ContactAction.UN_FAVORITE;
                    java.lang.String value3 = com.truecaller.analytics.common.event.ViewActionEvent.ContactDetailsSubAction.OVERFLOW_MENU.getValue();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "context");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactAction2, "action");
                    java.lang.String value4 = contactAction2.getValue();
                    nc0.u1.e(uf.qux.p(value4, "action", value4, value3, str2), aVar2.a);
                }
                u03.g0 g0Var = i0Var.u;
                if (z) {
                    i = 2132020443;
                } else {
                    i = 2132020444;
                }
                com.truecaller.details_view.ui.d1 d1Var2 = i0Var.d0;
                if (d1Var2 != null) {
                    java.lang.String h = g0Var.h(i, new java.lang.Object[]{d1Var2.a.t()});
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                    if (((qo1.e) ((qo1.d) i0Var.J.get())).a()) {
                        com.truecaller.details_view.ui.u uVar = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "message");
                            com.truecaller.details_view.ui.DetailsViewActivityLegacy detailsViewActivityLegacy = ((com.truecaller.details_view.ui.x0) uVar).b;
                            ur.i iVar = (ur.i) detailsViewActivityLegacy.E0.get();
                            if (iVar != null) {
                                if (iVar.d()) {
                                    iVar.a(new com.truecaller.details_view.ui.w0(iVar, detailsViewActivityLegacy, h, z));
                                    iVar.b(3);
                                } else {
                                    com.truecaller.details_view.ui.x0.d(detailsViewActivityLegacy, h, z);
                                }
                            } else {
                                com.truecaller.details_view.ui.x0.d(detailsViewActivityLegacy, h, z);
                            }
                        }
                    } else {
                        com.truecaller.details_view.ui.u uVar2 = (com.truecaller.details_view.ui.u) ((com.truecaller.sdk.bar) i0Var).a;
                        if (uVar2 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h, "message");
                            android.widget.Toast.makeText((android.content.Context) ((com.truecaller.details_view.ui.x0) uVar2).b, (java.lang.CharSequence) h, 0).show();
                        }
                    }
                    return kotlin.Unit.a;
                }
                kotlin.jvm.internal.Intrinsics.n("detailsViewModel");
                throw null;
        }
    }
}
