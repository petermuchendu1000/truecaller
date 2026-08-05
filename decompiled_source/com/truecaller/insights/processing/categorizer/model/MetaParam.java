package com.truecaller.insights.processing.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/processing/categorizer/model/MetaParam;", "", "version", "", "meta", "", "", "<init>", "(ILjava/util/List;)V", "getVersion", "()I", "getMeta", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class MetaParam {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> meta;
    private final int version;

    public MetaParam(int i, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "meta");
        this.version = i;
        this.meta = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.processing.categorizer.model.MetaParam copy$default(com.truecaller.insights.processing.categorizer.model.MetaParam metaParam, int i, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = metaParam.version;
        }
        if ((i2 & 2) != 0) {
            list = metaParam.meta;
        }
        return metaParam.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component2() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.categorizer.model.MetaParam copy(int version, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        return new com.truecaller.insights.processing.categorizer.model.MetaParam(version, meta);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.categorizer.model.MetaParam)) {
            return false;
        }
        com.truecaller.insights.processing.categorizer.model.MetaParam metaParam = (com.truecaller.insights.processing.categorizer.model.MetaParam) other;
        return this.version == metaParam.version && kotlin.jvm.internal.Intrinsics.b(this.meta, metaParam.meta);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getMeta() {
        return this.meta;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.meta.hashCode() + (this.version * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "MetaParam(version=" + this.version + ", meta=" + this.meta + ")";
    }
}
