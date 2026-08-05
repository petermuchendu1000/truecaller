package com.truecaller.ads.mediation.model.rtb;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"com/truecaller/ads/mediation/model/rtb/Asset$DataAsset", "Lz70/bar;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "required", "Lcom/truecaller/ads/mediation/model/rtb/Data;", "data", "<init>", "(IILcom/truecaller/ads/mediation/model/rtb/Data;)V", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "len", "(IIII)V", "component1", "()I", "component2", "component3", "()Lcom/truecaller/ads/mediation/model/rtb/Data;", "Lcom/truecaller/ads/mediation/model/rtb/Asset$DataAsset;", "copy", "(IILcom/truecaller/ads/mediation/model/rtb/Data;)Lcom/truecaller/ads/mediation/model/rtb/Asset$DataAsset;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getRequired", "Lcom/truecaller/ads/mediation/model/rtb/Data;", "getData", "getType", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Asset$DataAsset extends z70.bar {
    public static final int $stable = 0;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.ads.mediation.model.rtb.Data data;
    private final int id;
    private final int required;

    public Asset$DataAsset(int i, int i2, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.id = i;
        this.required = i2;
        this.data = data;
    }

    public static /* synthetic */ com.truecaller.ads.mediation.model.rtb.Asset$DataAsset copy$default(com.truecaller.ads.mediation.model.rtb.Asset$DataAsset asset$DataAsset, int i, int i2, com.truecaller.ads.mediation.model.rtb.Data data, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = asset$DataAsset.id;
        }
        if ((i3 & 2) != 0) {
            i2 = asset$DataAsset.required;
        }
        if ((i3 & 4) != 0) {
            data = asset$DataAsset.data;
        }
        return asset$DataAsset.copy(i, i2, data);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRequired() {
        return this.required;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.mediation.model.rtb.Data getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Asset$DataAsset copy(int id, int required, @org.jetbrains.annotations.NotNull com.truecaller.ads.mediation.model.rtb.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new com.truecaller.ads.mediation.model.rtb.Asset$DataAsset(id, required, data);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.mediation.model.rtb.Asset$DataAsset)) {
            return false;
        }
        com.truecaller.ads.mediation.model.rtb.Asset$DataAsset asset$DataAsset = (com.truecaller.ads.mediation.model.rtb.Asset$DataAsset) other;
        return this.id == asset$DataAsset.id && this.required == asset$DataAsset.required && kotlin.jvm.internal.Intrinsics.b(this.data, asset$DataAsset.data);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.mediation.model.rtb.Data getData() {
        return this.data;
    }

    public int getId() {
        return this.id;
    }

    public int getRequired() {
        return this.required;
    }

    public final int getType() {
        return this.data.getType();
    }

    public int hashCode() {
        return this.data.hashCode() + (((this.id * 31) + this.required) * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.id;
        int i2 = this.required;
        com.truecaller.ads.mediation.model.rtb.Data data = this.data;
        java.lang.StringBuilder e = z0.a0.e(i, i2, "DataAsset(id=", ", required=", ", data=");
        e.append(data);
        e.append(")");
        return e.toString();
    }

    public Asset$DataAsset(int i, int i2, int i3, int i4) {
        this(i, i2, new com.truecaller.ads.mediation.model.rtb.Data(i3, i4));
    }
}
