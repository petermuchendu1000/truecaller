package com.truecaller.forcedupdate.ui;

/* loaded from: /home/user/tc_decoded/classes6.dex */
public abstract /* synthetic */ class g {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath.values().length];
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath.OPTIONAL.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath.MANDATORY.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatus.UpgradePath.RETIRED_VERSION.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
