package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleThemeApi;", "", "enable", "", "buttonColor", "", "lightColor", "mainColor", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnable", "()Z", "getButtonColor", "()Ljava/lang/String;", "getLightColor", "getMainColor", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoRuleThemeApi {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String buttonColor;
    private final boolean enable;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String lightColor;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String mainColor;

    public NeoRuleThemeApi(boolean z, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "buttonColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "lightColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "mainColor");
        this.enable = z;
        this.buttonColor = str;
        this.lightColor = str2;
        this.mainColor = str3;
    }

    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleThemeApi copy$default(com.truecaller.ads.adsrules.model.NeoRuleThemeApi neoRuleThemeApi, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = neoRuleThemeApi.enable;
        }
        if ((i & 2) != 0) {
            str = neoRuleThemeApi.buttonColor;
        }
        if ((i & 4) != 0) {
            str2 = neoRuleThemeApi.lightColor;
        }
        if ((i & 8) != 0) {
            str3 = neoRuleThemeApi.mainColor;
        }
        return neoRuleThemeApi.copy(z, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getButtonColor() {
        return this.buttonColor;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLightColor() {
        return this.lightColor;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getMainColor() {
        return this.mainColor;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoRuleThemeApi copy(boolean enable, @org.jetbrains.annotations.NotNull java.lang.String buttonColor, @org.jetbrains.annotations.NotNull java.lang.String lightColor, @org.jetbrains.annotations.NotNull java.lang.String mainColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonColor, "buttonColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lightColor, "lightColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mainColor, "mainColor");
        return new com.truecaller.ads.adsrules.model.NeoRuleThemeApi(enable, buttonColor, lightColor, mainColor);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoRuleThemeApi)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoRuleThemeApi neoRuleThemeApi = (com.truecaller.ads.adsrules.model.NeoRuleThemeApi) other;
        return this.enable == neoRuleThemeApi.enable && kotlin.jvm.internal.Intrinsics.b(this.buttonColor, neoRuleThemeApi.buttonColor) && kotlin.jvm.internal.Intrinsics.b(this.lightColor, neoRuleThemeApi.lightColor) && kotlin.jvm.internal.Intrinsics.b(this.mainColor, neoRuleThemeApi.mainColor);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getButtonColor() {
        return this.buttonColor;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLightColor() {
        return this.lightColor;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMainColor() {
        return this.mainColor;
    }

    public int hashCode() {
        int i;
        if (this.enable) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.mainColor.hashCode() + ax1.bar.e(ax1.bar.e(i * 31, 31, this.buttonColor), 31, this.lightColor);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.enable;
        java.lang.String str = this.buttonColor;
        return bar.x(bx.e1.u("NeoRuleThemeApi(enable=", ", buttonColor=", str, ", lightColor=", z), this.lightColor, ", mainColor=", this.mainColor, ")");
    }
}
