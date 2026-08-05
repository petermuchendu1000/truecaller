package com.truecaller.wearable.support;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/wearable/support/WearableNodeCapability;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "TRUECALLER_WEAR", "support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WearableNodeCapability {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wearable.support.WearableNodeCapability[] $VALUES;
    public static final com.truecaller.wearable.support.WearableNodeCapability TRUECALLER_WEAR = new com.truecaller.wearable.support.WearableNodeCapability("TRUECALLER_WEAR", 0, "truecaller_wear");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    private static final /* synthetic */ com.truecaller.wearable.support.WearableNodeCapability[] $values() {
        return new com.truecaller.wearable.support.WearableNodeCapability[]{TRUECALLER_WEAR};
    }

    static {
        com.truecaller.wearable.support.WearableNodeCapability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private WearableNodeCapability(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wearable.support.WearableNodeCapability valueOf(java.lang.String str) {
        return (com.truecaller.wearable.support.WearableNodeCapability) java.lang.Enum.valueOf(com.truecaller.wearable.support.WearableNodeCapability.class, str);
    }

    public static com.truecaller.wearable.support.WearableNodeCapability[] values() {
        return (com.truecaller.wearable.support.WearableNodeCapability[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
