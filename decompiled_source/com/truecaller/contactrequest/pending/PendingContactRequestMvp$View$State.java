package com.truecaller.contactrequest.pending;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/contactrequest/pending/PendingContactRequestMvp$View$State", "", "Lcom/truecaller/contactrequest/pending/PendingContactRequestMvp$View$State;", "<init>", "(Ljava/lang/String;I)V", "Idle", "Progress", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PendingContactRequestMvp$View$State {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[] $VALUES;
    public static final com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State Idle = new com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State("Idle", 0);
    public static final com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State Progress = new com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State("Progress", 1);

    private static final /* synthetic */ com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[] $values() {
        return new com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[]{Idle, Progress};
    }

    static {
        com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PendingContactRequestMvp$View$State(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State valueOf(java.lang.String str) {
        return (com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State) java.lang.Enum.valueOf(com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State.class, str);
    }

    public static com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[] values() {
        return (com.truecaller.contactrequest.pending.PendingContactRequestMvp$View$State[]) $VALUES.clone();
    }
}
