package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int x;
    public final /* synthetic */ y.n0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ baz(y.n0 n0Var, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.y = n0Var;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.qa.baz(this.y, barVar, 0);
            case 1:
                return new com.truecaller.qa.baz(this.y, barVar, 1);
            case 2:
                return new com.truecaller.qa.baz(this.y, barVar, 2);
            case 3:
                return new com.truecaller.qa.baz(this.y, barVar, 3);
            case 4:
                return new com.truecaller.qa.baz(this.y, barVar, 4);
            case 5:
                return new com.truecaller.qa.baz(this.y, barVar, 5);
            case 6:
                return new com.truecaller.qa.baz(this.y, barVar, 6);
            case 7:
                return new com.truecaller.qa.baz(this.y, barVar, 7);
            case 8:
                return new com.truecaller.qa.baz(this.y, barVar, 8);
            case 9:
                return new com.truecaller.qa.baz(this.y, barVar, 9);
            default:
                return new com.truecaller.qa.baz(this.y, barVar, 10);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 2:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 3:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 4:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 5:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 6:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 7:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 8:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 9:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        final int i2 = 1;
        final int i3 = 0;
        final y.n0 n0Var = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ((android.content.Context) n0Var.b).startActivity(new android.content.Intent((android.content.Context) n0Var.b, (java.lang.Class<?>) com.truecaller.bizmon_call_kit.qa.EPCallKitQaActivity.class));
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                if (((qo1.qux) n0Var.f).f()) {
                    ((android.content.Context) n0Var.b).startActivity(new android.content.Intent((android.content.Context) n0Var.b, (java.lang.Class<?>) com.truecaller.bizmon.dynamicCalls.qa.BizDynamicCallsQAActivity.class));
                } else {
                    android.widget.Toast.makeText((android.content.Context) n0Var.b, "Please enable the FF", 0).show();
                }
                return kotlin.Unit.a;
            case 2:
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                android.content.Context context = (android.content.Context) n0Var.b;
                if (((qo1.qux) n0Var.f).a()) {
                    fe0.m.D(os0.bar.z(context, "context", context, "getInstance(...)"), "BizCallMeBackCleanUpWorkAction", (android.content.Context) n0Var.b, (kotlin.Pair) null, (nd.g) null, 12);
                } else {
                    android.widget.Toast.makeText(context, "Please enable the FF", 0).show();
                }
                return kotlin.Unit.a;
            case 3:
                ef3.bar barVar4 = ef3.bar.a;
                od.p.E(obj);
                gg0.baz bazVar = (gg0.baz) n0Var.d;
                bazVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("show_priority_call_banner", "which");
                gg0.d dVar = bazVar.a;
                dVar.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("show_priority_call_banner", "which");
                dVar.a.c0("show_priority_call_banner", true);
                ((xz1.q) n0Var.e).e0("lastInboxBannerDate", 0L);
                return kotlin.Unit.a;
            case 4:
                ef3.bar barVar5 = ef3.bar.a;
                od.p.E(obj);
                gg0.baz bazVar2 = (gg0.baz) n0Var.d;
                bazVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("show_verified_business_banner", "which");
                gg0.d dVar2 = bazVar2.a;
                dVar2.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("show_verified_business_banner", "which");
                dVar2.a.c0("show_verified_business_banner", true);
                ((xz1.q) n0Var.e).e0("lastInboxBannerDate", 0L);
                return kotlin.Unit.a;
            case 5:
                ef3.bar barVar6 = ef3.bar.a;
                od.p.E(obj);
                new i.d((android.content.Context) n0Var.b, 2132083437).setTitle("Enter call me back test number").l(2131560287).setPositiveButton(2132019051, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.qa.bar
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                        int i5 = i3;
                        y.n0 n0Var2 = n0Var;
                        switch (i5) {
                            case 0:
                                ej.b bVar = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj2 = ((android.widget.TextView) findViewById).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj2)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "number");
                                    ((qi0.baz) ((qc3.bar) bVar.c).get()).g0("call_me_back_test_number", obj2);
                                    bVar.Q(obj2, "call_id_".concat(obj2));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back number set", 0).show();
                                    return;
                                }
                                return;
                            case 1:
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById2 = ((android.app.Dialog) dialogInterface).findViewById(2131363710);
                                kotlin.jvm.internal.Intrinsics.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj3 = ((android.widget.TextView) findViewById2).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj3) && android.text.TextUtils.isDigitsOnly(obj3)) {
                                    long parseLong = java.lang.Long.parseLong(obj3) * 60000;
                                    ej.b bVar2 = (ej.b) n0Var2.c;
                                    qc3.bar barVar7 = (qc3.bar) bVar2.d;
                                    com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord a = ((xg0.f) barVar7.get()).a(bVar2.t());
                                    if (a != null) {
                                        ((u03.qux) ((u03.baz) bVar2.e)).getClass();
                                        a.setScheduledSlot(new com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot("test", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + parseLong), (java.lang.Long) null, (java.lang.Long) null));
                                    } else {
                                        a = null;
                                    }
                                    if (a != null) {
                                        ((xg0.f) barVar7.get()).c(a);
                                    }
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back expiry set", 0).show();
                                    return;
                                }
                                return;
                            default:
                                ej.b bVar3 = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById3 = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj4 = ((android.widget.TextView) findViewById3).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj4)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "number");
                                    ((qi0.baz) ((qc3.bar) bVar3.c).get()).g0("biz_call_survey_test_number", obj4);
                                    bVar3.Q(obj4, "call_id_".concat(obj4));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Bizmon call survey test number set", 0).show();
                                    return;
                                }
                                return;
                        }
                    }
                }).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
                return kotlin.Unit.a;
            case 6:
                ef3.bar barVar7 = ef3.bar.a;
                od.p.E(obj);
                new i.d((android.content.Context) n0Var.b, 2132083437).setTitle("Set call me back expiry in minutes").l(2131560286).setPositiveButton(2132019051, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.qa.bar
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i4) {
                        int i5 = i2;
                        y.n0 n0Var2 = n0Var;
                        switch (i5) {
                            case 0:
                                ej.b bVar = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj2 = ((android.widget.TextView) findViewById).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj2)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "number");
                                    ((qi0.baz) ((qc3.bar) bVar.c).get()).g0("call_me_back_test_number", obj2);
                                    bVar.Q(obj2, "call_id_".concat(obj2));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back number set", 0).show();
                                    return;
                                }
                                return;
                            case 1:
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById2 = ((android.app.Dialog) dialogInterface).findViewById(2131363710);
                                kotlin.jvm.internal.Intrinsics.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj3 = ((android.widget.TextView) findViewById2).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj3) && android.text.TextUtils.isDigitsOnly(obj3)) {
                                    long parseLong = java.lang.Long.parseLong(obj3) * 60000;
                                    ej.b bVar2 = (ej.b) n0Var2.c;
                                    qc3.bar barVar72 = (qc3.bar) bVar2.d;
                                    com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord a = ((xg0.f) barVar72.get()).a(bVar2.t());
                                    if (a != null) {
                                        ((u03.qux) ((u03.baz) bVar2.e)).getClass();
                                        a.setScheduledSlot(new com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot("test", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + parseLong), (java.lang.Long) null, (java.lang.Long) null));
                                    } else {
                                        a = null;
                                    }
                                    if (a != null) {
                                        ((xg0.f) barVar72.get()).c(a);
                                    }
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back expiry set", 0).show();
                                    return;
                                }
                                return;
                            default:
                                ej.b bVar3 = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById3 = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj4 = ((android.widget.TextView) findViewById3).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj4)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "number");
                                    ((qi0.baz) ((qc3.bar) bVar3.c).get()).g0("biz_call_survey_test_number", obj4);
                                    bVar3.Q(obj4, "call_id_".concat(obj4));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Bizmon call survey test number set", 0).show();
                                    return;
                                }
                                return;
                        }
                    }
                }).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
                return kotlin.Unit.a;
            case 7:
                ef3.bar barVar8 = ef3.bar.a;
                od.p.E(obj);
                ej.b bVar = (ej.b) n0Var.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "number");
                ((qi0.baz) ((qc3.bar) bVar.c).get()).g0("call_me_back_test_number", "");
                android.widget.Toast.makeText((android.content.Context) n0Var.b, "Call me back number cleared", 0).show();
                return kotlin.Unit.a;
            case 8:
                ef3.bar barVar9 = ef3.bar.a;
                od.p.E(obj);
                final int i4 = 2;
                new i.d((android.content.Context) n0Var.b, 2132083437).setTitle("Enter bizmon call survey test number").l(2131560287).setPositiveButton(2132019072, new android.content.DialogInterface.OnClickListener() { // from class: com.truecaller.qa.bar
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i42) {
                        int i5 = i4;
                        y.n0 n0Var2 = n0Var;
                        switch (i5) {
                            case 0:
                                ej.b bVar2 = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj2 = ((android.widget.TextView) findViewById).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj2)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "number");
                                    ((qi0.baz) ((qc3.bar) bVar2.c).get()).g0("call_me_back_test_number", obj2);
                                    bVar2.Q(obj2, "call_id_".concat(obj2));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back number set", 0).show();
                                    return;
                                }
                                return;
                            case 1:
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById2 = ((android.app.Dialog) dialogInterface).findViewById(2131363710);
                                kotlin.jvm.internal.Intrinsics.e(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj3 = ((android.widget.TextView) findViewById2).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj3) && android.text.TextUtils.isDigitsOnly(obj3)) {
                                    long parseLong = java.lang.Long.parseLong(obj3) * 60000;
                                    ej.b bVar22 = (ej.b) n0Var2.c;
                                    qc3.bar barVar72 = (qc3.bar) bVar22.d;
                                    com.truecaller.bizmon.callMeBack.db.entity.BizCallMeBackRecord a = ((xg0.f) barVar72.get()).a(bVar22.t());
                                    if (a != null) {
                                        ((u03.qux) ((u03.baz) bVar22.e)).getClass();
                                        a.setScheduledSlot(new com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot("test", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() + parseLong), (java.lang.Long) null, (java.lang.Long) null));
                                    } else {
                                        a = null;
                                    }
                                    if (a != null) {
                                        ((xg0.f) barVar72.get()).c(a);
                                    }
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Call me back expiry set", 0).show();
                                    return;
                                }
                                return;
                            default:
                                ej.b bVar3 = (ej.b) n0Var2.c;
                                kotlin.jvm.internal.Intrinsics.e(dialogInterface, "null cannot be cast to non-null type android.app.Dialog");
                                android.view.View findViewById3 = ((android.app.Dialog) dialogInterface).findViewById(2131363711);
                                kotlin.jvm.internal.Intrinsics.e(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
                                java.lang.String obj4 = ((android.widget.TextView) findViewById3).getText().toString();
                                if (!android.text.TextUtils.isEmpty(obj4)) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj4, "number");
                                    ((qi0.baz) ((qc3.bar) bVar3.c).get()).g0("biz_call_survey_test_number", obj4);
                                    bVar3.Q(obj4, "call_id_".concat(obj4));
                                    android.widget.Toast.makeText((android.content.Context) n0Var2.b, "Bizmon call survey test number set", 0).show();
                                    return;
                                }
                                return;
                        }
                    }
                }).setNegativeButton(2132019018, (android.content.DialogInterface.OnClickListener) null).m();
                return kotlin.Unit.a;
            case 9:
                ef3.bar barVar10 = ef3.bar.a;
                od.p.E(obj);
                ej.b bVar2 = (ej.b) n0Var.c;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "number");
                ((qi0.baz) ((qc3.bar) bVar2.c).get()).g0("biz_call_survey_test_number", "");
                android.widget.Toast.makeText((android.content.Context) n0Var.b, "Bizmon call survey test number cleared", 0).show();
                return kotlin.Unit.a;
            default:
                ef3.bar barVar11 = ef3.bar.a;
                od.p.E(obj);
                ((android.content.Context) n0Var.b).startActivity(new android.content.Intent((android.content.Context) n0Var.b, (java.lang.Class<?>) com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.class));
                return kotlin.Unit.a;
        }
    }
}
