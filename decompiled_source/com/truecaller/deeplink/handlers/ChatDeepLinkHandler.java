package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/ChatDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/ChatDeepLinkHandler$bar;", "bar", "baz", "aa1/bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ChatDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.ChatDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.ChatDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/deeplink/handlers/ChatDeepLinkHandler$bar;", "", "Lx91/p;", "id", "phoneNumber", "", "type", "text", "<init>", "(Lx91/p;Lx91/p;Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class bar {
        public final x91.p a;
        public final x91.p b;
        public final java.lang.String c;
        public final java.lang.String d;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "id", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable x91.p pVar, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "num", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable x91.p pVar2, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "type", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "text", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str2) {
            this.a = pVar;
            this.b = pVar2;
            this.c = str;
            this.d = str2;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/ChatDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:57:0x00e4
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public final void handleDeepLink(android.content.Context r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.truecaller.deeplink.handlers.ChatDeepLinkHandler.handleDeepLink(android.content.Context, java.lang.Object):void");
    }
}
