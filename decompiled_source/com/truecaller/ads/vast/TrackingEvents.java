package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0001\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/vast/TrackingEvents;", "Landroid/os/Parcelable;", "tracking", "", "Lcom/truecaller/ads/vast/Tracking;", "<init>", "(Ljava/util/List;)V", "getTracking", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class TrackingEvents implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.vast.TrackingEvents> CREATOR = new rz0.b0(20);

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Tracking> tracking;

    public TrackingEvents(@ak.f0("Tracking") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Tracking> list) {
        this.tracking = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.TrackingEvents copy$default(com.truecaller.ads.vast.TrackingEvents trackingEvents, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = trackingEvents.tracking;
        }
        return trackingEvents.copy(list);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Tracking> component1() {
        return this.tracking;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.TrackingEvents copy(@ak.f0("Tracking") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Tracking> tracking) {
        return new com.truecaller.ads.vast.TrackingEvents(tracking);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.ads.vast.TrackingEvents) && kotlin.jvm.internal.Intrinsics.b(this.tracking, ((com.truecaller.ads.vast.TrackingEvents) other).tracking);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Tracking> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        java.util.List<com.truecaller.ads.vast.Tracking> list = this.tracking;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.k("TrackingEvents(tracking=", ")", this.tracking);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        java.util.List<com.truecaller.ads.vast.Tracking> list = this.tracking;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        java.util.Iterator<com.truecaller.ads.vast.Tracking> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
