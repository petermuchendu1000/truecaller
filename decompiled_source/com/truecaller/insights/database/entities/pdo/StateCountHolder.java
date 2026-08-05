package com.truecaller.insights.database.entities.pdo;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/insights/database/entities/pdo/StateCountHolder;", "", "state", "", com.truecaller.insights.database.models.analytics.AggregatedParserAnalytics.EVENT_COUNT, "", "<init>", "(Ljava/lang/String;I)V", "getState", "()Ljava/lang/String;", "getCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class StateCountHolder {
    private final int count;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;

    public StateCountHolder(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "state");
        this.state = str;
        this.count = i;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.pdo.StateCountHolder copy$default(com.truecaller.insights.database.entities.pdo.StateCountHolder stateCountHolder, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = stateCountHolder.state;
        }
        if ((i2 & 2) != 0) {
            i = stateCountHolder.count;
        }
        return stateCountHolder.copy(str, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.pdo.StateCountHolder copy(@org.jetbrains.annotations.NotNull java.lang.String state, int count) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "state");
        return new com.truecaller.insights.database.entities.pdo.StateCountHolder(state, count);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.pdo.StateCountHolder)) {
            return false;
        }
        com.truecaller.insights.database.entities.pdo.StateCountHolder stateCountHolder = (com.truecaller.insights.database.entities.pdo.StateCountHolder) other;
        return kotlin.jvm.internal.Intrinsics.b(this.state, stateCountHolder.state) && this.count == stateCountHolder.count;
    }

    public final int getCount() {
        return this.count;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + this.count;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("StateCountHolder(state=", this.count, this.state, ", count=", ")");
    }
}
