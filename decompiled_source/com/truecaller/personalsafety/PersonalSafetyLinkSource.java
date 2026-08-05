package com.truecaller.personalsafety;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/personalsafety/PersonalSafetyLinkSource;", "", "<init>", "(Ljava/lang/String;I)V", "OTHER", "HOME_PROMO", "SIDE_MENU", "DEEP_LINK", "personal-safety_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PersonalSafetyLinkSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.personalsafety.PersonalSafetyLinkSource[] $VALUES;
    public static final com.truecaller.personalsafety.PersonalSafetyLinkSource OTHER = new com.truecaller.personalsafety.PersonalSafetyLinkSource("OTHER", 0);
    public static final com.truecaller.personalsafety.PersonalSafetyLinkSource HOME_PROMO = new com.truecaller.personalsafety.PersonalSafetyLinkSource("HOME_PROMO", 1);
    public static final com.truecaller.personalsafety.PersonalSafetyLinkSource SIDE_MENU = new com.truecaller.personalsafety.PersonalSafetyLinkSource("SIDE_MENU", 2);
    public static final com.truecaller.personalsafety.PersonalSafetyLinkSource DEEP_LINK = new com.truecaller.personalsafety.PersonalSafetyLinkSource("DEEP_LINK", 3);

    private static final /* synthetic */ com.truecaller.personalsafety.PersonalSafetyLinkSource[] $values() {
        return new com.truecaller.personalsafety.PersonalSafetyLinkSource[]{OTHER, HOME_PROMO, SIDE_MENU, DEEP_LINK};
    }

    static {
        com.truecaller.personalsafety.PersonalSafetyLinkSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PersonalSafetyLinkSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.personalsafety.PersonalSafetyLinkSource valueOf(java.lang.String str) {
        return (com.truecaller.personalsafety.PersonalSafetyLinkSource) java.lang.Enum.valueOf(com.truecaller.personalsafety.PersonalSafetyLinkSource.class, str);
    }

    public static com.truecaller.personalsafety.PersonalSafetyLinkSource[] values() {
        return (com.truecaller.personalsafety.PersonalSafetyLinkSource[]) $VALUES.clone();
    }
}
