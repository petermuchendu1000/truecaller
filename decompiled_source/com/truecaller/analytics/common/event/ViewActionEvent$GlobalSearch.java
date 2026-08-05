package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/analytics/common/event/ViewActionEvent$GlobalSearch", "", "Lcom/truecaller/analytics/common/event/ViewActionEvent$GlobalSearch;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SELECT_LOCATION_FILTER", "CHANGE_COUNTRY", "ADD_ADDRESS", "CLEAR_RECENT_SEARCHES", "SELECT_RECENT_SEARCH", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ViewActionEvent$GlobalSearch {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch SELECT_LOCATION_FILTER = new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch("SELECT_LOCATION_FILTER", 0, "SelectLocationFilter");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch CHANGE_COUNTRY = new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch("CHANGE_COUNTRY", 1, "ChangeCountry");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch ADD_ADDRESS = new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch("ADD_ADDRESS", 2, "AddAddress");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch CLEAR_RECENT_SEARCHES = new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch("CLEAR_RECENT_SEARCHES", 3, "ClearRecentSearches");
    public static final com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch SELECT_RECENT_SEARCH = new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch("SELECT_RECENT_SEARCH", 4, "SelectRecentSearch");

    private static final /* synthetic */ com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[] $values() {
        return new com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[]{SELECT_LOCATION_FILTER, CHANGE_COUNTRY, ADD_ADDRESS, CLEAR_RECENT_SEARCHES, SELECT_RECENT_SEARCH};
    }

    static {
        com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ViewActionEvent$GlobalSearch(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch.class, str);
    }

    public static com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[] values() {
        return (com.truecaller.analytics.common.event.ViewActionEvent$GlobalSearch[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
