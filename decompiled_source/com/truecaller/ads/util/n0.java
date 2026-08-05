package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class n0 {
    public static final kotlin.Lazy a = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(25));
    public static final kotlin.Lazy b = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a(26));

    public static void a(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "throwable");
        if (((java.lang.Boolean) a.getValue()).booleanValue()) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(th);
        }
    }
}
