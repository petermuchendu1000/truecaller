package com.truecaller.wizard.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, d2 = {"Lcom/truecaller/wizard/permissions/RolesToRequest;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "DefaultDialerAndCallerid", "DefaultDialer", "CallerId", "None", "shouldAskDefaultDialer", "", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RolesToRequest implements android.os.Parcelable {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.permissions.RolesToRequest[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.wizard.permissions.RolesToRequest> CREATOR;
    public static final com.truecaller.wizard.permissions.RolesToRequest DefaultDialerAndCallerid = new com.truecaller.wizard.permissions.RolesToRequest("DefaultDialerAndCallerid", 0);
    public static final com.truecaller.wizard.permissions.RolesToRequest DefaultDialer = new com.truecaller.wizard.permissions.RolesToRequest("DefaultDialer", 1);
    public static final com.truecaller.wizard.permissions.RolesToRequest CallerId = new com.truecaller.wizard.permissions.RolesToRequest("CallerId", 2);
    public static final com.truecaller.wizard.permissions.RolesToRequest None = new com.truecaller.wizard.permissions.RolesToRequest("None", 3);

    private static final /* synthetic */ com.truecaller.wizard.permissions.RolesToRequest[] $values() {
        return new com.truecaller.wizard.permissions.RolesToRequest[]{DefaultDialerAndCallerid, DefaultDialer, CallerId, None};
    }

    static {
        com.truecaller.wizard.permissions.RolesToRequest[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        CREATOR = new rz0.b0(10);
    }

    private RolesToRequest(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.permissions.RolesToRequest valueOf(java.lang.String str) {
        return (com.truecaller.wizard.permissions.RolesToRequest) java.lang.Enum.valueOf(com.truecaller.wizard.permissions.RolesToRequest.class, str);
    }

    public static com.truecaller.wizard.permissions.RolesToRequest[] values() {
        return (com.truecaller.wizard.permissions.RolesToRequest[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean shouldAskDefaultDialer() {
        if (this != DefaultDialer && this != DefaultDialerAndCallerid) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
