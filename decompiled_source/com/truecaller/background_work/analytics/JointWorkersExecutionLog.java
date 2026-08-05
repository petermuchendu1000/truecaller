package com.truecaller.background_work.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/truecaller/background_work/analytics/JointWorkersExecutionLog;", "", "timestamp", "", "bucketName", "", "internetRequired", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(JLjava/lang/String;ZJ)V", "getTimestamp", "()J", "getBucketName", "()Ljava/lang/String;", "getInternetRequired", "()Z", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "background-work_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class JointWorkersExecutionLog {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String bucketName;
    private final long id;
    private final boolean internetRequired;
    private final long timestamp;

    public JointWorkersExecutionLog(long j, @org.jetbrains.annotations.NotNull java.lang.String str, boolean z, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "bucketName");
        this.timestamp = j;
        this.bucketName = str;
        this.internetRequired = z;
        this.id = j2;
    }

    public static /* synthetic */ com.truecaller.background_work.analytics.JointWorkersExecutionLog copy$default(com.truecaller.background_work.analytics.JointWorkersExecutionLog jointWorkersExecutionLog, long j, java.lang.String str, boolean z, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = jointWorkersExecutionLog.timestamp;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = jointWorkersExecutionLog.bucketName;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            z = jointWorkersExecutionLog.internetRequired;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j2 = jointWorkersExecutionLog.id;
        }
        return jointWorkersExecutionLog.copy(j3, str2, z2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getBucketName() {
        return this.bucketName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getInternetRequired() {
        return this.internetRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.background_work.analytics.JointWorkersExecutionLog copy(long timestamp, @org.jetbrains.annotations.NotNull java.lang.String bucketName, boolean internetRequired, long id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        return new com.truecaller.background_work.analytics.JointWorkersExecutionLog(timestamp, bucketName, internetRequired, id);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.background_work.analytics.JointWorkersExecutionLog)) {
            return false;
        }
        com.truecaller.background_work.analytics.JointWorkersExecutionLog jointWorkersExecutionLog = (com.truecaller.background_work.analytics.JointWorkersExecutionLog) other;
        return this.timestamp == jointWorkersExecutionLog.timestamp && kotlin.jvm.internal.Intrinsics.b(this.bucketName, jointWorkersExecutionLog.bucketName) && this.internetRequired == jointWorkersExecutionLog.internetRequired && this.id == jointWorkersExecutionLog.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBucketName() {
        return this.bucketName;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getInternetRequired() {
        return this.internetRequired;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i;
        long j = this.timestamp;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.bucketName);
        if (this.internetRequired) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (e + i) * 31;
        long j2 = this.id;
        return i2 + ((int) ((j2 >>> 32) ^ j2));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.timestamp;
        java.lang.String str = this.bucketName;
        boolean z = this.internetRequired;
        long j2 = this.id;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("JointWorkersExecutionLog(timestamp=", j, ", bucketName=", str);
        p.append(", internetRequired=");
        p.append(z);
        p.append(", id=");
        return bar.n(j2, ")", p);
    }

    public /* synthetic */ JointWorkersExecutionLog(long j, java.lang.String str, boolean z, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, z, (i & 8) != 0 ? 0L : j2);
    }
}
