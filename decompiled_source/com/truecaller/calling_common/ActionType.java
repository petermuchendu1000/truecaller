package com.truecaller.calling_common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/calling_common/ActionType;", "", "", "eventAction", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getEventAction", "()Ljava/lang/String;", "Companion", "ew0/bar", "SMS", "PROFILE", "CELLULAR_CALL", "CELLULAR_VIDEO_CALL", "HIDDEN_CALL", "WHATSAPP_CALL", "WHATSAPP_VIDEO_CALL", "CT_VOICEMAIL_AUTOPLAY", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.ActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ew0.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eventAction;
    public static final com.truecaller.calling_common.ActionType SMS = new com.truecaller.calling_common.ActionType("SMS", 0, "ItemEvent.ACTION_SMS");
    public static final com.truecaller.calling_common.ActionType PROFILE = new com.truecaller.calling_common.ActionType("PROFILE", 1, "ItemEvent.ACTION_OPEN_PROFILE");
    public static final com.truecaller.calling_common.ActionType CELLULAR_CALL = new com.truecaller.calling_common.ActionType("CELLULAR_CALL", 2, "ItemEvent.ACTION_CELLULAR_CALL");
    public static final com.truecaller.calling_common.ActionType CELLULAR_VIDEO_CALL = new com.truecaller.calling_common.ActionType("CELLULAR_VIDEO_CALL", 3, "ItemEvent.ACTION_CELLULAR_VIDEO_CALL");
    public static final com.truecaller.calling_common.ActionType HIDDEN_CALL = new com.truecaller.calling_common.ActionType("HIDDEN_CALL", 4, "ItemEvent.ACTION_HIDDEN_CALL");
    public static final com.truecaller.calling_common.ActionType WHATSAPP_CALL = new com.truecaller.calling_common.ActionType("WHATSAPP_CALL", 5, "ItemEvent.ACTION_WHATSAPP_CALL");
    public static final com.truecaller.calling_common.ActionType WHATSAPP_VIDEO_CALL = new com.truecaller.calling_common.ActionType("WHATSAPP_VIDEO_CALL", 6, "ItemEvent.ACTION_WHATSAPP_VIDEO_CALL");
    public static final com.truecaller.calling_common.ActionType CT_VOICEMAIL_AUTOPLAY = new com.truecaller.calling_common.ActionType("CT_VOICEMAIL_AUTOPLAY", 7, "ItemEvent.ACTION_CT_VOICEMAIL_AUTOPLAY");

    private static final /* synthetic */ com.truecaller.calling_common.ActionType[] $values() {
        return new com.truecaller.calling_common.ActionType[]{SMS, PROFILE, CELLULAR_CALL, CELLULAR_VIDEO_CALL, HIDDEN_CALL, WHATSAPP_CALL, WHATSAPP_VIDEO_CALL, CT_VOICEMAIL_AUTOPLAY};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [ew0.bar, java.lang.Object] */
    static {
        com.truecaller.calling_common.ActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ActionType(java.lang.String str, int i, java.lang.String str2) {
        this.eventAction = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.ActionType valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.ActionType) java.lang.Enum.valueOf(com.truecaller.calling_common.ActionType.class, str);
    }

    public static com.truecaller.calling_common.ActionType[] values() {
        return (com.truecaller.calling_common.ActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEventAction() {
        return this.eventAction;
    }
}
