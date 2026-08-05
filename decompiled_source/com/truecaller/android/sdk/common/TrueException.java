package com.truecaller.android.sdk.common;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TrueException {
    public static final int TYPE_AIRPLANE_MODE_ENABLED = 7;
    public static final int TYPE_API = 2;
    public static final java.lang.String TYPE_APP_SIGNATURE_MISSING = "Could not fetch application's signature";
    public static final java.lang.String TYPE_CLIENT_MISSING = "No compatible client available. Please change your scope";
    public static final int TYPE_INCOMPLETE_INFO = 5;
    public static final java.lang.String TYPE_INTERNAL_SERVER_ERROR = "internal service error";
    public static final java.lang.String TYPE_INVALID_NAME_MESSAGE = "Please provide a valid name";
    public static final java.lang.String TYPE_INVALID_NUMBER = "Invalid phone number";
    public static final int TYPE_MISSING_API_CALL = 3;
    public static final java.lang.String TYPE_MISSING_CREATE_CALL_MESSAGE = "Please call createInstallation first";
    public static final int TYPE_MISSING_PERMISSION = 4;
    public static final java.lang.String TYPE_MISSING_PERMISSIONS_MESSAGE = "Required permissions missing";
    public static final java.lang.String TYPE_PARTNER_KEY = "Add partner key in your manifest";
    public static final java.lang.String TYPE_SDK_NOT_INITIALIZED = "Please call init() on TruecallerSDK first";
    public static final int TYPE_SIM_STATE_NOT_READY = 6;
    public static final int TYPE_UNKNOWN = 1;
    public static final java.lang.String TYPE_UNKNOWN_MESSAGE = "Unknown error";

    @androidx.annotation.NonNull
    private final java.lang.String mExceptionMessage;
    private final int mExceptionType;

    public TrueException(int i, @androidx.annotation.NonNull java.lang.String str) {
        this.mExceptionType = i;
        this.mExceptionMessage = str;
    }

    @androidx.annotation.NonNull
    public java.lang.String getExceptionMessage() {
        return this.mExceptionMessage;
    }

    public int getExceptionType() {
        return this.mExceptionType;
    }
}
