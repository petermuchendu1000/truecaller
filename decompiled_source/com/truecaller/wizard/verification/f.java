package com.truecaller.wizard.verification;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah.n b;

    public /* synthetic */ f(ah.n nVar, int i) {
        this.a = i;
        this.b = nVar;
    }

    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                java.util.List j = kotlin.collections.y.j(new java.lang.String[]{"com.whatsapp", "com.whatsapp.w4b"});
                u03.b bVar = (u03.b) this.b.f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : j) {
                    if (((u03.c) bVar).u((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            default:
                java.util.List j2 = kotlin.collections.y.j(new java.lang.String[]{"org.telegram.messenger", "org.telegram.messenger.web", "org.thunderdog.challegram", "com.viber.voip"});
                u03.b bVar2 = (u03.b) this.b.f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : j2) {
                    if (((u03.c) bVar2).u((java.lang.String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }
}
