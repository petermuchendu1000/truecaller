package com.truecaller.insights.catx.processor.fraudv2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/insights/catx/processor/fraudv2/model/FraudSignalScope;", "", "<init>", "(Ljava/lang/String;I)V", "SENDER", "MESSAGE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudSignalScope {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[] $VALUES;
    public static final com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope SENDER = new com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope("SENDER", 0);
    public static final com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope MESSAGE = new com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope("MESSAGE", 1);

    private static final /* synthetic */ com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[] $values() {
        return new com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[]{SENDER, MESSAGE};
    }

    static {
        com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FraudSignalScope(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope valueOf(java.lang.String str) {
        return (com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope) java.lang.Enum.valueOf(com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope.class, str);
    }

    public static com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[] values() {
        return (com.truecaller.insights.catx.processor.fraudv2.model.FraudSignalScope[]) $VALUES.clone();
    }
}
