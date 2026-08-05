package com.truecaller.ads.acsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/acsrules/model/AcsRulesResponse;", "", "version", "", "minSync", "", "expiry", "rules", "Lcom/truecaller/ads/acsrules/model/AcsRulesContainer;", "<init>", "(Ljava/lang/String;JJLcom/truecaller/ads/acsrules/model/AcsRulesContainer;)V", "getVersion", "()Ljava/lang/String;", "getMinSync", "()J", "getExpiry", "getRules", "()Lcom/truecaller/ads/acsrules/model/AcsRulesContainer;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AcsRulesResponse {
    public static final int $stable = 8;
    private final long expiry;

    @bw.qux("min_sync")
    private final long minSync;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.acsrules.model.AcsRulesContainer rules;

    @bw.qux("v")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String version;

    public AcsRulesResponse(@org.jetbrains.annotations.NotNull java.lang.String str, long j, long j2, @org.jetbrains.annotations.Nullable com.truecaller.ads.acsrules.model.AcsRulesContainer acsRulesContainer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "version");
        this.version = str;
        this.minSync = j;
        this.expiry = j2;
        this.rules = acsRulesContainer;
    }

    public static /* synthetic */ com.truecaller.ads.acsrules.model.AcsRulesResponse copy$default(com.truecaller.ads.acsrules.model.AcsRulesResponse acsRulesResponse, java.lang.String str, long j, long j2, com.truecaller.ads.acsrules.model.AcsRulesContainer acsRulesContainer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = acsRulesResponse.version;
        }
        if ((i & 2) != 0) {
            j = acsRulesResponse.minSync;
        }
        if ((i & 4) != 0) {
            j2 = acsRulesResponse.expiry;
        }
        if ((i & 8) != 0) {
            acsRulesContainer = acsRulesResponse.rules;
        }
        com.truecaller.ads.acsrules.model.AcsRulesContainer acsRulesContainer2 = acsRulesContainer;
        return acsRulesResponse.copy(str, j, j2, acsRulesContainer2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMinSync() {
        return this.minSync;
    }

    /* renamed from: component3, reason: from getter */
    public final long getExpiry() {
        return this.expiry;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.acsrules.model.AcsRulesContainer getRules() {
        return this.rules;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.acsrules.model.AcsRulesResponse copy(@org.jetbrains.annotations.NotNull java.lang.String version, long minSync, long expiry, @org.jetbrains.annotations.Nullable com.truecaller.ads.acsrules.model.AcsRulesContainer rules) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "version");
        return new com.truecaller.ads.acsrules.model.AcsRulesResponse(version, minSync, expiry, rules);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.acsrules.model.AcsRulesResponse)) {
            return false;
        }
        com.truecaller.ads.acsrules.model.AcsRulesResponse acsRulesResponse = (com.truecaller.ads.acsrules.model.AcsRulesResponse) other;
        return kotlin.jvm.internal.Intrinsics.b(this.version, acsRulesResponse.version) && this.minSync == acsRulesResponse.minSync && this.expiry == acsRulesResponse.expiry && kotlin.jvm.internal.Intrinsics.b(this.rules, acsRulesResponse.rules);
    }

    public final long getExpiry() {
        return this.expiry;
    }

    public final long getMinSync() {
        return this.minSync;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.acsrules.model.AcsRulesContainer getRules() {
        return this.rules;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.version.hashCode() * 31;
        long j = this.minSync;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.expiry;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        com.truecaller.ads.acsrules.model.AcsRulesContainer acsRulesContainer = this.rules;
        if (acsRulesContainer == null) {
            hashCode = 0;
        } else {
            hashCode = acsRulesContainer.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.version;
        long j = this.minSync;
        long j2 = this.expiry;
        com.truecaller.ads.acsrules.model.AcsRulesContainer acsRulesContainer = this.rules;
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("AcsRulesResponse(version=", str, ", minSync=", j);
        ro0.f.L(q, ", expiry=", j2, ", rules=");
        q.append(acsRulesContainer);
        q.append(")");
        return q.toString();
    }
}
