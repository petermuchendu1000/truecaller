package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u000e\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "Landroid/os/Parcelable;", "errorCode", "", "errorMessage", "", "<init>", "(ILjava/lang/String;)V", "getErrorCode", "()I", "getErrorMessage", "()Ljava/lang/String;", "SdkInitError", "DefaultError", "DeviceNotSupported", "InvalidPartnerError", "UserDeniedError", "UserDeniedWhileLoadingError", "UserDeniedByPressingFooterError", "TruecallerClosedError", "OldSdkError", "TruecallerNotInstalledError", "InvalidAccountStateError", "TruecallerActivityNotFoundError", "RequestCodeCollisionError", "ApiError", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$ApiError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$DefaultError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$DeviceNotSupported;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$InvalidAccountStateError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$InvalidPartnerError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$OldSdkError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$RequestCodeCollisionError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$SdkInitError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerActivityNotFoundError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerClosedError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerNotInstalledError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedByPressingFooterError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedWhileLoadingError;", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class TcOAuthError implements android.os.Parcelable {
    private final int errorCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorMessage;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$ApiError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "code", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN, "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class ApiError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError> CREATOR = new java.lang.Object();
        private final int code;

        @org.jetbrains.annotations.NotNull
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApiError(int i, @org.jetbrains.annotations.NotNull java.lang.String str) {
            super(i, str, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            this.code = i;
            this.message = str;
        }

        public static /* synthetic */ com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError copy$default(com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError apiError, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = apiError.code;
            }
            if ((i2 & 2) != 0) {
                str = apiError.message;
            }
            return apiError.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCode() {
            return this.code;
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component2, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError copy(int code, @org.jetbrains.annotations.NotNull java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
            return new com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError(code, message);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError)) {
                return false;
            }
            com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError apiError = (com.truecaller.android.sdk.oAuth.TcOAuthError.ApiError) other;
            return this.code == apiError.code && kotlin.jvm.internal.Intrinsics.b(this.message, apiError.message);
        }

        public final int getCode() {
            return this.code;
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.code * 31);
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return bx.e1.n("ApiError(code=", this.code, ", message=", this.message, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.code);
            dest.writeString(this.message);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$DefaultError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class DefaultError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.DefaultError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.DefaultError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.DefaultError> CREATOR = new java.lang.Object();

        private DefaultError() {
            super(0, "Something went wrong", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$DeviceNotSupported;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class DeviceNotSupported extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.DeviceNotSupported INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.DeviceNotSupported();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.DeviceNotSupported> CREATOR = new java.lang.Object();

        private DeviceNotSupported() {
            super(16, "Device is not supported", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$InvalidAccountStateError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class InvalidAccountStateError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidAccountStateError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidAccountStateError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidAccountStateError> CREATOR = new java.lang.Object();

        private InvalidAccountStateError() {
            super(10, "Truecaller user has an invalid account state", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$InvalidPartnerError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class InvalidPartnerError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidPartnerError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidPartnerError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidPartnerError> CREATOR = new java.lang.Object();

        private InvalidPartnerError() {
            super(12, "Invalid partner or partner information is missing", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$OldSdkError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class OldSdkError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.OldSdkError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.OldSdkError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.OldSdkError> CREATOR = new java.lang.Object();

        private OldSdkError() {
            super(6, "Truecaller sdk is old and not compatible", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$RequestCodeCollisionError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class RequestCodeCollisionError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.RequestCodeCollisionError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.RequestCodeCollisionError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.RequestCodeCollisionError> CREATOR = new java.lang.Object();

        private RequestCodeCollisionError() {
            super(7, "Conflicting request code possible", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$SdkInitError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class SdkInitError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.SdkInitError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.SdkInitError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.SdkInitError> CREATOR = new java.lang.Object();

        private SdkInitError() {
            super(18, "Sdk init failed, please clear the sdk and try again.", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerActivityNotFoundError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class TruecallerActivityNotFoundError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerActivityNotFoundError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerActivityNotFoundError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerActivityNotFoundError> CREATOR = new java.lang.Object();

        private TruecallerActivityNotFoundError() {
            super(15, "Truecaller activity not found", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerClosedError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class TruecallerClosedError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerClosedError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerClosedError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerClosedError> CREATOR = new java.lang.Object();

        private TruecallerClosedError() {
            super(5, "Truecaller app closed unexpectedly", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$TruecallerNotInstalledError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class TruecallerNotInstalledError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerNotInstalledError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerNotInstalledError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerNotInstalledError> CREATOR = new java.lang.Object();

        private TruecallerNotInstalledError() {
            super(11, "Truecaller app is not installed", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedByPressingFooterError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class UserDeniedByPressingFooterError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedByPressingFooterError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedByPressingFooterError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedByPressingFooterError> CREATOR = new java.lang.Object();

        private UserDeniedByPressingFooterError() {
            super(14, "User denied by pressing the footer button", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class UserDeniedError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError> CREATOR = new java.lang.Object();

        private UserDeniedError() {
            super(2, "User denied by dismissing consent screen", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthError$UserDeniedWhileLoadingError;", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final class UserDeniedWhileLoadingError extends com.truecaller.android.sdk.oAuth.TcOAuthError {

        @org.jetbrains.annotations.NotNull
        public static final com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedWhileLoadingError INSTANCE = new com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedWhileLoadingError();

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedWhileLoadingError> CREATOR = new java.lang.Object();

        private UserDeniedWhileLoadingError() {
            super(13, "User denied while loading", null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    public /* synthetic */ TcOAuthError(int i, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    private TcOAuthError(int i, java.lang.String str) {
        this.errorCode = i;
        this.errorMessage = str;
    }
}
