package com.truecaller.callui.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b2\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4¨\u00065"}, d2 = {"Lcom/truecaller/callui/api/internal/analytics/model/CallUIActions;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCEPT", "REJECT", "REJECT_WITH_MESSAGE", "REJECT_WITH_CUSTOM_MESSAGE", "REJECT_WITH_MESSAGE_SELECTED", "HANGUP", "VIEW_PROFILE_INCOMING", "VIEW_PROFILE_ONGOING", "MORE_ACTIONS", "AVATAR", "MUTE", "UNMUTE", "MESSAGE", "MERGE", "SWAP", "MANAGE_CONFERENCE", "HOLD", "UNHOLD", "ADD_CALL", "TAP_TO_REVEAL", "OPEN_KEYPAD", "KEYPAD_END_CALL", "KEYPAD_BACK_TO_CALL", "MORE_ACTIONS_CLOSE", "BLUETOOTH_ALLOW_PERMISSION", "BLUETOOTH_GO_TO_SETTINGS", "SPEAKER_ON", "SPEAKER_OFF", "AUDIO_ROUTE_PICKER", "HEADPHONES", "SPEAKER", "BLUETOOTH", "PHONE", "NOTIFICATION", "TOUCHED_REJECT", "TOUCHED_ACCEPT", "CHANGE_SIM", "BIZ_SPAM_PILL_DEAD_TAP_INCOMING", "BIZ_VIDEO_CALLER_ID_PORTRAIT_TAP_INCOMING", "BIZ_CALL_REASON_TAP_INCOMING", "BIZ_CAMPAIGN_TAP_INCOMING", "BIZ_CAMPAIGN_TAP_ONGOING", "LOW_BATTERY_TOOLTIP", "LOW_NETWORK_TOOLTIP", "ON_HOLD_TOOLTIP", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIActions {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIActions[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions ACCEPT = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("ACCEPT", 0, "Accept");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions REJECT = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("REJECT", 1, "Reject");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions REJECT_WITH_MESSAGE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("REJECT_WITH_MESSAGE", 2, "RejectWithMessage");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions REJECT_WITH_CUSTOM_MESSAGE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("REJECT_WITH_CUSTOM_MESSAGE", 3, "RejectWithCustomMessage");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions REJECT_WITH_MESSAGE_SELECTED = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("REJECT_WITH_MESSAGE_SELECTED", 4, "RejectWithMessageSelected");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions HANGUP = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("HANGUP", 5, "Hangup");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions VIEW_PROFILE_INCOMING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("VIEW_PROFILE_INCOMING", 6, "ViewProfileIncoming");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions VIEW_PROFILE_ONGOING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("VIEW_PROFILE_ONGOING", 7, "ViewProfileOngoing");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MORE_ACTIONS = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MORE_ACTIONS", 8, "MoreActions");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions AVATAR = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("AVATAR", 9, "Avatar");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MUTE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MUTE", 10, "Mute");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions UNMUTE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("UNMUTE", 11, "Unmute");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MESSAGE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MESSAGE", 12, "Message");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MERGE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MERGE", 13, "Merge");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions SWAP = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("SWAP", 14, "Swap");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MANAGE_CONFERENCE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MANAGE_CONFERENCE", 15, "ManageConference");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions HOLD = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("HOLD", 16, "Hold");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions UNHOLD = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("UNHOLD", 17, "Unhold");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions ADD_CALL = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("ADD_CALL", 18, "AddCall");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions TAP_TO_REVEAL = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("TAP_TO_REVEAL", 19, "TapToReveal");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions OPEN_KEYPAD = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("OPEN_KEYPAD", 20, "OpenKeypad");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions KEYPAD_END_CALL = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("KEYPAD_END_CALL", 21, "KeypadEndCall");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions KEYPAD_BACK_TO_CALL = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("KEYPAD_BACK_TO_CALL", 22, "KeypadBackToCall");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions MORE_ACTIONS_CLOSE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("MORE_ACTIONS_CLOSE", 23, "MoreActionsClose");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BLUETOOTH_ALLOW_PERMISSION = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BLUETOOTH_ALLOW_PERMISSION", 24, "BluetoothAllowPermission");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BLUETOOTH_GO_TO_SETTINGS = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BLUETOOTH_GO_TO_SETTINGS", 25, "BluetoothGoToSettings");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions SPEAKER_ON = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("SPEAKER_ON", 26, "SpeakerOn");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions SPEAKER_OFF = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("SPEAKER_OFF", 27, "SpeakerOff");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions AUDIO_ROUTE_PICKER = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("AUDIO_ROUTE_PICKER", 28, "AudioRoutePicker");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions HEADPHONES = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("HEADPHONES", 29, "Headphones");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions SPEAKER = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("SPEAKER", 30, "Speaker");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BLUETOOTH = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BLUETOOTH", 31, "Bluetooth");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions PHONE = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("PHONE", 32, "Phone");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions NOTIFICATION = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("NOTIFICATION", 33, "Notification");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions TOUCHED_REJECT = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("TOUCHED_REJECT", 34, "TouchedReject");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions TOUCHED_ACCEPT = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("TOUCHED_ACCEPT", 35, "TouchedAccept");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions CHANGE_SIM = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("CHANGE_SIM", 36, "ChangeSim");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BIZ_SPAM_PILL_DEAD_TAP_INCOMING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BIZ_SPAM_PILL_DEAD_TAP_INCOMING", 37, "BizSpamPillDeadTapIncoming");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BIZ_VIDEO_CALLER_ID_PORTRAIT_TAP_INCOMING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BIZ_VIDEO_CALLER_ID_PORTRAIT_TAP_INCOMING", 38, "BizVideoCallerIdPortraitTapIncoming");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BIZ_CALL_REASON_TAP_INCOMING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BIZ_CALL_REASON_TAP_INCOMING", 39, "BizCallReasonTapIncoming");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BIZ_CAMPAIGN_TAP_INCOMING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BIZ_CAMPAIGN_TAP_INCOMING", 40, "BizCampaignTapIncoming");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions BIZ_CAMPAIGN_TAP_ONGOING = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("BIZ_CAMPAIGN_TAP_ONGOING", 41, "BizCampaignTapOngoing");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions LOW_BATTERY_TOOLTIP = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("LOW_BATTERY_TOOLTIP", 42, "showLowBatteryAlert");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions LOW_NETWORK_TOOLTIP = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("LOW_NETWORK_TOOLTIP", 43, "showLowNetworkAlert");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIActions ON_HOLD_TOOLTIP = new com.truecaller.callui.api.internal.analytics.model.CallUIActions("ON_HOLD_TOOLTIP", 44, "showOnHoldAlert");

    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIActions[] $values() {
        return new com.truecaller.callui.api.internal.analytics.model.CallUIActions[]{ACCEPT, REJECT, REJECT_WITH_MESSAGE, REJECT_WITH_CUSTOM_MESSAGE, REJECT_WITH_MESSAGE_SELECTED, HANGUP, VIEW_PROFILE_INCOMING, VIEW_PROFILE_ONGOING, MORE_ACTIONS, AVATAR, MUTE, UNMUTE, MESSAGE, MERGE, SWAP, MANAGE_CONFERENCE, HOLD, UNHOLD, ADD_CALL, TAP_TO_REVEAL, OPEN_KEYPAD, KEYPAD_END_CALL, KEYPAD_BACK_TO_CALL, MORE_ACTIONS_CLOSE, BLUETOOTH_ALLOW_PERMISSION, BLUETOOTH_GO_TO_SETTINGS, SPEAKER_ON, SPEAKER_OFF, AUDIO_ROUTE_PICKER, HEADPHONES, SPEAKER, BLUETOOTH, PHONE, NOTIFICATION, TOUCHED_REJECT, TOUCHED_ACCEPT, CHANGE_SIM, BIZ_SPAM_PILL_DEAD_TAP_INCOMING, BIZ_VIDEO_CALLER_ID_PORTRAIT_TAP_INCOMING, BIZ_CALL_REASON_TAP_INCOMING, BIZ_CAMPAIGN_TAP_INCOMING, BIZ_CAMPAIGN_TAP_ONGOING, LOW_BATTERY_TOOLTIP, LOW_NETWORK_TOOLTIP, ON_HOLD_TOOLTIP};
    }

    static {
        com.truecaller.callui.api.internal.analytics.model.CallUIActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIActions(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIActions valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIActions) java.lang.Enum.valueOf(com.truecaller.callui.api.internal.analytics.model.CallUIActions.class, str);
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIActions[] values() {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIActions[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
