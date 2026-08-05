package com.truecaller.ads.mediation.google;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/mediation/google/MediationExtra;", "", "gamAdRequestId", "", "requestSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getGamAdRequestId", "()Ljava/lang/String;", "getRequestSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MediationExtra {
    public static final int $stable = 0;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String gamAdRequestId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String requestSource;

    public MediationExtra(@org.jetbrains.annotations.Nullable java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2) {
        this.gamAdRequestId = str;
        this.requestSource = str2;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.google.MediationExtra copy$default(com.truecaller.ads.mediation.google.MediationExtra mediationExtra, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mediationExtra.gamAdRequestId;
        }
        if ((i & 2) != 0) {
            str2 = mediationExtra.requestSource;
        }
        return mediationExtra.copy(str, str2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getGamAdRequestId() {
        return this.gamAdRequestId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestSource() {
        return this.requestSource;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.google.MediationExtra copy(@org.jetbrains.annotations.Nullable java.lang.String gamAdRequestId, @org.jetbrains.annotations.Nullable java.lang.String requestSource) {
        return new com.truecaller.ads.mediation.google.MediationExtra(gamAdRequestId, requestSource);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.google.MediationExtra)) {
            return false;
        }
        com.truecaller.ads.mediation.google.MediationExtra mediationExtra = (com.truecaller.ads.mediation.google.MediationExtra) other;
        return kotlin.jvm.internal.Intrinsics.b(this.gamAdRequestId, mediationExtra.gamAdRequestId) && kotlin.jvm.internal.Intrinsics.b(this.requestSource, mediationExtra.requestSource);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGamAdRequestId() {
        return this.gamAdRequestId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRequestSource() {
        return this.requestSource;
    }

    public int hashCode() {
        java.lang.String str = this.gamAdRequestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.requestSource;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return y.o.e("MediationExtra(gamAdRequestId=", this.gamAdRequestId, ", requestSource=", this.requestSource, ")");
    }
}
