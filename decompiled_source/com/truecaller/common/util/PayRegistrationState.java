package com.truecaller.common.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/common/util/PayRegistrationState;", "", "eventValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventValue", "()Ljava/lang/String;", "PAY_REGISTERED", "TEMP_REGISTERED", "NON_REGISTERED", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class PayRegistrationState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.util.PayRegistrationState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eventValue;
    public static final com.truecaller.common.util.PayRegistrationState PAY_REGISTERED = new com.truecaller.common.util.PayRegistrationState("PAY_REGISTERED", 0, "pay_registered");
    public static final com.truecaller.common.util.PayRegistrationState TEMP_REGISTERED = new com.truecaller.common.util.PayRegistrationState("TEMP_REGISTERED", 1, "temp_registered");
    public static final com.truecaller.common.util.PayRegistrationState NON_REGISTERED = new com.truecaller.common.util.PayRegistrationState("NON_REGISTERED", 2, "non_registered");

    private static final /* synthetic */ com.truecaller.common.util.PayRegistrationState[] $values() {
        return new com.truecaller.common.util.PayRegistrationState[]{PAY_REGISTERED, TEMP_REGISTERED, NON_REGISTERED};
    }

    static {
        com.truecaller.common.util.PayRegistrationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PayRegistrationState(java.lang.String str, int i, java.lang.String str2) {
        this.eventValue = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.util.PayRegistrationState valueOf(java.lang.String str) {
        return (com.truecaller.common.util.PayRegistrationState) java.lang.Enum.valueOf(com.truecaller.common.util.PayRegistrationState.class, str);
    }

    public static com.truecaller.common.util.PayRegistrationState[] values() {
        return (com.truecaller.common.util.PayRegistrationState[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEventValue() {
        return this.eventValue;
    }
}
