package com.truecaller.bizmon_call_kit.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/truecaller/bizmon_call_kit/util/BizMonCallKitConfig;", "", "maxDaysOfDataStore", "", "maxRowsOfDataStore", "", "paginationLimit", "<init>", "(IJI)V", "getMaxDaysOfDataStore", "()I", "getMaxRowsOfDataStore", "()J", "getPaginationLimit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizMonCallKitConfig {
    public static final int $stable = 0;
    private final int maxDaysOfDataStore;
    private final long maxRowsOfDataStore;
    private final int paginationLimit;

    public BizMonCallKitConfig(int i, long j, int i2) {
        this.maxDaysOfDataStore = i;
        this.maxRowsOfDataStore = j;
        this.paginationLimit = i2;
    }

    public static /* synthetic */ com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig copy$default(com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig bizMonCallKitConfig, int i, long j, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = bizMonCallKitConfig.maxDaysOfDataStore;
        }
        if ((i3 & 2) != 0) {
            j = bizMonCallKitConfig.maxRowsOfDataStore;
        }
        if ((i3 & 4) != 0) {
            i2 = bizMonCallKitConfig.paginationLimit;
        }
        return bizMonCallKitConfig.copy(i, j, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxDaysOfDataStore() {
        return this.maxDaysOfDataStore;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMaxRowsOfDataStore() {
        return this.maxRowsOfDataStore;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPaginationLimit() {
        return this.paginationLimit;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig copy(int maxDaysOfDataStore, long maxRowsOfDataStore, int paginationLimit) {
        return new com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig(maxDaysOfDataStore, maxRowsOfDataStore, paginationLimit);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig)) {
            return false;
        }
        com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig bizMonCallKitConfig = (com.truecaller.bizmon_call_kit.util.BizMonCallKitConfig) other;
        return this.maxDaysOfDataStore == bizMonCallKitConfig.maxDaysOfDataStore && this.maxRowsOfDataStore == bizMonCallKitConfig.maxRowsOfDataStore && this.paginationLimit == bizMonCallKitConfig.paginationLimit;
    }

    public final int getMaxDaysOfDataStore() {
        return this.maxDaysOfDataStore;
    }

    public final long getMaxRowsOfDataStore() {
        return this.maxRowsOfDataStore;
    }

    public final int getPaginationLimit() {
        return this.paginationLimit;
    }

    public int hashCode() {
        int i = this.maxDaysOfDataStore * 31;
        long j = this.maxRowsOfDataStore;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + this.paginationLimit;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.maxDaysOfDataStore;
        long j = this.maxRowsOfDataStore;
        return t.c.q(com.appsflyer.internal.e.o(i, "BizMonCallKitConfig(maxDaysOfDataStore=", ", maxRowsOfDataStore=", j), ", paginationLimit=", this.paginationLimit, ")");
    }
}
