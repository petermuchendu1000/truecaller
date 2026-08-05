package com.truecaller.tcpermissions;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/tcpermissions/NotificationSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lqw2/f;", "<init>", "()V", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class NotificationSettingsActivity extends com.truecaller.tcpermissions.Hilt_NotificationSettingsActivity implements qw2.f {
    public qw2.g d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qw2.f
    public final void finish() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_NotificationSettingsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        getTheme().applyStyle(2132083915, false);
        qw2.g gVar = this.d0;
        if (gVar != null) {
            gVar.a = this;
        } else {
            kotlin.jvm.internal.Intrinsics.n("presenter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_NotificationSettingsActivity
    public final void onDestroy() {
        if (isFinishing()) {
            qw2.g gVar = this.d0;
            if (gVar != null) {
                qw2.d0 d0Var = (qw2.d0) gVar.c;
                qw2.j jVar = (qw2.j) gVar.e;
                d0Var.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jVar, "result");
                kotlin.jvm.functions.Function1 function1 = d0Var.j;
                if (function1 != null) {
                    d0Var.j = null;
                    function1.invoke(jVar);
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("presenter");
                throw null;
            }
        }
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, com.truecaller.tcpermissions.NotificationSettingsActivity] */
    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        qw2.g gVar = this.d0;
        if (gVar != null) {
            if (!gVar.b) {
                gVar.b = true;
                qw2.f fVar = (qw2.f) gVar.a;
                if (fVar != null) {
                    ?? r0 = (com.truecaller.tcpermissions.NotificationSettingsActivity) fVar;
                    android.content.Intent putExtra = new android.content.Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", r0.getPackageName());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(putExtra, "putExtra(...)");
                    try {
                        r0.startActivity(putExtra);
                        return;
                    } catch (android.content.ActivityNotFoundException unused) {
                        qw2.g gVar2 = r0.d0;
                        if (gVar2 != null) {
                            qw2.f fVar2 = (qw2.f) gVar2.a;
                            if (fVar2 != null) {
                                fVar2.finish();
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("presenter");
                        throw null;
                    }
                }
                return;
            }
            qw2.j jVar = (qw2.j) gVar.e;
            qw2.b0 b0Var = (qw2.b0) ((qw2.a0) gVar.d);
            u03.z zVar = b0Var.a;
            java.lang.String[] c = b0Var.c();
            gVar.e = new qw2.j(zVar.g((java.lang.String[]) java.util.Arrays.copyOf(c, c.length)), jVar.b);
            qw2.f fVar3 = (qw2.f) gVar.a;
            if (fVar3 != null) {
                fVar3.finish();
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
