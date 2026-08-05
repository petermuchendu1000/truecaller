package com.truecaller.messaging.defaultsms;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public class DefaultSmsActivity extends com.truecaller.messaging.defaultsms.Hilt_DefaultSmsActivity implements com.truecaller.messaging.defaultsms.f {
    public com.truecaller.messaging.defaultsms.e d0;
    public u03.b e0;

    public static android.content.Intent t0(android.content.Context context, java.lang.String str) {
        return u0(context, str, null, null, null, true);
    }

    public static android.content.Intent u0(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z) {
        android.content.Intent b = com.appsflyer.internal.e.b(context, com.truecaller.messaging.defaultsms.DefaultSmsActivity.class, "SETTING_CONTEXT", str);
        b.putExtra("PREP_MESSAGE", str2);
        b.putExtra("EXTRA_CLAIM_BONUS_POINTS", z);
        b.putExtra("EXTRA_POSTBACK_SUCCESS_URL", str3);
        b.putExtra("EXTRA_3_LEVEL_FLOW_CONTEXT", str4);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r9.equals("flowMakeDmaSettings") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (r10.o.a() == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        r9 = com.truecaller.messaging.MessagingLevel.MEDIUM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        r0.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        r9 = com.truecaller.messaging.MessagingLevel.LOW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r9.equals("flowInboxCleaner") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r9.equals("flowSendSMS") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r9.equals("flowMakeDmaOverflowMenu") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (r9.equals("flowDeleteSMS") == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        bd3.qux quxVar;
        nc0.a aVar;
        java.lang.String str;
        super/*androidx.fragment.app.FragmentActivity*/.onActivityResult(i, i2, intent);
        com.truecaller.messaging.defaultsms.e eVar = this.d0;
        xz1.q qVar = eVar.g;
        u03.c cVar = eVar.e;
        if (i == 1) {
            u03.c cVar2 = cVar;
            if (cVar2.p()) {
                java.lang.String g = cVar2.g();
                if (g == null) {
                    g = "";
                }
                try {
                    aVar = eVar.f;
                    str = eVar.p;
                } catch (bi3.baz e) {
                    com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
                }
                if (str != null) {
                    qx2.w7 h = qx2.rd.h();
                    h.m("defaultMessagingApp");
                    h.n(g);
                    h.k(str);
                    qx2.rd g2 = h.g();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(g2, "createTrackDefaultSmsAppChange(...)");
                    aVar.c(g2);
                    com.truecaller.clevertap.CleverTapManager cleverTapManager = eVar.k;
                    java.lang.String str2 = eVar.p;
                    if (str2 != null) {
                        cleverTapManager.push("grantDma", kotlin.collections.r0.h(new kotlin.Pair[]{new kotlin.Pair("context", str2)}));
                        java.lang.String str3 = eVar.t;
                        a32.x xVar = eVar.n;
                        if (str3 != null && xVar.b()) {
                            switch (str3.hashCode()) {
                                case -964433376:
                                    break;
                                case -892496451:
                                    break;
                                case -827429981:
                                    break;
                                case -665909346:
                                    break;
                                case 555082591:
                                    break;
                            }
                        }
                        org.joda.time.DateTime dateTime = new org.joda.time.DateTime(0L);
                        xz1.r rVar = (xz1.r) qVar;
                        rVar.getClass();
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateTime, "value");
                        rVar.e0("LastMessagePromotionDate", dateTime.i());
                        rVar.e0("defaultSmsAppTimestamp", new org.joda.time.DateTime().i());
                        ((x12.baz) eVar.d).a();
                        eVar.l.f();
                        if (eVar.h.g(new java.lang.String[]{"android.permission.SEND_SMS"})) {
                            eVar.c2();
                            return;
                        }
                        bd3.qux quxVar2 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
                        if (quxVar2 != null) {
                            bd3.qux quxVar3 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar2;
                            if (!if0.y1.Z(quxVar3, "android.permission.SEND_SMS")) {
                                if (if0.y1.G(quxVar3, "android.permission.SEND_SMS")) {
                                    if0.y1.N(quxVar3);
                                    return;
                                } else {
                                    f6.baz.l(quxVar3, new java.lang.String[]{"android.permission.SEND_SMS"}, 0);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.Intrinsics.n("mAnalyticsContext");
                    throw null;
                }
                kotlin.jvm.internal.Intrinsics.n("mAnalyticsContext");
                throw null;
            }
            bd3.qux quxVar4 = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
            if (quxVar4 != null) {
                bd3.qux quxVar5 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar4;
                quxVar5.setResult(0);
                quxVar5.finish();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && (quxVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a) != null) {
                android.widget.Toast.makeText((android.content.Context) quxVar, 2132022084, 1).show();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.truecaller.messaging.defaultsms.Hilt_DefaultSmsActivity
    public final void onCreate(android.os.Bundle bundle) {
        com.truecaller.analytics.technical.AppStartTracker.onActivityCreate(this);
        super.onCreate(bundle);
        if (fu.baz.z()) {
            ye0.k.N(this);
        }
        yy.qux.m(getTheme());
        java.lang.String stringExtra = getIntent().getStringExtra("SETTING_CONTEXT");
        com.truecaller.log.AssertionUtil.isNotNull(stringExtra, new java.lang.String[0]);
        java.lang.String stringExtra2 = getIntent().getStringExtra("PREP_MESSAGE");
        boolean booleanExtra = getIntent().getBooleanExtra("EXTRA_CLAIM_BONUS_POINTS", true);
        java.lang.String stringExtra3 = getIntent().getStringExtra("EXTRA_3_LEVEL_FLOW_CONTEXT");
        com.truecaller.messaging.defaultsms.e eVar = this.d0;
        eVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "analyticsContext");
        eVar.p = stringExtra;
        eVar.r = stringExtra2;
        eVar.s = booleanExtra;
        eVar.t = stringExtra3;
        this.d0.u0(this);
    }

    @Override // com.truecaller.messaging.defaultsms.Hilt_DefaultSmsActivity
    public final void onDestroy() {
        this.d0.m1();
        super.onDestroy();
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super/*androidx.fragment.app.FragmentActivity*/.onRequestPermissionsResult(i, strArr, iArr);
        com.truecaller.messaging.defaultsms.e eVar = this.d0;
        eVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "grantResults");
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if ("android.permission.SEND_SMS".equals(strArr[i2])) {
                if (iArr[i2] == 0) {
                    eVar.c2();
                    return;
                }
            } else {
                i2++;
            }
        }
        bd3.qux quxVar = (com.truecaller.messaging.defaultsms.f) ((com.truecaller.sdk.bar) eVar).a;
        if (quxVar != null) {
            bd3.qux quxVar2 = (com.truecaller.messaging.defaultsms.DefaultSmsActivity) quxVar;
            quxVar2.setResult(0);
            quxVar2.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v0() {
        java.util.Set set;
        java.lang.String stringExtra = getIntent().getStringExtra("EXTRA_POSTBACK_SUCCESS_URL");
        if (stringExtra != null) {
            android.content.Context baseContext = getBaseContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContext, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringExtra, "postBackUrl");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseContext, "context");
            od.n k = od.n.k(baseContext);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "getInstance(...)");
            nd.l lVar = nd.l.c;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.truecaller.messaging.defaultsms.DmaAdsWorker.class, "workerClass");
            f6.v0 v0Var = new f6.v0(com.truecaller.messaging.defaultsms.DmaAdsWorker.class);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter("postBackUrl", "key");
            linkedHashMap.put("postBackUrl", stringExtra);
            nd.g gVar = new nd.g(linkedHashMap);
            mf0.o.K(gVar);
            nd.x b = v0Var.y(gVar).b("DmaAdsWorker");
            nd.w wVar = nd.w.a;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            nd.w wVar2 = nd.w.b;
            wd.e t = com.appsflyer.internal.e.t(wVar2, "networkType", (android.net.NetworkRequest) null);
            if (android.os.Build.VERSION.SDK_INT >= 24) {
                set = kotlin.collections.CollectionsKt.K0(linkedHashSet);
            } else {
                set = kotlin.collections.j0.a;
            }
            k.g("DmaAdsWorker", lVar, b.v(new nd.d(t, wVar2, false, false, false, false, -1L, -1L, set)).d());
        }
        setResult(-1);
        finish();
    }
}
