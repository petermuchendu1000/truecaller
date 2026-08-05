package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/truecaller/ads/vast/Creative;", "", "sequence", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "linear", "", "Lcom/truecaller/ads/vast/Linear;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSequence", "()Ljava/lang/String;", "getId", "getLinear", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Creative {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.truecaller.ads.vast.Linear> linear;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String sequence;

    public Creative(@ak.f0("sequence") @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("id") @org.jetbrains.annotations.Nullable java.lang.String str2, @ak.f0("Linear") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Linear> list) {
        this.sequence = str;
        this.id = str2;
        this.linear = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.ads.vast.Creative copy$default(com.truecaller.ads.vast.Creative creative, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = creative.sequence;
        }
        if ((i & 2) != 0) {
            str2 = creative.id;
        }
        if ((i & 4) != 0) {
            list = creative.linear;
        }
        return creative.copy(str, str2, list);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSequence() {
        return this.sequence;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Linear> component3() {
        return this.linear;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Creative copy(@ak.f0("sequence") @org.jetbrains.annotations.Nullable java.lang.String sequence, @ak.f0("id") @org.jetbrains.annotations.Nullable java.lang.String id, @ak.f0("Linear") @org.jetbrains.annotations.Nullable java.util.List<com.truecaller.ads.vast.Linear> linear) {
        return new com.truecaller.ads.vast.Creative(sequence, id, linear);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Creative)) {
            return false;
        }
        com.truecaller.ads.vast.Creative creative = (com.truecaller.ads.vast.Creative) other;
        return kotlin.jvm.internal.Intrinsics.b(this.sequence, creative.sequence) && kotlin.jvm.internal.Intrinsics.b(this.id, creative.id) && kotlin.jvm.internal.Intrinsics.b(this.linear, creative.linear);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.truecaller.ads.vast.Linear> getLinear() {
        return this.linear;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        java.lang.String str = this.sequence;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.List<com.truecaller.ads.vast.Linear> list = this.linear;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.sequence;
        java.lang.String str2 = this.id;
        return y.o.g(ro0.f.E("Creative(sequence=", str, ", id=", str2, ", linear="), this.linear, ")");
    }
}
