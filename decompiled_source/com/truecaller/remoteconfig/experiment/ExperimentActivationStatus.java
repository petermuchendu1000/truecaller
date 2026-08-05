package com.truecaller.remoteconfig.experiment;

/* loaded from: /home/user/tc_decoded/classes7.dex */
public enum ExperimentActivationStatus implements com.google.protobuf.Internal.EnumLite {
    REGISTERED(0),
    COMPLETED(1),
    UNRECOGNIZED(-1);

    public static final int COMPLETED_VALUE = 1;
    public static final int REGISTERED_VALUE = 0;
    private static final com.google.protobuf.Internal.EnumLiteMap<com.truecaller.remoteconfig.experiment.ExperimentActivationStatus> internalValueMap = new java.lang.Object();
    private final int value;

    ExperimentActivationStatus(int i) {
        this.value = i;
    }

    public static com.truecaller.remoteconfig.experiment.ExperimentActivationStatus forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return COMPLETED;
        }
        return REGISTERED;
    }

    public static com.google.protobuf.Internal.EnumLiteMap<com.truecaller.remoteconfig.experiment.ExperimentActivationStatus> internalGetValueMap() {
        return internalValueMap;
    }

    public static com.google.protobuf.Internal.EnumVerifier internalGetVerifier() {
        return com.truecaller.remoteconfig.experiment.k.a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @java.lang.Deprecated
    public static com.truecaller.remoteconfig.experiment.ExperimentActivationStatus valueOf(int i) {
        return forNumber(i);
    }
}
