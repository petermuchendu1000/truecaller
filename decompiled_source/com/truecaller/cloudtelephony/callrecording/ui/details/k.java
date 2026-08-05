package com.truecaller.cloudtelephony.callrecording.ui.details;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class k extends ff3.g implements kotlin.jvm.functions.Function2 {
    public final /* synthetic */ int x;
    public final /* synthetic */ android.content.Intent y;
    public final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.details.n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(android.content.Intent intent, com.truecaller.cloudtelephony.callrecording.ui.details.n nVar, df3.bar barVar, int i) {
        super(2, barVar);
        this.x = i;
        this.y = intent;
        this.z = nVar;
    }

    public final df3.bar create(java.lang.Object obj, df3.bar barVar) {
        switch (this.x) {
            case 0:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.k(this.y, this.z, barVar, 0);
            default:
                return new com.truecaller.cloudtelephony.callrecording.ui.details.k(this.y, this.z, barVar, 1);
        }
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fg3.e0 e0Var = (fg3.e0) obj;
        df3.bar barVar = (df3.bar) obj2;
        switch (this.x) {
            case 0:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
            default:
                return create(e0Var, barVar).invokeSuspend(kotlin.Unit.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i = this.x;
        android.content.Intent intent = this.y;
        com.truecaller.cloudtelephony.callrecording.ui.details.n nVar = this.z;
        switch (i) {
            case 0:
                ef3.bar barVar = ef3.bar.a;
                od.p.E(obj);
                if (intent != null) {
                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                    if (gVar != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                        p01.bar u0 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar).u0();
                        u0.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                        u0.a.startActivity(intent);
                    }
                } else {
                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar2 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                    if (gVar2 != null) {
                        t.c.C(((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar2).u0().d, 2132017619, (java.lang.String) null, 6);
                    }
                }
                nVar.u = null;
                return kotlin.Unit.a;
            default:
                ef3.bar barVar2 = ef3.bar.a;
                od.p.E(obj);
                if (intent != null) {
                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar3 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                    if (gVar3 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                        p01.bar u02 = ((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar3).u0();
                        u02.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
                        u02.a.startActivity(intent);
                    }
                } else {
                    com.truecaller.cloudtelephony.callrecording.ui.details.g gVar4 = (com.truecaller.cloudtelephony.callrecording.ui.details.g) ((com.truecaller.sdk.bar) nVar).a;
                    if (gVar4 != null) {
                        t.c.C(((com.truecaller.cloudtelephony.callrecording.ui.details.CallRecordingDetailsActivity) gVar4).u0().d, 2132017619, (java.lang.String) null, 6);
                    }
                }
                nVar.u = null;
                return kotlin.Unit.a;
        }
    }
}
