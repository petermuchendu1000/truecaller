package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class p {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0) new java.lang.Object());

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.util.LinkedHashMap linkedHashMap, ff3.qux quxVar) {
        com.truecaller.remoteconfig.experiment.n nVar;
        int i;
        try {
            if (quxVar instanceof com.truecaller.remoteconfig.experiment.n) {
                nVar = (com.truecaller.remoteconfig.experiment.n) quxVar;
                int i2 = nVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    nVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = nVar.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = nVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap.size());
                        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(new com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDtoFlag((java.lang.String) entry.getKey(), java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(((java.lang.Number) entry.getValue()).longValue())));
                        }
                        com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto experimentActivationRequestDto = new com.truecaller.remoteconfig.experiment.ExperimentActivationRequestDto(str, str2, arrayList, null, 8, null);
                        com.truecaller.remoteconfig.experiment.m mVar = (com.truecaller.remoteconfig.experiment.m) this.a.getValue();
                        nVar.z = 1;
                        obj = mVar.a(experimentActivationRequestDto, nVar);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    return java.lang.Boolean.valueOf(((wj3.k0) obj).a.k());
                }
            }
            if (i == 0) {
            }
            return java.lang.Boolean.valueOf(((wj3.k0) obj).a.k());
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
        nVar = new com.truecaller.remoteconfig.experiment.n(this, quxVar);
        java.lang.Object obj2 = nVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = nVar.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[Catch: Exception -> 0x0064, TRY_LEAVE, TryCatch #0 {Exception -> 0x0064, blocks: (B:11:0x0027, B:12:0x0055, B:14:0x005f, B:24:0x0036), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.util.List list2, java.lang.String str5, ff3.qux quxVar) {
        com.truecaller.remoteconfig.experiment.o oVar;
        int i;
        wj3.k0 k0Var;
        try {
            if (quxVar instanceof com.truecaller.remoteconfig.experiment.o) {
                oVar = (com.truecaller.remoteconfig.experiment.o) quxVar;
                int i2 = oVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    oVar.z = i2 - Integer.MIN_VALUE;
                    com.truecaller.remoteconfig.experiment.o oVar2 = oVar;
                    java.lang.Object obj = oVar2.x;
                    ef3.bar barVar = ef3.bar.a;
                    i = oVar2.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        com.truecaller.remoteconfig.experiment.m mVar = (com.truecaller.remoteconfig.experiment.m) this.a.getValue();
                        oVar2.z = 1;
                        obj = mVar.b(str5, str, str2, str3, str4, list, list2, "android", oVar2);
                        if (obj == barVar) {
                            return barVar;
                        }
                    }
                    k0Var = (wj3.k0) obj;
                    if (!k0Var.a.k()) {
                        java.lang.Object obj2 = k0Var.b;
                        if (obj2 != null) {
                            return obj2;
                        }
                        return null;
                    }
                    return null;
                }
            }
            if (i == 0) {
            }
            k0Var = (wj3.k0) obj;
            if (!k0Var.a.k()) {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
        oVar = new com.truecaller.remoteconfig.experiment.o(this, quxVar);
        com.truecaller.remoteconfig.experiment.o oVar22 = oVar;
        java.lang.Object obj3 = oVar22.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = oVar22.z;
    }
}
