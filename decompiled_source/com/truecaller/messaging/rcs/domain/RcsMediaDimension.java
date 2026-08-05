package com.truecaller.messaging.rcs.domain;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/messaging/rcs/domain/RcsMediaDimension;", "", "width", "", "height", "<init>", "(JJ)V", "getWidth", "()J", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RcsMediaDimension {
    public static final int $stable = 0;
    private final long height;
    private final long width;

    public RcsMediaDimension(long j, long j2) {
        this.width = j;
        this.height = j2;
    }

    public static /* synthetic */ com.truecaller.messaging.rcs.domain.RcsMediaDimension copy$default(com.truecaller.messaging.rcs.domain.RcsMediaDimension rcsMediaDimension, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = rcsMediaDimension.width;
        }
        if ((i & 2) != 0) {
            j2 = rcsMediaDimension.height;
        }
        return rcsMediaDimension.copy(j, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final long getHeight() {
        return this.height;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.rcs.domain.RcsMediaDimension copy(long width, long height) {
        return new com.truecaller.messaging.rcs.domain.RcsMediaDimension(width, height);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.rcs.domain.RcsMediaDimension)) {
            return false;
        }
        com.truecaller.messaging.rcs.domain.RcsMediaDimension rcsMediaDimension = (com.truecaller.messaging.rcs.domain.RcsMediaDimension) other;
        return this.width == rcsMediaDimension.width && this.height == rcsMediaDimension.height;
    }

    public final long getHeight() {
        return this.height;
    }

    public final long getWidth() {
        return this.width;
    }

    public int hashCode() {
        long j = this.width;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.height;
        return i + ((int) ((j2 >>> 32) ^ j2));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.n(this.height, ")", h0.b.T(this.width, "RcsMediaDimension(width=", ", height="));
    }
}
