package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h1 implements ig3.i {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.room.o b;

    public /* synthetic */ h1(androidx.room.o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    public final java.lang.Object collect(ig3.j jVar, df3.bar barVar) {
        switch (this.a) {
            case 0:
                java.lang.Object collect = this.b.collect(new a63.g0(jVar, 14), barVar);
                if (collect != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect;
            case 1:
                java.lang.Object collect2 = this.b.collect(new a63.g0(jVar, 21), barVar);
                if (collect2 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect2;
            case 2:
                java.lang.Object collect3 = this.b.collect(new g93.b0(jVar, 16), barVar);
                if (collect3 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect3;
            case 3:
                java.lang.Object collect4 = this.b.collect(new nm1.m2(jVar, 4), barVar);
                if (collect4 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect4;
            default:
                java.lang.Object collect5 = this.b.collect(new yd.b(jVar, 0), barVar);
                if (collect5 != ef3.bar.a) {
                    return kotlin.Unit.a;
                }
                return collect5;
        }
    }
}
