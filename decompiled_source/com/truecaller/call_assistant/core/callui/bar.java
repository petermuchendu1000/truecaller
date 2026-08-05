package com.truecaller.call_assistant.core.callui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar extends ff3.g implements kotlin.jvm.functions.Function2 {
    public com.truecaller.call_assistant.core.data.ScreenedCall A;
    public boolean B;
    public int C;
    public int D;
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.c E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ com.truecaller.call_assistant.core.callui.AssistantCallState G;
    public final /* synthetic */ java.lang.String H;
    public com.truecaller.call_assistant.core.callui.c x;
    public java.lang.Object y;
    public java.lang.Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bar(com.truecaller.call_assistant.core.callui.c cVar, boolean z, com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState, java.lang.String str, df3.bar barVar) {
        super(2, barVar);
        this.E = cVar;
        this.F = z;
        this.G = assistantCallState;
        this.H = str;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        return new com.truecaller.call_assistant.core.callui.bar(this.E, this.F, this.G, this.H, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((fg3.e0) obj, (df3.bar) obj2).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f9, code lost:
    
        if (r1 == r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.truecaller.call_assistant.core.callui.c cVar;
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall;
        java.lang.String fromNumber;
        com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState;
        java.lang.String str;
        boolean z;
        int i;
        long j;
        int i2;
        com.truecaller.call_assistant.core.callui.c cVar2;
        com.truecaller.call_assistant.core.data.ScreenedCall screenedCall2;
        java.lang.Object i3;
        ef3.bar barVar = ef3.bar.a;
        int i4 = this.D;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        screenedCall2 = (com.truecaller.call_assistant.core.data.ScreenedCall) this.y;
                        com.truecaller.call_assistant.core.callui.c cVar3 = this.x;
                        od.p.E(obj);
                        cVar2 = cVar3;
                        i3 = obj;
                        str = (java.lang.String) i3;
                        cn0.bar barVar2 = cVar2.f;
                        barVar2.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCall2, "screenedCall");
                        fg3.h0.J(barVar2, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b82.baz(barVar2, screenedCall2, str, (df3.bar) null), 3);
                        return kotlin.Unit.a;
                    }
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.C;
                com.truecaller.call_assistant.core.data.ScreenedCall screenedCall3 = (com.truecaller.call_assistant.core.data.ScreenedCall) this.z;
                str = (java.lang.String) this.y;
                cVar2 = this.x;
                od.p.E(obj);
                i2 = i5;
                screenedCall2 = screenedCall3;
                cVar2.P.e(kotlin.Unit.a);
                if (!cVar2.x.a()) {
                    pr0.e1 e1Var = cVar2.d;
                    java.lang.String id = screenedCall2.getId();
                    this.x = cVar2;
                    this.y = screenedCall2;
                    this.z = null;
                    this.C = i2;
                    this.D = 3;
                    i3 = e1Var.i(id, this);
                }
                cn0.bar barVar22 = cVar2.f;
                barVar22.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCall2, "screenedCall");
                fg3.h0.J(barVar22, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b82.baz(barVar22, screenedCall2, str, (df3.bar) null), 3);
                return kotlin.Unit.a;
            }
            i = this.C;
            z = this.B;
            com.truecaller.call_assistant.core.data.ScreenedCall screenedCall4 = this.A;
            java.lang.String str2 = (java.lang.String) this.z;
            assistantCallState = (com.truecaller.call_assistant.core.callui.AssistantCallState) this.y;
            cVar = this.x;
            od.p.E(obj);
            screenedCall = screenedCall4;
            str = str2;
        } else {
            od.p.E(obj);
            cVar = this.E;
            screenedCall = (com.truecaller.call_assistant.core.data.ScreenedCall) cVar.O.getValue();
            if (screenedCall != null) {
                nu0.a aVar = cVar.j;
                com.truecaller.data.entity.Number f = cVar.i.f(screenedCall.getFromNumber());
                if (f == null || (fromNumber = f.f) == null) {
                    fromNumber = screenedCall.getFromNumber();
                }
                long time = screenedCall.getCreatedAt().getTime();
                this.x = cVar;
                com.truecaller.call_assistant.core.callui.AssistantCallState assistantCallState2 = this.G;
                this.y = assistantCallState2;
                java.lang.String str3 = this.H;
                this.z = str3;
                this.A = screenedCall;
                boolean z2 = this.F;
                this.B = z2;
                this.C = 0;
                this.D = 1;
                if (aVar.b(fromNumber, time, 4, this) != barVar) {
                    assistantCallState = assistantCallState2;
                    str = str3;
                    z = z2;
                    i = 0;
                }
                return barVar;
            }
            return kotlin.Unit.a;
        }
        if (z) {
            if (!kotlin.jvm.internal.Intrinsics.b(assistantCallState, com.truecaller.call_assistant.core.callui.AssistantCallState.Incoming.INSTANCE) && !com.truecaller.call_assistant.core.callui.d.a(assistantCallState)) {
                j = 0;
            } else {
                j = 2000;
            }
            this.x = cVar;
            this.y = str;
            this.z = screenedCall;
            this.A = null;
            this.C = i;
            this.D = 2;
            if (fg3.h0.r(j, this) != barVar) {
                i2 = i;
                cVar2 = cVar;
                screenedCall2 = screenedCall;
                cVar2.P.e(kotlin.Unit.a);
                if (!cVar2.x.a()) {
                }
                cn0.bar barVar222 = cVar2.f;
                barVar222.getClass();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenedCall2, "screenedCall");
                fg3.h0.J(barVar222, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new b82.baz(barVar222, screenedCall2, str, (df3.bar) null), 3);
            }
            return barVar;
        }
        return kotlin.Unit.a;
    }
}
