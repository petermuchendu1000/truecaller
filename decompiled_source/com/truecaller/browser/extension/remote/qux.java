package com.truecaller.browser.extension.remote;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux {
    public final kotlin.Lazy a = kotlin.LazyKt.lazy((kotlin.jvm.functions.Function0) new java.lang.Object());

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(3:21|22|(1:24))|11|12|(1:14)|15|16))|27|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r6 = kotlin.q.b;
        r5 = od.p.o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.io.Serializable a(java.lang.String str, ff3.qux quxVar) {
        com.truecaller.browser.extension.remote.baz bazVar;
        int i;
        java.lang.Boolean o;
        if (quxVar instanceof com.truecaller.browser.extension.remote.baz) {
            bazVar = (com.truecaller.browser.extension.remote.baz) quxVar;
            int i2 = bazVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bazVar.z = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bazVar.x;
                ef3.bar barVar = ef3.bar.a;
                i = bazVar.z;
                if (i == 0) {
                    if (i == 1) {
                        od.p.E(obj);
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    com.truecaller.browser.extension.remote.a aVar = (com.truecaller.browser.extension.remote.a) this.a.getValue();
                    kotlin.o oVar = kotlin.q.b;
                    com.truecaller.browser.extension.remote.dto.BrowserExtensionAccountSyncRequestDto browserExtensionAccountSyncRequestDto = new com.truecaller.browser.extension.remote.dto.BrowserExtensionAccountSyncRequestDto(str);
                    bazVar.z = 1;
                    obj = aVar.a(browserExtensionAccountSyncRequestDto, bazVar);
                    if (obj == barVar) {
                        return barVar;
                    }
                }
                o = java.lang.Boolean.valueOf(((wj3.a) obj).H().a.k());
                kotlin.o oVar2 = kotlin.q.b;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (o instanceof kotlin.p) {
                    o = bool;
                }
                return o;
            }
        }
        bazVar = new com.truecaller.browser.extension.remote.baz(this, quxVar);
        java.lang.Object obj2 = bazVar.x;
        ef3.bar barVar2 = ef3.bar.a;
        i = bazVar.z;
        if (i == 0) {
        }
        o = java.lang.Boolean.valueOf(((wj3.a) obj2).H().a.k());
        kotlin.o oVar22 = kotlin.q.b;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        if (o instanceof kotlin.p) {
        }
        return o;
    }
}
