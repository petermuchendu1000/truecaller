package com.truecaller.ads.api.internal.dl.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/truecaller/ads/api/internal/dl/model/DlExpiryStrategy$Consumption", "Lw20/h;", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class DlExpiryStrategy$Consumption implements w20.h {
    public final long a;

    public DlExpiryStrategy$Consumption(long j) {
        this.a = j;
    }

    @Override // w20.h
    /* renamed from: a, reason: from getter */
    public final long getA() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.truecaller.ads.api.internal.dl.model.DlExpiryStrategy$Consumption) && this.a == ((com.truecaller.ads.api.internal.dl.model.DlExpiryStrategy$Consumption) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return com.ironsource.adqualitysdk.sdk.i.bar.m(this.a, "Consumption(ttl=", ")");
    }
}
