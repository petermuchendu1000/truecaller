package com.truecaller.backup.worker;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/truecaller/backup/worker/BackupWorkerException;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "backup_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BackupWorkerException extends java.lang.Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupWorkerException(@org.jetbrains.annotations.NotNull java.lang.Throwable th) {
        super(th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "cause");
    }
}
