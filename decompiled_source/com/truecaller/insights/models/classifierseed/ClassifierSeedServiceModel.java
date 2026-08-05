package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/ClassifierSeedServiceModel;", "", "meta", "Lcom/truecaller/insights/models/classifierseed/Meta;", "data", "Lcom/truecaller/insights/models/classifierseed/Data;", "<init>", "(Lcom/truecaller/insights/models/classifierseed/Meta;Lcom/truecaller/insights/models/classifierseed/Data;)V", "getMeta", "()Lcom/truecaller/insights/models/classifierseed/Meta;", "getData", "()Lcom/truecaller/insights/models/classifierseed/Data;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ClassifierSeedServiceModel {

    @bw.qux("data")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.models.classifierseed.Data data;

    @bw.qux("meta")
    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.models.classifierseed.Meta meta;

    public ClassifierSeedServiceModel(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.classifierseed.Meta meta, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.classifierseed.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        this.meta = meta;
        this.data = data;
    }

    public static /* synthetic */ com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel copy$default(com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel classifierSeedServiceModel, com.truecaller.insights.models.classifierseed.Meta meta, com.truecaller.insights.models.classifierseed.Data data, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            meta = classifierSeedServiceModel.meta;
        }
        if ((i & 2) != 0) {
            data = classifierSeedServiceModel.data;
        }
        return classifierSeedServiceModel.copy(meta, data);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final com.truecaller.insights.models.classifierseed.Meta getMeta() {
        return this.meta;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.insights.models.classifierseed.Data getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel copy(@org.jetbrains.annotations.NotNull com.truecaller.insights.models.classifierseed.Meta meta, @org.jetbrains.annotations.NotNull com.truecaller.insights.models.classifierseed.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(meta, "meta");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        return new com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel(meta, data);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel classifierSeedServiceModel = (com.truecaller.insights.models.classifierseed.ClassifierSeedServiceModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.meta, classifierSeedServiceModel.meta) && kotlin.jvm.internal.Intrinsics.b(this.data, classifierSeedServiceModel.data);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.Data getData() {
        return this.data;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.Meta getMeta() {
        return this.meta;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.meta.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "ClassifierSeedServiceModel(meta=" + this.meta + ", data=" + this.data + ")";
    }
}
