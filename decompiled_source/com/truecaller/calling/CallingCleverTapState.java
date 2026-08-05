package com.truecaller.calling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/calling/CallingCleverTapState;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ENABLED", "DISABLED", "CHURN", "NOT_SUPPORTED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallingCleverTapState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.CallingCleverTapState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calling.CallingCleverTapState ENABLED = new com.truecaller.calling.CallingCleverTapState("ENABLED", 0, "enabled");
    public static final com.truecaller.calling.CallingCleverTapState DISABLED = new com.truecaller.calling.CallingCleverTapState("DISABLED", 1, "disabled");
    public static final com.truecaller.calling.CallingCleverTapState CHURN = new com.truecaller.calling.CallingCleverTapState("CHURN", 2, "churn");
    public static final com.truecaller.calling.CallingCleverTapState NOT_SUPPORTED = new com.truecaller.calling.CallingCleverTapState("NOT_SUPPORTED", 3, "not_supported");

    private static final /* synthetic */ com.truecaller.calling.CallingCleverTapState[] $values() {
        return new com.truecaller.calling.CallingCleverTapState[]{ENABLED, DISABLED, CHURN, NOT_SUPPORTED};
    }

    static {
        com.truecaller.calling.CallingCleverTapState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallingCleverTapState(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.CallingCleverTapState valueOf(java.lang.String str) {
        return (com.truecaller.calling.CallingCleverTapState) java.lang.Enum.valueOf(com.truecaller.calling.CallingCleverTapState.class, str);
    }

    public static com.truecaller.calling.CallingCleverTapState[] values() {
        return (com.truecaller.calling.CallingCleverTapState[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
