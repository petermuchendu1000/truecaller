package com.truecaller.forcedupdate.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/forcedupdate/ui/SimpleForceUpdateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "forced-update-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SimpleForceUpdateActivity extends com.truecaller.forcedupdate.ui.Hilt_SimpleForceUpdateActivity {
    public static final /* synthetic */ int g0 = 0;
    public k0.h d0;
    public java.lang.String e0;
    public tx.v f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.forcedupdate.ui.Hilt_SimpleForceUpdateActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        setContentView(2131558500);
        ((android.widget.TextView) findViewById(2131364248)).setText(ak.r0.j(2132021558, this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131364249);
        if (textView != null) {
            textView.setOnLongClickListener(new aw2.c(this, 3));
        }
        final int i = 0;
        findViewById(2131362602).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.forcedupdate.ui.k
            public final /* synthetic */ com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i2 = i;
                ?? r1 = this.b;
                switch (i2) {
                    case 0:
                        k0.h hVar = r1.d0;
                        if (hVar != null) {
                            hVar.B((android.content.Context) r1, (java.lang.String) null, "resourceBrokenUpdate");
                            r1.finish();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("appUpdateActionHelper");
                            throw null;
                        }
                    default:
                        int i3 = com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity.g0;
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                        intent.setData(android.net.Uri.parse("mailto:"));
                        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{"support@truecaller.com"});
                        java.lang.String str = r1.e0;
                        if (str != null) {
                            intent.putExtra("android.intent.extra.SUBJECT", "Incompatible Version (" + str + ")");
                            if (intent.resolveActivity(r1.getPackageManager()) != null) {
                                r1.startActivity(intent);
                                return;
                            }
                            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) r1.getSystemService("clipboard");
                            if (clipboardManager != null) {
                                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("email", "support@truecaller.com"));
                                android.widget.Toast.makeText((android.content.Context) r1, 2132019024, 0).show();
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("appVersionName");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        ((android.widget.TextView) findViewById(2131364248)).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.forcedupdate.ui.k
            public final /* synthetic */ com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Context, com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i22 = i2;
                ?? r1 = this.b;
                switch (i22) {
                    case 0:
                        k0.h hVar = r1.d0;
                        if (hVar != null) {
                            hVar.B((android.content.Context) r1, (java.lang.String) null, "resourceBrokenUpdate");
                            r1.finish();
                            return;
                        } else {
                            kotlin.jvm.internal.Intrinsics.n("appUpdateActionHelper");
                            throw null;
                        }
                    default:
                        int i3 = com.truecaller.forcedupdate.ui.SimpleForceUpdateActivity.g0;
                        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
                        intent.setData(android.net.Uri.parse("mailto:"));
                        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{"support@truecaller.com"});
                        java.lang.String str = r1.e0;
                        if (str != null) {
                            intent.putExtra("android.intent.extra.SUBJECT", "Incompatible Version (" + str + ")");
                            if (intent.resolveActivity(r1.getPackageManager()) != null) {
                                r1.startActivity(intent);
                                return;
                            }
                            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) r1.getSystemService("clipboard");
                            if (clipboardManager != null) {
                                clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText("email", "support@truecaller.com"));
                                android.widget.Toast.makeText((android.content.Context) r1, 2132019024, 0).show();
                                return;
                            }
                            return;
                        }
                        kotlin.jvm.internal.Intrinsics.n("appVersionName");
                        throw null;
                }
            }
        });
    }
}
