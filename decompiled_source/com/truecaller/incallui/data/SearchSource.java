package com.truecaller.incallui.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/incallui/data/SearchSource;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "MANUAL_CALLER_ID", "SOFT_THROTTLED", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SearchSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.data.SearchSource[] $VALUES;
    public static final com.truecaller.incallui.data.SearchSource REGULAR = new com.truecaller.incallui.data.SearchSource("REGULAR", 0);
    public static final com.truecaller.incallui.data.SearchSource MANUAL_CALLER_ID = new com.truecaller.incallui.data.SearchSource("MANUAL_CALLER_ID", 1);
    public static final com.truecaller.incallui.data.SearchSource SOFT_THROTTLED = new com.truecaller.incallui.data.SearchSource("SOFT_THROTTLED", 2);

    private static final /* synthetic */ com.truecaller.incallui.data.SearchSource[] $values() {
        return new com.truecaller.incallui.data.SearchSource[]{REGULAR, MANUAL_CALLER_ID, SOFT_THROTTLED};
    }

    static {
        com.truecaller.incallui.data.SearchSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SearchSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.data.SearchSource valueOf(java.lang.String str) {
        return (com.truecaller.incallui.data.SearchSource) java.lang.Enum.valueOf(com.truecaller.incallui.data.SearchSource.class, str);
    }

    public static com.truecaller.incallui.data.SearchSource[] values() {
        return (com.truecaller.incallui.data.SearchSource[]) $VALUES.clone();
    }
}
