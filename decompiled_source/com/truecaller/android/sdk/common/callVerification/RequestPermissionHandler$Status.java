package com.truecaller.android.sdk.common.callVerification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/android/sdk/common/callVerification/RequestPermissionHandler$Status", "", "Lcom/truecaller/android/sdk/common/callVerification/RequestPermissionHandler$Status;", "<init>", "(Ljava/lang/String;I)V", "GRANTED", "UN_GRANTED", "TEMPORARY_DENIED", "PERMANENT_DENIED", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RequestPermissionHandler$Status {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[] $VALUES;
    public static final com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status GRANTED = new com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status("GRANTED", 0);
    public static final com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status UN_GRANTED = new com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status("UN_GRANTED", 1);
    public static final com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status TEMPORARY_DENIED = new com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status("TEMPORARY_DENIED", 2);
    public static final com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status PERMANENT_DENIED = new com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status("PERMANENT_DENIED", 3);

    private static final /* synthetic */ com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[] $values() {
        return new com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[]{GRANTED, UN_GRANTED, TEMPORARY_DENIED, PERMANENT_DENIED};
    }

    static {
        com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RequestPermissionHandler$Status(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status valueOf(java.lang.String str) {
        return (com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status) java.lang.Enum.valueOf(com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status.class, str);
    }

    public static com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[] values() {
        return (com.truecaller.android.sdk.common.callVerification.RequestPermissionHandler$Status[]) $VALUES.clone();
    }
}
