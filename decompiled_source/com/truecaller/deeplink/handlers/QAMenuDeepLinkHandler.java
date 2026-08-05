package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppDeepLink
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/truecaller/deeplink/handlers/QAMenuDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "", "Landroid/content/Context;", "context", "Lf6/k1;", "handleDeepLink", "(Landroid/content/Context;)Lf6/k1;", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QAMenuDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.QAMenuDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/QAMenuDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    @com.truecaller.deeplink.AppHomeDeepLink
    @org.jetbrains.annotations.NotNull
    public static final f6.k1 handleDeepLink(@org.jetbrains.annotations.NotNull android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getClass();
        f6.k1 e = ((com.truecaller.deeplink.handlers.QAMenuDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.QAMenuDeepLinkHandler.bar.class)).z0().e(context);
        if (m03.r.s(context)) {
            e.a(new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.qa.QMActivity.class));
        }
        return e;
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "deepLinkArgs");
        if (m03.r.s(context)) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.qa.QMActivity.class);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }
}
