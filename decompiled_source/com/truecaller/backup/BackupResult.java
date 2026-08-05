package com.truecaller.backup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/backup/BackupResult;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "yf0/a0", "Success", "Skipped", "MaxRunAttemptReached", "ErrorClient", "ErrorFile", "ErrorCommit", "ErrorCommitInternet", "ErrorDatabase", "ErrorNetwork", "ErrorRead", "ErrorFileName", "ErrorJsonParsing", "ErrorDBFileNotFound", "ErrorDBDeletion", "ErrorIO", "ErrorNotSupportedDb", "ErrorPropertyRead", "ErrorWorker", "ErrorWorkerCanceled", "ErrorSave", "ErrorStorageLimit", "ErrorUsageLimits", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BackupResult {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.backup.BackupResult[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final yf0.a0 Companion;
    public static final com.truecaller.backup.BackupResult Success = new com.truecaller.backup.BackupResult("Success", 0);
    public static final com.truecaller.backup.BackupResult Skipped = new com.truecaller.backup.BackupResult("Skipped", 1);
    public static final com.truecaller.backup.BackupResult MaxRunAttemptReached = new com.truecaller.backup.BackupResult("MaxRunAttemptReached", 2);
    public static final com.truecaller.backup.BackupResult ErrorClient = new com.truecaller.backup.BackupResult("ErrorClient", 3);

    @kotlin.a
    public static final com.truecaller.backup.BackupResult ErrorFile = new com.truecaller.backup.BackupResult("ErrorFile", 4);
    public static final com.truecaller.backup.BackupResult ErrorCommit = new com.truecaller.backup.BackupResult("ErrorCommit", 5);
    public static final com.truecaller.backup.BackupResult ErrorCommitInternet = new com.truecaller.backup.BackupResult("ErrorCommitInternet", 6);
    public static final com.truecaller.backup.BackupResult ErrorDatabase = new com.truecaller.backup.BackupResult("ErrorDatabase", 7);
    public static final com.truecaller.backup.BackupResult ErrorNetwork = new com.truecaller.backup.BackupResult("ErrorNetwork", 8);
    public static final com.truecaller.backup.BackupResult ErrorRead = new com.truecaller.backup.BackupResult("ErrorRead", 9);
    public static final com.truecaller.backup.BackupResult ErrorFileName = new com.truecaller.backup.BackupResult("ErrorFileName", 10);
    public static final com.truecaller.backup.BackupResult ErrorJsonParsing = new com.truecaller.backup.BackupResult("ErrorJsonParsing", 11);
    public static final com.truecaller.backup.BackupResult ErrorDBFileNotFound = new com.truecaller.backup.BackupResult("ErrorDBFileNotFound", 12);
    public static final com.truecaller.backup.BackupResult ErrorDBDeletion = new com.truecaller.backup.BackupResult("ErrorDBDeletion", 13);
    public static final com.truecaller.backup.BackupResult ErrorIO = new com.truecaller.backup.BackupResult("ErrorIO", 14);
    public static final com.truecaller.backup.BackupResult ErrorNotSupportedDb = new com.truecaller.backup.BackupResult("ErrorNotSupportedDb", 15);
    public static final com.truecaller.backup.BackupResult ErrorPropertyRead = new com.truecaller.backup.BackupResult("ErrorPropertyRead", 16);
    public static final com.truecaller.backup.BackupResult ErrorWorker = new com.truecaller.backup.BackupResult("ErrorWorker", 17);
    public static final com.truecaller.backup.BackupResult ErrorWorkerCanceled = new com.truecaller.backup.BackupResult("ErrorWorkerCanceled", 18);
    public static final com.truecaller.backup.BackupResult ErrorSave = new com.truecaller.backup.BackupResult("ErrorSave", 19);
    public static final com.truecaller.backup.BackupResult ErrorStorageLimit = new com.truecaller.backup.BackupResult("ErrorStorageLimit", 20);
    public static final com.truecaller.backup.BackupResult ErrorUsageLimits = new com.truecaller.backup.BackupResult("ErrorUsageLimits", 21);

    private static final /* synthetic */ com.truecaller.backup.BackupResult[] $values() {
        return new com.truecaller.backup.BackupResult[]{Success, Skipped, MaxRunAttemptReached, ErrorClient, ErrorFile, ErrorCommit, ErrorCommitInternet, ErrorDatabase, ErrorNetwork, ErrorRead, ErrorFileName, ErrorJsonParsing, ErrorDBFileNotFound, ErrorDBDeletion, ErrorIO, ErrorNotSupportedDb, ErrorPropertyRead, ErrorWorker, ErrorWorkerCanceled, ErrorSave, ErrorStorageLimit, ErrorUsageLimits};
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [yf0.a0, java.lang.Object] */
    static {
        com.truecaller.backup.BackupResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private BackupResult(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.backup.BackupResult valueOf(java.lang.String str) {
        return (com.truecaller.backup.BackupResult) java.lang.Enum.valueOf(com.truecaller.backup.BackupResult.class, str);
    }

    public static com.truecaller.backup.BackupResult[] values() {
        return (com.truecaller.backup.BackupResult[]) $VALUES.clone();
    }
}
