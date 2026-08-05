package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/DialpadPrefillDeeplinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/DialpadPrefillDeeplinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialpadPrefillDeeplinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/DialpadPrefillDeeplinkHandler$bar;", "", "Lx91/p;", "phoneNumber", "<init>", "(Lx91/p;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class bar {
        public final x91.p a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "tel", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable x91.p pVar) {
            this.a = pVar;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/DialpadPrefillDeeplinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        java.lang.String str;
        com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler.bar barVar = (com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        ((com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.DialpadPrefillDeeplinkHandler.baz.class)).z0().e(context);
        int i = com.truecaller.dialer.ui.DialerActivity.h0;
        x91.p pVar = barVar.a;
        if (pVar != null) {
            str = pVar.a;
        } else {
            str = null;
        }
        context.startActivity(b91.c.l(context, str, com.truecaller.common_call_log.data.FilterType.NONE, "clickToDialpadPrefill"));
    }
}
