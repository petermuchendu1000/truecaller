package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0017\u001a\u00020\bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, d2 = {"Lcom/truecaller/ads/mediation/model/Partner;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "appKey", "name", "adapter", "ttl", "", "placement", "", "Lcom/truecaller/ads/mediation/model/Placement;", "openRtbVer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getAppKey", "getName", "getAdapter", "getPlacement", "()Ljava/util/List;", "getOpenRtbVer", "getTtl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Partner {
    public static final int $stable = 8;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String adapter;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String appKey;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String name;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String openRtbVer;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.Placement> placement;
    private final long ttl;

    public Partner(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.Nullable java.lang.String str2, @org.jetbrains.annotations.NotNull java.lang.String str3, @org.jetbrains.annotations.NotNull java.lang.String str4, long j, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.Placement> list, @org.jetbrains.annotations.Nullable java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "adapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "placement");
        this.id = str;
        this.appKey = str2;
        this.name = str3;
        this.adapter = str4;
        this.ttl = j;
        this.placement = list;
        this.openRtbVer = str5;
    }

    /* renamed from: component5, reason: from getter */
    private final long getTtl() {
        return this.ttl;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.Partner copy$default(com.truecaller.ads.mediation.model.Partner partner, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, java.util.List list, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = partner.id;
        }
        if ((i & 2) != 0) {
            str2 = partner.appKey;
        }
        if ((i & 4) != 0) {
            str3 = partner.name;
        }
        if ((i & 8) != 0) {
            str4 = partner.adapter;
        }
        if ((i & 16) != 0) {
            j = partner.ttl;
        }
        if ((i & 32) != 0) {
            list = partner.placement;
        }
        if ((i & 64) != 0) {
            str5 = partner.openRtbVer;
        }
        long j2 = j;
        java.lang.String str6 = str3;
        java.lang.String str7 = str4;
        return partner.copy(str, str2, str6, str7, j2, list, str5);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAppKey() {
        return this.appKey;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAdapter() {
        return this.adapter;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.Placement> component6() {
        return this.placement;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component7, reason: from getter */
    public final java.lang.String getOpenRtbVer() {
        return this.openRtbVer;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.Partner copy(@org.jetbrains.annotations.NotNull java.lang.String id, @org.jetbrains.annotations.Nullable java.lang.String appKey, @org.jetbrains.annotations.NotNull java.lang.String name, @org.jetbrains.annotations.NotNull java.lang.String adapter, long ttl, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.Placement> placement, @org.jetbrains.annotations.Nullable java.lang.String openRtbVer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adapter, "adapter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        return new com.truecaller.ads.mediation.model.Partner(id, appKey, name, adapter, ttl, placement, openRtbVer);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.Partner)) {
            return false;
        }
        com.truecaller.ads.mediation.model.Partner partner = (com.truecaller.ads.mediation.model.Partner) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, partner.id) && kotlin.jvm.internal.Intrinsics.b(this.appKey, partner.appKey) && kotlin.jvm.internal.Intrinsics.b(this.name, partner.name) && kotlin.jvm.internal.Intrinsics.b(this.adapter, partner.adapter) && this.ttl == partner.ttl && kotlin.jvm.internal.Intrinsics.b(this.placement, partner.placement) && kotlin.jvm.internal.Intrinsics.b(this.openRtbVer, partner.openRtbVer);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdapter() {
        return this.adapter;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAppKey() {
        return this.appKey;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return this.name;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOpenRtbVer() {
        return this.openRtbVer;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.Placement> getPlacement() {
        return this.placement;
    }

    public final long getTtl() {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.ttl);
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return 10L;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.id.hashCode() * 31;
        java.lang.String str = this.appKey;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int e = ax1.bar.e(ax1.bar.e((hashCode2 + hashCode) * 31, 31, this.name), 31, this.adapter);
        long j = this.ttl;
        int g = uf.qux.g((e + ((int) (j ^ (j >>> 32)))) * 31, 31, this.placement);
        java.lang.String str2 = this.openRtbVer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return g + i;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.appKey;
        java.lang.String str3 = this.name;
        java.lang.String str4 = this.adapter;
        long j = this.ttl;
        java.util.List<com.truecaller.ads.mediation.model.Placement> list = this.placement;
        java.lang.String str5 = this.openRtbVer;
        java.lang.StringBuilder E = ro0.f.E("Partner(id=", str, ", appKey=", str2, ", name=");
        bar.E(E, str3, ", adapter=", str4, ", ttl=");
        E.append(j);
        E.append(", placement=");
        E.append(list);
        return y.o.f(", openRtbVer=", str5, ")", E);
    }

    public /* synthetic */ Partner(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, java.util.List list, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, j, list, (i & 64) != 0 ? null : str5);
    }
}
