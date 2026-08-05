package com.truecaller.call_assistant.campaigns.data.db.common;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/db/common/AssistantCampaignViewOccurrencesEntity;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "campaignViewId", "", "lastTimeShownMillis", "timesShown", "", "<init>", "(JLjava/lang/String;JI)V", "getId", "()J", "getCampaignViewId", "()Ljava/lang/String;", "getLastTimeShownMillis", "getTimesShown", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignViewOccurrencesEntity {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String campaignViewId;
    private final long id;
    private final long lastTimeShownMillis;
    private final int timesShown;

    public AssistantCampaignViewOccurrencesEntity(long j, @org.jetbrains.annotations.NotNull java.lang.String str, long j2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "campaignViewId");
        this.id = j;
        this.campaignViewId = str;
        this.lastTimeShownMillis = j2;
        this.timesShown = i;
    }

    public static /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity copy$default(com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity assistantCampaignViewOccurrencesEntity, long j, java.lang.String str, long j2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            j = assistantCampaignViewOccurrencesEntity.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = assistantCampaignViewOccurrencesEntity.campaignViewId;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            j2 = assistantCampaignViewOccurrencesEntity.lastTimeShownMillis;
        }
        long j4 = j2;
        if ((i2 & 8) != 0) {
            i = assistantCampaignViewOccurrencesEntity.timesShown;
        }
        return assistantCampaignViewOccurrencesEntity.copy(j3, str2, j4, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCampaignViewId() {
        return this.campaignViewId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastTimeShownMillis() {
        return this.lastTimeShownMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTimesShown() {
        return this.timesShown;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity copy(long id, @org.jetbrains.annotations.NotNull java.lang.String campaignViewId, long lastTimeShownMillis, int timesShown) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignViewId, "campaignViewId");
        return new com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity(id, campaignViewId, lastTimeShownMillis, timesShown);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity assistantCampaignViewOccurrencesEntity = (com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignViewOccurrencesEntity) other;
        return this.id == assistantCampaignViewOccurrencesEntity.id && kotlin.jvm.internal.Intrinsics.b(this.campaignViewId, assistantCampaignViewOccurrencesEntity.campaignViewId) && this.lastTimeShownMillis == assistantCampaignViewOccurrencesEntity.lastTimeShownMillis && this.timesShown == assistantCampaignViewOccurrencesEntity.timesShown;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCampaignViewId() {
        return this.campaignViewId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getLastTimeShownMillis() {
        return this.lastTimeShownMillis;
    }

    public final int getTimesShown() {
        return this.timesShown;
    }

    public int hashCode() {
        long j = this.id;
        int e = ax1.bar.e(((int) (j ^ (j >>> 32))) * 31, 31, this.campaignViewId);
        long j2 = this.lastTimeShownMillis;
        return ((e + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.timesShown;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        long j = this.id;
        java.lang.String str = this.campaignViewId;
        long j2 = this.lastTimeShownMillis;
        int i = this.timesShown;
        java.lang.StringBuilder p = com.appsflyer.internal.e.p("AssistantCampaignViewOccurrencesEntity(id=", j, ", campaignViewId=", str);
        ro0.f.L(p, ", lastTimeShownMillis=", j2, ", timesShown=");
        return bar.m(i, ")", p);
    }

    public /* synthetic */ AssistantCampaignViewOccurrencesEntity(long j, java.lang.String str, long j2, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, str, j2, i);
    }
}
