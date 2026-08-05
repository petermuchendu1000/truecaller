package com.truecaller.whatsappcallerid;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/whatsappcallerid/WhatsAppCallerIdPermissionDialogActivity;", "Lcom/truecaller/ui/BaseNotificationAccessActivity;", "<init>", "()V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WhatsAppCallerIdPermissionDialogActivity extends com.truecaller.whatsappcallerid.Hilt_WhatsAppCallerIdPermissionDialogActivity {
    public static final /* synthetic */ int m0 = 0;
    public p63.bar k0;
    public s62.d l0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.whatsappcallerid.Hilt_WhatsAppCallerIdPermissionDialogActivity, com.truecaller.ui.BaseNotificationAccessActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        u03.z zVar = this.c0;
        if (zVar != null) {
            final int i = 0;
            if (zVar.a()) {
                android.widget.Toast.makeText((android.content.Context) this, 2132017965, 0).show();
                finish();
            }
            android.content.res.Resources.Theme theme = getTheme();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            final int i2 = 1;
            yy.qux.n(theme, true);
            setContentView(2131559054);
            java.lang.String stringExtra = getIntent().getStringExtra("description");
            if (stringExtra != null) {
                ((android.widget.TextView) findViewById(2131363468)).setText(stringExtra);
            }
            findViewById(2131361926).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: o63.baz
                public final /* synthetic */ com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity, com.truecaller.ui.BaseNotificationAccessActivity, android.app.Activity] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i3 = i;
                    ?? r0 = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity.m0;
                            r0.finish();
                            return;
                        default:
                            int i5 = com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity.m0;
                            r0.t0();
                            return;
                    }
                }
            });
            findViewById(2131361910).setOnClickListener(new android.view.View.OnClickListener(this) { // from class: o63.baz
                public final /* synthetic */ com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity b;

                {
                    this.b = this;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity, com.truecaller.ui.BaseNotificationAccessActivity, android.app.Activity] */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i3 = i2;
                    ?? r0 = this.b;
                    switch (i3) {
                        case 0:
                            int i4 = com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity.m0;
                            r0.finish();
                            return;
                        default:
                            int i5 = com.truecaller.whatsappcallerid.WhatsAppCallerIdPermissionDialogActivity.m0;
                            r0.t0();
                            return;
                    }
                }
            });
            s62.f fVar = this.l0;
            if (fVar != null) {
                fVar.a(2131365516, com.truecaller.analytics.common.event.PushNotificationSource.MobileLocal.getType(), "WhatsAppCallerIdNotficationAccess");
                return;
            } else {
                kotlin.jvm.internal.Intrinsics.n("systemNotificationManager");
                throw null;
            }
        }
        kotlin.jvm.internal.Intrinsics.n("permissionUtil");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.ui.BaseNotificationAccessActivity
    public final void s0(boolean z) {
        com.truecaller.whatsappcallerid.analytics.event.WhatsAppCallerIdSourceParam whatsAppCallerIdSourceParam;
        super.s0(z);
        if (o63.qux.a[this.f0.ordinal()] == 1) {
            whatsAppCallerIdSourceParam = com.truecaller.whatsappcallerid.analytics.event.WhatsAppCallerIdSourceParam.PREMIUM_USER_TAB;
        } else {
            whatsAppCallerIdSourceParam = com.truecaller.whatsappcallerid.analytics.event.WhatsAppCallerIdSourceParam.WHATSAPP_CALLERID_SETTINGS;
        }
        if (z) {
            int intExtra = getIntent().getIntExtra("card_position", -1);
            p63.bar barVar = this.k0;
            if (barVar != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsAppCallerIdSourceParam, "source");
                ef0.a.T(new q63.bar(whatsAppCallerIdSourceParam, intExtra, 0), barVar);
                p63.bar barVar2 = this.k0;
                if (barVar2 != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(whatsAppCallerIdSourceParam, "source");
                    ef0.a.T(new q63.bar(whatsAppCallerIdSourceParam, intExtra, 2), barVar2);
                    return;
                } else {
                    kotlin.jvm.internal.Intrinsics.n("whatsAppCallerIdEventLogger");
                    throw null;
                }
            }
            kotlin.jvm.internal.Intrinsics.n("whatsAppCallerIdEventLogger");
            throw null;
        }
    }
}
