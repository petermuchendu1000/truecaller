package com.truecaller.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class o0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ pt2.qux y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(pt2.qux quxVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = quxVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.ui.o0(this.y, barVar, 0);
            default:
                return new com.truecaller.ui.o0(this.y, barVar, 1);
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

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        pt2.qux quxVar = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                quxVar.f();
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                quxVar.f();
                return kotlin.Unit.a;
        }
    }
}
