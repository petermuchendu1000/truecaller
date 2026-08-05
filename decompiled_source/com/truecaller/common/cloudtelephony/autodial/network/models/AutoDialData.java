package com.truecaller.common.cloudtelephony.autodial.network.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003JM\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialData;", "", "pushType", "", "activityId", "carrierName", "autoDialActionType", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;", "autoDialProductType", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;", "numbers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;Ljava/util/List;)V", "getPushType", "()Ljava/lang/String;", "getActivityId", "getCarrierName", "getAutoDialActionType", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;", "getAutoDialProductType", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialProductType;", "getNumbers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class AutoDialData {
    public static final int $stable = 8;

    @bw.qux("activityId")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String activityId;

    @bw.qux("actionType")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType;

    @bw.qux("productType")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType;

    @bw.qux("carrierName")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String carrierName;

    @bw.qux("numbers")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> numbers;

    @bw.qux("push_type")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pushType;

    public AutoDialData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "pushType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "activityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "carrierName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialActionType, "autoDialActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialProductType, "autoDialProductType");
        this.pushType = str;
        this.activityId = str2;
        this.carrierName = str3;
        this.autoDialActionType = autoDialActionType;
        this.autoDialProductType = autoDialProductType;
        this.numbers = list;
    }

    public static /* synthetic */ com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData copy$default(com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData autoDialData, java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoDialData.pushType;
        }
        if ((i & 2) != 0) {
            str2 = autoDialData.activityId;
        }
        if ((i & 4) != 0) {
            str3 = autoDialData.carrierName;
        }
        if ((i & 8) != 0) {
            autoDialActionType = autoDialData.autoDialActionType;
        }
        if ((i & 16) != 0) {
            autoDialProductType = autoDialData.autoDialProductType;
        }
        if ((i & 32) != 0) {
            list = autoDialData.numbers;
        }
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType2 = autoDialProductType;
        java.util.List list2 = list;
        return autoDialData.copy(str, str2, str3, autoDialActionType, autoDialProductType2, list2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPushType() {
        return this.pushType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCarrierName() {
        return this.carrierName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType getAutoDialActionType() {
        return this.autoDialActionType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType getAutoDialProductType() {
        return this.autoDialProductType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component6() {
        return this.numbers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData copy(@org.jetbrains.annotations.NotNull java.lang.String pushType, @org.jetbrains.annotations.NotNull java.lang.String activityId, @org.jetbrains.annotations.NotNull java.lang.String carrierName, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> numbers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushType, "pushType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityId, "activityId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialActionType, "autoDialActionType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialProductType, "autoDialProductType");
        return new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData(pushType, activityId, carrierName, autoDialActionType, autoDialProductType, numbers);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData)) {
            return false;
        }
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData autoDialData = (com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.pushType, autoDialData.pushType) && kotlin.jvm.internal.Intrinsics.b(this.activityId, autoDialData.activityId) && kotlin.jvm.internal.Intrinsics.b(this.carrierName, autoDialData.carrierName) && this.autoDialActionType == autoDialData.autoDialActionType && this.autoDialProductType == autoDialData.autoDialProductType && kotlin.jvm.internal.Intrinsics.b(this.numbers, autoDialData.numbers);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivityId() {
        return this.activityId;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType getAutoDialActionType() {
        return this.autoDialActionType;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType getAutoDialProductType() {
        return this.autoDialProductType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCarrierName() {
        return this.carrierName;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getNumbers() {
        return this.numbers;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPushType() {
        return this.pushType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.autoDialProductType.hashCode() + ((this.autoDialActionType.hashCode() + ax1.bar.e(ax1.bar.e(this.pushType.hashCode() * 31, 31, this.activityId), 31, this.carrierName)) * 31)) * 31;
        java.util.List<java.lang.String> list = this.numbers;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.pushType;
        java.lang.String str2 = this.activityId;
        java.lang.String str3 = this.carrierName;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType = this.autoDialActionType;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialProductType autoDialProductType = this.autoDialProductType;
        java.util.List<java.lang.String> list = this.numbers;
        java.lang.StringBuilder E = ro0.f.E("AutoDialData(pushType=", str, ", activityId=", str2, ", carrierName=");
        E.append(str3);
        E.append(", autoDialActionType=");
        E.append(autoDialActionType);
        E.append(", autoDialProductType=");
        E.append(autoDialProductType);
        E.append(", numbers=");
        E.append(list);
        E.append(")");
        return E.toString();
    }
}
