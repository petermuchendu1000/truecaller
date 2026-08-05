package com.truecaller.callui.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/callui/api/model/CallUIOngoingActionType;", "", "<init>", "(Ljava/lang/String;I)V", "MUTE", "KEYPAD", "AUDIO_ROUTE", "CALL_RECORDING", "AI_VOICE_DETECTION", "HOLD", "ADD_CALL", "MESSAGE", "SWAP_SIM", "SWAP_CALLS", "MERGE_CALLS", "MANAGE_CONFERENCE", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIOngoingActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.model.CallUIOngoingActionType[] $VALUES;
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType MUTE = new com.truecaller.callui.api.model.CallUIOngoingActionType("MUTE", 0);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType KEYPAD = new com.truecaller.callui.api.model.CallUIOngoingActionType("KEYPAD", 1);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType AUDIO_ROUTE = new com.truecaller.callui.api.model.CallUIOngoingActionType("AUDIO_ROUTE", 2);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType CALL_RECORDING = new com.truecaller.callui.api.model.CallUIOngoingActionType("CALL_RECORDING", 3);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType AI_VOICE_DETECTION = new com.truecaller.callui.api.model.CallUIOngoingActionType("AI_VOICE_DETECTION", 4);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType HOLD = new com.truecaller.callui.api.model.CallUIOngoingActionType("HOLD", 5);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType ADD_CALL = new com.truecaller.callui.api.model.CallUIOngoingActionType("ADD_CALL", 6);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType MESSAGE = new com.truecaller.callui.api.model.CallUIOngoingActionType("MESSAGE", 7);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType SWAP_SIM = new com.truecaller.callui.api.model.CallUIOngoingActionType("SWAP_SIM", 8);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType SWAP_CALLS = new com.truecaller.callui.api.model.CallUIOngoingActionType("SWAP_CALLS", 9);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType MERGE_CALLS = new com.truecaller.callui.api.model.CallUIOngoingActionType("MERGE_CALLS", 10);
    public static final com.truecaller.callui.api.model.CallUIOngoingActionType MANAGE_CONFERENCE = new com.truecaller.callui.api.model.CallUIOngoingActionType("MANAGE_CONFERENCE", 11);

    private static final /* synthetic */ com.truecaller.callui.api.model.CallUIOngoingActionType[] $values() {
        return new com.truecaller.callui.api.model.CallUIOngoingActionType[]{MUTE, KEYPAD, AUDIO_ROUTE, CALL_RECORDING, AI_VOICE_DETECTION, HOLD, ADD_CALL, MESSAGE, SWAP_SIM, SWAP_CALLS, MERGE_CALLS, MANAGE_CONFERENCE};
    }

    static {
        com.truecaller.callui.api.model.CallUIOngoingActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIOngoingActionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.model.CallUIOngoingActionType valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.model.CallUIOngoingActionType) java.lang.Enum.valueOf(com.truecaller.callui.api.model.CallUIOngoingActionType.class, str);
    }

    public static com.truecaller.callui.api.model.CallUIOngoingActionType[] values() {
        return (com.truecaller.callui.api.model.CallUIOngoingActionType[]) $VALUES.clone();
    }
}
