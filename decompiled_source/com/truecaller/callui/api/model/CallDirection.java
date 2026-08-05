package com.truecaller.callui.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/callui/api/model/CallDirection;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL", "INCOMING", "OUTGOING", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDirection {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.model.CallDirection[] $VALUES;
    public static final com.truecaller.callui.api.model.CallDirection INITIAL = new com.truecaller.callui.api.model.CallDirection("INITIAL", 0);
    public static final com.truecaller.callui.api.model.CallDirection INCOMING = new com.truecaller.callui.api.model.CallDirection("INCOMING", 1);
    public static final com.truecaller.callui.api.model.CallDirection OUTGOING = new com.truecaller.callui.api.model.CallDirection("OUTGOING", 2);

    private static final /* synthetic */ com.truecaller.callui.api.model.CallDirection[] $values() {
        return new com.truecaller.callui.api.model.CallDirection[]{INITIAL, INCOMING, OUTGOING};
    }

    static {
        com.truecaller.callui.api.model.CallDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallDirection(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.model.CallDirection valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.model.CallDirection) java.lang.Enum.valueOf(com.truecaller.callui.api.model.CallDirection.class, str);
    }

    public static com.truecaller.callui.api.model.CallDirection[] values() {
        return (com.truecaller.callui.api.model.CallDirection[]) $VALUES.clone();
    }
}
