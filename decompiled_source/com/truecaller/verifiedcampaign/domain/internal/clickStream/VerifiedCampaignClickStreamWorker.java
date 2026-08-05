package com.truecaller.verifiedcampaign.domain.internal.clickStream;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/verifiedcampaign/domain/internal/clickStream/VerifiedCampaignClickStreamWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lkotlin/coroutines/CoroutineContext;", "ioCoroutineContext", "Lt13/a;", "repository", "Ll13/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lkotlin/coroutines/CoroutineContext;Lt13/a;Ll13/bar;)V", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VerifiedCampaignClickStreamWorker extends androidx.work.CoroutineWorker {
    public final kotlin.coroutines.CoroutineContext a;
    public final t13.a b;
    public final l13.bar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifiedCampaignClickStreamWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull t13.a aVar, @org.jetbrains.annotations.NotNull l13.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "repository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = coroutineContext;
        this.b = aVar;
        this.c = barVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction verifiedCampaignAction = com.truecaller.verifiedcampaign.api.internal.analytics.VerifiedCampaignAction.CLICK_STREAM_API_FAILURE;
        java.lang.String str10 = "";
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        if (str2 == null) {
            str7 = "";
        } else {
            str7 = str2;
        }
        if (str3 == null) {
            str8 = "";
        } else {
            str8 = str3;
        }
        if (str4 == null) {
            str9 = "";
        } else {
            str9 = str4;
        }
        if (str5 != null) {
            str10 = str5;
        }
        r13.qux quxVar = (r13.qux) this.c;
        quxVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(verifiedCampaignAction, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "campaignId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "orgId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str9, "businessNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str10, "referenceId");
        if (!quxVar.c.b.a("featureBizVerifiedCampaignsCarouselAnalytics", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
            return;
        }
        quxVar.b.d(new r13.bar(str7, verifiedCampaignAction, vy2.i.O(str9), str6, str8, vy2.i.O(str10), "", "", null, null, quxVar.d, null, null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        s13.qux quxVar;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean booleanValue;
        com.truecaller.verifiedcampaign.domain.internal.clickStream.VerifiedCampaignClickStreamWorker verifiedCampaignClickStreamWorker = this;
        if (barVar instanceof s13.qux) {
            quxVar = (s13.qux) barVar;
            int i2 = quxVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quxVar.E = i2 - Integer.MIN_VALUE;
                s13.qux quxVar2 = quxVar;
                java.lang.Object obj = quxVar2.C;
                ef3.bar barVar2 = ef3.bar.a;
                i = quxVar2.E;
                if (i == 0) {
                    if (i == 1) {
                        java.lang.String str6 = quxVar2.B;
                        str4 = quxVar2.A;
                        str3 = quxVar2.z;
                        java.lang.String str7 = quxVar2.y;
                        str5 = quxVar2.x;
                        od.p.E(obj);
                        str2 = str6;
                        str = str7;
                    } else {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    od.p.E(obj);
                    java.lang.String e = verifiedCampaignClickStreamWorker.getInputData().e("campaignId");
                    java.lang.String e2 = verifiedCampaignClickStreamWorker.getInputData().e("displayUnit");
                    java.lang.String e3 = verifiedCampaignClickStreamWorker.getInputData().e("businessNumber");
                    java.lang.String e4 = verifiedCampaignClickStreamWorker.getInputData().e("orgId");
                    java.lang.String e5 = verifiedCampaignClickStreamWorker.getInputData().e("referenceId");
                    long d = verifiedCampaignClickStreamWorker.getInputData().d("clickTime", 0L);
                    long d2 = verifiedCampaignClickStreamWorker.getInputData().d("impressionTime", 0L);
                    java.lang.String e6 = verifiedCampaignClickStreamWorker.getInputData().e("eventId");
                    if (e != null && e.length() != 0 && e2 != null && e2.length() != 0 && e3 != null && e3.length() != 0 && e4 != null && e4.length() != 0 && e5 != null && e5.length() != 0 && e6 != null && e6.length() != 0) {
                        s13.a aVar = new s13.a(this, e, e3, e2, d2, e4, e5, d, e6, null);
                        verifiedCampaignClickStreamWorker = this;
                        str = e2;
                        str2 = e5;
                        str3 = e3;
                        str4 = e4;
                        quxVar2.x = e;
                        quxVar2.y = str;
                        quxVar2.z = str3;
                        quxVar2.A = str4;
                        quxVar2.B = str2;
                        quxVar2.E = 1;
                        java.lang.Object W = fg3.h0.W(verifiedCampaignClickStreamWorker.a, aVar, quxVar2);
                        if (W == barVar2) {
                            return barVar2;
                        }
                        str5 = e;
                        obj = W;
                    } else {
                        a(e, e2, e4, e3, e5);
                        return wi0.bar.u("failure(...)");
                    }
                }
                booleanValue = ((java.lang.Boolean) obj).booleanValue();
                if (!booleanValue) {
                    return nd.t.a();
                }
                if (!booleanValue) {
                    if (verifiedCampaignClickStreamWorker.getRunAttemptCount() < 3) {
                        return new java.lang.Object();
                    }
                    verifiedCampaignClickStreamWorker.a(str5, str, str4, str3, str2);
                    return new nd.q();
                }
                throw new java.lang.RuntimeException();
            }
        }
        quxVar = new s13.qux(verifiedCampaignClickStreamWorker, (ff3.qux) barVar);
        s13.qux quxVar22 = quxVar;
        java.lang.Object obj2 = quxVar22.C;
        ef3.bar barVar22 = ef3.bar.a;
        i = quxVar22.E;
        if (i == 0) {
        }
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
