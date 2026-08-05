package com.truecaller.callui.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/callui/api/internal/model/SignalState;", "", "<init>", "(Ljava/lang/String;I)V", "GREAT", "GOOD", "MODERATE", "POOR", "UNKNOWN", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SignalState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.internal.model.SignalState[] $VALUES;
    public static final com.truecaller.callui.api.internal.model.SignalState GREAT = new com.truecaller.callui.api.internal.model.SignalState("GREAT", 0);
    public static final com.truecaller.callui.api.internal.model.SignalState GOOD = new com.truecaller.callui.api.internal.model.SignalState("GOOD", 1);
    public static final com.truecaller.callui.api.internal.model.SignalState MODERATE = new com.truecaller.callui.api.internal.model.SignalState("MODERATE", 2);
    public static final com.truecaller.callui.api.internal.model.SignalState POOR = new com.truecaller.callui.api.internal.model.SignalState("POOR", 3);
    public static final com.truecaller.callui.api.internal.model.SignalState UNKNOWN = new com.truecaller.callui.api.internal.model.SignalState("UNKNOWN", 4);

    private static final /* synthetic */ com.truecaller.callui.api.internal.model.SignalState[] $values() {
        return new com.truecaller.callui.api.internal.model.SignalState[]{GREAT, GOOD, MODERATE, POOR, UNKNOWN};
    }

    static {
        com.truecaller.callui.api.internal.model.SignalState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SignalState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.internal.model.SignalState valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.internal.model.SignalState) java.lang.Enum.valueOf(com.truecaller.callui.api.internal.model.SignalState.class, str);
    }

    public static com.truecaller.callui.api.internal.model.SignalState[] values() {
        return (com.truecaller.callui.api.internal.model.SignalState[]) $VALUES.clone();
    }
}
