package com.truecaller.common_call_log.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common_call_log/ui/CallIconType;", "", "<init>", "(Ljava/lang/String;I)V", "HUNG_UP_CALL_ICON", "MUTED_CALL_ICON", "INCOMING_CALL_ICON", "OUTGOING_CALL_ICON", "MISSED_CALL_ICON", "WHATSAPP", "SCREENED_CALL_ICON", "CT_VOICEMAIL", "VIDEO", "common-call-log_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallIconType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common_call_log.ui.CallIconType[] $VALUES;
    public static final com.truecaller.common_call_log.ui.CallIconType HUNG_UP_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("HUNG_UP_CALL_ICON", 0);
    public static final com.truecaller.common_call_log.ui.CallIconType MUTED_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("MUTED_CALL_ICON", 1);
    public static final com.truecaller.common_call_log.ui.CallIconType INCOMING_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("INCOMING_CALL_ICON", 2);
    public static final com.truecaller.common_call_log.ui.CallIconType OUTGOING_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("OUTGOING_CALL_ICON", 3);
    public static final com.truecaller.common_call_log.ui.CallIconType MISSED_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("MISSED_CALL_ICON", 4);
    public static final com.truecaller.common_call_log.ui.CallIconType WHATSAPP = new com.truecaller.common_call_log.ui.CallIconType("WHATSAPP", 5);
    public static final com.truecaller.common_call_log.ui.CallIconType SCREENED_CALL_ICON = new com.truecaller.common_call_log.ui.CallIconType("SCREENED_CALL_ICON", 6);
    public static final com.truecaller.common_call_log.ui.CallIconType CT_VOICEMAIL = new com.truecaller.common_call_log.ui.CallIconType("CT_VOICEMAIL", 7);
    public static final com.truecaller.common_call_log.ui.CallIconType VIDEO = new com.truecaller.common_call_log.ui.CallIconType("VIDEO", 8);

    private static final /* synthetic */ com.truecaller.common_call_log.ui.CallIconType[] $values() {
        return new com.truecaller.common_call_log.ui.CallIconType[]{HUNG_UP_CALL_ICON, MUTED_CALL_ICON, INCOMING_CALL_ICON, OUTGOING_CALL_ICON, MISSED_CALL_ICON, WHATSAPP, SCREENED_CALL_ICON, CT_VOICEMAIL, VIDEO};
    }

    static {
        com.truecaller.common_call_log.ui.CallIconType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallIconType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common_call_log.ui.CallIconType valueOf(java.lang.String str) {
        return (com.truecaller.common_call_log.ui.CallIconType) java.lang.Enum.valueOf(com.truecaller.common_call_log.ui.CallIconType.class, str);
    }

    public static com.truecaller.common_call_log.ui.CallIconType[] values() {
        return (com.truecaller.common_call_log.ui.CallIconType[]) $VALUES.clone();
    }
}
