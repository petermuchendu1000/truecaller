package com.truecaller.service.vbmissedcall;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/service/vbmissedcall/VBMissedCallNotificationTrampolineActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VBMissedCallNotificationTrampolineActivity extends com.truecaller.service.vbmissedcall.Hilt_VBMissedCallNotificationTrampolineActivity {
    public static final /* synthetic */ int k0 = 0;
    public s62.d d0;
    public qc3.bar e0;
    public nd1.bar f0;
    public su0.b g0;
    public fg3.e0 h0;
    public kotlin.coroutines.CoroutineContext i0;
    public iq2.c j0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.service.vbmissedcall.Hilt_VBMissedCallNotificationTrampolineActivity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.Intent t0;
        android.content.Intent intent;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.Intent intent2 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent2, "getIntent(...)");
        java.lang.String stringExtra = intent2.getStringExtra("notification-name");
        android.content.Intent intent3 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent3, "getIntent(...)");
        intent3.removeExtra("notification-name");
        android.content.Intent intent4 = getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent4, "getIntent(...)");
        com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras = (com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras) ((android.os.Parcelable) g6.b.g(intent4, "intent-data", com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras.class));
        if (stringExtra != null && vBMissedCallNotificationExtras != null && bundle == null) {
            int hashCode = stringExtra.hashCode();
            if (hashCode != -1191833084) {
                if (hashCode != 1797506795) {
                    if (hashCode == 1843546831 && stringExtra.equals("com.truecaller.intent.action.ACTION_VIEW_BUSINESS_PAGE")) {
                        t0 = t0(vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.None.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.VIEW_BUSINESS_PAGE_CTA);
                        intent = t0;
                    }
                    "buildIntent: no subsequent intent for action=".concat(stringExtra);
                    intent = null;
                } else {
                    if (stringExtra.equals("com.truecaller.intent.action.ACTION_SCHEDULE_CALL")) {
                        t0 = t0(vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.ShowCallMeBackBottomSheet.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.SCHEDULE_NOW_CTA);
                        intent = t0;
                    }
                    "buildIntent: no subsequent intent for action=".concat(stringExtra);
                    intent = null;
                }
            } else {
                if (stringExtra.equals("com.truecaller.intent.action.ACTION_NOTIFICATION_BODY_CLICK")) {
                    t0 = t0(vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action.None.INSTANCE, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.NOTIFICATION_BODY);
                    intent = t0;
                }
                "buildIntent: no subsequent intent for action=".concat(stringExtra);
                intent = null;
            }
            long j = vBMissedCallNotificationExtras.c;
            java.lang.String str = vBMissedCallNotificationExtras.e;
            fg3.e0 e0Var = this.h0;
            if (e0Var != null) {
                kotlin.coroutines.CoroutineContext coroutineContext = this.i0;
                if (coroutineContext != null) {
                    fg3.h0.J(e0Var, coroutineContext, (fg3.f0) null, new b1.n2(str, this, j, (df3.bar) null, 17), 2);
                    int hashCode2 = stringExtra.hashCode();
                    if (hashCode2 != -76417831) {
                        if (hashCode2 == 1797506795 ? stringExtra.equals("com.truecaller.intent.action.ACTION_SCHEDULE_CALL") : hashCode2 == 1843546831 && stringExtra.equals("com.truecaller.intent.action.ACTION_VIEW_BUSINESS_PAGE")) {
                            u0(vBMissedCallNotificationExtras);
                        }
                    } else if (stringExtra.equals("com.truecaller.intent.action.ACTION_CALL")) {
                        u0(vBMissedCallNotificationExtras);
                        v0(vBMissedCallNotificationExtras, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId.CALL_NOW_CTA);
                        java.lang.String str2 = vBMissedCallNotificationExtras.f;
                        if (str2 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("notificationMissedCallVB", "analyticsContext");
                            android.os.Parcelable.Creator creator = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.CREATOR;
                            com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded showOnBoarded = com.truecaller.calling.initiate_call.InitiateCallHelper.CallContextOption.ShowOnBoarded.a;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showOnBoarded, "callContextOption");
                            com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource callSource = com.truecaller.calling.initiate_call.InitiateCallHelper.CallSource.NOTIFICATION_VB_MISSED_CALL;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callSource, "source");
                            com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions callOptions = new com.truecaller.calling.initiate_call.InitiateCallHelper.CallOptions(str2, "notificationMissedCallVB", "notificationMissedCallVB", str2, (java.lang.Integer) null, false, false, false, true, (android.telecom.PhoneAccountHandle) null, false, showOnBoarded, (com.truecaller.calling.initiate_call.InitiateCallHelper.DialAssistOptions) null, callSource);
                            qc3.bar barVar = this.e0;
                            if (barVar != null) {
                                ((nv0.c) barVar.get()).d(callOptions);
                            } else {
                                kotlin.jvm.internal.Intrinsics.n("initiateCallHelper");
                                throw null;
                            }
                        }
                    }
                    if (intent != null) {
                        startActivity(intent);
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.n("asyncIoCoroutineContext");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("applicationScope");
                throw null;
            }
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.content.Intent t0(com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Action action, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId vBMissedCallNotificationAnalyticConfigs$ViewId) {
        v0(vBMissedCallNotificationExtras, vBMissedCallNotificationAnalyticConfigs$ViewId);
        nd1.bar barVar = this.f0;
        if (barVar != null) {
            android.content.Intent a = barVar.a(this, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.ContactData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, vBMissedCallNotificationExtras.e, (com.truecaller.data.entity.Contact) null, (com.truecaller.data.entity.HistoryEvent) null, 55, (kotlin.jvm.internal.DefaultConstructorMarker) null), com.truecaller.detailsview.api.model.DetailsViewSource.NotificationVBMissedCall, (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder.HistoryEventData) null, 0, action, 12, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            a.addFlags(536870912);
            a.addFlags(67108864);
            return a;
        }
        kotlin.jvm.internal.Intrinsics.n("detailsViewIntentBuilder");
        throw null;
    }

    public final void u0(com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras) {
        java.lang.String str = vBMissedCallNotificationExtras.e;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "contactNumber");
        int abs = (java.lang.Math.abs(str.hashCode()) % com.unity3d.services.UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS) + com.unity3d.services.UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
        s62.f fVar = this.d0;
        if (fVar != null) {
            fVar.b(abs, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "VBMissedCallNotification", "notificationMissedCallVB");
        } else {
            kotlin.jvm.internal.Intrinsics.n("notificationManager");
            throw null;
        }
    }

    public final void v0(com.truecaller.service.vbmissedcall.VBMissedCallNotificationExtras vBMissedCallNotificationExtras, com.truecaller.service.vbmissedcall.analytics.VBMissedCallNotificationAnalyticConfigs$ViewId vBMissedCallNotificationAnalyticConfigs$ViewId) {
        iq2.c cVar = this.j0;
        if (cVar != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vBMissedCallNotificationExtras, "analyticsData");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vBMissedCallNotificationAnalyticConfigs$ViewId, "viewId");
            fg3.h0.J(cVar.c, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new hu1.b(cVar, vBMissedCallNotificationAnalyticConfigs$ViewId, vBMissedCallNotificationExtras, (df3.bar) null, 20), 3);
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("analytics");
        throw null;
    }
}
