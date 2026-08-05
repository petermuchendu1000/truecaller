package com.truecaller.insights.processing.categorizer.model;

@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/truecaller/insights/processing/categorizer/model/WordProbImpl;", "Lfs1/e;", "", "word", "", "", "probability", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/truecaller/insights/processing/categorizer/model/WordProbImpl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWord", "Ljava/util/List;", "getProbability", "processing_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final /* data */ class WordProbImpl implements fs1.e {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Double> probability;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String word;

    public WordProbImpl(@org.jetbrains.annotations.NotNull java.lang.String str, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "word");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "probability");
        this.word = str;
        this.probability = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.truecaller.insights.processing.categorizer.model.WordProbImpl copy$default(com.truecaller.insights.processing.categorizer.model.WordProbImpl wordProbImpl, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = wordProbImpl.word;
        }
        if ((i & 2) != 0) {
            list = wordProbImpl.probability;
        }
        return wordProbImpl.copy(str, list);
    }

    @org.jetbrains.annotations.NotNull
    /* renamed from: component1, reason: from getter */
    public final java.lang.String getWord() {
        return this.word;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Double> component2() {
        return this.probability;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.insights.processing.categorizer.model.WordProbImpl copy(@org.jetbrains.annotations.NotNull java.lang.String word, @org.jetbrains.annotations.NotNull java.util.List<java.lang.Double> probability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(word, "word");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(probability, "probability");
        return new com.truecaller.insights.processing.categorizer.model.WordProbImpl(word, probability);
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.truecaller.insights.processing.categorizer.model.WordProbImpl)) {
            return false;
        }
        com.truecaller.insights.processing.categorizer.model.WordProbImpl wordProbImpl = (com.truecaller.insights.processing.categorizer.model.WordProbImpl) other;
        return kotlin.jvm.internal.Intrinsics.b(this.word, wordProbImpl.word) && kotlin.jvm.internal.Intrinsics.b(this.probability, wordProbImpl.probability);
    }

    @Override // fs1.e
    @org.jetbrains.annotations.NotNull
    public java.util.List<java.lang.Double> getProbability() {
        return this.probability;
    }

    @Override // fs1.e
    @org.jetbrains.annotations.NotNull
    public java.lang.String getWord() {
        return this.word;
    }

    public int hashCode() {
        return this.probability.hashCode() + (this.word.hashCode() * 31);
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return ro0.f.C("WordProbImpl(word=", this.word, ", probability=", this.probability, ")");
    }
}
