package com.truecaller.data.entity.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/data/entity/messaging/FraudReportType;", "", "", "dbValue", "<init>", "(Ljava/lang/String;II)V", "I", "getDbValue", "()I", "Companion", "s81/bar", "NONE", "REPORTED_FRAUD", "REPORTED_SAFE", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudReportType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.data.entity.messaging.FraudReportType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final s81.bar Companion;
    public static final com.truecaller.data.entity.messaging.FraudReportType NONE = new com.truecaller.data.entity.messaging.FraudReportType("NONE", 0, 0);
    public static final com.truecaller.data.entity.messaging.FraudReportType REPORTED_FRAUD = new com.truecaller.data.entity.messaging.FraudReportType("REPORTED_FRAUD", 1, 1);
    public static final com.truecaller.data.entity.messaging.FraudReportType REPORTED_SAFE = new com.truecaller.data.entity.messaging.FraudReportType("REPORTED_SAFE", 2, 2);
    private final int dbValue;

    private static final /* synthetic */ com.truecaller.data.entity.messaging.FraudReportType[] $values() {
        return new com.truecaller.data.entity.messaging.FraudReportType[]{NONE, REPORTED_FRAUD, REPORTED_SAFE};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [s81.bar, java.lang.Object] */
    static {
        com.truecaller.data.entity.messaging.FraudReportType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FraudReportType(java.lang.String str, int i, int i2) {
        this.dbValue = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.data.entity.messaging.FraudReportType fromDbValue(int i) {
        Companion.getClass();
        return s81.bar.a(i);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.data.entity.messaging.FraudReportType valueOf(java.lang.String str) {
        return (com.truecaller.data.entity.messaging.FraudReportType) java.lang.Enum.valueOf(com.truecaller.data.entity.messaging.FraudReportType.class, str);
    }

    public static com.truecaller.data.entity.messaging.FraudReportType[] values() {
        return (com.truecaller.data.entity.messaging.FraudReportType[]) $VALUES.clone();
    }

    public final int getDbValue() {
        return this.dbValue;
    }
}
