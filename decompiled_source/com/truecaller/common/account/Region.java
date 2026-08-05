package com.truecaller.common.account;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common/account/Region;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "REGION_1", "REGION_C", "REGION_ZA", "REGION_BR", "REGION_2", "common-account_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class Region {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.account.Region[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.common.account.Region REGION_1 = new com.truecaller.common.account.Region("REGION_1", 0, "Region 1");
    public static final com.truecaller.common.account.Region REGION_C = new com.truecaller.common.account.Region("REGION_C", 1, "Region C");
    public static final com.truecaller.common.account.Region REGION_ZA = new com.truecaller.common.account.Region("REGION_ZA", 2, "Region ZA");
    public static final com.truecaller.common.account.Region REGION_BR = new com.truecaller.common.account.Region("REGION_BR", 3, "Region BR");
    public static final com.truecaller.common.account.Region REGION_2 = new com.truecaller.common.account.Region("REGION_2", 4, "Region 2");

    private static final /* synthetic */ com.truecaller.common.account.Region[] $values() {
        return new com.truecaller.common.account.Region[]{REGION_1, REGION_C, REGION_ZA, REGION_BR, REGION_2};
    }

    static {
        com.truecaller.common.account.Region[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Region(java.lang.String str, int i10, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.account.Region valueOf(java.lang.String str) {
        return (com.truecaller.common.account.Region) java.lang.Enum.valueOf(com.truecaller.common.account.Region.class, str);
    }

    public static com.truecaller.common.account.Region[] values() {
        return (com.truecaller.common.account.Region[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
