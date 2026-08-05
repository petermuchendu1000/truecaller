package com.truecaller.profile.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/profile/api/model/ProfileField$Text$InputType", "", "Lcom/truecaller/profile/api/model/ProfileField$Text$InputType;", "<init>", "(Ljava/lang/String;I)V", "TEXT", "PHONE", "TEXT_CAP_SENTENCES", "UNKNOWN", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProfileField$Text$InputType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.profile.api.model.ProfileField$Text$InputType[] $VALUES;
    public static final com.truecaller.profile.api.model.ProfileField$Text$InputType TEXT = new com.truecaller.profile.api.model.ProfileField$Text$InputType("TEXT", 0);
    public static final com.truecaller.profile.api.model.ProfileField$Text$InputType PHONE = new com.truecaller.profile.api.model.ProfileField$Text$InputType("PHONE", 1);
    public static final com.truecaller.profile.api.model.ProfileField$Text$InputType TEXT_CAP_SENTENCES = new com.truecaller.profile.api.model.ProfileField$Text$InputType("TEXT_CAP_SENTENCES", 2);
    public static final com.truecaller.profile.api.model.ProfileField$Text$InputType UNKNOWN = new com.truecaller.profile.api.model.ProfileField$Text$InputType("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.profile.api.model.ProfileField$Text$InputType[] $values() {
        return new com.truecaller.profile.api.model.ProfileField$Text$InputType[]{TEXT, PHONE, TEXT_CAP_SENTENCES, UNKNOWN};
    }

    static {
        com.truecaller.profile.api.model.ProfileField$Text$InputType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ProfileField$Text$InputType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.profile.api.model.ProfileField$Text$InputType valueOf(java.lang.String str) {
        return (com.truecaller.profile.api.model.ProfileField$Text$InputType) java.lang.Enum.valueOf(com.truecaller.profile.api.model.ProfileField$Text$InputType.class, str);
    }

    public static com.truecaller.profile.api.model.ProfileField$Text$InputType[] values() {
        return (com.truecaller.profile.api.model.ProfileField$Text$InputType[]) $VALUES.clone();
    }
}
