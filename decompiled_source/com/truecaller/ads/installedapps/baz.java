package com.truecaller.ads.installedapps;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class baz implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.truecaller.ads.installedapps.qux b;
    public final /* synthetic */ java.util.List c;

    public /* synthetic */ baz(com.truecaller.ads.installedapps.qux quxVar, java.util.List list, int i) {
        this.a = i;
        this.b = quxVar;
        this.c = list;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        rc.bar barVar = (rc.bar) obj;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "_connection");
                this.b.b.h(barVar, this.c);
                return kotlin.Unit.a;
            default:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "_connection");
                this.b.c.g(barVar, this.c);
                return kotlin.Unit.a;
        }
    }
}
