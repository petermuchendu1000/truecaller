package com.truecaller.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/truecaller/ui/BaseNotificationAccessActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "t80/g", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract class BaseNotificationAccessActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final /* synthetic */ int g0 = 0;
    public u62.b a0;
    public r33.bar b0;
    public u03.z c0;
    public qw2.i d0;
    public boolean e0;
    public com.truecaller.premium.util.NotificationAccessSource f0 = com.truecaller.premium.util.NotificationAccessSource.UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(android.os.Bundle bundle) {
        java.io.Serializable serializable;
        boolean z;
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        android.content.Intent intent = getIntent();
        com.truecaller.premium.util.NotificationAccessSource notificationAccessSource = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("source");
        } else {
            serializable = null;
        }
        if (serializable instanceof com.truecaller.premium.util.NotificationAccessSource) {
            notificationAccessSource = (com.truecaller.premium.util.NotificationAccessSource) serializable;
        }
        if (notificationAccessSource == null) {
            notificationAccessSource = com.truecaller.premium.util.NotificationAccessSource.UNKNOWN;
        }
        this.f0 = notificationAccessSource;
        if (bundle != null) {
            z = bundle.getBoolean("hasOpenedNotificationAccessSetting");
        } else {
            z = false;
        }
        this.e0 = z;
    }

    public void onDestroy() {
        super.onDestroy();
        qw2.i iVar = this.d0;
        if (iVar != null) {
            iVar.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        qw2.i iVar = this.d0;
        if (iVar != null) {
            iVar.b();
        }
        if (this.e0) {
            u03.z zVar = this.c0;
            java.lang.Object obj = null;
            if (zVar != null) {
                s0(zVar.a());
                android.os.Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    obj = extras.get("goBackIntent");
                }
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
                finish();
                return;
            }
            kotlin.jvm.internal.Intrinsics.n("permissionUtil");
            throw null;
        }
    }

    public final void onSaveInstanceState(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "outState");
        bundle.putBoolean("hasOpenedNotificationAccessSetting", this.e0);
        super/*androidx.activity.ComponentActivity*/.onSaveInstanceState(bundle);
    }

    public void s0(boolean z) {
        java.lang.String str;
        r33.bar barVar = this.b0;
        if (barVar != null) {
            com.truecaller.premium.util.NotificationAccessSource notificationAccessSource = this.f0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationAccessSource, "source");
            com.truecaller.clevertap.CleverTapManager cleverTapManager = barVar.a;
            kotlin.Pair pair = new kotlin.Pair("Source", notificationAccessSource.name());
            if (z) {
                str = "Granted";
            } else {
                str = "Denied";
            }
            cleverTapManager.push("NotificationAccessResult", kotlin.collections.r0.i(new kotlin.Pair[]{pair, new kotlin.Pair("Result", str)}));
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("premiumNotificationAccessEventLogger");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        int intExtra = getIntent().getIntExtra("toastMessage", 2132023501);
        u62.b bVar = this.a0;
        java.lang.Object obj = null;
        if (bVar != null) {
            if (bVar.a(this, this.f0, intExtra)) {
                this.e0 = true;
                qw2.i iVar = this.d0;
                if (iVar != null) {
                    iVar.b();
                }
                android.os.Bundle extras = getIntent().getExtras();
                if (extras != null) {
                    obj = extras.get("goBackIntent");
                }
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) obj;
                if (pendingIntent != null) {
                    qw2.i iVar2 = new qw2.i((android.content.Context) this, pendingIntent);
                    com.truecaller.tcpermissions.PermissionPoller$Permission permissionPoller$Permission = com.truecaller.tcpermissions.PermissionPoller$Permission.NOTIFICATION_ACCESS;
                    iVar2.g = new com.mbridge.msdk.config.component.common.network.connect.socket.bar(this, 11);
                    iVar2.a(permissionPoller$Permission);
                    this.d0 = iVar2;
                    return;
                }
                return;
            }
            return;
        }
        kotlin.jvm.internal.Intrinsics.n("notificationAccessRequester");
        throw null;
    }
}
