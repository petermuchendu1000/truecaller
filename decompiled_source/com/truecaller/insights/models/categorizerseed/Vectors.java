package com.truecaller.insights.models.categorizerseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\bHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/truecaller/insights/models/categorizerseed/Vectors;", "", "meta", "", "", "probabilities", "Lcom/truecaller/insights/models/categorizerseed/Probability;", "version", "", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "getMeta", "()Ljava/util/List;", "getProbabilities", "getVersion", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Vectors {

    @bw.qux("meta")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> meta;

    @bw.qux("probabilities")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.models.categorizerseed.Probability> probabilities;

    @bw.qux("version")
    private final int version;

    public Vectors(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.categorizerseed.Probability> list2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "meta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "probabilities");
        this.meta = list;
        this.probabilities = list2;
        this.version = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.models.categorizerseed.Vectors copy$default(com.truecaller.insights.models.categorizerseed.Vectors vectors, java.util.List list, java.util.List list2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = vectors.meta;
        }
        if ((i2 & 2) != 0) {
            list2 = vectors.probabilities;
        }
        if ((i2 & 4) != 0) {
            i = vectors.version;
        }
        return vectors.copy(list, list2, i);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component1() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.categorizerseed.Probability> component2() {
        return this.probabilities;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.Vectors copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> meta, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.categorizerseed.Probability> probabilities, int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        return new com.truecaller.insights.models.categorizerseed.Vectors(meta, probabilities, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.categorizerseed.Vectors)) {
            return false;
        }
        com.truecaller.insights.models.categorizerseed.Vectors vectors = (com.truecaller.insights.models.categorizerseed.Vectors) other;
        return kotlin.jvm.internal.Intrinsics.b(this.meta, vectors.meta) && kotlin.jvm.internal.Intrinsics.b(this.probabilities, vectors.probabilities) && this.version == vectors.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getMeta() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.categorizerseed.Probability> getProbabilities() {
        return this.probabilities;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return uf.qux.g(this.meta.hashCode() * 31, 31, this.probabilities) + this.version;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<java.lang.Double> list = this.meta;
        java.util.List<com.truecaller.insights.models.categorizerseed.Probability> list2 = this.probabilities;
        int i = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Vectors(meta=");
        sb.append(list);
        sb.append(", probabilities=");
        sb.append(list2);
        sb.append(", version=");
        return bar.m(i, ")", sb);
    }
}
