package com.truecaller.commentfeedback.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/commentfeedback/db/PhoneNumberType;", "", "wrapped", "Lcom/truecaller/api/services/comments/model/NumberType;", "<init>", "(Ljava/lang/String;ILcom/truecaller/api/services/comments/model/NumberType;)V", "getWrapped", "()Lcom/truecaller/api/services/comments/model/NumberType;", "UNKNOWN_NUMBER_TYPE", "PHONE_NUMBER", "SENDER_ID", "IM_ID", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PhoneNumberType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.commentfeedback.db.PhoneNumberType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.api.services.comments.model.NumberType wrapped;
    public static final com.truecaller.commentfeedback.db.PhoneNumberType UNKNOWN_NUMBER_TYPE = new com.truecaller.commentfeedback.db.PhoneNumberType("UNKNOWN_NUMBER_TYPE", 0, com.truecaller.api.services.comments.model.NumberType.UNKNOWN_NUMBER_TYPE);
    public static final com.truecaller.commentfeedback.db.PhoneNumberType PHONE_NUMBER = new com.truecaller.commentfeedback.db.PhoneNumberType("PHONE_NUMBER", 1, com.truecaller.api.services.comments.model.NumberType.PHONE_NUMBER);
    public static final com.truecaller.commentfeedback.db.PhoneNumberType SENDER_ID = new com.truecaller.commentfeedback.db.PhoneNumberType("SENDER_ID", 2, com.truecaller.api.services.comments.model.NumberType.SENDER_ID);
    public static final com.truecaller.commentfeedback.db.PhoneNumberType IM_ID = new com.truecaller.commentfeedback.db.PhoneNumberType("IM_ID", 3, com.truecaller.api.services.comments.model.NumberType.IM_ID);

    private static final /* synthetic */ com.truecaller.commentfeedback.db.PhoneNumberType[] $values() {
        return new com.truecaller.commentfeedback.db.PhoneNumberType[]{UNKNOWN_NUMBER_TYPE, PHONE_NUMBER, SENDER_ID, IM_ID};
    }

    static {
        com.truecaller.commentfeedback.db.PhoneNumberType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PhoneNumberType(java.lang.String str, int i, com.truecaller.api.services.comments.model.NumberType numberType) {
        this.wrapped = numberType;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.commentfeedback.db.PhoneNumberType valueOf(java.lang.String str) {
        return (com.truecaller.commentfeedback.db.PhoneNumberType) java.lang.Enum.valueOf(com.truecaller.commentfeedback.db.PhoneNumberType.class, str);
    }

    public static com.truecaller.commentfeedback.db.PhoneNumberType[] values() {
        return (com.truecaller.commentfeedback.db.PhoneNumberType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.api.services.comments.model.NumberType getWrapped() {
        return this.wrapped;
    }
}
