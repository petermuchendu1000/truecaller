package com.truecaller.settings.impl.ui;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class f extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ com.truecaller.settings.impl.ui.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.truecaller.settings.impl.ui.j jVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.z = jVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                com.truecaller.settings.impl.ui.f fVar = new com.truecaller.settings.impl.ui.f(this.z, barVar, 0);
                fVar.y = obj;
                return fVar;
            case 1:
                com.truecaller.settings.impl.ui.f fVar2 = new com.truecaller.settings.impl.ui.f(this.z, barVar, 1);
                fVar2.y = obj;
                return fVar2;
            default:
                com.truecaller.settings.impl.ui.f fVar3 = new com.truecaller.settings.impl.ui.f(this.z, barVar, 2);
                fVar3.y = obj;
                return fVar3;
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rw2.b bVar = (rw2.b) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(bVar, barVar).invokeSuspend(kotlin.Unit.a);
            case 1:
                return create(bVar, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(bVar, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        com.truecaller.settings.impl.ui.j jVar = this.z;
        switch (i) {
            case 0:
                rw2.b bVar = (rw2.b) this.y;
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                ((java.util.concurrent.atomic.AtomicReference) jVar.m).set(bVar);
                return kotlin.Unit.a;
            case 1:
                rw2.b bVar2 = (rw2.b) this.y;
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                ((java.util.concurrent.atomic.AtomicReference) jVar.n).set(bVar2);
                return kotlin.Unit.a;
            default:
                rw2.b bVar3 = (rw2.b) this.y;
                ef3.bar barVar3 = ef3.bar.a;
                od.p.E(obj);
                ((java.util.concurrent.atomic.AtomicReference) jVar.l).set(bVar3);
                return kotlin.Unit.a;
        }
    }
}
