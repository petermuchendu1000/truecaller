package com.truecaller.ads.acsrules.local;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class baz {
    public final qc3.bar a;
    public final qc3.bar b;
    public final kotlin.Lazy c;

    public baz(qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "featuresRegistry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "gsonUtil");
        this.a = barVar;
        this.b = barVar2;
        this.c = kotlin.LazyKt.lazy(new com.truecaller.ads.acsrules.local.bar(this, 0));
    }

    public final com.truecaller.ads.acsrules.model.AcsRules a() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z;
        com.truecaller.ads.acsrules.local.AcsRulesFirebaseRemoteConfig acsRulesFirebaseRemoteConfig = (com.truecaller.ads.acsrules.local.AcsRulesFirebaseRemoteConfig) this.c.getValue();
        if (acsRulesFirebaseRemoteConfig == null) {
            return new com.truecaller.ads.acsrules.model.AcsRules(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, 1023, null);
        }
        java.lang.Long acsShow = acsRulesFirebaseRemoteConfig.getAcsShow();
        long j7 = 0;
        if (acsShow != null) {
            j = acsShow.longValue();
        } else {
            j = 0;
        }
        java.lang.Long closeButton = acsRulesFirebaseRemoteConfig.getCloseButton();
        if (closeButton != null) {
            j2 = closeButton.longValue();
        } else {
            j2 = 0;
        }
        java.lang.Long backButton = acsRulesFirebaseRemoteConfig.getBackButton();
        if (backButton != null) {
            j3 = backButton.longValue();
        } else {
            j3 = 0;
        }
        java.lang.Long emptySpace = acsRulesFirebaseRemoteConfig.getEmptySpace();
        if (emptySpace != null) {
            j4 = emptySpace.longValue();
        } else {
            j4 = 0;
        }
        java.lang.Long swipeOut = acsRulesFirebaseRemoteConfig.getSwipeOut();
        if (swipeOut != null) {
            j5 = swipeOut.longValue();
        } else {
            j5 = 0;
        }
        java.lang.Long adRequest = acsRulesFirebaseRemoteConfig.getAdRequest();
        if (adRequest != null) {
            j6 = adRequest.longValue();
        } else {
            j6 = -1;
        }
        java.lang.Long acsLockedAdRenderDelay = acsRulesFirebaseRemoteConfig.getAcsLockedAdRenderDelay();
        if (acsLockedAdRenderDelay != null) {
            j7 = acsLockedAdRenderDelay.longValue();
        }
        long j8 = j7;
        java.lang.Boolean restartAcsDismissDelayFF = acsRulesFirebaseRemoteConfig.getRestartAcsDismissDelayFF();
        boolean z2 = false;
        if (restartAcsDismissDelayFF != null) {
            z = restartAcsDismissDelayFF.booleanValue();
        } else {
            z = false;
        }
        java.lang.Boolean acsTopAdFF = acsRulesFirebaseRemoteConfig.getAcsTopAdFF();
        if (acsTopAdFF != null) {
            z2 = acsTopAdFF.booleanValue();
        }
        return new com.truecaller.ads.acsrules.model.AcsRules(j, j2, j3, j4, j5, 0L, j6, j8, z, z2);
    }
}
