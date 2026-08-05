package com.truecaller.bizmon_call_kit.qa;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/bizmon_call_kit/qa/BizmonCallkitQaActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lfg3/e0;", "<init>", "()V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizmonCallkitQaActivity extends com.truecaller.bizmon_call_kit.qa.Hilt_BizmonCallkitQaActivity implements fg3.e0 {
    public static final /* synthetic */ int i0 = 0;
    public kotlin.coroutines.CoroutineContext d0;
    public kotlin.coroutines.CoroutineContext e0;
    public qc3.bar f0;
    public qc3.bar g0;
    public qc3.bar h0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t0(com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity, com.truecaller.data.entity.Contact contact, java.lang.String str, java.lang.String str2) {
        android.net.Uri uri;
        java.lang.String str3;
        boolean z;
        java.lang.String str4 = contact.O;
        if (str4 != null && str4.length() != 0) {
            uri = android.net.Uri.parse(contact.O);
        } else {
            uri = null;
        }
        java.lang.String str5 = contact.I;
        if (str5 != null) {
            str3 = fu.baz.u(str5);
        } else {
            str3 = null;
        }
        boolean Y = contact.Y();
        boolean T = contact.T();
        qc3.bar barVar = bizmonCallkitQaActivity.g0;
        if (barVar != null) {
            if (((qo1.qux) barVar.get()).h() && contact.V()) {
                z = true;
            } else {
                z = false;
            }
            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = new com.truecaller.common.ui.avatar.AvatarXConfig(uri, (java.lang.String) null, str3, false, false, false, false, false, false, Y, T, false, (java.lang.Integer) null, false, false, false, z, false, (java.lang.String) null, false, false, -16780298);
            w31.c cVar = new w31.c(new u03.g0(bizmonCallkitQaActivity), 0);
            i.d dVar = new i.d(bizmonCallkitQaActivity);
            android.view.LayoutInflater layoutInflater = bizmonCallkitQaActivity.getLayoutInflater();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            android.view.View inflate = layoutInflater.inflate(2131559920, (android.view.ViewGroup) null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            dVar.setView(inflate);
            inflate.findViewById(2131364590).setPresenter(cVar);
            cVar.C2(avatarXConfig, true);
            ((android.widget.TextView) inflate.findViewById(2131366888)).setText(contact.I);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(2131366890);
            java.util.List C = contact.C();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(C, "getNumbers(...)");
            textView.setText(((com.truecaller.data.entity.Number) kotlin.collections.CollectionsKt.V(C)).f);
            ((android.widget.TextView) inflate.findViewById(2131366893)).setText(str);
            ((android.widget.TextView) inflate.findViewById(2131366862)).setText(str2);
            i.e create = dVar.create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            create.show();
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("bizmonFeaturesInventory");
        throw null;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.e0;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.bizmon_call_kit.qa.Hilt_BizmonCallkitQaActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558444);
        final int i = 0;
        ((android.widget.Button) findViewById(2131362677)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                int i3 = 0;
                int i4 = 1;
                int i5 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i2) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i6 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i3));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i3), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i4), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i4), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i5), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i2 = 1;
        ((android.widget.Button) findViewById(2131362664)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                int i3 = 0;
                int i4 = 1;
                int i5 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i6 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i3));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i3), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i4), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i4), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i5), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i3 = 2;
        ((android.widget.Button) findViewById(2131362670)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i3;
                int i32 = 0;
                int i4 = 1;
                int i5 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i6 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i4), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i4), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i5), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i4 = 3;
        ((android.widget.Button) findViewById(2131362633)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i4;
                int i32 = 0;
                int i42 = 1;
                int i5 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i6 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i5), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i5 = 4;
        ((android.widget.Button) findViewById(2131362632)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i5;
                int i32 = 0;
                int i42 = 1;
                int i52 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i6 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i52), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i6 = 5;
        ((android.widget.Button) findViewById(2131362647)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i6;
                int i32 = 0;
                int i42 = 1;
                int i52 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i62 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i7 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i52), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i7 = 6;
        ((android.widget.Button) findViewById(2131362666)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i7;
                int i32 = 0;
                int i42 = 1;
                int i52 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i62 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i72 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i8 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i52), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i8 = 7;
        ((android.widget.Button) findViewById(2131362667)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i8;
                int i32 = 0;
                int i42 = 1;
                int i52 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i62 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i72 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i82 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i9 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i52), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        final int i9 = 8;
        ((android.widget.Button) findViewById(2131362668)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: aj0.c
            public final /* synthetic */ com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i9;
                int i32 = 0;
                int i42 = 1;
                int i52 = 3;
                df3.bar barVar = null;
                com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity bizmonCallkitQaActivity = this.b;
                switch (i22) {
                    case 0:
                        qc3.bar barVar2 = bizmonCallkitQaActivity.h0;
                        if (barVar2 != null) {
                            java.lang.Object obj = barVar2.get();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            wi0.bar.J((xf0.bar) obj, "BizMonCallKitSyncWorkAction", null, null, 6);
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("backgroundWorkTrigger");
                        throw null;
                    case 1:
                        int i62 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        aj0.b bVar = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar.getClass();
                        fg3.h0.P(new aj0.qux(bVar, barVar, i32));
                        return;
                    case 2:
                        int i72 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        java.lang.String obj2 = ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366863)).getText().toString();
                        aj0.b bVar2 = (aj0.b) bizmonCallkitQaActivity.v0().get();
                        bVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "offset");
                        java.util.Calendar calendar = java.util.Calendar.getInstance();
                        calendar.add(6, -java.lang.Integer.parseInt(obj2));
                        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd", java.util.Locale.getDefault()).format(calendar.getTime());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        ((bj0.qux) bVar2.g.get()).g0("call_kit_last_sync_date", format);
                        return;
                    case 3:
                        int i82 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366843)).getText().toString(), barVar, i32), 2);
                        return;
                    case 4:
                        int i92 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366842)).getText().toString(), barVar, i42), 2);
                        return;
                    case 5:
                        int i11 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, bizmonCallkitQaActivity.u0(), (fg3.f0) null, new aj0.d(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366864)).getText().toString(), barVar, i42), 2);
                        return;
                    case 6:
                        int i12 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366900)).getText().toString(), barVar, i52), 3);
                        return;
                    case 7:
                        int i13 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366901)).getText().toString(), barVar, 5), 3);
                        return;
                    default:
                        int i14 = com.truecaller.bizmon_call_kit.qa.BizmonCallkitQaActivity.i0;
                        fg3.h0.J(bizmonCallkitQaActivity, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new aj0.e(bizmonCallkitQaActivity, ((android.widget.EditText) bizmonCallkitQaActivity.findViewById(2131366902)).getText().toString(), barVar, 7), 3);
                        return;
                }
            }
        });
        fg3.h0.J(this, u0(), (fg3.f0) null, new a10.n(this, null, 9), 2);
    }

    public final kotlin.coroutines.CoroutineContext u0() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.d0;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        kotlin.jvm.internal.Intrinsics.n("asyncContext");
        throw null;
    }

    public final qc3.bar v0() {
        qc3.bar barVar = this.f0;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("helper");
        throw null;
    }
}
