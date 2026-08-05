package com.truecaller.insights.catx.processor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/insights/catx/processor/Reason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_REPORTED_FRAUD", "FRAUD_PATTERN", "FRAUD_SENDER", "DEFAULT", "SUSPECTED_FRAUD_SENDER", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Reason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.Reason[] $VALUES;
    public static final com.truecaller.insights.catx.processor.Reason USER_REPORTED_FRAUD = new com.truecaller.insights.catx.processor.Reason("USER_REPORTED_FRAUD", 0);
    public static final com.truecaller.insights.catx.processor.Reason FRAUD_PATTERN = new com.truecaller.insights.catx.processor.Reason("FRAUD_PATTERN", 1);
    public static final com.truecaller.insights.catx.processor.Reason FRAUD_SENDER = new com.truecaller.insights.catx.processor.Reason("FRAUD_SENDER", 2);
    public static final com.truecaller.insights.catx.processor.Reason DEFAULT = new com.truecaller.insights.catx.processor.Reason("DEFAULT", 3);
    public static final com.truecaller.insights.catx.processor.Reason SUSPECTED_FRAUD_SENDER = new com.truecaller.insights.catx.processor.Reason("SUSPECTED_FRAUD_SENDER", 4);

    private static final /* synthetic */ com.truecaller.insights.catx.processor.Reason[] $values() {
        return new com.truecaller.insights.catx.processor.Reason[]{USER_REPORTED_FRAUD, FRAUD_PATTERN, FRAUD_SENDER, DEFAULT, SUSPECTED_FRAUD_SENDER};
    }

    static {
        com.truecaller.insights.catx.processor.Reason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Reason(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.Reason valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.Reason) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.Reason.class, str);
    }

    public static com.truecaller.insights.catx.processor.Reason[] values() {
        return (com.truecaller.insights.catx.processor.Reason[]) $VALUES.clone();
    }
}
