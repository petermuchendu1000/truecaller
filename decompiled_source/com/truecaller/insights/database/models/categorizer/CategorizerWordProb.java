package com.truecaller.insights.database.models.categorizer;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/database/models/categorizer/CategorizerWordProb;", "", "word", "", "probability", "Lcom/truecaller/insights/processing/categorizer/KeywordMeta;", "<init>", "(Ljava/lang/String;Lcom/truecaller/insights/processing/categorizer/KeywordMeta;)V", "getWord", "()Ljava/lang/String;", "getProbability", "()Lcom/truecaller/insights/processing/categorizer/KeywordMeta;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "database_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class CategorizerWordProb {

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.insights.processing.categorizer.KeywordMeta probability;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String word;

    public CategorizerWordProb(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull com.truecaller.insights.processing.categorizer.KeywordMeta keywordMeta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keywordMeta, "probability");
        this.word = str;
        this.probability = keywordMeta;
    }

    public static /* synthetic */ com.truecaller.insights.database.models.categorizer.CategorizerWordProb copy$default(com.truecaller.insights.database.models.categorizer.CategorizerWordProb categorizerWordProb, java.lang.String str, com.truecaller.insights.processing.categorizer.KeywordMeta keywordMeta, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = categorizerWordProb.word;
        }
        if ((i & 2) != 0) {
            keywordMeta = categorizerWordProb.probability;
        }
        return categorizerWordProb.copy(str, keywordMeta);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWord() {
        return this.word;
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component2, reason: from getter */
    public final com.truecaller.insights.processing.categorizer.KeywordMeta getProbability() {
        return this.probability;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.database.models.categorizer.CategorizerWordProb copy(@org.jetbrains.annotations.NotNull java.lang.String word, @org.jetbrains.annotations.NotNull com.truecaller.insights.processing.categorizer.KeywordMeta probability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(word, "word");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probability, "probability");
        return new com.truecaller.insights.database.models.categorizer.CategorizerWordProb(word, probability);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.database.models.categorizer.CategorizerWordProb)) {
            return false;
        }
        com.truecaller.insights.database.models.categorizer.CategorizerWordProb categorizerWordProb = (com.truecaller.insights.database.models.categorizer.CategorizerWordProb) other;
        return kotlin.jvm.internal.Intrinsics.b(this.word, categorizerWordProb.word) && kotlin.jvm.internal.Intrinsics.b(this.probability, categorizerWordProb.probability);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.categorizer.KeywordMeta getProbability() {
        return this.probability;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.probability.hashCode() + (this.word.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return "CategorizerWordProb(word=" + this.word + ", probability=" + this.probability + ")";
    }
}
