package com.truecaller.pretext.tokenizer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/pretext/tokenizer/TokenizerStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "WORD_PIECE", "WHITESPACE", "lib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TokenizerStrategy {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.pretext.tokenizer.TokenizerStrategy[] $VALUES;
    public static final com.truecaller.pretext.tokenizer.TokenizerStrategy WORD_PIECE = new com.truecaller.pretext.tokenizer.TokenizerStrategy("WORD_PIECE", 0);
    public static final com.truecaller.pretext.tokenizer.TokenizerStrategy WHITESPACE = new com.truecaller.pretext.tokenizer.TokenizerStrategy("WHITESPACE", 1);

    private static final /* synthetic */ com.truecaller.pretext.tokenizer.TokenizerStrategy[] $values() {
        return new com.truecaller.pretext.tokenizer.TokenizerStrategy[]{WORD_PIECE, WHITESPACE};
    }

    static {
        com.truecaller.pretext.tokenizer.TokenizerStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TokenizerStrategy(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.pretext.tokenizer.TokenizerStrategy valueOf(java.lang.String str) {
        return (com.truecaller.pretext.tokenizer.TokenizerStrategy) java.lang.Enum.valueOf(com.truecaller.pretext.tokenizer.TokenizerStrategy.class, str);
    }

    public static com.truecaller.pretext.tokenizer.TokenizerStrategy[] values() {
        return (com.truecaller.pretext.tokenizer.TokenizerStrategy[]) $VALUES.clone();
    }
}
