package com.truecaller.common.cloudtelephony.assistant.network;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lcom/truecaller/common/cloudtelephony/assistant/network/Carrier;", "", com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_ID, "", "name", "enableCode", "enableCodeAutoScreeningMode", "disableCode", "supportLink", "dialAllCodesToActivate", "", "dialOnlyBusyCodeToActivate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getId", "()Ljava/lang/String;", "getName", "getEnableCode", "getEnableCodeAutoScreeningMode", "getDisableCode", "getSupportLink", "getDialAllCodesToActivate", "()Z", "getDialOnlyBusyCodeToActivate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "common-cloud-telephony_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final /* data */ class Carrier {
    public static final int $stable = 0;
    private final boolean dialAllCodesToActivate;
    private final boolean dialOnlyBusyCodeToActivate;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String disableCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String enableCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String enableCodeAutoScreeningMode;

    @bw.qux("_id")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String supportLink;

    public Carrier(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, @org.jetbrains.annotations.NotNull java.lang.String str5, @org.jetbrains.annotations.NotNull java.lang.String str6, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_ID);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "enableCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "enableCodeAutoScreeningMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "disableCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "supportLink");
        this.id = str;
        this.name = str2;
        this.enableCode = str3;
        this.enableCodeAutoScreeningMode = str4;
        this.disableCode = str5;
        this.supportLink = str6;
        this.dialAllCodesToActivate = z;
        this.dialOnlyBusyCodeToActivate = z2;
    }

    public static /* synthetic */ com.truecaller.common.cloudtelephony.assistant.network.Carrier copy$default(com.truecaller.common.cloudtelephony.assistant.network.Carrier carrier, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = carrier.id;
        }
        if ((i & 2) != 0) {
            str2 = carrier.name;
        }
        if ((i & 4) != 0) {
            str3 = carrier.enableCode;
        }
        if ((i & 8) != 0) {
            str4 = carrier.enableCodeAutoScreeningMode;
        }
        if ((i & 16) != 0) {
            str5 = carrier.disableCode;
        }
        if ((i & 32) != 0) {
            str6 = carrier.supportLink;
        }
        if ((i & 64) != 0) {
            z = carrier.dialAllCodesToActivate;
        }
        if ((i & com.ctc.wstx.cfg.OutputConfigFlags.CFG_AUTOMATIC_END_ELEMENTS) != 0) {
            z2 = carrier.dialOnlyBusyCodeToActivate;
        }
        boolean z3 = z;
        boolean z4 = z2;
        java.lang.String str7 = str5;
        java.lang.String str8 = str6;
        return carrier.copy(str, str2, str3, str4, str7, str8, z3, z4);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEnableCode() {
        return this.enableCode;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEnableCodeAutoScreeningMode() {
        return this.enableCodeAutoScreeningMode;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDisableCode() {
        return this.disableCode;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSupportLink() {
        return this.supportLink;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDialAllCodesToActivate() {
        return this.dialAllCodesToActivate;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getDialOnlyBusyCodeToActivate() {
        return this.dialOnlyBusyCodeToActivate;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.common.cloudtelephony.assistant.network.Carrier copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String enableCode, @org.jetbrains.annotations.NotNull java.lang.String enableCodeAutoScreeningMode, @org.jetbrains.annotations.NotNull java.lang.String disableCode, @org.jetbrains.annotations.NotNull java.lang.String supportLink, boolean dialAllCodesToActivate, boolean dialOnlyBusyCodeToActivate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.google.ads.mediation.facebook.FacebookMediationAdapter.KEY_ID);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enableCode, "enableCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enableCodeAutoScreeningMode, "enableCodeAutoScreeningMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableCode, "disableCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportLink, "supportLink");
        return new com.truecaller.common.cloudtelephony.assistant.network.Carrier(id, name, enableCode, enableCodeAutoScreeningMode, disableCode, supportLink, dialAllCodesToActivate, dialOnlyBusyCodeToActivate);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.common.cloudtelephony.assistant.network.Carrier)) {
            return false;
        }
        com.truecaller.common.cloudtelephony.assistant.network.Carrier carrier = (com.truecaller.common.cloudtelephony.assistant.network.Carrier) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, carrier.id) && kotlin.jvm.internal.Intrinsics.b(this.name, carrier.name) && kotlin.jvm.internal.Intrinsics.b(this.enableCode, carrier.enableCode) && kotlin.jvm.internal.Intrinsics.b(this.enableCodeAutoScreeningMode, carrier.enableCodeAutoScreeningMode) && kotlin.jvm.internal.Intrinsics.b(this.disableCode, carrier.disableCode) && kotlin.jvm.internal.Intrinsics.b(this.supportLink, carrier.supportLink) && this.dialAllCodesToActivate == carrier.dialAllCodesToActivate && this.dialOnlyBusyCodeToActivate == carrier.dialOnlyBusyCodeToActivate;
    }

    public final boolean getDialAllCodesToActivate() {
        return this.dialAllCodesToActivate;
    }

    public final boolean getDialOnlyBusyCodeToActivate() {
        return this.dialOnlyBusyCodeToActivate;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisableCode() {
        return this.disableCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnableCode() {
        return this.enableCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEnableCodeAutoScreeningMode() {
        return this.enableCodeAutoScreeningMode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSupportLink() {
        return this.supportLink;
    }

    public int hashCode() {
        int i;
        int e = ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(ax1.bar.e(this.id.hashCode() * 31, 31, this.name), 31, this.enableCode), 31, this.enableCodeAutoScreeningMode), 31, this.disableCode), 31, this.supportLink);
        int i2 = 1237;
        if (this.dialAllCodesToActivate) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (e + i) * 31;
        if (this.dialOnlyBusyCodeToActivate) {
            i2 = 1231;
        }
        return i3 + i2;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.enableCode;
        java.lang.String str4 = this.enableCodeAutoScreeningMode;
        java.lang.String str5 = this.disableCode;
        java.lang.String str6 = this.supportLink;
        boolean z = this.dialAllCodesToActivate;
        boolean z2 = this.dialOnlyBusyCodeToActivate;
        java.lang.StringBuilder E = ro0.f.E("Carrier(id=", str, ", name=", str2, ", enableCode=");
        bar.E(E, str3, ", enableCodeAutoScreeningMode=", str4, ", disableCode=");
        bar.E(E, str5, ", supportLink=", str6, ", dialAllCodesToActivate=");
        return ax1.bar.q(E, z, ", dialOnlyBusyCodeToActivate=", z2, ")");
    }
}
