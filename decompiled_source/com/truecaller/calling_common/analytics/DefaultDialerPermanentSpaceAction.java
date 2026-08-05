package com.truecaller.calling_common.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/calling_common/analytics/DefaultDialerPermanentSpaceAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SET_AS_DEFAULT", "SET_AS_DEFAULT_PHONE_APP", "SET_AS_DEFAULT_PHONE_ALERT_SHORT", "SET_AS_DEFAULT_PHONE_ALERT", "GO_TO_PHONE_SETTINGS", "CANCEL", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class DefaultDialerPermanentSpaceAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction SET_AS_DEFAULT = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("SET_AS_DEFAULT", 0, "SetAsDefault");
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction SET_AS_DEFAULT_PHONE_APP = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("SET_AS_DEFAULT_PHONE_APP", 1, "SetAsDefaultPhoneApp");
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction SET_AS_DEFAULT_PHONE_ALERT_SHORT = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("SET_AS_DEFAULT_PHONE_ALERT_SHORT", 2, "setDefaultDialerAlertShort");
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction SET_AS_DEFAULT_PHONE_ALERT = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("SET_AS_DEFAULT_PHONE_ALERT", 3, "setDefaultDialerAlertLong");
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction GO_TO_PHONE_SETTINGS = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("GO_TO_PHONE_SETTINGS", 4, "GoToPhoneSettings");
    public static final com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction CANCEL = new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction("CANCEL", 5, "Cancel");

    private static final /* synthetic */ com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[] $values() {
        return new com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[]{SET_AS_DEFAULT, SET_AS_DEFAULT_PHONE_APP, SET_AS_DEFAULT_PHONE_ALERT_SHORT, SET_AS_DEFAULT_PHONE_ALERT, GO_TO_PHONE_SETTINGS, CANCEL};
    }

    static {
        com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DefaultDialerPermanentSpaceAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction) java.lang.Enum.valueOf(com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction.class, str);
    }

    public static com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[] values() {
        return (com.truecaller.calling_common.analytics.DefaultDialerPermanentSpaceAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
