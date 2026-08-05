package com.truecaller.push;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a {
    public final qc3.bar a;
    public final kotlin.coroutines.CoroutineContext b;
    public final qc3.bar c;

    public a(kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "accountManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "pushIdProvider");
        this.a = barVar;
        this.b = coroutineContext;
        this.c = barVar2;
    }

    public final boolean a(com.truecaller.push.qux quxVar) {
        if (!((n11.l) this.a.get()).j()) {
            return false;
        }
        if (quxVar == null) {
            quxVar = ((com.truecaller.push.c) this.c.get()).a();
        }
        if (quxVar == null) {
            w91.a.a(new java.lang.Object[]{com.truecaller.push.a.class.getName().concat(": push ID is NULL")});
            o82.a.C(new java.lang.RuntimeException());
            return false;
        }
        w91.a.a(new java.lang.Object[]{com.truecaller.push.a.class.getName() + ": push ID for registration: " + quxVar});
        wj3.k0 k0Var = null;
        try {
            k0Var = com.truecaller.push.f.b(com.truecaller.push.f.a(quxVar)).H();
        } catch (java.io.IOException unused) {
        } catch (java.lang.SecurityException e) {
            com.truecaller.log.AssertionUtil.shouldNeverHappen(e, new java.lang.String[0]);
        } catch (java.lang.Exception e2) {
            o82.a.C(e2);
        }
        if (k0Var == null) {
            return false;
        }
        return k0Var.a.k();
    }
}
