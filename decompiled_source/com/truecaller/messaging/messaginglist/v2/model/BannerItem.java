package com.truecaller.messaging.messaginglist.v2.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006$"}, d2 = {"Lcom/truecaller/messaging/messaginglist/v2/model/BannerItem;", "", "title", "", "subtitle", "icon", "", "type", "Lcom/truecaller/messaging/messaginglist/v2/model/BannerType;", "filterType", "Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;", "isCleared", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/truecaller/messaging/messaginglist/v2/model/BannerType;Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;Z)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getIcon", "()I", "getType", "()Lcom/truecaller/messaging/messaginglist/v2/model/BannerType;", "getFilterType", "()Lcom/truecaller/messaging/messaginglist/v2/model/MessageFilterType;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class BannerItem {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType filterType;
    private final int icon;
    private final boolean isCleared;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String subtitle;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.messaging.messaginglist.v2.model.BannerType type;

    public BannerItem(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, int i, @org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.BannerType bannerType, @org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerType, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageFilterType, "filterType");
        this.title = str;
        this.subtitle = str2;
        this.icon = i;
        this.type = bannerType;
        this.filterType = messageFilterType;
        this.isCleared = z;
    }

    public static /* synthetic */ com.truecaller.messaging.messaginglist.v2.model.BannerItem copy$default(com.truecaller.messaging.messaginglist.v2.model.BannerItem bannerItem, java.lang.String str, java.lang.String str2, int i, com.truecaller.messaging.messaginglist.v2.model.BannerType bannerType, com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = bannerItem.title;
        }
        if ((i2 & 2) != 0) {
            str2 = bannerItem.subtitle;
        }
        if ((i2 & 4) != 0) {
            i = bannerItem.icon;
        }
        if ((i2 & 8) != 0) {
            bannerType = bannerItem.type;
        }
        if ((i2 & 16) != 0) {
            messageFilterType = bannerItem.filterType;
        }
        if ((i2 & 32) != 0) {
            z = bannerItem.isCleared;
        }
        com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType2 = messageFilterType;
        boolean z2 = z;
        return bannerItem.copy(str, str2, i, bannerType, messageFilterType2, z2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.messaging.messaginglist.v2.model.BannerType getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType getFilterType() {
        return this.filterType;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCleared() {
        return this.isCleared;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.model.BannerItem copy(@org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String subtitle, int icon, @org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.BannerType type, @org.jetbrains.annotations.NotNull com.truecaller.messaging.messaginglist.v2.model.MessageFilterType filterType, boolean isCleared) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterType, "filterType");
        return new com.truecaller.messaging.messaginglist.v2.model.BannerItem(title, subtitle, icon, type, filterType, isCleared);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.messaging.messaginglist.v2.model.BannerItem)) {
            return false;
        }
        com.truecaller.messaging.messaginglist.v2.model.BannerItem bannerItem = (com.truecaller.messaging.messaginglist.v2.model.BannerItem) other;
        return kotlin.jvm.internal.Intrinsics.b(this.title, bannerItem.title) && kotlin.jvm.internal.Intrinsics.b(this.subtitle, bannerItem.subtitle) && this.icon == bannerItem.icon && this.type == bannerItem.type && this.filterType == bannerItem.filterType && this.isCleared == bannerItem.isCleared;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.model.MessageFilterType getFilterType() {
        return this.filterType;
    }

    public final int getIcon() {
        return this.icon;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.messaging.messaginglist.v2.model.BannerType getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.filterType.hashCode() + ((this.type.hashCode() + ((ax1.bar.e(this.title.hashCode() * 31, 31, this.subtitle) + this.icon) * 31)) * 31)) * 31;
        if (this.isCleared) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final boolean isCleared() {
        return this.isCleared;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        int i = this.icon;
        com.truecaller.messaging.messaginglist.v2.model.BannerType bannerType = this.type;
        com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType = this.filterType;
        boolean z = this.isCleared;
        java.lang.StringBuilder E = ro0.f.E("BannerItem(title=", str, ", subtitle=", str2, ", icon=");
        E.append(i);
        E.append(", type=");
        E.append(bannerType);
        E.append(", filterType=");
        E.append(messageFilterType);
        E.append(", isCleared=");
        E.append(z);
        E.append(")");
        return E.toString();
    }

    public /* synthetic */ BannerItem(java.lang.String str, java.lang.String str2, int i, com.truecaller.messaging.messaginglist.v2.model.BannerType bannerType, com.truecaller.messaging.messaginglist.v2.model.MessageFilterType messageFilterType, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, bannerType, messageFilterType, (i2 & 32) != 0 ? false : z);
    }
}
