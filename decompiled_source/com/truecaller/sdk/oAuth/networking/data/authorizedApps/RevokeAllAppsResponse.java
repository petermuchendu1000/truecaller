package com.truecaller.sdk.oAuth.networking.data.authorizedApps;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/truecaller/sdk/oAuth/networking/data/authorizedApps/RevokeAllAppsResponse;", "", "results", "Ljava/util/ArrayList;", "Lcom/truecaller/sdk/oAuth/networking/data/authorizedApps/LoggedInApp;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getResults", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sdk-internal_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class RevokeAllAppsResponse {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp> results;

    public RevokeAllAppsResponse(@org.jetbrains.annotations.NotNull java.util.ArrayList<com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp> arrayList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(arrayList, "results");
        this.results = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse copy$default(com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse revokeAllAppsResponse, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = revokeAllAppsResponse.results;
        }
        return revokeAllAppsResponse.copy(arrayList);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp> component1() {
        return this.results;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse copy(@org.jetbrains.annotations.NotNull java.util.ArrayList<com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp> results) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(results, "results");
        return new com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse(results);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse) && kotlin.jvm.internal.Intrinsics.b(this.results, ((com.truecaller.sdk.oAuth.networking.data.authorizedApps.RevokeAllAppsResponse) other).results);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.truecaller.sdk.oAuth.networking.data.authorizedApps.LoggedInApp> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.q("RevokeAllAppsResponse(results=", ")", this.results);
    }
}
