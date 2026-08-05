package com.truecaller.call_assistant.campaigns.data.db.common;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000  2\u00020\u0001:\u0001!B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJH\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/truecaller/call_assistant/campaigns/data/db/common/AssistantCampaignItemButtons;", "", "", "action", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "text", "url", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/truecaller/call_assistant/campaigns/data/db/common/AssistantCampaignItemButtons;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAction", "getId", "getText", "getUrl", "getName", "Companion", "fm0/bar", "campaigns_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AssistantCampaignItemButtons {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    public static final fm0.bar Companion = new java.lang.Object();
    public static final int NEGATIVE_BUTTON_INDEX = 1;
    public static final int POSITIVE_BUTTON_INDEX = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String action;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String text;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String url;

    public AssistantCampaignItemButtons(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.Nullable java.lang.String str4, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "text");
        this.action = str;
        this.id = str2;
        this.text = str3;
        this.url = str4;
        this.name = str5;
    }

    public static /* synthetic */ com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons copy$default(com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons assistantCampaignItemButtons, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assistantCampaignItemButtons.action;
        }
        if ((i & 2) != 0) {
            str2 = assistantCampaignItemButtons.id;
        }
        if ((i & 4) != 0) {
            str3 = assistantCampaignItemButtons.text;
        }
        if ((i & 8) != 0) {
            str4 = assistantCampaignItemButtons.url;
        }
        if ((i & 16) != 0) {
            str5 = assistantCampaignItemButtons.name;
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = str3;
        return assistantCampaignItemButtons.copy(str, str2, str7, str4, str6);
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
    public final com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons copy(@org.jetbrains.annotations.Nullable java.lang.String action, @org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String text, @org.jetbrains.annotations.Nullable java.lang.String url, @org.jetbrains.annotations.Nullable java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return new com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons(action, id, text, url, name);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons)) {
            return false;
        }
        com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons assistantCampaignItemButtons = (com.truecaller.call_assistant.campaigns.data.db.common.AssistantCampaignItemButtons) other;
        return kotlin.jvm.internal.Intrinsics.b(this.action, assistantCampaignItemButtons.action) && kotlin.jvm.internal.Intrinsics.b(this.id, assistantCampaignItemButtons.id) && kotlin.jvm.internal.Intrinsics.b(this.text, assistantCampaignItemButtons.text) && kotlin.jvm.internal.Intrinsics.b(this.url, assistantCampaignItemButtons.url) && kotlin.jvm.internal.Intrinsics.b(this.name, assistantCampaignItemButtons.name);
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
        java.lang.StringBuilder E = ro0.f.E("AssistantCampaignItemButtons(action=", str, ", id=", str2, ", text=");
        bar.E(E, str3, ", url=", str4, ", name=");
        return bar.v(str5, ")", E);
    }

    public /* synthetic */ AssistantCampaignItemButtons(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
