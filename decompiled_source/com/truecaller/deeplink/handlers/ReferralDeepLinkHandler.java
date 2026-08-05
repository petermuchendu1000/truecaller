package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/ReferralDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/ReferralDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ReferralDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.ReferralDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/ReferralDeepLinkHandler$bar;", "", "", "campaignId", "<init>", "(Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "c", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.NotNull java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "campaignId");
            this.a = str;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.bar) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return bar.t("Args(campaignId=", this.a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/ReferralDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        context.startActivity(((com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.ReferralDeepLinkHandler.baz.class)).z0().d(context).putExtra("c", barVar.a));
    }
}
