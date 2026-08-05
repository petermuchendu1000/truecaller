package com.truecaller.surveys.data;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/surveys/data/PostSurveyAnswersWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lbu2/i;", "surveysRepository", "Lnc0/bar;", "analytics", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lbu2/i;Lnc0/bar;)V", "b91/a", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PostSurveyAnswersWorker extends androidx.work.CoroutineWorker {
    public static final b91.a f = new b91.a(10);
    public final bu2.i a;
    public final kotlin.Lazy b;
    public final kotlin.Lazy c;
    public final kotlin.Lazy d;
    public final kotlin.Lazy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSurveyAnswersWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull bu2.i iVar, @org.jetbrains.annotations.NotNull nc0.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iVar, "surveysRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "analytics");
        this.a = iVar;
        final int i = 0;
        this.b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: bu2.e
            public final /* synthetic */ com.truecaller.surveys.data.PostSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("answers_as_json_key");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("survey_source_key");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("survey_id_key");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        return this.b.getInputData().e("survey_pass_through_key");
                }
            }
        });
        final int i2 = 1;
        this.c = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: bu2.e
            public final /* synthetic */ com.truecaller.surveys.data.PostSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i2) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("answers_as_json_key");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("survey_source_key");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("survey_id_key");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        return this.b.getInputData().e("survey_pass_through_key");
                }
            }
        });
        final int i3 = 2;
        this.d = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: bu2.e
            public final /* synthetic */ com.truecaller.surveys.data.PostSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i3) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("answers_as_json_key");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("survey_source_key");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("survey_id_key");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        return this.b.getInputData().e("survey_pass_through_key");
                }
            }
        });
        final int i4 = 3;
        this.e = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0(this) { // from class: bu2.e
            public final /* synthetic */ com.truecaller.surveys.data.PostSurveyAnswersWorker b;

            {
                this.b = this;
            }

            public final java.lang.Object invoke() {
                switch (i4) {
                    case 0:
                        java.lang.String e = this.b.getInputData().e("answers_as_json_key");
                        if (e != null) {
                            return e;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 1:
                        java.lang.String e2 = this.b.getInputData().e("survey_source_key");
                        if (e2 != null) {
                            return e2;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    case 2:
                        java.lang.String e3 = this.b.getInputData().e("survey_id_key");
                        if (e3 != null) {
                            return e3;
                        }
                        throw new java.lang.IllegalArgumentException("Required value was null.");
                    default:
                        return this.b.getInputData().e("survey_pass_through_key");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098 A[Catch: IllegalArgumentException -> 0x0029, e -> 0x002d, TryCatch #2 {e -> 0x002d, IllegalArgumentException -> 0x0029, blocks: (B:10:0x0025, B:11:0x0090, B:13:0x0098, B:17:0x009f, B:19:0x00a5, B:20:0x00aa, B:24:0x003c), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        bu2.f fVar;
        int i;
        boolean booleanValue;
        try {
            if (barVar instanceof bu2.f) {
                fVar = (bu2.f) barVar;
                int i2 = fVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = fVar.x;
                    ef3.bar barVar2 = ef3.bar.a;
                    i = fVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        zg3.baz bazVar = zg3.qux.d;
                        he0.u0.i0(kotlin.jvm.internal.m.a);
                        java.util.Map map = (java.util.Map) bazVar.a((java.lang.String) this.b.getValue(), he0.u0.O(yg3.g0.a, eu2.w.Companion.serializer()));
                        bu2.i iVar = this.a;
                        java.lang.String str = (java.lang.String) this.d.getValue();
                        java.lang.String str2 = (java.lang.String) this.e.getValue();
                        java.lang.String str3 = (java.lang.String) this.c.getValue();
                        fVar.z = 1;
                        bu2.u uVar = (bu2.u) iVar;
                        obj = fg3.h0.W(uVar.a, new a93.t(str, map, str3, str2, uVar, null, 4), fVar);
                        if (obj == barVar2) {
                            return barVar2;
                        }
                    }
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    if (!booleanValue) {
                        return nd.t.a();
                    }
                    if (!booleanValue) {
                        return new java.lang.Object();
                    }
                    throw new java.lang.RuntimeException();
                }
            }
            if (i == 0) {
            }
            booleanValue = ((java.lang.Boolean) obj).booleanValue();
            if (!booleanValue) {
            }
        } catch (ug3.e e) {
            o82.a.D("PostSurveyAnswersWorker failed to deserialize survey or answers: " + e.getMessage());
            return new nd.q();
        } catch (java.lang.IllegalArgumentException e2) {
            o82.a.D("PostSurveyAnswersWorker failed to get survey arguments " + e2.getMessage());
            return new nd.q();
        }
        fVar = new bu2.f(this, (ff3.qux) barVar);
        java.lang.Object obj2 = fVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = fVar.z;
    }
}
