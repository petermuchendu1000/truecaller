package com.truecaller.profile.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/profile/api/model/AvatarState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "pg2/d", "BLOCKED", "FINE", "SILENT_BLOCKED", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AvatarState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.profile.api.model.AvatarState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final pg2.d Companion;
    public static final com.truecaller.profile.api.model.AvatarState BLOCKED = new com.truecaller.profile.api.model.AvatarState("BLOCKED", 0);
    public static final com.truecaller.profile.api.model.AvatarState FINE = new com.truecaller.profile.api.model.AvatarState("FINE", 1);
    public static final com.truecaller.profile.api.model.AvatarState SILENT_BLOCKED = new com.truecaller.profile.api.model.AvatarState("SILENT_BLOCKED", 2);

    private static final /* synthetic */ com.truecaller.profile.api.model.AvatarState[] $values() {
        return new com.truecaller.profile.api.model.AvatarState[]{BLOCKED, FINE, SILENT_BLOCKED};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [pg2.d, java.lang.Object] */
    static {
        com.truecaller.profile.api.model.AvatarState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AvatarState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.profile.api.model.AvatarState valueOf(java.lang.String str) {
        return (com.truecaller.profile.api.model.AvatarState) java.lang.Enum.valueOf(com.truecaller.profile.api.model.AvatarState.class, str);
    }

    public static com.truecaller.profile.api.model.AvatarState[] values() {
        return (com.truecaller.profile.api.model.AvatarState[]) $VALUES.clone();
    }
}
