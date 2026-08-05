package com.truecaller.call_assistant.campaigns.data.network.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/network/model/AssistantCampaignItemButtonsDto;", "", "action", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "text", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getId", "getText", "getUrl", "getName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignItemButtonsDto {
    public static final int $stable = 0;

    @bw.qux("action")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String action;

    @bw.qux("_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @bw.qux("name")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @bw.qux("text")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    @bw.qux("url")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public AssistantCampaignItemButtonsDto(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "text");
        this.action = str;
        this.id = str2;
        this.text = str3;
        this.url = str4;
        this.name = str5;
    }

    public static /* synthetic */ com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto copy$default(com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto assistantCampaignItemButtonsDto, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assistantCampaignItemButtonsDto.action;
        }
        if ((i & 2) != 0) {
            str2 = assistantCampaignItemButtonsDto.id;
        }
        if ((i & 4) != 0) {
            str3 = assistantCampaignItemButtonsDto.text;
        }
        if ((i & 8) != 0) {
            str4 = assistantCampaignItemButtonsDto.url;
        }
        if ((i & 16) != 0) {
            str5 = assistantCampaignItemButtonsDto.name;
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = str3;
        return assistantCampaignItemButtonsDto.copy(str, str2, str7, str4, str6);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto copy(@org.jetbrains.annotations.Nullable java.lang.String action, @org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto(action, id, text, url, name);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto assistantCampaignItemButtonsDto = (com.truecaller.call_assistant.campaigns.data.network.model.AssistantCampaignItemButtonsDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.action, assistantCampaignItemButtonsDto.action) && kotlin.jvm.internal.Intrinsics.b(this.id, assistantCampaignItemButtonsDto.id) && kotlin.jvm.internal.Intrinsics.b(this.text, assistantCampaignItemButtonsDto.text) && kotlin.jvm.internal.Intrinsics.b(this.url, assistantCampaignItemButtonsDto.url) && kotlin.jvm.internal.Intrinsics.b(this.name, assistantCampaignItemButtonsDto.name);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAction() {
        return this.action;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return this.text;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        java.lang.String str = this.action;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e(hashCode * 31, 31, this.id), 31, this.text);
        java.lang.String str2 = this.url;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (e + hashCode2) * 31;
        java.lang.String str3 = this.name;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.action;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.text;
        java.lang.String str4 = this.url;
        java.lang.String str5 = this.name;
        java.lang.StringBuilder E = ro0.f.E("AssistantCampaignItemButtonsDto(action=", str, ", id=", str2, ", text=");
        bar.E(E, str3, ", url=", str4, ", name=");
        return bar.v(str5, ")", E);
    }

    public /* synthetic */ AssistantCampaignItemButtonsDto(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
