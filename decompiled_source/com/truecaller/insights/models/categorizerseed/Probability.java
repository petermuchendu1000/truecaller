package com.truecaller.insights.models.categorizerseed;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/truecaller/insights/models/categorizerseed/Probability;", "", "probability", "", "", "word", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProbability", "()Ljava/util/List;", "getWord", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class Probability {

    @bw.qux("probability")
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> probability;

    @bw.qux("word")
    @org.jetbrains.annotations.NotNull
    private final java.lang.String word;

    public Probability(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> list, @org.jetbrains.annotations.NotNull java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "probability");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        this.probability = list;
        this.word = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.models.categorizerseed.Probability copy$default(com.truecaller.insights.models.categorizerseed.Probability probability, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = probability.probability;
        }
        if ((i & 2) != 0) {
            str = probability.word;
        }
        return probability.copy(list, str);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component1() {
        return this.probability;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final java.lang.String getWord() {
        return this.word;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.models.categorizerseed.Probability copy(@org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> probability, @org.jetbrains.annotations.NotNull java.lang.String word) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probability, "probability");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(word, "word");
        return new com.truecaller.insights.models.categorizerseed.Probability(probability, word);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.models.categorizerseed.Probability)) {
            return false;
        }
        com.truecaller.insights.models.categorizerseed.Probability probability = (com.truecaller.insights.models.categorizerseed.Probability) other;
        return kotlin.jvm.internal.Intrinsics.b(this.probability, probability.probability) && kotlin.jvm.internal.Intrinsics.b(this.word, probability.word);
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> getProbability() {
        return this.probability;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.word.hashCode() + (this.probability.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "Probability(probability=" + this.probability + ", word=" + this.word + ")";
    }
}
