package com.truecaller.insights.processing.classifier;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006%"}, d2 = {"Lcom/truecaller/insights/processing/classifier/AndroidWordToClassProb;", "", "", "idf", "", "noOfMessages", "", "Lcom/truecaller/insights/processing/classifier/AndroidClassKeywordMeta;", "probabilities", "", "word", "<init>", "(Ljava/lang/Double;ILjava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/Double;", "component2", "()I", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Double;ILjava/util/List;Ljava/lang/String;)Lcom/truecaller/insights/processing/classifier/AndroidWordToClassProb;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Double;", "getIdf", "I", "getNoOfMessages", "Ljava/util/List;", "getProbabilities", "Ljava/lang/String;", "getWord", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class AndroidWordToClassProb {

    @org.jetbrains.annotations.Nullable
    private final java.lang.Double idf;
    private final int noOfMessages;

    @bw.qux("probabilities")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta> probabilities;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String word;

    public AndroidWordToClassProb(@org.jetbrains.annotations.Nullable java.lang.Double d, int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        this.idf = d;
        this.noOfMessages = i;
        this.probabilities = list;
        this.word = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.processing.classifier.AndroidWordToClassProb copy$default(com.truecaller.insights.processing.classifier.AndroidWordToClassProb androidWordToClassProb, java.lang.Double d, int i, java.util.List list, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            d = androidWordToClassProb.idf;
        }
        if ((i2 & 2) != 0) {
            i = androidWordToClassProb.noOfMessages;
        }
        if ((i2 & 4) != 0) {
            list = androidWordToClassProb.probabilities;
        }
        if ((i2 & 8) != 0) {
            str = androidWordToClassProb.word;
        }
        return androidWordToClassProb.copy(d, i, list, str);
    }

    @org.jetbrains.annotations.Nullable
    /* renamed from: component1, reason: from getter */
    public final java.lang.Double getIdf() {
        return this.idf;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNoOfMessages() {
        return this.noOfMessages;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta> component3() {
        return this.probabilities;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getWord() {
        return this.word;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.classifier.AndroidWordToClassProb copy(@org.jetbrains.annotations.Nullable java.lang.Double idf, int noOfMessages, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta> probabilities, @org.jetbrains.annotations.NotNull java.lang.String word) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(word, "word");
        return new com.truecaller.insights.processing.classifier.AndroidWordToClassProb(idf, noOfMessages, probabilities, word);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.classifier.AndroidWordToClassProb)) {
            return false;
        }
        com.truecaller.insights.processing.classifier.AndroidWordToClassProb androidWordToClassProb = (com.truecaller.insights.processing.classifier.AndroidWordToClassProb) other;
        return kotlin.jvm.internal.Intrinsics.b(this.idf, androidWordToClassProb.idf) && this.noOfMessages == androidWordToClassProb.noOfMessages && kotlin.jvm.internal.Intrinsics.b(this.probabilities, androidWordToClassProb.probabilities) && kotlin.jvm.internal.Intrinsics.b(this.word, androidWordToClassProb.word);
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Double getIdf() {
        return this.idf;
    }

    public int getNoOfMessages() {
        return this.noOfMessages;
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<com.truecaller.insights.processing.classifier.AndroidClassKeywordMeta> getProbabilities() {
        return this.probabilities;
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String getWord() {
        return this.word;
    }

    public int hashCode() {
        int hashCode;
        java.lang.Double d = this.idf;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        return this.word.hashCode() + uf.qux.g(((hashCode * 31) + this.noOfMessages) * 31, 31, this.probabilities);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "AndroidWordToClassProb(idf=" + this.idf + ", noOfMessages=" + this.noOfMessages + ", probabilities=" + this.probabilities + ", word=" + this.word + ")";
    }
}
