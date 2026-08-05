package com.truecaller.familyprotect.domain.data.network;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/familyprotect/domain/data/network/ListFamilyGroupV3Scenario;", "", "<init>", "(Ljava/lang/String;I)V", "ADMIN_S3_PREMIUM_ONLY", "ADMIN_S1_PROTECTION_ONLY", "ADMIN_S2_PROTECTION_AND_PREMIUM", "MEMBER_S3_PREMIUM_ONLY", "MEMBER_S1_PROTECTION_ONLY", "MEMBER_S2_PROTECTION_AND_PREMIUM", "INVITED_TO_PREMIUM", "INVITED_TO_PROTECTION_AND_PREMIUM", "INVITED_TO_PROTECTION", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ListFamilyGroupV3Scenario {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[] $VALUES;
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario ADMIN_S3_PREMIUM_ONLY = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("ADMIN_S3_PREMIUM_ONLY", 0);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario ADMIN_S1_PROTECTION_ONLY = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("ADMIN_S1_PROTECTION_ONLY", 1);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario ADMIN_S2_PROTECTION_AND_PREMIUM = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("ADMIN_S2_PROTECTION_AND_PREMIUM", 2);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario MEMBER_S3_PREMIUM_ONLY = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("MEMBER_S3_PREMIUM_ONLY", 3);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario MEMBER_S1_PROTECTION_ONLY = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("MEMBER_S1_PROTECTION_ONLY", 4);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario MEMBER_S2_PROTECTION_AND_PREMIUM = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("MEMBER_S2_PROTECTION_AND_PREMIUM", 5);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario INVITED_TO_PREMIUM = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("INVITED_TO_PREMIUM", 6);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario INVITED_TO_PROTECTION_AND_PREMIUM = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("INVITED_TO_PROTECTION_AND_PREMIUM", 7);
    public static final com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario INVITED_TO_PROTECTION = new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario("INVITED_TO_PROTECTION", 8);

    private static final /* synthetic */ com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[] $values() {
        return new com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[]{ADMIN_S3_PREMIUM_ONLY, ADMIN_S1_PROTECTION_ONLY, ADMIN_S2_PROTECTION_AND_PREMIUM, MEMBER_S3_PREMIUM_ONLY, MEMBER_S1_PROTECTION_ONLY, MEMBER_S2_PROTECTION_AND_PREMIUM, INVITED_TO_PREMIUM, INVITED_TO_PROTECTION_AND_PREMIUM, INVITED_TO_PROTECTION};
    }

    static {
        com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ListFamilyGroupV3Scenario(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario) java.lang.Enum.valueOf(com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario.class, str);
    }

    public static com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[] values() {
        return (com.truecaller.familyprotect.domain.data.network.ListFamilyGroupV3Scenario[]) $VALUES.clone();
    }
}
