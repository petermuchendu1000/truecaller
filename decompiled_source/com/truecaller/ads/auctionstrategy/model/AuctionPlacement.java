package com.truecaller.ads.auctionstrategy.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/truecaller/ads/auctionstrategy/model/AuctionPlacement;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class AuctionPlacement {
    public static final int $stable = 0;
    private final boolean enabled;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;

    public AuctionPlacement(@org.jetbrains.annotations.NotNull java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        this.id = str;
        this.enabled = z;
    }

    public static /* synthetic */ com.truecaller.ads.auctionstrategy.model.AuctionPlacement copy$default(com.truecaller.ads.auctionstrategy.model.AuctionPlacement auctionPlacement, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = auctionPlacement.id;
        }
        if ((i & 2) != 0) {
            z = auctionPlacement.enabled;
        }
        return auctionPlacement.copy(str, z);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.auctionstrategy.model.AuctionPlacement copy(@org.jetbrains.annotations.NotNull java.lang.String id, boolean enabled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN);
        return new com.truecaller.ads.auctionstrategy.model.AuctionPlacement(id, enabled);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.auctionstrategy.model.AuctionPlacement)) {
            return false;
        }
        com.truecaller.ads.auctionstrategy.model.AuctionPlacement auctionPlacement = (com.truecaller.ads.auctionstrategy.model.AuctionPlacement) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, auctionPlacement.id) && this.enabled == auctionPlacement.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + (this.enabled ? 1231 : 1237);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return bx.e1.p("AuctionPlacement(id=", this.id, ", enabled=", this.enabled, ")");
    }
}
