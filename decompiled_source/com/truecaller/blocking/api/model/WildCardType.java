package com.truecaller.blocking.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014j\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lcom/truecaller/blocking/api/model/WildCardType;", "", "", "prefix", "suffix", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "patternFlags", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V", "string", "formatPattern", "(Ljava/lang/String;)Ljava/lang/String;", "pattern", "Ljava/util/regex/Pattern;", "compilePattern", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", "stripPattern", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "getSuffix", "I", "getType", "()I", "prefixQuoted", "getPrefixQuoted", "suffixQuoted", "getSuffixQuoted", "Companion", "fj0/e", "NONE", "START", "CONTAIN", "END", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class WildCardType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.api.model.WildCardType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final fj0.e Companion;
    private final int patternFlags;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String prefix;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String prefixQuoted;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String suffix;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String suffixQuoted;
    private final int type;
    public static final com.truecaller.blocking.api.model.WildCardType NONE = new com.truecaller.blocking.api.model.WildCardType("NONE", 0, "", "", 0, 0);
    public static final com.truecaller.blocking.api.model.WildCardType START = new com.truecaller.blocking.api.model.WildCardType("START", 1, "^", ".*", 1, 0);
    public static final com.truecaller.blocking.api.model.WildCardType CONTAIN = new com.truecaller.blocking.api.model.WildCardType("CONTAIN", 2, ".*", ".*", 2, 2);
    public static final com.truecaller.blocking.api.model.WildCardType END = new com.truecaller.blocking.api.model.WildCardType("END", 3, ".*", "$", 3, 0);

    private static final /* synthetic */ com.truecaller.blocking.api.model.WildCardType[] $values() {
        return new com.truecaller.blocking.api.model.WildCardType[]{NONE, START, CONTAIN, END};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, fj0.e] */
    static {
        com.truecaller.blocking.api.model.WildCardType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private WildCardType(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2, int i3) {
        this.prefix = str2;
        this.suffix = str3;
        this.type = i2;
        this.patternFlags = i3;
        this.prefixQuoted = h0.b.Q(str2, "\\Q");
        this.suffixQuoted = k9.d.q("\\E", str3);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.api.model.WildCardType valueOf(java.lang.String str) {
        return (com.truecaller.blocking.api.model.WildCardType) java.lang.Enum.valueOf(com.truecaller.blocking.api.model.WildCardType.class, str);
    }

    public static com.truecaller.blocking.api.model.WildCardType[] values() {
        return (com.truecaller.blocking.api.model.WildCardType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.regex.Pattern compilePattern(@org.jetbrains.annotations.NotNull java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern, this.patternFlags);
            kotlin.jvm.internal.Intrinsics.d(compile);
            return compile;
        } catch (java.util.regex.PatternSyntaxException e) {
            java.lang.String stripPattern = stripPattern(pattern);
            if (!kotlin.jvm.internal.Intrinsics.b(pattern, stripPattern)) {
                java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile(formatPattern(stripPattern));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile2, "compile(...)");
                return compile2;
            }
            throw e;
        }
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatPattern(@org.jetbrains.annotations.NotNull java.lang.String string) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(string, "string");
        return h8.s0.q(this.prefix, java.util.regex.Pattern.quote(string), this.suffix);
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefix() {
        return this.prefix;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrefixQuoted() {
        return this.prefixQuoted;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSuffix() {
        return this.suffix;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSuffixQuoted() {
        return this.suffixQuoted;
    }

    public final int getType() {
        return this.type;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String stripPattern(@org.jetbrains.annotations.Nullable java.lang.String pattern) {
        if (this != NONE && pattern != null && pattern.length() != 0) {
            if (kotlin.text.y.w(pattern, this.prefixQuoted, false)) {
                pattern = pattern.substring(this.prefixQuoted.length());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "substring(...)");
            } else if (kotlin.text.y.w(pattern, this.prefix, false)) {
                pattern = pattern.substring(this.prefix.length());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "substring(...)");
            }
            if (kotlin.text.y.o(pattern, this.suffixQuoted, false)) {
                pattern = pattern.substring(0, pattern.length() - this.suffixQuoted.length());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "substring(...)");
            } else if (kotlin.text.y.o(pattern, this.suffix, false)) {
                pattern = pattern.substring(0, pattern.length() - this.suffix.length());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pattern, "substring(...)");
            }
        }
        if (pattern == null) {
            return "";
        }
        return pattern;
    }
}
