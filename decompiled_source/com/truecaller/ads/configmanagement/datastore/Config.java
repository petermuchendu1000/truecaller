package com.truecaller.ads.configmanagement.datastore;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/configmanagement/datastore/Config;", "", "minSync", "", "eTag", "", "configSettings", "", "Lcom/truecaller/ads/configmanagement/datastore/ConfigSetting;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getMinSync", "()I", "getETag", "()Ljava/lang/String;", "getConfigSettings", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Config {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> configSettings;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String eTag;
    private final int minSync;

    public Config(int i, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "eTag");
        this.minSync = i;
        this.eTag = str;
        this.configSettings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.configmanagement.datastore.Config copy$default(com.truecaller.ads.configmanagement.datastore.Config config, int i, java.lang.String str, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = config.minSync;
        }
        if ((i2 & 2) != 0) {
            str = config.eTag;
        }
        if ((i2 & 4) != 0) {
            list = config.configSettings;
        }
        return config.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinSync() {
        return this.minSync;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getETag() {
        return this.eTag;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> component3() {
        return this.configSettings;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.configmanagement.datastore.Config copy(int minSync, @org.jetbrains.annotations.NotNull java.lang.String eTag, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> configSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eTag, "eTag");
        return new com.truecaller.ads.configmanagement.datastore.Config(minSync, eTag, configSettings);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.configmanagement.datastore.Config)) {
            return false;
        }
        com.truecaller.ads.configmanagement.datastore.Config config = (com.truecaller.ads.configmanagement.datastore.Config) other;
        return this.minSync == config.minSync && kotlin.jvm.internal.Intrinsics.b(this.eTag, config.eTag) && kotlin.jvm.internal.Intrinsics.b(this.configSettings, config.configSettings);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> getConfigSettings() {
        return this.configSettings;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getETag() {
        return this.eTag;
    }

    public final int getMinSync() {
        return this.minSync;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.minSync * 31, 31, this.eTag);
        java.util.List<com.truecaller.ads.configmanagement.datastore.ConfigSetting> list = this.configSettings;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return e + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.minSync;
        java.lang.String str = this.eTag;
        return y.o.g(qb.qux.r("Config(minSync=", i, ", eTag=", str, ", configSettings="), this.configSettings, ")");
    }
}
