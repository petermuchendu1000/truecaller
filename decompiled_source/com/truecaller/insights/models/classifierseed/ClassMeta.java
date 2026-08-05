package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016JL\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/ClassMeta;", "", "classId", "", "className", "", "classProb", "", "docInClass", "tfIdfSum", "wordsInClass", "<init>", "(ILjava/lang/String;DIDLjava/lang/Integer;)V", "getClassId", "()I", "getClassName", "()Ljava/lang/String;", "getClassProb", "()D", "getDocInClass", "getTfIdfSum", "getWordsInClass", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;DIDLjava/lang/Integer;)Lcom/truecaller/insights/models/classifierseed/ClassMeta;", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class ClassMeta {

    @bw.qux("class_id")
    private final int classId;

    @bw.qux("class_name")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String className;

    @bw.qux("class_prob")
    private final double classProb;

    @bw.qux("doc_in_class")
    private final int docInClass;

    @bw.qux("tf_idf_sum")
    private final double tfIdfSum;

    @bw.qux("words_in_class")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer wordsInClass;

    public ClassMeta(int i, @org.jetbrains.annotations.NotNull java.lang.String str, double d, int i2, double d2, @org.jetbrains.annotations.Nullable java.lang.Integer num) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "className");
        this.classId = i;
        this.className = str;
        this.classProb = d;
        this.docInClass = i2;
        this.tfIdfSum = d2;
        this.wordsInClass = num;
    }

    public static /* synthetic */ com.truecaller.insights.models.classifierseed.ClassMeta copy$default(com.truecaller.insights.models.classifierseed.ClassMeta classMeta, int i, java.lang.String str, double d, int i2, double d2, java.lang.Integer num, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = classMeta.classId;
        }
        if ((i3 & 2) != 0) {
            str = classMeta.className;
        }
        if ((i3 & 4) != 0) {
            d = classMeta.classProb;
        }
        if ((i3 & 8) != 0) {
            i2 = classMeta.docInClass;
        }
        if ((i3 & 16) != 0) {
            d2 = classMeta.tfIdfSum;
        }
        if ((i3 & 32) != 0) {
            num = classMeta.wordsInClass;
        }
        int i4 = i2;
        double d3 = d;
        return classMeta.copy(i, str, d3, i4, d2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getClassId() {
        return this.classId;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getClassName() {
        return this.className;
    }

    /* renamed from: component3, reason: from getter */
    public final double getClassProb() {
        return this.classProb;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDocInClass() {
        return this.docInClass;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTfIdfSum() {
        return this.tfIdfSum;
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component6, reason: from getter */
    public final java.lang.Integer getWordsInClass() {
        return this.wordsInClass;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.ClassMeta copy(int classId, @org.jetbrains.annotations.NotNull java.lang.String className, double classProb, int docInClass, double tfIdfSum, @org.jetbrains.annotations.Nullable java.lang.Integer wordsInClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        return new com.truecaller.insights.models.classifierseed.ClassMeta(classId, className, classProb, docInClass, tfIdfSum, wordsInClass);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.ClassMeta)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.ClassMeta classMeta = (com.truecaller.insights.models.classifierseed.ClassMeta) other;
        return this.classId == classMeta.classId && kotlin.jvm.internal.Intrinsics.b(this.className, classMeta.className) && java.lang.Double.compare(this.classProb, classMeta.classProb) == 0 && this.docInClass == classMeta.docInClass && java.lang.Double.compare(this.tfIdfSum, classMeta.tfIdfSum) == 0 && kotlin.jvm.internal.Intrinsics.b(this.wordsInClass, classMeta.wordsInClass);
    }

    public final int getClassId() {
        return this.classId;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClassName() {
        return this.className;
    }

    public final double getClassProb() {
        return this.classProb;
    }

    public final int getDocInClass() {
        return this.docInClass;
    }

    public final double getTfIdfSum() {
        return this.tfIdfSum;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getWordsInClass() {
        return this.wordsInClass;
    }

    public int hashCode() {
        int hashCode;
        int e = ax1.bar.e(this.classId * 31, 31, this.className);
        long doubleToLongBits = java.lang.Double.doubleToLongBits(this.classProb);
        int i = (((e + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.docInClass) * 31;
        long doubleToLongBits2 = java.lang.Double.doubleToLongBits(this.tfIdfSum);
        int i2 = (i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31;
        java.lang.Integer num = this.wordsInClass;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i2 + hashCode;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        int i = this.classId;
        java.lang.String str = this.className;
        double d = this.classProb;
        int i2 = this.docInClass;
        double d2 = this.tfIdfSum;
        java.lang.Integer num = this.wordsInClass;
        java.lang.StringBuilder r = qb.qux.r("ClassMeta(classId=", i, ", className=", str, ", classProb=");
        r.append(d);
        r.append(", docInClass=");
        r.append(i2);
        r.append(", tfIdfSum=");
        r.append(d2);
        r.append(", wordsInClass=");
        return com.appsflyer.internal.e.m(r, num, ")");
    }
}
