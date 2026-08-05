package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/ContactEditorDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/ContactEditorDeepLinkHandler$bar;", "baz", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactEditorDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/deeplink/handlers/ContactEditorDeepLinkHandler$bar;", "", "Lx91/p;", "phoneNumber", "<init>", "(Lx91/p;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final class bar {
        public final x91.p a;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "tel", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable x91.p pVar) {
            this.a = pVar;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/ContactEditorDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.ContactEditorDeepLinkHandler.baz.class);
        x91.p pVar = barVar.a;
        if (pVar == null) {
            tx.w wVar2 = wVar;
            f6.k1 e = wVar2.z0().e(context);
            e.a.add(wi0.bar.m((a71.bar) wVar2.H.b.g4.get(), context, com.truecaller.contacteditor.api.Source.DEEP_LINK));
            e.d();
            return;
        }
        tx.w wVar3 = wVar;
        com.truecaller.data.entity.Contact f = ((p81.baz) ((p81.bar) wVar3.s4.get())).f(pVar.a);
        if (f != null) {
            a71.bar barVar2 = (a71.bar) wVar3.H.b.g4.get();
            com.truecaller.contacteditor.api.Source source = com.truecaller.contacteditor.api.Source.DEEP_LINK;
            barVar2.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f, "contact");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            android.content.Intent a = barVar2.a(context, f.E(), source, null);
            if (a != null) {
                f6.k1 e2 = wVar3.z0().e(context);
                e2.a.add(a);
                e2.d();
                return;
            }
        }
        java.lang.String str = pVar.a;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "phoneNumber");
        com.truecaller.contacteditor.api.model.ContactExtras contactExtras = new com.truecaller.contacteditor.api.model.ContactExtras((java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, kotlin.collections.x.c(new com.truecaller.contacteditor.api.model.PhoneNumber(str, 2, (java.lang.String) null)), kotlin.collections.h0.a, (java.lang.String) null, (com.truecaller.contacteditor.api.model.Job) null);
        f6.k1 e3 = wVar3.z0().e(context);
        e3.a.add(((a71.bar) wVar3.H.b.g4.get()).b(context, contactExtras, com.truecaller.contacteditor.api.Source.DEEP_LINK, null));
        e3.d();
    }
}
