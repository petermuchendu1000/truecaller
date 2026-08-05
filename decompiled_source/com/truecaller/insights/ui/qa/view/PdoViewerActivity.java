package com.truecaller.insights.ui.qa.view;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/insights/ui/qa/view/PdoViewerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PdoViewerActivity extends com.truecaller.insights.ui.qa.view.Hilt_PdoViewerActivity {
    public static final /* synthetic */ int k0 = 0;
    public uw1.d d0;
    public yw1.l e0;
    public kotlin.coroutines.CoroutineContext f0;
    public com.truecaller.insights.database.entities.pdo.ParsedDataObject i0;
    public final fg3.m2 g0 = fg3.h0.e();
    public final kotlin.Lazy h0 = kotlin.LazyKt.lazy(new xx.d(this, 9));
    public final kotlin.Lazy j0 = kotlin.LazyKt.lazy(kotlin.k.c, new qp0.bar(this, 18));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.insights.ui.qa.view.Hilt_PdoViewerActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        vy2.i.H(this);
        setContentView(t0().a);
        long longExtra = getIntent().getLongExtra("msg_id", 0L);
        if (longExtra != 0) {
            fg3.h0.J((fg3.e0) this.h0.getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b2.e(this, longExtra, (df3.bar) null), 3);
        }
        final int i = 0;
        t0().c.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xy1.f0
            public final /* synthetic */ com.truecaller.insights.ui.qa.view.PdoViewerActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.truecaller.insights.ui.qa.view.PdoViewerActivity, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String address;
                int i2 = i;
                ?? r0 = this.b;
                switch (i2) {
                    case 0:
                        int i3 = com.truecaller.insights.ui.qa.view.PdoViewerActivity.k0;
                        java.lang.Object systemService = r0.getSystemService("clipboard");
                        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("Pdo", r0.t0().e.getText()));
                        android.widget.Toast.makeText((android.content.Context) r0, "Copied", 0).show();
                        return;
                    default:
                        com.truecaller.insights.database.entities.pdo.ParsedDataObject parsedDataObject = r0.i0;
                        if (parsedDataObject != null && (address = parsedDataObject.getAddress()) != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r0, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
                            android.content.Intent intent = new android.content.Intent((android.content.Context) r0, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
                            intent.putExtra("qaPageToOpen", "InsightsAddressFiltersFragment");
                            intent.putExtra("extras_param", address);
                            r0.startActivity(intent);
                            return;
                        }
                        return;
                }
            }
        });
        final int i2 = 1;
        t0().d.setOnClickListener(new android.view.View.OnClickListener(this) { // from class: xy1.f0
            public final /* synthetic */ com.truecaller.insights.ui.qa.view.PdoViewerActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.truecaller.insights.ui.qa.view.PdoViewerActivity, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.String address;
                int i22 = i2;
                ?? r0 = this.b;
                switch (i22) {
                    case 0:
                        int i3 = com.truecaller.insights.ui.qa.view.PdoViewerActivity.k0;
                        java.lang.Object systemService = r0.getSystemService("clipboard");
                        kotlin.jvm.internal.Intrinsics.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("Pdo", r0.t0().e.getText()));
                        android.widget.Toast.makeText((android.content.Context) r0, "Copied", 0).show();
                        return;
                    default:
                        com.truecaller.insights.database.entities.pdo.ParsedDataObject parsedDataObject = r0.i0;
                        if (parsedDataObject != null && (address = parsedDataObject.getAddress()) != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Object) r0, "context");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "address");
                            android.content.Intent intent = new android.content.Intent((android.content.Context) r0, (java.lang.Class<?>) com.truecaller.insights.ui.qa.view.InsightsQAActivity.class);
                            intent.putExtra("qaPageToOpen", "InsightsAddressFiltersFragment");
                            intent.putExtra("extras_param", address);
                            r0.startActivity(intent);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final qx1.baz t0() {
        return (qx1.baz) this.j0.getValue();
    }
}
