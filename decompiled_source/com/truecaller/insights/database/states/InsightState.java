package com.truecaller.insights.database.states;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/database/states/InsightState;", "", "owner", "", "lastUpdatedAt", "Ljava/util/Date;", "lastUpdatedData", "createdAt", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;)V", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "getLastUpdatedAt", "()Ljava/util/Date;", "setLastUpdatedAt", "(Ljava/util/Date;)V", "getLastUpdatedData", "setLastUpdatedData", "getCreatedAt", "setCreatedAt", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightState {

    @org.jetbrains.annotations.NotNull
    private java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private java.util.Date lastUpdatedAt;

    @org.jetbrains.annotations.Nullable
    private java.lang.String lastUpdatedData;

    @org.jetbrains.annotations.NotNull
    private java.lang.String owner;

    public InsightState() {
        this(null, null, null, null, 15, null);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastUpdatedData() {
        return this.lastUpdatedData;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOwner() {
        return this.owner;
    }

    public final void setCreatedAt(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final void setLastUpdatedAt(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.lastUpdatedAt = date;
    }

    public final void setLastUpdatedData(@org.jetbrains.annotations.Nullable java.lang.String str) {
        this.lastUpdatedData = str;
    }

    public final void setOwner(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.owner = str;
    }

    public InsightState(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.Date date, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.util.Date date2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "lastUpdatedAt");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date2, "createdAt");
        this.owner = str;
        this.lastUpdatedAt = date;
        this.lastUpdatedData = str2;
        this.createdAt = date2;
    }

    public /* synthetic */ InsightState(java.lang.String str, java.util.Date date, java.lang.String str2, java.util.Date date2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new java.util.Date(0L) : date, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new java.util.Date() : date2);
    }
}
