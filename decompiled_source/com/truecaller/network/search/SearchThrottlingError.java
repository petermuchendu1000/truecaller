package com.truecaller.network.search;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/network/search/SearchThrottlingError;", "", "timeoutSeconds", "", "searchTypes", "", "", "<init>", "(JLjava/util/List;)V", "getTimeoutSeconds", "()J", "getSearchTypes", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class SearchThrottlingError {
    public static final int $stable = 8;

    @bw.qux("searchTypes")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Integer> searchTypes;

    @bw.qux("timeoutSeconds")
    private final long timeoutSeconds;

    public SearchThrottlingError(long j, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "searchTypes");
        this.timeoutSeconds = j;
        this.searchTypes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.network.search.SearchThrottlingError copy$default(com.truecaller.network.search.SearchThrottlingError searchThrottlingError, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = searchThrottlingError.timeoutSeconds;
        }
        if ((i & 2) != 0) {
            list = searchThrottlingError.searchTypes;
        }
        return searchThrottlingError.copy(j, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> component2() {
        return this.searchTypes;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.network.search.SearchThrottlingError copy(long timeoutSeconds, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Integer> searchTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchTypes, "searchTypes");
        return new com.truecaller.network.search.SearchThrottlingError(timeoutSeconds, searchTypes);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.network.search.SearchThrottlingError)) {
            return false;
        }
        com.truecaller.network.search.SearchThrottlingError searchThrottlingError = (com.truecaller.network.search.SearchThrottlingError) other;
        return this.timeoutSeconds == searchThrottlingError.timeoutSeconds && kotlin.jvm.internal.Intrinsics.b(this.searchTypes, searchThrottlingError.searchTypes);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getSearchTypes() {
        return this.searchTypes;
    }

    public final long getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    public int hashCode() {
        long j = this.timeoutSeconds;
        return this.searchTypes.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "SearchThrottlingError(timeoutSeconds=" + this.timeoutSeconds + ", searchTypes=" + this.searchTypes + ")";
    }
}
