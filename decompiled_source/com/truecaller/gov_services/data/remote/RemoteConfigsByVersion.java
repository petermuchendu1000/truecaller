package com.truecaller.gov_services.data.remote;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/truecaller/gov_services/data/remote/RemoteConfigsByVersion;", "", "configsByVersion", "", "", "Lcom/truecaller/gov_services/data/remote/RemoteConfig;", "<init>", "(Ljava/util/Map;)V", "getConfigsByVersion", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class RemoteConfigsByVersion {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.Integer, com.truecaller.gov_services.data.remote.RemoteConfig> configsByVersion;

    public RemoteConfigsByVersion(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, com.truecaller.gov_services.data.remote.RemoteConfig> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "configsByVersion");
        this.configsByVersion = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.gov_services.data.remote.RemoteConfigsByVersion copy$default(com.truecaller.gov_services.data.remote.RemoteConfigsByVersion remoteConfigsByVersion, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = remoteConfigsByVersion.configsByVersion;
        }
        return remoteConfigsByVersion.copy(map);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, com.truecaller.gov_services.data.remote.RemoteConfig> component1() {
        return this.configsByVersion;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.gov_services.data.remote.RemoteConfigsByVersion copy(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Integer, com.truecaller.gov_services.data.remote.RemoteConfig> configsByVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configsByVersion, "configsByVersion");
        return new com.truecaller.gov_services.data.remote.RemoteConfigsByVersion(configsByVersion);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.truecaller.gov_services.data.remote.RemoteConfigsByVersion) && kotlin.jvm.internal.Intrinsics.b(this.configsByVersion, ((com.truecaller.gov_services.data.remote.RemoteConfigsByVersion) other).configsByVersion);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.Integer, com.truecaller.gov_services.data.remote.RemoteConfig> getConfigsByVersion() {
        return this.configsByVersion;
    }

    public int hashCode() {
        return this.configsByVersion.hashCode();
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "RemoteConfigsByVersion(configsByVersion=" + this.configsByVersion + ")";
    }
}
