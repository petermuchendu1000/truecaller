package com.truecaller.ads.adsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleEnabledPropertyOperator;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EQUAL", "NOT_EQUAL", "GREATER_THAN", "GREATER_THAN_EQUAL", "LESSER_THAN", "LESSER_THAN_EQUAL", "RANGE", "IN", "validate", "", "actualValue", "propertyValue", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public abstract class NeoRuleEnabledPropertyOperator {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[] $VALUES;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator EQUAL;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator GREATER_THAN;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator GREATER_THAN_EQUAL;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator IN;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator LESSER_THAN;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator LESSER_THAN_EQUAL;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator NOT_EQUAL;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator RANGE;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[] $values() {
        return new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[]{EQUAL, NOT_EQUAL, GREATER_THAN, GREATER_THAN_EQUAL, LESSER_THAN, LESSER_THAN_EQUAL, RANGE, IN};
    }

    static {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        EQUAL = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("EQUAL", 0, "=", defaultConstructorMarker);
        NOT_EQUAL = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("NOT_EQUAL", 1, "!=", defaultConstructorMarker);
        GREATER_THAN = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("GREATER_THAN", 2, ">", defaultConstructorMarker);
        GREATER_THAN_EQUAL = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("GREATER_THAN_EQUAL", 3, ">=", defaultConstructorMarker);
        LESSER_THAN = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("LESSER_THAN", 4, "<", defaultConstructorMarker);
        LESSER_THAN_EQUAL = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("LESSER_THAN_EQUAL", 5, "<=", defaultConstructorMarker);
        RANGE = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("RANGE", 6, "..", defaultConstructorMarker);
        IN = new com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator("IN", 7, "in", defaultConstructorMarker);
        com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    public /* synthetic */ NeoRuleEnabledPropertyOperator(java.lang.String str, int i, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator) java.lang.Enum.valueOf(com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator.class, str);
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[] values() {
        return (com.truecaller.ads.adsrules.model.NeoRuleEnabledPropertyOperator[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public abstract boolean validate(@org.jetbrains.annotations.NotNull java.lang.String actualValue, @org.jetbrains.annotations.NotNull java.lang.String propertyValue);

    private NeoRuleEnabledPropertyOperator(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }
}
