package com.truecaller.data.entity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/data/entity/FeatureType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON_DEMAND", "ON_BOARDING", "MID_CALL", "CALL_BACK", "SECOND_CALL", "UNDEFINED", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FeatureType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.data.entity.FeatureType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.data.entity.FeatureType ON_DEMAND = new com.truecaller.data.entity.FeatureType("ON_DEMAND", 0, "on-demand");
    public static final com.truecaller.data.entity.FeatureType ON_BOARDING = new com.truecaller.data.entity.FeatureType("ON_BOARDING", 1, "on-boarded");
    public static final com.truecaller.data.entity.FeatureType MID_CALL = new com.truecaller.data.entity.FeatureType("MID_CALL", 2, "mid-ring");
    public static final com.truecaller.data.entity.FeatureType CALL_BACK = new com.truecaller.data.entity.FeatureType("CALL_BACK", 3, "call-back");
    public static final com.truecaller.data.entity.FeatureType SECOND_CALL = new com.truecaller.data.entity.FeatureType("SECOND_CALL", 4, "second-call");
    public static final com.truecaller.data.entity.FeatureType UNDEFINED = new com.truecaller.data.entity.FeatureType("UNDEFINED", 5, "undefined");

    private static final /* synthetic */ com.truecaller.data.entity.FeatureType[] $values() {
        return new com.truecaller.data.entity.FeatureType[]{ON_DEMAND, ON_BOARDING, MID_CALL, CALL_BACK, SECOND_CALL, UNDEFINED};
    }

    static {
        com.truecaller.data.entity.FeatureType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FeatureType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.data.entity.FeatureType valueOf(java.lang.String str) {
        return (com.truecaller.data.entity.FeatureType) java.lang.Enum.valueOf(com.truecaller.data.entity.FeatureType.class, str);
    }

    public static com.truecaller.data.entity.FeatureType[] values() {
        return (com.truecaller.data.entity.FeatureType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
