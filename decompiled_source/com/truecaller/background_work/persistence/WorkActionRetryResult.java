package com.truecaller.background_work.persistence;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001d\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0013¨\u0006%"}, d2 = {"Lcom/truecaller/background_work/persistence/WorkActionRetryResult;", "", "", "actionName", "Lcom/truecaller/background_work/WorkActionPeriod;", "period", "", "internetRequired", "", "retriedTimes", "<init>", "(Ljava/lang/String;Lcom/truecaller/background_work/WorkActionPeriod;ZI)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/truecaller/background_work/WorkActionPeriod;", "component3", "()Z", "component4", "()I", "copy", "(Ljava/lang/String;Lcom/truecaller/background_work/WorkActionPeriod;ZI)Lcom/truecaller/background_work/persistence/WorkActionRetryResult;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActionName", "Lcom/truecaller/background_work/WorkActionPeriod;", "getPeriod", "Z", "getInternetRequired", "I", "getRetriedTimes", "Companion", "wf0/c", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class WorkActionRetryResult {

    @org.jetbrains.annotations.NotNull
    public static final wf0.c Companion = new java.lang.Object();

    @org.jetbrains.annotations.NotNull
    private final java.lang.String actionName;
    private final boolean internetRequired;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.background_work.WorkActionPeriod period;
    private final int retriedTimes;

    public WorkActionRetryResult(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.background_work.WorkActionPeriod workActionPeriod, boolean z, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "actionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workActionPeriod, "period");
        this.actionName = str;
        this.period = workActionPeriod;
        this.internetRequired = z;
        this.retriedTimes = i;
    }

    public static /* synthetic */ com.truecaller.background_work.persistence.WorkActionRetryResult copy$default(com.truecaller.background_work.persistence.WorkActionRetryResult workActionRetryResult, java.lang.String str, com.truecaller.background_work.WorkActionPeriod workActionPeriod, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = workActionRetryResult.actionName;
        }
        if ((i2 & 2) != 0) {
            workActionPeriod = workActionRetryResult.period;
        }
        if ((i2 & 4) != 0) {
            z = workActionRetryResult.internetRequired;
        }
        if ((i2 & 8) != 0) {
            i = workActionRetryResult.retriedTimes;
        }
        return workActionRetryResult.copy(str, workActionPeriod, z, i);
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<com.truecaller.background_work.persistence.WorkActionRetryResult> fromActionNames(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.NotNull uf0.f fVar) {
        Companion.getClass();
        return wf0.c.a(list, fVar);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getActionName() {
        return this.actionName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.background_work.WorkActionPeriod getPeriod() {
        return this.period;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInternetRequired() {
        return this.internetRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRetriedTimes() {
        return this.retriedTimes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.background_work.persistence.WorkActionRetryResult copy(@org.jetbrains.annotations.NotNull java.lang.String actionName, @org.jetbrains.annotations.NotNull com.truecaller.background_work.WorkActionPeriod period, boolean internetRequired, int retriedTimes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionName, "actionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(period, "period");
        return new com.truecaller.background_work.persistence.WorkActionRetryResult(actionName, period, internetRequired, retriedTimes);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.background_work.persistence.WorkActionRetryResult)) {
            return false;
        }
        com.truecaller.background_work.persistence.WorkActionRetryResult workActionRetryResult = (com.truecaller.background_work.persistence.WorkActionRetryResult) other;
        return kotlin.jvm.internal.Intrinsics.b(this.actionName, workActionRetryResult.actionName) && this.period == workActionRetryResult.period && this.internetRequired == workActionRetryResult.internetRequired && this.retriedTimes == workActionRetryResult.retriedTimes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActionName() {
        return this.actionName;
    }

    public final boolean getInternetRequired() {
        return this.internetRequired;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.background_work.WorkActionPeriod getPeriod() {
        return this.period;
    }

    public final int getRetriedTimes() {
        return this.retriedTimes;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.period.hashCode() + (this.actionName.hashCode() * 31)) * 31;
        if (this.internetRequired) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((hashCode + i) * 31) + this.retriedTimes;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "WorkActionRetryResult(actionName=" + this.actionName + ", period=" + this.period + ", internetRequired=" + this.internetRequired + ", retriedTimes=" + this.retriedTimes + ")";
    }
}
