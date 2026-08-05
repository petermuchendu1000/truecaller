package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/DetailsViewDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/DetailsViewDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/DetailsViewDeepLinkHandler$bar;", "", "Lx91/p;", "phoneNumber", "<init>", "(Lx91/p;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final x91.p a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "tel", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.NotNull x91.p pVar) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pVar, "phoneNumber");
            this.a = pVar;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.bar) && kotlin.jvm.internal.Intrinsics.b(this.a, ((com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.bar) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final java.lang.String toString() {
            return "Args(phoneNumber=" + this.a + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/DetailsViewDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        if (!(barVar.a instanceof x91.n)) {
            tx.w wVar = (com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.DetailsViewDeepLinkHandler.baz.class);
            f6.k1 e = wVar.z0().e(context);
            e.a.add(((nd1.bar) wVar.dm.get()).a(context, new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$Extras(new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$ContactData(null, null, null, barVar.a.a, null, null, 55, null), com.truecaller.detailsview.api.model.DetailsViewSource.DeepLink, null, 4, null, 20, null)));
            e.d();
        }
    }
}
