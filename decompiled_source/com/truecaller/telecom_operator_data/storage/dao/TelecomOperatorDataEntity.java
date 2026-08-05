package com.truecaller.telecom_operator_data.storage.dao;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/telecom_operator_data/storage/dao/TelecomOperatorDataEntity;", "", "operatorSuggestedName", "", "rawPhoneNumber", "originatingSimToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOperatorSuggestedName", "()Ljava/lang/String;", "getRawPhoneNumber", "getOriginatingSimToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "telecom-operator-data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TelecomOperatorDataEntity {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String operatorSuggestedName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String originatingSimToken;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String rawPhoneNumber;

    public TelecomOperatorDataEntity(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "operatorSuggestedName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "rawPhoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "originatingSimToken");
        this.operatorSuggestedName = str;
        this.rawPhoneNumber = str2;
        this.originatingSimToken = str3;
    }

    public static /* synthetic */ com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity copy$default(com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity telecomOperatorDataEntity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = telecomOperatorDataEntity.operatorSuggestedName;
        }
        if ((i & 2) != 0) {
            str2 = telecomOperatorDataEntity.rawPhoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = telecomOperatorDataEntity.originatingSimToken;
        }
        return telecomOperatorDataEntity.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getOperatorSuggestedName() {
        return this.operatorSuggestedName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawPhoneNumber() {
        return this.rawPhoneNumber;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOriginatingSimToken() {
        return this.originatingSimToken;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity copy(@org.jetbrains.annotations.NotNull java.lang.String operatorSuggestedName, @org.jetbrains.annotations.NotNull java.lang.String rawPhoneNumber, @org.jetbrains.annotations.NotNull java.lang.String originatingSimToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operatorSuggestedName, "operatorSuggestedName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawPhoneNumber, "rawPhoneNumber");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originatingSimToken, "originatingSimToken");
        return new com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity(operatorSuggestedName, rawPhoneNumber, originatingSimToken);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity)) {
            return false;
        }
        com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity telecomOperatorDataEntity = (com.truecaller.telecom_operator_data.storage.dao.TelecomOperatorDataEntity) other;
        return kotlin.jvm.internal.Intrinsics.b(this.operatorSuggestedName, telecomOperatorDataEntity.operatorSuggestedName) && kotlin.jvm.internal.Intrinsics.b(this.rawPhoneNumber, telecomOperatorDataEntity.rawPhoneNumber) && kotlin.jvm.internal.Intrinsics.b(this.originatingSimToken, telecomOperatorDataEntity.originatingSimToken);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOperatorSuggestedName() {
        return this.operatorSuggestedName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOriginatingSimToken() {
        return this.originatingSimToken;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRawPhoneNumber() {
        return this.rawPhoneNumber;
    }

    public int hashCode() {
        return this.originatingSimToken.hashCode() + ax1.bar.e(this.operatorSuggestedName.hashCode() * 31, 31, this.rawPhoneNumber);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.originatingSimToken, ")", ro0.f.E("TelecomOperatorDataEntity(operatorSuggestedName=", this.operatorSuggestedName, ", rawPhoneNumber=", this.rawPhoneNumber, ", originatingSimToken="));
    }
}
