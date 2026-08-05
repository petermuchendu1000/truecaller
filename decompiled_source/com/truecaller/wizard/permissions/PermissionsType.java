package com.truecaller.wizard.permissions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/wizard/permissions/PermissionsType;", "", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_TYPE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "u83/a0", "PRE_VERIFICATION", "POST_VERIFICATION", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PermissionsType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.permissions.PermissionsType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final u83.a0 Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;
    public static final com.truecaller.wizard.permissions.PermissionsType PRE_VERIFICATION = new com.truecaller.wizard.permissions.PermissionsType("PRE_VERIFICATION", 0, "PRE_VERIFICATION");
    public static final com.truecaller.wizard.permissions.PermissionsType POST_VERIFICATION = new com.truecaller.wizard.permissions.PermissionsType("POST_VERIFICATION", 1, "POST_VERIFICATION");

    private static final /* synthetic */ com.truecaller.wizard.permissions.PermissionsType[] $values() {
        return new com.truecaller.wizard.permissions.PermissionsType[]{PRE_VERIFICATION, POST_VERIFICATION};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u83.a0, java.lang.Object] */
    static {
        com.truecaller.wizard.permissions.PermissionsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private PermissionsType(java.lang.String str, int i, java.lang.String str2) {
        this.type = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.permissions.PermissionsType valueOf(java.lang.String str) {
        return (com.truecaller.wizard.permissions.PermissionsType) java.lang.Enum.valueOf(com.truecaller.wizard.permissions.PermissionsType.class, str);
    }

    public static com.truecaller.wizard.permissions.PermissionsType[] values() {
        return (com.truecaller.wizard.permissions.PermissionsType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }
}
