package com.truecaller.messaging.messaginglist.v2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/MarkAsSpamSource;", "", "<init>", "(Ljava/lang/String;I)V", "BIZ_IM_NOTIFICATION", "VERIFIED_NOTIFICATION", "VERIFIED_REGULAR_MESSAGE_ID", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MarkAsSpamSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[] $VALUES;
    public static final com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource BIZ_IM_NOTIFICATION = new com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource("BIZ_IM_NOTIFICATION", 0);
    public static final com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource VERIFIED_NOTIFICATION = new com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource("VERIFIED_NOTIFICATION", 1);
    public static final com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource VERIFIED_REGULAR_MESSAGE_ID = new com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource("VERIFIED_REGULAR_MESSAGE_ID", 2);

    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[] $values() {
        return new com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[]{BIZ_IM_NOTIFICATION, VERIFIED_NOTIFICATION, VERIFIED_REGULAR_MESSAGE_ID};
    }

    static {
        com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MarkAsSpamSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource valueOf(java.lang.String str) {
        return (com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource) java.lang.Enum.valueOf(com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource.class, str);
    }

    public static com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[] values() {
        return (com.truecaller.messaging.messaginglist.v2.model.MarkAsSpamSource[]) $VALUES.clone();
    }
}
