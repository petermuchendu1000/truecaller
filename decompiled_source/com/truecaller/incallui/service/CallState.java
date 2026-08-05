package com.truecaller.incallui.service;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/incallui/service/CallState;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_SELECT_PHONE_ACCOUNT", "STATE_CONNECTING", "STATE_DIALING", "STATE_RINGING", "STATE_ANSWERING", "STATE_ACTIVE", "STATE_HOLDING", "STATE_DISCONNECTED", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.service.CallState[] $VALUES;
    public static final com.truecaller.incallui.service.CallState STATE_SELECT_PHONE_ACCOUNT = new com.truecaller.incallui.service.CallState("STATE_SELECT_PHONE_ACCOUNT", 0);
    public static final com.truecaller.incallui.service.CallState STATE_CONNECTING = new com.truecaller.incallui.service.CallState("STATE_CONNECTING", 1);
    public static final com.truecaller.incallui.service.CallState STATE_DIALING = new com.truecaller.incallui.service.CallState("STATE_DIALING", 2);
    public static final com.truecaller.incallui.service.CallState STATE_RINGING = new com.truecaller.incallui.service.CallState("STATE_RINGING", 3);
    public static final com.truecaller.incallui.service.CallState STATE_ANSWERING = new com.truecaller.incallui.service.CallState("STATE_ANSWERING", 4);
    public static final com.truecaller.incallui.service.CallState STATE_ACTIVE = new com.truecaller.incallui.service.CallState("STATE_ACTIVE", 5);
    public static final com.truecaller.incallui.service.CallState STATE_HOLDING = new com.truecaller.incallui.service.CallState("STATE_HOLDING", 6);
    public static final com.truecaller.incallui.service.CallState STATE_DISCONNECTED = new com.truecaller.incallui.service.CallState("STATE_DISCONNECTED", 7);

    private static final /* synthetic */ com.truecaller.incallui.service.CallState[] $values() {
        return new com.truecaller.incallui.service.CallState[]{STATE_SELECT_PHONE_ACCOUNT, STATE_CONNECTING, STATE_DIALING, STATE_RINGING, STATE_ANSWERING, STATE_ACTIVE, STATE_HOLDING, STATE_DISCONNECTED};
    }

    static {
        com.truecaller.incallui.service.CallState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.service.CallState valueOf(java.lang.String str) {
        return (com.truecaller.incallui.service.CallState) java.lang.Enum.valueOf(com.truecaller.incallui.service.CallState.class, str);
    }

    public static com.truecaller.incallui.service.CallState[] values() {
        return (com.truecaller.incallui.service.CallState[]) $VALUES.clone();
    }
}
