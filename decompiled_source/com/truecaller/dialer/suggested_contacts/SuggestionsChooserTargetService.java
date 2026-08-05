package com.truecaller.dialer.suggested_contacts;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SuggestionsChooserTargetService extends android.service.chooser.ChooserTargetService implements fg3.e0, bd3.qux {
    public volatile yc3.g a;
    public final java.lang.Object b = new java.lang.Object();
    public boolean c = false;
    public final fg3.r1 d = fg3.h0.c();
    public kotlin.coroutines.CoroutineContext e;
    public kotlin.coroutines.CoroutineContext f;
    public we1.a g;

    public final java.lang.Object X3() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new yc3.g(this);
                    }
                } finally {
                }
            }
        }
        return this.a.X3();
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.e;
        if (coroutineContext != null) {
            return coroutineContext.plus(this.d);
        }
        kotlin.jvm.internal.Intrinsics.n("uiContext");
        throw null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        com.truecaller.analytics.technical.AppStartTracker.onServiceCreate(this);
        if (!this.c) {
            this.c = true;
            tx.w wVar = ((af1.a) X3()).b;
            this.e = (kotlin.coroutines.CoroutineContext) wVar.V1.get();
            this.f = (kotlin.coroutines.CoroutineContext) wVar.P.get();
            this.g = wVar.b.Z3();
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.d.cancel((java.util.concurrent.CancellationException) null);
        super.onDestroy();
    }

    @Override // android.service.chooser.ChooserTargetService
    public final java.util.List onGetChooserTargets(android.content.ComponentName componentName, android.content.IntentFilter intentFilter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "targetActivityName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentFilter, "matchedFilter");
        try {
            java.util.ArrayList arrayList = (java.util.ArrayList) fg3.h0.O(kotlin.coroutines.d.a, new af1.qux(this, null, 2));
            if (arrayList != null) {
                return arrayList;
            }
            return kotlin.collections.h0.a;
        } catch (java.util.concurrent.CancellationException unused) {
            return kotlin.collections.h0.a;
        }
    }
}
