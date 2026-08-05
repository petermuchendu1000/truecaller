package com.truecaller.ads.mediation.model.rtb;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar extends cl2.m {
    public final w70.b c;
    public final java.lang.String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bar(w70.b bVar, android.content.Context context, java.lang.String str) {
        super(bVar);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bVar, "helper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "appContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "applicationId");
        this.c = bVar;
        this.d = str;
    }

    public final w70.b B() {
        return this.c;
    }

    public final com.truecaller.ads.mediation.model.rtb.App m(com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbRequestData rtbDataHelperImpl$RtbRequestData) {
        com.truecaller.ads.mediation.model.rtb.AppExt appExt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtbDataHelperImpl$RtbRequestData, "requestData");
        if (rtbDataHelperImpl$RtbRequestData.getBidToken() != null) {
            appExt = new com.truecaller.ads.mediation.model.rtb.AppExt(rtbDataHelperImpl$RtbRequestData.getBidToken());
        } else {
            appExt = null;
        }
        com.truecaller.ads.mediation.model.rtb.AppExt appExt2 = appExt;
        return new com.truecaller.ads.mediation.model.rtb.App(null, this.d, null, "https://play.google.com/store/apps/details?id=com.truecaller", new com.truecaller.ads.mediation.model.rtb.Publisher("734f7b23d66740c0abcca5ec9c532200"), appExt2, 5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r0 = ((java.net.Inet6Address) r5).getHostAddress();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        r0 = kotlin.text.StringsKt.g0(r0, new java.lang.String[]{"%"}, 0, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        r9 = (java.lang.String) r0.get(0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.truecaller.ads.mediation.model.rtb.Device n() {
        w70.b bVar = this.c;
        bVar.getClass();
        try {
            java.util.Enumeration<java.net.NetworkInterface> networkInterfaces = java.net.NetworkInterface.getNetworkInterfaces();
            kotlin.jvm.internal.Intrinsics.d(networkInterfaces);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkInterfaces, "<this>");
            loop0: while (true) {
                if (!networkInterfaces.hasMoreElements()) {
                    break;
                }
                java.net.NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.isUp() && !nextElement.isLoopback()) {
                    java.util.Enumeration<java.net.InetAddress> inetAddresses = nextElement.getInetAddresses();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inetAddresses, "getInetAddresses(...)");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inetAddresses, "<this>");
                    while (inetAddresses.hasMoreElements()) {
                        java.net.InetAddress nextElement2 = inetAddresses.nextElement();
                        if ((nextElement2 instanceof java.net.Inet6Address) && !((java.net.Inet6Address) nextElement2).isLinkLocalAddress() && !((java.net.Inet6Address) nextElement2).isLoopbackAddress()) {
                            break loop0;
                        }
                    }
                }
            }
        } catch (java.lang.Exception e) {
            com.truecaller.ads.util.n0.a(e);
        }
        java.lang.String str = null;
        java.lang.String str2 = (java.lang.String) bVar.d.get();
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = str2;
        java.lang.String a = ((com.truecaller.ads.util.l) ((com.truecaller.ads.util.k) bVar.b.get())).a();
        if (a == null) {
            a = "00000000";
        }
        return new com.truecaller.ads.mediation.model.rtb.Device(null, str3, a, "Android", new com.truecaller.ads.mediation.model.rtb.Geo(bVar.b()), str);
    }

    public final java.util.List o(com.truecaller.ads.mediation.helper.RtbDataHelperImpl$RtbRequestData rtbDataHelperImpl$RtbRequestData, com.truecaller.ads.mediation.model.AdPartner adPartner, java.lang.String str) {
        double d;
        java.util.Iterator it;
        java.util.ArrayList arrayList;
        com.truecaller.ads.mediation.model.rtb.Imp imp;
        java.lang.Integer num = 1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rtbDataHelperImpl$RtbRequestData, "requestData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPartner, "partner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bidId");
        java.lang.Float cpm = rtbDataHelperImpl$RtbRequestData.getCpm();
        if (cpm != null) {
            d = cpm.floatValue();
        } else {
            d = 0.0d;
        }
        java.util.List<z70.g> rtbAdFormat = rtbDataHelperImpl$RtbRequestData.getRtbAdFormat();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.z.q(rtbAdFormat, 10));
        java.util.Iterator it2 = rtbAdFormat.iterator();
        while (it2.hasNext()) {
            z70.g gVar = (z70.g) it2.next();
            if (gVar instanceof z70.d) {
                z70.d dVar = (z70.d) gVar;
                imp = new com.truecaller.ads.mediation.model.rtb.Imp(d, "USD", dVar.a, "1", 1, new com.truecaller.ads.mediation.model.rtb.Banner(dVar.b, dVar.c, null, null, null, null, null, 124, null), null, null, 0, null, null, 1728, null);
                it = it2;
                arrayList = arrayList2;
            } else {
                double d2 = d;
                if (gVar instanceof z70.e) {
                    z70.e eVar = (z70.e) gVar;
                    java.lang.String str2 = eVar.a;
                    int i = eVar.b;
                    int i2 = eVar.c;
                    java.util.List list = w70.qux.c;
                    java.util.List list2 = w70.qux.d;
                    com.truecaller.ads.mediation.model.rtb.Banner banner = new com.truecaller.ads.mediation.model.rtb.Banner(i, i2, list, list2, kotlin.collections.h0.a, kotlin.collections.x.c(new com.truecaller.ads.mediation.model.rtb.Banner.Format(i, i2, 0, 0, 0)), 7);
                    it = it2;
                    arrayList = arrayList2;
                    java.lang.Integer num2 = num;
                    com.truecaller.ads.mediation.model.rtb.Video copy$default = com.truecaller.ads.mediation.model.rtb.Video.copy$default(eVar.d, null, null, 0, 0, 0, 0, list2, w70.qux.e, num2, 0, 0, 0, 5, 0, "", 7, num, 63, null);
                    num = num2;
                    java.lang.String lowerCase = adPartner.name().toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    java.util.Map C = if0.y1.C(lowerCase, str);
                    d = d2;
                    imp = new com.truecaller.ads.mediation.model.rtb.Imp(d, "USD", str2, "1", 1, banner, null, copy$default, num, 0, C, 64, null);
                } else {
                    return kotlin.collections.h0.a;
                }
            }
            arrayList.add(imp);
            arrayList2 = arrayList;
            it2 = it;
        }
        return arrayList2;
    }

    public final com.truecaller.ads.mediation.model.rtb.User q(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bidId");
        return null;
    }
}
