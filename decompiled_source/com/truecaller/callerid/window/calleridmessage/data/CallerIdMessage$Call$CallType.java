package com.truecaller.callerid.window.calleridmessage.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/callerid/window/calleridmessage/data/CallerIdMessage$Call$CallType", "", "Lcom/truecaller/callerid/window/calleridmessage/data/CallerIdMessage$Call$CallType;", "<init>", "(Ljava/lang/String;I)V", "INCOMING", "OUTGOING", "MISSED", "REJECTED", "FIRST_TIME", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallerIdMessage$Call$CallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[] $VALUES;
    public static final com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType INCOMING = new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType("INCOMING", 0);
    public static final com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType OUTGOING = new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType("OUTGOING", 1);
    public static final com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType MISSED = new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType("MISSED", 2);
    public static final com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType REJECTED = new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType("REJECTED", 3);
    public static final com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType FIRST_TIME = new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType("FIRST_TIME", 4);

    private static final /* synthetic */ com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[] $values() {
        return new com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[]{INCOMING, OUTGOING, MISSED, REJECTED, FIRST_TIME};
    }

    static {
        com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallerIdMessage$Call$CallType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType valueOf(java.lang.String str) {
        return (com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType) java.lang.Enum.valueOf(com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType.class, str);
    }

    public static com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[] values() {
        return (com.truecaller.callerid.window.calleridmessage.data.CallerIdMessage$Call$CallType[]) $VALUES.clone();
    }
}
