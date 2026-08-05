package com.truecaller.insights.ui.notifications.smsid.ads;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/truecaller/insights/ui/notifications/smsid/ads/AdsMsgIdConfig;", "", "isAdEnabled", "", "isGamAdEnabled", "isTasAdEnabled", "isVbAdAllowed", "adLayout", "", "categories", "", "<init>", "(ZZZZLjava/lang/String;Ljava/util/List;)V", "()Z", "getAdLayout", "()Ljava/lang/String;", "getCategories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AdsMsgIdConfig {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adLayout;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> categories;
    private final boolean isAdEnabled;
    private final boolean isGamAdEnabled;
    private final boolean isTasAdEnabled;
    private final boolean isVbAdAllowed;

    public AdsMsgIdConfig(boolean z, boolean z2, boolean z3, boolean z4, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "adLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "categories");
        this.isAdEnabled = z;
        this.isGamAdEnabled = z2;
        this.isTasAdEnabled = z3;
        this.isVbAdAllowed = z4;
        this.adLayout = str;
        this.categories = list;
    }

    public static /* synthetic */ com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig copy$default(com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig adsMsgIdConfig, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = adsMsgIdConfig.isAdEnabled;
        }
        if ((i & 2) != 0) {
            z2 = adsMsgIdConfig.isGamAdEnabled;
        }
        if ((i & 4) != 0) {
            z3 = adsMsgIdConfig.isTasAdEnabled;
        }
        if ((i & 8) != 0) {
            z4 = adsMsgIdConfig.isVbAdAllowed;
        }
        if ((i & 16) != 0) {
            str = adsMsgIdConfig.adLayout;
        }
        if ((i & 32) != 0) {
            list = adsMsgIdConfig.categories;
        }
        java.lang.String str2 = str;
        java.util.List list2 = list;
        return adsMsgIdConfig.copy(z, z2, z3, z4, str2, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAdEnabled() {
        return this.isAdEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsGamAdEnabled() {
        return this.isGamAdEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsTasAdEnabled() {
        return this.isTasAdEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVbAdAllowed() {
        return this.isVbAdAllowed;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAdLayout() {
        return this.adLayout;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component6() {
        return this.categories;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig copy(boolean isAdEnabled, boolean isGamAdEnabled, boolean isTasAdEnabled, boolean isVbAdAllowed, @org.jetbrains.annotations.NotNull java.lang.String adLayout, @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> categories) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(categories, "categories");
        return new com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig(isAdEnabled, isGamAdEnabled, isTasAdEnabled, isVbAdAllowed, adLayout, categories);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig)) {
            return false;
        }
        com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig adsMsgIdConfig = (com.truecaller.insights.ui.notifications.smsid.ads.AdsMsgIdConfig) other;
        return this.isAdEnabled == adsMsgIdConfig.isAdEnabled && this.isGamAdEnabled == adsMsgIdConfig.isGamAdEnabled && this.isTasAdEnabled == adsMsgIdConfig.isTasAdEnabled && this.isVbAdAllowed == adsMsgIdConfig.isVbAdAllowed && kotlin.jvm.internal.Intrinsics.b(this.adLayout, adsMsgIdConfig.adLayout) && kotlin.jvm.internal.Intrinsics.b(this.categories, adsMsgIdConfig.categories);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdLayout() {
        return this.adLayout;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getCategories() {
        return this.categories;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 1237;
        if (this.isAdEnabled) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i5 = i * 31;
        if (this.isGamAdEnabled) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        int i6 = (i5 + i2) * 31;
        if (this.isTasAdEnabled) {
            i3 = 1231;
        } else {
            i3 = 1237;
        }
        int i7 = (i6 + i3) * 31;
        if (this.isVbAdAllowed) {
            i4 = 1231;
        }
        return this.categories.hashCode() + ax1.bar.e((i7 + i4) * 31, 31, this.adLayout);
    }

    public final boolean isAdEnabled() {
        return this.isAdEnabled;
    }

    public final boolean isGamAdEnabled() {
        return this.isGamAdEnabled;
    }

    public final boolean isTasAdEnabled() {
        return this.isTasAdEnabled;
    }

    public final boolean isVbAdAllowed() {
        return this.isVbAdAllowed;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.isAdEnabled;
        boolean z2 = this.isGamAdEnabled;
        boolean z3 = this.isTasAdEnabled;
        boolean z4 = this.isVbAdAllowed;
        java.lang.String str = this.adLayout;
        java.util.List<java.lang.String> list = this.categories;
        java.lang.StringBuilder v = bx.e1.v("AdsMsgIdConfig(isAdEnabled=", ", isGamAdEnabled=", ", isTasAdEnabled=", z, z2);
        nc0.k1.p(v, z3, ", isVbAdAllowed=", z4, ", adLayout=");
        return z0.a0.d(str, ", categories=", ")", v, list);
    }
}
