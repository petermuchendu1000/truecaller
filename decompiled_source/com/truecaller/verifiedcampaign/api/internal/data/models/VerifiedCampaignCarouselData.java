package com.truecaller.verifiedcampaign.api.internal.data.models;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/verifiedcampaign/api/internal/data/models/VerifiedCampaignCarouselData;", "", "", "autoSwipeTimer", "", "Lo13/c;", "list", "<init>", "(JLjava/util/List;)V", "component1", "()J", "component2", "()Ljava/util/List;", "copy", "(JLjava/util/List;)Lcom/truecaller/verifiedcampaign/api/internal/data/models/VerifiedCampaignCarouselData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getAutoSwipeTimer", "Ljava/util/List;", "getList", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class VerifiedCampaignCarouselData {
    private final long autoSwipeTimer;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<o13.c> list;

    /* JADX WARN: Multi-variable type inference failed */
    public VerifiedCampaignCarouselData(long j, @org.jetbrains.annotations.NotNull java.util.List<? extends o13.c> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        this.autoSwipeTimer = j;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData copy$default(com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData verifiedCampaignCarouselData, long j, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = verifiedCampaignCarouselData.autoSwipeTimer;
        }
        if ((i & 2) != 0) {
            list = verifiedCampaignCarouselData.list;
        }
        return verifiedCampaignCarouselData.copy(j, list);
    }

    /* renamed from: component1, reason: from getter */
    public final long getAutoSwipeTimer() {
        return this.autoSwipeTimer;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<o13.c> component2() {
        return this.list;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData copy(long autoSwipeTimer, @org.jetbrains.annotations.NotNull java.util.List<? extends o13.c> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "list");
        return new com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData(autoSwipeTimer, list);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData)) {
            return false;
        }
        com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData verifiedCampaignCarouselData = (com.truecaller.verifiedcampaign.api.internal.data.models.VerifiedCampaignCarouselData) other;
        return this.autoSwipeTimer == verifiedCampaignCarouselData.autoSwipeTimer && kotlin.jvm.internal.Intrinsics.b(this.list, verifiedCampaignCarouselData.list);
    }

    public final long getAutoSwipeTimer() {
        return this.autoSwipeTimer;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<o13.c> getList() {
        return this.list;
    }

    public int hashCode() {
        long j = this.autoSwipeTimer;
        return this.list.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "VerifiedCampaignCarouselData(autoSwipeTimer=" + this.autoSwipeTimer + ", list=" + this.list + ")";
    }

    public /* synthetic */ VerifiedCampaignCarouselData(long j, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.unity3d.services.core.di.ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT : j, list);
    }
}
