package com.truecaller.acspromo.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/acspromo/domain/model/IncomingCallType;", "", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "l00/baz", "SPAM", "NON_PHONEBOOK_CONTACTS", "ANSWERED", "UNKNOWN", "MISSED_CALL", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class IncomingCallType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acspromo.domain.model.IncomingCallType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final l00.baz Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.acspromo.domain.model.IncomingCallType SPAM = new com.truecaller.acspromo.domain.model.IncomingCallType("SPAM", 0, "Spam");
    public static final com.truecaller.acspromo.domain.model.IncomingCallType NON_PHONEBOOK_CONTACTS = new com.truecaller.acspromo.domain.model.IncomingCallType("NON_PHONEBOOK_CONTACTS", 1, "NonPhonebookContacts");
    public static final com.truecaller.acspromo.domain.model.IncomingCallType ANSWERED = new com.truecaller.acspromo.domain.model.IncomingCallType("ANSWERED", 2, "Answered");
    public static final com.truecaller.acspromo.domain.model.IncomingCallType UNKNOWN = new com.truecaller.acspromo.domain.model.IncomingCallType("UNKNOWN", 3, "Unknown");
    public static final com.truecaller.acspromo.domain.model.IncomingCallType MISSED_CALL = new com.truecaller.acspromo.domain.model.IncomingCallType("MISSED_CALL", 4, "MissedCall");

    private static final /* synthetic */ com.truecaller.acspromo.domain.model.IncomingCallType[] $values() {
        return new com.truecaller.acspromo.domain.model.IncomingCallType[]{SPAM, NON_PHONEBOOK_CONTACTS, ANSWERED, UNKNOWN, MISSED_CALL};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l00.baz] */
    static {
        com.truecaller.acspromo.domain.model.IncomingCallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private IncomingCallType(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acspromo.domain.model.IncomingCallType valueOf(java.lang.String str) {
        return (com.truecaller.acspromo.domain.model.IncomingCallType) java.lang.Enum.valueOf(com.truecaller.acspromo.domain.model.IncomingCallType.class, str);
    }

    public static com.truecaller.acspromo.domain.model.IncomingCallType[] values() {
        return (com.truecaller.acspromo.domain.model.IncomingCallType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
