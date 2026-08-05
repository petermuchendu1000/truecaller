package com.truecaller.familyprotect.domain.status.activity.receiver;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UserActivityTransitionBroadcastReceiver extends android.content.BroadcastReceiver {
    public volatile boolean a = false;
    public final java.lang.Object b = new java.lang.Object();
    public yl1.a c;

    public final void a(android.content.Context context, android.content.Intent intent) {
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        if (!this.a) {
            synchronized (this.b) {
                try {
                    if (!this.a) {
                        this.c = (yl1.a) ((yl1.b) o40.bar.k(context)).H.b.a.T6.get();
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelable a;
        com.google.android.gms.location.ActivityTransitionResult activityTransitionResult;
        com.truecaller.analytics.technical.AppStartTracker.onBroadcastReceive(this, context, intent);
        a(context, intent);
        if (intent != null) {
            yl1.a aVar = this.c;
            if (aVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                android.os.Parcelable.Creator creator = com.google.android.gms.location.ActivityTransitionResult.CREATOR;
                if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT")) {
                    if (!intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT")) {
                        activityTransitionResult = null;
                    } else {
                        android.os.Parcelable.Creator creator2 = com.google.android.gms.location.ActivityTransitionResult.CREATOR;
                        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
                        if (byteArrayExtra == null) {
                            a = null;
                        } else {
                            a = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.a(byteArrayExtra, creator2);
                        }
                        activityTransitionResult = (com.google.android.gms.location.ActivityTransitionResult) a;
                    }
                    fg3.h0.J(aVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new f10.b(aVar, activityTransitionResult, (df3.bar) null, 7), 3);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("detectedActivityHandler");
            throw null;
        }
    }
}
