package com.truecaller.common.cloudtelephony.autodial.network.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE", "DISABLE", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class AutoDialActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[] $VALUES;
    public static final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType ENABLE = new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType("ENABLE", 0);
    public static final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType DISABLE = new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType("DISABLE", 1);

    private static final /* synthetic */ com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[] $values() {
        return new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[]{ENABLE, DISABLE};
    }

    static {
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AutoDialActionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType valueOf(java.lang.String str) {
        return (com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType) java.lang.Enum.valueOf(com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType.class, str);
    }

    public static com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[] values() {
        return (com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType[]) $VALUES.clone();
    }
}
