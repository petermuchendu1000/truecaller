package com.truecaller.searchwarnings.data.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/searchwarnings/data/analytics/SearchWarningSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS_VIEW", "DETAILS_VIEW_V3", "CALLER_ID", "AFTER_CALL", "IN_CALL_UI", "search-warnings_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SearchWarningSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.searchwarnings.data.analytics.SearchWarningSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.searchwarnings.data.analytics.SearchWarningSource DETAILS_VIEW = new com.truecaller.searchwarnings.data.analytics.SearchWarningSource("DETAILS_VIEW", 0, "DetailsView");
    public static final com.truecaller.searchwarnings.data.analytics.SearchWarningSource DETAILS_VIEW_V3 = new com.truecaller.searchwarnings.data.analytics.SearchWarningSource("DETAILS_VIEW_V3", 1, "DetailsViewV3");
    public static final com.truecaller.searchwarnings.data.analytics.SearchWarningSource CALLER_ID = new com.truecaller.searchwarnings.data.analytics.SearchWarningSource("CALLER_ID", 2, "CallerId");
    public static final com.truecaller.searchwarnings.data.analytics.SearchWarningSource AFTER_CALL = new com.truecaller.searchwarnings.data.analytics.SearchWarningSource("AFTER_CALL", 3, "AfterCall");
    public static final com.truecaller.searchwarnings.data.analytics.SearchWarningSource IN_CALL_UI = new com.truecaller.searchwarnings.data.analytics.SearchWarningSource("IN_CALL_UI", 4, "InCallUi");

    private static final /* synthetic */ com.truecaller.searchwarnings.data.analytics.SearchWarningSource[] $values() {
        return new com.truecaller.searchwarnings.data.analytics.SearchWarningSource[]{DETAILS_VIEW, DETAILS_VIEW_V3, CALLER_ID, AFTER_CALL, IN_CALL_UI};
    }

    static {
        com.truecaller.searchwarnings.data.analytics.SearchWarningSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SearchWarningSource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.searchwarnings.data.analytics.SearchWarningSource valueOf(java.lang.String str) {
        return (com.truecaller.searchwarnings.data.analytics.SearchWarningSource) java.lang.Enum.valueOf(com.truecaller.searchwarnings.data.analytics.SearchWarningSource.class, str);
    }

    public static com.truecaller.searchwarnings.data.analytics.SearchWarningSource[] values() {
        return (com.truecaller.searchwarnings.data.analytics.SearchWarningSource[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
