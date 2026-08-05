package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/truecaller/deeplink/handlers/MessagingShortcutDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "", "bar", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MessagingShortcutDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<java.lang.Object> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.MessagingShortcutDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/MessagingShortcutDeepLinkHandler$bar;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface bar {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [qx2.s0, java.lang.Object, ci3.m] */
    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        qx2.lh lhVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "deepLinkArgs");
        tx.w wVar = (com.truecaller.deeplink.handlers.MessagingShortcutDeepLinkHandler.bar) f40.d0.z(context, com.truecaller.deeplink.handlers.MessagingShortcutDeepLinkHandler.bar.class);
        context.startActivity(wi0.bar.f(wVar.z0(), context, com.truecaller.bottombar.BottomBarButtonType.MESSAGES, "deepLink", (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) null, 120));
        java.lang.Object obj2 = wVar.u9.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        ro0.f.R((s03.bar) obj2, 3);
        nc0.a aVar = (nc0.bar) wVar.Y.get();
        bi3.y0 y0Var = qx2.s0.c;
        hi3.a aVar2 = qx2.s0.d;
        bi3.j0[] j0VarArr = (bi3.j0[]) y0Var.v().toArray(new bi3.j0[0]);
        boolean[] zArr = new boolean[j0VarArr.length];
        try {
            ?? obj3 = new java.lang.Object();
            com.truecaller.tracking.events.ClientHeaderV2 clientHeaderV2 = null;
            if (zArr[0]) {
                lhVar = null;
            } else {
                bi3.j0 j0Var = j0VarArr[0];
                lhVar = (qx2.lh) aVar2.g(j0Var.f, aVar2.j(j0Var));
            }
            ((qx2.s0) obj3).a = lhVar;
            if (!zArr[1]) {
                bi3.j0 j0Var2 = j0VarArr[1];
                clientHeaderV2 = (com.truecaller.tracking.events.ClientHeaderV2) aVar2.g(j0Var2.f, aVar2.j(j0Var2));
            }
            ((qx2.s0) obj3).b = clientHeaderV2;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue((java.lang.Object) obj3, "build(...)");
            aVar.c((ci3.m) obj3);
        } catch (bi3.bar e) {
            throw e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }
}
