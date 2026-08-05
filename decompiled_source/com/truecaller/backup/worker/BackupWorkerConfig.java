package com.truecaller.backup.worker;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/truecaller/backup/worker/BackupWorkerConfig;", "", "", "maxRetryAttempts", "", "backoffDurationMinutes", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;)Lcom/truecaller/backup/worker/BackupWorkerConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxRetryAttempts", "Ljava/lang/Long;", "getBackoffDurationMinutes", "Companion", "dg0/e", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BackupWorkerConfig {

    @org.jetbrains.annotations.NotNull
    public static final dg0.e Companion = new java.lang.Object();

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long backoffDurationMinutes;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer maxRetryAttempts;

    /* JADX WARN: Multi-variable type inference failed */
    public BackupWorkerConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ com.truecaller.backup.worker.BackupWorkerConfig copy$default(com.truecaller.backup.worker.BackupWorkerConfig backupWorkerConfig, java.lang.Integer num, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = backupWorkerConfig.maxRetryAttempts;
        }
        if ((i & 2) != 0) {
            l = backupWorkerConfig.backoffDurationMinutes;
        }
        return backupWorkerConfig.copy(num, l);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getMaxRetryAttempts() {
        return this.maxRetryAttempts;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getBackoffDurationMinutes() {
        return this.backoffDurationMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.backup.worker.BackupWorkerConfig copy(@org.jetbrains.annotations.Nullable java.lang.Integer maxRetryAttempts, @org.jetbrains.annotations.Nullable java.lang.Long backoffDurationMinutes) {
        return new com.truecaller.backup.worker.BackupWorkerConfig(maxRetryAttempts, backoffDurationMinutes);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.backup.worker.BackupWorkerConfig)) {
            return false;
        }
        com.truecaller.backup.worker.BackupWorkerConfig backupWorkerConfig = (com.truecaller.backup.worker.BackupWorkerConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.maxRetryAttempts, backupWorkerConfig.maxRetryAttempts) && kotlin.jvm.internal.Intrinsics.b(this.backoffDurationMinutes, backupWorkerConfig.backoffDurationMinutes);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getBackoffDurationMinutes() {
        return this.backoffDurationMinutes;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMaxRetryAttempts() {
        return this.maxRetryAttempts;
    }

    public int hashCode() {
        java.lang.Integer num = this.maxRetryAttempts;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Long l = this.backoffDurationMinutes;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "BackupWorkerConfig(maxRetryAttempts=" + this.maxRetryAttempts + ", backoffDurationMinutes=" + this.backoffDurationMinutes + ")";
    }

    public BackupWorkerConfig(@org.jetbrains.annotations.Nullable java.lang.Integer num, @org.jetbrains.annotations.Nullable java.lang.Long l) {
        this.maxRetryAttempts = num;
        this.backoffDurationMinutes = l;
    }

    public /* synthetic */ BackupWorkerConfig(java.lang.Integer num, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : l);
    }
}
