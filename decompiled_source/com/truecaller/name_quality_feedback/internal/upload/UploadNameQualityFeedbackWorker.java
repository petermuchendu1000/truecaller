package com.truecaller.name_quality_feedback.internal.upload;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/name_quality_feedback/internal/upload/UploadNameQualityFeedbackWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lqc3/bar;", "Lc52/baz;", "nameQualityFeedbackEndpoint", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lqc3/bar;)V", "name-quality-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UploadNameQualityFeedbackWorker extends androidx.work.CoroutineWorker {
    public static final com.google.gson.Gson b = new com.google.gson.Gson();
    public final qc3.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadNameQualityFeedbackWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull qc3.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "nameQualityFeedbackEndpoint");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        c52.a aVar;
        int i;
        try {
            if (barVar instanceof c52.a) {
                aVar = (c52.a) barVar;
                int i2 = aVar.z;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.z = i2 - Integer.MIN_VALUE;
                    java.lang.Object obj = aVar.x;
                    ef3.bar barVar2 = ef3.bar.a;
                    i = aVar.z;
                    if (i == 0) {
                        if (i == 1) {
                            od.p.E(obj);
                        } else {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        od.p.E(obj);
                        java.lang.String e = getInputData().e("key_nqf_dto_json");
                        if (e != null) {
                            com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto[] nameQualityFeedbackDtoArr = (com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto[]) b.fromJson(e, com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto[].class);
                            c52.baz bazVar = (c52.baz) this.a.get();
                            kotlin.jvm.internal.Intrinsics.d(nameQualityFeedbackDtoArr);
                            java.util.List<com.truecaller.name_quality_feedback.internal.upload.NameQualityFeedbackDto> h0 = kotlin.collections.v.h0(nameQualityFeedbackDtoArr);
                            aVar.z = 1;
                            if (bazVar.a(h0, aVar) == barVar2) {
                                return barVar2;
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException("Required value was null.");
                        }
                    }
                    return nd.t.a();
                }
            }
            if (i == 0) {
            }
            return nd.t.a();
        } catch (com.google.gson.v unused) {
            return new nd.q();
        } catch (java.io.IOException unused2) {
            return new java.lang.Object();
        } catch (java.lang.RuntimeException e2) {
            com.truecaller.log.AssertionUtil.reportThrowableButNeverCrash(new java.lang.Exception("Failed to sync name quality feedback", e2));
            return new nd.q();
        }
        aVar = new c52.a(this, (ff3.qux) barVar);
        java.lang.Object obj2 = aVar.x;
        ef3.bar barVar22 = ef3.bar.a;
        i = aVar.z;
    }
}
