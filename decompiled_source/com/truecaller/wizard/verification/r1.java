package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class r1 extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ com.truecaller.wizard.verification.s1 A;
    public long x;
    public long y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.truecaller.wizard.verification.s1 s1Var, df3.bar barVar) {
        super(1, barVar);
        this.A = s1Var;
    }

    public final df3.bar create(df3.bar barVar) {
        return new com.truecaller.wizard.verification.r1(this.A, barVar);
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        return create((df3.bar) obj).invokeSuspend(kotlin.Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (fg3.h0.W(r4, r10, r20) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object W;
        long j;
        long j2;
        ef3.bar barVar = ef3.bar.a;
        int i = this.z;
        com.truecaller.wizard.verification.s1 s1Var = this.A;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    od.p.E(obj);
                    return kotlin.Unit.a;
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.y;
            j = this.x;
            od.p.E(obj);
            W = obj;
        } else {
            od.p.E(obj);
            java.lang.String str = s1Var.O;
            if (str != null) {
                java.lang.String str2 = s1Var.T;
                if (str2 != null) {
                    java.lang.Long l = s1Var.R;
                    if (l != null) {
                        long longValue = l.longValue();
                        long j3 = s1Var.X + com.truecaller.wizard.verification.t1.b;
                        o02.baz bazVar = s1Var.D;
                        java.lang.String str3 = s1Var.N;
                        this.x = longValue;
                        this.y = j3;
                        this.z = 1;
                        W = fg3.h0.W((kotlin.coroutines.CoroutineContext) bazVar.b, new c73.o(str, longValue, str2, bazVar, j3, str3, null), this);
                        if (W != barVar) {
                            j = longValue;
                            j2 = j3;
                        }
                        return barVar;
                    }
                    throw new java.lang.IllegalStateException();
                }
                throw new java.lang.IllegalStateException();
            }
            throw new java.lang.IllegalStateException();
        }
        kotlin.coroutines.CoroutineContext coroutineContext = s1Var.d;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux quxVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.qux((yy.p2) W, s1Var, (df3.bar) null, 23);
        this.x = j;
        this.y = j2;
        this.z = 2;
    }
}
