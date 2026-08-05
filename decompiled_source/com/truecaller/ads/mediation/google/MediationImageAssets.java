package com.truecaller.ads.mediation.google;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/mediation/google/MediationImageAssets;", "", "Lv70/i;", "iconDrawable", "imageDrawable", "<init>", "(Lv70/i;Lv70/i;)V", "component1", "()Lv70/i;", "component2", "copy", "(Lv70/i;Lv70/i;)Lcom/truecaller/ads/mediation/google/MediationImageAssets;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lv70/i;", "getIconDrawable", "getImageDrawable", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class MediationImageAssets {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final v70.i iconDrawable;

    @org.jetbrains.annotations.Nullable
    private final v70.i imageDrawable;

    public MediationImageAssets(@org.jetbrains.annotations.Nullable v70.i iVar, @org.jetbrains.annotations.Nullable v70.i iVar2) {
        this.iconDrawable = iVar;
        this.imageDrawable = iVar2;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.google.MediationImageAssets copy$default(com.truecaller.ads.mediation.google.MediationImageAssets mediationImageAssets, v70.i iVar, v70.i iVar2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iVar = mediationImageAssets.iconDrawable;
        }
        if ((i & 2) != 0) {
            iVar2 = mediationImageAssets.imageDrawable;
        }
        return mediationImageAssets.copy(iVar, iVar2);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final v70.i getIconDrawable() {
        return this.iconDrawable;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final v70.i getImageDrawable() {
        return this.imageDrawable;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.google.MediationImageAssets copy(@org.jetbrains.annotations.Nullable v70.i iconDrawable, @org.jetbrains.annotations.Nullable v70.i imageDrawable) {
        return new com.truecaller.ads.mediation.google.MediationImageAssets(iconDrawable, imageDrawable);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.google.MediationImageAssets)) {
            return false;
        }
        com.truecaller.ads.mediation.google.MediationImageAssets mediationImageAssets = (com.truecaller.ads.mediation.google.MediationImageAssets) other;
        return kotlin.jvm.internal.Intrinsics.b(this.iconDrawable, mediationImageAssets.iconDrawable) && kotlin.jvm.internal.Intrinsics.b(this.imageDrawable, mediationImageAssets.imageDrawable);
    }

    @org.jetbrains.annotations.Nullable
    public final v70.i getIconDrawable() {
        return this.iconDrawable;
    }

    @org.jetbrains.annotations.Nullable
    public final v70.i getImageDrawable() {
        return this.imageDrawable;
    }

    public int hashCode() {
        v70.i iVar = this.iconDrawable;
        int hashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        v70.i iVar2 = this.imageDrawable;
        return hashCode + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "MediationImageAssets(iconDrawable=" + this.iconDrawable + ", imageDrawable=" + this.imageDrawable + ")";
    }
}
