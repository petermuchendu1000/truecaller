package com.truecaller.detailsview.api.internal.filtermatch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"com/truecaller/detailsview/api/internal/filtermatch/FilterMatch$Source", "", "Lcom/truecaller/detailsview/api/internal/filtermatch/FilterMatch$Source;", "<init>", "(Ljava/lang/String;I)V", "None", "TopSpammer", "Unknown", "NonPhonebook", "Foreign", "NeighborSpoofing", "NumberSeries", "BlacklistedNumber", "BlacklistedCountry", "BlacklistedWildcard", "CustomWhitelist", "SpammerFromSearch", "Spammer", "CallerName", "AssistantAutoReject", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilterMatch$Source {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source None = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("None", 0);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source TopSpammer = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("TopSpammer", 1);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source Unknown = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("Unknown", 2);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source NonPhonebook = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("NonPhonebook", 3);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source Foreign = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("Foreign", 4);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source NeighborSpoofing = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("NeighborSpoofing", 5);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source NumberSeries = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("NumberSeries", 6);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source BlacklistedNumber = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("BlacklistedNumber", 7);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source BlacklistedCountry = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("BlacklistedCountry", 8);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source BlacklistedWildcard = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("BlacklistedWildcard", 9);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source CustomWhitelist = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("CustomWhitelist", 10);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source SpammerFromSearch = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("SpammerFromSearch", 11);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source Spammer = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("Spammer", 12);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source CallerName = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("CallerName", 13);
    public static final com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source AssistantAutoReject = new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source("AssistantAutoReject", 14);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[] $values() {
        return new com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[]{None, TopSpammer, Unknown, NonPhonebook, Foreign, NeighborSpoofing, NumberSeries, BlacklistedNumber, BlacklistedCountry, BlacklistedWildcard, CustomWhitelist, SpammerFromSearch, Spammer, CallerName, AssistantAutoReject};
    }

    static {
        com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterMatch$Source(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source.class, str);
    }

    public static com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[] values() {
        return (com.truecaller.detailsview.api.internal.filtermatch.FilterMatch$Source[]) $VALUES.clone();
    }
}
