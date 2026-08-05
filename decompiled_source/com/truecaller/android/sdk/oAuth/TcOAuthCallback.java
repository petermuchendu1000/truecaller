package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/truecaller/android/sdk/oAuth/TcOAuthCallback;", "", "onSuccess", "", "tcOAuthData", "Lcom/truecaller/android/sdk/oAuth/TcOAuthData;", "onFailure", "tcOAuthError", "Lcom/truecaller/android/sdk/oAuth/TcOAuthError;", "onVerificationRequired", "onSdkReady", "sdk-external_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface TcOAuthCallback {
    void onFailure(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError);

    void onSdkReady();

    void onSuccess(@org.jetbrains.annotations.NotNull com.truecaller.android.sdk.oAuth.TcOAuthData tcOAuthData);

    void onVerificationRequired(@org.jetbrains.annotations.Nullable com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError);
}
