package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.call_assistant.core.data.ScreenedCall A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String C;
    public final /* synthetic */ java.lang.String D;
    public int x;
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.c y;
    public final /* synthetic */ java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qux(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, com.truecaller.call_assistant.core.data.ScreenedCall screenedCall, java.lang.String str2, java.lang.String str3, java.lang.String str4, df3.bar barVar) {
        super(2, barVar);
        this.y = cVar;
        this.z = str;
        this.A = screenedCall;
        this.B = str2;
        this.C = str3;
        this.D = str4;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.call_assistant.core.callui.qux(this.y, this.z, this.A, this.B, this.C, this.D, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        boolean z;
        com.truecaller.call_assistant.core.callui.c cVar = this.y;
        android.content.Context context = cVar.a;
        ig3.h2 h2Var = cVar.O;
        pr0.e1 e1Var = cVar.d;
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        java.lang.String str3 = this.z;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            this.x = 1;
            obj = e1Var.g(str3, this);
            if (obj == barVar) {
                return barVar;
            }
        }
        r81.baz bazVar = (r81.baz) obj;
        if (bazVar != null) {
            str = bazVar.d;
        } else {
            str = null;
        }
        boolean b = kotlin.jvm.internal.Intrinsics.b(str, "completed");
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall = this.A;
        if (b) {
            java.lang.String str4 = bazVar.e;
            if (str4 != null && !str4.equals("user_hungup")) {
                return kotlin.Unit.a;
            }
            e1Var.l(str3, screenedCall.getMessages());
            return kotlin.Unit.a;
        }
        if (h2Var.getValue() == null) {
            z = false;
        } else {
            com.truecaller.call_assistant.core.data.ScreenedCall screenedCall2 = (com.truecaller.call_assistant.core.data.ScreenedCall) h2Var.getValue();
            if (screenedCall2 != null) {
                str2 = screenedCall2.getId();
            } else {
                str2 = null;
            }
            z = !kotlin.jvm.internal.Intrinsics.b(str2, str3);
        }
        if (z) {
            return kotlin.Unit.a;
        }
        h2Var.getClass();
        h2Var.p((java.lang.Object) null, screenedCall);
        e1Var.k(screenedCall);
        if (kotlin.jvm.internal.Intrinsics.b(this.B, "completed")) {
            com.truecaller.call_assistant.core.callui.c.v(cVar, this.C, this.D, 1);
            return kotlin.Unit.a;
        }
        cVar.r(com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming.INSTANCE);
        if (!cVar.t()) {
            long j = rn0.k.b;
            java.lang.String string = context.getString(2132017535);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            fg3.k2 k2Var = cVar.L;
            if (k2Var != null) {
                k2Var.cancel((java.util.concurrent.CancellationException) null);
            }
            cVar.L = fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b2.e(j, cVar, "user_timeout", string, (df3.bar) null), 3);
        }
        cVar.A(screenedCall);
        boolean z2 = com.truecaller.call_assistant.core.service.AssistantCallUIService.l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (!com.truecaller.call_assistant.core.service.AssistantCallUIService.l) {
            ak.r0.g0(context, new android.content.Intent(context, (java.lang.Class<?>) com.truecaller.call_assistant.core.service.AssistantCallUIService.class));
        }
        return kotlin.Unit.a;
    }
}
