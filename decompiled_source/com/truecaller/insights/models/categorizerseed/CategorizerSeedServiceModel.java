package com.truecaller.insights.models.categorizerseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/models/categorizerseed/CategorizerSeedServiceModel;", "", "data", "Lcom/truecaller/insights/models/categorizerseed/Data;", "meta", "Lcom/truecaller/insights/models/categorizerseed/Meta;", "<init>", "(Lcom/truecaller/insights/models/categorizerseed/Data;Lcom/truecaller/insights/models/categorizerseed/Meta;)V", "getData", "()Lcom/truecaller/insights/models/categorizerseed/Data;", "getMeta", "()Lcom/truecaller/insights/models/categorizerseed/Meta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CategorizerSeedServiceModel {

    @bw.qux("data")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.models.categorizerseed.Data data;

    @bw.qux("meta")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.models.categorizerseed.Meta meta;

    public CategorizerSeedServiceModel(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.categorizerseed.Data data, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.categorizerseed.Meta meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = data;
        this.meta = meta;
    }

    public static /* synthetic */ com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel copy$default(com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel categorizerSeedServiceModel, com.truecaller.insights.models.categorizerseed.Data data, com.truecaller.insights.models.categorizerseed.Meta meta, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            data = categorizerSeedServiceModel.data;
        }
        if ((i & 2) != 0) {
            meta = categorizerSeedServiceModel.meta;
        }
        return categorizerSeedServiceModel.copy(data, meta);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.insights.models.categorizerseed.Data getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.insights.models.categorizerseed.Meta getMeta() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel copy(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.categorizerseed.Data data, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.categorizerseed.Meta meta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        return new com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel(data, meta);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel)) {
            return false;
        }
        com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel categorizerSeedServiceModel = (com.truecaller.insights.models.categorizerseed.CategorizerSeedServiceModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.data, categorizerSeedServiceModel.data) && kotlin.jvm.internal.Intrinsics.b(this.meta, categorizerSeedServiceModel.meta);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.Data getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.meta.hashCode() + (this.data.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CategorizerSeedServiceModel(data=" + this.data + ", meta=" + this.meta + ")";
    }
}
