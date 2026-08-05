package com.truecaller.bizmon.callSurvey.data;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/PostBizSurveyAnswersWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lkh0/qux;", "bizAcsCallSurveyManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;)V", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostBizSurveyAnswersWorker extends androidx.work.CoroutineWorker {
    public final qc3.bar a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostBizSurveyAnswersWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "bizAcsCallSurveyManager");
        this.a = barVar;
        final int i = 0;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.f
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.PostBizSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("BizNumber");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        java.lang.String e2 = this.b.getInputData().e("BizBadge");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.f
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.PostBizSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("BizNumber");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        java.lang.String e2 = this.b.getInputData().e("BizBadge");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                }
            }
        });
    }

    public final java.lang.Object doWork(df3.bar barVar) {
        java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new nh0.g(this, null, 1));
        kotlin.jvm.internal.Intrinsics.d(O);
        return O;
    }
}
