package com.truecaller.ads.adsrules.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006&"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoStatus;", "Landroid/os/Parcelable;", "isNeoUser", "", "adUnitId", "", "Lcom/truecaller/ads/provider/adunitid/AdUnitId;", "placement", "", "experimentId", "audienceCohort", "<init>", "(ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getAdUnitId", "()Ljava/util/List;", "getPlacement", "()Ljava/lang/String;", "getExperimentId", "getAudienceCohort", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class NeoStatus implements android.os.Parcelable {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    public static final android.os.Parcelable.Creator<com.truecaller.ads.adsrules.model.NeoStatus> CREATOR = new om0.bar(23);

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> adUnitId;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String audienceCohort;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String experimentId;
    private final boolean isNeoUser;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String placement;

    public NeoStatus(boolean z, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> list, @org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.Nullable java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "placement");
        this.isNeoUser = z;
        this.adUnitId = list;
        this.placement = str;
        this.experimentId = str2;
        this.audienceCohort = str3;
    }

    public static /* synthetic */ com.truecaller.ads.adsrules.model.NeoStatus copy$default(com.truecaller.ads.adsrules.model.NeoStatus neoStatus, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = neoStatus.isNeoUser;
        }
        if ((i & 2) != 0) {
            list = neoStatus.adUnitId;
        }
        if ((i & 4) != 0) {
            str = neoStatus.placement;
        }
        if ((i & 8) != 0) {
            str2 = neoStatus.experimentId;
        }
        if ((i & 16) != 0) {
            str3 = neoStatus.audienceCohort;
        }
        java.lang.String str4 = str3;
        java.lang.String str5 = str;
        return neoStatus.copy(z, list, str5, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsNeoUser() {
        return this.isNeoUser;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> component2() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getExperimentId() {
        return this.experimentId;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAudienceCohort() {
        return this.audienceCohort;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.adsrules.model.NeoStatus copy(boolean isNeoUser, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> adUnitId, @org.jetbrains.annotations.NotNull java.lang.String placement, @org.jetbrains.annotations.Nullable java.lang.String experimentId, @org.jetbrains.annotations.Nullable java.lang.String audienceCohort) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.adsrules.model.NeoStatus(isNeoUser, adUnitId, placement, experimentId, audienceCohort);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.adsrules.model.NeoStatus)) {
            return false;
        }
        com.truecaller.ads.adsrules.model.NeoStatus neoStatus = (com.truecaller.ads.adsrules.model.NeoStatus) other;
        return this.isNeoUser == neoStatus.isNeoUser && kotlin.jvm.internal.Intrinsics.b(this.adUnitId, neoStatus.adUnitId) && kotlin.jvm.internal.Intrinsics.b(this.placement, neoStatus.placement) && kotlin.jvm.internal.Intrinsics.b(this.experimentId, neoStatus.experimentId) && kotlin.jvm.internal.Intrinsics.b(this.audienceCohort, neoStatus.audienceCohort);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> getAdUnitId() {
        return this.adUnitId;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAudienceCohort() {
        return this.audienceCohort;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getExperimentId() {
        return this.experimentId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPlacement() {
        return this.placement;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.isNeoUser) {
            i = 1231;
        } else {
            i = 1237;
        }
        int e = ax1.bar.e(uf.qux.g(i * 31, 31, this.adUnitId), 31, this.placement);
        java.lang.String str = this.experimentId;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = (e + hashCode) * 31;
        java.lang.String str2 = this.audienceCohort;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final boolean isNeoUser() {
        return this.isNeoUser;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        boolean z = this.isNeoUser;
        java.util.List<com.truecaller.ads.provider.adunitid.AdUnitId> list = this.adUnitId;
        java.lang.String str = this.placement;
        java.lang.String str2 = this.experimentId;
        java.lang.String str3 = this.audienceCohort;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NeoStatus(isNeoUser=");
        sb.append(z);
        sb.append(", adUnitId=");
        sb.append(list);
        sb.append(", placement=");
        bar.E(sb, str, ", experimentId=", str2, ", audienceCohort=");
        return bar.v(str3, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@org.jetbrains.annotations.NotNull android.os.Parcel dest, int flags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.isNeoUser ? 1 : 0);
        java.util.Iterator f = z0.a0.f(this.adUnitId, dest);
        while (f.hasNext()) {
            ((com.truecaller.ads.provider.adunitid.AdUnitId) f.next()).writeToParcel(dest, flags);
        }
        dest.writeString(this.placement);
        dest.writeString(this.experimentId);
        dest.writeString(this.audienceCohort);
    }

    public /* synthetic */ NeoStatus(boolean z, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, list, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
