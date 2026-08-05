package com.truecaller.android.sdk.oAuth;

@androidx.annotation.Keep
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TcSdk {
    private static com.truecaller.android.sdk.oAuth.TcSdk sInstance;
    private final com.truecaller.android.sdk.oAuth.bar mTcClientManager;
    private static volatile com.truecaller.android.sdk.oAuth.u state = com.truecaller.android.sdk.oAuth.u.a;
    private static com.truecaller.android.sdk.oAuth.TcOAuthCallback initCallback = null;
    private static final java.lang.Object LOCK = new java.lang.Object();
    private static java.util.concurrent.ExecutorService initExecutorService = java.util.concurrent.Executors.newSingleThreadExecutor();
    private static final android.os.Handler callbackHandler = new android.os.Handler(android.os.Looper.getMainLooper());

    private TcSdk(@androidx.annotation.NonNull com.truecaller.android.sdk.oAuth.bar barVar) {
        this.mTcClientManager = barVar;
    }

    private static void changeStateAndRunFailure(com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError) {
        com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback;
        synchronized (LOCK) {
            state = com.truecaller.android.sdk.oAuth.u.d;
            tcOAuthCallback = initCallback;
            initCallback = null;
        }
        runFailure(tcOAuthCallback, tcOAuthError);
    }

    private static void changeStateAndRunSuccess(com.truecaller.android.sdk.oAuth.TcSdk tcSdk) {
        com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback;
        synchronized (LOCK) {
            sInstance = tcSdk;
            state = com.truecaller.android.sdk.oAuth.u.c;
            tcOAuthCallback = initCallback;
            initCallback = null;
        }
        runSuccess(tcOAuthCallback);
    }

    public static void clear() {
        synchronized (LOCK) {
            try {
                state = com.truecaller.android.sdk.oAuth.u.a;
                initCallback = null;
                initExecutorService.shutdownNow();
                initExecutorService = java.util.concurrent.Executors.newSingleThreadExecutor();
                callbackHandler.removeCallbacksAndMessages(null);
                com.truecaller.android.sdk.oAuth.TcSdk tcSdk = sInstance;
                if (tcSdk != null) {
                    qd0.bar barVar = tcSdk.mTcClientManager.a;
                    if (barVar != null && barVar.c == 2) {
                        qd0.qux quxVar = (qd0.qux) barVar;
                        k92.j jVar = quxVar.o;
                        if (jVar != null) {
                            jVar.U();
                            k92.j jVar2 = quxVar.o;
                            com.truecaller.sdk.d dVar = (com.truecaller.sdk.d) jVar2.c;
                            if (dVar != null) {
                                dVar.cancel();
                            }
                            jVar2.c = null;
                            quxVar.o = null;
                        }
                        if (quxVar.m != null) {
                            quxVar.g();
                            quxVar.m = null;
                        }
                        android.os.Handler handler = quxVar.n;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                            quxVar.n = null;
                        }
                    }
                    sInstance.mTcClientManager.a = null;
                    com.truecaller.android.sdk.oAuth.bar.b = null;
                    sInstance = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static com.truecaller.android.sdk.oAuth.TcSdk getInstance() throws java.lang.RuntimeException {
        com.truecaller.android.sdk.oAuth.TcSdk tcSdk = sInstance;
        if (tcSdk != null) {
            return tcSdk;
        }
        throw new java.lang.RuntimeException("Please call init() on TcSdk first");
    }

    public static void initAsync(@androidx.annotation.NonNull com.truecaller.android.sdk.oAuth.TcSdkOptions tcSdkOptions) {
        synchronized (LOCK) {
            try {
                if (state == com.truecaller.android.sdk.oAuth.u.c) {
                    runSuccess(tcSdkOptions.callback);
                    return;
                }
                if (state == com.truecaller.android.sdk.oAuth.u.d) {
                    runFailure(tcSdkOptions.callback, com.truecaller.android.sdk.oAuth.TcOAuthError.SdkInitError.INSTANCE);
                    state = com.truecaller.android.sdk.oAuth.u.a;
                    return;
                }
                initCallback = tcSdkOptions.callback;
                com.truecaller.android.sdk.oAuth.u uVar = state;
                com.truecaller.android.sdk.oAuth.u uVar2 = com.truecaller.android.sdk.oAuth.u.b;
                if (uVar == uVar2) {
                    return;
                }
                state = uVar2;
                initExecutorService.execute(new com.mbridge.msdk.config.component.common.network.connect.socket.bar(tcSdkOptions, 7));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initAsync$0(com.truecaller.android.sdk.oAuth.TcSdkOptions tcSdkOptions) {
        try {
            com.truecaller.android.sdk.oAuth.TcSdk tcSdk = new com.truecaller.android.sdk.oAuth.TcSdk(com.truecaller.android.sdk.oAuth.bar.a(tcSdkOptions));
            if (!tcSdk.isOAuthFlowUsable()) {
                changeStateAndRunFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.DefaultError.INSTANCE);
            } else {
                changeStateAndRunSuccess(tcSdk);
            }
        } catch (java.lang.Throwable unused) {
            changeStateAndRunFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.SdkInitError.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logCallbackError(java.lang.String str, java.lang.Throwable th) {
    }

    private static void runFailure(com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback, com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError) {
        if (tcOAuthCallback != null) {
            callbackHandler.post(new com.google.android.gms.internal.play_billing.m0(5, tcOAuthCallback, tcOAuthError));
        }
    }

    private static void runSuccess(com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback) {
        if (tcOAuthCallback != null) {
            callbackHandler.post(new androidx.lifecycle.i0(tcOAuthCallback, 13));
        }
    }

    public void getAuthorizationCode(@androidx.annotation.NonNull android.app.Activity activity, @androidx.annotation.NonNull g.baz bazVar) {
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 1) {
                qd0.baz bazVar2 = (qd0.baz) barVar;
                java.lang.String str = bazVar2.i;
                if (str != null && !str.trim().isEmpty()) {
                    java.lang.String[] strArr = bazVar2.g;
                    if (strArr != null && strArr.length != 0) {
                        java.lang.String str2 = bazVar2.h;
                        if (str2 != null && !str2.trim().isEmpty()) {
                            try {
                                android.content.Intent h = bazVar2.h(activity);
                                if (h == null) {
                                    bazVar2.i(activity, com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerNotInstalledError.INSTANCE);
                                    return;
                                } else {
                                    bazVar.a(h, (ea.c) null);
                                    return;
                                }
                            } catch (android.content.ActivityNotFoundException unused) {
                                bazVar2.b.onFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerActivityNotFoundError.INSTANCE);
                                return;
                            }
                        }
                        throw new java.lang.RuntimeException("OAuth state cannot be null or empty");
                    }
                    throw new java.lang.RuntimeException("OAuth scopes cannot be null or empty");
                }
                throw new java.lang.RuntimeException("Code challenge cannot be null or empty");
            }
            id0.baz.c(activity);
            jd0.qux quxVar = ((qd0.qux) barVar).j;
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

    public boolean isOAuthFlowUsable() {
        if (this.mTcClientManager.a != null) {
            return true;
        }
        return false;
    }

    public boolean onActivityResultObtained(@androidx.annotation.NonNull android.app.Activity activity, int i, @androidx.annotation.Nullable android.content.Intent intent) {
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 1) {
                qd0.baz bazVar = (qd0.baz) barVar;
                com.truecaller.android.sdk.oAuth.TcOAuthCallback tcOAuthCallback = bazVar.b;
                if (intent != null && intent.getExtras() != null) {
                    com.truecaller.android.sdk.oAuth.OAuthResponse oAuthResponse = (com.truecaller.android.sdk.oAuth.OAuthResponse) intent.getParcelableExtra(com.truecaller.android.sdk.oAuth.OAuthResponse.OAUTH_RESPONSE_EXTRA);
                    if (oAuthResponse == null) {
                        tcOAuthCallback.onFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.RequestCodeCollisionError.INSTANCE);
                        return false;
                    }
                    if (-1 == i && oAuthResponse.getIsSuccessful()) {
                        tcOAuthCallback.onSuccess(((com.truecaller.android.sdk.oAuth.OAuthResponse.SuccessResponse) oAuthResponse).getTcOAuthData());
                        return true;
                    }
                    com.truecaller.android.sdk.oAuth.TcOAuthError tcOAuthError = ((com.truecaller.android.sdk.oAuth.OAuthResponse.FailureResponse) oAuthResponse).getTcOAuthError();
                    if (tcOAuthError != com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedError.INSTANCE && tcOAuthError != com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedByPressingFooterError.INSTANCE && tcOAuthError != com.truecaller.android.sdk.oAuth.TcOAuthError.UserDeniedWhileLoadingError.INSTANCE && tcOAuthError != com.truecaller.android.sdk.oAuth.TcOAuthError.InvalidAccountStateError.INSTANCE) {
                        tcOAuthCallback.onFailure(tcOAuthError);
                        return true;
                    }
                    bazVar.i(activity, tcOAuthError);
                    return true;
                }
                tcOAuthCallback.onFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerClosedError.INSTANCE);
                return false;
            }
            return false;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void requestVerification(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull com.truecaller.android.sdk.common.VerificationCallback verificationCallback, @androidx.annotation.NonNull android.app.Activity activity) {
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                qd0.qux quxVar = (qd0.qux) barVar;
                id0.baz.a(activity);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "phoneNumber");
                if (id0.baz.b.matcher(str2).matches()) {
                    quxVar.j.a(quxVar.h, quxVar.d, str, str2, id0.baz.b(activity), quxVar.l, verificationCallback, ll.baz.n(ll.baz.s(activity, activity.getPackageName())));
                    return;
                }
                throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_INVALID_NUMBER);
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setCodeChallenge(@androidx.annotation.NonNull java.lang.String str) {
        if (isOAuthFlowUsable()) {
            this.mTcClientManager.a.i = str;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setLocale(@androidx.annotation.NonNull java.util.Locale locale) {
        if (isOAuthFlowUsable()) {
            this.mTcClientManager.a.e = locale;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setOAuthScopes(@androidx.annotation.NonNull java.lang.String[] strArr) {
        if (isOAuthFlowUsable()) {
            this.mTcClientManager.a.g = strArr;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setOAuthState(@androidx.annotation.NonNull java.lang.String str) {
        if (isOAuthFlowUsable()) {
            this.mTcClientManager.a.h = str;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void setTheme(@androidx.annotation.NonNull int i) {
        if (isOAuthFlowUsable()) {
            this.mTcClientManager.a.f = i;
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void verifyMissedCall(@androidx.annotation.NonNull com.truecaller.android.sdk.common.models.TrueProfile trueProfile, @androidx.annotation.NonNull com.truecaller.android.sdk.common.VerificationCallback verificationCallback) {
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                qd0.qux quxVar = (qd0.qux) barVar;
                jd0.qux quxVar2 = quxVar.j;
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
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 2) {
                qd0.qux quxVar = (qd0.qux) barVar;
                quxVar.j.b(trueProfile, str, quxVar.d, verificationCallback);
                return;
            }
            return;
        }
        throw new java.lang.RuntimeException(com.truecaller.android.sdk.common.TrueException.TYPE_CLIENT_MISSING);
    }

    public void getAuthorizationCode(@androidx.annotation.NonNull androidx.fragment.app.Fragment fragment, @androidx.annotation.NonNull g.baz bazVar) {
        if (isOAuthFlowUsable()) {
            qd0.bar barVar = this.mTcClientManager.a;
            if (barVar.c == 1) {
                qd0.baz bazVar2 = (qd0.baz) barVar;
                java.lang.String str = bazVar2.i;
                if (str != null && !str.trim().isEmpty()) {
                    java.lang.String[] strArr = bazVar2.g;
                    if (strArr != null && strArr.length != 0) {
                        java.lang.String str2 = bazVar2.h;
                        if (str2 != null && !str2.trim().isEmpty()) {
                            androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
                            if (activity != null) {
                                try {
                                    android.content.Intent h = bazVar2.h(activity);
                                    if (h == null) {
                                        bazVar2.i(activity, com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerNotInstalledError.INSTANCE);
                                        return;
                                    } else {
                                        bazVar.a(h, (ea.c) null);
                                        return;
                                    }
                                } catch (android.content.ActivityNotFoundException unused) {
                                    bazVar2.b.onFailure(com.truecaller.android.sdk.oAuth.TcOAuthError.TruecallerActivityNotFoundError.INSTANCE);
                                    return;
                                }
                            }
                            return;
                        }
                        throw new java.lang.RuntimeException("OAuth state cannot be null or empty");
                    }
                    throw new java.lang.RuntimeException("OAuth scopes cannot be null or empty");
                }
                throw new java.lang.RuntimeException("Code challenge cannot be null or empty");
            }
            id0.baz.c(fragment.getActivity());
            jd0.qux quxVar = ((qd0.qux) barVar).j;
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
