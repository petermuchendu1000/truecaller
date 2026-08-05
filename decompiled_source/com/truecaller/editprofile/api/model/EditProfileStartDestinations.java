package com.truecaller.editprofile.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/editprofile/api/model/EditProfileStartDestinations;", "", "<init>", "(Ljava/lang/String;I)V", "EDIT_PROFILE", "CHANGE_NUMBER", "CHANGE_SECONDARY_NUMBER", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EditProfileStartDestinations {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.editprofile.api.model.EditProfileStartDestinations[] $VALUES;
    public static final com.truecaller.editprofile.api.model.EditProfileStartDestinations EDIT_PROFILE = new com.truecaller.editprofile.api.model.EditProfileStartDestinations("EDIT_PROFILE", 0);
    public static final com.truecaller.editprofile.api.model.EditProfileStartDestinations CHANGE_NUMBER = new com.truecaller.editprofile.api.model.EditProfileStartDestinations("CHANGE_NUMBER", 1);
    public static final com.truecaller.editprofile.api.model.EditProfileStartDestinations CHANGE_SECONDARY_NUMBER = new com.truecaller.editprofile.api.model.EditProfileStartDestinations("CHANGE_SECONDARY_NUMBER", 2);

    private static final /* synthetic */ com.truecaller.editprofile.api.model.EditProfileStartDestinations[] $values() {
        return new com.truecaller.editprofile.api.model.EditProfileStartDestinations[]{EDIT_PROFILE, CHANGE_NUMBER, CHANGE_SECONDARY_NUMBER};
    }

    static {
        com.truecaller.editprofile.api.model.EditProfileStartDestinations[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EditProfileStartDestinations(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.editprofile.api.model.EditProfileStartDestinations valueOf(java.lang.String str) {
        return (com.truecaller.editprofile.api.model.EditProfileStartDestinations) java.lang.Enum.valueOf(com.truecaller.editprofile.api.model.EditProfileStartDestinations.class, str);
    }

    public static com.truecaller.editprofile.api.model.EditProfileStartDestinations[] values() {
        return (com.truecaller.editprofile.api.model.EditProfileStartDestinations[]) $VALUES.clone();
    }
}
