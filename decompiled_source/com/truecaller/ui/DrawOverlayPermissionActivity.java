package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/ui/DrawOverlayPermissionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class DrawOverlayPermissionActivity extends com.truecaller.ui.Hilt_DrawOverlayPermissionActivity {
    public static final /* synthetic */ int f0 = 0;
    public qw2.i d0;
    public boolean e0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.Hilt_DrawOverlayPermissionActivity
    public final void onCreate(android.os.Bundle bundle) {
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        final int i = 1;
        yy.qux.n(theme, true);
        setContentView(2131559054);
        final int i2 = 0;
        if (bundle != null) {
            z = bundle.getBoolean("hasOpenedDrawOverlaySetting");
        } else {
            z = false;
        }
        this.e0 = z;
        ((android.widget.ImageView) findViewById(2131364553)).setImageResource(2131232539);
        android.view.View findViewById = findViewById(2131367033);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        gj.m.k0(findViewById, false);
        ((android.widget.TextView) findViewById(2131363468)).setText(ak.r0.j(2132017937, this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131361926);
        textView.setText(getString(2132019018));
        textView.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.ui.h
            public final /* synthetic */ com.truecaller.ui.DrawOverlayPermissionActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.ui.DrawOverlayPermissionActivity, android.content.Context, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj;
                int i3 = i2;
                ?? r0 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.ui.DrawOverlayPermissionActivity.f0;
                        r0.finish();
                        return;
                    default:
                        r0.e0 = true;
                        qw2.i iVar = r0.d0;
                        if (iVar != null) {
                            iVar.b();
                        }
                        android.os.Bundle extras = r0.getIntent().getExtras();
                        if (extras != null) {
                            obj = extras.get("goBackIntent");
                        } else {
                            obj = null;
                        }
                        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
                        if (pendingIntent != null) {
                            r0.d0 = new qw2.i((android.content.Context) r0, pendingIntent);
                            try {
                                r0.startActivity(ak.r0.a0((android.content.Context) r0, false));
                            } catch (android.content.ActivityNotFoundException e) {
                                o82.a.C(e);
                            }
                            qw2.i iVar2 = r0.d0;
                            if (iVar2 != null) {
                                iVar2.a(com.truecaller.tcpermissions.PermissionPoller$Permission.DRAW_OVERLAY);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131361910);
        textView2.setText(getString(2132019033));
        textView2.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: com.truecaller.ui.h
            public final /* synthetic */ com.truecaller.ui.DrawOverlayPermissionActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.ui.DrawOverlayPermissionActivity, android.content.Context, android.app.Activity] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj;
                int i3 = i;
                ?? r0 = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.ui.DrawOverlayPermissionActivity.f0;
                        r0.finish();
                        return;
                    default:
                        r0.e0 = true;
                        qw2.i iVar = r0.d0;
                        if (iVar != null) {
                            iVar.b();
                        }
                        android.os.Bundle extras = r0.getIntent().getExtras();
                        if (extras != null) {
                            obj = extras.get("goBackIntent");
                        } else {
                            obj = null;
                        }
                        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
                        if (pendingIntent != null) {
                            r0.d0 = new qw2.i((android.content.Context) r0, pendingIntent);
                            try {
                                r0.startActivity(ak.r0.a0((android.content.Context) r0, false));
                            } catch (android.content.ActivityNotFoundException e) {
                                o82.a.C(e);
                            }
                            qw2.i iVar2 = r0.d0;
                            if (iVar2 != null) {
                                iVar2.a(com.truecaller.tcpermissions.PermissionPoller$Permission.DRAW_OVERLAY);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // com.truecaller.ui.Hilt_DrawOverlayPermissionActivity
    public final void onDestroy() {
        super.onDestroy();
        qw2.i iVar = this.d0;
        if (iVar != null) {
            iVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        java.lang.Object obj;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        qw2.i iVar = this.d0;
        if (iVar != null) {
            iVar.b();
        }
        if (this.e0) {
            android.os.Bundle extras = getIntent().getExtras();
            if (extras != null) {
                obj = extras.get("goBackIntent");
            } else {
                obj = null;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
            if (pendingIntent != null) {
                pendingIntent.send();
            }
            finish();
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        bundle.putBoolean("hasOpenedDrawOverlaySetting", this.e0);
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
    }
}
