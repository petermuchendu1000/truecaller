package com.truecaller.ads.util;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0016JB\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/truecaller/ads/util/CallInformation;", "", "callType", "Lcom/truecaller/ads/CallType;", "callDirection", "Lcom/truecaller/ads/acsrules/model/CallDirection;", "destinationPlacements", "", "", "callCategory", "", "<init>", "(Lcom/truecaller/ads/CallType;Lcom/truecaller/ads/acsrules/model/CallDirection;Ljava/util/List;Ljava/lang/Integer;)V", "getCallType", "()Lcom/truecaller/ads/CallType;", "setCallType", "(Lcom/truecaller/ads/CallType;)V", "getCallDirection", "()Lcom/truecaller/ads/acsrules/model/CallDirection;", "getDestinationPlacements", "()Ljava/util/List;", "getCallCategory", "()Ljava/lang/Integer;", "setCallCategory", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Lcom/truecaller/ads/CallType;Lcom/truecaller/ads/acsrules/model/CallDirection;Ljava/util/List;Ljava/lang/Integer;)Lcom/truecaller/ads/util/CallInformation;", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class CallInformation {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer callCategory;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.acsrules.model.CallDirection callDirection;

    @org.jetbrains.annotations.Nullable
    private com.truecaller.ads.CallType callType;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> destinationPlacements;

    public CallInformation() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.util.CallInformation copy$default(com.truecaller.ads.util.CallInformation callInformation, com.truecaller.ads.CallType callType, com.truecaller.ads.acsrules.model.CallDirection callDirection, java.util.List list, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            callType = callInformation.callType;
        }
        if ((i & 2) != 0) {
            callDirection = callInformation.callDirection;
        }
        if ((i & 4) != 0) {
            list = callInformation.destinationPlacements;
        }
        if ((i & 8) != 0) {
            num = callInformation.callCategory;
        }
        return callInformation.copy(callType, callDirection, list, num);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.ads.CallType getCallType() {
        return this.callType;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.ads.acsrules.model.CallDirection getCallDirection() {
        return this.callDirection;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component3() {
        return this.destinationPlacements;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getCallCategory() {
        return this.callCategory;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.util.CallInformation copy(@org.jetbrains.annotations.Nullable com.truecaller.ads.CallType callType, @org.jetbrains.annotations.Nullable com.truecaller.ads.acsrules.model.CallDirection callDirection, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> destinationPlacements, @org.jetbrains.annotations.Nullable java.lang.Integer callCategory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationPlacements, "destinationPlacements");
        return new com.truecaller.ads.util.CallInformation(callType, callDirection, destinationPlacements, callCategory);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.util.CallInformation)) {
            return false;
        }
        com.truecaller.ads.util.CallInformation callInformation = (com.truecaller.ads.util.CallInformation) other;
        return this.callType == callInformation.callType && this.callDirection == callInformation.callDirection && kotlin.jvm.internal.Intrinsics.b(this.destinationPlacements, callInformation.destinationPlacements) && kotlin.jvm.internal.Intrinsics.b(this.callCategory, callInformation.callCategory);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCallCategory() {
        return this.callCategory;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.acsrules.model.CallDirection getCallDirection() {
        return this.callDirection;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.CallType getCallType() {
        return this.callType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getDestinationPlacements() {
        return this.destinationPlacements;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        com.truecaller.ads.CallType callType = this.callType;
        int i = 0;
        if (callType == null) {
            hashCode = 0;
        } else {
            hashCode = callType.hashCode();
        }
        int i2 = hashCode * 31;
        com.truecaller.ads.acsrules.model.CallDirection callDirection = this.callDirection;
        if (callDirection == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = callDirection.hashCode();
        }
        int g = uf.qux.g((i2 + hashCode2) * 31, 31, this.destinationPlacements);
        java.lang.Integer num = this.callCategory;
        if (num != null) {
            i = num.hashCode();
        }
        return g + i;
    }

    public final void setCallCategory(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.callCategory = num;
    }

    public final void setCallType(@org.jetbrains.annotations.Nullable com.truecaller.ads.CallType callType) {
        this.callType = callType;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CallInformation(callType=" + this.callType + ", callDirection=" + this.callDirection + ", destinationPlacements=" + this.destinationPlacements + ", callCategory=" + this.callCategory + ")";
    }

    public CallInformation(@org.jetbrains.annotations.Nullable com.truecaller.ads.CallType callType, @org.jetbrains.annotations.Nullable com.truecaller.ads.acsrules.model.CallDirection callDirection, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "destinationPlacements");
        this.callType = callType;
        this.callDirection = callDirection;
        this.destinationPlacements = list;
        this.callCategory = num;
    }

    public CallInformation(com.truecaller.ads.CallType callType, com.truecaller.ads.acsrules.model.CallDirection callDirection, java.util.List list, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : callType, (i & 2) != 0 ? null : callDirection, (i & 4) != 0 ? kotlin.collections.h0.a : list, (i & 8) != 0 ? null : num);
    }
}
