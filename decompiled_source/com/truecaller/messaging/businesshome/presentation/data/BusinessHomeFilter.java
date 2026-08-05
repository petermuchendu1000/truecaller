package com.truecaller.messaging.businesshome.presentation.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/truecaller/messaging/businesshome/presentation/data/BusinessHomeFilter;", "Landroid/os/Parcelable;", "filterType", "Lcom/truecaller/messaging/businesshome/presentation/data/BusinessHomeFilterType;", "unreadCount", "", "totalCount", "<init>", "(Lcom/truecaller/messaging/businesshome/presentation/data/BusinessHomeFilterType;II)V", "getFilterType", "()Lcom/truecaller/messaging/businesshome/presentation/data/BusinessHomeFilterType;", "getUnreadCount", "()I", "getTotalCount", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BusinessHomeFilter implements android.os.Parcelable {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter> CREATOR = new hn.bar(4);

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType filterType;
    private final int totalCount;
    private final int unreadCount;

    public BusinessHomeFilter(@org.jetbrains.annotations.NotNull com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType businessHomeFilterType, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessHomeFilterType, "filterType");
        this.filterType = businessHomeFilterType;
        this.unreadCount = i;
        this.totalCount = i2;
    }

    public static /* synthetic */ com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter copy$default(com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter businessHomeFilter, com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType businessHomeFilterType, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            businessHomeFilterType = businessHomeFilter.filterType;
        }
        if ((i3 & 2) != 0) {
            i = businessHomeFilter.unreadCount;
        }
        if ((i3 & 4) != 0) {
            i2 = businessHomeFilter.totalCount;
        }
        return businessHomeFilter.copy(businessHomeFilterType, i, i2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType getFilterType() {
        return this.filterType;
    }

    /* renamed from: component2, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter copy(@org.jetbrains.annotations.NotNull com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType filterType, int unreadCount, int totalCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter(filterType, unreadCount, totalCount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter)) {
            return false;
        }
        com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter businessHomeFilter = (com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilter) other;
        return this.filterType == businessHomeFilter.filterType && this.unreadCount == businessHomeFilter.unreadCount && this.totalCount == businessHomeFilter.totalCount;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType getFilterType() {
        return this.filterType;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        return (((this.filterType.hashCode() * 31) + this.unreadCount) * 31) + this.totalCount;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType businessHomeFilterType = this.filterType;
        int i = this.unreadCount;
        int i2 = this.totalCount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessHomeFilter(filterType=");
        sb.append(businessHomeFilterType);
        sb.append(", unreadCount=");
        sb.append(i);
        sb.append(", totalCount=");
        return bar.m(i2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        this.filterType.writeToParcel(dest, flags);
        dest.writeInt(this.unreadCount);
        dest.writeInt(this.totalCount);
    }

    public /* synthetic */ BusinessHomeFilter(com.truecaller.messaging.businesshome.presentation.data.BusinessHomeFilterType businessHomeFilterType, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(businessHomeFilterType, i, (i3 & 4) != 0 ? 0 : i2);
    }
}
