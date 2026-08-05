package com.truecaller.cloudtelephony.callrecording.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/data/RecordingNotificationSchedule;", "Landroid/os/Parcelable;", "frequency", "", "durationHours", "", "<init>", "(IJ)V", "getFrequency", "()I", "getDurationHours", "()J", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class RecordingNotificationSchedule implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule> CREATOR = new rz0.b0(1);
    private final long durationHours;
    private final int frequency;

    public RecordingNotificationSchedule() {
        this(0, 0L, 3, null);
    }

    public static /* synthetic */ com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule copy$default(com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule recordingNotificationSchedule, int i, long j, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = recordingNotificationSchedule.frequency;
        }
        if ((i2 & 2) != 0) {
            j = recordingNotificationSchedule.durationHours;
        }
        return recordingNotificationSchedule.copy(i, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFrequency() {
        return this.frequency;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDurationHours() {
        return this.durationHours;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule copy(int frequency, long durationHours) {
        return new com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule(frequency, durationHours);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule)) {
            return false;
        }
        com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule recordingNotificationSchedule = (com.truecaller.cloudtelephony.callrecording.data.RecordingNotificationSchedule) other;
        return this.frequency == recordingNotificationSchedule.frequency && this.durationHours == recordingNotificationSchedule.durationHours;
    }

    public final long getDurationHours() {
        return this.durationHours;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public int hashCode() {
        int i = this.frequency * 31;
        long j = this.durationHours;
        return i + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder o = com.appsflyer.internal.e.o(this.frequency, "RecordingNotificationSchedule(frequency=", ", durationHours=", this.durationHours);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.frequency);
        dest.writeLong(this.durationHours);
    }

    public RecordingNotificationSchedule(int i, long j) {
        this.frequency = i;
        this.durationHours = j;
    }

    public /* synthetic */ RecordingNotificationSchedule(int i, long j, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i, (i2 & 2) != 0 ? 48L : j);
    }
}
