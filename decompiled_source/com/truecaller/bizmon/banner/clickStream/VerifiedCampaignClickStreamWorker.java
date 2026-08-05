package com.truecaller.bizmon.banner.clickStream;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/bizmon/banner/clickStream/VerifiedCampaignClickStreamWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lmg0/baz;", "repository", "Lkotlin/coroutines/CoroutineContext;", "ioCoroutineContext", "Lkg0/baz;", "bizVerifiedCampaignAnalyticHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;Lkotlin/coroutines/CoroutineContext;Lkg0/baz;)V", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VerifiedCampaignClickStreamWorker extends androidx.work.CoroutineWorker {
    public final qc3.bar a;
    public final kotlin.coroutines.CoroutineContext b;
    public final kg0.baz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifiedCampaignClickStreamWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar, @javax.inject.Named("IO") @org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull kg0.baz bazVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "repository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "ioCoroutineContext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bazVar, "bizVerifiedCampaignAnalyticHelper");
        this.a = barVar;
        this.b = coroutineContext;
        this.c = bazVar;
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction bizVerifiedCampaignAction = com.truecaller.bizmon.banner.analytics.BizVerifiedCampaignAction.CLICK_STREAM_API_FAILURE;
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
            str4 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        kg0.a aVar = (kg0.a) this.c;
        aVar.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bizVerifiedCampaignAction, "action");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "businessNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "campaignId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "orgId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "referenceId");
        ((nc0.a) aVar.a).d(new kg0.bar(str7, bizVerifiedCampaignAction, f0.qux.P(str4), str6, str8, f0.qux.P(str5), "", ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        lg0.bar barVar2;
        int i;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        boolean booleanValue;
        com.truecaller.bizmon.banner.clickStream.VerifiedCampaignClickStreamWorker verifiedCampaignClickStreamWorker = this;
        if (barVar instanceof lg0.bar) {
            barVar2 = (lg0.bar) barVar;
            int i2 = barVar2.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.E = i2 - Integer.MIN_VALUE;
                lg0.bar barVar3 = barVar2;
                java.lang.Object obj = barVar3.C;
                ef3.bar barVar4 = ef3.bar.a;
                i = barVar3.E;
                if (i == 0) {
                    if (i == 1) {
                        java.lang.String str6 = barVar3.B;
                        str3 = barVar3.A;
                        str2 = barVar3.z;
                        java.lang.String str7 = barVar3.y;
                        str4 = barVar3.x;
                        od.p.E(obj);
                        str5 = str6;
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
                    if (e != null && e.length() != 0 && e2 != null && e2.length() != 0 && e3 != null && e3.length() != 0 && e4 != null && e4.length() != 0 && e5 != null && e5.length() != 0) {
                        lg0.baz bazVar = new lg0.baz(this, e, e3, e2, d2, e4, e5, d, null);
                        verifiedCampaignClickStreamWorker = this;
                        str = e2;
                        str2 = e3;
                        str3 = e4;
                        barVar3.x = e;
                        barVar3.y = str;
                        barVar3.z = str2;
                        barVar3.A = str3;
                        barVar3.B = e5;
                        barVar3.E = 1;
                        java.lang.Object W = fg3.h0.W(verifiedCampaignClickStreamWorker.b, bazVar, barVar3);
                        if (W == barVar4) {
                            return barVar4;
                        }
                        str4 = e;
                        obj = W;
                        str5 = e5;
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
                    verifiedCampaignClickStreamWorker.a(str4, str, str3, str2, str5);
                    return new nd.q();
                }
                throw new java.lang.RuntimeException();
            }
        }
        barVar2 = new lg0.bar(verifiedCampaignClickStreamWorker, (ff3.qux) barVar);
        lg0.bar barVar32 = barVar2;
        java.lang.Object obj2 = barVar32.C;
        ef3.bar barVar42 = ef3.bar.a;
        i = barVar32.E;
        if (i == 0) {
        }
        booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
    }
}
