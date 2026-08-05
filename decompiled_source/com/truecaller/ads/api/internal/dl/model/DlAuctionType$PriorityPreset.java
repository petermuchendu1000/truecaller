package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlAuctionType$PriorityPreset", "Lw20/bar;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlAuctionType$PriorityPreset implements w20.bar {
    public final int a;

    public DlAuctionType$PriorityPreset(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.api.internal.dl.model.DlAuctionType$PriorityPreset) && this.a == ((com.truecaller.ads.api.internal.dl.model.DlAuctionType$PriorityPreset) obj).a;
    }

    /* renamed from: hashCode, reason: from getter */
    public final int getA() {
        return this.a;
    }

    public final java.lang.String toString() {
        return y.o.d(this.a, "PriorityPreset(presetId=", ")");
    }
}
