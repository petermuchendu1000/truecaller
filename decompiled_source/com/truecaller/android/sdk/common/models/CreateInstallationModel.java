package com.truecaller.android.sdk.common.models;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class CreateInstallationModel {
    private static final int CLIENT_ID = 15;
    private static final java.lang.String CLIENT_OS = "android";

    @bw.qux("airplaneModeDisabled")
    private boolean airplaneModeDisabled;

    @bw.qux("countryCodeName")
    public final java.lang.String countryCodeName;

    @bw.qux("deviceId")
    public final java.lang.String deviceId;

    @bw.qux("hasTruecaller")
    public final boolean hasTruecaller;

    @bw.qux("phoneNumber")
    public final java.lang.String phoneNumber;

    @bw.qux("phonePermission")
    private boolean phonePermission;

    @bw.qux("requestNonce")
    public final java.lang.String requestNonce;

    @bw.qux("simState")
    private int simState;

    @bw.qux("clientId")
    private final int clientId = 15;

    @bw.qux("osId")
    private final int osId = 15;

    @bw.qux("os")
    private final java.lang.String os = CLIENT_OS;

    @bw.qux("version")
    private final java.lang.String version = android.os.Build.VERSION.RELEASE;

    public CreateInstallationModel(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.NonNull java.lang.String str4, boolean z) {
        this.phoneNumber = str3;
        this.countryCodeName = str2;
        this.deviceId = str4;
        this.hasTruecaller = z;
        this.requestNonce = str;
    }

    public void setAirplaneModeDisabled(boolean z) {
        this.airplaneModeDisabled = z;
    }

    public void setPhonePermission(boolean z) {
        this.phonePermission = z;
    }

    public void setSimState(int i) {
        this.simState = i;
    }
}
