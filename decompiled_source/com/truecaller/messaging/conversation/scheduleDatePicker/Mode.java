package com.truecaller.messaging.conversation.scheduleDatePicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/messaging/conversation/scheduleDatePicker/Mode;", "", "<init>", "(Ljava/lang/String;I)V", "PICK_DATE", "PICK_TIME", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Mode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.scheduleDatePicker.Mode[] $VALUES;
    public static final com.truecaller.messaging.conversation.scheduleDatePicker.Mode PICK_DATE = new com.truecaller.messaging.conversation.scheduleDatePicker.Mode("PICK_DATE", 0);
    public static final com.truecaller.messaging.conversation.scheduleDatePicker.Mode PICK_TIME = new com.truecaller.messaging.conversation.scheduleDatePicker.Mode("PICK_TIME", 1);

    private static final /* synthetic */ com.truecaller.messaging.conversation.scheduleDatePicker.Mode[] $values() {
        return new com.truecaller.messaging.conversation.scheduleDatePicker.Mode[]{PICK_DATE, PICK_TIME};
    }

    static {
        com.truecaller.messaging.conversation.scheduleDatePicker.Mode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Mode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.scheduleDatePicker.Mode valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.scheduleDatePicker.Mode) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.scheduleDatePicker.Mode.class, str);
    }

    public static com.truecaller.messaging.conversation.scheduleDatePicker.Mode[] values() {
        return (com.truecaller.messaging.conversation.scheduleDatePicker.Mode[]) $VALUES.clone();
    }
}
