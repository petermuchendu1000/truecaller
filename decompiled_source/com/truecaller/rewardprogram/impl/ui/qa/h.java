package com.truecaller.rewardprogram.impl.ui.qa;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h extends ff3.g implements kotlin.jvm.functions.Function1 {
    public com.truecaller.rewardprogram.impl.ui.qa.j A;
    public int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ com.truecaller.rewardprogram.impl.ui.qa.j D;
    public java.lang.Enum E;
    public final /* synthetic */ java.lang.Enum F;
    public final /* synthetic */ int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, com.truecaller.rewardprogram.impl.ui.qa.j jVar, java.lang.Enum r3, df3.bar barVar, int i2) {
        super(1, barVar);
        this.x = i2;
        this.C = i;
        this.D = jVar;
        this.F = r3;
    }

    public final df3.bar create(df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.rewardprogram.impl.ui.qa.h(this.C, this.D, (com.truecaller.rewardprogram.impl.model.ContributionType) this.F, barVar, 0);
            default:
                return new com.truecaller.rewardprogram.impl.ui.qa.h(this.C, this.D, (com.truecaller.rewardprogram.impl.data.model.RecurringTaskType) this.F, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        df3.bar barVar = (df3.bar) obj;
        switch (this.x) {
            case 0:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0044 -> B:7:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0092 -> B:27:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i;
        int i2;
        com.truecaller.rewardprogram.impl.model.ContributionType contributionType;
        com.truecaller.rewardprogram.impl.ui.qa.j jVar;
        int i3;
        int i4;
        com.truecaller.rewardprogram.impl.ui.qa.j jVar2;
        com.truecaller.rewardprogram.impl.data.model.RecurringTaskType recurringTaskType;
        switch (this.x) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                int i5 = this.B;
                com.truecaller.rewardprogram.impl.ui.qa.j jVar3 = this.D;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            od.p.E(obj);
                            return kotlin.Unit.a;
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.z;
                    i2 = this.y;
                    contributionType = (com.truecaller.rewardprogram.impl.model.ContributionType) this.E;
                    jVar = this.A;
                    od.p.E(obj);
                    i++;
                    if (i < i2) {
                        dq1.h hVar = jVar.c;
                        this.A = jVar;
                        this.E = contributionType;
                        this.y = i2;
                        this.z = i;
                        this.B = 1;
                        if (hVar.f(contributionType, this) == barVar) {
                            return barVar;
                        }
                        i++;
                        if (i < i2) {
                            o02.baz bazVar = jVar3.f;
                            this.A = null;
                            this.E = null;
                            this.B = 2;
                            bazVar.getClass();
                            if (bazVar.X(new nu1.v0(bazVar, (df3.bar) null, 15), this) == barVar) {
                                return barVar;
                            }
                            return kotlin.Unit.a;
                        }
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.rewardprogram.impl.model.ContributionType contributionType2 = (com.truecaller.rewardprogram.impl.model.ContributionType) this.F;
                    i = 0;
                    i2 = this.C;
                    contributionType = contributionType2;
                    jVar = jVar3;
                    if (i < i2) {
                    }
                }
            default:
                ef3.bar barVar2 = ef3.bar.a;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 == 1) {
                        i3 = this.z;
                        i4 = this.y;
                        recurringTaskType = (com.truecaller.rewardprogram.impl.data.model.RecurringTaskType) this.E;
                        jVar2 = this.A;
                        od.p.E(obj);
                        i3++;
                        if (i3 < i4) {
                            wt.l lVar = jVar2.g;
                            this.A = jVar2;
                            this.E = recurringTaskType;
                            this.y = i4;
                            this.z = i3;
                            this.B = 1;
                            if (lVar.O(recurringTaskType, this) == barVar2) {
                                return barVar2;
                            }
                            i3++;
                            if (i3 < i4) {
                                return kotlin.Unit.a;
                            }
                        }
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.rewardprogram.impl.data.model.RecurringTaskType recurringTaskType2 = (com.truecaller.rewardprogram.impl.data.model.RecurringTaskType) this.F;
                    i3 = 0;
                    i4 = this.C;
                    jVar2 = this.D;
                    recurringTaskType = recurringTaskType2;
                    if (i3 < i4) {
                    }
                }
        }
    }
}
