package com.truecaller.wizard.api.blocklevel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/wizard/api/blocklevel/BlockLevel;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "BASIC", "MAX", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BlockLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.api.blocklevel.BlockLevel[] $VALUES;
    public static final com.truecaller.wizard.api.blocklevel.BlockLevel OFF = new com.truecaller.wizard.api.blocklevel.BlockLevel("OFF", 0);
    public static final com.truecaller.wizard.api.blocklevel.BlockLevel BASIC = new com.truecaller.wizard.api.blocklevel.BlockLevel("BASIC", 1);
    public static final com.truecaller.wizard.api.blocklevel.BlockLevel MAX = new com.truecaller.wizard.api.blocklevel.BlockLevel("MAX", 2);

    private static final /* synthetic */ com.truecaller.wizard.api.blocklevel.BlockLevel[] $values() {
        return new com.truecaller.wizard.api.blocklevel.BlockLevel[]{OFF, BASIC, MAX};
    }

    static {
        com.truecaller.wizard.api.blocklevel.BlockLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BlockLevel(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.api.blocklevel.BlockLevel valueOf(java.lang.String str) {
        return (com.truecaller.wizard.api.blocklevel.BlockLevel) java.lang.Enum.valueOf(com.truecaller.wizard.api.blocklevel.BlockLevel.class, str);
    }

    public static com.truecaller.wizard.api.blocklevel.BlockLevel[] values() {
        return (com.truecaller.wizard.api.blocklevel.BlockLevel[]) $VALUES.clone();
    }
}
