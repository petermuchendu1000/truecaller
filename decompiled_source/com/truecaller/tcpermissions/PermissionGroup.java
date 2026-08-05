package com.truecaller.tcpermissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/truecaller/tcpermissions/PermissionGroup;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALLS", "CONTACTS", "SMS", "CALL_LOG", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PermissionGroup implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.tcpermissions.PermissionGroup[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.tcpermissions.PermissionGroup> CREATOR;
    public static final com.truecaller.tcpermissions.PermissionGroup CALLS = new com.truecaller.tcpermissions.PermissionGroup("CALLS", 0);
    public static final com.truecaller.tcpermissions.PermissionGroup CONTACTS = new com.truecaller.tcpermissions.PermissionGroup("CONTACTS", 1);
    public static final com.truecaller.tcpermissions.PermissionGroup SMS = new com.truecaller.tcpermissions.PermissionGroup("SMS", 2);
    public static final com.truecaller.tcpermissions.PermissionGroup CALL_LOG = new com.truecaller.tcpermissions.PermissionGroup("CALL_LOG", 3);

    private static final /* synthetic */ com.truecaller.tcpermissions.PermissionGroup[] $values() {
        return new com.truecaller.tcpermissions.PermissionGroup[]{CALLS, CONTACTS, SMS, CALL_LOG};
    }

    static {
        com.truecaller.tcpermissions.PermissionGroup[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new om0.bar(19);
    }

    private PermissionGroup(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.tcpermissions.PermissionGroup valueOf(java.lang.String str) {
        return (com.truecaller.tcpermissions.PermissionGroup) java.lang.Enum.valueOf(com.truecaller.tcpermissions.PermissionGroup.class, str);
    }

    public static com.truecaller.tcpermissions.PermissionGroup[] values() {
        return (com.truecaller.tcpermissions.PermissionGroup[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
