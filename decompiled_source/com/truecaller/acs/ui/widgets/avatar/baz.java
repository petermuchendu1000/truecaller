package com.truecaller.acs.ui.widgets.avatar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/acs/ui/widgets/avatar/baz;", "Landroidx/lifecycle/n1;", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz extends androidx.lifecycle.n1 {
    public final cz.e b;
    public final cz.c c;
    public final lh3.qux d;
    public final r23.v e;
    public final a71.a f;
    public final uk2.h g;
    public final dn2.qux h;
    public final e00.n i;
    public final wz1.bar j;
    public final bz.qux k;
    public final ku0.qux l;
    public final ij0.e m;
    public final ig3.h2 n;
    public final ig3.h2 o;
    public fg3.k2 p;
    public boolean q;

    public baz(cz.e eVar, cz.c cVar, lh3.qux quxVar, r23.v vVar, a71.a aVar, uk2.h hVar, dn2.qux quxVar2, e00.n nVar, wz1.bar barVar, bz.qux quxVar3, ku0.qux quxVar4, ij0.e eVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar, "historyEventStateReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "filterMatchStateReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "getVideoCallerIdPlayingStateUC");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vVar, "videoPlayerConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "analytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hVar, "fullScreenProfilePictureStateReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar2, "acsContactHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nVar, "acsViewProfileHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "manualCallerIdManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar3, "acsStateEventAnalytics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar4, "callerOriginProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eVar2, "filterMatchCoordinator");
        this.b = eVar;
        this.c = cVar;
        this.d = quxVar;
        this.e = vVar;
        this.f = aVar;
        this.g = hVar;
        this.h = quxVar2;
        this.i = nVar;
        this.j = barVar;
        this.k = quxVar3;
        this.l = quxVar4;
        this.m = eVar2;
        this.n = ig3.w1.c(tz.a.a);
        this.o = ig3.w1.c(tz.bar.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.acs.ui.widgets.avatar.baz bazVar, java.lang.String str, ff3.qux quxVar) {
        tz.h hVar;
        int i;
        if (quxVar instanceof tz.h) {
            hVar = (tz.h) quxVar;
            int i2 = hVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = hVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = hVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ku0.qux quxVar2 = bazVar.l;
                    hVar.z = 1;
                    obj = fg3.h0.W(quxVar2.a, new ku0.bar(quxVar2, str, null), hVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                return new tz.b(new p23.bar(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) obj, bazVar.q, false, -204472321)), null);
            }
        }
        hVar = new tz.h(bazVar, quxVar);
        java.lang.Object obj2 = hVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = hVar.z;
        if (i == 0) {
        }
        return new tz.b(new p23.bar(new com.truecaller.common.ui.avatar.AvatarXConfig((android.net.Uri) null, (java.lang.String) null, (java.lang.String) null, false, false, false, false, false, false, false, false, false, (java.lang.Integer) null, false, false, false, false, false, (java.lang.String) obj2, bazVar.q, false, -204472321)), null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    public final tz.b p(com.truecaller.data.entity.Contact contact, java.lang.String str) {
        boolean z;
        ?? obj = new java.lang.Object();
        ?? obj2 = new java.lang.Object();
        com.truecaller.blocking.FilterMatch filterMatch = (com.truecaller.blocking.FilterMatch) this.c.a.getValue();
        if (contact != null && filterMatch != null) {
            dn2.qux quxVar = this.h;
            boolean z2 = false;
            if (quxVar.y(contact, filterMatch) && !contact.J(128)) {
                z = true;
            } else {
                z = false;
            }
            ((kotlin.jvm.internal.e0) obj).a = z;
            if (quxVar.u(filterMatch) && !contact.J(128)) {
                z2 = true;
            }
            ((kotlin.jvm.internal.e0) obj2).a = z2;
        }
        return new tz.b(this.e.d(contact, new p1.q((java.lang.Object) obj2, (java.lang.Object) obj, this, str, 5)), contact);
    }

    public final void q(tz.e eVar) {
        boolean z = eVar instanceof tz.b;
        bz.qux quxVar = this.k;
        if (z) {
            com.truecaller.common.ui.avatar.AvatarXConfig avatarXConfig = ((tz.b) eVar).a.a;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarXConfig, "avatarXConfig");
            quxVar.b(new bz.e(avatarXConfig));
            return;
        }
        quxVar.b(new bz.e(null));
    }
}
