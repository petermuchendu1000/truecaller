package com.truecaller.blockinglevel.presentation;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k implements gf2.y, fg3.e0 {
    public final /* synthetic */ int a = 1;
    public final kotlin.coroutines.CoroutineContext b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;

    public k(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "announcementStubManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "announcementRequestBuilder");
        this.c = context;
        this.b = coroutineContext;
        this.d = barVar;
        this.e = barVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object a(ff3.qux quxVar) {
        dm2.bar barVar;
        int i;
        ef0.j jVar;
        if (quxVar instanceof dm2.bar) {
            barVar = (dm2.bar) quxVar;
            int i2 = barVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = barVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    bf2.qux quxVar2 = new bf2.qux(this, (df3.bar) null, 5);
                    barVar.z = 1;
                    obj = yi3.bar.T(this.b, quxVar2, barVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                jVar = (ef0.j) obj;
                if (jVar == null) {
                    return new rl2.c(dm2.a.a.invoke(jVar.b()));
                }
                return new rl2.b(new nl2.bar((android.content.Context) this.c));
            }
        }
        barVar = new dm2.bar(this, quxVar);
        java.lang.Object obj2 = barVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = barVar.z;
        if (i == 0) {
        }
        jVar = (ef0.j) obj2;
        if (jVar == null) {
        }
    }

    public void c(gf2.x xVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xVar, "state");
        fg3.h0.J(this, (kotlin.coroutines.CoroutineContext) null, (fg3.f0) null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.qux(xVar, this, (df3.bar) null, 22), 3);
    }

    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b.plus(new ag2.o(fg3.c0.a, 2));
        }
    }

    public k(dg.b0 b0Var, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b0Var, "blockSettingsHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.c = b0Var;
        this.b = coroutineContext;
        ig3.v1 b = ig3.w1.b(0, 0, (hg3.bar) null, 6);
        this.d = b;
        this.e = new ig3.p1(b);
    }
}
