package com.truecaller.deeplink.handlers;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public int A;
    public final /* synthetic */ tx.w B;
    public final /* synthetic */ com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler C;
    public final /* synthetic */ android.content.Context D;
    public final /* synthetic */ com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar E;
    public java.lang.String x;
    public com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler y;
    public android.content.Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(tx.w wVar, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler baseAssistantDeepLinkHandler, android.content.Context context, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.bar barVar, df3.bar barVar2) {
        super(2, barVar2);
        this.B = wVar;
        this.C = baseAssistantDeepLinkHandler;
        this.D = context;
        this.E = barVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.deeplink.handlers.qux(this.B, this.C, this.D, this.E, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r12 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        boolean booleanValue;
        com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler baseAssistantDeepLinkHandler;
        ef3.bar barVar = ef3.bar.a;
        int i = this.A;
        java.lang.String str2 = null;
        android.content.Context context = this.D;
        tx.w wVar = this.B;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        context = this.z;
                        baseAssistantDeepLinkHandler = this.y;
                        str = this.x;
                        od.p.E(obj);
                        if (!((java.lang.Boolean) obj).booleanValue() || kotlin.collections.CollectionsKt.N(com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a, str)) {
                            str2 = str;
                        }
                        com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a(baseAssistantDeepLinkHandler, context, str2);
                        return kotlin.Unit.a;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.x;
                od.p.E(obj);
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler baseAssistantDeepLinkHandler2 = this.C;
                if (!booleanValue) {
                    pr0.d0 d0Var = (pr0.k) wVar.q8.get();
                    this.x = str;
                    this.y = baseAssistantDeepLinkHandler2;
                    this.z = context;
                    this.A = 3;
                    obj = d0Var.q(this);
                    if (obj != barVar) {
                        baseAssistantDeepLinkHandler = baseAssistantDeepLinkHandler2;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                        str2 = str;
                        com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a(baseAssistantDeepLinkHandler, context, str2);
                        return kotlin.Unit.a;
                    }
                    return barVar;
                }
                if (!booleanValue) {
                    if (kotlin.jvm.internal.Intrinsics.b(str, "subscription")) {
                        str2 = "subscription";
                    }
                    com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a(baseAssistantDeepLinkHandler2, context, str2);
                }
                return kotlin.Unit.a;
            }
            od.p.E(obj);
        } else {
            od.p.E(obj);
            if (!((qo1.c) ((qo1.b) wVar.p8.get())).c()) {
                java.util.List list = com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
                ((com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz.class)).z0().e(context).d();
                return kotlin.Unit.a;
            }
            o43.qux quxVar = (o43.qux) wVar.Ej.get();
            this.A = 1;
            obj = quxVar.c(this);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            java.util.List list2 = com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            ((com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz) f40.d0.z(context, com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler.baz.class)).z0().e(context).d();
            return kotlin.Unit.a;
        }
        java.lang.String str3 = this.E.a;
        pr0.j0 j0Var = (pr0.j0) wVar.s8.get();
        this.x = str3;
        this.A = 2;
        java.lang.Object b = j0Var.b(this);
        if (b != barVar) {
            str = str3;
            obj = b;
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            com.truecaller.deeplink.handlers.BaseAssistantDeepLinkHandler baseAssistantDeepLinkHandler22 = this.C;
            if (!booleanValue) {
            }
        }
        return barVar;
    }
}
