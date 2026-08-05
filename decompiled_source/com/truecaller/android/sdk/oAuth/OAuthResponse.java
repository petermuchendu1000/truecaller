package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \b2\u00020\u0001:\u0003\t\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/OAuthResponse;", "Landroid/os/Parcelable;", "", "isSuccessful", "<init>", "(Z)V", "Z", "()Z", "Companion", "com/truecaller/android/sdk/oAuth/baz", "SuccessResponse", "FailureResponse", "Lcom/truecaller/android/sdk/oAuth/OAuthResponse$FailureResponse;", "Lcom/truecaller/android/sdk/oAuth/OAuthResponse$SuccessResponse;", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class OAuthResponse implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.android.sdk.oAuth.baz Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_DEVICE_CODE = "DEVICE_CODE";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SIM_STATE = "SIM_STATUS";

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String OAUTH_RESPONSE_EXTRA = "OAUTH_SDK_RESPONSE_EXTRA";
    private final boolean isSuccessful;

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/OAuthResponse$FailureResponse;", "Lcom/truecaller/android/sdk/oAuth/OAuthResponse;", "tcOAuthError", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "<init>", "(Lcom/truecaller/android/sdk/oAuth/TcOAuthError;)V", "getTcOAuthError", "()Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class FailureResponse extends com.truecaller.android.sdk.oAuth.OAuthResponse {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailureResponse(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError) {
            super(false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcOAuthError, "tcOAuthError");
            this.tcOAuthError = tcOAuthError;
        }

        public static /* synthetic */ com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse copy$default(com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse failureResponse, com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tcOAuthError = failureResponse.tcOAuthError;
            }
            return failureResponse.copy(tcOAuthError);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.android.sdk.oAuth.TcOAuthError getTcOAuthError() {
            return this.tcOAuthError;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse copy(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcOAuthError, "tcOAuthError");
            return new com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse(tcOAuthError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse) && kotlin.jvm.internal.Intrinsics.b(this.tcOAuthError, ((com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse) other).tcOAuthError);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.android.sdk.oAuth.TcOAuthError getTcOAuthError() {
            return this.tcOAuthError;
        }

        public int hashCode() {
            return this.tcOAuthError.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "FailureResponse(tcOAuthError=" + this.tcOAuthError + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.tcOAuthError, flags);
        }
    }

    @androidx.annotation.Keep
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/OAuthResponse$SuccessResponse;", "Lcom/truecaller/android/sdk/oAuth/OAuthResponse;", "tcOAuthData", "Lcom/truecaller/android/sdk/oAuth/TcOAuthData;", "<init>", "(Lcom/truecaller/android/sdk/oAuth/TcOAuthData;)V", "getTcOAuthData", "()Lcom/truecaller/android/sdk/oAuth/TcOAuthData;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes5.dex */
    public static final /* data */ class SuccessResponse extends com.truecaller.android.sdk.oAuth.OAuthResponse {

        @org.jetbrains.annotations.NotNull
        public static final android.os.Parcelable.Creator<com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse> CREATOR = new java.lang.Object();

        @org.jetbrains.annotations.NotNull
        private final com.truecaller.android.sdk.oAuth.TcOAuthData tcOAuthData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessResponse(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthData tcOAuthData) {
            super(true, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcOAuthData, "tcOAuthData");
            this.tcOAuthData = tcOAuthData;
        }

        public static /* synthetic */ com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse copy$default(com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse successResponse, com.truecaller.android.sdk.oAuth.TcOAuthData tcOAuthData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                tcOAuthData = successResponse.tcOAuthData;
            }
            return successResponse.copy(tcOAuthData);
        }

        @org.jetbrains.annotations.NotNull
        /* renamed from: component1, reason: from getter */
        public final com.truecaller.android.sdk.oAuth.TcOAuthData getTcOAuthData() {
            return this.tcOAuthData;
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse copy(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthData tcOAuthData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcOAuthData, "tcOAuthData");
            return new com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse(tcOAuthData);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse) && kotlin.jvm.internal.Intrinsics.b(this.tcOAuthData, ((com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse) other).tcOAuthData);
        }

        @org.jetbrains.annotations.NotNull
        public final com.truecaller.android.sdk.oAuth.TcOAuthData getTcOAuthData() {
            return this.tcOAuthData;
        }

        public int hashCode() {
            return this.tcOAuthData.hashCode();
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return "SuccessResponse(tcOAuthData=" + this.tcOAuthData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
            this.tcOAuthData.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ OAuthResponse(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    private OAuthResponse(boolean z) {
        this.isSuccessful = z;
    }
}
