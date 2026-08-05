package com.truecaller.voicemail.domain.callstabpromo;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class c {
    public final o43.qux a;
    public final qo1.f b;
    public final v33.a0 c;
    public final v23.bar d;

    public c(o43.qux quxVar, qo1.f fVar, v33.a0 a0Var, v23.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "featureManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fVar, "cloudTelephonyFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0Var, "voicemailRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "voicemailDataStore");
        this.a = quxVar;
        this.b = fVar;
        this.c = a0Var;
        this.d = barVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0053, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        com.truecaller.voicemail.domain.callstabpromo.b bVar;
        java.lang.Object obj;
        int i;
        if (quxVar instanceof com.truecaller.voicemail.domain.callstabpromo.b) {
            bVar = (com.truecaller.voicemail.domain.callstabpromo.b) quxVar;
            int i2 = bVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.z = i2 - Integer.MIN_VALUE;
                obj = bVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = bVar.z;
                boolean z = false;
                v23.bar barVar2 = this.d;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    od.p.E(obj);
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        z = true;
                                    }
                                    return java.lang.Boolean.valueOf(z);
                                }
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.p.E(obj);
                            if (((java.lang.Number) obj).intValue() == com.truecaller.voicemail.api.internal.data.models.status.VoicemailStatus.INACTIVE.getCode()) {
                                bVar.z = 4;
                                obj = ef0.a.z(((v33.i) barVar2).b(), v33.i.n, false, bVar);
                            }
                            return java.lang.Boolean.valueOf(z);
                        }
                        od.p.E(obj);
                        if (((java.lang.Number) obj).intValue() == 0) {
                            bVar.z = 3;
                            obj = ((v33.i) barVar2).f(bVar);
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                    od.p.E(obj);
                } else {
                    od.p.E(obj);
                    bVar.z = 1;
                    obj = this.a.b(bVar);
                }
                if (((java.lang.Boolean) obj).booleanValue() && this.b.a()) {
                    bVar.z = 2;
                    obj = this.c.m(bVar);
                }
                return java.lang.Boolean.valueOf(z);
            }
        }
        bVar = new com.truecaller.voicemail.domain.callstabpromo.b(this, quxVar);
        obj = bVar.x;
        ef3.bar barVar3 = ef3.bar.a;
        i = bVar.z;
        boolean z2 = false;
        v23.bar barVar22 = this.d;
        if (i == 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            bVar.z = 2;
            obj = this.c.m(bVar);
        }
        return java.lang.Boolean.valueOf(z2);
    }
}
