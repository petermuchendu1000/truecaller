package com.truecaller.insights.processing.classifier;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JD\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b \u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0016¨\u0006%"}, d2 = {"Lcom/truecaller/insights/processing/classifier/AndroidMultiClassClassifierModel;", "", "", "Lcom/truecaller/insights/processing/classifier/AndroidClassMeta;", "classMetas", "Lcom/truecaller/insights/processing/classifier/AndroidWordToClassProb;", "probabilities", "", "version", "", "barrierValue", "<init>", "(Ljava/util/List;Ljava/util/List;ID)V", "", "toString", "()Ljava/lang/String;", "component1", "()Ljava/util/List;", "component2", "component3", "()I", "component4", "()D", "copy", "(Ljava/util/List;Ljava/util/List;ID)Lcom/truecaller/insights/processing/classifier/AndroidMultiClassClassifierModel;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getClassMetas", "getProbabilities", "I", "getVersion", "D", "getBarrierValue", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AndroidMultiClassClassifierModel {
    private final double barrierValue;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.processing.classifier.AndroidClassMeta> classMetas;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.processing.classifier.AndroidWordToClassProb> probabilities;
    private final int version;

    public AndroidMultiClassClassifierModel(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidClassMeta> list, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidWordToClassProb> list2, int i, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "classMetas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "probabilities");
        this.classMetas = list;
        this.probabilities = list2;
        this.version = i;
        this.barrierValue = d;
    }

    public static /* synthetic */ com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel copy$default(com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel androidMultiClassClassifierModel, java.util.List list, java.util.List list2, int i, double d, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = androidMultiClassClassifierModel.classMetas;
        }
        if ((i2 & 2) != 0) {
            list2 = androidMultiClassClassifierModel.probabilities;
        }
        if ((i2 & 4) != 0) {
            i = androidMultiClassClassifierModel.version;
        }
        if ((i2 & 8) != 0) {
            d = androidMultiClassClassifierModel.barrierValue;
        }
        int i3 = i;
        return androidMultiClassClassifierModel.copy(list, list2, i3, d);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.processing.classifier.AndroidClassMeta> component1() {
        return this.classMetas;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.processing.classifier.AndroidWordToClassProb> component2() {
        return this.probabilities;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final double getBarrierValue() {
        return this.barrierValue;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel copy(@org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidClassMeta> classMetas, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidWordToClassProb> probabilities, int version, double barrierValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classMetas, "classMetas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        return new com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel(classMetas, probabilities, version, barrierValue);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel)) {
            return false;
        }
        com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel androidMultiClassClassifierModel = (com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel) other;
        return kotlin.jvm.internal.Intrinsics.b(this.classMetas, androidMultiClassClassifierModel.classMetas) && kotlin.jvm.internal.Intrinsics.b(this.probabilities, androidMultiClassClassifierModel.probabilities) && this.version == androidMultiClassClassifierModel.version && java.lang.Double.compare(this.barrierValue, androidMultiClassClassifierModel.barrierValue) == 0;
    }

    public double getBarrierValue() {
        return this.barrierValue;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.insights.processing.classifier.AndroidClassMeta> getClassMetas() {
        return this.classMetas;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.insights.processing.classifier.AndroidWordToClassProb> getProbabilities() {
        return this.probabilities;
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int g = (uf.qux.g(this.classMetas.hashCode() * 31, 31, this.probabilities) + this.version) * 31;
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.barrierValue);
        return g + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        try {
            java.lang.String json = new com.google.gson.Gson().toJson(this, com.truecaller.insights.processing.classifier.AndroidMultiClassClassifierModel.class);
            kotlin.jvm.internal.Intrinsics.d(json);
            return json;
        } catch (com.google.gson.p unused) {
            return "";
        }
    }
}
