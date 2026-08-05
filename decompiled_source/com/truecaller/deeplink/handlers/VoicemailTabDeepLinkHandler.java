package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/VoicemailTabDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/VoicemailTabDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class VoicemailTabDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler INSTANCE = new java.lang.Object();
    public static final a11.a a = new a11.a(8);
    public static final java.util.Set b;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/deeplink/handlers/VoicemailTabDeepLinkHandler$bar;", "", "", "subview", "callId", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;
        public final java.lang.String b;
        public final java.lang.String c;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "subview", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "callId", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str2, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "source", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b) && kotlin.jvm.internal.Intrinsics.b(this.c, barVar.c);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return bar.v(this.c, ")", ro0.f.E("Args(subview=", this.a, ", callId=", this.b, ", source="));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/VoicemailTabDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler, java.lang.Object] */
    static {
        java.lang.String[] strArr = {"settings", "settings_custom_greeting"};
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "elements");
        b = kotlin.collections.v.l0(strArr);
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.VoicemailTabDeepLinkHandler.baz) a.invoke(context);
        fg3.h0.J(wVar.x0(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.truecaller.deeplink.handlers.f(wVar, context, barVar, null), 3);
    }
}
