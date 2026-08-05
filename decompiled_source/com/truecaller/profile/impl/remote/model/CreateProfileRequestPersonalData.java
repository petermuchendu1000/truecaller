package com.truecaller.profile.impl.remote.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/truecaller/profile/impl/remote/model/CreateProfileRequestPersonalData;", "", "gender", "", "onlineIds", "Lcom/truecaller/profile/impl/remote/model/OnlineIds;", "avatarUrl", "privacy", "<init>", "(Ljava/lang/String;Lcom/truecaller/profile/impl/remote/model/OnlineIds;Ljava/lang/String;Ljava/lang/String;)V", "getGender", "()Ljava/lang/String;", "getOnlineIds", "()Lcom/truecaller/profile/impl/remote/model/OnlineIds;", "getAvatarUrl", "getPrivacy", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class CreateProfileRequestPersonalData {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatarUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String gender;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.profile.impl.remote.model.OnlineIds onlineIds;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String privacy;

    public CreateProfileRequestPersonalData(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.OnlineIds onlineIds, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineIds, "onlineIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "privacy");
        this.gender = str;
        this.onlineIds = onlineIds;
        this.avatarUrl = str2;
        this.privacy = str3;
    }

    public static /* synthetic */ com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData copy$default(com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData createProfileRequestPersonalData, java.lang.String str, com.truecaller.profile.impl.remote.model.OnlineIds onlineIds, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = createProfileRequestPersonalData.gender;
        }
        if ((i & 2) != 0) {
            onlineIds = createProfileRequestPersonalData.onlineIds;
        }
        if ((i & 4) != 0) {
            str2 = createProfileRequestPersonalData.avatarUrl;
        }
        if ((i & 8) != 0) {
            str3 = createProfileRequestPersonalData.privacy;
        }
        return createProfileRequestPersonalData.copy(str, onlineIds, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGender() {
        return this.gender;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.profile.impl.remote.model.OnlineIds getOnlineIds() {
        return this.onlineIds;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getPrivacy() {
        return this.privacy;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData copy(@org.jetbrains.annotations.NotNull java.lang.String gender, @org.jetbrains.annotations.NotNull com.truecaller.profile.impl.remote.model.OnlineIds onlineIds, @org.jetbrains.annotations.Nullable java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull java.lang.String privacy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onlineIds, "onlineIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacy, "privacy");
        return new com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData(gender, onlineIds, avatarUrl, privacy);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData)) {
            return false;
        }
        com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData createProfileRequestPersonalData = (com.truecaller.profile.impl.remote.model.CreateProfileRequestPersonalData) other;
        return kotlin.jvm.internal.Intrinsics.b(this.gender, createProfileRequestPersonalData.gender) && kotlin.jvm.internal.Intrinsics.b(this.onlineIds, createProfileRequestPersonalData.onlineIds) && kotlin.jvm.internal.Intrinsics.b(this.avatarUrl, createProfileRequestPersonalData.avatarUrl) && kotlin.jvm.internal.Intrinsics.b(this.privacy, createProfileRequestPersonalData.privacy);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatarUrl() {
        return this.avatarUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return this.gender;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.profile.impl.remote.model.OnlineIds getOnlineIds() {
        return this.onlineIds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        int hashCode = (this.onlineIds.hashCode() + (this.gender.hashCode() * 31)) * 31;
        java.lang.String str = this.avatarUrl;
        return this.privacy.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.gender;
        com.truecaller.profile.impl.remote.model.OnlineIds onlineIds = this.onlineIds;
        java.lang.String str2 = this.avatarUrl;
        java.lang.String str3 = this.privacy;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateProfileRequestPersonalData(gender=");
        sb.append(str);
        sb.append(", onlineIds=");
        sb.append(onlineIds);
        sb.append(", avatarUrl=");
        return bar.x(sb, str2, ", privacy=", str3, ")");
    }

    public /* synthetic */ CreateProfileRequestPersonalData(java.lang.String str, com.truecaller.profile.impl.remote.model.OnlineIds onlineIds, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, onlineIds, str2, (i & 8) != 0 ? "Private" : str3);
    }
}
