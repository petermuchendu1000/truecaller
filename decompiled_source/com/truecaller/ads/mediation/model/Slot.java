package com.truecaller.ads.mediation.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/truecaller/ads/mediation/model/Slot;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "size", "", "Lcom/truecaller/ads/mediation/model/AdSize;", "qps", "", "Lcom/truecaller/ads/mediation/model/PartnerQpsConfig;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getSize", "()Ljava/util/List;", "getQps", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Slot {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> qps;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.ads.mediation.model.AdSize> size;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String type;

    public Slot(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.AdSize> list, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "size");
        this.type = str;
        this.size = list;
        this.qps = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.mediation.model.Slot copy$default(com.truecaller.ads.mediation.model.Slot slot, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = slot.type;
        }
        if ((i & 2) != 0) {
            list = slot.size;
        }
        if ((i & 4) != 0) {
            list2 = slot.qps;
        }
        return slot.copy(str, list, list2);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.AdSize> component2() {
        return this.size;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> component3() {
        return this.qps;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.Slot copy(@org.jetbrains.annotations.NotNull java.lang.String type, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.ads.mediation.model.AdSize> size, @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> qps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        return new com.truecaller.ads.mediation.model.Slot(type, size, qps);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.Slot)) {
            return false;
        }
        com.truecaller.ads.mediation.model.Slot slot = (com.truecaller.ads.mediation.model.Slot) other;
        return kotlin.jvm.internal.Intrinsics.b(this.type, slot.type) && kotlin.jvm.internal.Intrinsics.b(this.size, slot.size) && kotlin.jvm.internal.Intrinsics.b(this.qps, slot.qps);
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> getQps() {
        return this.qps;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.ads.mediation.model.AdSize> getSize() {
        return this.size;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int g = uf.qux.g(this.type.hashCode() * 31, 31, this.size);
        java.util.List<com.truecaller.ads.mediation.model.PartnerQpsConfig> list = this.qps;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return g + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.type;
        java.util.List<com.truecaller.ads.mediation.model.AdSize> list = this.size;
        return y.o.g(com.appsflyer.internal.e.r("Slot(type=", str, ", size=", list, ", qps="), this.qps, ")");
    }
}
