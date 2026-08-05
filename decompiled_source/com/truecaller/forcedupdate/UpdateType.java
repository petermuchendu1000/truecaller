package com.truecaller.forcedupdate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B7\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/truecaller/forcedupdate/UpdateType;", "", "", "supportsCompactMode", "skippable", "", "title", "description", "action", "<init>", "(Ljava/lang/String;IZZIII)V", "Z", "getSupportsCompactMode", "()Z", "getSkippable", "I", "getTitle", "()I", "getDescription", "getAction", "Companion", "mp1/qux", "NONE", "OPTIONAL", "REQUIRED", "DISCONTINUED", "forced-update_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UpdateType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.forcedupdate.UpdateType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final mp1.qux Companion;
    private final int action;
    private final int description;
    private final boolean skippable;
    private final boolean supportsCompactMode;
    private final int title;
    public static final com.truecaller.forcedupdate.UpdateType NONE = new com.truecaller.forcedupdate.UpdateType("NONE", 0, false, true, -1, -1, -1);
    public static final com.truecaller.forcedupdate.UpdateType OPTIONAL = new com.truecaller.forcedupdate.UpdateType("OPTIONAL", 1, false, true, 2132021561, 2132021560, 2132021566);
    public static final com.truecaller.forcedupdate.UpdateType REQUIRED = new com.truecaller.forcedupdate.UpdateType("REQUIRED", 2, true, false, 2132021563, 2132021562, 2132021566);
    public static final com.truecaller.forcedupdate.UpdateType DISCONTINUED = new com.truecaller.forcedupdate.UpdateType("DISCONTINUED", 3, true, false, 2132021555, 2132021554, 2132021564);

    private static final /* synthetic */ com.truecaller.forcedupdate.UpdateType[] $values() {
        return new com.truecaller.forcedupdate.UpdateType[]{NONE, OPTIONAL, REQUIRED, DISCONTINUED};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mp1.qux] */
    static {
        com.truecaller.forcedupdate.UpdateType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private UpdateType(java.lang.String str, int i, boolean z, boolean z2, int i2, int i3, int i4) {
        this.supportsCompactMode = z;
        this.skippable = z2;
        this.title = i2;
        this.description = i3;
        this.action = i4;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.forcedupdate.UpdateType valueOf(java.lang.String str) {
        return (com.truecaller.forcedupdate.UpdateType) java.lang.Enum.valueOf(com.truecaller.forcedupdate.UpdateType.class, str);
    }

    public static com.truecaller.forcedupdate.UpdateType[] values() {
        return (com.truecaller.forcedupdate.UpdateType[]) $VALUES.clone();
    }

    public final int getAction() {
        return this.action;
    }

    public final int getDescription() {
        return this.description;
    }

    public final boolean getSkippable() {
        return this.skippable;
    }

    public final boolean getSupportsCompactMode() {
        return this.supportsCompactMode;
    }

    public final int getTitle() {
        return this.title;
    }
}
