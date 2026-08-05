package com.truecaller.bizmon.callMeBack.db.entity;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;", "", "slot", "", "expires", "", "fromTime", "toTime", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getSlot", "()Ljava/lang/String;", "getExpires", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFromTime", "getToTime", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/truecaller/bizmon/callMeBack/db/entity/BizScheduledSlot;", "equals", "", "other", "hashCode", "", "toString", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class BizScheduledSlot {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long expires;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long fromTime;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String slot;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Long toTime;

    public BizScheduledSlot(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.Long l, @org.jetbrains.annotations.Nullable java.lang.Long l2, @org.jetbrains.annotations.Nullable java.lang.Long l3) {
        this.slot = str;
        this.expires = l;
        this.fromTime = l2;
        this.toTime = l3;
    }

    public static /* synthetic */ com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot copy$default(com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot, java.lang.String str, java.lang.Long l, java.lang.Long l2, java.lang.Long l3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bizScheduledSlot.slot;
        }
        if ((i & 2) != 0) {
            l = bizScheduledSlot.expires;
        }
        if ((i & 4) != 0) {
            l2 = bizScheduledSlot.fromTime;
        }
        if ((i & 8) != 0) {
            l3 = bizScheduledSlot.toTime;
        }
        return bizScheduledSlot.copy(str, l, l2, l3);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSlot() {
        return this.slot;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Long getExpires() {
        return this.expires;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getFromTime() {
        return this.fromTime;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Long getToTime() {
        return this.toTime;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot copy(@org.jetbrains.annotations.Nullable java.lang.String slot, @org.jetbrains.annotations.Nullable java.lang.Long expires, @org.jetbrains.annotations.Nullable java.lang.Long fromTime, @org.jetbrains.annotations.Nullable java.lang.Long toTime) {
        return new com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot(slot, expires, fromTime, toTime);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot)) {
            return false;
        }
        com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot bizScheduledSlot = (com.truecaller.bizmon.callMeBack.db.entity.BizScheduledSlot) other;
        return kotlin.jvm.internal.Intrinsics.b(this.slot, bizScheduledSlot.slot) && kotlin.jvm.internal.Intrinsics.b(this.expires, bizScheduledSlot.expires) && kotlin.jvm.internal.Intrinsics.b(this.fromTime, bizScheduledSlot.fromTime) && kotlin.jvm.internal.Intrinsics.b(this.toTime, bizScheduledSlot.toTime);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getExpires() {
        return this.expires;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getFromTime() {
        return this.fromTime;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSlot() {
        return this.slot;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getToTime() {
        return this.toTime;
    }

    public int hashCode() {
        java.lang.String str = this.slot;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Long l = this.expires;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        java.lang.Long l2 = this.fromTime;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Long l3 = this.toTime;
        return hashCode3 + (l3 != null ? l3.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "BizScheduledSlot(slot=" + this.slot + ", expires=" + this.expires + ", fromTime=" + this.fromTime + ", toTime=" + this.toTime + ")";
    }
}
