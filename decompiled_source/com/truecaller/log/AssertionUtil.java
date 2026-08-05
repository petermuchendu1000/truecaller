package com.truecaller.log;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AssertionUtil {
    private static final java.lang.String NOT_ON_MAIN_EXPLANATION = "Should be executing on main thread, but isn't!";
    private static final java.lang.String ON_MAIN_EXPLANATION = "Should NOT be executing on main thread, but is! Naughty naughty!!";
    private static boolean sDisableAsserts = false;
    private static boolean sIsDebugBuild;

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class AlwaysFatal {
        private AlwaysFatal() {
        }

        @org.jetbrains.annotations.Contract("_ -> fail")
        public static void fail(java.lang.String... strArr) {
            com.truecaller.log.AssertionUtil.reportMessages(strArr);
            com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
            com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
        }

        @org.jetbrains.annotations.Contract("true, _ -> fail")
        public static void isFalse(boolean z, java.lang.String... strArr) {
            if (z) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        @org.jetbrains.annotations.Contract("null, _ -> fail")
        public static void isNotNull(java.lang.Object obj, java.lang.String... strArr) {
            if (obj == null) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        @org.jetbrains.annotations.Contract("!null, _ -> fail")
        public static void isNull(java.lang.Object obj, java.lang.String... strArr) {
            if (obj != null) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        @org.jetbrains.annotations.Contract("false, _ -> fail")
        public static void isTrue(boolean z, java.lang.String... strArr) {
            if (!z) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        public static void notOnMainThread(java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.b()) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError("Should NOT be executing on main thread, but is! Naughty naughty!! " + com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        public static void onMainThread(java.lang.String... strArr) {
            if (!com.truecaller.log.AssertionUtil.b()) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError("Should be executing on main thread, but isn't! " + com.truecaller.log.AssertionUtil.summarize(strArr));
                com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(tcAssertionError);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }

        public static void shouldNeverHappen(java.lang.Throwable th, java.lang.String... strArr) {
            com.truecaller.log.AssertionUtil.reportMessages(strArr);
            com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
            tcAssertionError.initCause(th);
            com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
        }
    }

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class OnlyInDebug {
        private OnlyInDebug() {
        }

        public static void fail(java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.sIsDebugBuild) {
                com.truecaller.log.AssertionUtil.throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr)));
            }
        }

        public static void isTrue(boolean z, java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.sIsDebugBuild && !z) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr)));
            }
        }

        public static void notOnMainThread(java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.sIsDebugBuild && com.truecaller.log.AssertionUtil.b()) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError("Should NOT be executing on main thread, but is! Naughty naughty!! " + com.truecaller.log.AssertionUtil.summarize(strArr)));
            }
        }

        public static void onMainThread(java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.sIsDebugBuild && !com.truecaller.log.AssertionUtil.b()) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError("Should be executing on main thread, but isn't! " + com.truecaller.log.AssertionUtil.summarize(strArr)));
            }
        }

        public static void shouldNeverHappen(java.lang.Throwable th, java.lang.String... strArr) {
            if (com.truecaller.log.AssertionUtil.sIsDebugBuild) {
                com.truecaller.log.AssertionUtil.reportMessages(strArr);
                com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(com.truecaller.log.AssertionUtil.summarize(strArr));
                tcAssertionError.initCause(th);
                com.truecaller.log.AssertionUtil.throwHard(tcAssertionError);
            }
        }
    }

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class TcAssertionError extends java.lang.AssertionError {
        public /* synthetic */ TcAssertionError(java.lang.String str) {
            this((java.lang.Object) str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private TcAssertionError(java.lang.Object obj) {
            super(r0.toString());
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed test assertion (fatal)");
            if (obj == null) {
                str = ".";
            } else {
                str = ": " + obj.toString();
            }
            sb.append(str);
            com.truecaller.log.AssertionUtil.removeMyselfFromTopOfStacktrace(this);
        }
    }

    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static class TcDryAssertionError extends java.lang.AssertionError {
        public /* synthetic */ TcDryAssertionError(java.lang.String str) {
            this((java.lang.Object) str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private TcDryAssertionError(java.lang.Object obj) {
            super(r0.toString());
            java.lang.String str;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed test assertion (non-fatal)");
            if (obj == null) {
                str = ".";
            } else {
                str = ": " + obj.toString();
            }
            sb.append(str);
            com.truecaller.log.AssertionUtil.removeMyselfFromTopOfStacktrace(this);
        }
    }

    private AssertionUtil() {
    }

    public static /* bridge */ /* synthetic */ boolean b() {
        return isOnMainThread();
    }

    @org.jetbrains.annotations.Contract("true, _ -> fail")
    public static void isFalse(boolean z, java.lang.String... strArr) {
        if (!sDisableAsserts && z) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError(summarize(strArr)));
            }
        }
    }

    @org.jetbrains.annotations.Contract("null, _ -> fail")
    public static void isNotNull(java.lang.Object obj, java.lang.String... strArr) {
        if (!sDisableAsserts && obj == null) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError(summarize(strArr)));
            }
        }
    }

    @org.jetbrains.annotations.Contract("!null, _ -> fail")
    public static void isNull(java.lang.Object obj, java.lang.String... strArr) {
        if (!sDisableAsserts && obj != null) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError(summarize(strArr)));
            }
        }
    }

    private static boolean isOnMainThread() {
        if (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()) {
            return true;
        }
        return false;
    }

    @org.jetbrains.annotations.Contract("false, _ -> fail")
    public static void isTrue(boolean z, java.lang.String... strArr) {
        if (!sDisableAsserts && !z) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError(summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError(summarize(strArr)));
            }
        }
    }

    public static void notOnMainThread(java.lang.String... strArr) {
        if (!sDisableAsserts && isOnMainThread()) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError("Should NOT be executing on main thread, but is! Naughty naughty!! " + summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError("Should NOT be executing on main thread, but is! Naughty naughty!! " + summarize(strArr)));
            }
        }
    }

    public static void onMainThread(java.lang.String... strArr) {
        if (!sDisableAsserts && !isOnMainThread()) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError("Should be executing on main thread, but isn't! " + summarize(strArr)));
            } else {
                reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError("Should be executing on main thread, but isn't! " + summarize(strArr)));
            }
        }
    }

    public static void onSameThread(java.lang.Thread thread, java.lang.String... strArr) {
        if (!sDisableAsserts && java.lang.Thread.currentThread() != thread) {
            reportMessages(strArr);
            if (sIsDebugBuild) {
                throwHard(new com.truecaller.log.AssertionUtil.TcAssertionError("Must be executed on thread [" + thread.getName() + "] but was on thread [" + java.lang.Thread.currentThread().getName() + "] " + summarize(strArr)));
                return;
            }
            reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError("Should NOT be executing on main thread, but is! Naughty naughty!! " + summarize(strArr)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removeMyselfFromTopOfStacktrace(java.lang.Throwable th) {
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        java.lang.String canonicalName = com.truecaller.log.AssertionUtil.class.getCanonicalName();
        int i = 0;
        while (i < stackTrace.length - 1 && stackTrace[i].getClassName().startsWith(canonicalName)) {
            i++;
        }
        if (i > 0) {
            int length = stackTrace.length - i;
            java.lang.StackTraceElement[] stackTraceElementArr = new java.lang.StackTraceElement[length];
            java.lang.System.arraycopy(stackTrace, i, stackTraceElementArr, 0, length);
            th.setStackTrace(stackTraceElementArr);
        }
    }

    public static void report(java.lang.String... strArr) {
        if (sDisableAsserts) {
            return;
        }
        reportWithSummary(summarize(strArr), strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportMessages(java.lang.String... strArr) {
        for (java.lang.String str : strArr) {
            if (!sIsDebugBuild && !android.os.Debug.isDebuggerConnected()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "msg");
            }
        }
    }

    public static void reportThrowableButNeverCrash(java.lang.Throwable th) {
        if (sDisableAsserts) {
            return;
        }
        if (!sIsDebugBuild && !android.os.Debug.isDebuggerConnected()) {
            o82.a.C(th);
        } else {
            th.printStackTrace();
        }
    }

    public static void reportWeirdnessButNeverCrash(java.lang.String str) {
        shouldNeverHappen(new com.truecaller.log.AssertionUtil.TcDryAssertionError(str), new java.lang.String[0]);
    }

    public static void reportWithSummary(java.lang.String str, java.lang.String... strArr) {
        if (sDisableAsserts) {
            return;
        }
        reportMessages(strArr);
        reportThrowableButNeverCrash(new com.truecaller.log.AssertionUtil.TcDryAssertionError(str));
    }

    public static void setDisableAsserts(boolean z) {
        sDisableAsserts = z;
    }

    public static void setIsDebugBuild(boolean z) {
        sIsDebugBuild = z;
    }

    public static void shouldNeverHappen(java.lang.Throwable th, java.lang.String... strArr) {
        if (sDisableAsserts) {
            return;
        }
        reportMessages(strArr);
        if (sIsDebugBuild) {
            com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError = new com.truecaller.log.AssertionUtil.TcAssertionError(summarize(strArr));
            tcAssertionError.initCause(th);
            throwHard(tcAssertionError);
        } else {
            com.truecaller.log.AssertionUtil.TcDryAssertionError tcDryAssertionError = new com.truecaller.log.AssertionUtil.TcDryAssertionError(summarize(strArr));
            tcDryAssertionError.initCause(th);
            reportThrowableButNeverCrash(tcDryAssertionError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.NonNull
    public static java.lang.String summarize(@androidx.annotation.Nullable java.lang.String[] strArr) {
        java.lang.String str;
        if (strArr != null && strArr.length > 0 && (str = strArr[0]) != null) {
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void throwHard(final com.truecaller.log.AssertionUtil.TcAssertionError tcAssertionError) {
        if (sDisableAsserts) {
            return;
        }
        reportThrowableButNeverCrash(tcAssertionError);
        try {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.truecaller.log.AssertionUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    throw com.truecaller.log.AssertionUtil.TcAssertionError.this;
                }
            });
            throw tcAssertionError;
        } catch (java.lang.Throwable unused) {
            throw tcAssertionError;
        }
    }
}
