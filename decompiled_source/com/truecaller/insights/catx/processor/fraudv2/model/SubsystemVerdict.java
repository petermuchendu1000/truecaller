package com.truecaller.insights.catx.processor.fraudv2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/insights/catx/processor/fraudv2/model/SubsystemVerdict;", "", "<init>", "(Ljava/lang/String;I)V", "FRAUD", "NOT_FRAUD", "TIMEOUT", "NOT_APPLICABLE", "DISABLED", "ERROR", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SubsystemVerdict {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[] $VALUES;
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict FRAUD = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("FRAUD", 0);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict NOT_FRAUD = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("NOT_FRAUD", 1);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict TIMEOUT = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("TIMEOUT", 2);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict NOT_APPLICABLE = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("NOT_APPLICABLE", 3);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict DISABLED = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("DISABLED", 4);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict ERROR = new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict("ERROR", 5);

    private static final /* synthetic */ com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[] $values() {
        return new com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[]{FRAUD, NOT_FRAUD, TIMEOUT, NOT_APPLICABLE, DISABLED, ERROR};
    }

    static {
        com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubsystemVerdict(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict.class, str);
    }

    public static com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[] values() {
        return (com.truecaller.insights.catx.processor.fraudv2.model.SubsystemVerdict[]) $VALUES.clone();
    }
}
