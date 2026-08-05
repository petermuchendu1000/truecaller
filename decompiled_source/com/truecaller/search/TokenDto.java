package com.truecaller.search;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/search/TokenDto;", "", "token", "", "ttlSeconds", "", "<init>", "(Ljava/lang/String;J)V", "getToken", "()Ljava/lang/String;", "getTtlSeconds", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class TokenDto {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;
    private final long ttlSeconds;

    public TokenDto(@org.jetbrains.annotations.NotNull java.lang.String str, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.ttlSeconds = j;
    }

    public static /* synthetic */ com.truecaller.search.TokenDto copy$default(com.truecaller.search.TokenDto tokenDto, java.lang.String str, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = tokenDto.token;
        }
        if ((i & 2) != 0) {
            j = tokenDto.ttlSeconds;
        }
        return tokenDto.copy(str, j);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTtlSeconds() {
        return this.ttlSeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.search.TokenDto copy(@org.jetbrains.annotations.NotNull java.lang.String token, long ttlSeconds) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return new com.truecaller.search.TokenDto(token, ttlSeconds);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.search.TokenDto)) {
            return false;
        }
        com.truecaller.search.TokenDto tokenDto = (com.truecaller.search.TokenDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.token, tokenDto.token) && this.ttlSeconds == tokenDto.ttlSeconds;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    public final long getTtlSeconds() {
        return this.ttlSeconds;
    }

    public int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        long j = this.ttlSeconds;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.StringBuilder q = com.appsflyer.internal.e.q("TokenDto(token=", this.token, ", ttlSeconds=", this.ttlSeconds);
        q.append(")");
        return q.toString();
    }
}
