package com.truecaller.widget_tc.presentation.receiver;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TrueCallerWidgetReceiver extends android.appwidget.AppWidgetProvider {
    public final ng3.b a = fg3.r0.a;
    public final h82.baz b = new h82.baz(18);

    public static final void a(com.truecaller.widget_tc.presentation.receiver.TrueCallerWidgetReceiver trueCallerWidgetReceiver, fg3.e0 e0Var, android.content.Context context) {
        fg3.h0.J(e0Var, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new go2.c1(context, trueCallerWidgetReceiver, (df3.bar) null, 20), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int i, android.os.Bundle bundle) {
        fe0.m.u(this, this.a, new b12.r(this, context, i, bundle, (df3.bar) null, 9));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(android.content.Context context, int[] iArr) {
        fe0.m.u(this, this.a, new f10.b(this, context, iArr, (df3.bar) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0088 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:21:0x0045, B:25:0x004e, B:26:0x0056, B:27:0x0057, B:28:0x005f, B:29:0x0060, B:32:0x00ab, B:34:0x0076, B:36:0x0088, B:38:0x0093, B:39:0x009f, B:41:0x009b, B:42:0x00a3, B:43:0x00aa, B:44:0x006b), top: B:4:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:21:0x0045, B:25:0x004e, B:26:0x0056, B:27:0x0057, B:28:0x005f, B:29:0x0060, B:32:0x00ab, B:34:0x0076, B:36:0x0088, B:38:0x0093, B:39:0x009f, B:41:0x009b, B:42:0x00a3, B:43:0x00aa, B:44:0x006b), top: B:4:0x0009 }] */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Context context2;
        java.lang.String canonicalName;
        int[] appWidgetIds;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        try {
            java.lang.String action = intent.getAction();
            try {
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -19011148) {
                        if (hashCode != 649033583) {
                            if (hashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                                java.lang.String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                                if (stringExtra != null) {
                                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                                    if (intExtra != -1) {
                                        fe0.m.u(this, this.a, new b12.r(this, context, intExtra, stringExtra, (df3.bar) null, 10));
                                        return;
                                    }
                                    throw new java.lang.IllegalStateException("Intent is missing AppWidgetId extra");
                                }
                                throw new java.lang.IllegalStateException("Intent is missing ActionKey extra");
                            }
                        } else {
                            context2 = context;
                            if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                                super.onReceive(context2, intent);
                            }
                            android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context2);
                            java.lang.String packageName = context2.getPackageName();
                            canonicalName = getClass().getCanonicalName();
                            if (canonicalName == null) {
                                android.content.ComponentName componentName = new android.content.ComponentName(packageName, canonicalName);
                                if (intent.hasExtra("appWidgetIds")) {
                                    appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                                    kotlin.jvm.internal.Intrinsics.d(appWidgetIds);
                                } else {
                                    appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                                }
                                onUpdate(context2, appWidgetManager, appWidgetIds);
                                return;
                            }
                            throw new java.lang.IllegalStateException("no canonical name");
                        }
                    } else {
                        context2 = context;
                        if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                            super.onReceive(context2, intent);
                        }
                        android.appwidget.AppWidgetManager appWidgetManager2 = android.appwidget.AppWidgetManager.getInstance(context2);
                        java.lang.String packageName2 = context2.getPackageName();
                        canonicalName = getClass().getCanonicalName();
                        if (canonicalName == null) {
                        }
                    }
                }
                context2 = context;
                super.onReceive(context2, intent);
            } catch (java.lang.Throwable unused) {
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] iArr) {
        fe0.m.u(this, this.a, new gu0.r(this, context, iArr, (df3.bar) null, 6));
    }
}
