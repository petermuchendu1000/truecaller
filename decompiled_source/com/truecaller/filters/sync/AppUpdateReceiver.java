package com.truecaller.filters.sync;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AppUpdateReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(str) && context != null) {
            od.n s = t.c.s(context, "context", context, "context", context);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s, "getInstance(...)");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("from_restore", "key");
            linkedHashMap.put("from_restore", java.lang.Boolean.FALSE);
            nd.g gVar = new nd.g(linkedHashMap);
            mf0.o.K(gVar);
            fe0.m.D(s, "CleanupFiltersWorkAction", context, (kotlin.Pair) null, gVar, 4);
        }
    }
}
