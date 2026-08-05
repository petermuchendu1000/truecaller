package com.truecaller.tagger.impl;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AppUpdateReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public r31.bar c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (r31.bar) ((mw2.bar) o40.bar.k(context)).H.b.a.q1.get();
                        this.a = true;
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        android.content.Context context2;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(str)) {
            if (context != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = null;
            }
            if (context2 instanceof r11.bar) {
                f13.b bVar = this.c;
                if (bVar != null) {
                    if (bVar.e("tag_update_version_key", 0) < 1) {
                        ne0.baz.v("tagsEntityTag", (java.lang.String) null);
                        f13.b bVar2 = this.c;
                        if (bVar2 != null) {
                            bVar2.l("tag_update_version_key", 1);
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("coreSettings");
                            throw null;
                        }
                    }
                    od.n s = t.c.s(context, "context", context, "context", context);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(s, "getInstance(...)");
                    fe0.m.D(s, "AvailableTagsDownloadWorkAction", context, (kotlin.Pair) null, (nd.g) null, 12);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("coreSettings");
                throw null;
            }
        }
    }
}
