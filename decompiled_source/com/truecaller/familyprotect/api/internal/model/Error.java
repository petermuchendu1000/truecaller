package com.truecaller.familyprotect.api.internal.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/truecaller/familyprotect/api/internal/model/Error;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "IO_EXCEPTION", "GENERAL_GRPC_ERROR", "GROUP_ALREADY_EXISTS", "INVALID_LIMIT_FOR_INVITEE", "NOT_FOUND", "DOMAIN_MISMATCH", "ALREADY_IN_GROUP", "DIFFERENT_GROUP_MEMBER", "SELF_INVITE", "NOT_TC_USER", "NOT_VALID_NUMBER", "DUPLICATE_NUMBER", "INVALID_REQUEST", "OPERATION_THROTTLED", "FORBIDDEN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Error {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.model.Error[] $VALUES;
    public static final com.truecaller.familyprotect.api.internal.model.Error UNKNOWN = new com.truecaller.familyprotect.api.internal.model.Error("UNKNOWN", 0);
    public static final com.truecaller.familyprotect.api.internal.model.Error IO_EXCEPTION = new com.truecaller.familyprotect.api.internal.model.Error("IO_EXCEPTION", 1);
    public static final com.truecaller.familyprotect.api.internal.model.Error GENERAL_GRPC_ERROR = new com.truecaller.familyprotect.api.internal.model.Error("GENERAL_GRPC_ERROR", 2);
    public static final com.truecaller.familyprotect.api.internal.model.Error GROUP_ALREADY_EXISTS = new com.truecaller.familyprotect.api.internal.model.Error("GROUP_ALREADY_EXISTS", 3);
    public static final com.truecaller.familyprotect.api.internal.model.Error INVALID_LIMIT_FOR_INVITEE = new com.truecaller.familyprotect.api.internal.model.Error("INVALID_LIMIT_FOR_INVITEE", 4);
    public static final com.truecaller.familyprotect.api.internal.model.Error NOT_FOUND = new com.truecaller.familyprotect.api.internal.model.Error("NOT_FOUND", 5);
    public static final com.truecaller.familyprotect.api.internal.model.Error DOMAIN_MISMATCH = new com.truecaller.familyprotect.api.internal.model.Error("DOMAIN_MISMATCH", 6);
    public static final com.truecaller.familyprotect.api.internal.model.Error ALREADY_IN_GROUP = new com.truecaller.familyprotect.api.internal.model.Error("ALREADY_IN_GROUP", 7);
    public static final com.truecaller.familyprotect.api.internal.model.Error DIFFERENT_GROUP_MEMBER = new com.truecaller.familyprotect.api.internal.model.Error("DIFFERENT_GROUP_MEMBER", 8);
    public static final com.truecaller.familyprotect.api.internal.model.Error SELF_INVITE = new com.truecaller.familyprotect.api.internal.model.Error("SELF_INVITE", 9);
    public static final com.truecaller.familyprotect.api.internal.model.Error NOT_TC_USER = new com.truecaller.familyprotect.api.internal.model.Error("NOT_TC_USER", 10);
    public static final com.truecaller.familyprotect.api.internal.model.Error NOT_VALID_NUMBER = new com.truecaller.familyprotect.api.internal.model.Error("NOT_VALID_NUMBER", 11);
    public static final com.truecaller.familyprotect.api.internal.model.Error DUPLICATE_NUMBER = new com.truecaller.familyprotect.api.internal.model.Error("DUPLICATE_NUMBER", 12);
    public static final com.truecaller.familyprotect.api.internal.model.Error INVALID_REQUEST = new com.truecaller.familyprotect.api.internal.model.Error("INVALID_REQUEST", 13);
    public static final com.truecaller.familyprotect.api.internal.model.Error OPERATION_THROTTLED = new com.truecaller.familyprotect.api.internal.model.Error("OPERATION_THROTTLED", 14);
    public static final com.truecaller.familyprotect.api.internal.model.Error FORBIDDEN = new com.truecaller.familyprotect.api.internal.model.Error("FORBIDDEN", 15);

    private static final /* synthetic */ com.truecaller.familyprotect.api.internal.model.Error[] $values() {
        return new com.truecaller.familyprotect.api.internal.model.Error[]{UNKNOWN, IO_EXCEPTION, GENERAL_GRPC_ERROR, GROUP_ALREADY_EXISTS, INVALID_LIMIT_FOR_INVITEE, NOT_FOUND, DOMAIN_MISMATCH, ALREADY_IN_GROUP, DIFFERENT_GROUP_MEMBER, SELF_INVITE, NOT_TC_USER, NOT_VALID_NUMBER, DUPLICATE_NUMBER, INVALID_REQUEST, OPERATION_THROTTLED, FORBIDDEN};
    }

    static {
        com.truecaller.familyprotect.api.internal.model.Error[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Error(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.internal.model.Error valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.internal.model.Error) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.internal.model.Error.class, str);
    }

    public static com.truecaller.familyprotect.api.internal.model.Error[] values() {
        return (com.truecaller.familyprotect.api.internal.model.Error[]) $VALUES.clone();
    }
}
