package com.truecaller.familyprotect.api.protectionconfig.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/familyprotect/api/protectionconfig/model/FamilyBlockPatternType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "ak1/c", "UNKNOWN", "PHONE", "SENDER_ID", "COUNTRY_CODE", "NUMBER_SERIES", "NAME", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyBlockPatternType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ak1.c Companion;
    private final int value;
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType UNKNOWN = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("UNKNOWN", 0, 0);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType PHONE = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("PHONE", 1, 1);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType SENDER_ID = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("SENDER_ID", 2, 2);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType COUNTRY_CODE = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("COUNTRY_CODE", 3, 3);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType NUMBER_SERIES = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("NUMBER_SERIES", 4, 4);
    public static final com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType NAME = new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType("NAME", 5, 5);

    private static final /* synthetic */ com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[] $values() {
        return new com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[]{UNKNOWN, PHONE, SENDER_ID, COUNTRY_CODE, NUMBER_SERIES, NAME};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ak1.c, java.lang.Object] */
    static {
        com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilyBlockPatternType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType.class, str);
    }

    public static com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[] values() {
        return (com.truecaller.familyprotect.api.protectionconfig.model.FamilyBlockPatternType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
