package com.truecaller.insights.processing.classifier;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/truecaller/insights/processing/classifier/AndroidClassKeywordMeta;", "", "", "classIdentifier", "", "probs", "tf", "<init>", "(ILjava/lang/Double;Ljava/lang/Double;)V", "component1", "()I", "component2", "()Ljava/lang/Double;", "component3", "copy", "(ILjava/lang/Double;Ljava/lang/Double;)Lcom/truecaller/insights/processing/classifier/AndroidClassKeywordMeta;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getClassIdentifier", "Ljava/lang/Double;", "getProbs", "getTf", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AndroidClassKeywordMeta {

    @bw.qux("class")
    private final int classIdentifier;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double probs;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double tf;

    public AndroidClassKeywordMeta(int i, @org.jetbrains.annotations.Nullable java.lang.Double d, @org.jetbrains.annotations.Nullable java.lang.Double d2) {
        this.classIdentifier = i;
        this.probs = d;
        this.tf = d2;
    }

    public static /* synthetic */ com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta copy$default(com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta androidClassKeywordMeta, int i, java.lang.Double d, java.lang.Double d2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidClassKeywordMeta.classIdentifier;
        }
        if ((i2 & 2) != 0) {
            d = androidClassKeywordMeta.probs;
        }
        if ((i2 & 4) != 0) {
            d2 = androidClassKeywordMeta.tf;
        }
        return androidClassKeywordMeta.copy(i, d, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getClassIdentifier() {
        return this.classIdentifier;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component2, reason: from getter */
    public final java.lang.Double getProbs() {
        return this.probs;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component3, reason: from getter */
    public final java.lang.Double getTf() {
        return this.tf;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta copy(int classIdentifier, @org.jetbrains.annotations.Nullable java.lang.Double probs, @org.jetbrains.annotations.Nullable java.lang.Double tf) {
        return new com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta(classIdentifier, probs, tf);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta)) {
            return false;
        }
        com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta androidClassKeywordMeta = (com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta) other;
        return this.classIdentifier == androidClassKeywordMeta.classIdentifier && kotlin.jvm.internal.Intrinsics.b(this.probs, androidClassKeywordMeta.probs) && kotlin.jvm.internal.Intrinsics.b(this.tf, androidClassKeywordMeta.tf);
    }

    public int getClassIdentifier() {
        return this.classIdentifier;
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Double getProbs() {
        return this.probs;
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Double getTf() {
        return this.tf;
    }

    public int hashCode() {
        int i = this.classIdentifier * 31;
        java.lang.Double d = this.probs;
        int hashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        java.lang.Double d2 = this.tf;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AndroidClassKeywordMeta(classIdentifier=" + this.classIdentifier + ", probs=" + this.probs + ", tf=" + this.tf + ")";
    }
}
