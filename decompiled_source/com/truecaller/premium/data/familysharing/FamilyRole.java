package com.truecaller.premium.data.familysharing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/premium/data/familysharing/FamilyRole;", "", "", "role", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getRole", "()Ljava/lang/String;", "Companion", "b92/bar", "OWNER", "MEMBER", "NONE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyRole {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.familysharing.FamilyRole[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final b92.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String role;
    public static final com.truecaller.premium.data.familysharing.FamilyRole OWNER = new com.truecaller.premium.data.familysharing.FamilyRole("OWNER", 0, "owner");
    public static final com.truecaller.premium.data.familysharing.FamilyRole MEMBER = new com.truecaller.premium.data.familysharing.FamilyRole("MEMBER", 1, "member");
    public static final com.truecaller.premium.data.familysharing.FamilyRole NONE = new com.truecaller.premium.data.familysharing.FamilyRole("NONE", 2, "none");

    private static final /* synthetic */ com.truecaller.premium.data.familysharing.FamilyRole[] $values() {
        return new com.truecaller.premium.data.familysharing.FamilyRole[]{OWNER, MEMBER, NONE};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, b92.bar] */
    static {
        com.truecaller.premium.data.familysharing.FamilyRole[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilyRole(java.lang.String str, int i, java.lang.String str2) {
        this.role = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.familysharing.FamilyRole fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return b92.bar.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.familysharing.FamilyRole valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.familysharing.FamilyRole) java.lang.Enum.valueOf(com.truecaller.premium.data.familysharing.FamilyRole.class, str);
    }

    public static com.truecaller.premium.data.familysharing.FamilyRole[] values() {
        return (com.truecaller.premium.data.familysharing.FamilyRole[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRole() {
        return this.role;
    }
}
