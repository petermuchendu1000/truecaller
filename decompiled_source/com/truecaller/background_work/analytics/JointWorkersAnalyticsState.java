package com.truecaller.background_work.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/background_work/analytics/JointWorkersAnalyticsState;", "", "lastLogTimestamp", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(JJ)V", "getLastLogTimestamp", "()J", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class JointWorkersAnalyticsState {
    private final long id;
    private final long lastLogTimestamp;

    public JointWorkersAnalyticsState(long j, long j2) {
        this.lastLogTimestamp = j;
        this.id = j2;
    }

    public static /* synthetic */ com.truecaller.background_work.analytics.JointWorkersAnalyticsState copy$default(com.truecaller.background_work.analytics.JointWorkersAnalyticsState jointWorkersAnalyticsState, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = jointWorkersAnalyticsState.lastLogTimestamp;
        }
        if ((i & 2) != 0) {
            j2 = jointWorkersAnalyticsState.id;
        }
        return jointWorkersAnalyticsState.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLastLogTimestamp() {
        return this.lastLogTimestamp;
    }

    /* renamed from: component2, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.background_work.analytics.JointWorkersAnalyticsState copy(long lastLogTimestamp, long id) {
        return new com.truecaller.background_work.analytics.JointWorkersAnalyticsState(lastLogTimestamp, id);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.background_work.analytics.JointWorkersAnalyticsState)) {
            return false;
        }
        com.truecaller.background_work.analytics.JointWorkersAnalyticsState jointWorkersAnalyticsState = (com.truecaller.background_work.analytics.JointWorkersAnalyticsState) other;
        return this.lastLogTimestamp == jointWorkersAnalyticsState.lastLogTimestamp && this.id == jointWorkersAnalyticsState.id;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLastLogTimestamp() {
        return this.lastLogTimestamp;
    }

    public int hashCode() {
        long j = this.lastLogTimestamp;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.id;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.n(this.id, ")", h0.b.T(this.lastLogTimestamp, "JointWorkersAnalyticsState(lastLogTimestamp=", ", id="));
    }

    public /* synthetic */ JointWorkersAnalyticsState(long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? 1L : j2);
    }
}
