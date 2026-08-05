package com.truecaller.messaging.smspermission;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class SmsPermissionActivity extends com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity implements com.truecaller.messaging.smspermission.a, com.truecaller.messaging.smspermission.qux {
    public static final /* synthetic */ int f0 = 0;
    public be0.baz d0;
    public qw2.a0 e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this, "<this>");
        yy.qux.C(this, 3);
        super.onCreate(bundle);
        setContentView(2131561091);
        this.d0.u0(this);
        findViewById(2131366521).setOnClickListener(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(this, 2));
    }

    @Override // com.truecaller.messaging.smspermission.Hilt_SmsPermissionActivity
    public final void onDestroy() {
        ((com.truecaller.sdk.bar) this.d0).a = null;
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        if0.y1.L(strArr, iArr);
    }

    public final void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        be0.baz bazVar = this.d0;
        u03.z zVar = (u03.z) bazVar.d;
        java.lang.Object obj = ((com.truecaller.sdk.bar) bazVar).a;
        if (obj != null) {
            bd3.qux quxVar = (com.truecaller.messaging.smspermission.a) obj;
            if (zVar.g(new java.lang.String[]{"android.permission.READ_SMS"}) && zVar.g(new java.lang.String[]{"android.permission.SEND_SMS"}) && ((u03.b) bazVar.e).c()) {
                bd3.qux quxVar2 = (com.truecaller.messaging.smspermission.SmsPermissionActivity) quxVar;
                android.content.Intent intent = (android.content.Intent) quxVar2.getIntent().getParcelableExtra("success_intent");
                if (intent != null) {
                    quxVar.startActivity(intent);
                } else {
                    y90.m6.O(quxVar2, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, (java.lang.String) bazVar.f);
                }
                quxVar.finish();
                return;
            }
            return;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }
}
