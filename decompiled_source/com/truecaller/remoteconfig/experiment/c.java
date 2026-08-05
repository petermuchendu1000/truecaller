package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c {
    public final fg3.e0 a;
    public final kotlin.coroutines.CoroutineContext b;
    public final u03.baz c;
    public final f2.y d;
    public final kotlin.Lazy e;

    public c(fg3.e0 e0Var, kotlin.coroutines.CoroutineContext coroutineContext, u03.baz bazVar, f2.y yVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e0Var, "appScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "clock");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(yVar, "dataStoreFactory");
        this.a = e0Var;
        this.b = coroutineContext;
        this.c = bazVar;
        this.d = yVar;
        this.e = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.Serializable a(com.truecaller.remoteconfig.experiment.ExperimentActivationStatus experimentActivationStatus, ff3.qux quxVar) {
        com.truecaller.remoteconfig.experiment.a aVar;
        int i;
        com.truecaller.remoteconfig.experiment.h hVar;
        com.google.protobuf.Internal.ProtobufList e;
        if (quxVar instanceof com.truecaller.remoteconfig.experiment.a) {
            aVar = (com.truecaller.remoteconfig.experiment.a) quxVar;
            int i2 = aVar.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aVar.y;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.A;
                if (i == 0) {
                    if (i == 1) {
                        experimentActivationStatus = aVar.x;
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    ig3.i data = ((t7.e) this.e.getValue()).getData();
                    aVar.x = experimentActivationStatus;
                    aVar.A = 1;
                    obj = ig3.w1.B(data, aVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                hVar = (com.truecaller.remoteconfig.experiment.h) obj;
                if (hVar == null && (e = hVar.e()) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : e) {
                        if (((com.truecaller.remoteconfig.experiment.qux) obj2).h() == experimentActivationStatus) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return kotlin.collections.h0.a;
            }
        }
        aVar = new com.truecaller.remoteconfig.experiment.a(this, quxVar);
        java.lang.Object obj3 = aVar.y;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.A;
        if (i == 0) {
        }
        hVar = (com.truecaller.remoteconfig.experiment.h) obj3;
        if (hVar == null) {
        }
        return kotlin.collections.h0.a;
    }
}
