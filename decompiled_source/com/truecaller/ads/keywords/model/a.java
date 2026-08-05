package com.truecaller.ads.keywords.model;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class a {
    public static final com.truecaller.ads.keywords.model.AdCampaign.Style a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        try {
            return new com.truecaller.ads.keywords.model.AdCampaign.Style(str5, str6, android.graphics.Color.parseColor(str), android.graphics.Color.parseColor(str2), android.graphics.Color.parseColor(str3), android.graphics.Color.parseColor(str4));
        } catch (java.lang.IllegalArgumentException e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            return null;
        }
    }
}
