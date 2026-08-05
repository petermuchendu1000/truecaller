package com.truecaller.notifications.support;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/notifications/support/NotificationTrampolineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "p7/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationTrampolineActivity extends com.truecaller.notifications.support.Hilt_NotificationTrampolineActivity {
    public static final /* synthetic */ int n0 = 0;
    public nc0.bar d0;
    public s62.d e0;
    public qc3.bar f0;
    public qc3.bar g0;
    public qc3.bar h0;
    public u03.b i0;
    public u03.z j0;
    public u72.bar k0;
    public nc0.l1 l0;
    public nd1.bar m0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (i != 100) {
            if (i != 101) {
                super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
            } else {
                final int i3 = 1;
                t0("DrawOnTop", new kotlin.jvm.functions.Function1(this) { // from class: w62.qux
                    public final /* synthetic */ com.truecaller.notifications.support.NotificationTrampolineActivity b;

                    {
                        this.b = this;
                    }

                    public final java.lang.Object invoke(java.lang.Object obj) {
                        int i4 = i3;
                        java.lang.String str = "Disabled";
                        com.truecaller.notifications.support.NotificationTrampolineActivity notificationTrampolineActivity = this.b;
                        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                int i5 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                                qx2.w7 h = qx2.bc.h();
                                if (booleanValue) {
                                    str = "Enabled";
                                }
                                h.i(str);
                                h.j("notification");
                                h.l("BatteryOptimization");
                                qx2.bc f = h.f();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "build(...)");
                                nc0.bar barVar = notificationTrampolineActivity.d0;
                                if (barVar != null) {
                                    j71.g.K(f, barVar);
                                    return kotlin.Unit.a;
                                }
                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                throw null;
                            default:
                                int i6 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                                nc0.bar barVar2 = notificationTrampolineActivity.d0;
                                if (barVar2 != null) {
                                    if (booleanValue) {
                                        str = "Enabled";
                                    }
                                    cg1.g.a(barVar2, "notification", str);
                                    return kotlin.Unit.a;
                                }
                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                throw null;
                        }
                    }
                });
            }
        } else {
            final int i4 = 0;
            t0("BatteryOptimization", new kotlin.jvm.functions.Function1(this) { // from class: w62.qux
                public final /* synthetic */ com.truecaller.notifications.support.NotificationTrampolineActivity b;

                {
                    this.b = this;
                }

                public final java.lang.Object invoke(java.lang.Object obj) {
                    int i43 = i4;
                    java.lang.String str = "Disabled";
                    com.truecaller.notifications.support.NotificationTrampolineActivity notificationTrampolineActivity = this.b;
                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    switch (i43) {
                        case 0:
                            int i5 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                            qx2.w7 h = qx2.bc.h();
                            if (booleanValue) {
                                str = "Enabled";
                            }
                            h.i(str);
                            h.j("notification");
                            h.l("BatteryOptimization");
                            qx2.bc f = h.f();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "build(...)");
                            nc0.bar barVar = notificationTrampolineActivity.d0;
                            if (barVar != null) {
                                j71.g.K(f, barVar);
                                return kotlin.Unit.a;
                            }
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                        default:
                            int i6 = com.truecaller.notifications.support.NotificationTrampolineActivity.n0;
                            nc0.bar barVar2 = notificationTrampolineActivity.d0;
                            if (barVar2 != null) {
                                if (booleanValue) {
                                    str = "Enabled";
                                }
                                cg1.g.a(barVar2, "notification", str);
                                return kotlin.Unit.a;
                            }
                            kotlin.jvm.internal.Intrinsics.n("analytics");
                            throw null;
                    }
                }
            });
        }
        finish();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0164. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x028f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x005b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0270  */
    @Override // com.truecaller.notifications.support.Hilt_NotificationTrampolineActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        java.lang.String str;
        java.lang.Object cVar;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("notification-name");
        java.lang.String stringExtra2 = getIntent().getStringExtra("notification-type");
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        qx2.mi t = ee0.l.t(intent, "notification-interaction", qx2.mi.class);
        getIntent().removeExtra("notification-name");
        getIntent().removeExtra("notification-type");
        getIntent().removeExtra("notification-interaction");
        if (stringExtra != null && bundle == null) {
            switch (stringExtra.hashCode()) {
                case -1930142778:
                    str = stringExtra2;
                    if (stringExtra.equals("com.truecaller.intent.action.ALLOW_DRAW_OVER_APPS")) {
                        cVar = new w62.c(101, ak.r0.a0(this, true));
                        if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                            stringExtra.equals("com.truecaller.intent.action.BIZ_CALL_ME_BACK");
                        }
                        switch (stringExtra.hashCode()) {
                            case -1930142778:
                                if (stringExtra.equals("com.truecaller.intent.action.ALLOW_DRAW_OVER_APPS")) {
                                    android.widget.Toast.makeText((android.content.Context) this, 2132018376, 1).show();
                                }
                                if (!(cVar instanceof w62.b)) {
                                    startActivity(((w62.b) cVar).a);
                                } else if (cVar instanceof w62.c) {
                                    w62.c cVar2 = (w62.c) cVar;
                                    startActivityForResult(cVar2.a, cVar2.b);
                                } else if (cVar != null) {
                                    throw new java.lang.RuntimeException();
                                }
                                java.lang.String str2 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        if (stringExtra.equals("com.truecaller.intent.action.ALLOW_DRAW_OVER_APPS")) {
                                            if (str != null) {
                                                str2 = str;
                                            }
                                            nc0.l1 l1Var = this.l0;
                                            if (l1Var != null) {
                                                if (t == null) {
                                                    t = new qx2.mi("", "Body");
                                                }
                                                l1Var.c("notificationDrawOverOtherApps", str2, t);
                                                nc0.bar barVar = this.d0;
                                                if (barVar != null) {
                                                    cg1.g.a(barVar, "notification", "Asked");
                                                } else {
                                                    kotlin.jvm.internal.Intrinsics.n("analytics");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                                                throw null;
                                            }
                                        }
                                        z = cVar instanceof w62.c;
                                        break;
                                    case -1630354617:
                                        stringExtra.equals("com.truecaller.intent.action.BIZ_CALL_ME_BACK");
                                        z = cVar instanceof w62.c;
                                        break;
                                    case -1187399354:
                                        if (stringExtra.equals("com.truecaller.intent.action.BATTERY_OPTIMIZATIONS")) {
                                            if (str != null) {
                                                str2 = str;
                                            }
                                            nc0.l1 l1Var2 = this.l0;
                                            if (l1Var2 != null) {
                                                if (t == null) {
                                                    t = new qx2.mi("", "Body");
                                                }
                                                l1Var2.c("notificationIgnoreBatteryOptimizations", str2, t);
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("searchAnalyticsManager");
                                                throw null;
                                            }
                                        }
                                        z = cVar instanceof w62.c;
                                        break;
                                    case 1370363729:
                                        if (stringExtra.equals("com.truecaller.intent.action.SHARE")) {
                                            rc0.b A = p22.bar.A("notification", com.truecaller.analytics.common.event.ViewActionEvent.ViralityAction.SHARE);
                                            nc0.bar barVar2 = this.d0;
                                            if (barVar2 != null) {
                                                nc0.u1.e(A, barVar2);
                                            } else {
                                                kotlin.jvm.internal.Intrinsics.n("analytics");
                                                throw null;
                                            }
                                        }
                                        z = cVar instanceof w62.c;
                                        break;
                                    default:
                                        z = cVar instanceof w62.c;
                                        break;
                                }
                            case -1630354617:
                                if (stringExtra.equals("com.truecaller.intent.action.BIZ_CALL_ME_BACK")) {
                                    s62.d dVar = this.e0;
                                    if (dVar != null) {
                                        ((s62.f) dVar).b(12345, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "missedCall", "notificationMissedCall");
                                        u0();
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("notificationManager");
                                        throw null;
                                    }
                                }
                                if (!(cVar instanceof w62.b)) {
                                }
                                java.lang.String str22 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        break;
                                    case -1630354617:
                                        break;
                                    case -1187399354:
                                        break;
                                    case 1370363729:
                                        break;
                                }
                            case -1187399354:
                                if (stringExtra.equals("com.truecaller.intent.action.BATTERY_OPTIMIZATIONS")) {
                                    s62.d dVar2 = this.e0;
                                    if (dVar2 != null) {
                                        ((s62.f) dVar2).a(2131366134, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationIgnoreBatteryOptimizations");
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("notificationManager");
                                        throw null;
                                    }
                                }
                                if (!(cVar instanceof w62.b)) {
                                }
                                java.lang.String str222 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        break;
                                    case -1630354617:
                                        break;
                                    case -1187399354:
                                        break;
                                    case 1370363729:
                                        break;
                                }
                            case 23772491:
                                if (stringExtra.equals("com.truecaller.intent.action.SMS")) {
                                    u0();
                                }
                                if (!(cVar instanceof w62.b)) {
                                }
                                java.lang.String str2222 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        break;
                                    case -1630354617:
                                        break;
                                    case -1187399354:
                                        break;
                                    case 1370363729:
                                        break;
                                }
                            case 736458892:
                                if (stringExtra.equals("com.truecaller.intent.action.CALL")) {
                                    u0();
                                    java.lang.String stringExtra3 = getIntent().getStringExtra("reminder-id");
                                    if (stringExtra3 != null) {
                                        qc3.bar barVar3 = this.h0;
                                        if (barVar3 != null) {
                                            ((com.truecaller.calling.missedcallreminder.baz) barVar3.get()).b(stringExtra3);
                                        } else {
                                            kotlin.jvm.internal.Intrinsics.n("missedCallReminderManager");
                                            throw null;
                                        }
                                    }
                                    android.content.Intent intent2 = getIntent();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
                                    java.lang.String stringExtra4 = intent2.getStringExtra("number");
                                    android.content.Intent intent3 = getIntent();
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
                                    java.lang.String stringExtra5 = intent3.getStringExtra("analytics-context");
                                    if (stringExtra5 == null) {
                                        stringExtra5 = "notification";
                                    }
                                    boolean booleanExtra = getIntent().getBooleanExtra("region-parser", false);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra5, "analyticsContext");
                                    android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded showOnBoarded = com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOnBoarded, "callContextOption");
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.NOTIFICATION;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions callOptions = new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(stringExtra4, stringExtra5, stringExtra5, stringExtra4, (java.lang.Integer) null, false, false, false, false, (android.telecom.PhoneAccountHandle) null, booleanExtra, showOnBoarded, (com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions) null, callSource);
                                    qc3.bar barVar4 = this.g0;
                                    if (barVar4 != null) {
                                        ((nv0.c) barVar4.get()).d(callOptions);
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("initiateCallHelper");
                                        throw null;
                                    }
                                }
                                if (!(cVar instanceof w62.b)) {
                                }
                                java.lang.String str22222 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        break;
                                    case -1630354617:
                                        break;
                                    case -1187399354:
                                        break;
                                    case 1370363729:
                                        break;
                                }
                            default:
                                if (!(cVar instanceof w62.b)) {
                                }
                                java.lang.String str222222 = "Opened";
                                switch (stringExtra.hashCode()) {
                                    case -1930142778:
                                        break;
                                    case -1630354617:
                                        break;
                                    case -1187399354:
                                        break;
                                    case 1370363729:
                                        break;
                                }
                        }
                    }
                    cVar = null;
                    if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                    }
                    switch (stringExtra.hashCode()) {
                        case -1930142778:
                            break;
                        case -1630354617:
                            break;
                        case -1187399354:
                            break;
                        case 23772491:
                            break;
                        case 736458892:
                            break;
                    }
                case -1630354617:
                    str = stringExtra2;
                    if (stringExtra.equals("com.truecaller.intent.action.BIZ_CALL_ME_BACK")) {
                        nd1.bar barVar5 = this.m0;
                        if (barVar5 != null) {
                            android.content.Intent intent4 = getIntent();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
                            android.content.Intent addFlags = barVar5.a(this, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$ContactData(null, null, null, intent4.getStringExtra("number"), null, null, 55, null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationCallMeBack, null, 0, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Action.ShowCallMeBackBottomSheet.INSTANCE, 12, null)).addFlags(536870912).addFlags(67108864);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags, "addFlags(...)");
                            cVar = new w62.b(addFlags);
                            if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                            }
                            switch (stringExtra.hashCode()) {
                                case -1930142778:
                                    break;
                                case -1630354617:
                                    break;
                                case -1187399354:
                                    break;
                                case 23772491:
                                    break;
                                case 736458892:
                                    break;
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
                            throw null;
                        }
                    }
                    cVar = null;
                    if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                    }
                    switch (stringExtra.hashCode()) {
                        case -1930142778:
                            break;
                        case -1630354617:
                            break;
                        case -1187399354:
                            break;
                        case 23772491:
                            break;
                        case 736458892:
                            break;
                    }
                case -1187399354:
                    str = stringExtra2;
                    if (stringExtra.equals("com.truecaller.intent.action.BATTERY_OPTIMIZATIONS")) {
                        cVar = new w62.c(100, ak.r0.Z(this, false));
                        if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                        }
                        switch (stringExtra.hashCode()) {
                            case -1930142778:
                                break;
                            case -1630354617:
                                break;
                            case -1187399354:
                                break;
                            case 23772491:
                                break;
                            case 736458892:
                                break;
                        }
                    }
                    cVar = null;
                    if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                    }
                    switch (stringExtra.hashCode()) {
                        case -1930142778:
                            break;
                        case -1630354617:
                            break;
                        case -1187399354:
                            break;
                        case 23772491:
                            break;
                        case 736458892:
                            break;
                    }
                case 23772491:
                    str = stringExtra2;
                    if (stringExtra.equals("com.truecaller.intent.action.SMS")) {
                        android.content.Intent intent5 = getIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent5, "getIntent(...)");
                        android.content.Intent addFlags2 = new android.content.Intent("android.intent.action.SENDTO", android.net.Uri.fromParts("smsto", intent5.getStringExtra("number"), null)).addFlags(268435456);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags2, "addFlags(...)");
                        cVar = new w62.b(addFlags2);
                        if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                        }
                        switch (stringExtra.hashCode()) {
                            case -1930142778:
                                break;
                            case -1630354617:
                                break;
                            case -1187399354:
                                break;
                            case 23772491:
                                break;
                            case 736458892:
                                break;
                        }
                    }
                    cVar = null;
                    if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                    }
                    switch (stringExtra.hashCode()) {
                        case -1930142778:
                            break;
                        case -1630354617:
                            break;
                        case -1187399354:
                            break;
                        case 23772491:
                            break;
                        case 736458892:
                            break;
                    }
                case 1370363729:
                    if (stringExtra.equals("com.truecaller.intent.action.SHARE")) {
                        str = stringExtra2;
                        android.content.Intent addFlags3 = t41.p.j(getString(2132018164), getString(2132018985), getString(2132018984), (android.net.Uri) null, (java.lang.String) null).addFlags(268435456);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addFlags3, "addFlags(...)");
                        cVar = new w62.b(addFlags3);
                        if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                        }
                        switch (stringExtra.hashCode()) {
                            case -1930142778:
                                break;
                            case -1630354617:
                                break;
                            case -1187399354:
                                break;
                            case 23772491:
                                break;
                            case 736458892:
                                break;
                        }
                    }
                    break;
                default:
                    str = stringExtra2;
                    cVar = null;
                    if (!stringExtra.equals("com.truecaller.intent.action.CALL")) {
                    }
                    switch (stringExtra.hashCode()) {
                        case -1930142778:
                            break;
                        case -1630354617:
                            break;
                        case -1187399354:
                            break;
                        case 23772491:
                            break;
                        case 736458892:
                            break;
                    }
            }
        } else {
            z = false;
        }
        if (!z) {
            finish();
        }
    }

    public final void t0(java.lang.String str, kotlin.jvm.functions.Function1 function1) {
        boolean z;
        com.truecaller.tcpermissions.PermissionPoller.Permission permission;
        if (str.equals("BatteryOptimization")) {
            u03.c cVar = this.i0;
            if (cVar != null) {
                z = cVar.t();
            } else {
                kotlin.jvm.internal.Intrinsics.n("deviceInfoUtil");
                throw null;
            }
        } else if (str.equals("DrawOnTop")) {
            u03.z zVar = this.j0;
            if (zVar != null) {
                z = zVar.j();
            } else {
                kotlin.jvm.internal.Intrinsics.n("permissionUtil");
                throw null;
            }
        } else {
            z = false;
        }
        if (z) {
            if (str.equals("BatteryOptimization")) {
                permission = com.truecaller.tcpermissions.PermissionPoller.Permission.BATTERY_OPTIMISATIONS;
            } else if (str.equals("DrawOnTop")) {
                permission = com.truecaller.tcpermissions.PermissionPoller.Permission.DRAW_OVERLAY;
            } else {
                permission = null;
            }
            if (permission != null) {
                u72.bar barVar = this.k0;
                if (barVar != null) {
                    barVar.a(permission);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("permissionsListener");
                    throw null;
                }
            }
        }
        function1.invoke(java.lang.Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0() {
        long longExtra = getIntent().getLongExtra("call-log-id", -1L);
        java.lang.Long valueOf = java.lang.Long.valueOf(longExtra);
        if (longExtra < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            qc3.bar barVar = this.f0;
            if (barVar != null) {
                ((su0.i) ((xd0.qux) barVar.get()).a()).a(longValue);
            } else {
                kotlin.jvm.internal.Intrinsics.n("callHistoryManagerLegacy");
                throw null;
            }
        }
    }
}
