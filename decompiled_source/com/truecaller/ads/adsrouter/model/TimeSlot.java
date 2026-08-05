package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/truecaller/ads/adsrouter/model/TimeSlot;", "Landroid/os/Parcelable;", "startingHour", "", "startingMinutes", "endingHour", "endingMinutes", "<init>", "(IIII)V", "getStartingHour", "()I", "getStartingMinutes", "getEndingHour", "getEndingMinutes", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TimeSlot implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.TimeSlot> CREATOR = new y02.t(19);
    private final int endingHour;
    private final int endingMinutes;
    private final int startingHour;
    private final int startingMinutes;

    public TimeSlot(int i, int i2, int i3, int i4) {
        this.startingHour = i;
        this.startingMinutes = i2;
        this.endingHour = i3;
        this.endingMinutes = i4;
    }

    public static /* synthetic */ com.truecaller.ads.adsrouter.model.TimeSlot copy$default(com.truecaller.ads.adsrouter.model.TimeSlot timeSlot, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = timeSlot.startingHour;
        }
        if ((i5 & 2) != 0) {
            i2 = timeSlot.startingMinutes;
        }
        if ((i5 & 4) != 0) {
            i3 = timeSlot.endingHour;
        }
        if ((i5 & 8) != 0) {
            i4 = timeSlot.endingMinutes;
        }
        return timeSlot.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStartingHour() {
        return this.startingHour;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartingMinutes() {
        return this.startingMinutes;
    }

    /* renamed from: component3, reason: from getter */
    public final int getEndingHour() {
        return this.endingHour;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEndingMinutes() {
        return this.endingMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.TimeSlot copy(int startingHour, int startingMinutes, int endingHour, int endingMinutes) {
        return new com.truecaller.ads.adsrouter.model.TimeSlot(startingHour, startingMinutes, endingHour, endingMinutes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.TimeSlot)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.TimeSlot timeSlot = (com.truecaller.ads.adsrouter.model.TimeSlot) other;
        return this.startingHour == timeSlot.startingHour && this.startingMinutes == timeSlot.startingMinutes && this.endingHour == timeSlot.endingHour && this.endingMinutes == timeSlot.endingMinutes;
    }

    public final int getEndingHour() {
        return this.endingHour;
    }

    public final int getEndingMinutes() {
        return this.endingMinutes;
    }

    public final int getStartingHour() {
        return this.startingHour;
    }

    public final int getStartingMinutes() {
        return this.startingMinutes;
    }

    public int hashCode() {
        return (((((this.startingHour * 31) + this.startingMinutes) * 31) + this.endingHour) * 31) + this.endingMinutes;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return h8.s0.l(this.endingHour, this.endingMinutes, ", endingMinutes=", ")", z0.a0.e(this.startingHour, this.startingMinutes, "TimeSlot(startingHour=", ", startingMinutes=", ", endingHour="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.startingHour);
        dest.writeInt(this.startingMinutes);
        dest.writeInt(this.endingHour);
        dest.writeInt(this.endingMinutes);
    }
}
