package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/database/entities/llm/InsightsLlmMetaDataEntity;", "", "senderId", "", "l1Frequency", "", "<init>", "(Ljava/lang/String;D)V", "getSenderId", "()Ljava/lang/String;", "getL1Frequency", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsLlmMetaDataEntity {
    private final double l1Frequency;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String senderId;

    public InsightsLlmMetaDataEntity(@org.jetbrains.annotations.NotNull java.lang.String str, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "senderId");
        this.senderId = str;
        this.l1Frequency = d;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity copy$default(com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity insightsLlmMetaDataEntity, java.lang.String str, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = insightsLlmMetaDataEntity.senderId;
        }
        if ((i & 2) != 0) {
            d = insightsLlmMetaDataEntity.l1Frequency;
        }
        return insightsLlmMetaDataEntity.copy(str, d);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component2, reason: from getter */
    public final double getL1Frequency() {
        return this.l1Frequency;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity copy(@org.jetbrains.annotations.NotNull java.lang.String senderId, double l1Frequency) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
        return new com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity(senderId, l1Frequency);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity insightsLlmMetaDataEntity = (com.truecaller.insights.database.entities.llm.InsightsLlmMetaDataEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.senderId, insightsLlmMetaDataEntity.senderId) && java.lang.Double.compare(this.l1Frequency, insightsLlmMetaDataEntity.l1Frequency) == 0;
    }

    public final double getL1Frequency() {
        return this.l1Frequency;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    public int hashCode() {
        int hashCode = this.senderId.hashCode() * 31;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.l1Frequency);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "InsightsLlmMetaDataEntity(senderId=" + this.senderId + ", l1Frequency=" + this.l1Frequency + ")";
    }
}
