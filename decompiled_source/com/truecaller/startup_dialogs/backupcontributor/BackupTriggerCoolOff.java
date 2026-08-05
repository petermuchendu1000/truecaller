package com.truecaller.startup_dialogs.backupcontributor;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/truecaller/startup_dialogs/backupcontributor/BackupTriggerCoolOff;", "", "trigger", "Lcom/truecaller/inappupdate/UpdateTrigger;", "count", "", "triggerTime", "", "versionCode", "<init>", "(Lcom/truecaller/inappupdate/UpdateTrigger;IJI)V", "getTrigger", "()Lcom/truecaller/inappupdate/UpdateTrigger;", "getCount", "()I", "getTriggerTime", "()J", "getVersionCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class BackupTriggerCoolOff {
    public static final int $stable = 0;
    private final int count;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.inappupdate.UpdateTrigger trigger;
    private final long triggerTime;
    private final int versionCode;

    public BackupTriggerCoolOff(@org.jetbrains.annotations.Nullable com.truecaller.inappupdate.UpdateTrigger updateTrigger, int i, long j, int i2) {
        this.trigger = updateTrigger;
        this.count = i;
        this.triggerTime = j;
        this.versionCode = i2;
    }

    public static /* synthetic */ com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff copy$default(com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff backupTriggerCoolOff, com.truecaller.inappupdate.UpdateTrigger updateTrigger, int i, long j, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            updateTrigger = backupTriggerCoolOff.trigger;
        }
        if ((i3 & 2) != 0) {
            i = backupTriggerCoolOff.count;
        }
        if ((i3 & 4) != 0) {
            j = backupTriggerCoolOff.triggerTime;
        }
        if ((i3 & 8) != 0) {
            i2 = backupTriggerCoolOff.versionCode;
        }
        int i4 = i2;
        return backupTriggerCoolOff.copy(updateTrigger, i, j, i4);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.inappupdate.UpdateTrigger getTrigger() {
        return this.trigger;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTriggerTime() {
        return this.triggerTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVersionCode() {
        return this.versionCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff copy(@org.jetbrains.annotations.Nullable com.truecaller.inappupdate.UpdateTrigger trigger, int count, long triggerTime, int versionCode) {
        return new com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff(trigger, count, triggerTime, versionCode);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff)) {
            return false;
        }
        com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff backupTriggerCoolOff = (com.truecaller.startup_dialogs.backupcontributor.BackupTriggerCoolOff) other;
        return this.trigger == backupTriggerCoolOff.trigger && this.count == backupTriggerCoolOff.count && this.triggerTime == backupTriggerCoolOff.triggerTime && this.versionCode == backupTriggerCoolOff.versionCode;
    }

    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.inappupdate.UpdateTrigger getTrigger() {
        return this.trigger;
    }

    public final long getTriggerTime() {
        return this.triggerTime;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        int hashCode;
        com.truecaller.inappupdate.UpdateTrigger updateTrigger = this.trigger;
        if (updateTrigger == null) {
            hashCode = 0;
        } else {
            hashCode = updateTrigger.hashCode();
        }
        int i = ((hashCode * 31) + this.count) * 31;
        long j = this.triggerTime;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.versionCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.inappupdate.UpdateTrigger updateTrigger = this.trigger;
        int i = this.count;
        long j = this.triggerTime;
        int i2 = this.versionCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackupTriggerCoolOff(trigger=");
        sb.append(updateTrigger);
        sb.append(", count=");
        sb.append(i);
        sb.append(", triggerTime=");
        h8.s0.y(i2, j, ", versionCode=", sb);
        sb.append(")");
        return sb.toString();
    }
}
