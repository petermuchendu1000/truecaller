package com.truecaller.familyprotect.domain.notification;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/familyprotect/domain/notification/FamilyGroupNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lsj1/bar;", "familyGroupNotificationManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lsj1/bar;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyGroupNotificationWorker extends androidx.work.CoroutineWorker {
    public final sj1.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull sj1.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "familyGroupNotificationManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        uk1.i iVar;
        int i;
        if (barVar instanceof uk1.i) {
            iVar = (uk1.i) barVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = iVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = iVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String e = getInputData().e("EXTRA_ACTION_TYPE");
                    if (e != null && e.length() != 0) {
                        iVar.z = 1;
                        sj1.baz bazVar = sj1.baz.d;
                        if (!e.equals("invite")) {
                            bazVar = sj1.baz.c;
                            if (!e.equals("invite_nudge")) {
                                bazVar = sj1.baz.g;
                                if (!e.equals("promote_to_admin")) {
                                    bazVar = sj1.baz.f;
                                    if (!e.equals("remove_member")) {
                                        bazVar = sj1.baz.b;
                                        if (!e.equals("demote_from_admin")) {
                                            bazVar = sj1.baz.e;
                                            if (!e.equals("low_battery_status")) {
                                                bazVar = sj1.baz.h;
                                                if (!e.equals("weekly_statistics_report")) {
                                                    bazVar = null;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        java.lang.Object R = this.a.R(bazVar, iVar);
                        if (R != barVar2) {
                            R = kotlin.Unit.a;
                        }
                        if (R == barVar2) {
                            return barVar2;
                        }
                    } else {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                }
                nd.s a2 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                return a2;
            }
        }
        iVar = new uk1.i(this, (ff3.qux) barVar);
        java.lang.Object obj2 = iVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = iVar.z;
        if (i == 0) {
        }
        nd.s a23 = nd.t.a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a23, "success(...)");
        return a23;
    }
}
