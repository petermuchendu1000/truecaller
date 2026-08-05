package com.truecaller.bizmon.callMeBack.db.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JK\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/db/entity/BizDayTimeSlot;", "", "operationalDays", "", "", "startTime", "", "endTime", "timeZone", "maxSlotDays", "interval", "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getOperationalDays", "()Ljava/util/List;", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getTimeZone", "getMaxSlotDays", "()I", "getInterval", "()J", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizDayTimeSlot {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String endTime;
    private final long interval;
    private final int maxSlotDays;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> operationalDays;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String startTime;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String timeZone;

    public BizDayTimeSlot(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, int i, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "operationalDays");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "startTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "endTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "timeZone");
        this.operationalDays = list;
        this.startTime = str;
        this.endTime = str2;
        this.timeZone = str3;
        this.maxSlotDays = i;
        this.interval = j;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot copy$default(com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = bizDayTimeSlot.operationalDays;
        }
        if ((i2 & 2) != 0) {
            str = bizDayTimeSlot.startTime;
        }
        if ((i2 & 4) != 0) {
            str2 = bizDayTimeSlot.endTime;
        }
        if ((i2 & 8) != 0) {
            str3 = bizDayTimeSlot.timeZone;
        }
        if ((i2 & 16) != 0) {
            i = bizDayTimeSlot.maxSlotDays;
        }
        if ((i2 & 32) != 0) {
            j = bizDayTimeSlot.interval;
        }
        long j2 = j;
        int i3 = i;
        java.lang.String str4 = str2;
        return bizDayTimeSlot.copy(list, str, str4, str3, i3, j2);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component1() {
        return this.operationalDays;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMaxSlotDays() {
        return this.maxSlotDays;
    }

    /* renamed from: component6, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> operationalDays, @org.jetbrains.annotations.NotNull java.lang.String startTime, @org.jetbrains.annotations.NotNull java.lang.String endTime, @org.jetbrains.annotations.NotNull java.lang.String timeZone, int maxSlotDays, long interval) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationalDays, "operationalDays");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTime, "startTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(endTime, "endTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        return new com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot(operationalDays, startTime, endTime, timeZone, maxSlotDays, interval);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot bizDayTimeSlot = (com.truecaller.bizmon.callMeBack.db.entity.BizDayTimeSlot) other;
        return kotlin.jvm.internal.Intrinsics.b(this.operationalDays, bizDayTimeSlot.operationalDays) && kotlin.jvm.internal.Intrinsics.b(this.startTime, bizDayTimeSlot.startTime) && kotlin.jvm.internal.Intrinsics.b(this.endTime, bizDayTimeSlot.endTime) && kotlin.jvm.internal.Intrinsics.b(this.timeZone, bizDayTimeSlot.timeZone) && this.maxSlotDays == bizDayTimeSlot.maxSlotDays && this.interval == bizDayTimeSlot.interval;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEndTime() {
        return this.endTime;
    }

    public final long getInterval() {
        return this.interval;
    }

    public final int getMaxSlotDays() {
        return this.maxSlotDays;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getOperationalDays() {
        return this.operationalDays;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStartTime() {
        return this.startTime;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        int e = (ax1.bar.e(ax1.bar.e(ax1.bar.e(this.operationalDays.hashCode() * 31, 31, this.startTime), 31, this.endTime), 31, this.timeZone) + this.maxSlotDays) * 31;
        long j = this.interval;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.startTime;
        java.lang.String str2 = this.endTime;
        java.lang.String str3 = this.timeZone;
        int i = this.maxSlotDays;
        long j = this.interval;
        java.util.List<java.lang.Integer> list = this.operationalDays;
        java.lang.StringBuilder E = ro0.f.E("startTime=", str, ", endTime='", str2, "', timeZone=");
        t.c.x(i, str3, ", maxSlotDays=", ", duration=", E);
        E.append(j);
        E.append(", operationalDays=");
        E.append(list);
        return E.toString();
    }
}
