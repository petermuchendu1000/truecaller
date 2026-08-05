package com.truecaller.commentfeedback.workers;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/truecaller/commentfeedback/workers/VoteCommentWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ly01/bar;", "commentFeedbackGrpcApiManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ly01/bar;)V", "ye0/k", "comment-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class VoteCommentWorker extends androidx.work.CoroutineWorker {
    public final y01.bar a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoteCommentWorker(@org.jetbrains.annotations.NotNull android.content.Context context, @org.jetbrains.annotations.NotNull androidx.work.WorkerParameters workerParameters, @org.jetbrains.annotations.NotNull y01.bar barVar) {
        super(context, workerParameters);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "params");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(barVar, "commentFeedbackGrpcApiManager");
        this.a = barVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object doWork(df3.bar barVar) {
        l11.bar barVar2;
        int i;
        com.truecaller.commentfeedback.workers.VoteCommentWorker voteCommentWorker;
        com.truecaller.commentfeedback.workers.VoteCommentWorker voteCommentWorker2;
        com.truecaller.commentfeedback.workers.VoteCommentWorker voteCommentWorker3;
        boolean booleanValue;
        boolean booleanValue2;
        boolean booleanValue3;
        if (barVar instanceof l11.bar) {
            barVar2 = (l11.bar) barVar;
            int i2 = barVar2.A;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                barVar2.A = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = barVar2.y;
                ef3.bar barVar3 = ef3.bar.a;
                i = barVar2.A;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                voteCommentWorker = barVar2.x;
                                od.p.E(obj);
                                booleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                                voteCommentWorker.getClass();
                                if (!booleanValue3) {
                                    return nd.t.a();
                                }
                                return new java.lang.Object();
                            }
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        voteCommentWorker2 = barVar2.x;
                        od.p.E(obj);
                        booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                        voteCommentWorker2.getClass();
                        if (!booleanValue2) {
                            return nd.t.a();
                        }
                        return new java.lang.Object();
                    }
                    voteCommentWorker3 = barVar2.x;
                    od.p.E(obj);
                    booleanValue = ((java.lang.Boolean) obj).booleanValue();
                    voteCommentWorker3.getClass();
                    if (!booleanValue) {
                        return nd.t.a();
                    }
                    return new java.lang.Object();
                }
                od.p.E(obj);
                java.lang.String e = getInputData().e("key_phone_number");
                if (e != null) {
                    java.lang.String e2 = getInputData().e("key_comment_id");
                    if (e2 != null) {
                        java.lang.String e3 = getInputData().e("key_vote_type");
                        if (e3 != null) {
                            int hashCode = e3.hashCode();
                            y01.bar barVar4 = this.a;
                            df3.bar barVar5 = null;
                            if (hashCode != -1398860809) {
                                if (hashCode != -693522663) {
                                    if (hashCode == 1310334272 && e3.equals("value_up_vote")) {
                                        barVar2.x = this;
                                        barVar2.A = 1;
                                        y01.a aVar = (y01.a) barVar4;
                                        obj = fg3.h0.W(aVar.a, new y01.baz(e2, e, aVar, barVar5, 1), barVar2);
                                        if (obj != barVar3) {
                                            voteCommentWorker3 = this;
                                            booleanValue = ((java.lang.Boolean) obj).booleanValue();
                                            voteCommentWorker3.getClass();
                                            if (!booleanValue) {
                                            }
                                        }
                                        return barVar3;
                                    }
                                    throw new java.lang.Exception("Unknown vote type");
                                }
                                if (e3.equals("value_down_vote")) {
                                    barVar2.x = this;
                                    barVar2.A = 2;
                                    y01.a aVar2 = (y01.a) barVar4;
                                    obj = fg3.h0.W(aVar2.a, new tx0.s(e2, e, aVar2, barVar5, 29), barVar2);
                                    if (obj != barVar3) {
                                        voteCommentWorker2 = this;
                                        booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
                                        voteCommentWorker2.getClass();
                                        if (!booleanValue2) {
                                        }
                                    }
                                    return barVar3;
                                }
                                throw new java.lang.Exception("Unknown vote type");
                            }
                            if (e3.equals("value_remove_vote")) {
                                barVar2.x = this;
                                barVar2.A = 3;
                                y01.a aVar3 = (y01.a) barVar4;
                                obj = fg3.h0.W(aVar3.a, new y01.baz(e2, e, aVar3, barVar5, 0), barVar2);
                                if (obj != barVar3) {
                                    voteCommentWorker = this;
                                    booleanValue3 = ((java.lang.Boolean) obj).booleanValue();
                                    voteCommentWorker.getClass();
                                    if (!booleanValue3) {
                                    }
                                }
                                return barVar3;
                            }
                            throw new java.lang.Exception("Unknown vote type");
                        }
                        throw new java.lang.Exception("Unknown data for vote type");
                    }
                    throw new java.lang.Exception("Unknown data for comment id");
                }
                throw new java.lang.Exception("Unknown data for number");
            }
        }
        barVar2 = new l11.bar(this, (ff3.qux) barVar);
        java.lang.Object obj2 = barVar2.y;
        ef3.bar barVar32 = ef3.bar.a;
        i = barVar2.A;
        if (i == 0) {
        }
    }
}
