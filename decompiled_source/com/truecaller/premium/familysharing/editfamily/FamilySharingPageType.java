package com.truecaller.premium.familysharing.editfamily;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/premium/familysharing/editfamily/FamilySharingPageType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "xa2/b", "OWNER", "MEMBER", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingPageType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final xa2.b Companion;
    public static final com.truecaller.premium.familysharing.editfamily.FamilySharingPageType OWNER = new com.truecaller.premium.familysharing.editfamily.FamilySharingPageType("OWNER", 0);
    public static final com.truecaller.premium.familysharing.editfamily.FamilySharingPageType MEMBER = new com.truecaller.premium.familysharing.editfamily.FamilySharingPageType("MEMBER", 1);

    private static final /* synthetic */ com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[] $values() {
        return new com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[]{OWNER, MEMBER};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xa2.b] */
    static {
        com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FamilySharingPageType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.familysharing.editfamily.FamilySharingPageType valueOf(java.lang.String str) {
        return (com.truecaller.premium.familysharing.editfamily.FamilySharingPageType) java.lang.Enum.valueOf(com.truecaller.premium.familysharing.editfamily.FamilySharingPageType.class, str);
    }

    public static com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[] values() {
        return (com.truecaller.premium.familysharing.editfamily.FamilySharingPageType[]) $VALUES.clone();
    }
}
