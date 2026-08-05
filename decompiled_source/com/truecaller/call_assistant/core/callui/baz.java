package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;
    public final /* synthetic */ java.lang.String C;
    public final /* synthetic */ boolean D;
    public int x;
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.c y;
    public final /* synthetic */ java.lang.String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baz(com.truecaller.call_assistant.core.callui.c cVar, java.lang.String str, int i, java.lang.String str2, java.lang.String str3, boolean z, df3.bar barVar) {
        super(2, barVar);
        this.y = cVar;
        this.z = str;
        this.A = i;
        this.B = str2;
        this.C = str3;
        this.D = z;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.call_assistant.core.callui.baz(this.y, this.z, this.A, this.B, this.C, this.D, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object W;
        ef3.bar barVar = ef3.bar.a;
        int i = this.x;
        com.truecaller.call_assistant.core.callui.c cVar = this.y;
        if (i != 0) {
            if (i == 1) {
                od.p.E(obj);
                W = obj;
            } else {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            od.p.E(obj);
            pr0.e1 e1Var = cVar.d;
            this.x = 1;
            W = fg3.h0.W(e1Var.b, new fl2.d(this.z, this.B, e1Var, this.A, this.C, (df3.bar) null, 10), this);
            if (W == barVar) {
                return barVar;
            }
        }
        com.truecaller.call_assistant.core.data.SendResponseActionResponseDto sendResponseActionResponseDto = (com.truecaller.call_assistant.core.data.SendResponseActionResponseDto) W;
        if (sendResponseActionResponseDto != null && sendResponseActionResponseDto.getSuccess()) {
            if (this.D) {
                com.truecaller.call_assistant.core.callui.c.q(cVar, "user_hungup", null);
            } else if (!kotlin.jvm.internal.Intrinsics.b(cVar.N.getValue(), com.truecaller.call_assistant.core.callui.AssistantCallState.Disconnected.INSTANCE) && !cVar.t()) {
                long j = rn0.k.a;
                java.lang.String string = cVar.a.getString(2132017291);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                fg3.k2 k2Var = cVar.L;
                if (k2Var != null) {
                    k2Var.cancel((java.util.concurrent.CancellationException) null);
                }
                cVar.L = fg3.h0.J(cVar, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b2.e(j, cVar, "caller_timeout", string, (df3.bar) null), 3);
            }
        }
        return kotlin.Unit.a;
    }
}
