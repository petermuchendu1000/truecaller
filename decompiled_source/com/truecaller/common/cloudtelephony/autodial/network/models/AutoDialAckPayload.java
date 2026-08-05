package com.truecaller.common.cloudtelephony.autodial.network.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialAckPayload;", "", "pushType", "", "carrierName", "actionType", "Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;", "numbers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;Ljava/util/List;)V", "getPushType", "()Ljava/lang/String;", "getCarrierName", "getActionType", "()Lcom/truecaller/common/cloudtelephony/autodial/network/models/AutoDialActionType;", "getNumbers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class AutoDialAckPayload {
    public static final int $stable = 8;

    @bw.qux("actionType")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType actionType;

    @bw.qux("carrierName")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String carrierName;

    @bw.qux("numbers")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> numbers;

    @bw.qux("pushAction")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String pushType;

    public AutoDialAckPayload(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "pushType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "carrierName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoDialActionType, "actionType");
        this.pushType = str;
        this.carrierName = str2;
        this.actionType = autoDialActionType;
        this.numbers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload copy$default(com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload, java.lang.String str, java.lang.String str2, com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = autoDialAckPayload.pushType;
        }
        if ((i & 2) != 0) {
            str2 = autoDialAckPayload.carrierName;
        }
        if ((i & 4) != 0) {
            autoDialActionType = autoDialAckPayload.actionType;
        }
        if ((i & 8) != 0) {
            list = autoDialAckPayload.numbers;
        }
        return autoDialAckPayload.copy(str, str2, autoDialActionType, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPushType() {
        return this.pushType;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCarrierName() {
        return this.carrierName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType getActionType() {
        return this.actionType;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component4() {
        return this.numbers;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload copy(@org.jetbrains.annotations.NotNull java.lang.String pushType, @org.jetbrains.annotations.NotNull java.lang.String carrierName, @org.jetbrains.annotations.NotNull com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType actionType, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> numbers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushType, "pushType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "actionType");
        return new com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload(pushType, carrierName, actionType, numbers);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload)) {
            return false;
        }
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload autoDialAckPayload = (com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialAckPayload) other;
        return kotlin.jvm.internal.Intrinsics.b(this.pushType, autoDialAckPayload.pushType) && kotlin.jvm.internal.Intrinsics.b(this.carrierName, autoDialAckPayload.carrierName) && this.actionType == autoDialAckPayload.actionType && kotlin.jvm.internal.Intrinsics.b(this.numbers, autoDialAckPayload.numbers);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType getActionType() {
        return this.actionType;
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
        int hashCode2 = (this.actionType.hashCode() + ax1.bar.e(this.pushType.hashCode() * 31, 31, this.carrierName)) * 31;
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
        java.lang.String str2 = this.carrierName;
        com.truecaller.common.cloudtelephony.autodial.network.models.AutoDialActionType autoDialActionType = this.actionType;
        java.util.List<java.lang.String> list = this.numbers;
        java.lang.StringBuilder E = ro0.f.E("AutoDialAckPayload(pushType=", str, ", carrierName=", str2, ", actionType=");
        E.append(autoDialActionType);
        E.append(", numbers=");
        E.append(list);
        E.append(")");
        return E.toString();
    }
}
