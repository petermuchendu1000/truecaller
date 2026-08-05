package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/truecaller/insights/database/entities/llm/LLmSenderPatternRefreshEntity;", "", "id", "", "patternSenderID", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getPatternSenderID", "()Ljava/lang/String;", "setPatternSenderID", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class LLmSenderPatternRefreshEntity {
    private long id;

    @org.jetbrains.annotations.NotNull
    private java.lang.String patternSenderID;

    public LLmSenderPatternRefreshEntity() {
        this(0L, null, 3, null);
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity copy$default(com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity lLmSenderPatternRefreshEntity, long j, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = lLmSenderPatternRefreshEntity.id;
        }
        if ((i & 2) != 0) {
            str = lLmSenderPatternRefreshEntity.patternSenderID;
        }
        return lLmSenderPatternRefreshEntity.copy(j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPatternSenderID() {
        return this.patternSenderID;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity copy(long id, @org.jetbrains.annotations.NotNull java.lang.String patternSenderID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(patternSenderID, "patternSenderID");
        return new com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity(id, patternSenderID);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity lLmSenderPatternRefreshEntity = (com.truecaller.insights.database.entities.llm.LLmSenderPatternRefreshEntity) other;
        return this.id == lLmSenderPatternRefreshEntity.id && kotlin.jvm.internal.Intrinsics.b(this.patternSenderID, lLmSenderPatternRefreshEntity.patternSenderID);
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPatternSenderID() {
        return this.patternSenderID;
    }

    public int hashCode() {
        long j = this.id;
        return this.patternSenderID.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setPatternSenderID(@org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.patternSenderID = str;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("LLmSenderPatternRefreshEntity(id=", this.id, ", patternSenderID=", this.patternSenderID);
        p.append(")");
        return p.toString();
    }

    public LLmSenderPatternRefreshEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "patternSenderID");
        this.id = j;
        this.patternSenderID = str;
    }

    public /* synthetic */ LLmSenderPatternRefreshEntity(long j, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str);
    }
}
