package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public class u implements com.google.gson.u, com.google.gson.n {
    public final com.google.gson.o a(java.lang.Object obj, java.lang.reflect.Type type, mp2.qux quxVar) {
        com.truecaller.ads.adsrouter.ui.AdSource adSource = (com.truecaller.ads.adsrouter.ui.AdSource) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSource, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "typeOfSrc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "context");
        return new com.google.gson.t(adSource.a);
    }

    public final java.lang.Object b(com.google.gson.o oVar, java.lang.reflect.Type type, com.google.gson.m mVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oVar, "json");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "typeOfT");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mVar, "context");
        java.lang.String i = oVar.i();
        if (i != null) {
            switch (i.hashCode()) {
                case -1548612125:
                    if (i.equals("offline")) {
                        return com.truecaller.ads.adsrouter.ui.AdSource.Offline.b;
                    }
                    break;
                case -619605455:
                    if (i.equals("network_cache")) {
                        return com.truecaller.ads.adsrouter.ui.AdSource.NetworkCache.b;
                    }
                    break;
                case 99469088:
                    i.equals("house");
                    break;
                case 1843485230:
                    if (i.equals("network")) {
                        return com.truecaller.ads.adsrouter.ui.AdSource.Network.b;
                    }
                    break;
            }
        }
        return com.truecaller.ads.adsrouter.ui.AdSource.House.b;
    }
}
