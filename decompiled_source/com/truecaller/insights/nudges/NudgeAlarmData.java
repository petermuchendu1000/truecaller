package com.truecaller.insights.nudges;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0006J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, d2 = {"Lcom/truecaller/insights/nudges/NudgeAlarmData;", "Landroid/os/Parcelable;", "msgIds", "", "", "alarmId", "", "nudgeTs", "conversationId", "<init>", "(Ljava/util/List;IJJ)V", "getMsgIds", "()Ljava/util/List;", "getAlarmId", "()I", "getNudgeTs", "()J", "getConversationId", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class NudgeAlarmData implements android.os.Parcelable {

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.insights.nudges.NudgeAlarmData> CREATOR = new om0.bar(18);
    private final int alarmId;
    private final long conversationId;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Long> msgIds;
    private final long nudgeTs;

    public NudgeAlarmData(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Long> list, int i, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "msgIds");
        this.msgIds = list;
        this.alarmId = i;
        this.nudgeTs = j;
        this.conversationId = j2;
    }

    public static /* synthetic */ com.truecaller.insights.nudges.NudgeAlarmData copy$default(com.truecaller.insights.nudges.NudgeAlarmData nudgeAlarmData, java.util.List list, int i, long j, long j2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = nudgeAlarmData.msgIds;
        }
        if ((i2 & 2) != 0) {
            i = nudgeAlarmData.alarmId;
        }
        if ((i2 & 4) != 0) {
            j = nudgeAlarmData.nudgeTs;
        }
        if ((i2 & 8) != 0) {
            j2 = nudgeAlarmData.conversationId;
        }
        long j3 = j2;
        return nudgeAlarmData.copy(list, i, j, j3);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> component1() {
        return this.msgIds;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAlarmId() {
        return this.alarmId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getNudgeTs() {
        return this.nudgeTs;
    }

    /* renamed from: component4, reason: from getter */
    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.nudges.NudgeAlarmData copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Long> msgIds, int alarmId, long nudgeTs, long conversationId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msgIds, "msgIds");
        return new com.truecaller.insights.nudges.NudgeAlarmData(msgIds, alarmId, nudgeTs, conversationId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.nudges.NudgeAlarmData)) {
            return false;
        }
        com.truecaller.insights.nudges.NudgeAlarmData nudgeAlarmData = (com.truecaller.insights.nudges.NudgeAlarmData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.msgIds, nudgeAlarmData.msgIds) && this.alarmId == nudgeAlarmData.alarmId && this.nudgeTs == nudgeAlarmData.nudgeTs && this.conversationId == nudgeAlarmData.conversationId;
    }

    public final int getAlarmId() {
        return this.alarmId;
    }

    public final long getConversationId() {
        return this.conversationId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Long> getMsgIds() {
        return this.msgIds;
    }

    public final long getNudgeTs() {
        return this.nudgeTs;
    }

    public int hashCode() {
        int hashCode = ((this.msgIds.hashCode() * 31) + this.alarmId) * 31;
        long j = this.nudgeTs;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.conversationId;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.Long> list = this.msgIds;
        int i = this.alarmId;
        long j = this.nudgeTs;
        long j2 = this.conversationId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NudgeAlarmData(msgIds=");
        sb.append(list);
        sb.append(", alarmId=");
        sb.append(i);
        sb.append(", nudgeTs=");
        sb.append(j);
        return d4.t.o(sb, j2, ", conversationId=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        java.util.Iterator f = z0.a0.f(this.msgIds, dest);
        while (f.hasNext()) {
            dest.writeLong(((java.lang.Number) f.next()).longValue());
        }
        dest.writeInt(this.alarmId);
        dest.writeLong(this.nudgeTs);
        dest.writeLong(this.conversationId);
    }

    public /* synthetic */ NudgeAlarmData(java.util.List list, int i, long j, long j2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, j, (i2 & 8) != 0 ? -1L : j2);
    }
}
