package com.truecaller.swish.deeplink;

@com.airbnb.deeplinkdispatch.DeepLink({"truecaller://swish"})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/swish/deeplink/SwishResultActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldw2/baz;", "<init>", "()V", "swish-integration_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SwishResultActivity extends com.truecaller.swish.deeplink.Hilt_SwishResultActivity implements dw2.baz {
    public dw2.qux d0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.truecaller.sdk.bar, dw2.qux] */
    @Override // com.truecaller.swish.deeplink.Hilt_SwishResultActivity
    public final void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        androidx.appcompat.app.AppCompatActivity appCompatActivity;
        android.os.Bundle extras;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        eo0.bar barVar = this.d0;
        java.lang.String str2 = null;
        if (barVar != null) {
            barVar.a = this;
            android.content.Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null) {
                str = extras.getString("result");
            } else {
                str = null;
            }
            ?? r2 = this.d0;
            if (r2 != 0) {
                u03.b0 b0Var = (u03.b0) r2.g;
                if (str == null) {
                    dw2.baz bazVar = (dw2.baz) r2.a;
                    if (bazVar != null) {
                        bazVar.finish();
                        return;
                    }
                    return;
                }
                try {
                    com.truecaller.swish.deeplink.data.SwishResultDto c = ((bw2.qux) ((bw2.bar) r2.f)).c(str);
                    if (c == null) {
                        dw2.baz bazVar2 = (dw2.baz) r2.a;
                        if (bazVar2 != null) {
                            bazVar2.finish();
                            return;
                        }
                        return;
                    }
                    java.lang.String result = c.getResult();
                    if (kotlin.jvm.internal.Intrinsics.b(result, "paid")) {
                        str2 = ((u03.g0) b0Var).h(2132023462, new java.lang.Object[0]);
                    } else if (kotlin.jvm.internal.Intrinsics.b(result, "unknown")) {
                        str2 = ((u03.g0) b0Var).h(2132021592, new java.lang.Object[0]);
                    }
                    if (str2 != null && (appCompatActivity = (dw2.baz) r2.a) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "text");
                        android.widget.Toast.makeText((android.content.Context) appCompatActivity, (java.lang.CharSequence) str2, 1).show();
                    }
                    dw2.baz bazVar3 = (dw2.baz) r2.a;
                    if (bazVar3 != null) {
                        bazVar3.finish();
                        return;
                    }
                    return;
                } catch (java.lang.Throwable th) {
                    dw2.baz bazVar4 = (dw2.baz) r2.a;
                    if (bazVar4 != null) {
                        bazVar4.finish();
                    }
                    throw th;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }

    @Override // com.truecaller.swish.deeplink.Hilt_SwishResultActivity
    public final void onDestroy() {
        dw2.qux quxVar = this.d0;
        if (quxVar != null) {
            quxVar.m1();
            super.onDestroy();
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }
}
