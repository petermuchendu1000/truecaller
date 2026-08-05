package com.truecaller.commentfeedback.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/commentfeedback/db/SyncState;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "SENT", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SyncState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.commentfeedback.db.SyncState[] $VALUES;
    public static final com.truecaller.commentfeedback.db.SyncState PENDING = new com.truecaller.commentfeedback.db.SyncState("PENDING", 0);
    public static final com.truecaller.commentfeedback.db.SyncState SENT = new com.truecaller.commentfeedback.db.SyncState("SENT", 1);

    private static final /* synthetic */ com.truecaller.commentfeedback.db.SyncState[] $values() {
        return new com.truecaller.commentfeedback.db.SyncState[]{PENDING, SENT};
    }

    static {
        com.truecaller.commentfeedback.db.SyncState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SyncState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.commentfeedback.db.SyncState valueOf(java.lang.String str) {
        return (com.truecaller.commentfeedback.db.SyncState) java.lang.Enum.valueOf(com.truecaller.commentfeedback.db.SyncState.class, str);
    }

    public static com.truecaller.commentfeedback.db.SyncState[] values() {
        return (com.truecaller.commentfeedback.db.SyncState[]) $VALUES.clone();
    }
}
