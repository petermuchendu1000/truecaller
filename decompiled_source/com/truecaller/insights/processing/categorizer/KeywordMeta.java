package com.truecaller.insights.processing.categorizer;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0014J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\f¨\u0006$"}, d2 = {"Lcom/truecaller/insights/processing/categorizer/KeywordMeta;", "", "probHam", "", "probSpam", "tfHam", "tfSpam", "idfHam", "idfSpam", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getProbHam", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProbSpam", "getTfHam", "getTfSpam", "getIdfHam", "getIdfSpam", "toVector", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/truecaller/insights/processing/categorizer/KeywordMeta;", "equals", "", "other", "hashCode", "", "toString", "", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class KeywordMeta {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double idfHam;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double idfSpam;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double probHam;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double probSpam;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double tfHam;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double tfSpam;

    public KeywordMeta(@org.jetbrains.annotations.Nullable java.lang.Double d, @org.jetbrains.annotations.Nullable java.lang.Double d2, @org.jetbrains.annotations.Nullable java.lang.Double d3, @org.jetbrains.annotations.Nullable java.lang.Double d4, @org.jetbrains.annotations.Nullable java.lang.Double d5, @org.jetbrains.annotations.Nullable java.lang.Double d6) {
        this.probHam = d;
        this.probSpam = d2;
        this.tfHam = d3;
        this.tfSpam = d4;
        this.idfHam = d5;
        this.idfSpam = d6;
    }

    public static /* synthetic */ com.truecaller.insights.processing.categorizer.KeywordMeta copy$default(com.truecaller.insights.processing.categorizer.KeywordMeta keywordMeta, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.Double d4, java.lang.Double d5, java.lang.Double d6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = keywordMeta.probHam;
        }
        if ((i & 2) != 0) {
            d2 = keywordMeta.probSpam;
        }
        if ((i & 4) != 0) {
            d3 = keywordMeta.tfHam;
        }
        if ((i & 8) != 0) {
            d4 = keywordMeta.tfSpam;
        }
        if ((i & 16) != 0) {
            d5 = keywordMeta.idfHam;
        }
        if ((i & 32) != 0) {
            d6 = keywordMeta.idfSpam;
        }
        java.lang.Double d7 = d5;
        java.lang.Double d8 = d6;
        return keywordMeta.copy(d, d2, d3, d4, d7, d8);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Double getProbHam() {
        return this.probHam;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getProbSpam() {
        return this.probSpam;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getTfHam() {
        return this.tfHam;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component4, reason: from getter */
    public final java.lang.Double getTfSpam() {
        return this.tfSpam;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component5, reason: from getter */
    public final java.lang.Double getIdfHam() {
        return this.idfHam;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.Double getIdfSpam() {
        return this.idfSpam;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.categorizer.KeywordMeta copy(@org.jetbrains.annotations.Nullable java.lang.Double probHam, @org.jetbrains.annotations.Nullable java.lang.Double probSpam, @org.jetbrains.annotations.Nullable java.lang.Double tfHam, @org.jetbrains.annotations.Nullable java.lang.Double tfSpam, @org.jetbrains.annotations.Nullable java.lang.Double idfHam, @org.jetbrains.annotations.Nullable java.lang.Double idfSpam) {
        return new com.truecaller.insights.processing.categorizer.KeywordMeta(probHam, probSpam, tfHam, tfSpam, idfHam, idfSpam);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.categorizer.KeywordMeta)) {
            return false;
        }
        com.truecaller.insights.processing.categorizer.KeywordMeta keywordMeta = (com.truecaller.insights.processing.categorizer.KeywordMeta) other;
        return kotlin.jvm.internal.Intrinsics.b(this.probHam, keywordMeta.probHam) && kotlin.jvm.internal.Intrinsics.b(this.probSpam, keywordMeta.probSpam) && kotlin.jvm.internal.Intrinsics.b(this.tfHam, keywordMeta.tfHam) && kotlin.jvm.internal.Intrinsics.b(this.tfSpam, keywordMeta.tfSpam) && kotlin.jvm.internal.Intrinsics.b(this.idfHam, keywordMeta.idfHam) && kotlin.jvm.internal.Intrinsics.b(this.idfSpam, keywordMeta.idfSpam);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getIdfHam() {
        return this.idfHam;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getIdfSpam() {
        return this.idfSpam;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getProbHam() {
        return this.probHam;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getProbSpam() {
        return this.probSpam;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTfHam() {
        return this.tfHam;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getTfSpam() {
        return this.tfSpam;
    }

    public int hashCode() {
        java.lang.Double d = this.probHam;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        java.lang.Double d2 = this.probSpam;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        java.lang.Double d3 = this.tfHam;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        java.lang.Double d4 = this.tfSpam;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Double d5 = this.idfHam;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        java.lang.Double d6 = this.idfSpam;
        return hashCode5 + (d6 != null ? d6.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "KeywordMeta(probHam=" + this.probHam + ", probSpam=" + this.probSpam + ", tfHam=" + this.tfHam + ", tfSpam=" + this.tfSpam + ", idfHam=" + this.idfHam + ", idfSpam=" + this.idfSpam + ")";
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> toVector() {
        return kotlin.collections.y.j(new java.lang.Double[]{this.probHam, this.probSpam, this.tfHam, this.tfSpam, this.idfHam, this.idfSpam});
    }
}
