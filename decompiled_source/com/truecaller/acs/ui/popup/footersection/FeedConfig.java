package com.truecaller.acs.ui.popup.footersection;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/truecaller/acs/ui/popup/footersection/FeedConfig;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "title", "description", "imageUrl", "deeplink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getImageUrl", "getDeeplink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class FeedConfig {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String deeplink;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String description;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String imageUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String title;

    public FeedConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "deeplink");
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.imageUrl = str4;
        this.deeplink = str5;
    }

    public static /* synthetic */ com.truecaller.acs.ui.popup.footersection.FeedConfig copy$default(com.truecaller.acs.ui.popup.footersection.FeedConfig feedConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = feedConfig.id;
        }
        if ((i & 2) != 0) {
            str2 = feedConfig.title;
        }
        if ((i & 4) != 0) {
            str3 = feedConfig.description;
        }
        if ((i & 8) != 0) {
            str4 = feedConfig.imageUrl;
        }
        if ((i & 16) != 0) {
            str5 = feedConfig.deeplink;
        }
        java.lang.String str6 = str5;
        java.lang.String str7 = str3;
        return feedConfig.copy(str, str2, str7, str4, str6);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDeeplink() {
        return this.deeplink;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.acs.ui.popup.footersection.FeedConfig copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String title, @org.jetbrains.annotations.NotNull java.lang.String description, @org.jetbrains.annotations.NotNull java.lang.String imageUrl, @org.jetbrains.annotations.NotNull java.lang.String deeplink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "description");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new com.truecaller.acs.ui.popup.footersection.FeedConfig(id, title, description, imageUrl, deeplink);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.acs.ui.popup.footersection.FeedConfig)) {
            return false;
        }
        com.truecaller.acs.ui.popup.footersection.FeedConfig feedConfig = (com.truecaller.acs.ui.popup.footersection.FeedConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, feedConfig.id) && kotlin.jvm.internal.Intrinsics.b(this.title, feedConfig.title) && kotlin.jvm.internal.Intrinsics.b(this.description, feedConfig.description) && kotlin.jvm.internal.Intrinsics.b(this.imageUrl, feedConfig.imageUrl) && kotlin.jvm.internal.Intrinsics.b(this.deeplink, feedConfig.deeplink);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeeplink() {
        return this.deeplink;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescription() {
        return this.description;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deeplink.hashCode() + ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.title), 31, this.description), 31, this.imageUrl);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.imageUrl;
        java.lang.String str5 = this.deeplink;
        java.lang.StringBuilder E = ro0.f.E("FeedConfig(id=", str, ", title=", str2, ", description=");
        bar.E(E, str3, ", imageUrl=", str4, ", deeplink=");
        return bar.v(str5, ")", E);
    }
}
