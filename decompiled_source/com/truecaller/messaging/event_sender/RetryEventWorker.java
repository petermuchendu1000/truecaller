package com.truecaller.messaging.event_sender;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/messaging/event_sender/RetryEventWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Le22/c;", "retryEventSyncHelper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Le22/c;)V", "messaging-event-sender_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RetryEventWorker extends androidx.work.CoroutineWorker {
    public final e22.c a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryEventWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull e22.c cVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "workerParams");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cVar, "retryEventSyncHelper");
        this.a = cVar;
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        e22.e eVar = (e22.e) this.a;
        return fg3.h0.W(eVar.a, new e22.d(eVar, null), barVar);
    }
}
