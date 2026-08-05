package com.truecaller.premium.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"com/truecaller/premium/data/PurchaseSourceCache$SourceEntry", "", "", "source", "", "timestamp", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "Lcom/truecaller/premium/data/PurchaseSourceCache$SourceEntry;", "copy", "(Ljava/lang/String;J)Lcom/truecaller/premium/data/PurchaseSourceCache$SourceEntry;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSource", "J", "getTimestamp", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class PurchaseSourceCache$SourceEntry {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String source;
    private final long timestamp;

    public PurchaseSourceCache$SourceEntry(@org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "source");
        this.source = str;
        this.timestamp = j;
    }

    public static /* synthetic */ com.truecaller.premium.data.PurchaseSourceCache$SourceEntry copy$default(com.truecaller.premium.data.PurchaseSourceCache$SourceEntry purchaseSourceCache$SourceEntry, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = purchaseSourceCache$SourceEntry.source;
        }
        if ((i & 2) != 0) {
            j = purchaseSourceCache$SourceEntry.timestamp;
        }
        return purchaseSourceCache$SourceEntry.copy(str, j);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.premium.data.PurchaseSourceCache$SourceEntry copy(@org.jetbrains.annotations.NotNull java.lang.String source, long timestamp) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        return new com.truecaller.premium.data.PurchaseSourceCache$SourceEntry(source, timestamp);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.premium.data.PurchaseSourceCache$SourceEntry)) {
            return false;
        }
        com.truecaller.premium.data.PurchaseSourceCache$SourceEntry purchaseSourceCache$SourceEntry = (com.truecaller.premium.data.PurchaseSourceCache$SourceEntry) other;
        return kotlin.jvm.internal.Intrinsics.b(this.source, purchaseSourceCache$SourceEntry.source) && this.timestamp == purchaseSourceCache$SourceEntry.timestamp;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSource() {
        return this.source;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        long j = this.timestamp;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("SourceEntry(source=", this.source, ", timestamp=", this.timestamp);
        q.append(")");
        return q.toString();
    }
}
