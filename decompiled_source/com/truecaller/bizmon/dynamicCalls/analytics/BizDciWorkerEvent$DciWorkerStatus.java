package com.truecaller.bizmon.dynamicCalls.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/bizmon/dynamicCalls/analytics/BizDciWorkerEvent$DciWorkerStatus", "", "Lcom/truecaller/bizmon/dynamicCalls/analytics/BizDciWorkerEvent$DciWorkerStatus;", "", "value", "<init>", "(Ljava/lang/String;IZ)V", "Z", "getValue", "()Z", "SUCCESS", "FAILURE", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizDciWorkerEvent$DciWorkerStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[] $VALUES;
    private final boolean value;
    public static final com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus SUCCESS = new com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus("SUCCESS", 0, true);
    public static final com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus FAILURE = new com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus("FAILURE", 1, false);

    private static final /* synthetic */ com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[] $values() {
        return new com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[]{SUCCESS, FAILURE};
    }

    static {
        com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizDciWorkerEvent$DciWorkerStatus(java.lang.String str, int i, boolean z) {
        this.value = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus) java.lang.Enum.valueOf(com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus.class, str);
    }

    public static com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[] values() {
        return (com.truecaller.bizmon.dynamicCalls.analytics.BizDciWorkerEvent$DciWorkerStatus[]) $VALUES.clone();
    }

    public final boolean getValue() {
        return this.value;
    }
}
