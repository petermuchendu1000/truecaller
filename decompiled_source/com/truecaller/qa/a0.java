package com.truecaller.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class a0 extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ wt.l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(wt.l lVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = lVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.qa.a0(this.y, barVar, 0);
            case 1:
                return new com.truecaller.qa.a0(this.y, barVar, 1);
            default:
                return new com.truecaller.qa.a0(this.y, barVar, 2);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        wt.l lVar = this.y;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                android.widget.Toast.makeText((android.content.Context) lVar.a, "Couldn't find the respective contact with source 16", 0).show();
                return kotlin.Unit.a;
            case 1:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                android.widget.Toast.makeText((android.content.Context) lVar.a, "Successfully inserted contacts!", 0).show();
                return kotlin.Unit.a;
            default:
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                android.widget.Toast.makeText((android.content.Context) lVar.a, "Could not find the number!", 0).show();
                return kotlin.Unit.a;
        }
    }
}
