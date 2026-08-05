package com.truecaller.bizmon.callMeBack.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/analytics/BizCallMeBackAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHOW_CALL_ME_BACK", "CLICK_CALL_ME_BACK", "SHOW_CALL_ME_BACK_RESPONSE", "NOT_INTERESTED", "PICK_SLOT", "SELECT_DAY_SLOT", "SELECT_TIME_SLOT", "SCHEDULE_SLOT", "RESCHEDULE_SLOT", "DISMISS_BOTTOM_SHEET", "SHOW_PICK_SLOT_VIEW", "SHOW_DETAILS_RESCHEDULE_VIEW", "SHOW_CALL_ME_BACK_V1", "CLICK_CALL_ME_BACK_V1", "SHOW_CALL_ME_BACK_RESPONSE_V1", "EMPTY_SLOTS", "INVALID_SLOTS", "CALL_IN_30_MINUTES", "SHOW_NOT_INTERESTED", "SHOW_CALL_IN_30_MINUTES", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizCallMeBackAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_CALL_ME_BACK = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_CALL_ME_BACK", 0, "ShowCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction CLICK_CALL_ME_BACK = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("CLICK_CALL_ME_BACK", 1, "ClickCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_CALL_ME_BACK_RESPONSE = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_CALL_ME_BACK_RESPONSE", 2, "ShowCallMeBackResponse");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction NOT_INTERESTED = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("NOT_INTERESTED", 3, "NotInterestedCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction PICK_SLOT = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("PICK_SLOT", 4, "PickASlotCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SELECT_DAY_SLOT = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SELECT_DAY_SLOT", 5, "SelectDaySlotCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SELECT_TIME_SLOT = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SELECT_TIME_SLOT", 6, "SelectTimeSlotCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SCHEDULE_SLOT = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SCHEDULE_SLOT", 7, "ScheduleCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction RESCHEDULE_SLOT = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("RESCHEDULE_SLOT", 8, "RescheduleCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction DISMISS_BOTTOM_SHEET = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("DISMISS_BOTTOM_SHEET", 9, "DismissBottomSheetCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_PICK_SLOT_VIEW = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_PICK_SLOT_VIEW", 10, "ShowPickSlotView");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_DETAILS_RESCHEDULE_VIEW = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_DETAILS_RESCHEDULE_VIEW", 11, "ShowDetailsReScheduleView");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_CALL_ME_BACK_V1 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_CALL_ME_BACK_V1", 12, "ShowCallMeBackV1");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction CLICK_CALL_ME_BACK_V1 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("CLICK_CALL_ME_BACK_V1", 13, "ClickCallMeBackV1");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_CALL_ME_BACK_RESPONSE_V1 = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_CALL_ME_BACK_RESPONSE_V1", 14, "ShowCallMeBackResponseV1");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction EMPTY_SLOTS = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("EMPTY_SLOTS", 15, "EmptySlots");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction INVALID_SLOTS = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("INVALID_SLOTS", 16, "InvalidSlots");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction CALL_IN_30_MINUTES = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("CALL_IN_30_MINUTES", 17, "CallIn30Minutes");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_NOT_INTERESTED = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_NOT_INTERESTED", 18, "ShowNotInterestedCallMeBack");
    public static final com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction SHOW_CALL_IN_30_MINUTES = new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction("SHOW_CALL_IN_30_MINUTES", 19, "ShowCallIn30Minutes");

    private static final /* synthetic */ com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[] $values() {
        return new com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[]{SHOW_CALL_ME_BACK, CLICK_CALL_ME_BACK, SHOW_CALL_ME_BACK_RESPONSE, NOT_INTERESTED, PICK_SLOT, SELECT_DAY_SLOT, SELECT_TIME_SLOT, SCHEDULE_SLOT, RESCHEDULE_SLOT, DISMISS_BOTTOM_SHEET, SHOW_PICK_SLOT_VIEW, SHOW_DETAILS_RESCHEDULE_VIEW, SHOW_CALL_ME_BACK_V1, CLICK_CALL_ME_BACK_V1, SHOW_CALL_ME_BACK_RESPONSE_V1, EMPTY_SLOTS, INVALID_SLOTS, CALL_IN_30_MINUTES, SHOW_NOT_INTERESTED, SHOW_CALL_IN_30_MINUTES};
    }

    static {
        com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizCallMeBackAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction) java.lang.Enum.valueOf(com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction.class, str);
    }

    public static com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[] values() {
        return (com.truecaller.bizmon.callMeBack.analytics.BizCallMeBackAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
