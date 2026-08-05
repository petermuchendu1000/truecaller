package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class m0 {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final kotlin.Lazy d;
    public final java.util.LinkedHashMap e;

    public m0(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "listViewPositionConfigProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "adsConfigurationManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "adWithComposeOnListHelperImpl");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = kotlin.LazyKt.lazy(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.bar(this, 11));
        this.e = new java.util.LinkedHashMap();
    }

    public final int a(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (!((java.lang.Boolean) this.d.getValue()).booleanValue()) {
            return i;
        }
        com.truecaller.ads.util.AdsListViewPositionConfig c = c(str);
        for (int startOffset = c.getStartOffset() + 1; startOffset <= i; startOffset += c.getPeriod()) {
            i++;
        }
        return i;
    }

    public final int b(int i, int i2, java.lang.String str) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (!((java.lang.Boolean) this.d.getValue()).booleanValue()) {
            return i;
        }
        com.truecaller.ads.util.AdsListViewPositionConfig c = c(str);
        if (i > c.getStartOffset()) {
            i3 = java.lang.Math.min(((i - c.getStartOffset()) - 1) / c.getPeriod(), i2) + 1;
        } else {
            i3 = 0;
        }
        return i - i3;
    }

    public final com.truecaller.ads.util.AdsListViewPositionConfig c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        java.util.LinkedHashMap linkedHashMap = this.e;
        java.lang.Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = ((com.truecaller.ads.util.q0) this.a.get()).a(str);
            linkedHashMap.put(str, obj);
        }
        return (com.truecaller.ads.util.AdsListViewPositionConfig) obj;
    }

    public final boolean d(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        if (((java.lang.Boolean) this.d.getValue()).booleanValue()) {
            com.truecaller.ads.util.AdsListViewPositionConfig c = c(str);
            if (i >= c.getStartOffset() && (i - c.getStartOffset()) % c.getPeriod() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
