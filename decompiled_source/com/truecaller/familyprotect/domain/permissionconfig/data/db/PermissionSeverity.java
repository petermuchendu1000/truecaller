package com.truecaller.familyprotect.domain.permissionconfig.data.db;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/familyprotect/domain/permissionconfig/data/db/PermissionSeverity;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "yk1/f0", "PERMISSION_SEVERITY_HIGH", "PERMISSION_SEVERITY_LOW", "UNKNOWN", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PermissionSeverity {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate;

    @org.jetbrains.annotations.NotNull
    public static final yk1.f0 Companion;
    public static final com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity PERMISSION_SEVERITY_HIGH = new com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity("PERMISSION_SEVERITY_HIGH", 0);
    public static final com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity PERMISSION_SEVERITY_LOW = new com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity("PERMISSION_SEVERITY_LOW", 1);
    public static final com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity UNKNOWN = new com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity("UNKNOWN", 2);

    private static final /* synthetic */ com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[] $values() {
        return new com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[]{PERMISSION_SEVERITY_HIGH, PERMISSION_SEVERITY_LOW, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, yk1.f0] */
    static {
        com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new y41.baz(11));
    }

    private PermissionSeverity(java.lang.String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
        return yg3.w0.f("com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity", values());
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity) java.lang.Enum.valueOf(com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity.class, str);
    }

    public static com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[] values() {
        return (com.truecaller.familyprotect.domain.permissionconfig.data.db.PermissionSeverity[]) $VALUES.clone();
    }
}
