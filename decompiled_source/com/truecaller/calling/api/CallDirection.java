package com.truecaller.calling.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fj\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, d2 = {"Lcom/truecaller/calling/api/CallDirection;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INCOMING", "OUTGOING", "isIncoming", "", "()Z", "isOutgoing", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDirection {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.api.CallDirection[] $VALUES;
    public static final com.truecaller.calling.api.CallDirection INCOMING = new com.truecaller.calling.api.CallDirection("INCOMING", 0, "incoming");
    public static final com.truecaller.calling.api.CallDirection OUTGOING = new com.truecaller.calling.api.CallDirection("OUTGOING", 1, "outgoing");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.calling.api.CallDirection[] $values() {
        return new com.truecaller.calling.api.CallDirection[]{INCOMING, OUTGOING};
    }

    static {
        com.truecaller.calling.api.CallDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallDirection(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.api.CallDirection valueOf(java.lang.String str) {
        return (com.truecaller.calling.api.CallDirection) java.lang.Enum.valueOf(com.truecaller.calling.api.CallDirection.class, str);
    }

    public static com.truecaller.calling.api.CallDirection[] values() {
        return (com.truecaller.calling.api.CallDirection[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public final boolean isIncoming() {
        if (this == INCOMING) {
            return true;
        }
        return false;
    }

    public final boolean isOutgoing() {
        if (this == OUTGOING) {
            return true;
        }
        return false;
    }
}
