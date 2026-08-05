package com.truecaller.bizmon.callMeBack.db.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/db/entity/BizOperationalTimeSlot;", "", "operationalDay", "", "operationalEndTime", "", "operationalStartTime", "operationalTimeZone", "slotDuration", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getOperationalDay", "()I", "getOperationalEndTime", "()Ljava/lang/String;", "getOperationalStartTime", "getOperationalTimeZone", "getSlotDuration", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizOperationalTimeSlot {
    public static final int $stable = 0;
    private final int operationalDay;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String operationalEndTime;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String operationalStartTime;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String operationalTimeZone;
    private final long slotDuration;

    public BizOperationalTimeSlot(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "operationalEndTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "operationalStartTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "operationalTimeZone");
        this.operationalDay = i;
        this.operationalEndTime = str;
        this.operationalStartTime = str2;
        this.operationalTimeZone = str3;
        this.slotDuration = j;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot copy$default(com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot bizOperationalTimeSlot, int i, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bizOperationalTimeSlot.operationalDay;
        }
        if ((i2 & 2) != 0) {
            str = bizOperationalTimeSlot.operationalEndTime;
        }
        if ((i2 & 4) != 0) {
            str2 = bizOperationalTimeSlot.operationalStartTime;
        }
        if ((i2 & 8) != 0) {
            str3 = bizOperationalTimeSlot.operationalTimeZone;
        }
        if ((i2 & 16) != 0) {
            j = bizOperationalTimeSlot.slotDuration;
        }
        long j2 = j;
        return bizOperationalTimeSlot.copy(i, str, str2, str3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getOperationalDay() {
        return this.operationalDay;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getOperationalEndTime() {
        return this.operationalEndTime;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOperationalStartTime() {
        return this.operationalStartTime;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getOperationalTimeZone() {
        return this.operationalTimeZone;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSlotDuration() {
        return this.slotDuration;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot copy(int operationalDay, @org.jetbrains.annotations.NotNull java.lang.String operationalEndTime, @org.jetbrains.annotations.NotNull java.lang.String operationalStartTime, @org.jetbrains.annotations.NotNull java.lang.String operationalTimeZone, long slotDuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationalEndTime, "operationalEndTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationalStartTime, "operationalStartTime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationalTimeZone, "operationalTimeZone");
        return new com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot(operationalDay, operationalEndTime, operationalStartTime, operationalTimeZone, slotDuration);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot bizOperationalTimeSlot = (com.truecaller.bizmon.callMeBack.db.entity.BizOperationalTimeSlot) other;
        return this.operationalDay == bizOperationalTimeSlot.operationalDay && kotlin.jvm.internal.Intrinsics.b(this.operationalEndTime, bizOperationalTimeSlot.operationalEndTime) && kotlin.jvm.internal.Intrinsics.b(this.operationalStartTime, bizOperationalTimeSlot.operationalStartTime) && kotlin.jvm.internal.Intrinsics.b(this.operationalTimeZone, bizOperationalTimeSlot.operationalTimeZone) && this.slotDuration == bizOperationalTimeSlot.slotDuration;
    }

    public final int getOperationalDay() {
        return this.operationalDay;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperationalEndTime() {
        return this.operationalEndTime;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperationalStartTime() {
        return this.operationalStartTime;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperationalTimeZone() {
        return this.operationalTimeZone;
    }

    public final long getSlotDuration() {
        return this.slotDuration;
    }

    public int hashCode() {
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.operationalDay * 31, 31, this.operationalEndTime), 31, this.operationalStartTime), 31, this.operationalTimeZone);
        long j = this.slotDuration;
        return e + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.operationalDay;
        java.lang.String str = this.operationalEndTime;
        java.lang.String str2 = this.operationalStartTime;
        java.lang.String str3 = this.operationalTimeZone;
        long j = this.slotDuration;
        java.lang.StringBuilder r = qb.qux.r("BizOperationalTimeSlot(operationalDay=", i, ", operationalEndTime=", str, ", operationalStartTime=");
        bar.E(r, str2, ", operationalTimeZone=", str3, ", slotDuration=");
        return bar.n(j, ")", r);
    }
}
