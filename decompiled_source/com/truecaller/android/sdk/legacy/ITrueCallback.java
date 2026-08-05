package com.truecaller.android.sdk.legacy;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface ITrueCallback {
    void onFailureProfileShared(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.TrueError trueError);

    void onSuccessProfileShared(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile trueProfile);

    void onVerificationRequired(com.truecaller.android.sdk.legacy.TrueError trueError);
}
