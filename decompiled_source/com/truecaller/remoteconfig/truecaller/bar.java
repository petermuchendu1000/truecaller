package com.truecaller.remoteconfig.truecaller;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public abstract /* synthetic */ class bar {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.values().length];
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.NO_UPGRADE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.OPTIONAL.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.MANDATORY.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[com.truecaller.remoteconfig.truecaller.UpgradeStatusDto.UpgradePathDto.RETIRED_VERSION.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
