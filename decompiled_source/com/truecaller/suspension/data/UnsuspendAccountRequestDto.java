package com.truecaller.suspension.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/truecaller/suspension/data/UnsuspendAccountRequestDto;", "", "token", "", "build", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "debug", "", "(Ljava/lang/String;Z)V", "getToken", "()Ljava/lang/String;", "getBuild", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UnsuspendAccountRequestDto {

    @org.jetbrains.annotations.Nullable
    private final java.lang.String build;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String token;

    private UnsuspendAccountRequestDto(java.lang.String str, java.lang.String str2) {
        this.token = str;
        this.build = str2;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBuild() {
        return this.build;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getToken() {
        return this.token;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnsuspendAccountRequestDto(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        this(str, z ? "debug" : null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "token");
    }

    public /* synthetic */ UnsuspendAccountRequestDto(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
