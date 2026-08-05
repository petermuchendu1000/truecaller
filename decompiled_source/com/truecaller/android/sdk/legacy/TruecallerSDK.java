package com.truecaller.android.sdk.legacy;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TruecallerSDK {
    public static final int SHARE_PROFILE_REQUEST_CODE = 100;
    private static com.truecaller.android.sdk.legacy.TruecallerSDK sInstance;
    private final com.truecaller.android.sdk.legacy.bar mTcClientManager;

    private TruecallerSDK(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.bar barVar) {
        this.mTcClientManager = barVar;
    }

    public static void clear() {
        com.truecaller.android.sdk.legacy.TruecallerSDK truecallerSDK = sInstance;
        if (truecallerSDK != null) {
            pd0.bar barVar = truecallerSDK.mTcClientManager.a;
            if (barVar != null && barVar.c == 2) {
                pd0.qux quxVar = (pd0.qux) barVar;
                if (quxVar.k != null) {
                    quxVar.g();
                    quxVar.k = null;
                }
                android.os.Handler handler = quxVar.l;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                    quxVar.l = null;
                }
            }
            sInstance.mTcClientManager.a = null;
            com.truecaller.android.sdk.legacy.bar.b = null;
            sInstance = null;
        }
    }

    public static com.truecaller.android.sdk.legacy.TruecallerSDK getInstance() throws java.lang.RuntimeException {
        com.truecaller.android.sdk.legacy.TruecallerSDK truecallerSDK = sInstance;
        if (truecallerSDK != null) {
            return truecallerSDK;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_SDK_NOT_INITIALIZED);
    }

    public static synchronized void init(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.TruecallerSdkScope truecallerSdkScope) {
        synchronized (com.truecaller.android.sdk.legacy.TruecallerSDK.class) {
            sInstance = new com.truecaller.android.sdk.legacy.TruecallerSDK(com.truecaller.android.sdk.legacy.bar.a(truecallerSdkScope));
        }
    }

    public void getUserProfile(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity fragmentActivity) {
        if (isUsable()) {
            pd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 1) {
                pd0.baz bazVar = (pd0.baz) barVar;
                try {
                    android.content.Intent h = bazVar.h(fragmentActivity);
                    if (h == null) {
                        bazVar.i(fragmentActivity, 11);
                        return;
                    } else {
                        fragmentActivity.startActivityForResult(h, 100);
                        return;
                    }
                } catch (android.content.ActivityNotFoundException unused) {
                    bazVar.i(fragmentActivity, 15);
                    return;
                }
            }
            id0.baz.c(fragmentActivity);
            jd0.qux quxVar = ((pd0.qux) barVar).h;
            com.truecaller.android.sdk.legacy.ITrueCallback iTrueCallback = quxVar.c;
            if (iTrueCallback != null) {
                iTrueCallback.onVerificationRequired(null);
                return;
            }
            com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback = quxVar.d;
            if (tcOAuthCallback != null) {
                tcOAuthCallback.onVerificationRequired(null);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public boolean isUsable() {
        if (this.mTcClientManager.a != null) {
            return true;
        }
        return false;
    }

    public boolean onActivityResultObtained(@androidx.annotation.NonNull androidx.fragment.app.FragmentActivity fragmentActivity, int i, int i2, @androidx.annotation.Nullable android.content.Intent intent) {
        com.truecaller.android.sdk.legacy.TrueResponse trueResponse;
        if (i == 100) {
            if (isUsable()) {
                pd0.bar barVar = this.mTcClientManager.a;
                if (barVar.c == 1) {
                    pd0.baz bazVar = (pd0.baz) barVar;
                    if (intent != null && intent.getExtras() != null) {
                        android.os.Bundle extras = intent.getExtras();
                        if (extras.containsKey(com.truecaller.android.sdk.legacy.TrueResponse.TRUESDK_VERSION)) {
                            trueResponse = new com.truecaller.android.sdk.legacy.TrueResponse(extras);
                        } else {
                            trueResponse = (com.truecaller.android.sdk.legacy.TrueResponse) extras.getParcelable(com.truecaller.android.sdk.legacy.TrueResponse.TRUECALLER_RESPONSE_EXTRA);
                        }
                        if (trueResponse == null) {
                            bazVar.b.onFailureProfileShared(new com.truecaller.android.sdk.legacy.TrueError(7));
                            return false;
                        }
                        if (-1 == i2) {
                            com.truecaller.android.sdk.common.models.TrueProfile trueProfile = trueResponse.trueProfile;
                            if (trueProfile != null) {
                                bazVar.b.onSuccessProfileShared(trueProfile);
                                return true;
                            }
                        } else {
                            com.truecaller.android.sdk.legacy.TrueError trueError = trueResponse.trueError;
                            if (trueError != null) {
                                int errorType = trueError.getErrorType();
                                if (errorType != 10 && errorType != 2 && errorType != 14 && errorType != 13) {
                                    bazVar.b.onFailureProfileShared(trueError);
                                    return true;
                                }
                                bazVar.i(fragmentActivity, errorType);
                            }
                        }
                        return true;
                    }
                    bazVar.b.onFailureProfileShared(new com.truecaller.android.sdk.legacy.TrueError(5));
                }
            } else {
                throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
            }
        }
        return false;
    }

    public void requestVerification(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull com.truecaller.android.sdk.common.VerificationCallback verificationCallback, @androidx.annotation.NonNull androidx.fragment.app.FragmentActivity fragmentActivity) {
        if (isUsable()) {
            pd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                pd0.qux quxVar = (pd0.qux) barVar;
                id0.baz.a(fragmentActivity);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                if (id0.baz.b.matcher(str2).matches()) {
                    java.lang.String s = lk3.bar.s(fragmentActivity);
                    jd0.qux quxVar2 = quxVar.h;
                    if (android.text.TextUtils.isEmpty(quxVar.e)) {
                        quxVar.e = java.util.UUID.randomUUID().toString();
                    }
                    quxVar2.a(quxVar.e, quxVar.d, str, str2, id0.baz.b(fragmentActivity), quxVar.j, verificationCallback, s);
                    return;
                }
                throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_INVALID_NUMBER);
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setLocale(@androidx.annotation.NonNull java.util.Locale locale) {
        if (isUsable()) {
            this.mTcClientManager.a.f = locale;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setRequestNonce(@androidx.annotation.NonNull java.lang.String str) {
        if (isUsable()) {
            this.mTcClientManager.a.e = str;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setTheme(@androidx.annotation.NonNull int i) {
        if (isUsable()) {
            this.mTcClientManager.a.g = i;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void updateCallback(@androidx.annotation.NonNull com.truecaller.android.sdk.legacy.ITrueCallback iTrueCallback) {
        if (isUsable()) {
            com.truecaller.android.sdk.legacy.bar.b.a.b = iTrueCallback;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void verifyMissedCall(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile trueProfile, @androidx.annotation.NonNull com.truecaller.android.sdk.common.VerificationCallback verificationCallback) {
        if (isUsable()) {
            pd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                pd0.qux quxVar = (pd0.qux) barVar;
                jd0.qux quxVar2 = quxVar.h;
                java.lang.String str = quxVar.d;
                java.lang.String str2 = quxVar2.k;
                if (str2 != null) {
                    quxVar2.b(trueProfile, str2, str, verificationCallback);
                    return;
                } else {
                    verificationCallback.onRequestFailure(5, new com.truecaller.android.sdk.common.TrueException(3, com.truecaller.android.sdk.common.TrueException.TYPE_MISSING_CREATE_CALL_MESSAGE));
                    return;
                }
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void verifyOtp(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile trueProfile, @androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull com.truecaller.android.sdk.common.VerificationCallback verificationCallback) {
        if (isUsable()) {
            pd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                pd0.qux quxVar = (pd0.qux) barVar;
                quxVar.h.b(trueProfile, str, quxVar.d, verificationCallback);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void getUserProfile(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment) {
        if (isUsable()) {
            pd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 1) {
                pd0.baz bazVar = (pd0.baz) barVar;
                androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    try {
                        android.content.Intent h = bazVar.h(activity);
                        if (h == null) {
                            bazVar.i(activity, 11);
                            return;
                        } else {
                            fragment.startActivityForResult(h, 100);
                            return;
                        }
                    } catch (android.content.ActivityNotFoundException unused) {
                        bazVar.i(activity, 15);
                        return;
                    }
                }
                return;
            }
            id0.baz.c(fragment.getActivity());
            jd0.qux quxVar = ((pd0.qux) barVar).h;
            com.truecaller.android.sdk.legacy.ITrueCallback iTrueCallback = quxVar.c;
            if (iTrueCallback != null) {
                iTrueCallback.onVerificationRequired(null);
                return;
            }
            com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback = quxVar.d;
            if (tcOAuthCallback != null) {
                tcOAuthCallback.onVerificationRequired(null);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }
}
