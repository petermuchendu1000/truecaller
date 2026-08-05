package com.truecaller.enterprisefeedback.api.internal.callmeback.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/enterprisefeedback/api/internal/callmeback/analytics/CallMeBackAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PICK_SLOT", "RESCHEDULE_SLOT_CALL_ME_BACK", "SHOW_PICK_SLOT_VIEW", "SHOW_RESCHEDULE_VIEW", "SCHEDULE_SLOT", "RESCHEDULE_SLOT", "SELECT_DAY_SLOT", "SELECT_TIME_SLOT", "DISMISS_BOTTOM_SHEET", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallMeBackAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction PICK_SLOT = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("PICK_SLOT", 0, "PickASlotCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction RESCHEDULE_SLOT_CALL_ME_BACK = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("RESCHEDULE_SLOT_CALL_ME_BACK", 1, "RescheduleSlotCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction SHOW_PICK_SLOT_VIEW = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("SHOW_PICK_SLOT_VIEW", 2, "ShowPickSlotView");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction SHOW_RESCHEDULE_VIEW = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("SHOW_RESCHEDULE_VIEW", 3, "ShowDetailsReScheduleView");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction SCHEDULE_SLOT = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("SCHEDULE_SLOT", 4, "ScheduleCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction RESCHEDULE_SLOT = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("RESCHEDULE_SLOT", 5, "RescheduleCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction SELECT_DAY_SLOT = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("SELECT_DAY_SLOT", 6, "SelectDaySlotCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction SELECT_TIME_SLOT = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("SELECT_TIME_SLOT", 7, "SelectTimeSlotCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction DISMISS_BOTTOM_SHEET = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("DISMISS_BOTTOM_SHEET", 8, "DismissBottomSheetCallMeBack");
    public static final com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction UNKNOWN = new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction("UNKNOWN", 9, "Unknown");

    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[] $values() {
        return new com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[]{PICK_SLOT, RESCHEDULE_SLOT_CALL_ME_BACK, SHOW_PICK_SLOT_VIEW, SHOW_RESCHEDULE_VIEW, SCHEDULE_SLOT, RESCHEDULE_SLOT, SELECT_DAY_SLOT, SELECT_TIME_SLOT, DISMISS_BOTTOM_SHEET, UNKNOWN};
    }

    static {
        com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallMeBackAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction valueOf(java.lang.String str) {
        return (com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction) java.lang.Enum.valueOf(com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction.class, str);
    }

    public static com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[] values() {
        return (com.truecaller.enterprisefeedback.api.internal.callmeback.analytics.CallMeBackAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
