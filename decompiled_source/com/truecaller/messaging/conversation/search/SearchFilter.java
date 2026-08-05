package com.truecaller.messaging.conversation.search;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/messaging/conversation/search/SearchFilter;", "", "icon", "", "text", "<init>", "(Ljava/lang/String;III)V", "getIcon", "()I", "getText", "DATE", "STARRED", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SearchFilter {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.conversation.search.SearchFilter[] $VALUES;
    public static final com.truecaller.messaging.conversation.search.SearchFilter DATE = new com.truecaller.messaging.conversation.search.SearchFilter("DATE", 0, 2131232550, 2132022895);
    public static final com.truecaller.messaging.conversation.search.SearchFilter STARRED = new com.truecaller.messaging.conversation.search.SearchFilter("STARRED", 1, 2131233315, 2132022896);
    private final int icon;
    private final int text;

    private static final /* synthetic */ com.truecaller.messaging.conversation.search.SearchFilter[] $values() {
        return new com.truecaller.messaging.conversation.search.SearchFilter[]{DATE, STARRED};
    }

    static {
        com.truecaller.messaging.conversation.search.SearchFilter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SearchFilter(java.lang.String str, int i, int i2, int i3) {
        this.icon = i2;
        this.text = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.conversation.search.SearchFilter valueOf(java.lang.String str) {
        return (com.truecaller.messaging.conversation.search.SearchFilter) java.lang.Enum.valueOf(com.truecaller.messaging.conversation.search.SearchFilter.class, str);
    }

    public static com.truecaller.messaging.conversation.search.SearchFilter[] values() {
        return (com.truecaller.messaging.conversation.search.SearchFilter[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getText() {
        return this.text;
    }
}
