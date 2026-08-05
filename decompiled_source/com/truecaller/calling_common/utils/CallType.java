package com.truecaller.calling_common.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/calling_common/utils/CallType;", "", "<init>", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "MISSED", "UNKNOWN", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.utils.CallType[] $VALUES;
    public static final com.truecaller.calling_common.utils.CallType INCOMING = new com.truecaller.calling_common.utils.CallType("INCOMING", 0);
    public static final com.truecaller.calling_common.utils.CallType OUTGOING = new com.truecaller.calling_common.utils.CallType("OUTGOING", 1);
    public static final com.truecaller.calling_common.utils.CallType MISSED = new com.truecaller.calling_common.utils.CallType("MISSED", 2);
    public static final com.truecaller.calling_common.utils.CallType UNKNOWN = new com.truecaller.calling_common.utils.CallType("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.calling_common.utils.CallType[] $values() {
        return new com.truecaller.calling_common.utils.CallType[]{INCOMING, OUTGOING, MISSED, UNKNOWN};
    }

    static {
        com.truecaller.calling_common.utils.CallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.utils.CallType valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.utils.CallType) java.lang.Enum.valueOf(com.truecaller.calling_common.utils.CallType.class, str);
    }

    public static com.truecaller.calling_common.utils.CallType[] values() {
        return (com.truecaller.calling_common.utils.CallType[]) $VALUES.clone();
    }
}
