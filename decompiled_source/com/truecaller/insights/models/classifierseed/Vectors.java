package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/Vectors;", "", "barrierValue", "", "classMetas", "", "Lcom/truecaller/insights/models/classifierseed/ClassMeta;", "probabilities", "Lcom/truecaller/insights/models/classifierseed/Probability;", "version", "<init>", "(ILjava/util/List;Ljava/util/List;I)V", "getBarrierValue", "()I", "getClassMetas", "()Ljava/util/List;", "getProbabilities", "getVersion", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Vectors {

    @bw.qux("barrierValue")
    private final int barrierValue;

    @bw.qux("classMetas")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.models.classifierseed.ClassMeta> classMetas;

    @bw.qux("probabilities")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.models.classifierseed.Probability> probabilities;

    @bw.qux("version")
    private final int version;

    public Vectors(int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.ClassMeta> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.Probability> list2, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "classMetas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "probabilities");
        this.barrierValue = i;
        this.classMetas = list;
        this.probabilities = list2;
        this.version = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.models.classifierseed.Vectors copy$default(com.truecaller.insights.models.classifierseed.Vectors vectors, int i, java.util.List list, java.util.List list2, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = vectors.barrierValue;
        }
        if ((i3 & 2) != 0) {
            list = vectors.classMetas;
        }
        if ((i3 & 4) != 0) {
            list2 = vectors.probabilities;
        }
        if ((i3 & 8) != 0) {
            i2 = vectors.version;
        }
        return vectors.copy(i, list, list2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBarrierValue() {
        return this.barrierValue;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.classifierseed.ClassMeta> component2() {
        return this.classMetas;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.classifierseed.Probability> component3() {
        return this.probabilities;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.Vectors copy(int barrierValue, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.ClassMeta> classMetas, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.Probability> probabilities, int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classMetas, "classMetas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        return new com.truecaller.insights.models.classifierseed.Vectors(barrierValue, classMetas, probabilities, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.Vectors)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.Vectors vectors = (com.truecaller.insights.models.classifierseed.Vectors) other;
        return this.barrierValue == vectors.barrierValue && kotlin.jvm.internal.Intrinsics.b(this.classMetas, vectors.classMetas) && kotlin.jvm.internal.Intrinsics.b(this.probabilities, vectors.probabilities) && this.version == vectors.version;
    }

    public final int getBarrierValue() {
        return this.barrierValue;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.classifierseed.ClassMeta> getClassMetas() {
        return this.classMetas;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.classifierseed.Probability> getProbabilities() {
        return this.probabilities;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return uf.qux.g(uf.qux.g(this.barrierValue * 31, 31, this.classMetas), 31, this.probabilities) + this.version;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Vectors(barrierValue=" + this.barrierValue + ", classMetas=" + this.classMetas + ", probabilities=" + this.probabilities + ", version=" + this.version + ")";
    }
}
