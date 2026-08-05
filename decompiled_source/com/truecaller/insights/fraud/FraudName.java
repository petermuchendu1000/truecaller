package com.truecaller.insights.fraud;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001b\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/insights/fraud/FraudName;", "", "", "key", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "I", "getLabel", "()I", "Companion", "jv1/b", "Fraud", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FraudName {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.FraudName[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final jv1.b Companion;
    public static final com.truecaller.insights.fraud.FraudName Fraud = new com.truecaller.insights.fraud.FraudName("Fraud", 0, "fraud", 2132021342);

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.fraud.FraudName> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    private final int label;

    private static final /* synthetic */ com.truecaller.insights.fraud.FraudName[] $values() {
        return new com.truecaller.insights.fraud.FraudName[]{Fraud};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [jv1.b, java.lang.Object] */
    static {
        com.truecaller.insights.fraud.FraudName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.fraud.FraudName[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (com.truecaller.insights.fraud.FraudName fraudName : values) {
            java.lang.String str = fraudName.key;
            java.util.Locale locale = java.util.Locale.ENGLISH;
            linkedHashMap.put(ax1.bar.r(locale, "ENGLISH", str, locale, "toLowerCase(...)"), fraudName);
        }
        map = linkedHashMap;
    }

    private FraudName(java.lang.String str, int i, java.lang.String str2, int i2) {
        this.key = str2;
        this.label = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.FraudName valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.FraudName) java.lang.Enum.valueOf(com.truecaller.insights.fraud.FraudName.class, str);
    }

    public static com.truecaller.insights.fraud.FraudName[] values() {
        return (com.truecaller.insights.fraud.FraudName[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    public final int getLabel() {
        return this.label;
    }
}
