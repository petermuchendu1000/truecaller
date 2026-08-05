package com.truecaller.messaging.insights;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/messaging/insights/InsightsNotificationTrampolineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ge0/i", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsNotificationTrampolineActivity extends com.truecaller.messaging.insights.Hilt_InsightsNotificationTrampolineActivity {
    public static final /* synthetic */ int j0 = 0;
    public zr1.g d0;
    public hu1.qux e0;
    public r31.bar f0;
    public s62.d g0;
    public hy1.f0 h0;
    public com.truecaller.ui.b0 i0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x003f, code lost:
    
        if (r0.equals("com.truecaller.insights.notifications.DIAL") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0046, code lost:
    
        if (r0.equals("com.truecaller.insights.notifications.SMART_NOTIFICATION_DEEPLINK") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x004d, code lost:
    
        if (r0.equals("com.truecaller.insights.notifications.WEB") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r0.equals("com.truecaller.insights.notifications.VIEW_TRANSACTIONS") != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        r6 = gj.m.m(r6).e();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, android.content.Intent] */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.content.Intent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.truecaller.messaging.insights.InsightsNotificationTrampolineActivity, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.truecaller.messaging.insights.InsightsNotificationTrampolineActivity, android.app.Activity] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.content.Context] */
    @Override // com.truecaller.messaging.insights.Hilt_InsightsNotificationTrampolineActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.Throwable th;
        ?? r1;
        vu1.baz bazVar;
        java.lang.String str2;
        ?? r13;
        ?? r0;
        java.lang.String stringExtra;
        java.lang.Throwable th2;
        com.truecaller.messaging.data.types.QuickAction quickAction;
        ?? r14 = this;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate((android.app.Activity) r14);
        super.onCreate(bundle);
        java.lang.String stringExtra2 = r14.getIntent().getStringExtra("notification_name");
        java.lang.String str3 = "<this>";
        if (stringExtra2 == null || bundle != null) {
            str = "getIntent(...)";
            th = null;
            r1 = r14;
        } else {
            android.content.Intent intent = r14.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            switch (stringExtra2.hashCode()) {
                case -114983005:
                    break;
                case 634502419:
                    break;
                case 729932001:
                    break;
                case 731324126:
                    break;
                default:
                    bazVar = null;
                    break;
            }
            if (bazVar != null) {
                zr1.g gVar = r14.d0;
                if (gVar != null) {
                    gVar.e(bazVar);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("analyticsManager");
                    throw null;
                }
            }
            android.content.Intent intent2 = r14.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
            int hashCode = stringExtra2.hashCode();
            if (hashCode != 483512802) {
                if (hashCode != 634502419) {
                    if (hashCode == 731324126 && stringExtra2.equals("com.truecaller.insights.notifications.VIEW_TRANSACTIONS")) {
                        android.content.Context applicationContext = r14.getApplicationContext();
                        com.truecaller.ui.b0 b0Var = r14.i0;
                        if (b0Var != null) {
                            kotlin.jvm.internal.Intrinsics.d(applicationContext);
                            android.content.Intent b = b0Var.b(applicationContext, "notificationIncomingMessage", com.truecaller.messaging.data.types.InboxTab.BUSINESS);
                            android.content.Intent intent3 = new android.content.Intent(applicationContext, (java.lang.Class<?>) com.truecaller.messaging.businesshome.presentation.ui.FilteredConversationsActivity.class);
                            com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType = com.truecaller.messaging.messaginglist.v2.model.MessageFilterType.TRANSACTION;
                            kotlin.jvm.internal.Intrinsics.e(messageFilterType, "null cannot be cast to non-null type android.os.Parcelable");
                            intent3.putExtra("EXTRA_FILTER_TYPE", (android.os.Parcelable) messageFilterType);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(b);
                            arrayList.add(intent3);
                            if (!arrayList.isEmpty()) {
                                android.content.Intent[] intentArr = (android.content.Intent[]) arrayList.toArray(new android.content.Intent[0]);
                                intentArr[0] = new android.content.Intent(intentArr[0]).addFlags(268484608);
                                applicationContext.startActivities(intentArr, null);
                            } else {
                                throw new java.lang.IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                            }
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                            throw null;
                        }
                    }
                } else if (stringExtra2.equals("com.truecaller.insights.notifications.SMART_NOTIFICATION_DEEPLINK")) {
                    android.os.Bundle bundleExtra = intent2.getBundleExtra("extra_action_info");
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                        if (bundleExtra != null) {
                            quickAction = (com.truecaller.messaging.data.types.QuickAction) f2.e.q(bundleExtra);
                            if (quickAction != null) {
                                new ex1.k(quickAction).c();
                            }
                        }
                        quickAction = null;
                        if (quickAction != null) {
                        }
                    } else {
                        if (bundleExtra != null) {
                            quickAction = (com.truecaller.messaging.data.types.QuickAction) bundleExtra.getParcelable("extra_quick_action");
                            if (quickAction != null) {
                            }
                        }
                        quickAction = null;
                        if (quickAction != null) {
                        }
                    }
                }
            } else if (stringExtra2.equals("com.truecaller.insights.notifications.SMART_NOTIFICATION_PROMO")) {
                f13.b bVar = r14.f0;
                if (bVar != null) {
                    bVar.k("smart_notifications_clicked", true);
                    android.content.Context applicationContext2 = r14.getApplicationContext();
                    f6.k1 k1Var = new f6.k1(applicationContext2);
                    com.truecaller.ui.b0 b0Var2 = r14.i0;
                    if (b0Var2 != null) {
                        kotlin.jvm.internal.Intrinsics.d(applicationContext2);
                        android.content.Intent b2 = b0Var2.b(applicationContext2, "notificationIncomingMessage", com.truecaller.messaging.data.types.InboxTab.BUSINESS);
                        java.util.ArrayList arrayList2 = k1Var.a;
                        arrayList2.add(b2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k1Var, "addNextIntent(...)");
                        android.content.Intent intent4 = new android.content.Intent(applicationContext2, (java.lang.Class<?>) com.truecaller.messaging.conversation.ConversationActivity.class);
                        com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata smartNotificationMetadata = (com.truecaller.insights.models.smartnotifications.SmartNotificationMetadata) intent2.getParcelableExtra("extra_smart_notif_metadata");
                        str = "getIntent(...)";
                        th = null;
                        long longExtra = intent2.getLongExtra("extra_conversation_id", -1L);
                        if (longExtra == -1) {
                            str2 = "<this>";
                        } else {
                            str2 = "<this>";
                            long longExtra2 = intent2.getLongExtra("extra_message_id", -1L);
                            if (longExtra2 != -1) {
                                intent4.putExtra("message_id", longExtra2);
                            }
                            intent4.putExtra("conversation_id", longExtra);
                            intent4.putExtra("launch_source", "notificationSmartCards");
                            android.content.Intent intent5 = new android.content.Intent(applicationContext2, (java.lang.Class<?>) com.truecaller.insights.ui.semicard.view.WhatIsSmartSmsActivity.class);
                            if (smartNotificationMetadata != null) {
                                intent5.putExtra("sender_id", smartNotificationMetadata.getNormalizedSenderId());
                                intent5.putExtra("is_im", smartNotificationMetadata.isIm());
                            }
                            arrayList2.add(intent4);
                            arrayList2.add(intent5);
                            k1Var.d();
                        }
                        if (!stringExtra2.equals("com.truecaller.insights.notifications.WEB")) {
                            java.lang.String stringExtra3 = intent2.getStringExtra("extra_web_url");
                            if (stringExtra3 == null || stringExtra3.length() == 0) {
                                th2 = th;
                            } else {
                                ?? k = t41.p.k(stringExtra3);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) k, "getViewIntent(...)");
                                k.setFlags(268435456);
                                th2 = k;
                            }
                            r13 = this;
                            r0 = th2;
                        } else if (stringExtra2.equals("com.truecaller.insights.notifications.DIAL") && (stringExtra = intent2.getStringExtra("extra_number")) != null && stringExtra.length() != 0) {
                            ?? r15 = this;
                            android.content.Intent g = t41.p.g((android.content.Context) r15, stringExtra);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g, "getDialIntentFromNumber(...)");
                            g.setFlags(268435456);
                            r0 = g;
                            r13 = r15;
                        } else {
                            r13 = this;
                            r0 = th;
                        }
                        if (r0 != 0) {
                            str3 = str2;
                            r1 = r13;
                        } else {
                            str3 = str2;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r13, str3);
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r0, "intent");
                            try {
                                r13.startActivity(r0);
                                r1 = r13;
                            } catch (android.content.ActivityNotFoundException e) {
                                kotlin.c.b(e);
                                r1 = r13;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("homescreenRouter");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("coreSettings");
                    throw null;
                }
            }
            str2 = "<this>";
            str = "getIntent(...)";
            th = null;
            if (!stringExtra2.equals("com.truecaller.insights.notifications.WEB")) {
            }
            if (r0 != 0) {
            }
        }
        android.content.Intent intent6 = r1.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent6, str);
        int intExtra = intent6.getIntExtra("extra_notification_id", -1);
        if (intExtra != -1) {
            hu1.qux quxVar = r1.e0;
            if (quxVar != null) {
                ((hu1.d) quxVar).f(intExtra);
                s62.d dVar = r1.g0;
                if (dVar != null) {
                    ((s62.f) dVar).a(intExtra, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "notificationSmartCards");
                    hy1.f0 f0Var = r1.h0;
                    if (f0Var != null) {
                        f0Var.t(intExtra);
                        android.content.Context applicationContext3 = r1.getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "getApplicationContext(...)");
                        ak.r0.l(applicationContext3);
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("smsIdBannerManager");
                        throw th;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("notificationManager");
                    throw th;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("smartNotificationManager");
                throw th;
            }
        }
        android.content.Intent intent7 = r1.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent7, str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent7, str3);
        android.os.Bundle extras = intent7.getExtras();
        if (extras != null) {
            java.util.Iterator<java.lang.String> it = extras.keySet().iterator();
            while (it.hasNext()) {
                intent7.removeExtra(it.next());
            }
        }
        r1.finish();
    }
}
