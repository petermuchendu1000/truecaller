package com.truecaller.ads.util;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* synthetic */ class u0 implements kotlin.jvm.functions.Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r0v23, types: [com.truecaller.network.advanced.edge.bar, java.lang.Object] */
    public final java.lang.Object invoke() {
        switch (this.a) {
            case 0:
                return new kotlin.text.Regex("CALL_LOG_PROMO");
            case 1:
                return new kotlin.text.Regex("CONTACTS|HISTORY|SEARCHRESULTS|CALLLOG|INBOX|PROMOTION_INBOX|SPAM_INBOX");
            case 2:
                return new kotlin.text.Regex("CALLER_ID");
            case 3:
                return new kotlin.text.Regex("DETAILS|OOP");
            case 4:
                return new kotlin.text.Regex("MESSAGE_ID");
            case 5:
                return new kotlin.text.Regex("DETAILS_BOTTOM");
            case 6:
                return kotlin.Unit.a;
            case 7:
                return kotlin.Unit.a;
            case 8:
                return kotlin.Unit.a;
            case 9:
                return kotlin.Unit.a;
            case 10:
                return kotlin.Unit.a;
            case 11:
                return kotlin.Unit.a;
            case 12:
                return kotlin.Unit.a;
            case 13:
                int i = com.truecaller.editprofile.impl.ui.qa.EditProfileConfigurationQaActivity.e0;
                return kotlin.Unit.a;
            case 14:
                return kotlin.collections.y.j(new com.truecaller.filters.blockedevents.l[]{com.truecaller.filters.blockedevents.c.g, com.truecaller.filters.blockedevents.f.g, com.truecaller.filters.blockedevents.j.g, com.truecaller.filters.blockedevents.k.g, com.truecaller.filters.blockedevents.g.g, com.truecaller.filters.blockedevents.i.g, com.truecaller.filters.blockedevents.h.g, com.truecaller.filters.blockedevents.d.g, com.truecaller.filters.blockedevents.e.g});
            case 15:
                return new java.lang.Object();
            case 16:
                try {
                    android.content.pm.PackageInfo j = df.bar.j();
                    if (j != null) {
                        java.lang.String str = j.versionName;
                        if (str != null) {
                            return str;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                return "unknown";
            case 17:
                ?? obj = new java.lang.Object();
                obj.c(new java.util.LinkedHashMap());
                for (com.truecaller.common.network.KnownDomain knownDomain : com.truecaller.common.network.KnownDomain.values()) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (com.truecaller.common.network.util.KnownEndpoints knownEndpoints : com.truecaller.common.network.util.KnownEndpoints.values()) {
                        linkedHashMap.put(knownEndpoints.getKey(), new com.truecaller.network.advanced.edge.bar.bar(knownEndpoints.getHost(knownDomain)));
                    }
                    java.util.Map a = obj.a();
                    if (a != null) {
                    }
                }
                return obj;
            case 18:
                return qk3.p.d(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(12));
            case 19:
                return java.lang.Boolean.valueOf(c91.f.m());
            case 20:
                return java.lang.Boolean.valueOf(c91.f.m());
            case 21:
                return qk3.p.d(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t(13));
            case 22:
                return kotlin.Unit.a;
            case 23:
                return new com.google.gson.Gson();
            case 24:
                return kotlin.collections.y.j(new kotlin.text.Regex[]{new kotlin.text.Regex("trusts you to be his/her guardian"), new kotlin.text.Regex("is sharing his/her location with you NOW! "), new kotlin.text.Regex("is not feeling safe and needs HELP!")});
            case 25:
                cu0.t0 t0Var = com.truecaller.callerid.CallerIdService.n;
                return fg3.h0.c();
            case 26:
                return fg3.h0.e();
            case 27:
                return ig3.w1.c((java.lang.Object) null);
            case y90.i1.DECISIONCONTEXT_FIELD_NUMBER /* 28 */:
                return uf.qux.i("CampaignVideoCacheThread");
            default:
                return new android.os.Handler(((android.os.HandlerThread) d23.qux.f.getValue()).getLooper());
        }
    }
}
