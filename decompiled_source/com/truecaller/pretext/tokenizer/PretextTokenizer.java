package com.truecaller.pretext.tokenizer;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u0011\u0010)\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lcom/truecaller/pretext/tokenizer/PretextTokenizer;", "", "Lcom/truecaller/pretext/tokenizer/TokenizerConfig;", "config", "Lcom/truecaller/pretext/tokenizer/Vocabulary;", "vocab", "<init>", "(Lcom/truecaller/pretext/tokenizer/TokenizerConfig;Lcom/truecaller/pretext/tokenizer/Vocabulary;)V", "", "", "tokens", "", "maxLen", "Lcom/truecaller/pretext/tokenizer/EncodedResult;", "encodeBert", "(Ljava/util/List;I)Lcom/truecaller/pretext/tokenizer/EncodedResult;", "encodeInputIdsOnly", "Lkg2/qux;", "createSplitter", "()Lkg2/qux;", "text", "tokenize", "(Ljava/lang/String;)Ljava/util/List;", "encode", "(Ljava/lang/String;)Lcom/truecaller/pretext/tokenizer/EncodedResult;", "encodeTokens", "(Ljava/util/List;)Lcom/truecaller/pretext/tokenizer/EncodedResult;", "texts", "encodeBatch", "(Ljava/util/List;)Ljava/util/List;", "Lcom/truecaller/pretext/tokenizer/TokenizerConfig;", "Lcom/truecaller/pretext/tokenizer/Vocabulary;", "splitter", "Lkg2/qux;", "clsId", "I", "sepId", "padId", "unkId", "getVocabSize", "()I", "vocabSize", "getMaxSequenceLength", "maxSequenceLength", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PretextTokenizer {
    private final int clsId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.pretext.tokenizer.TokenizerConfig config;
    private final int padId;
    private final int sepId;

    @org.jetbrains.annotations.NotNull
    private final kg2.qux splitter;
    private final int unkId;

    @org.jetbrains.annotations.NotNull
    private final com.truecaller.pretext.tokenizer.Vocabulary vocab;

    public PretextTokenizer(@org.jetbrains.annotations.NotNull com.truecaller.pretext.tokenizer.TokenizerConfig tokenizerConfig, @org.jetbrains.annotations.NotNull com.truecaller.pretext.tokenizer.Vocabulary vocabulary) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizerConfig, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vocabulary, "vocab");
        this.config = tokenizerConfig;
        this.vocab = vocabulary;
        af3.b b = kotlin.collections.x.b();
        b.add(tokenizerConfig.getUnkToken());
        b.add(tokenizerConfig.getPadToken());
        if (tokenizerConfig.getTensorLayout() == com.truecaller.pretext.tokenizer.TensorLayout.BERT) {
            b.add(tokenizerConfig.getClsToken());
            b.add(tokenizerConfig.getSepToken());
        }
        af3.b a = kotlin.collections.x.a(b);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        af3.baz listIterator = a.listIterator(0);
        while (true) {
            af3.baz bazVar = listIterator;
            if (!bazVar.hasNext()) {
                break;
            }
            java.lang.Object next = bazVar.next();
            if (!this.vocab.contains((java.lang.String) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            java.lang.Integer id = this.vocab.getId(this.config.getClsToken());
            if (id != null) {
                i = id.intValue();
            } else {
                i = -1;
            }
            this.clsId = i;
            java.lang.Integer id2 = this.vocab.getId(this.config.getSepToken());
            this.sepId = id2 != null ? id2.intValue() : -1;
            java.lang.Integer id3 = this.vocab.getId(this.config.getPadToken());
            if (id3 != null) {
                this.padId = id3.intValue();
                java.lang.Integer id4 = this.vocab.getId(this.config.getUnkToken());
                if (id4 != null) {
                    this.unkId = id4.intValue();
                    this.splitter = createSplitter();
                    return;
                }
                throw new java.lang.IllegalArgumentException(bar.t("unkToken '", this.config.getUnkToken(), "' not in vocabulary").toString());
            }
            throw new java.lang.IllegalArgumentException(bar.t("padToken '", this.config.getPadToken(), "' not in vocabulary").toString());
        }
        throw new java.lang.IllegalArgumentException(("Special tokens not found in vocabulary: " + arrayList + ". Ensure vocab.txt contains all required tokens for TensorLayout." + this.config.getTensorLayout() + ".").toString());
    }

    private final kg2.qux createSplitter() {
        int i = kg2.bar.b[this.config.getStrategy().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new c0.b(this.config.getLowercase(), false);
            }
            throw new java.lang.RuntimeException();
        }
        return new k4.q1(this.vocab.tokenSet$lib_release(), this.config.getLowercase(), this.config.getMaxWordLength(), this.config.getUnkToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.truecaller.pretext.tokenizer.EncodedResult encodeBatch$lambda$5(com.truecaller.pretext.tokenizer.PretextTokenizer pretextTokenizer, java.lang.String str) {
        try {
            kotlin.jvm.internal.Intrinsics.d(str);
            return pretextTokenizer.encode(str);
        } catch (java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.d(str);
            throw new java.lang.IllegalArgumentException(k9.d.r("encodeBatch failed on input \"", kotlin.text.y.t(kotlin.text.c0.J(60, str), '\n', ' '), "\": ", e.getMessage()), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.truecaller.pretext.tokenizer.EncodedResult encodeBatch$lambda$6(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        return (com.truecaller.pretext.tokenizer.EncodedResult) function1.invoke(obj);
    }

    private final com.truecaller.pretext.tokenizer.EncodedResult encodeBert(java.util.List<java.lang.String> tokens, int maxLen) {
        java.util.List z0 = kotlin.collections.CollectionsKt.z0(tokens, maxLen - 2);
        int size = z0.size();
        int i = size + 2;
        int[] iArr = new int[maxLen];
        for (int i2 = 0; i2 < maxLen; i2++) {
            iArr[i2] = this.padId;
        }
        int[] iArr2 = new int[maxLen];
        for (int i3 = 0; i3 < maxLen; i3++) {
            iArr2[i3] = 0;
        }
        int[] iArr3 = new int[maxLen];
        for (int i4 = 0; i4 < maxLen; i4++) {
            iArr3[i4] = 0;
        }
        iArr[0] = this.clsId;
        int i5 = 0;
        for (java.lang.Object obj : z0) {
            int i6 = i5 + 1;
            if (i5 >= 0) {
                iArr[i6] = this.vocab.getIdOrDefault((java.lang.String) obj, this.unkId);
                i5 = i6;
            } else {
                kotlin.collections.y.p();
                throw null;
            }
        }
        iArr[size + 1] = this.sepId;
        for (int i7 = 0; i7 < i; i7++) {
            iArr3[i7] = 1;
        }
        return new com.truecaller.pretext.tokenizer.EncodedResult(iArr, iArr3, iArr2);
    }

    private final com.truecaller.pretext.tokenizer.EncodedResult encodeInputIdsOnly(java.util.List<java.lang.String> tokens, int maxLen) {
        java.util.List z0 = kotlin.collections.CollectionsKt.z0(tokens, maxLen);
        int[] iArr = new int[maxLen];
        for (int i = 0; i < maxLen; i++) {
            iArr[i] = this.padId;
        }
        int[] iArr2 = new int[maxLen];
        for (int i2 = 0; i2 < maxLen; i2++) {
            iArr2[i2] = 0;
        }
        int i3 = 0;
        for (java.lang.Object obj : z0) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                iArr[i3] = this.vocab.getIdOrDefault((java.lang.String) obj, this.unkId);
                i3 = i4;
            } else {
                kotlin.collections.y.p();
                throw null;
            }
        }
        int size = z0.size();
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = 1;
        }
        return new com.truecaller.pretext.tokenizer.EncodedResult(iArr, iArr2, null);
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.pretext.tokenizer.EncodedResult encode(@org.jetbrains.annotations.NotNull java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return encodeTokens(this.splitter.c(text));
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.truecaller.pretext.tokenizer.EncodedResult> encodeBatch(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> texts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(texts, "texts");
        java.lang.Object f = j03.f.f(j03.f.l(j03.f.y(texts), new c62.t(new jm2.p(this, 12), 8)), to1.a.o());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(f, "collect(...)");
        return (java.util.List) f;
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.pretext.tokenizer.EncodedResult encodeTokens(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> tokens) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "tokens");
        int maxSequenceLength = this.config.getMaxSequenceLength();
        int i = kg2.bar.a[this.config.getTensorLayout().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return encodeInputIdsOnly(tokens, maxSequenceLength);
            }
            throw new java.lang.RuntimeException();
        }
        return encodeBert(tokens, maxSequenceLength);
    }

    public final int getMaxSequenceLength() {
        return this.config.getMaxSequenceLength();
    }

    public final int getVocabSize() {
        return this.vocab.getSize();
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> tokenize(@org.jetbrains.annotations.NotNull java.lang.String text) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "text");
        return this.splitter.c(text);
    }
}
