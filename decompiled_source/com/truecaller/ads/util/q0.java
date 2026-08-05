package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class q0 {
    public final qc3.bar a;
    public final qc3.bar b;
    public java.util.List c;
    public final kotlin.Lazy d;

    public q0(qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "configManager");
        this.a = barVar;
        this.b = barVar2;
        this.d = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 12));
    }

    public final com.truecaller.ads.util.AdsListViewPositionConfig a(java.lang.String str) {
        java.util.List list;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (str.equals("SCAM_FEED")) {
            list = this.c;
        } else {
            list = (java.util.List) this.d.getValue();
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    com.truecaller.ads.util.AdsListViewPositionConfig adsListViewPositionConfig = (com.truecaller.ads.util.AdsListViewPositionConfig) obj;
                    if (kotlin.jvm.internal.Intrinsics.b(adsListViewPositionConfig.getPlacement(), str) && adsListViewPositionConfig.getStartOffset() >= 0 && adsListViewPositionConfig.getPeriod() > adsListViewPositionConfig.getStartOffset()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            com.truecaller.ads.util.AdsListViewPositionConfig adsListViewPositionConfig2 = (com.truecaller.ads.util.AdsListViewPositionConfig) obj;
            if (adsListViewPositionConfig2 != null) {
                return adsListViewPositionConfig2;
            }
        }
        return new com.truecaller.ads.util.AdsListViewPositionConfig(str, 0, 0, 0, 14, null);
    }
}
