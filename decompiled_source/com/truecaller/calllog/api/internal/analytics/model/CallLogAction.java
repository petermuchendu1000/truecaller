package com.truecaller.calllog.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/calllog/api/internal/analytics/model/CallLogAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPEN_DIALPAD", "CALL", "SWIPE_TO_DELETE", "SINGLE_TAP", "PLAY", "CALLBACK", "FILTER_CLICK_ALL", "FILTER_CLICK_INCOMING", "FILTER_CLICK_OUTGOING", "FILTER_CLICK_MISSED", "FILTER_CLICK_SPAM", "FILTER_CLICK_RECORDINGS", "FILTER_CLICK_VERIFIED_BUSINESS", "FILTER_CLICK_NOT_SPAM", "SIM_SELECTOR_DEFAULT", "SIM_SELECTOR_SIM1", "SIM_SELECTOR_SIM2", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.CallLogAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction OPEN_DIALPAD = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("OPEN_DIALPAD", 0, "OpenDialpad");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction CALL = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("CALL", 1, com.truecaller.account.network.TokenResponseDto.METHOD_CALL);
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction SWIPE_TO_DELETE = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("SWIPE_TO_DELETE", 2, "SwipeToDelete");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction SINGLE_TAP = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("SINGLE_TAP", 3, "SingleTap");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction PLAY = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("PLAY", 4, "Play");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction CALLBACK = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("CALLBACK", 5, "Callback");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_ALL = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_ALL", 6, "FilterClickAll");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_INCOMING = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_INCOMING", 7, "FilterClickIncoming");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_OUTGOING = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_OUTGOING", 8, "FilterClickOutgoing");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_MISSED = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_MISSED", 9, "FilterClickMissed");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_SPAM = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_SPAM", 10, "FilterClickSpam");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_RECORDINGS = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_RECORDINGS", 11, "FilterClickRecordings");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_VERIFIED_BUSINESS = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_VERIFIED_BUSINESS", 12, "FilterClickVerifiedBusiness");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction FILTER_CLICK_NOT_SPAM = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("FILTER_CLICK_NOT_SPAM", 13, "FilterClickNotSpam");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction SIM_SELECTOR_DEFAULT = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("SIM_SELECTOR_DEFAULT", 14, "SimSelectorDefault");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction SIM_SELECTOR_SIM1 = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("SIM_SELECTOR_SIM1", 15, "SimSelectorSim1");
    public static final com.truecaller.calllog.api.internal.analytics.model.CallLogAction SIM_SELECTOR_SIM2 = new com.truecaller.calllog.api.internal.analytics.model.CallLogAction("SIM_SELECTOR_SIM2", 16, "SimSelectorSim2");

    private static final /* synthetic */ com.truecaller.calllog.api.internal.analytics.model.CallLogAction[] $values() {
        return new com.truecaller.calllog.api.internal.analytics.model.CallLogAction[]{OPEN_DIALPAD, CALL, SWIPE_TO_DELETE, SINGLE_TAP, PLAY, CALLBACK, FILTER_CLICK_ALL, FILTER_CLICK_INCOMING, FILTER_CLICK_OUTGOING, FILTER_CLICK_MISSED, FILTER_CLICK_SPAM, FILTER_CLICK_RECORDINGS, FILTER_CLICK_VERIFIED_BUSINESS, FILTER_CLICK_NOT_SPAM, SIM_SELECTOR_DEFAULT, SIM_SELECTOR_SIM1, SIM_SELECTOR_SIM2};
    }

    static {
        com.truecaller.calllog.api.internal.analytics.model.CallLogAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.internal.analytics.model.CallLogAction valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.internal.analytics.model.CallLogAction) java.lang.Enum.valueOf(com.truecaller.calllog.api.internal.analytics.model.CallLogAction.class, str);
    }

    public static com.truecaller.calllog.api.internal.analytics.model.CallLogAction[] values() {
        return (com.truecaller.calllog.api.internal.analytics.model.CallLogAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
