package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/vast/Tracking;", "Landroid/os/Parcelable;", "value", "", "event", "offset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getEvent", "getOffset", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Tracking implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.vast.Tracking> CREATOR = new rz0.b0(19);

    @org.jetbrains.annotations.Nullable
    private final java.lang.String event;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String offset;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String value;

    public Tracking(@ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("event") @org.jetbrains.annotations.Nullable java.lang.String str2, @ak.f0("offset") @org.jetbrains.annotations.Nullable java.lang.String str3) {
        this.value = str;
        this.event = str2;
        this.offset = str3;
    }

    public static /* synthetic */ com.truecaller.ads.vast.Tracking copy$default(com.truecaller.ads.vast.Tracking tracking, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tracking.value;
        }
        if ((i & 2) != 0) {
            str2 = tracking.event;
        }
        if ((i & 4) != 0) {
            str3 = tracking.offset;
        }
        return tracking.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEvent() {
        return this.event;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOffset() {
        return this.offset;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Tracking copy(@ak.f0("value") @hl.b @org.jetbrains.annotations.Nullable java.lang.String value, @ak.f0("event") @org.jetbrains.annotations.Nullable java.lang.String event, @ak.f0("offset") @org.jetbrains.annotations.Nullable java.lang.String offset) {
        return new com.truecaller.ads.vast.Tracking(value, event, offset);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Tracking)) {
            return false;
        }
        com.truecaller.ads.vast.Tracking tracking = (com.truecaller.ads.vast.Tracking) other;
        return kotlin.jvm.internal.Intrinsics.b(this.value, tracking.value) && kotlin.jvm.internal.Intrinsics.b(this.event, tracking.event) && kotlin.jvm.internal.Intrinsics.b(this.offset, tracking.offset);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEvent() {
        return this.event;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOffset() {
        return this.offset;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        java.lang.String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.event;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.offset;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.offset, ")", ro0.f.E("Tracking(value=", this.value, ", event=", this.event, ", offset="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.value);
        dest.writeString(this.event);
        dest.writeString(this.offset);
    }
}
