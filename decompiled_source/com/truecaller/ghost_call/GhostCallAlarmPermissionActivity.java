package com.truecaller.ghost_call;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ghost_call/GhostCallAlarmPermissionActivity;", "Lop1/qux;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ghost-call_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GhostCallAlarmPermissionActivity extends com.truecaller.ghost_call.Hilt_GhostCallAlarmPermissionActivity implements op1.qux {
    public static final /* synthetic */ int g0 = 0;
    public final kotlin.Lazy d0 = gj.m.J(this, 2131361910);
    public final kotlin.Lazy e0 = gj.m.J(this, 2131361926);
    public op1.a f0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ghost_call.Hilt_GhostCallAlarmPermissionActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        android.content.res.Resources.Theme theme = getTheme();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        final int i = 1;
        yy.qux.n(theme, true);
        final int i2 = 0;
        d.m.b(this, new d.k0(0, 0, 1, d.j0.l), 2);
        setContentView(2131558478);
        ((com.truecaller.sdk.bar) t0()).a = this;
        ((android.view.View) this.d0.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: op1.bar
            public final /* synthetic */ com.truecaller.ghost_call.GhostCallAlarmPermissionActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i3 = i2;
                com.truecaller.ghost_call.GhostCallAlarmPermissionActivity ghostCallAlarmPermissionActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.ghost_call.GhostCallAlarmPermissionActivity.g0;
                        op1.a t0 = ghostCallAlarmPermissionActivity.t0();
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            t0.c = true;
                            android.content.Context context = t0.b.c;
                            try {
                                android.content.Intent data = new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").setFlags(268435456).setData(android.net.Uri.parse("package:" + context.getPackageName()));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                                context.startActivity(data);
                                return;
                            } catch (android.content.ActivityNotFoundException e) {
                                o82.a.C(e);
                                return;
                            }
                        }
                        return;
                    default:
                        int i5 = com.truecaller.ghost_call.GhostCallAlarmPermissionActivity.g0;
                        op1.qux quxVar = (op1.qux) ((com.truecaller.sdk.bar) ghostCallAlarmPermissionActivity.t0()).a;
                        if (quxVar != null) {
                            quxVar.finish();
                            return;
                        }
                        return;
                }
            }
        });
        ((android.view.View) this.e0.getValue()).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: op1.bar
            public final /* synthetic */ com.truecaller.ghost_call.GhostCallAlarmPermissionActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i3 = i;
                com.truecaller.ghost_call.GhostCallAlarmPermissionActivity ghostCallAlarmPermissionActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = com.truecaller.ghost_call.GhostCallAlarmPermissionActivity.g0;
                        op1.a t0 = ghostCallAlarmPermissionActivity.t0();
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            t0.c = true;
                            android.content.Context context = t0.b.c;
                            try {
                                android.content.Intent data = new android.content.Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM").setFlags(268435456).setData(android.net.Uri.parse("package:" + context.getPackageName()));
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
                                context.startActivity(data);
                                return;
                            } catch (android.content.ActivityNotFoundException e) {
                                o82.a.C(e);
                                return;
                            }
                        }
                        return;
                    default:
                        int i5 = com.truecaller.ghost_call.GhostCallAlarmPermissionActivity.g0;
                        op1.qux quxVar = (op1.qux) ((com.truecaller.sdk.bar) ghostCallAlarmPermissionActivity.t0()).a;
                        if (quxVar != null) {
                            quxVar.finish();
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Override // com.truecaller.ghost_call.Hilt_GhostCallAlarmPermissionActivity
    public final void onDestroy() {
        super.onDestroy();
        ((com.truecaller.sdk.bar) t0()).a = null;
    }

    public final void onResume() {
        op1.qux quxVar;
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        op1.a t0 = t0();
        if (t0.c && (quxVar = (op1.qux) ((com.truecaller.sdk.bar) t0).a) != null) {
            quxVar.finish();
        }
    }

    public final op1.a t0() {
        op1.a aVar = this.f0;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.Intrinsics.n("presenter");
        throw null;
    }
}
