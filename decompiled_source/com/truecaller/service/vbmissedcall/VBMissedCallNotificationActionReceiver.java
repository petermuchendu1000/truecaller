package com.truecaller.service.vbmissedcall;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VBMissedCallNotificationActionReceiver extends com.truecaller.messaging.notifications.i {
    public static final /* synthetic */ int k = 0;
    public n11.l d;
    public nv0.c e;
    public nd1.bar f;
    public s62.d g;
    public su0.b h;
    public kotlin.coroutines.CoroutineContext i;
    public iq2.c j;

    public VBMissedCallNotificationActionReceiver() {
        super(2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r8.d(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (fg3.h0.W(r8.a, new su0.d(r8, r9, (df3.bar) null, 1), r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object e(com.truecaller.service.vbmissedcall.VBMissedCallNotificationActionReceiver vBMissedCallNotificationActionReceiver, com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, ff3.qux quxVar) {
        hq2.k kVar;
        int i;
        if (quxVar instanceof hq2.k) {
            kVar = (hq2.k) quxVar;
            int i2 = kVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = kVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = kVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                od.p.E(obj);
                long j = vBMissedCallNotificationExtras.c;
                java.lang.String str = vBMissedCallNotificationExtras.e;
                if (str.length() == 0) {
                    if (j != -1) {
                        su0.f fVar = vBMissedCallNotificationActionReceiver.h;
                        if (fVar != null) {
                            kVar.z = 2;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("historyManager");
                            throw null;
                        }
                    }
                    return kotlin.Unit.a;
                }
                su0.f fVar2 = vBMissedCallNotificationActionReceiver.h;
                if (fVar2 != null) {
                    kVar.z = 1;
                    su0.f fVar3 = fVar2;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("historyManager");
                    throw null;
                }
                return barVar;
            }
        }
        kVar = new hq2.k(vBMissedCallNotificationActionReceiver, quxVar);
        java.lang.Object obj2 = kVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = kVar.z;
        if (i == 0) {
        }
    }

    public final void f(android.content.Context context, com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId vBMissedCallNotificationAnalyticConfigs$ViewId) {
        g(vBMissedCallNotificationExtras, vBMissedCallNotificationAnalyticConfigs$ViewId);
        java.lang.String str = vBMissedCallNotificationExtras.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contactNumber");
        int abs = (java.lang.Math.abs(str.hashCode()) % com.unity3d.services.UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS) + com.unity3d.services.UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        s62.f fVar = this.g;
        if (fVar != null) {
            fVar.b(abs, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "VBMissedCallNotification", "notificationMissedCallVB");
            ak.r0.l(context);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId vBMissedCallNotificationAnalyticConfigs$ViewId) {
        kotlin.coroutines.CoroutineContext coroutineContext = this.i;
        if (coroutineContext != null) {
            yy.baz.s(this, coroutineContext, new gh1.m(vBMissedCallNotificationAnalyticConfigs$ViewId, this, vBMissedCallNotificationExtras, (df3.bar) null, 4));
        } else {
            kotlin.jvm.internal.Intrinsics.n("asyncIoCoroutineContext");
            throw null;
        }
    }

    public final void h(android.content.Context context, com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action action, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId vBMissedCallNotificationAnalyticConfigs$ViewId, boolean z) {
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras extras = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, vBMissedCallNotificationExtras.e, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 55, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationVBMissedCall, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 0, action, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        nd1.bar barVar = this.f;
        if (barVar != null) {
            context.startActivity(barVar.a(context, extras).addFlags(268435456));
            if (z) {
                f(context, vBMissedCallNotificationExtras, vBMissedCallNotificationAnalyticConfigs$ViewId);
                return;
            } else {
                g(vBMissedCallNotificationExtras, vBMissedCallNotificationAnalyticConfigs$ViewId);
                return;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0042. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action;
        com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        super.onReceive(context, intent);
        if (context != null && intent != null && (action = intent.getAction()) != null) {
            "Received action: ".concat(action);
            n11.o oVar = this.d;
            if (oVar != null) {
                if (oVar.j() && (vBMissedCallNotificationExtras = (com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras) ((android.os.Parcelable) g6.b.g(intent, "intent-data", com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras.class))) != null) {
                    switch (action.hashCode()) {
                        case -1215713304:
                            if (action.equals("com.truecaller.intent.action.VB_CLEAR_MISSED_CALLS")) {
                                g(vBMissedCallNotificationExtras, null);
                                return;
                            }
                            "Unknown action: ".concat(action);
                            return;
                        case -1191833084:
                            if (action.equals("com.truecaller.intent.action.ACTION_NOTIFICATION_BODY_CLICK")) {
                                h(context, vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.None.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.NOTIFICATION_BODY, false);
                                return;
                            }
                            "Unknown action: ".concat(action);
                            return;
                        case -1076509734:
                            if (action.equals("com.truecaller.intent.action.VB_MCN_SCHEDULE_CALL")) {
                                h(context, vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.ShowCallMeBackBottomSheet.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.SCHEDULE_NOW_CTA, true);
                                return;
                            }
                            "Unknown action: ".concat(action);
                            return;
                        case 139521262:
                            if (action.equals("com.truecaller.intent.action.VB_MCN_VIEW_BUSINESS")) {
                                h(context, vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.None.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.VIEW_BUSINESS_PAGE_CTA, true);
                                return;
                            }
                            "Unknown action: ".concat(action);
                            return;
                        case 910665729:
                            if (action.equals("com.truecaller.intent.action.VB_MCN_CALL_NOW")) {
                                java.lang.String str = vBMissedCallNotificationExtras.f;
                                if (str != null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationMissedCallVB", "analyticsContext");
                                    android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded showOnBoarded = com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded.a;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOnBoarded, "callContextOption");
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.NOTIFICATION_VB_MISSED_CALL;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
                                    com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions callOptions = new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(str, "notificationMissedCallVB", "notificationMissedCallVB", str, (java.lang.Integer) null, false, false, false, true, (android.telecom.PhoneAccountHandle) null, false, showOnBoarded, (com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions) null, callSource);
                                    nv0.l lVar = this.e;
                                    if (lVar != null) {
                                        lVar.d(callOptions);
                                        f(context, vBMissedCallNotificationExtras, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.CALL_NOW_CTA);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.Intrinsics.n("initiateCallHelper");
                                        throw null;
                                    }
                                }
                                return;
                            }
                            "Unknown action: ".concat(action);
                            return;
                        default:
                            "Unknown action: ".concat(action);
                            return;
                    }
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("accountManager");
            throw null;
        }
    }
}
