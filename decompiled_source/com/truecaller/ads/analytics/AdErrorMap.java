package com.truecaller.ads.analytics;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/analytics/AdErrorMap;", "", "msg", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdErrorMap {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String msg;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public AdErrorMap(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "msg");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "value");
        this.msg = str;
        this.value = str2;
    }

    public static /* synthetic */ com.truecaller.ads.analytics.AdErrorMap copy$default(com.truecaller.ads.analytics.AdErrorMap adErrorMap, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adErrorMap.msg;
        }
        if ((i & 2) != 0) {
            str2 = adErrorMap.value;
        }
        return adErrorMap.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMsg() {
        return this.msg;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.analytics.AdErrorMap copy(@org.jetbrains.annotations.NotNull java.lang.String msg, @org.jetbrains.annotations.NotNull java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.ads.analytics.AdErrorMap(msg, value);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.analytics.AdErrorMap)) {
            return false;
        }
        com.truecaller.ads.analytics.AdErrorMap adErrorMap = (com.truecaller.ads.analytics.AdErrorMap) other;
        return kotlin.jvm.internal.Intrinsics.b(this.msg, adErrorMap.msg) && kotlin.jvm.internal.Intrinsics.b(this.value, adErrorMap.value);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMsg() {
        return this.msg;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.msg.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("AdErrorMap(msg=", this.msg, ", value=", this.value, ")");
    }
}
