package com.truecaller.announce_caller_id.analytics.events;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/announce_caller_id/analytics/events/AnnounceCallerIdSettingsAction;", "", "<init>", "(Ljava/lang/String;I)V", "ALWAYS", "HEADPHONES_ONLY", "HEADSET_ENABLED", "HEADSET_DISABLED", "PB_CONTACTS_ONLY_ENABLED", "PB_CONTACTS_ONLY_DISABLED", "announce-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AnnounceCallerIdSettingsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[] $VALUES;
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction ALWAYS = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("ALWAYS", 0);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction HEADPHONES_ONLY = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("HEADPHONES_ONLY", 1);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction HEADSET_ENABLED = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("HEADSET_ENABLED", 2);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction HEADSET_DISABLED = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("HEADSET_DISABLED", 3);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction PB_CONTACTS_ONLY_ENABLED = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("PB_CONTACTS_ONLY_ENABLED", 4);
    public static final com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction PB_CONTACTS_ONLY_DISABLED = new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction("PB_CONTACTS_ONLY_DISABLED", 5);

    private static final /* synthetic */ com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[] $values() {
        return new com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[]{ALWAYS, HEADPHONES_ONLY, HEADSET_ENABLED, HEADSET_DISABLED, PB_CONTACTS_ONLY_ENABLED, PB_CONTACTS_ONLY_DISABLED};
    }

    static {
        com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AnnounceCallerIdSettingsAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction valueOf(java.lang.String str) {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction) java.lang.Enum.valueOf(com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction.class, str);
    }

    public static com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[] values() {
        return (com.truecaller.announce_caller_id.analytics.events.AnnounceCallerIdSettingsAction[]) $VALUES.clone();
    }
}
