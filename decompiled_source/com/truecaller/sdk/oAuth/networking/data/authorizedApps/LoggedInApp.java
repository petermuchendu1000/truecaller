package com.truecaller.sdk.oAuth.networking.data.authorizedApps;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/authorizedApps/LoggedInApp;", "", "credentialId", "", "appName", "homePageUrl", "appLogoUrl", "accessGiven", "", "revoked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V", "getCredentialId", "()Ljava/lang/String;", "getAppName", "getHomePageUrl", "getAppLogoUrl", "getAccessGiven", "()J", "getRevoked", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class LoggedInApp {
    public static final int $stable = 0;
    private final long accessGiven;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String appLogoUrl;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String appName;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String credentialId;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String homePageUrl;
    private final boolean revoked;

    public LoggedInApp(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, long j, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "credentialId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "homePageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "appLogoUrl");
        this.credentialId = str;
        this.appName = str2;
        this.homePageUrl = str3;
        this.appLogoUrl = str4;
        this.accessGiven = j;
        this.revoked = z;
    }

    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp copy$default(com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp loggedInApp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = loggedInApp.credentialId;
        }
        if ((i & 2) != 0) {
            str2 = loggedInApp.appName;
        }
        if ((i & 4) != 0) {
            str3 = loggedInApp.homePageUrl;
        }
        if ((i & 8) != 0) {
            str4 = loggedInApp.appLogoUrl;
        }
        if ((i & 16) != 0) {
            j = loggedInApp.accessGiven;
        }
        if ((i & 32) != 0) {
            z = loggedInApp.revoked;
        }
        boolean z2 = z;
        long j2 = j;
        return loggedInApp.copy(str, str2, str3, str4, j2, z2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCredentialId() {
        return this.credentialId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAppName() {
        return this.appName;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getHomePageUrl() {
        return this.homePageUrl;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAppLogoUrl() {
        return this.appLogoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final long getAccessGiven() {
        return this.accessGiven;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getRevoked() {
        return this.revoked;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp copy(@org.jetbrains.annotations.NotNull java.lang.String credentialId, @org.jetbrains.annotations.NotNull java.lang.String appName, @org.jetbrains.annotations.NotNull java.lang.String homePageUrl, @org.jetbrains.annotations.NotNull java.lang.String appLogoUrl, long accessGiven, boolean revoked) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialId, "credentialId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homePageUrl, "homePageUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appLogoUrl, "appLogoUrl");
        return new com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp(credentialId, appName, homePageUrl, appLogoUrl, accessGiven, revoked);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp)) {
            return false;
        }
        com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp loggedInApp = (com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp) other;
        return kotlin.jvm.internal.Intrinsics.b(this.credentialId, loggedInApp.credentialId) && kotlin.jvm.internal.Intrinsics.b(this.appName, loggedInApp.appName) && kotlin.jvm.internal.Intrinsics.b(this.homePageUrl, loggedInApp.homePageUrl) && kotlin.jvm.internal.Intrinsics.b(this.appLogoUrl, loggedInApp.appLogoUrl) && this.accessGiven == loggedInApp.accessGiven && this.revoked == loggedInApp.revoked;
    }

    public final long getAccessGiven() {
        return this.accessGiven;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppLogoUrl() {
        return this.appLogoUrl;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppName() {
        return this.appName;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCredentialId() {
        return this.credentialId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHomePageUrl() {
        return this.homePageUrl;
    }

    public final boolean getRevoked() {
        return this.revoked;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(this.credentialId.hashCode() * 31, 31, this.appName), 31, this.homePageUrl), 31, this.appLogoUrl);
        long j = this.accessGiven;
        int i2 = (e + ((int) (j ^ (j >>> 32)))) * 31;
        if (this.revoked) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i2 + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.credentialId;
        java.lang.String str2 = this.appName;
        java.lang.String str3 = this.homePageUrl;
        java.lang.String str4 = this.appLogoUrl;
        long j = this.accessGiven;
        boolean z = this.revoked;
        java.lang.StringBuilder E = ro0.f.E("LoggedInApp(credentialId=", str, ", appName=", str2, ", homePageUrl=");
        bar.E(E, str3, ", appLogoUrl=", str4, ", accessGiven=");
        bx.e1.A(E, j, ", revoked=", z);
        E.append(")");
        return E.toString();
    }
}
