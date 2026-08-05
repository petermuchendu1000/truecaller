package com.truecaller.insights.core.parser.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/insights/core/parser/data/ParserSeedSource;", "", "<init>", "(Ljava/lang/String;I)V", "LOCAL", "FIREBASE", "REMOTE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ParserSeedSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.parser.data.ParserSeedSource[] $VALUES;
    public static final com.truecaller.insights.core.parser.data.ParserSeedSource LOCAL = new com.truecaller.insights.core.parser.data.ParserSeedSource("LOCAL", 0);
    public static final com.truecaller.insights.core.parser.data.ParserSeedSource FIREBASE = new com.truecaller.insights.core.parser.data.ParserSeedSource("FIREBASE", 1);
    public static final com.truecaller.insights.core.parser.data.ParserSeedSource REMOTE = new com.truecaller.insights.core.parser.data.ParserSeedSource("REMOTE", 2);

    private static final /* synthetic */ com.truecaller.insights.core.parser.data.ParserSeedSource[] $values() {
        return new com.truecaller.insights.core.parser.data.ParserSeedSource[]{LOCAL, FIREBASE, REMOTE};
    }

    static {
        com.truecaller.insights.core.parser.data.ParserSeedSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ParserSeedSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.parser.data.ParserSeedSource valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.parser.data.ParserSeedSource) java.lang.Enum.valueOf(com.truecaller.insights.core.parser.data.ParserSeedSource.class, str);
    }

    public static com.truecaller.insights.core.parser.data.ParserSeedSource[] values() {
        return (com.truecaller.insights.core.parser.data.ParserSeedSource[]) $VALUES.clone();
    }
}
