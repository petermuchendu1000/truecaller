package com.truecaller.insights.database.models.enrichment.linking;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/database/models/enrichment/linking/LinkPruneMap;", "", "parentId", "", "childId", "linkType", "", "createdAt", "Ljava/util/Date;", "<init>", "(JJLjava/lang/String;Ljava/util/Date;)V", "getParentId", "()J", "setParentId", "(J)V", "getChildId", "setChildId", "getLinkType", "()Ljava/lang/String;", "setLinkType", "(Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LinkPruneMap {
    private long childId;

    @org.jetbrains.annotations.NotNull
    private java.util.Date createdAt;

    @org.jetbrains.annotations.NotNull
    private java.lang.String linkType;
    private long parentId;

    public LinkPruneMap() {
        this(0L, 0L, null, null, 15, null);
    }

    public final long getChildId() {
        return this.childId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLinkType() {
        return this.linkType;
    }

    public final long getParentId() {
        return this.parentId;
    }

    public final void setChildId(long j) {
        this.childId = j;
    }

    public final void setCreatedAt(@org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.createdAt = date;
    }

    public final void setLinkType(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.linkType = str;
    }

    public final void setParentId(long j) {
        this.parentId = j;
    }

    public LinkPruneMap(long j, long j2, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "linkType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "createdAt");
        this.parentId = j;
        this.childId = j2;
        this.linkType = str;
        this.createdAt = date;
    }

    public LinkPruneMap(long j, long j2, java.lang.String str, java.util.Date date, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? -1L : j2, (i & 4) != 0 ? "NO_LINK" : str, (i & 8) != 0 ? new java.util.Date() : date);
    }
}
