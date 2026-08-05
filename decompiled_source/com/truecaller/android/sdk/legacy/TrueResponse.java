package com.truecaller.android.sdk.legacy;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class TrueResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.legacy.TrueResponse> CREATOR = new cb1.bar(5);
    public static final java.lang.String IS_SUCCESSFUL = "TRUERESPONSE_IS_SUCCESSFUL";
    public static final java.lang.String TRUECALLER_RESPONSE_EXTRA = "TRUECALLER_RESPONSE_EXTRA";
    public static final java.lang.String TRUESDK_VERSION = "TRUERESPONSE_TRUESDK_VERSION";
    public final boolean isSuccessful;

    @androidx.annotation.Nullable
    public final com.truecaller.android.sdk.legacy.TrueError trueError;

    @androidx.annotation.Nullable
    public final com.truecaller.android.sdk.common.models.TrueProfile trueProfile;
    private final java.lang.String truesdkVersion;

    public /* synthetic */ TrueResponse(int i, android.os.Parcel parcel) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void writeToBundle(@androidx.annotation.NonNull android.os.Bundle bundle) {
        com.truecaller.android.sdk.common.models.TrueProfile trueProfile;
        bundle.putBoolean(IS_SUCCESSFUL, this.isSuccessful);
        bundle.putString(TRUESDK_VERSION, this.truesdkVersion);
        if (this.isSuccessful && (trueProfile = this.trueProfile) != null) {
            trueProfile.writeToBundle(bundle);
            return;
        }
        com.truecaller.android.sdk.legacy.TrueError trueError = this.trueError;
        if (trueError != null) {
            trueError.writeToBundle(bundle);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.trueProfile, i);
        parcel.writeParcelable(this.trueError, i);
        parcel.writeString(java.lang.String.valueOf(this.isSuccessful));
    }

    public TrueResponse(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile trueProfile) {
        this.trueProfile = trueProfile;
        this.trueError = null;
        this.isSuccessful = true;
        this.truesdkVersion = "2.9.0";
    }

    public TrueResponse(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.TrueError trueError) {
        this.trueProfile = null;
        this.trueError = trueError;
        this.isSuccessful = false;
        this.truesdkVersion = "2.9.0";
    }

    public TrueResponse(@androidx.annotation.NonNull android.os.Bundle bundle) {
        boolean z = bundle.getBoolean(IS_SUCCESSFUL);
        this.isSuccessful = z;
        this.truesdkVersion = bundle.getString(TRUESDK_VERSION);
        if (z) {
            this.trueProfile = new com.truecaller.android.sdk.common.models.TrueProfile(bundle);
            this.trueError = null;
        } else {
            this.trueProfile = null;
            this.trueError = new com.truecaller.android.sdk.legacy.TrueError(bundle);
        }
    }

    private TrueResponse(android.os.Parcel parcel) {
        this.trueProfile = (com.truecaller.android.sdk.common.models.TrueProfile) parcel.readParcelable(com.truecaller.android.sdk.common.models.TrueProfile.class.getClassLoader());
        this.trueError = (com.truecaller.android.sdk.legacy.TrueError) parcel.readParcelable(com.truecaller.android.sdk.legacy.TrueError.class.getClassLoader());
        this.isSuccessful = java.lang.Boolean.valueOf(parcel.readString()).booleanValue();
        this.truesdkVersion = "0.4.2";
    }
}
