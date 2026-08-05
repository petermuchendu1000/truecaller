package com.truecaller.commentfeedback.workers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/truecaller/commentfeedback/workers/CommentFeedbackUploadWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lg11/qux;", "commentFeedbackRepository", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lg11/qux;)V", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CommentFeedbackUploadWorker extends androidx.work.Worker {
    public final g11.qux a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFeedbackUploadWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull g11.qux quxVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quxVar, "commentFeedbackRepository");
        this.a = quxVar;
    }

    public final nd.t doWork() {
        java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new jp2.b(this, (df3.bar) null, 22));
        kotlin.jvm.internal.Intrinsics.d(O);
        return (nd.t) O;
    }
}
