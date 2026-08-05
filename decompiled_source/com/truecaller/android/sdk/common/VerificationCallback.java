package com.truecaller.android.sdk.common;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public interface VerificationCallback {
    public static final int TYPE_IM_OTP_INITIATED = 9;
    public static final int TYPE_IM_OTP_RECEIVED = 10;
    public static final int TYPE_MISSED_CALL_INITIATED = 3;
    public static final int TYPE_MISSED_CALL_RECEIVED = 4;
    public static final int TYPE_OTP_INITIATED = 1;
    public static final int TYPE_OTP_RECEIVED = 2;
    public static final int TYPE_PROFILE_VERIFIED_BEFORE = 6;
    public static final int TYPE_VERIFICATION_COMPLETE = 5;

    void onRequestFailure(int i, @androidx.annotation.NonNull com.truecaller.android.sdk.common.TrueException trueException);

    void onRequestSuccess(int i, @androidx.annotation.Nullable jd0.bar barVar);
}
