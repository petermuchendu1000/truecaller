package com.truecaller.ads.acsrules.local;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class b implements com.truecaller.ads.acsrules.local.qux {
    public static final y7.b e = lk.c.S("acsRules");
    public static final y7.b f = lk.c.S("version");
    public static final y7.b g = lk.c.J("nextSyncTime");
    public static final y7.b h = lk.c.J("expiry");
    public final android.content.Context a;
    public final kotlin.coroutines.CoroutineContext b;
    public final u03.q c;
    public final kotlin.Lazy d;

    public b(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, u03.q qVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(qVar, "gsonUtil");
        this.a = context;
        this.b = coroutineContext;
        this.c = qVar;
        this.d = kotlin.LazyKt.lazy(new com.truecaller.ads.acsrules.local.bar(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(ff3.qux quxVar) {
        com.truecaller.ads.acsrules.local.a aVar;
        java.lang.Object obj;
        int i;
        java.lang.String str;
        if (quxVar instanceof com.truecaller.ads.acsrules.local.a) {
            aVar = (com.truecaller.ads.acsrules.local.a) quxVar;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                obj = aVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = aVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    t7.e b = b();
                    aVar.z = 1;
                    obj = ef0.a.G(b, e, "", aVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                if (kotlin.text.StringsKt.X((java.lang.String) obj)) {
                    obj = null;
                }
                str = (java.lang.String) obj;
                if (str != null) {
                    return null;
                }
                return (com.truecaller.ads.acsrules.model.AcsRulesContainer) this.c.a(str, com.truecaller.ads.acsrules.model.AcsRulesContainer.class);
            }
        }
        aVar = new com.truecaller.ads.acsrules.local.a(this, quxVar);
        obj = aVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = aVar.z;
        if (i == 0) {
        }
        if (kotlin.text.StringsKt.X((java.lang.String) obj)) {
        }
        str = (java.lang.String) obj;
        if (str != null) {
        }
    }

    public final t7.e b() {
        return (t7.e) this.d.getValue();
    }
}
