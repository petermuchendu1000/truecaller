package com.truecaller.anrwatchdog;

/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class qux implements com.truecaller.anrwatchdog.bar {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final lo1.qux d;

    public qux(qc3.bar barVar, qc3.bar barVar2, qc3.bar barVar3, lo1.qux quxVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "messagingFeaturesInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "messagingConfigsInventory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "gsonUtil");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "environment");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        this.d = quxVar;
    }

    public final com.truecaller.anrwatchdog.baz a() {
        try {
            return (com.truecaller.anrwatchdog.baz) ((u03.q) this.c.get()).a(((wj2.d) this.b.get()).b.d("anr-watchdog-abtest", ""), com.truecaller.anrwatchdog.baz.class);
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(e);
            return null;
        }
    }

    public final void b() {
        boolean z;
        int i;
        boolean z2;
        try {
            if (((qo1.k) this.a.get()).a.a("featureANRWatchdog", com.truecaller.featuretoggles.FeatureState.ENABLED_ALPHA_DEBUG)) {
                this.d.getClass();
                com.truecaller.anrwatchdog.baz a = a();
                if (a != null) {
                    z = kotlin.jvm.internal.Intrinsics.b(a.getEnabled(), java.lang.Boolean.TRUE);
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
                java.lang.Integer thresholdMs = a.getThresholdMs();
                if (thresholdMs != null) {
                    i = thresholdMs.intValue();
                } else {
                    i = 3000;
                }
                java.lang.Boolean reportMainThreadOnly = a.getReportMainThreadOnly();
                if (reportMainThreadOnly != null) {
                    z2 = reportMainThreadOnly.booleanValue();
                } else {
                    z2 = true;
                }
                com.github.anrwatchdog.ANRWatchDog aNRWatchDog = new com.github.anrwatchdog.ANRWatchDog(i);
                aNRWatchDog.setIgnoreDebugger(true);
                if (z2) {
                    aNRWatchDog.setReportMainThreadOnly();
                }
                aNRWatchDog.setANRListener(new b93.b(25));
                aNRWatchDog.start();
            }
        } catch (java.lang.Exception e) {
            com.truecaller.log.AssertionUtil.shouldNeverHappen(e, new java.lang.String[0]);
        }
    }
}
