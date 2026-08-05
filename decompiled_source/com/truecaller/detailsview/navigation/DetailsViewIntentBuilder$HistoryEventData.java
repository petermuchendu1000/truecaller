package com.truecaller.detailsview.navigation;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0007J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"com/truecaller/detailsview/navigation/DetailsViewIntentBuilder$HistoryEventData", "Landroid/os/Parcelable;", "", "type", "<init>", "(Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$HistoryEventData;", "copy", "(Ljava/lang/Integer;)Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$HistoryEventData;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getType", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class DetailsViewIntentBuilder$HistoryEventData implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData> CREATOR = new ks2.bar(21);

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer type;

    public DetailsViewIntentBuilder$HistoryEventData(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.type = num;
    }

    public static /* synthetic */ com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData copy$default(com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData detailsViewIntentBuilder$HistoryEventData, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = detailsViewIntentBuilder$HistoryEventData.type;
        }
        return detailsViewIntentBuilder$HistoryEventData.copy(num);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData copy(@org.jetbrains.annotations.Nullable java.lang.Integer type) {
        return new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData(type);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData) && kotlin.jvm.internal.Intrinsics.b(this.type, ((com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$HistoryEventData) other).type);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getType() {
        return this.type;
    }

    public int hashCode() {
        java.lang.Integer num = this.type;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "HistoryEventData(type=" + this.type + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        java.lang.Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            z0.a0.j(dest, 1, num);
        }
    }
}
