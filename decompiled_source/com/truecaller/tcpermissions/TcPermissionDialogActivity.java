package com.truecaller.tcpermissions;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/tcpermissions/TcPermissionDialogActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ik3/s", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TcPermissionDialogActivity extends com.truecaller.tcpermissions.Hilt_TcPermissionDialogActivity {
    public static final /* synthetic */ int e0 = 0;
    public qw2.d0 d0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.tcpermissions.Hilt_TcPermissionDialogActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        yy.qux.C(this, 2);
        qw2.d0 d0Var = this.d0;
        if (d0Var != null) {
            i.e j = d0Var.j(this);
            j.setOnCancelListener(new com.truecaller.ui.j(this, 3));
            j.setOnDismissListener(new kc3.baz(this, 5));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("tcPermissionsView");
        throw null;
    }
}
