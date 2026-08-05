package com.truecaller.familyprotect;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/familyprotect/FamilyProtectFetchConfigWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lpj1/bar;", "familyGroupApi", "Lzj1/bar;", "familyProtectionConfigRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lpj1/bar;Lzj1/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyProtectFetchConfigWorker extends androidx.work.CoroutineWorker {
    public final pj1.bar a;
    public final zj1.bar b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyProtectFetchConfigWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull pj1.bar barVar, @org.jetbrains.annotations.NotNull zj1.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "familyGroupApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "familyProtectionConfigRepository");
        this.a = barVar;
        this.b = barVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0043, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        oj1.baz bazVar;
        java.lang.Object obj;
        int i;
        if (barVar instanceof oj1.baz) {
            bazVar = (oj1.baz) barVar;
            int i2 = bazVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i2 - Integer.MIN_VALUE;
                obj = bazVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = bazVar.z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            od.p.E(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                return nd.t.a();
                            }
                            return new java.lang.Object();
                        }
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bazVar.z = 1;
                    obj = this.a.o(bazVar);
                }
                if (((pj1.baz) obj).a) {
                    nd.s a = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                    return a;
                }
                com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
                if (valueOf != com.truecaller.network.notification.NotificationType.FAMILY_PROTECT_FETCH_CONFIG) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                bazVar.z = 2;
                obj = ((gl1.t0) this.b).c(bazVar);
            }
        }
        bazVar = new oj1.baz(this, (ff3.qux) barVar);
        obj = bazVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = bazVar.z;
        if (i == 0) {
        }
        if (((pj1.baz) obj).a) {
        }
    }
}
