package com.truecaller.android.sdk.legacy;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TrueError implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.legacy.TrueError> CREATOR = new cb1.bar(4);
    public static final int ERROR_PROFILE_NOT_FOUND = 3;
    public static final java.lang.String ERROR_TYPE = "TRUEERROR_ERROR_TYPE";
    public static final int ERROR_TYPE_ACTIVITY_NOT_FOUND = 15;
    public static final int ERROR_TYPE_CONTINUE_WITH_DIFFERENT_NUMBER = 14;
    public static final int ERROR_TYPE_DEVICE_NOT_SUPPORTED = 16;
    public static final int ERROR_TYPE_INTERNAL = 0;
    public static final int ERROR_TYPE_INVALID_ACCOUNT_STATE = 10;
    public static final int ERROR_TYPE_MWEB_AUTODISMISS = 17;
    public static final int ERROR_TYPE_NETWORK = 1;
    public static final int ERROR_TYPE_PARTNER_INFO_NULL = 12;
    public static final int ERROR_TYPE_POSSIBLE_REQ_CODE_COLLISION = 7;
    public static final int ERROR_TYPE_REQUEST_NONCE_MISMATCH = 9;
    public static final int ERROR_TYPE_RESPONSE_SIGNATURE_MISMATCH = 8;
    public static final int ERROR_TYPE_SDK_INIT_EXCEPTION = 18;
    public static final int ERROR_TYPE_TC_NOT_INSTALLED = 11;
    public static final int ERROR_TYPE_TRUECALLER_CLOSED_UNEXPECTEDLY = 5;
    public static final int ERROR_TYPE_TRUESDK_TOO_OLD = 6;
    public static final int ERROR_TYPE_UNAUTHORIZED_USER = 4;
    public static final int ERROR_TYPE_USER_DENIED = 2;
    public static final int ERROR_TYPE_USER_DENIED_WHILE_LOADING = 13;
    private final int mErrorType;

    public /* synthetic */ TrueError(int i, android.os.Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorType() {
        return this.mErrorType;
    }

    public void writeToBundle(@androidx.annotation.NonNull android.os.Bundle bundle) {
        bundle.putInt(ERROR_TYPE, this.mErrorType);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.mErrorType);
    }

    public TrueError(int i) {
        this.mErrorType = i;
    }

    public TrueError(@androidx.annotation.NonNull android.os.Bundle bundle) {
        this.mErrorType = bundle.getInt(ERROR_TYPE);
    }

    private TrueError(android.os.Parcel parcel) {
        this.mErrorType = parcel.readInt();
    }
}
