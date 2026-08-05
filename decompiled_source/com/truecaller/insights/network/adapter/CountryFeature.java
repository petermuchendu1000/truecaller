package com.truecaller.insights.network.adapter;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/network/adapter/CountryFeature;", "", "name", "", "isActive", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CountryFeature {
    private final boolean isActive;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public CountryFeature(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "name");
        this.name = str;
        this.isActive = z;
    }

    public static /* synthetic */ com.truecaller.insights.network.adapter.CountryFeature copy$default(com.truecaller.insights.network.adapter.CountryFeature countryFeature, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = countryFeature.name;
        }
        if ((i & 2) != 0) {
            z = countryFeature.isActive;
        }
        return countryFeature.copy(str, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.network.adapter.CountryFeature copy(@org.jetbrains.annotations.NotNull java.lang.String name, boolean isActive) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.truecaller.insights.network.adapter.CountryFeature(name, isActive);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.network.adapter.CountryFeature)) {
            return false;
        }
        com.truecaller.insights.network.adapter.CountryFeature countryFeature = (com.truecaller.insights.network.adapter.CountryFeature) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, countryFeature.name) && this.isActive == countryFeature.isActive;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + (this.isActive ? 1231 : 1237);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.p("CountryFeature(name=", this.name, ", isActive=", this.isActive, ")");
    }
}
