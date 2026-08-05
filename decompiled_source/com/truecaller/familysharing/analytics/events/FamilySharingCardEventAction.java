package com.truecaller.familysharing.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/familysharing/analytics/events/FamilySharingCardEventAction;", "", "<init>", "(Ljava/lang/String;I)V", "AddFamilyMemberClick", "SayThanksClick", "StartChatClick", "SendReminderClick", "familysharing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FamilySharingCardEventAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[] $VALUES;
    public static final com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction AddFamilyMemberClick = new com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction("AddFamilyMemberClick", 0);
    public static final com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction SayThanksClick = new com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction("SayThanksClick", 1);
    public static final com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction StartChatClick = new com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction("StartChatClick", 2);
    public static final com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction SendReminderClick = new com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction("SendReminderClick", 3);

    private static final /* synthetic */ com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[] $values() {
        return new com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[]{AddFamilyMemberClick, SayThanksClick, StartChatClick, SendReminderClick};
    }

    static {
        com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FamilySharingCardEventAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction valueOf(java.lang.String str) {
        return (com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction) java.lang.Enum.valueOf(com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction.class, str);
    }

    public static com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[] values() {
        return (com.truecaller.familysharing.analytics.events.FamilySharingCardEventAction[]) $VALUES.clone();
    }
}
