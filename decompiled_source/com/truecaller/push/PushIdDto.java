package com.truecaller.push;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/push/PushIdDto;", "", "token", "", "provider", "", "<init>", "(Ljava/lang/String;I)V", "getToken", "()Ljava/lang/String;", "getProvider", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class PushIdDto {
    private final int provider;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;

    public PushIdDto(@org.jetbrains.annotations.NotNull java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
        this.provider = i;
    }

    public static /* synthetic */ com.truecaller.push.PushIdDto copy$default(com.truecaller.push.PushIdDto pushIdDto, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = pushIdDto.token;
        }
        if ((i2 & 2) != 0) {
            i = pushIdDto.provider;
        }
        return pushIdDto.copy(str, i);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final int getProvider() {
        return this.provider;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.push.PushIdDto copy(@org.jetbrains.annotations.NotNull java.lang.String token, int provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "token");
        return new com.truecaller.push.PushIdDto(token, provider);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.push.PushIdDto)) {
            return false;
        }
        com.truecaller.push.PushIdDto pushIdDto = (com.truecaller.push.PushIdDto) other;
        return kotlin.jvm.internal.Intrinsics.b(this.token, pushIdDto.token) && this.provider == pushIdDto.provider;
    }

    public final int getProvider() {
        return this.provider;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.provider;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return com.appsflyer.internal.e.i("PushIdDto(token=", this.provider, this.token, ", provider=", ")");
    }
}
