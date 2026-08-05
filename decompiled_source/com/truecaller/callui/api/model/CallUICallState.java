package com.truecaller.callui.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/callui/api/model/CallUICallState;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "INCOMING", "ANSWERING", "OUTGOING", "ONGOING", "HOLD", "ENDED", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUICallState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.model.CallUICallState[] $VALUES;
    public static final com.truecaller.callui.api.model.CallUICallState INITIAL = new com.truecaller.callui.api.model.CallUICallState("INITIAL", 0);
    public static final com.truecaller.callui.api.model.CallUICallState INCOMING = new com.truecaller.callui.api.model.CallUICallState("INCOMING", 1);
    public static final com.truecaller.callui.api.model.CallUICallState ANSWERING = new com.truecaller.callui.api.model.CallUICallState("ANSWERING", 2);
    public static final com.truecaller.callui.api.model.CallUICallState OUTGOING = new com.truecaller.callui.api.model.CallUICallState("OUTGOING", 3);
    public static final com.truecaller.callui.api.model.CallUICallState ONGOING = new com.truecaller.callui.api.model.CallUICallState("ONGOING", 4);
    public static final com.truecaller.callui.api.model.CallUICallState HOLD = new com.truecaller.callui.api.model.CallUICallState("HOLD", 5);
    public static final com.truecaller.callui.api.model.CallUICallState ENDED = new com.truecaller.callui.api.model.CallUICallState("ENDED", 6);

    private static final /* synthetic */ com.truecaller.callui.api.model.CallUICallState[] $values() {
        return new com.truecaller.callui.api.model.CallUICallState[]{INITIAL, INCOMING, ANSWERING, OUTGOING, ONGOING, HOLD, ENDED};
    }

    static {
        com.truecaller.callui.api.model.CallUICallState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUICallState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.model.CallUICallState valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.model.CallUICallState) java.lang.Enum.valueOf(com.truecaller.callui.api.model.CallUICallState.class, str);
    }

    public static com.truecaller.callui.api.model.CallUICallState[] values() {
        return (com.truecaller.callui.api.model.CallUICallState[]) $VALUES.clone();
    }
}
