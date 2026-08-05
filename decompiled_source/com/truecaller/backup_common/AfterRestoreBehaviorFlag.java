package com.truecaller.backup_common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/backup_common/AfterRestoreBehaviorFlag;", "", "<init>", "(Ljava/lang/String;I)V", "Presence", "FiltersUpload", com.truecaller.clevertap.CleverTapProfile.LANGUAGE, "Backup", "backup-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AfterRestoreBehaviorFlag {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.backup_common.AfterRestoreBehaviorFlag[] $VALUES;
    public static final com.truecaller.backup_common.AfterRestoreBehaviorFlag Presence = new com.truecaller.backup_common.AfterRestoreBehaviorFlag("Presence", 0);
    public static final com.truecaller.backup_common.AfterRestoreBehaviorFlag FiltersUpload = new com.truecaller.backup_common.AfterRestoreBehaviorFlag("FiltersUpload", 1);
    public static final com.truecaller.backup_common.AfterRestoreBehaviorFlag Language = new com.truecaller.backup_common.AfterRestoreBehaviorFlag(com.truecaller.clevertap.CleverTapProfile.LANGUAGE, 2);
    public static final com.truecaller.backup_common.AfterRestoreBehaviorFlag Backup = new com.truecaller.backup_common.AfterRestoreBehaviorFlag("Backup", 3);

    private static final /* synthetic */ com.truecaller.backup_common.AfterRestoreBehaviorFlag[] $values() {
        return new com.truecaller.backup_common.AfterRestoreBehaviorFlag[]{Presence, FiltersUpload, Language, Backup};
    }

    static {
        com.truecaller.backup_common.AfterRestoreBehaviorFlag[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AfterRestoreBehaviorFlag(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.backup_common.AfterRestoreBehaviorFlag valueOf(java.lang.String str) {
        return (com.truecaller.backup_common.AfterRestoreBehaviorFlag) java.lang.Enum.valueOf(com.truecaller.backup_common.AfterRestoreBehaviorFlag.class, str);
    }

    public static com.truecaller.backup_common.AfterRestoreBehaviorFlag[] values() {
        return (com.truecaller.backup_common.AfterRestoreBehaviorFlag[]) $VALUES.clone();
    }
}
