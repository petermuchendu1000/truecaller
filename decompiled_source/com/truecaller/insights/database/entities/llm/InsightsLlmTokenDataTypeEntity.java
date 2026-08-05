package com.truecaller.insights.database.entities.llm;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/truecaller/insights/database/entities/llm/InsightsLlmTokenDataTypeEntity;", "", "id", "", "senderId", "", "token", "dataType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getSenderId", "()Ljava/lang/String;", "getToken", "getDataType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class InsightsLlmTokenDataTypeEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String dataType;
    private final long id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String senderId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;

    public InsightsLlmTokenDataTypeEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "dataType");
        this.id = j;
        this.senderId = str;
        this.token = str2;
        this.dataType = str3;
    }

    public static /* synthetic */ com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity copy$default(com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity insightsLlmTokenDataTypeEntity, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = insightsLlmTokenDataTypeEntity.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = insightsLlmTokenDataTypeEntity.senderId;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = insightsLlmTokenDataTypeEntity.token;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = insightsLlmTokenDataTypeEntity.dataType;
        }
        return insightsLlmTokenDataTypeEntity.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDataType() {
        return this.dataType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity copy(long id, @org.jetbrains.annotations.NotNull java.lang.String senderId, @org.jetbrains.annotations.NotNull java.lang.String token, @org.jetbrains.annotations.NotNull java.lang.String dataType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(senderId, "senderId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataType, "dataType");
        return new com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity(id, senderId, token, dataType);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity)) {
            return false;
        }
        com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity insightsLlmTokenDataTypeEntity = (com.truecaller.insights.database.entities.llm.InsightsLlmTokenDataTypeEntity) other;
        return this.id == insightsLlmTokenDataTypeEntity.id && kotlin.jvm.internal.Intrinsics.b(this.senderId, insightsLlmTokenDataTypeEntity.senderId) && kotlin.jvm.internal.Intrinsics.b(this.token, insightsLlmTokenDataTypeEntity.token) && kotlin.jvm.internal.Intrinsics.b(this.dataType, insightsLlmTokenDataTypeEntity.dataType);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDataType() {
        return this.dataType;
    }

    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSenderId() {
        return this.senderId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    public int hashCode() {
        long j = this.id;
        return this.dataType.hashCode() + ax1.bar.e(ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.senderId), 31, this.token);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.senderId;
        java.lang.String str2 = this.token;
        java.lang.String str3 = this.dataType;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("InsightsLlmTokenDataTypeEntity(id=", j, ", senderId=", str);
        bar.E(p, ", token=", str2, ", dataType=", str3);
        p.append(")");
        return p.toString();
    }

    public /* synthetic */ InsightsLlmTokenDataTypeEntity(long j, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3);
    }
}
