package com.truecaller.insights.models.classifierseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/truecaller/insights/models/classifierseed/Probability;", "", "idf", "", "noOfMessages", "", "probabilities", "", "Lcom/truecaller/insights/models/classifierseed/ClassKeywordMeta;", "word", "", "<init>", "(Ljava/lang/Double;ILjava/util/List;Ljava/lang/String;)V", "getIdf", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getNoOfMessages", "()I", "getProbabilities", "()Ljava/util/List;", "getWord", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Double;ILjava/util/List;Ljava/lang/String;)Lcom/truecaller/insights/models/classifierseed/Probability;", "equals", "", "other", "hashCode", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Probability {

    @bw.qux("idf")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double idf;

    @bw.qux("no_msgs")
    private final int noOfMessages;

    @bw.qux("probabilities")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.truecaller.insights.models.classifierseed.ClassKeywordMeta> probabilities;

    @bw.qux("word")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String word;

    public Probability(@org.jetbrains.annotations.Nullable java.lang.Double d, int i, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.ClassKeywordMeta> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        this.idf = d;
        this.noOfMessages = i;
        this.probabilities = list;
        this.word = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.models.classifierseed.Probability copy$default(com.truecaller.insights.models.classifierseed.Probability probability, java.lang.Double d, int i, java.util.List list, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            d = probability.idf;
        }
        if ((i2 & 2) != 0) {
            i = probability.noOfMessages;
        }
        if ((i2 & 4) != 0) {
            list = probability.probabilities;
        }
        if ((i2 & 8) != 0) {
            str = probability.word;
        }
        return probability.copy(d, i, list, str);
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
    public final java.util.List<com.truecaller.insights.models.classifierseed.ClassKeywordMeta> component3() {
        return this.probabilities;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component4, reason: from getter */
    public final java.lang.String getWord() {
        return this.word;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.classifierseed.Probability copy(@org.jetbrains.annotations.Nullable java.lang.Double idf, int noOfMessages, @org.jetbrains.annotations.NotNull java.util.List<com.truecaller.insights.models.classifierseed.ClassKeywordMeta> probabilities, @org.jetbrains.annotations.NotNull java.lang.String word) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probabilities, "probabilities");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(word, "word");
        return new com.truecaller.insights.models.classifierseed.Probability(idf, noOfMessages, probabilities, word);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.classifierseed.Probability)) {
            return false;
        }
        com.truecaller.insights.models.classifierseed.Probability probability = (com.truecaller.insights.models.classifierseed.Probability) other;
        return kotlin.jvm.internal.Intrinsics.b(this.idf, probability.idf) && this.noOfMessages == probability.noOfMessages && kotlin.jvm.internal.Intrinsics.b(this.probabilities, probability.probabilities) && kotlin.jvm.internal.Intrinsics.b(this.word, probability.word);
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Double getIdf() {
        return this.idf;
    }

    public final int getNoOfMessages() {
        return this.noOfMessages;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.insights.models.classifierseed.ClassKeywordMeta> getProbabilities() {
        return this.probabilities;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWord() {
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
        return "Probability(idf=" + this.idf + ", noOfMessages=" + this.noOfMessages + ", probabilities=" + this.probabilities + ", word=" + this.word + ")";
    }
}
