package com.truecaller.deeplink.handlers;

@com.truecaller.deeplink.AppHomeDeepLink
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/deeplink/handlers/FamilyGroupDeepLinkHandler;", "Lcom/airbnb/deeplinkdispatch/handler/DeepLinkHandler;", "Lcom/truecaller/deeplink/handlers/FamilyGroupDeepLinkHandler$bar;", "bar", "baz", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupDeepLinkHandler implements com.airbnb.deeplinkdispatch.handler.DeepLinkHandler<com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar> {

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler INSTANCE = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/deeplink/handlers/FamilyGroupDeepLinkHandler$bar;", "", "", "subscreen", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public static final /* data */ class bar {
        public final java.lang.String a;
        public final java.lang.String b;

        public bar(@com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "subscreen", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str, @com.airbnb.deeplinkdispatch.handler.DeeplinkParam(name = "source", type = com.airbnb.deeplinkdispatch.handler.DeepLinkParamType.Query) @org.jetbrains.annotations.Nullable java.lang.String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar)) {
                return false;
            }
            com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar) obj;
            return kotlin.jvm.internal.Intrinsics.b(this.a, barVar.a) && kotlin.jvm.internal.Intrinsics.b(this.b, barVar.b);
        }

        public final int hashCode() {
            java.lang.String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return y.o.e("Args(subscreen=", this.a, ", source=", this.b, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/truecaller/deeplink/handlers/FamilyGroupDeepLinkHandler$baz;", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: /home/user/tc_decoded/classes6.dex */
    public interface baz {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [wi.qux, java.lang.Object] */
    public final void handleDeepLink(android.content.Context context, java.lang.Object obj) {
        com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar barVar = (com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.bar) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "deepLinkArgs");
        tx.c0 c0Var = ((com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.FamilyGroupDeepLinkHandler.baz.class)).H.b;
        tx.w wVar = c0Var.a;
        android.content.Context context2 = (android.content.Context) wVar.I.get();
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlin.coroutines.CoroutineContext) wVar.P.get();
        pj1.bar barVar2 = (pj1.bar) wVar.I4.get();
        jm1.c cVar = (jm1.c) c0Var.h4.get();
        uq2.baz bazVar = (uq2.baz) wVar.Xb.get();
        oj1.qux quxVar = (oj1.qux) c0Var.i4.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "familyGroupApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "familyGroupRouter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "settingsRouter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "homeRouter");
        ?? obj2 = new java.lang.Object();
        ((wi.qux) obj2).a = context2;
        ((wi.qux) obj2).b = coroutineContext;
        ((wi.qux) obj2).c = barVar2;
        ((wi.qux) obj2).d = cVar;
        ((wi.qux) obj2).e = bazVar;
        ((wi.qux) obj2).f = quxVar;
        ((wi.qux) obj2).g = kotlin.LazyKt.lazy(new q10.bar((java.lang.Object) obj2, 21));
        fg3.h0.J((fg3.e0) ((kotlin.Lazy) ((wi.qux) obj2).g).getValue(), (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new q7.f((java.lang.Object) obj2, barVar.a, barVar.b, (df3.bar) null, 3), 3);
    }
}
