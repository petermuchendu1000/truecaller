package com.truecaller.ads.domain.core.clickguard;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"com/truecaller/ads/domain/core/clickguard/AdClickGuardConfigProviderImpl$ClickGuardJson", "", "", "row", "column", "", "toolTip", "", "unsafeCells", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "Lcom/truecaller/ads/domain/core/clickguard/AdClickGuardConfigProviderImpl$ClickGuardJson;", "copy", "(IILjava/lang/String;Ljava/util/List;)Lcom/truecaller/ads/domain/core/clickguard/AdClickGuardConfigProviderImpl$ClickGuardJson;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRow", "getColumn", "Ljava/lang/String;", "getToolTip", "Ljava/util/List;", "getUnsafeCells", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
final /* data */ class AdClickGuardConfigProviderImpl$ClickGuardJson {
    private final int column;
    private final int row;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String toolTip;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> unsafeCells;

    public AdClickGuardConfigProviderImpl$ClickGuardJson() {
        this(0, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson copy$default(com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson adClickGuardConfigProviderImpl$ClickGuardJson, int i, int i2, java.lang.String str, java.util.List list, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = adClickGuardConfigProviderImpl$ClickGuardJson.row;
        }
        if ((i3 & 2) != 0) {
            i2 = adClickGuardConfigProviderImpl$ClickGuardJson.column;
        }
        if ((i3 & 4) != 0) {
            str = adClickGuardConfigProviderImpl$ClickGuardJson.toolTip;
        }
        if ((i3 & 8) != 0) {
            list = adClickGuardConfigProviderImpl$ClickGuardJson.unsafeCells;
        }
        return adClickGuardConfigProviderImpl$ClickGuardJson.copy(i, i2, str, list);
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
    public final com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson copy(int row, int column, @org.jetbrains.annotations.Nullable java.lang.String toolTip, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> unsafeCells) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unsafeCells, "unsafeCells");
        return new com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson(row, column, toolTip, unsafeCells);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson)) {
            return false;
        }
        com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson adClickGuardConfigProviderImpl$ClickGuardJson = (com.truecaller.ads.domain.core.clickguard.AdClickGuardConfigProviderImpl$ClickGuardJson) other;
        return this.row == adClickGuardConfigProviderImpl$ClickGuardJson.row && this.column == adClickGuardConfigProviderImpl$ClickGuardJson.column && kotlin.jvm.internal.Intrinsics.b(this.toolTip, adClickGuardConfigProviderImpl$ClickGuardJson.toolTip) && kotlin.jvm.internal.Intrinsics.b(this.unsafeCells, adClickGuardConfigProviderImpl$ClickGuardJson.unsafeCells);
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
        return z0.a0.d(this.toolTip, ", unsafeCells=", ")", z0.a0.e(i, i2, "ClickGuardJson(row=", ", column=", ", toolTip="), this.unsafeCells);
    }

    public AdClickGuardConfigProviderImpl$ClickGuardJson(int i, int i2, @org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "unsafeCells");
        this.row = i;
        this.column = i2;
        this.toolTip = str;
        this.unsafeCells = list;
    }

    public AdClickGuardConfigProviderImpl$ClickGuardJson(int i, int i2, java.lang.String str, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? kotlin.collections.h0.a : list);
    }
}
