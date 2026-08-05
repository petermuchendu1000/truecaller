package com.truecaller.editprofile;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/editprofile/InvalidProfileNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lqo1/r;", "searchFeaturesInventory", "Lyg2/bar;", "profileUpdateNotificationManager", "Lmg2/bar;", "profileRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqo1/r;Lyg2/bar;Lmg2/bar;)V", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InvalidProfileNotificationWorker extends androidx.work.CoroutineWorker {
    public final qo1.r a;
    public final yg2.bar b;
    public final mg2.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidProfileNotificationWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qo1.r rVar, @org.jetbrains.annotations.NotNull yg2.bar barVar, @org.jetbrains.annotations.NotNull mg2.bar barVar2) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rVar, "searchFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "profileUpdateNotificationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "profileRepository");
        this.a = rVar;
        this.b = barVar;
        this.c = barVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        bh1.a aVar;
        java.lang.Object obj;
        int i;
        if (barVar instanceof bh1.a) {
            aVar = (bh1.a) barVar;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                obj = aVar.x;
                ef3.bar barVar2 = ef3.bar.a;
                i = aVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    if (!((qo1.s) this.a).b.a("featureInvalidProfileNotification", com.truecaller.featuretoggles.FeatureState.DISABLED)) {
                        nd.s a = nd.t.a();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "success(...)");
                        return a;
                    }
                    aVar.z = 1;
                    obj = this.c.r(aVar);
                    if (obj == barVar2) {
                        return barVar2;
                    }
                }
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    nd.s a2 = nd.t.a();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "success(...)");
                    return a2;
                }
                com.truecaller.network.notification.NotificationType valueOf = com.truecaller.network.notification.NotificationType.valueOf(getInputData().b("EXTRA_NOTIFICATION_TYPE", -1));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "let(...)");
                if (bh1.qux.a[valueOf.ordinal()] == 1) {
                    t70.c2 c2Var = this.b;
                    c2Var.getClass();
                    android.content.Intent k = ((hc.bar) c2Var.h).k((android.content.Context) c2Var.b, com.truecaller.analytics.AppEvents.UsersHome.NavigationSource.INVALID_PROFILE_NOTIFICATION, com.truecaller.usershome.navigation.UsersHomeDeepLinkView.EDIT_PROFILE);
                    ((s62.f) ((s62.d) c2Var.d)).v(2131365527, c2Var.a(k, "notificationInvalidProfile"), com.truecaller.analytics.common.event.PushNotificationSource.Firebase.getType(), "notificationInvalidProfile");
                    ((r31.bar) c2Var.g).m("notificationForceUpdateProfileLastShown", ((t41.r0) c2Var.f).c());
                }
                nd.s a3 = nd.t.a();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a3, "success(...)");
                return a3;
            }
        }
        aVar = new bh1.a(this, (ff3.qux) barVar);
        obj = aVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = aVar.z;
        if (i == 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
