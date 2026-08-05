package com.truecaller.callerid;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/callerid/PostCallActivity;", "Landroid/app/Activity;", "<init>", "()V", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostCallActivity extends android.app.Activity {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/callerid/PostCallActivity$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public interface bar {
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        try {
            android.content.Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            gu0.s sVar = (gu0.s) ((tx.w) ((com.truecaller.callerid.PostCallActivity.bar) f40.d0.z(applicationContext, com.truecaller.callerid.PostCallActivity.bar.class))).H.b.T3.get();
            android.content.Context applicationContext2 = getApplicationContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            sVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
            fg3.h0.J(sVar.c, sVar.a, (fg3.f0) null, new gu0.r(sVar, applicationContext2, intent, (df3.bar) null, 0), 2);
        } catch (java.lang.Exception e) {
            o82.a.B("Error handling phoneState", e);
        }
        finish();
    }
}
