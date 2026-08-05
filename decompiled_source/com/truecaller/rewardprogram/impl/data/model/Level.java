package com.truecaller.rewardprogram.impl.data.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/rewardprogram/impl/data/model/Level;", "", "levelId", "", "totalXp", "", "<init>", "(JI)V", "getLevelId", "()J", "getTotalXp", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class Level {
    public static final int $stable = 0;
    private final long levelId;
    private final int totalXp;

    public Level(long j, int i) {
        this.levelId = j;
        this.totalXp = i;
    }

    public static /* synthetic */ com.truecaller.rewardprogram.impl.data.model.Level copy$default(com.truecaller.rewardprogram.impl.data.model.Level level, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = level.levelId;
        }
        if ((i2 & 2) != 0) {
            i = level.totalXp;
        }
        return level.copy(j, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getLevelId() {
        return this.levelId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalXp() {
        return this.totalXp;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.rewardprogram.impl.data.model.Level copy(long levelId, int totalXp) {
        return new com.truecaller.rewardprogram.impl.data.model.Level(levelId, totalXp);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.rewardprogram.impl.data.model.Level)) {
            return false;
        }
        com.truecaller.rewardprogram.impl.data.model.Level level = (com.truecaller.rewardprogram.impl.data.model.Level) other;
        return this.levelId == level.levelId && this.totalXp == level.totalXp;
    }

    public final long getLevelId() {
        return this.levelId;
    }

    public final int getTotalXp() {
        return this.totalXp;
    }

    public int hashCode() {
        long j = this.levelId;
        return (((int) (j ^ (j >>> 32))) * 31) + this.totalXp;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder e = com.google.android.gms.internal.ads.yj.e(this.totalXp, "Level(levelId=", ", totalXp=", this.levelId);
        e.append(")");
        return e.toString();
    }
}
