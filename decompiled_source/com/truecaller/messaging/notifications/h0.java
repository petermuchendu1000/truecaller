package com.truecaller.messaging.notifications;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class h0 {
    public final android.content.Context a;
    public final com.truecaller.qa.x b;
    public final qo1.k c;
    public final u03.baz d;
    public final y12.o0 e;
    public final u03.z f;
    public final com.truecaller.messaging.notifications.k g;
    public final java.util.LinkedHashSet h;
    public long i;

    public h0(android.content.Context context, com.truecaller.qa.x xVar, qo1.k kVar, u03.baz bazVar, y12.o0 o0Var, u03.z zVar, xz1.q qVar, com.truecaller.messaging.notifications.k kVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "qaMenuSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o0Var, "readMessageStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zVar, "permissionUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kVar2, "searchHelper");
        this.a = context;
        this.b = xVar;
        this.c = kVar;
        this.d = bazVar;
        this.e = o0Var;
        this.f = zVar;
        this.g = kVar2;
        this.h = new java.util.LinkedHashSet();
        this.i = -1L;
    }

    public final com.truecaller.messaging.data.types.Conversation a(com.truecaller.messaging.data.types.Conversation conversation, com.truecaller.messaging.data.types.Message message) {
        return (com.truecaller.messaging.data.types.Conversation) kotlin.collections.CollectionsKt.U(this.g.b(kotlin.collections.q0.c(new kotlin.Pair(conversation, kotlin.collections.x.c(message)))).keySet());
    }
}
