package com.truecaller.wearable.support.helper;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014¨\u0006\""}, d2 = {"Lcom/truecaller/wearable/support/helper/WearableSearchResult;", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "number", "imageUrl", "callerType", "Lcom/truecaller/wearable/support/helper/WearableCallerType;", "isSpam", "", "isBlacklisted", "isManualCallerIdPrompt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/wearable/support/helper/WearableCallerType;ZZZ)V", "getName", "()Ljava/lang/String;", "getNumber", "getImageUrl", "getCallerType", "()Lcom/truecaller/wearable/support/helper/WearableCallerType;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "support_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class WearableSearchResult {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.wearable.support.helper.WearableCallerType callerType;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageUrl;
    private final boolean isBlacklisted;
    private final boolean isManualCallerIdPrompt;
    private final boolean isSpam;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String number;

    public WearableSearchResult(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull com.truecaller.wearable.support.helper.WearableCallerType wearableCallerType, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(wearableCallerType, "callerType");
        this.name = str;
        this.number = str2;
        this.imageUrl = str3;
        this.callerType = wearableCallerType;
        this.isSpam = z;
        this.isBlacklisted = z2;
        this.isManualCallerIdPrompt = z3;
    }

    public static /* synthetic */ com.truecaller.wearable.support.helper.WearableSearchResult copy$default(com.truecaller.wearable.support.helper.WearableSearchResult wearableSearchResult, java.lang.String str, java.lang.String str2, java.lang.String str3, com.truecaller.wearable.support.helper.WearableCallerType wearableCallerType, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = wearableSearchResult.name;
        }
        if ((i & 2) != 0) {
            str2 = wearableSearchResult.number;
        }
        if ((i & 4) != 0) {
            str3 = wearableSearchResult.imageUrl;
        }
        if ((i & 8) != 0) {
            wearableCallerType = wearableSearchResult.callerType;
        }
        if ((i & 16) != 0) {
            z = wearableSearchResult.isSpam;
        }
        if ((i & 32) != 0) {
            z2 = wearableSearchResult.isBlacklisted;
        }
        if ((i & 64) != 0) {
            z3 = wearableSearchResult.isManualCallerIdPrompt;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        boolean z6 = z;
        java.lang.String str4 = str3;
        return wearableSearchResult.copy(str, str2, str4, wearableCallerType, z6, z4, z5);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNumber() {
        return this.number;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.wearable.support.helper.WearableCallerType getCallerType() {
        return this.callerType;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSpam() {
        return this.isSpam;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsBlacklisted() {
        return this.isBlacklisted;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsManualCallerIdPrompt() {
        return this.isManualCallerIdPrompt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wearable.support.helper.WearableSearchResult copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String number, @org.jetbrains.annotations.NotNull java.lang.String imageUrl, @org.jetbrains.annotations.NotNull com.truecaller.wearable.support.helper.WearableCallerType callerType, boolean isSpam, boolean isBlacklisted, boolean isManualCallerIdPrompt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(number, "number");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerType, "callerType");
        return new com.truecaller.wearable.support.helper.WearableSearchResult(name, number, imageUrl, callerType, isSpam, isBlacklisted, isManualCallerIdPrompt);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.wearable.support.helper.WearableSearchResult)) {
            return false;
        }
        com.truecaller.wearable.support.helper.WearableSearchResult wearableSearchResult = (com.truecaller.wearable.support.helper.WearableSearchResult) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, wearableSearchResult.name) && kotlin.jvm.internal.Intrinsics.b(this.number, wearableSearchResult.number) && kotlin.jvm.internal.Intrinsics.b(this.imageUrl, wearableSearchResult.imageUrl) && this.callerType == wearableSearchResult.callerType && this.isSpam == wearableSearchResult.isSpam && this.isBlacklisted == wearableSearchResult.isBlacklisted && this.isManualCallerIdPrompt == wearableSearchResult.isManualCallerIdPrompt;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.wearable.support.helper.WearableCallerType getCallerType() {
        return this.callerType;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumber() {
        return this.number;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = (this.callerType.hashCode() + ax1.bar.e(ax1.bar.e(this.name.hashCode() * 31, 31, this.number), 31, this.imageUrl)) * 31;
        int i3 = 1237;
        if (this.isSpam) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i4 = (hashCode + i) * 31;
        if (this.isBlacklisted) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i5 = (i4 + i2) * 31;
        if (this.isManualCallerIdPrompt) {
            i3 = 1231;
        }
        return i5 + i3;
    }

    public final boolean isBlacklisted() {
        return this.isBlacklisted;
    }

    public final boolean isManualCallerIdPrompt() {
        return this.isManualCallerIdPrompt;
    }

    public final boolean isSpam() {
        return this.isSpam;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.number;
        java.lang.String str3 = this.imageUrl;
        com.truecaller.wearable.support.helper.WearableCallerType wearableCallerType = this.callerType;
        boolean z = this.isSpam;
        boolean z2 = this.isBlacklisted;
        boolean z3 = this.isManualCallerIdPrompt;
        java.lang.StringBuilder E = ro0.f.E("WearableSearchResult(name=", str, ", number=", str2, ", imageUrl=");
        E.append(str3);
        E.append(", callerType=");
        E.append(wearableCallerType);
        E.append(", isSpam=");
        nc0.k1.p(E, z, ", isBlacklisted=", z2, ", isManualCallerIdPrompt=");
        return h8.s0.s(E, z3, ")");
    }
}
