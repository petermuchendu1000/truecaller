package com.truecaller.insights.processing.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000B+\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/truecaller/insights/processing/categorizer/model/CategorizerModelImpl;", "", "Lcom/truecaller/insights/processing/categorizer/model/WordProbImpl;", "probabilities", "", "meta", "", "version", "<init>", "(Ljava/util/List;Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "component3", "()I", "copy", "(Ljava/util/List;Ljava/util/List;I)Lcom/truecaller/insights/processing/categorizer/model/CategorizerModelImpl;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getProbabilities", "getMeta", "I", "getVersion", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CategorizerModelImpl {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> meta;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> probabilities;
    private final int version;

    public CategorizerModelImpl(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> list, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> list2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "meta");
        this.probabilities = list;
        this.meta = list2;
        this.version = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl copy$default(com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl categorizerModelImpl, java.util.List list, java.util.List list2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = categorizerModelImpl.probabilities;
        }
        if ((i2 & 2) != 0) {
            list2 = categorizerModelImpl.meta;
        }
        if ((i2 & 4) != 0) {
            i = categorizerModelImpl.version;
        }
        return categorizerModelImpl.copy(list, list2, i);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> component1() {
        return this.probabilities;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component2() {
        return this.meta;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> probabilities, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> meta, int version) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        return new com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl(probabilities, meta, version);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl)) {
            return false;
        }
        com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl categorizerModelImpl = (com.truecaller.insights.processing.categorizer.model.CategorizerModelImpl) other;
        return kotlin.jvm.internal.Intrinsics.b(this.probabilities, categorizerModelImpl.probabilities) && kotlin.jvm.internal.Intrinsics.b(this.meta, categorizerModelImpl.meta) && this.version == categorizerModelImpl.version;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Double> getMeta() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> getProbabilities() {
        return this.probabilities;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return uf.qux.g(this.probabilities.hashCode() * 31, 31, this.meta) + this.version;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        java.util.List<com.truecaller.insights.processing.categorizer.model.WordProbImpl> list = this.probabilities;
        java.util.List<java.lang.Double> list2 = this.meta;
        int i = this.version;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CategorizerModelImpl(probabilities=");
        sb.append(list);
        sb.append(", meta=");
        sb.append(list2);
        sb.append(", version=");
        return bar.m(i, ")", sb);
    }
}
