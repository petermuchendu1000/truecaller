package com.truecaller.premium.premiumusertab.list.familysharing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/premium/premiumusertab/list/familysharing/FamilyCardAction;", "", "res", "", "event", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getRes", "()I", "getEvent", "()Ljava/lang/String;", "SAY_THANKS", "SEND_REMINDER", "OWNER_AVAILABLE", "OWNER_NOT_AVAILABLE", "START_CHAT", "MANAGE_FAMILY", "MORE_OPTIONS", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilyCardAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String event;
    private final int res;
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction SAY_THANKS = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("SAY_THANKS", 0, 2132018483, "ItemEvent.FAMILY_SHARING_START_CHAT_EVENT");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction SEND_REMINDER = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("SEND_REMINDER", 1, 2132018484, "ItemEvent.FAMILY_SHARING_START_CHAT_EVENT");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction OWNER_AVAILABLE = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("OWNER_AVAILABLE", 2, 2132018708, "ItemEvent.FAMILY_SHARING_ADD_EVENT");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction OWNER_NOT_AVAILABLE = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("OWNER_NOT_AVAILABLE", 3, 2132018708, "ItemEvent.FAMILY_SHARING_NOT_INCLUDED_EVENT");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction START_CHAT = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("START_CHAT", 4, 2132018485, "ItemEvent.FAMILY_SHARING_START_CHAT_EVENT");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction MANAGE_FAMILY = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("MANAGE_FAMILY", 5, 2132018481, "ItemEvent.FAMILY_SHARING_MANAGE_FAMILY");
    public static final com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction MORE_OPTIONS = new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction("MORE_OPTIONS", 6, 2132018482, "ItemEvent.FAMILY_SHARING_MORE_OPTIONS");

    private static final /* synthetic */ com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[] $values() {
        return new com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[]{SAY_THANKS, SEND_REMINDER, OWNER_AVAILABLE, OWNER_NOT_AVAILABLE, START_CHAT, MANAGE_FAMILY, MORE_OPTIONS};
    }

    static {
        com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilyCardAction(java.lang.String str, int i, int i2, java.lang.String str2) {
        this.res = i2;
        this.event = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction.class, str);
    }

    public static com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[] values() {
        return (com.truecaller.premium.premiumusertab.list.familysharing.FamilyCardAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEvent() {
        return this.event;
    }

    public final int getRes() {
        return this.res;
    }
}
