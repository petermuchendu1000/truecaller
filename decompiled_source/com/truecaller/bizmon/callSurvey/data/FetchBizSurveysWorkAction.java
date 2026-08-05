package com.truecaller.bizmon.callSurvey.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/bizmon/callSurvey/data/FetchBizSurveysWorkAction;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lnh0/qux;", "surveysRepository", "Ljg0/e;", "bizBannerManager", "Ln11/l;", "accountManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;Lqc3/bar;Lqc3/bar;)V", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FetchBizSurveysWorkAction extends androidx.work.Worker {
    public final qc3.bar a;
    public final qc3.bar b;
    public final qc3.bar c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;
    public final kotlin.Lazy f;
    public final kotlin.Lazy g;
    public final kotlin.Lazy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchBizSurveysWorkAction(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar, @org.jetbrains.annotations.NotNull qc3.bar barVar2, @org.jetbrains.annotations.NotNull qc3.bar barVar3) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "surveysRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar2, "bizBannerManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar3, "accountManager");
        this.a = barVar;
        this.b = barVar2;
        this.c = barVar3;
        final int i = 0;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.e
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction b;

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
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("BizCallId");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("BizBadge");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 3:
                        return java.lang.Integer.valueOf(this.b.getInputData().b("SimSlotIndex", -1));
                    default:
                        return java.lang.Boolean.valueOf(this.b.getInputData().a("IsOutgoingCall", false));
                }
            }
        });
        final int i2 = 1;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.e
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction b;

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
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("BizCallId");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("BizBadge");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 3:
                        return java.lang.Integer.valueOf(this.b.getInputData().b("SimSlotIndex", -1));
                    default:
                        return java.lang.Boolean.valueOf(this.b.getInputData().a("IsOutgoingCall", false));
                }
            }
        });
        final int i3 = 2;
        this.f = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.e
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("BizNumber");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("BizCallId");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("BizBadge");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 3:
                        return java.lang.Integer.valueOf(this.b.getInputData().b("SimSlotIndex", -1));
                    default:
                        return java.lang.Boolean.valueOf(this.b.getInputData().a("IsOutgoingCall", false));
                }
            }
        });
        final int i4 = 3;
        this.g = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.e
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("BizNumber");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("BizCallId");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("BizBadge");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 3:
                        return java.lang.Integer.valueOf(this.b.getInputData().b("SimSlotIndex", -1));
                    default:
                        return java.lang.Boolean.valueOf(this.b.getInputData().a("IsOutgoingCall", false));
                }
            }
        });
        final int i5 = 4;
        this.h = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: nh0.e
            public final /* synthetic */ com.truecaller.bizmon.callSurvey.data.FetchBizSurveysWorkAction b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i5) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("BizNumber");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("BizCallId");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("BizBadge");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 3:
                        return java.lang.Integer.valueOf(this.b.getInputData().b("SimSlotIndex", -1));
                    default:
                        return java.lang.Boolean.valueOf(this.b.getInputData().a("IsOutgoingCall", false));
                }
            }
        });
    }

    public final nd.t doWork() {
        java.lang.Object O = fg3.h0.O(kotlin.coroutines.d.a, new lo1.bar(this, (df3.bar) null, 24));
        kotlin.jvm.internal.Intrinsics.d(O);
        return (nd.t) O;
    }
}
