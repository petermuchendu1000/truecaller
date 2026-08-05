package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e1 extends ff3.g implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.wizard.verification.s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.truecaller.wizard.verification.s1 s1Var, int i, df3.bar barVar) {
        super(1, barVar);
        this.x = 0;
        this.z = s1Var;
        this.y = i;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.wizard.verification.e1(this.z, this.y, barVar);
            case 1:
                return new com.truecaller.wizard.verification.e1(this.z, barVar, 1);
            default:
                return new com.truecaller.wizard.verification.e1(this.z, barVar, 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j;
        int i = this.x;
        df3.bar barVar = null;
        com.truecaller.wizard.verification.s1 s1Var = this.z;
        switch (i) {
            case 0:
                int i2 = this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                com.truecaller.wizard.verification.s1 s1Var2 = this.z;
                if (s1Var2.c0) {
                    if (i2 == -1) {
                        j = java.util.concurrent.TimeUnit.SECONDS.toMillis(((wj2.b) s1Var2.x.get()).a.e(-1L, "reverseOtpSmsNoCallbackRetryDelaySeconds_49133"));
                    } else {
                        j = com.truecaller.wizard.verification.t1.a;
                    }
                    java.lang.Long l = new java.lang.Long(j);
                    df3.bar barVar3 = null;
                    if (l.longValue() <= 0) {
                        l = null;
                    }
                    if (l != null) {
                        lf2.r.m(s1Var2.J, (kotlin.coroutines.CoroutineContext) null, new com.truecaller.wizard.verification.x0(s1Var2, 7), new com.truecaller.wizard.verification.a1(s1Var2, l.longValue(), barVar3, 0), (com.truecaller.wizard.verification.g0) null, 9);
                    }
                } else if (i2 != -1) {
                    java.lang.String h = ((u03.g0) s1Var2.u).h(2132018846, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h, "getString(...)");
                    java.lang.String h2 = ((u03.g0) s1Var2.u).h(2132018847, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h2, "getString(...)");
                    java.lang.String h3 = ((u03.g0) s1Var2.u).h(2132019051, new java.lang.Object[0]);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(h3, "getString(...)");
                    s1Var2.w2(h, h2, h3, "SendSmsFailed", "NumberVerification");
                }
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar4 = ef3.bar.a;
                int i3 = this.y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    long millis = java.util.concurrent.TimeUnit.SECONDS.toMillis(2L);
                    this.y = 1;
                    if (fg3.h0.r(millis, this) == barVar4) {
                        return barVar4;
                    }
                }
                s1Var.E2(com.truecaller.wizard.verification.v1.a(s1Var.f0, null, com.truecaller.wizard.verification.d0.a, null, 5));
                s1Var.n.e0("WhatsAppMessageNotSent", "NumberVerification");
                return kotlin.Unit.a;
            default:
                ef3.bar barVar5 = ef3.bar.a;
                int i4 = this.y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    s1Var.c0 = true;
                    this.y = 1;
                    java.lang.Object W = fg3.h0.W(s1Var.b, new com.truecaller.wizard.verification.b1(s1Var, barVar, 3), this);
                    if (W != barVar5) {
                        W = kotlin.Unit.a;
                    }
                    if (W == barVar5) {
                        return barVar5;
                    }
                }
                return kotlin.Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(com.truecaller.wizard.verification.s1 s1Var, df3.bar barVar, int i) {
        super(1, barVar);
        this.x = i;
        this.z = s1Var;
    }
}
