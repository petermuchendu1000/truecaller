package com.truecaller.insights.fraud.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/fraud/model/FraudSearchWarningsConfig;", "", "version", "", "searchWarnings", "", "Lcom/truecaller/insights/fraud/model/FraudSearchWarning;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getVersion", "()Ljava/lang/String;", "getSearchWarnings", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class FraudSearchWarningsConfig {

    @bw.qux("search_warnings")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.fraud.model.FraudSearchWarning> searchWarnings;

    @bw.qux("version")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public FraudSearchWarningsConfig(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.fraud.model.FraudSearchWarning> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "searchWarnings");
        this.version = str;
        this.searchWarnings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.fraud.model.FraudSearchWarningsConfig copy$default(com.truecaller.insights.fraud.model.FraudSearchWarningsConfig fraudSearchWarningsConfig, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fraudSearchWarningsConfig.version;
        }
        if ((i & 2) != 0) {
            list = fraudSearchWarningsConfig.searchWarnings;
        }
        return fraudSearchWarningsConfig.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.fraud.model.FraudSearchWarning> component2() {
        return this.searchWarnings;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.fraud.model.FraudSearchWarningsConfig copy(@org.jetbrains.annotations.NotNull java.lang.String version, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.fraud.model.FraudSearchWarning> searchWarnings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(searchWarnings, "searchWarnings");
        return new com.truecaller.insights.fraud.model.FraudSearchWarningsConfig(version, searchWarnings);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.fraud.model.FraudSearchWarningsConfig)) {
            return false;
        }
        com.truecaller.insights.fraud.model.FraudSearchWarningsConfig fraudSearchWarningsConfig = (com.truecaller.insights.fraud.model.FraudSearchWarningsConfig) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, fraudSearchWarningsConfig.version) && kotlin.jvm.internal.Intrinsics.b(this.searchWarnings, fraudSearchWarningsConfig.searchWarnings);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.fraud.model.FraudSearchWarning> getSearchWarnings() {
        return this.searchWarnings;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.searchWarnings.hashCode() + (this.version.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("FraudSearchWarningsConfig(version=", this.version, ", searchWarnings=", this.searchWarnings, ")");
    }

    public FraudSearchWarningsConfig(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.h0.a : list);
    }
}
