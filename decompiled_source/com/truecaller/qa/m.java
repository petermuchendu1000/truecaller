package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class m extends kf.b {
    public final /* synthetic */ com.truecaller.qa.QMActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.truecaller.qa.QMActivity qMActivity, java.lang.String... strArr) {
        super(qMActivity, strArr);
        this.f = qMActivity;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.truecaller.qa.QMActivity, android.content.Context, androidx.appcompat.app.AppCompatActivity] */
    public final void s(java.util.LinkedHashMap linkedHashMap) {
        long longValue;
        if (!linkedHashMap.isEmpty()) {
            long[] jArr = new long[linkedHashMap.size()];
            java.util.Iterator it = linkedHashMap.keySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                java.lang.Long l = ((com.truecaller.notifications.enhancing.SourcedContact) it.next()).c;
                int i2 = i + 1;
                if (l == null) {
                    longValue = 0;
                } else {
                    longValue = l.longValue();
                }
                jArr[i] = longValue;
                i = i2;
            }
            android.content.Intent intent = new android.content.Intent("com.truecaller.ACTION_ENHANCED_NOTIFICATION_DELETED");
            intent.putExtra("ids", jArr);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(linkedHashMap.keySet());
            ?? r7 = this.f;
            android.content.Intent t0 = com.truecaller.notifications.enhancing.SourcedContactListActivity.t0((android.content.Context) r7, linkedHashSet);
            android.content.res.Resources resources = r7.getResources();
            java.lang.String quantityString = resources.getQuantityString(2131886096, linkedHashMap.size(), java.lang.Integer.valueOf(linkedHashMap.size()));
            java.lang.String quantityString2 = resources.getQuantityString(2131886096, linkedHashMap.size(), java.lang.Integer.valueOf(linkedHashMap.size()));
            java.lang.String string = resources.getString(2132017945);
            f6.f0 f0Var = new f6.f0((android.content.Context) r7, r7.L0.o("miscellaneous_channel"));
            f0Var.u(quantityString);
            f0Var.j(quantityString2);
            f0Var.i(string);
            s62.f fVar = r7.L0;
            com.truecaller.analytics.common.event.PushNotificationSource pushNotificationSource = com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal;
            android.app.PendingIntent k = fVar.k(pushNotificationSource.getType(), 2131366093, 335544320, (android.content.Context) r7, intent, "enhanceNotification");
            android.app.Notification notification = f0Var.Q;
            notification.deleteIntent = k;
            notification.icon = 2131232902;
            f0Var.f(true);
            f0Var.g = r7.L0.k(pushNotificationSource.getType(), 2131366094, 335544320, (android.content.Context) r7, t0, "enhanceNotification");
            f0Var.D = r7.getColor(2131099683);
            r7.L0.v(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_EVENT_ID_ERROR_VALUE, f0Var.d(), pushNotificationSource.getType(), "enhanceNotification");
        }
    }
}
