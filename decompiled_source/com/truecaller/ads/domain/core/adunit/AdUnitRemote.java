package com.truecaller.ads.domain.core.adunit;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/domain/core/adunit/AdUnitRemote;", "", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AdUnitRemote {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    public AdUnitRemote(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ com.truecaller.ads.domain.core.adunit.AdUnitRemote copy$default(com.truecaller.ads.domain.core.adunit.AdUnitRemote adUnitRemote, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = adUnitRemote.key;
        }
        if ((i & 2) != 0) {
            str2 = adUnitRemote.value;
        }
        return adUnitRemote.copy(str, str2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.domain.core.adunit.AdUnitRemote copy(@org.jetbrains.annotations.NotNull java.lang.String key, @org.jetbrains.annotations.NotNull java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        return new com.truecaller.ads.domain.core.adunit.AdUnitRemote(key, value);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.domain.core.adunit.AdUnitRemote)) {
            return false;
        }
        com.truecaller.ads.domain.core.adunit.AdUnitRemote adUnitRemote = (com.truecaller.ads.domain.core.adunit.AdUnitRemote) other;
        return kotlin.jvm.internal.Intrinsics.b(this.key, adUnitRemote.key) && kotlin.jvm.internal.Intrinsics.b(this.value, adUnitRemote.value);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.key.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("AdUnitRemote(key=", this.key, ", value=", this.value, ")");
    }
}
