package com.truecaller.callui.presentation.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/callui/presentation/ui/CallUIScreenState$Ongoing$OngoingCallState", "", "Lcom/truecaller/callui/presentation/ui/CallUIScreenState$Ongoing$OngoingCallState;", "<init>", "(Ljava/lang/String;I)V", "ANSWERING", "ONGOING", "OUTGOING", "HOLD", "ENDED", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIScreenState$Ongoing$OngoingCallState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState ANSWERING = new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState("ANSWERING", 0);
    public static final com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState ONGOING = new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState("ONGOING", 1);
    public static final com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState OUTGOING = new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState("OUTGOING", 2);
    public static final com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState HOLD = new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState("HOLD", 3);
    public static final com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState ENDED = new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState("ENDED", 4);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[] $values() {
        return new com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[]{ANSWERING, ONGOING, OUTGOING, HOLD, ENDED};
    }

    static {
        com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIScreenState$Ongoing$OngoingCallState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState.class, str);
    }

    public static com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[] values() {
        return (com.truecaller.callui.presentation.ui.CallUIScreenState$Ongoing$OngoingCallState[]) $VALUES.clone();
    }
}
