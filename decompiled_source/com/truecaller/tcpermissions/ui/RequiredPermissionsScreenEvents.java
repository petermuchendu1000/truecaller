package com.truecaller.tcpermissions.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/tcpermissions/ui/RequiredPermissionsScreenEvents;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Lnc0/bar;", "analytics", "", "logWith", "(Lnc0/bar;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Seen", "Clicked", "Granted", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RequiredPermissionsScreenEvents {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents Seen = new com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents("Seen", 0, "RequiredPermissionDialogSeen");
    public static final com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents Clicked = new com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents("Clicked", 1, "RequiredPermissionDialogClicked");
    public static final com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents Granted = new com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents("Granted", 2, "RequiredPermissionGranted");

    private static final /* synthetic */ com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[] $values() {
        return new com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[]{Seen, Clicked, Granted};
    }

    static {
        com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RequiredPermissionsScreenEvents(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents valueOf(java.lang.String str) {
        return (com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents) java.lang.Enum.valueOf(com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents.class, str);
    }

    public static com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[] values() {
        return (com.truecaller.tcpermissions.ui.RequiredPermissionsScreenEvents[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public final void logWith(@org.jetbrains.annotations.NotNull nc0.bar analytics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "analytics");
        ((nc0.a) analytics).d(new hg0.a(this));
    }
}
