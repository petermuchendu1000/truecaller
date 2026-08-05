package com.truecaller.familyprotect.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/familyprotect/api/model/Family$Member$ProtectionMember$InvitationError", "", "Lcom/truecaller/familyprotect/api/model/Family$Member$ProtectionMember$InvitationError;", "<init>", "(Ljava/lang/String;I)V", "NOT_TC_USER", "UNSUPPORTED_APP_VERSION", "UNSUPPORTED_OS", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Family$Member$ProtectionMember$InvitationError {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[] $VALUES;
    public static final com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError NOT_TC_USER = new com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError("NOT_TC_USER", 0);
    public static final com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError UNSUPPORTED_APP_VERSION = new com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError("UNSUPPORTED_APP_VERSION", 1);
    public static final com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError UNSUPPORTED_OS = new com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError("UNSUPPORTED_OS", 2);
    public static final com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError UNKNOWN = new com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[] $values() {
        return new com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[]{NOT_TC_USER, UNSUPPORTED_APP_VERSION, UNSUPPORTED_OS, UNKNOWN};
    }

    static {
        com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Family$Member$ProtectionMember$InvitationError(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError) java.lang.Enum.valueOf(com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError.class, str);
    }

    public static com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[] values() {
        return (com.truecaller.familyprotect.api.model.Family$Member$ProtectionMember$InvitationError[]) $VALUES.clone();
    }
}
