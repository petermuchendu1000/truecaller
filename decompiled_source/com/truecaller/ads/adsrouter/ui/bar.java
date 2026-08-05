package com.truecaller.ads.adsrouter.ui;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class bar extends h10.d implements androidx.lifecycle.d {
    public static final /* synthetic */ int C = 0;
    public h10.g0 A;
    public final by2.i B;
    public final kotlin.Lazy h;
    public final kotlin.Lazy i;
    public final kotlin.Lazy j;
    public final kotlin.Lazy k;
    public final com.truecaller.ads.util.h1 l;
    public final com.truecaller.ads.util.h1 m;
    public java.util.Map n;
    public boolean o;
    public boolean p;
    public final com.truecaller.ads.util.h1 q;
    public final com.truecaller.ads.util.h1 r;
    public final com.truecaller.ads.util.h1 s;
    public final com.truecaller.ads.util.h1 t;
    public final com.truecaller.ads.util.h1 u;
    public q9.w v;
    public final kotlin.Lazy w;
    public final kotlin.Lazy x;
    public z60.bar y;
    public fg3.k2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bar(android.content.Context context) {
        super(context, null, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        final int i = 0;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        final int i2 = 1;
        yy.qux.F(from, true).inflate(2131558569, this);
        this.h = gj.m.I(2131362159, this);
        this.i = gj.m.I(2131362157, this);
        this.j = gj.m.I(2131362155, this);
        this.k = gj.m.I(2131362103, this);
        this.l = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        this.m = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i2) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        this.o = true;
        final int i3 = 2;
        this.q = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i3) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.r = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i4) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.s = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i5) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.t = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i6) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.u = new com.truecaller.ads.util.h1(new kotlin.jvm.functions.Function0(this) { // from class: h10.i0
            public final /* synthetic */ com.truecaller.ads.adsrouter.ui.bar b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                com.truecaller.ads.adsrouter.model.VastAdConfig p;
                java.util.List impUrl;
                h10.g0 g0Var;
                com.truecaller.ads.adsrouter.model.VastAdConfig p2;
                java.util.List videoClicks;
                h10.g0 g0Var2;
                java.util.ArrayList arrayList;
                h10.g0 g0Var3;
                java.util.ArrayList arrayList2;
                h10.g0 g0Var4;
                java.util.ArrayList arrayList3;
                h10.g0 g0Var5;
                java.util.ArrayList arrayList4;
                h10.g0 g0Var6;
                java.util.ArrayList arrayList5;
                h10.g0 g0Var7;
                switch (i7) {
                    case 0:
                        com.truecaller.ads.adsrouter.ui.bar barVar = this.b;
                        h10.g0 g0Var8 = barVar.A;
                        if (g0Var8 != null) {
                            g0Var8.recordImpression();
                        }
                        h10.g0 g0Var9 = barVar.A;
                        if (g0Var9 != null && (p = g0Var9.p()) != null && (impUrl = p.getImpUrl()) != null && (g0Var = barVar.A) != null) {
                            g0Var.A(impUrl);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 1:
                        com.truecaller.ads.adsrouter.ui.bar barVar2 = this.b;
                        h10.g0 g0Var10 = barVar2.A;
                        if (g0Var10 != null) {
                            g0Var10.w();
                        }
                        h10.g0 g0Var11 = barVar2.A;
                        if (g0Var11 == null || (p2 = g0Var11.p()) == null || (videoClicks = p2.getVideoClicks()) == null) {
                            return null;
                        }
                        if (videoClicks.isEmpty()) {
                            videoClicks = null;
                        }
                        if (videoClicks == null || (g0Var2 = barVar2.A) == null) {
                            return null;
                        }
                        g0Var2.A(videoClicks);
                        return kotlin.Unit.a;
                    case 2:
                        com.truecaller.ads.adsrouter.ui.bar barVar3 = this.b;
                        h10.g0 g0Var12 = barVar3.A;
                        if (g0Var12 != null) {
                            g0Var12.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_START);
                        }
                        java.util.Map map = barVar3.n;
                        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.START.getValue())) != null && (g0Var3 = barVar3.A) != null) {
                            g0Var3.A(arrayList);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 3:
                        com.truecaller.ads.adsrouter.ui.bar barVar4 = this.b;
                        h10.g0 g0Var13 = barVar4.A;
                        if (g0Var13 != null) {
                            g0Var13.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_25);
                        }
                        java.util.Map map2 = barVar4.n;
                        if (map2 != null && (arrayList2 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.FIRST_QUARTILE.getValue())) != null && (g0Var4 = barVar4.A) != null) {
                            g0Var4.A(arrayList2);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 4:
                        com.truecaller.ads.adsrouter.ui.bar barVar5 = this.b;
                        h10.g0 g0Var14 = barVar5.A;
                        if (g0Var14 != null) {
                            g0Var14.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_50);
                        }
                        java.util.Map map3 = barVar5.n;
                        if (map3 != null && (arrayList3 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.MID_POINT.getValue())) != null && (g0Var5 = barVar5.A) != null) {
                            g0Var5.A(arrayList3);
                            return kotlin.Unit.a;
                        }
                        return null;
                    case 5:
                        com.truecaller.ads.adsrouter.ui.bar barVar6 = this.b;
                        h10.g0 g0Var15 = barVar6.A;
                        if (g0Var15 != null) {
                            g0Var15.B(com.truecaller.ads.adsrouter.ui.VideoStats.PLAY_75);
                        }
                        java.util.Map map4 = barVar6.n;
                        if (map4 != null && (arrayList4 = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.THIRD_QUARTILE.getValue())) != null && (g0Var6 = barVar6.A) != null) {
                            g0Var6.A(arrayList4);
                            return kotlin.Unit.a;
                        }
                        return null;
                    default:
                        com.truecaller.ads.adsrouter.ui.bar barVar7 = this.b;
                        h10.g0 g0Var16 = barVar7.A;
                        if (g0Var16 != null) {
                            g0Var16.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_END);
                        }
                        java.util.Map map5 = barVar7.n;
                        if (map5 != null && (arrayList5 = (java.util.ArrayList) map5.get(com.truecaller.ads.vast.VastTrackingEvents.COMPLETE.getValue())) != null && (g0Var7 = barVar7.A) != null) {
                            g0Var7.A(arrayList5);
                            return kotlin.Unit.a;
                        }
                        return null;
                }
            }
        });
        this.w = gj.m.I(2131362139, this);
        this.x = gj.m.I(2131362156, this);
        this.B = new by2.i(this, 3);
    }

    private final android.widget.ImageView getAdClickToPlayBtn() {
        return (android.widget.ImageView) this.k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.media3.ui.PlayerView getAdRouterExoplayerView() {
        return (androidx.media3.ui.PlayerView) this.w.getValue();
    }

    private final android.widget.LinearLayout getAdVideoControls() {
        return (android.widget.LinearLayout) this.j.getValue();
    }

    private final android.widget.FrameLayout getAdVideoFrame() {
        return (android.widget.FrameLayout) this.x.getValue();
    }

    private final android.widget.ImageView getAdVideoMuteUnmute() {
        return (android.widget.ImageView) this.i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView getAdVideoPlayPause() {
        return (android.widget.ImageView) this.h.getValue();
    }

    private final androidx.lifecycle.t getLifecycle() {
        androidx.lifecycle.d0 g = androidx.lifecycle.g1.g(this);
        if (g != null) {
            return g.getLifecycle();
        }
        return null;
    }

    public static void l(com.truecaller.ads.adsrouter.ui.bar barVar, android.view.View view) {
        java.util.ArrayList arrayList;
        h10.g0 g0Var;
        java.util.ArrayList arrayList2;
        h10.g0 g0Var2;
        java.util.ArrayList arrayList3;
        h10.g0 g0Var3;
        java.util.ArrayList arrayList4;
        h10.g0 g0Var4;
        if (barVar.v != null) {
            int id = view.getId();
            if (id == 2131362157) {
                q9.w wVar = barVar.v;
                if (wVar != null) {
                    wVar.D();
                    float f = 0.0f;
                    if (wVar.l0 > 0.0f) {
                        barVar.getAdVideoMuteUnmute().setImageResource(2131232881);
                        h10.g0 g0Var5 = barVar.A;
                        if (g0Var5 != null) {
                            g0Var5.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_MUTE);
                        }
                        java.util.Map map = barVar.n;
                        if (map != null && (arrayList4 = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.MUTE.getValue())) != null && (g0Var4 = barVar.A) != null) {
                            g0Var4.A(arrayList4);
                            kotlin.Unit unit = kotlin.Unit.a;
                        }
                    } else {
                        barVar.getAdVideoMuteUnmute().setImageResource(2131233671);
                        h10.g0 g0Var6 = barVar.A;
                        if (g0Var6 != null) {
                            g0Var6.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_UNMUTE);
                        }
                        java.util.Map map2 = barVar.n;
                        if (map2 != null && (arrayList3 = (java.util.ArrayList) map2.get(com.truecaller.ads.vast.VastTrackingEvents.UN_MUTE.getValue())) != null && (g0Var3 = barVar.A) != null) {
                            g0Var3.A(arrayList3);
                            kotlin.Unit unit2 = kotlin.Unit.a;
                        }
                        f = 1.0f;
                    }
                    wVar.setVolume(f);
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
            if (id == 2131362159) {
                q9.w wVar2 = barVar.v;
                if (wVar2 != null) {
                    if (wVar2.isPlaying()) {
                        wVar2.setPlayWhenReady(false);
                        barVar.getAdVideoPlayPause().setImageResource(2131232980);
                        h10.g0 g0Var7 = barVar.A;
                        if (g0Var7 != null) {
                            g0Var7.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_PAUSE);
                        }
                        java.util.Map map3 = barVar.n;
                        if (map3 != null && (arrayList2 = (java.util.ArrayList) map3.get(com.truecaller.ads.vast.VastTrackingEvents.PAUSE.getValue())) != null && (g0Var2 = barVar.A) != null) {
                            g0Var2.A(arrayList2);
                            return;
                        }
                        return;
                    }
                    wVar2.setPlayWhenReady(true);
                    barVar.getAdVideoPlayPause().setImageResource(2131232950);
                    h10.g0 g0Var8 = barVar.A;
                    if (g0Var8 != null) {
                        g0Var8.B(com.truecaller.ads.adsrouter.ui.VideoStats.VIDEO_RESUME);
                    }
                    java.util.Map map4 = barVar.n;
                    if (map4 != null && (arrayList = (java.util.ArrayList) map4.get(com.truecaller.ads.vast.VastTrackingEvents.RESUME.getValue())) != null && (g0Var = barVar.A) != null) {
                        g0Var.A(arrayList);
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
            if (id != 2131362155 && id == 2131362103) {
                android.widget.ImageView adClickToPlayBtn = barVar.getAdClickToPlayBtn();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adClickToPlayBtn, "<get-adClickToPlayBtn>(...)");
                gj.m.f0(adClickToPlayBtn);
                android.widget.LinearLayout adVideoControls = barVar.getAdVideoControls();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls, "<get-adVideoControls>(...)");
                gj.m.j0(adVideoControls);
                barVar.q();
                barVar.o();
                q9.w wVar3 = barVar.v;
                if (wVar3 != null) {
                    barVar.s(wVar3);
                } else {
                    kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                    throw null;
                }
            }
        }
    }

    private final void setUpExoplayer(java.lang.String str) {
        com.truecaller.ads.adsrouter.ui.AdSource adSource;
        n9.i kVar;
        z9.a1 g;
        q9.w a = new q9.j(getContext()).a();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a, "build(...)");
        if (this.y != null) {
            g = ((z60.qux) getExoplayerManager()).b(str);
        } else {
            h10.g0 g0Var = this.A;
            if (g0Var != null) {
                adSource = g0Var.getAdSource();
            } else {
                adSource = null;
            }
            if (kotlin.jvm.internal.Intrinsics.b(adSource, com.truecaller.ads.adsrouter.ui.AdSource.Offline.b)) {
                kVar = new n9.i(getContext());
            } else {
                kVar = new n9.k();
            }
            g = new z9.z0(kVar).g(androidx.media3.common.MediaItem.b(android.net.Uri.parse(str)));
        }
        a.setMediaSource(g);
        a.prepare();
        a.setVolume(0.0f);
        a.addListener(this.B);
        this.v = a;
        getAdRouterExoplayerView().setUseController(false);
        androidx.media3.ui.PlayerView adRouterExoplayerView = getAdRouterExoplayerView();
        if (adRouterExoplayerView != null) {
            q9.w wVar = this.v;
            if (wVar != null) {
                adRouterExoplayerView.setPlayer(wVar);
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    @Override // h10.d
    public final void g(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("imp", "event");
        h10.g0 g0Var = this.A;
        if (g0Var != null) {
            g0Var.r("imp", null);
        }
    }

    @org.jetbrains.annotations.NotNull
    public final z60.bar getExoplayerManager() {
        z60.bar barVar = this.y;
        if (barVar != null) {
            return barVar;
        }
        kotlin.jvm.internal.Intrinsics.n("exoplayerManager");
        throw null;
    }

    @org.jetbrains.annotations.Nullable
    public final h10.g0 getVideoAd() {
        return this.A;
    }

    @Override // h10.d
    public final void h() {
        this.l.a();
    }

    @Override // h10.d
    public final void i() {
        java.util.ArrayList arrayList;
        h10.g0 g0Var;
        h10.g0 g0Var2 = this.A;
        if (g0Var2 != null) {
            g0Var2.n();
        }
        java.util.Map map = this.n;
        if (map != null && (arrayList = (java.util.ArrayList) map.get(com.truecaller.ads.vast.VastTrackingEvents.CREATIVE_VIEW.getValue())) != null && (g0Var = this.A) != null) {
            g0Var.A(arrayList);
        }
    }

    public final /* bridge */ void k(androidx.lifecycle.d0 d0Var) {
        bar.d(d0Var);
    }

    public final void o() {
        getAdVideoControls().setOnClickListener(new h10.h0(this, 0));
        getAdVideoPlayPause().setOnClickListener(new h10.h0(this, 0));
        getAdVideoMuteUnmute().setOnClickListener(new h10.h0(this, 0));
        android.view.View videoSurfaceView = getAdRouterExoplayerView().getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnClickListener(new h10.h0(this, 1));
        }
    }

    @Override // h10.d, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        java.util.LinkedHashMap o;
        com.truecaller.ads.adsrouter.model.VastAdConfig p;
        java.util.List trackingEvents;
        android.widget.FrameLayout.LayoutParams layoutParams;
        super.onAttachedToWindow();
        h10.g0 g0Var = this.A;
        java.util.LinkedHashMap linkedHashMap = null;
        if (g0Var != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = getAdVideoControls().getLayoutParams();
            if (layoutParams2 instanceof android.widget.FrameLayout.LayoutParams) {
                layoutParams = (android.widget.FrameLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = null;
            }
            if (h10.j0.a[g0Var.k().ordinal()] == 1) {
                if (layoutParams != null) {
                    layoutParams.gravity = 8388693;
                }
            } else if (layoutParams != null) {
                layoutParams.gravity = 8388661;
            }
            getAdVideoControls().setLayoutParams(layoutParams);
        }
        try {
            kotlin.o oVar = kotlin.q.b;
            h10.g0 g0Var2 = this.A;
            if (g0Var2 != null && (p = g0Var2.p()) != null && (trackingEvents = p.getTrackingEvents()) != null) {
                o = wb0.h.e(trackingEvents);
            } else {
                o = null;
            }
        } catch (java.lang.Throwable th) {
            kotlin.o oVar2 = kotlin.q.b;
            o = od.p.o(th);
        }
        if (!(o instanceof kotlin.p)) {
            linkedHashMap = o;
        }
        this.n = linkedHashMap;
        if (this.o) {
            q();
            o();
        }
        androidx.lifecycle.t lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.a(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r1 = r1.s();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDestroy(androidx.lifecycle.d0 d0Var) {
        java.lang.String s;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        if (this.y != null && (r1 = this.A) != null && s != null) {
            z60.qux quxVar = (z60.qux) getExoplayerManager();
            quxVar.getClass();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(s, "url");
            try {
                ((o9.q) quxVar.c.getValue()).n(z60.qux.a(s));
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Video: Cache- successfully removed for URL: ".concat(s), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit = kotlin.Unit.a;
            } catch (java.io.IOException e) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("Video: Cache- Error removing cache entry for URL: " + s + ", Error: " + e.getMessage(), com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.MESSAGE_COLUMN);
                kotlin.Unit unit2 = kotlin.Unit.a;
            }
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    @Override // h10.d, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        java.lang.Boolean bool;
        java.lang.String D;
        fg3.k2 k2Var = this.z;
        if (k2Var != null) {
            k2Var.cancel((java.util.concurrent.CancellationException) null);
        }
        q9.w wVar = this.v;
        if (wVar != null) {
            wVar.setPlayWhenReady(false);
            q9.w wVar2 = this.v;
            if (wVar2 != null) {
                wVar2.setVolume(0.0f);
                h10.g0 g0Var = this.A;
                if (g0Var != null && (D = g0Var.D()) != null) {
                    bool = java.lang.Boolean.valueOf(kotlin.text.StringsKt.N(D, "CALL_LOG_PROMO", false));
                } else {
                    bool = null;
                }
                if (yp.d0.D(bool)) {
                    getAdVideoPlayPause().setImageResource(2131232980);
                } else {
                    q9.w wVar3 = this.v;
                    if (wVar3 != null) {
                        wVar3.release();
                    } else {
                        kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
        super.onDetachedFromWindow();
    }

    public final void onPause(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        q9.w wVar = this.v;
        if (wVar != null && wVar.isPlaying()) {
            q9.w wVar2 = this.v;
            if (wVar2 != null) {
                wVar2.setPlayWhenReady(false);
                getAdVideoPlayPause().setImageResource(2131232980);
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    public final void onResume(androidx.lifecycle.d0 d0Var) {
        q9.w wVar;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
        bar.e(d0Var);
        if (this.o && (wVar = this.v) != null && !wVar.isPlaying() && !this.p) {
            q9.w wVar2 = this.v;
            if (wVar2 != null) {
                wVar2.setPlayWhenReady(true);
                getAdVideoPlayPause().setImageResource(2131232950);
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    public final /* bridge */ void onStart(androidx.lifecycle.d0 d0Var) {
        bar.f(d0Var);
    }

    public final void onStop(androidx.lifecycle.d0 d0Var) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(d0Var, "owner");
    }

    public final void p(h10.g0 g0Var) {
        java.lang.String C2;
        if (g0Var != null && (C2 = g0Var.C()) != null) {
            if (C2.equals("truecaller://null")) {
                C2 = null;
            }
            java.lang.String str = C2;
            if (str != null) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                h10.d.e(context, new h10.c2(str, g0Var.y(), g0Var.b, g0Var.D(), g0Var.z(), null, g0Var.i(), false, g0Var.x(), null, g0Var.getAdSource(), 672));
            }
        }
    }

    public final void q() {
        q9.w wVar = this.v;
        if (wVar != null && !wVar.isPlaying()) {
            q9.w wVar2 = this.v;
            if (wVar2 != null) {
                wVar2.setPlayWhenReady(true);
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    public final void r() {
        if (this.v != null) {
            getAdRouterExoplayerView().setPlayer((h9.i0) null);
            android.view.TextureView textureView = new android.view.TextureView(getContext());
            q9.w wVar = this.v;
            if (wVar != null) {
                wVar.setVideoTextureView(textureView);
                getAdRouterExoplayerView().addView(textureView, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
            } else {
                kotlin.jvm.internal.Intrinsics.n("exoPlayer");
                throw null;
            }
        }
    }

    public final void s(q9.w wVar) {
        if (this.v == null) {
            return;
        }
        wVar.setVolume(1.0f);
        getAdVideoMuteUnmute().setImageResource(2131233671);
    }

    public final void setExoplayerManager(@org.jetbrains.annotations.NotNull z60.bar barVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "<set-?>");
        this.y = barVar;
    }

    public final void setVideoAd(@org.jetbrains.annotations.Nullable h10.g0 g0Var) {
        int i;
        this.A = g0Var;
        if (g0Var != null) {
            if (g0Var.s() == null) {
                g0Var = null;
            }
            if (g0Var != null) {
                this.o = g0Var.f();
                java.lang.Integer h = g0Var.h();
                if (h != null) {
                    int intValue = h.intValue();
                    android.content.Context context = getContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    i = ak.r0.s(context, intValue);
                } else {
                    i = -1;
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, i);
                layoutParams.gravity = 17;
                setLayoutParams(layoutParams);
                getAdVideoFrame().setLayoutParams(getLayoutParams());
                setVideoResizeMode(kotlin.jvm.internal.Intrinsics.b(g0Var.D(), "DETAILS_OVERLAY"));
                java.lang.String s = g0Var.s();
                if (s != null) {
                    setUpExoplayer(s);
                    androidx.media3.ui.PlayerView adRouterExoplayerView = getAdRouterExoplayerView();
                    if (adRouterExoplayerView != null) {
                        gj.m.j0(adRouterExoplayerView);
                    }
                }
                if (this.o) {
                    android.widget.ImageView adClickToPlayBtn = getAdClickToPlayBtn();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adClickToPlayBtn, "<get-adClickToPlayBtn>(...)");
                    gj.m.f0(adClickToPlayBtn);
                    android.widget.LinearLayout adVideoControls = getAdVideoControls();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls, "<get-adVideoControls>(...)");
                    gj.m.j0(adVideoControls);
                    return;
                }
                android.widget.ImageView adClickToPlayBtn2 = getAdClickToPlayBtn();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adClickToPlayBtn2, "<get-adClickToPlayBtn>(...)");
                gj.m.j0(adClickToPlayBtn2);
                android.widget.LinearLayout adVideoControls2 = getAdVideoControls();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adVideoControls2, "<get-adVideoControls>(...)");
                gj.m.f0(adVideoControls2);
                getAdClickToPlayBtn().setOnClickListener(new h10.h0(this, 0));
            }
        }
    }

    public final void setVideoResizeMode(boolean z) {
        int i;
        androidx.media3.ui.PlayerView adRouterExoplayerView = getAdRouterExoplayerView();
        if (z) {
            i = 0;
        } else {
            i = 3;
        }
        adRouterExoplayerView.setResizeMode(i);
    }
}
