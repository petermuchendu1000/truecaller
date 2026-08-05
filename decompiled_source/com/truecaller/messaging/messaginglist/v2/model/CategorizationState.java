package com.truecaller.messaging.messaginglist.v2.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/CategorizationState;", "", "<init>", "(Ljava/lang/String;I)V", "STARTED", "FIRST_BATCH_COMPLETE", "LAST_BATCH_COMPLETE", "COMPLETED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CategorizationState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.CategorizationState[] $VALUES;
    public static final com.truecaller.messaging.messaginglist.v2.model.CategorizationState STARTED = new com.truecaller.messaging.messaginglist.v2.model.CategorizationState("STARTED", 0);
    public static final com.truecaller.messaging.messaginglist.v2.model.CategorizationState FIRST_BATCH_COMPLETE = new com.truecaller.messaging.messaginglist.v2.model.CategorizationState("FIRST_BATCH_COMPLETE", 1);
    public static final com.truecaller.messaging.messaginglist.v2.model.CategorizationState LAST_BATCH_COMPLETE = new com.truecaller.messaging.messaginglist.v2.model.CategorizationState("LAST_BATCH_COMPLETE", 2);
    public static final com.truecaller.messaging.messaginglist.v2.model.CategorizationState COMPLETED = new com.truecaller.messaging.messaginglist.v2.model.CategorizationState("COMPLETED", 3);

    private static final /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.CategorizationState[] $values() {
        return new com.truecaller.messaging.messaginglist.v2.model.CategorizationState[]{STARTED, FIRST_BATCH_COMPLETE, LAST_BATCH_COMPLETE, COMPLETED};
    }

    static {
        com.truecaller.messaging.messaginglist.v2.model.CategorizationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CategorizationState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.messaginglist.v2.model.CategorizationState valueOf(java.lang.String str) {
        return (com.truecaller.messaging.messaginglist.v2.model.CategorizationState) java.lang.Enum.valueOf(com.truecaller.messaging.messaginglist.v2.model.CategorizationState.class, str);
    }

    public static com.truecaller.messaging.messaginglist.v2.model.CategorizationState[] values() {
        return (com.truecaller.messaging.messaginglist.v2.model.CategorizationState[]) $VALUES.clone();
    }
}
