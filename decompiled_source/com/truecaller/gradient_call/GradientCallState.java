package com.truecaller.gradient_call;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/gradient_call/GradientCallState;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "ONGOING", "gradient-call_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GradientCallState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.gradient_call.GradientCallState[] $VALUES;
    public static final com.truecaller.gradient_call.GradientCallState INCOMING = new com.truecaller.gradient_call.GradientCallState("INCOMING", 0);
    public static final com.truecaller.gradient_call.GradientCallState OUTGOING = new com.truecaller.gradient_call.GradientCallState("OUTGOING", 1);
    public static final com.truecaller.gradient_call.GradientCallState ONGOING = new com.truecaller.gradient_call.GradientCallState("ONGOING", 2);

    private static final /* synthetic */ com.truecaller.gradient_call.GradientCallState[] $values() {
        return new com.truecaller.gradient_call.GradientCallState[]{INCOMING, OUTGOING, ONGOING};
    }

    static {
        com.truecaller.gradient_call.GradientCallState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private GradientCallState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.gradient_call.GradientCallState valueOf(java.lang.String str) {
        return (com.truecaller.gradient_call.GradientCallState) java.lang.Enum.valueOf(com.truecaller.gradient_call.GradientCallState.class, str);
    }

    public static com.truecaller.gradient_call.GradientCallState[] values() {
        return (com.truecaller.gradient_call.GradientCallState[]) $VALUES.clone();
    }
}
