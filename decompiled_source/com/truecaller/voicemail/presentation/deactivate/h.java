package com.truecaller.voicemail.presentation.deactivate;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/truecaller/voicemail/presentation/deactivate/h;", "Landroidx/lifecycle/n1;", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class h extends androidx.lifecycle.n1 {
    public final uj0.qux b;
    public final f43.baz c;
    public final hg3.e d;
    public final ig3.h2 e;
    public final ig3.q1 f;

    public h(uj0.qux quxVar, f43.baz bazVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "userCarrierRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "voicemailDisabler");
        this.b = quxVar;
        this.c = bazVar;
        this.d = kk3.m.h(1, 6, (hg3.bar) null);
        ig3.h2 c = ig3.w1.c(new com.truecaller.voicemail.presentation.deactivate.c());
        this.e = c;
        this.f = ig3.w1.L(new ig3.x(c, new com.truecaller.call_assistant.presentation.disable.c(this, (df3.bar) null, 9)), androidx.lifecycle.g1.l(this), ig3.z1.a(2, com.unity3d.services.core.di.ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT), new com.truecaller.voicemail.presentation.deactivate.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object o(com.truecaller.voicemail.presentation.deactivate.h hVar, ff3.qux quxVar) {
        com.truecaller.voicemail.presentation.deactivate.g gVar;
        int i;
        java.lang.Object y;
        java.lang.Object value;
        java.lang.Throwable a;
        java.lang.Object value2;
        java.lang.Object value3;
        ig3.h2 h2Var = hVar.e;
        if (quxVar instanceof com.truecaller.voicemail.presentation.deactivate.g) {
            gVar = (com.truecaller.voicemail.presentation.deactivate.g) quxVar;
            int i2 = gVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = gVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = gVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                        y = ((kotlin.q) obj).a;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    uj0.qux quxVar2 = hVar.b;
                    gVar.z = 1;
                    y = quxVar2.y(gVar);
                    if (y == barVar) {
                        return barVar;
                    }
                }
                do {
                    value = h2Var.getValue();
                } while (!h2Var.n(value, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value, null, null, false, false, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)));
                kotlin.o oVar = kotlin.q.b;
                if (!(y instanceof kotlin.p)) {
                    com.truecaller.voicemail.api.data.Carrier carrier = (com.truecaller.voicemail.api.data.Carrier) y;
                    do {
                        value3 = h2Var.getValue();
                    } while (!h2Var.n(value3, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value3, carrier.getDisableCode(), com.truecaller.voicemail.presentation.deactivate.DeactivationState.IDLE, false, false, 64)));
                }
                a = kotlin.q.a(y);
                if (a != null) {
                    o82.a.D("Error fetching carrier " + a);
                    do {
                        value2 = h2Var.getValue();
                    } while (!h2Var.n(value2, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value2, null, null, true, false, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE)));
                }
                return kotlin.Unit.a;
            }
        }
        gVar = new com.truecaller.voicemail.presentation.deactivate.g(hVar, quxVar);
        java.lang.Object obj2 = gVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = gVar.z;
        if (i == 0) {
        }
        do {
            value = h2Var.getValue();
        } while (!h2Var.n(value, com.truecaller.voicemail.presentation.deactivate.c.a((com.truecaller.voicemail.presentation.deactivate.c) value, null, null, false, false, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)));
        kotlin.o oVar2 = kotlin.q.b;
        if (!(y instanceof kotlin.p)) {
        }
        a = kotlin.q.a(y);
        if (a != null) {
        }
        return kotlin.Unit.a;
    }
}
