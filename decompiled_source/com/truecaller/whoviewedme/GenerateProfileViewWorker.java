package com.truecaller.whoviewedme;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/truecaller/whoviewedme/GenerateProfileViewWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Lc73/k0;", "whoViewedMeManager", "Lc73/qux;", "profileViewDao", "Lp81/b;", "rawContactDao", "Lnc0/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lc73/k0;Lc73/qux;Lp81/b;Lnc0/bar;)V", "b91/d", "whoviewedme_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class GenerateProfileViewWorker extends androidx.work.CoroutineWorker {
    public final c73.k0 a;
    public final c73.qux b;
    public final p81.b c;
    public final nc0.bar d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GenerateProfileViewWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull c73.k0 k0Var, @org.jetbrains.annotations.NotNull c73.qux quxVar, @org.jetbrains.annotations.NotNull p81.b bVar, @org.jetbrains.annotations.NotNull nc0.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k0Var, "whoViewedMeManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "profileViewDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "rawContactDao");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = k0Var;
        this.b = quxVar;
        this.c = bVar;
        this.d = barVar;
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        long d = getInputData().d("EXTRA_AGGR_CONTACT_ID", -1L);
        int b = getInputData().b("EXTRA_SEARCH_TYPE", 999);
        boolean a = getInputData().a("EXTRA_IS_PB_CONTACT", true);
        java.util.Iterator it = com.truecaller.whoviewedme.ProfileViewSource.getEntries().iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((com.truecaller.whoviewedme.ProfileViewSource) obj2).ordinal() == getInputData().b("EXTRA_PROFILE_VIEW_EVENT_SOURCE", -1)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource = (com.truecaller.whoviewedme.ProfileViewSource) obj2;
        if (profileViewSource == null) {
            profileViewSource = com.truecaller.whoviewedme.ProfileViewSource.UNKNOWN;
        }
        com.truecaller.whoviewedme.ProfileViewSource profileViewSource2 = profileViewSource;
        java.lang.String e = getInputData().e("EXTRA_SOURCE_TYPE");
        boolean a2 = getInputData().a("EXTRA_SKIP_SOURCE_CHECK", false);
        if (d >= 0) {
            try {
                java.util.Iterator it3 = this.c.d(d).iterator();
                java.lang.Object obj3 = null;
                boolean z = false;
                while (true) {
                    if (it3.hasNext()) {
                        java.lang.Object next = it3.next();
                        com.truecaller.data.entity.Contact contact = (com.truecaller.data.entity.Contact) next;
                        if (!a2 && contact.W != 1) {
                        }
                        if (z) {
                            break;
                        }
                        z = true;
                        obj3 = next;
                    } else if (z) {
                        obj = obj3;
                    }
                }
                com.truecaller.data.entity.Contact contact2 = (com.truecaller.data.entity.Contact) obj;
                if (contact2 == null) {
                    nd.q qVar = new nd.q();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar, "failure(...)");
                    return qVar;
                }
                java.lang.String str = contact2.H;
                if (str == null) {
                    nd.q qVar2 = new nd.q();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(qVar2, "failure(...)");
                    return qVar2;
                }
                if (((c73.r0) this.a).m(str, b, contact2.J(1), a)) {
                    a71.a aVar = this.b;
                    aVar.getClass();
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tcId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileViewSource2, "source");
                    aVar.I(str, (java.lang.String) null, profileViewSource2, com.truecaller.whoviewedme.ProfileViewType.OUTGOING, (java.lang.String) null);
                    kotlin.Lazy lazy = c73.g.a;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "tcId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileViewSource2, "source");
                    ((c73.f) p40.l.k(com.truecaller.common.network.util.KnownEndpoints.PROFILE_VIEW, c73.f.class)).b(str, profileViewSource2.name(), e).H();
                    nc0.u1.e(new d73.bar(profileViewSource2, 0), this.d);
                    return nd.t.a();
                }
                return new nd.q();
            } catch (java.lang.Exception e2) {
                if (!(e2 instanceof java.io.IOException) && !(e2 instanceof java.lang.RuntimeException) && !(e2 instanceof java.net.SocketTimeoutException)) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e2);
                    return new nd.q();
                }
                return new nd.q();
            }
        }
        return new nd.q();
    }
}
