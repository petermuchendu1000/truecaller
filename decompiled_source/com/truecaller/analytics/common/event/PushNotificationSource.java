package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/analytics/common/event/PushNotificationSource;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "Server", "MobileLocal", "ClevertapCRM", "Firebase", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PushNotificationSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.PushNotificationSource[] $VALUES;
    private final int type;
    public static final com.truecaller.analytics.common.event.PushNotificationSource Server = new com.truecaller.analytics.common.event.PushNotificationSource("Server", 0, 1);
    public static final com.truecaller.analytics.common.event.PushNotificationSource MobileLocal = new com.truecaller.analytics.common.event.PushNotificationSource("MobileLocal", 1, 2);
    public static final com.truecaller.analytics.common.event.PushNotificationSource ClevertapCRM = new com.truecaller.analytics.common.event.PushNotificationSource("ClevertapCRM", 2, 3);
    public static final com.truecaller.analytics.common.event.PushNotificationSource Firebase = new com.truecaller.analytics.common.event.PushNotificationSource("Firebase", 3, 4);

    private static final /* synthetic */ com.truecaller.analytics.common.event.PushNotificationSource[] $values() {
        return new com.truecaller.analytics.common.event.PushNotificationSource[]{Server, MobileLocal, ClevertapCRM, Firebase};
    }

    static {
        com.truecaller.analytics.common.event.PushNotificationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PushNotificationSource(java.lang.String str, int i, int i2) {
        this.type = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.PushNotificationSource valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.PushNotificationSource) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.PushNotificationSource.class, str);
    }

    public static com.truecaller.analytics.common.event.PushNotificationSource[] values() {
        return (com.truecaller.analytics.common.event.PushNotificationSource[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
