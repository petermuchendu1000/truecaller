package com.truecaller.voicemail.api.data;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/truecaller/voicemail/api/data/Carrier;", "", com.unity3d.ads.metadata.MediationMetaData.KEY_NAME, "", "activationCode", "disableCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getActivationCode", "getDisableCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final /* data */ class Carrier {

    @org.jetbrains.annotations.NotNull
    private final java.lang.String activationCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String disableCode;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    public Carrier(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "activationCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "disableCode");
        this.name = str;
        this.activationCode = str2;
        this.disableCode = str3;
    }

    public static /* synthetic */ com.truecaller.voicemail.api.data.Carrier copy$default(com.truecaller.voicemail.api.data.Carrier carrier, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = carrier.name;
        }
        if ((i & 2) != 0) {
            str2 = carrier.activationCode;
        }
        if ((i & 4) != 0) {
            str3 = carrier.disableCode;
        }
        return carrier.copy(str, str2, str3);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getActivationCode() {
        return this.activationCode;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDisableCode() {
        return this.disableCode;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.voicemail.api.data.Carrier copy(@org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String activationCode, @org.jetbrains.annotations.NotNull java.lang.String disableCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, com.unity3d.ads.metadata.MediationMetaData.KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activationCode, "activationCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableCode, "disableCode");
        return new com.truecaller.voicemail.api.data.Carrier(name, activationCode, disableCode);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.voicemail.api.data.Carrier)) {
            return false;
        }
        com.truecaller.voicemail.api.data.Carrier carrier = (com.truecaller.voicemail.api.data.Carrier) other;
        return kotlin.jvm.internal.Intrinsics.b(this.name, carrier.name) && kotlin.jvm.internal.Intrinsics.b(this.activationCode, carrier.activationCode) && kotlin.jvm.internal.Intrinsics.b(this.disableCode, carrier.disableCode);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getActivationCode() {
        return this.activationCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisableCode() {
        return this.disableCode;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.disableCode.hashCode() + ax1.bar.e(this.name.hashCode() * 31, 31, this.activationCode);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bar.v(this.disableCode, ")", ro0.f.E("Carrier(name=", this.name, ", activationCode=", this.activationCode, ", disableCode="));
    }
}
