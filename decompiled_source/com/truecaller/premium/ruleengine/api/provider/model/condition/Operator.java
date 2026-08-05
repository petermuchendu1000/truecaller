package com.truecaller.premium.ruleengine.api.provider.model.condition;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/premium/ruleengine/api/provider/model/condition/Operator;", "", "<init>", "(Ljava/lang/String;I)V", "Equals", "NotEquals", "GreaterThan", "GreaterThanEqual", "LessThan", "LessThanEqual", "Contains", "NotContains", "In", "NotIn", "Undefined", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Operator {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[] $VALUES;

    @bw.qux("equals")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator Equals = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("Equals", 0);

    @bw.qux("not_equals")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator NotEquals = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("NotEquals", 1);

    @bw.qux("greater_than")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator GreaterThan = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("GreaterThan", 2);

    @bw.qux("greater_than_equal")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator GreaterThanEqual = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("GreaterThanEqual", 3);

    @bw.qux("less_than")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator LessThan = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("LessThan", 4);

    @bw.qux("less_than_equal")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator LessThanEqual = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("LessThanEqual", 5);

    @bw.qux("contains")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator Contains = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("Contains", 6);

    @bw.qux("not_contains")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator NotContains = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("NotContains", 7);

    @bw.qux("in")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator In = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("In", 8);

    @bw.qux("not_in")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator NotIn = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("NotIn", 9);

    @bw.qux("undefined")
    public static final com.truecaller.premium.ruleengine.api.provider.model.condition.Operator Undefined = new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator("Undefined", 10);

    private static final /* synthetic */ com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[] $values() {
        return new com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[]{Equals, NotEquals, GreaterThan, GreaterThanEqual, LessThan, LessThanEqual, Contains, NotContains, In, NotIn, Undefined};
    }

    static {
        com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Operator(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ruleengine.api.provider.model.condition.Operator valueOf(java.lang.String str) {
        return (com.truecaller.premium.ruleengine.api.provider.model.condition.Operator) java.lang.Enum.valueOf(com.truecaller.premium.ruleengine.api.provider.model.condition.Operator.class, str);
    }

    public static com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[] values() {
        return (com.truecaller.premium.ruleengine.api.provider.model.condition.Operator[]) $VALUES.clone();
    }
}
