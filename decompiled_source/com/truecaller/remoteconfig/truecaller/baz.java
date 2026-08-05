package com.truecaller.remoteconfig.truecaller;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class baz implements zj2.b {
    public final qc3.bar a;
    public final qc3.bar b;

    public baz(qc3.bar barVar, qc3.bar barVar2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "configRestAdapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "configListeners");
        this.a = barVar;
        this.b = barVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2, types: [r5.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        com.truecaller.remoteconfig.truecaller.ConfigResponseDto configResponseDto;
        r5.g gVar;
        com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath upgradeStatus$UpgradePath;
        wj3.k0 H;
        java.lang.Object obj;
        try {
            H = ((zj2.baz) ((zj2.bar) this.a.get()).a.getValue()).d().H();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(H, "execute(...)");
        } catch (java.io.IOException unused) {
        }
        if (H.a.k() && (obj = H.b) != null) {
            configResponseDto = (com.truecaller.remoteconfig.truecaller.ConfigResponseDto) obj;
            if (configResponseDto != null) {
                return false;
            }
            qc3.bar barVar = this.b;
            java.lang.Object obj2 = barVar.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            for (zj2.c cVar : (java.lang.Iterable) obj2) {
                java.util.Map features = configResponseDto.getFeatures();
                if (features != null) {
                    cVar.f(features);
                }
                com.truecaller.remoteconfig.truecaller.UpgradeStatusDto upgradeStatus = configResponseDto.getUpgradeStatus();
                if (upgradeStatus != null) {
                    com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto upgradePath = upgradeStatus.getUpgradePath();
                    if (upgradePath != null) {
                        int i = com.truecaller.remoteconfig.truecaller.bar.a[upgradePath.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        upgradeStatus$UpgradePath = com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath.RETIRED_VERSION;
                                    } else {
                                        throw new java.lang.RuntimeException();
                                    }
                                } else {
                                    upgradeStatus$UpgradePath = com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath.MANDATORY;
                                }
                            } else {
                                upgradeStatus$UpgradePath = com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath.OPTIONAL;
                            }
                        } else {
                            upgradeStatus$UpgradePath = com.truecaller.remoteconfig.truecaller.UpgradeStatus$UpgradePath.NO_UPGRADE;
                        }
                    } else {
                        upgradeStatus$UpgradePath = null;
                    }
                    java.lang.String downloadLink = upgradeStatus.getDownloadLink();
                    int frequency = upgradeStatus.getFrequency();
                    gVar = new java.lang.Object();
                    ((r5.g) gVar).b = upgradeStatus$UpgradePath;
                    ((r5.g) gVar).c = downloadLink;
                    ((r5.g) gVar).a = frequency;
                } else {
                    gVar = 0;
                }
                cVar.c(gVar);
            }
            if (configResponseDto.getFeatures() == null) {
                com.truecaller.log.AssertionUtil.reportWeirdnessButNeverCrash("features object not present");
            }
            java.lang.Object obj3 = barVar.get();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            java.util.Iterator it = ((java.lang.Iterable) obj3).iterator();
            while (it.hasNext()) {
                ((zj2.c) it.next()).a();
            }
            return true;
        }
        configResponseDto = null;
        if (configResponseDto != null) {
        }
    }
}
