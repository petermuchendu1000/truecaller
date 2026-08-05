package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class l implements com.truecaller.ads.util.k, fg3.e0 {
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final fg3.r1 c;
    public volatile java.lang.String d;

    public l(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "asyncContext");
        this.a = context;
        this.b = coroutineContext;
        this.c = fg3.h0.c();
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(this, (df3.bar) null, 3), 3);
    }

    public final java.lang.String a() {
        java.lang.String str = this.d;
        if (str == null) {
            if (this.c.isActive()) {
                this.c.cancel((java.util.concurrent.CancellationException) null);
            }
            b();
            return this.d;
        }
        return str;
    }

    public final void b() {
        java.lang.String str = "";
        try {
            com.google.android.gms.ads.identifier.AdvertisingIdClient.Info advertisingIdInfo = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(this.a);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
            if (!advertisingIdInfo.isLimitAdTrackingEnabled()) {
                str = advertisingIdInfo.getId();
            }
        } catch (java.lang.Exception unused) {
        }
        this.d = str;
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return this.b.plus(this.c);
    }
}
