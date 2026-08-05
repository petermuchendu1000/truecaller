package com.truecaller.ads.vast;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/truecaller/ads/vast/Ad;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "", "sequence", "inLine", "Lcom/truecaller/ads/vast/InLine;", "wrapper", "Lcom/truecaller/ads/vast/Wrapper;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/truecaller/ads/vast/InLine;Lcom/truecaller/ads/vast/Wrapper;)V", "getId", "()Ljava/lang/String;", "getSequence", "getInLine", "()Lcom/truecaller/ads/vast/InLine;", "getWrapper", "()Lcom/truecaller/ads/vast/Wrapper;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final /* data */ class Ad {
    public static final int $stable = 8;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String id;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.InLine inLine;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String sequence;

    @org.jetbrains.annotations.Nullable
    private final com.truecaller.ads.vast.Wrapper wrapper;

    public Ad(@ak.f0("id") @org.jetbrains.annotations.Nullable java.lang.String str, @ak.f0("sequence") @org.jetbrains.annotations.Nullable java.lang.String str2, @ak.f0("InLine") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.InLine inLine, @ak.f0("Wrapper") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.Wrapper wrapper) {
        this.id = str;
        this.sequence = str2;
        this.inLine = inLine;
        this.wrapper = wrapper;
    }

    public static /* synthetic */ com.truecaller.ads.vast.Ad copy$default(com.truecaller.ads.vast.Ad ad, java.lang.String str, java.lang.String str2, com.truecaller.ads.vast.InLine inLine, com.truecaller.ads.vast.Wrapper wrapper, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = ad.id;
        }
        if ((i & 2) != 0) {
            str2 = ad.sequence;
        }
        if ((i & 4) != 0) {
            inLine = ad.inLine;
        }
        if ((i & 8) != 0) {
            wrapper = ad.wrapper;
        }
        return ad.copy(str, str2, inLine, wrapper);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSequence() {
        return this.sequence;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final com.truecaller.ads.vast.InLine getInLine() {
        return this.inLine;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final com.truecaller.ads.vast.Wrapper getWrapper() {
        return this.wrapper;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.ads.vast.Ad copy(@ak.f0("id") @org.jetbrains.annotations.Nullable java.lang.String id, @ak.f0("sequence") @org.jetbrains.annotations.Nullable java.lang.String sequence, @ak.f0("InLine") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.InLine inLine, @ak.f0("Wrapper") @org.jetbrains.annotations.Nullable com.truecaller.ads.vast.Wrapper wrapper) {
        return new com.truecaller.ads.vast.Ad(id, sequence, inLine, wrapper);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.ads.vast.Ad)) {
            return false;
        }
        com.truecaller.ads.vast.Ad ad = (com.truecaller.ads.vast.Ad) other;
        return kotlin.jvm.internal.Intrinsics.b(this.id, ad.id) && kotlin.jvm.internal.Intrinsics.b(this.sequence, ad.sequence) && kotlin.jvm.internal.Intrinsics.b(this.inLine, ad.inLine) && kotlin.jvm.internal.Intrinsics.b(this.wrapper, ad.wrapper);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return this.id;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.InLine getInLine() {
        return this.inLine;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSequence() {
        return this.sequence;
    }

    @org.jetbrains.annotations.Nullable
    public final com.truecaller.ads.vast.Wrapper getWrapper() {
        return this.wrapper;
    }

    public int hashCode() {
        java.lang.String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.sequence;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.truecaller.ads.vast.InLine inLine = this.inLine;
        int hashCode3 = (hashCode2 + (inLine == null ? 0 : inLine.hashCode())) * 31;
        com.truecaller.ads.vast.Wrapper wrapper = this.wrapper;
        return hashCode3 + (wrapper != null ? wrapper.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.sequence;
        com.truecaller.ads.vast.InLine inLine = this.inLine;
        com.truecaller.ads.vast.Wrapper wrapper = this.wrapper;
        java.lang.StringBuilder E = ro0.f.E("Ad(id=", str, ", sequence=", str2, ", inLine=");
        E.append(inLine);
        E.append(", wrapper=");
        E.append(wrapper);
        E.append(")");
        return E.toString();
    }
}
