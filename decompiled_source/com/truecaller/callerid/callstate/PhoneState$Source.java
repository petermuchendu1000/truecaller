package com.truecaller.callerid.callstate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/callerid/callstate/PhoneState$Source", "", "Lcom/truecaller/callerid/callstate/PhoneState$Source;", "<init>", "(Ljava/lang/String;I)V", "ACTION_PHONE_STATE_CHANGED", "ACTION_NEW_OUTGOING_CALL", "ACTION_POST_CALL", "CALL_SCREENING_SERVICE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PhoneState$Source {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callerid.callstate.PhoneState$Source[] $VALUES;
    public static final com.truecaller.callerid.callstate.PhoneState$Source ACTION_PHONE_STATE_CHANGED = new com.truecaller.callerid.callstate.PhoneState$Source("ACTION_PHONE_STATE_CHANGED", 0);
    public static final com.truecaller.callerid.callstate.PhoneState$Source ACTION_NEW_OUTGOING_CALL = new com.truecaller.callerid.callstate.PhoneState$Source("ACTION_NEW_OUTGOING_CALL", 1);
    public static final com.truecaller.callerid.callstate.PhoneState$Source ACTION_POST_CALL = new com.truecaller.callerid.callstate.PhoneState$Source("ACTION_POST_CALL", 2);
    public static final com.truecaller.callerid.callstate.PhoneState$Source CALL_SCREENING_SERVICE = new com.truecaller.callerid.callstate.PhoneState$Source("CALL_SCREENING_SERVICE", 3);

    private static final /* synthetic */ com.truecaller.callerid.callstate.PhoneState$Source[] $values() {
        return new com.truecaller.callerid.callstate.PhoneState$Source[]{ACTION_PHONE_STATE_CHANGED, ACTION_NEW_OUTGOING_CALL, ACTION_POST_CALL, CALL_SCREENING_SERVICE};
    }

    static {
        com.truecaller.callerid.callstate.PhoneState$Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PhoneState$Source(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callerid.callstate.PhoneState$Source valueOf(java.lang.String str) {
        return (com.truecaller.callerid.callstate.PhoneState$Source) java.lang.Enum.valueOf(com.truecaller.callerid.callstate.PhoneState$Source.class, str);
    }

    public static com.truecaller.callerid.callstate.PhoneState$Source[] values() {
        return (com.truecaller.callerid.callstate.PhoneState$Source[]) $VALUES.clone();
    }
}
