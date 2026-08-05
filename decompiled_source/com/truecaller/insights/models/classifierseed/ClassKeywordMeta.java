package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/ClassKeywordMeta;", "", "classIdentifier", "", "probs", "", "tf", "<init>", "(ILjava/lang/Double;Ljava/lang/Integer;)V", "getClassIdentifier", "()I", "getProbs", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTf", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/Double;Ljava/lang/Integer;)Lcom/truecaller/insights/models/classifierseed/ClassKeywordMeta;", "equals", "", "other", "hashCode", "toString", "", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ClassKeywordMeta {

    @bw.qux("class")
    private final int classIdentifier;

    @bw.qux("probs")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double probs;

    @bw.qux("tf")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer tf;

    public ClassKeywordMeta(int i, @org.jetbrains.annotations.Nullable java.lang.Double d, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        this.classIdentifier = i;
        this.probs = d;
        this.tf = num;
    }

    public static /* synthetic */ com.truecaller.insights.models.classifierseed.ClassKeywordMeta copy$default(com.truecaller.insights.models.classifierseed.ClassKeywordMeta classKeywordMeta, int i, java.lang.Double d, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = classKeywordMeta.classIdentifier;
        }
        if ((i2 & 2) != 0) {
            d = classKeywordMeta.probs;
        }
        if ((i2 & 4) != 0) {
            num = classKeywordMeta.tf;
        }
        return classKeywordMeta.copy(i, d, num);
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
    public final java.lang.Integer getTf() {
        return this.tf;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.ClassKeywordMeta copy(int classIdentifier, @org.jetbrains.annotations.Nullable java.lang.Double probs, @org.jetbrains.annotations.Nullable java.lang.Integer tf) {
        return new com.truecaller.insights.models.classifierseed.ClassKeywordMeta(classIdentifier, probs, tf);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.ClassKeywordMeta)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.ClassKeywordMeta classKeywordMeta = (com.truecaller.insights.models.classifierseed.ClassKeywordMeta) other;
        return this.classIdentifier == classKeywordMeta.classIdentifier && kotlin.jvm.internal.Intrinsics.b(this.probs, classKeywordMeta.probs) && kotlin.jvm.internal.Intrinsics.b(this.tf, classKeywordMeta.tf);
    }

    public final int getClassIdentifier() {
        return this.classIdentifier;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getProbs() {
        return this.probs;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTf() {
        return this.tf;
    }

    public int hashCode() {
        int i = this.classIdentifier * 31;
        java.lang.Double d = this.probs;
        int hashCode = (i + (d == null ? 0 : d.hashCode())) * 31;
        java.lang.Integer num = this.tf;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.classIdentifier;
        java.lang.Double d = this.probs;
        java.lang.Integer num = this.tf;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassKeywordMeta(classIdentifier=");
        sb.append(i);
        sb.append(", probs=");
        sb.append(d);
        sb.append(", tf=");
        return com.appsflyer.internal.e.m(sb, num, ")");
    }
}
