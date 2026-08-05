package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class k implements com.google.protobuf.Internal.EnumVerifier {
    public static final com.truecaller.remoteconfig.experiment.k a = new java.lang.Object();

    public final boolean isInRange(int i) {
        if (com.truecaller.remoteconfig.experiment.ExperimentActivationStatus.forNumber(i) != null) {
            return true;
        }
        return false;
    }
}
