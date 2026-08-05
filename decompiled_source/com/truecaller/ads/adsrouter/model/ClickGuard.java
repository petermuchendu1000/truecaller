package com.truecaller.ads.adsrouter.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/ClickGuard;", "Landroid/os/Parcelable;", "row", "", "column", "toolTip", "", "unsafeCells", "", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "getRow", "()I", "getColumn", "getToolTip", "()Ljava/lang/String;", "getUnsafeCells", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class ClickGuard implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrouter.model.ClickGuard> CREATOR = new y02.t(10);
    private final int column;
    private final int row;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String toolTip;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> unsafeCells;

    public ClickGuard(int i, int i2, java.lang.String str, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, (i3 & 8) != 0 ? kotlin.collections.h0.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.adsrouter.model.ClickGuard copy$default(com.truecaller.ads.adsrouter.model.ClickGuard clickGuard, int i, int i2, java.lang.String str, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = clickGuard.row;
        }
        if ((i3 & 2) != 0) {
            i2 = clickGuard.column;
        }
        if ((i3 & 4) != 0) {
            str = clickGuard.toolTip;
        }
        if ((i3 & 8) != 0) {
            list = clickGuard.unsafeCells;
        }
        return clickGuard.copy(i, i2, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRow() {
        return this.row;
    }

    /* renamed from: component2, reason: from getter */
    public final int getColumn() {
        return this.column;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToolTip() {
        return this.toolTip;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component4() {
        return this.unsafeCells;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrouter.model.ClickGuard copy(int row, int column, @org.jetbrains.annotations.Nullable java.lang.String toolTip, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> unsafeCells) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCells, "unsafeCells");
        return new com.truecaller.ads.adsrouter.model.ClickGuard(row, column, toolTip, unsafeCells);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrouter.model.ClickGuard)) {
            return false;
        }
        com.truecaller.ads.adsrouter.model.ClickGuard clickGuard = (com.truecaller.ads.adsrouter.model.ClickGuard) other;
        return this.row == clickGuard.row && this.column == clickGuard.column && kotlin.jvm.internal.Intrinsics.b(this.toolTip, clickGuard.toolTip) && kotlin.jvm.internal.Intrinsics.b(this.unsafeCells, clickGuard.unsafeCells);
    }

    public final int getColumn() {
        return this.column;
    }

    public final int getRow() {
        return this.row;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getToolTip() {
        return this.toolTip;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getUnsafeCells() {
        return this.unsafeCells;
    }

    public int hashCode() {
        int i = ((this.row * 31) + this.column) * 31;
        java.lang.String str = this.toolTip;
        return this.unsafeCells.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.row;
        int i2 = this.column;
        return z0.a0.d(this.toolTip, ", unsafeCells=", ")", z0.a0.e(i, i2, "ClickGuard(row=", ", column=", ", toolTip="), this.unsafeCells);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.row);
        dest.writeInt(this.column);
        dest.writeString(this.toolTip);
        java.util.Iterator f = z0.a0.f(this.unsafeCells, dest);
        while (f.hasNext()) {
            dest.writeInt(((java.lang.Number) f.next()).intValue());
        }
    }

    public ClickGuard(int i, int i2, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "unsafeCells");
        this.row = i;
        this.column = i2;
        this.toolTip = str;
        this.unsafeCells = list;
    }
}
