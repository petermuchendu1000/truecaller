package com.truecaller.insights.models.pdo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/insights/models/pdo/ClassifierType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "jw1/baz", "DEFAULT", "MODEL", "PARSER", "USER", "models_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ClassifierType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.models.pdo.ClassifierType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final jw1.baz Companion;
    public static final com.truecaller.insights.models.pdo.ClassifierType DEFAULT = new com.truecaller.insights.models.pdo.ClassifierType("DEFAULT", 0, -1);
    public static final com.truecaller.insights.models.pdo.ClassifierType MODEL = new com.truecaller.insights.models.pdo.ClassifierType("MODEL", 1, 1);
    public static final com.truecaller.insights.models.pdo.ClassifierType PARSER = new com.truecaller.insights.models.pdo.ClassifierType("PARSER", 2, 2);
    public static final com.truecaller.insights.models.pdo.ClassifierType USER = new com.truecaller.insights.models.pdo.ClassifierType("USER", 3, 3);
    private final int value;

    private static final /* synthetic */ com.truecaller.insights.models.pdo.ClassifierType[] $values() {
        return new com.truecaller.insights.models.pdo.ClassifierType[]{DEFAULT, MODEL, PARSER, USER};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, jw1.baz] */
    static {
        com.truecaller.insights.models.pdo.ClassifierType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ClassifierType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.models.pdo.ClassifierType valueOf(java.lang.String str) {
        return (com.truecaller.insights.models.pdo.ClassifierType) java.lang.Enum.valueOf(com.truecaller.insights.models.pdo.ClassifierType.class, str);
    }

    public static com.truecaller.insights.models.pdo.ClassifierType[] values() {
        return (com.truecaller.insights.models.pdo.ClassifierType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
