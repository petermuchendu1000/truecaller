package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class e2 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ com.truecaller.bottombar.BottomBarButtonType A;
    public final /* synthetic */ com.truecaller.floatingtoolbar.api.CallHistoryTab.Type B;
    public final /* synthetic */ int x;
    public int y;
    public final /* synthetic */ com.truecaller.ui.TruecallerInit z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(com.truecaller.ui.TruecallerInit truecallerInit, com.truecaller.bottombar.BottomBarButtonType bottomBarButtonType, com.truecaller.floatingtoolbar.api.CallHistoryTab.Type type, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = truecallerInit;
        this.A = bottomBarButtonType;
        this.B = type;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.e2(this.z, this.A, this.B, barVar, 0);
            default:
                return new com.truecaller.ui.e2(this.z, this.A, this.B, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i = this.y;
                com.truecaller.ui.TruecallerInit truecallerInit = this.z;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                return kotlin.Unit.a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        this.y = 3;
                        if (com.truecaller.ui.TruecallerInit.y0(truecallerInit, this.A, this.B, this) == barVar) {
                            return barVar;
                        }
                        return kotlin.Unit.a;
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    truecallerInit.k1 = null;
                    this.y = 1;
                    if (com.truecaller.ui.TruecallerInit.w0(truecallerInit, this) == barVar) {
                        return barVar;
                    }
                }
                this.y = 2;
                if (fg3.h0.r(100L, this) == barVar) {
                    return barVar;
                }
                this.y = 3;
                if (com.truecaller.ui.TruecallerInit.y0(truecallerInit, this.A, this.B, this) == barVar) {
                }
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    this.y = 1;
                    if (com.truecaller.ui.TruecallerInit.y0(this.z, this.A, this.B, this) == barVar2) {
                        return barVar2;
                    }
                }
                return kotlin.Unit.a;
        }
    }
}
