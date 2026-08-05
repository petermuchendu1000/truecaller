package com.truecaller.familyprotect.domain.data.configuration;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/familyprotect/domain/data/configuration/FamilyGroupInviteNudgeNotificationOneTimeWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqj1/baz;", "familyGroupRepository", "Lsj1/bar;", "notificationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqj1/baz;Lsj1/bar;)V", "hc/bar", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupInviteNudgeNotificationOneTimeWorker extends androidx.work.CoroutineWorker {
    public static final hc.bar d = new java.lang.Object();
    public final android.content.Context a;
    public final qj1.baz b;
    public final sj1.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupInviteNudgeNotificationOneTimeWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qj1.baz bazVar, @org.jetbrains.annotations.NotNull sj1.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "familyGroupRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "notificationManager");
        this.a = context;
        this.b = bazVar;
        this.c = barVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r7.c.U(r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        mk1.qux quxVar;
        int i;
        rj1.qux quxVar2;
        com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$State family$Member$ProtectionMember$State;
        if (barVar instanceof mk1.qux) {
            quxVar = (mk1.qux) barVar;
            int i2 = quxVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = quxVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = quxVar.z;
                qj1.baz bazVar = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                od.p.E(obj);
                                hc.bar.o(((java.lang.Number) obj).intValue(), this.a);
                                nd.s a = nd.t.a();
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                                return a;
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.p.E(obj);
                        quxVar.z = 3;
                        obj = bazVar.E(quxVar);
                    } else {
                        od.p.E(obj);
                    }
                } else {
                    od.p.E(obj);
                    quxVar.z = 1;
                    obj = bazVar.l(pj1.c.a, quxVar);
                }
                quxVar2 = (rj1.qux) obj;
                if (quxVar2 == null) {
                    family$Member$ProtectionMember$State = quxVar2.c;
                } else {
                    family$Member$ProtectionMember$State = null;
                }
                if (family$Member$ProtectionMember$State == com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$State.PENDING) {
                    quxVar.z = 2;
                }
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        quxVar = new mk1.qux(this, (ff3.qux) barVar);
        java.lang.Object obj2 = quxVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = quxVar.z;
        qj1.baz bazVar2 = this.b;
        if (i == 0) {
        }
        quxVar2 = (rj1.qux) obj2;
        if (quxVar2 == null) {
        }
        if (family$Member$ProtectionMember$State == com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$State.PENDING) {
        }
        nd.s a23 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a23, "success(...)");
        return a23;
    }
}
