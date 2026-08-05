package com.truecaller.widget_tc.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/widget_tc/domain/WidgetItem;", "", "", "item", "deepLink", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getItem", "()Ljava/lang/String;", "getDeepLink", "Companion", "i73/bar", "DIAL", "MESSAGES", "CALLS", "PROFILE", "SEARCH", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class WidgetItem {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.widget_tc.domain.WidgetItem[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final i73.bar Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.widget_tc.domain.WidgetItem> byItem;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String deepLink;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String item;
    public static final com.truecaller.widget_tc.domain.WidgetItem DIAL = new com.truecaller.widget_tc.domain.WidgetItem("DIAL", 0, "Dial", "https://truecaller.com/d/dialpad?tel=");
    public static final com.truecaller.widget_tc.domain.WidgetItem MESSAGES = new com.truecaller.widget_tc.domain.WidgetItem("MESSAGES", 1, "Inbox", "truecaller://home/tabs/messages?source=widget");
    public static final com.truecaller.widget_tc.domain.WidgetItem CALLS = new com.truecaller.widget_tc.domain.WidgetItem("CALLS", 2, "Missed Calls", "https://truecaller.com/d/missed_calls");
    public static final com.truecaller.widget_tc.domain.WidgetItem PROFILE = new com.truecaller.widget_tc.domain.WidgetItem("PROFILE", 3, "PROFILE", "truecaller://home/profile?source=widget");
    public static final com.truecaller.widget_tc.domain.WidgetItem SEARCH = new com.truecaller.widget_tc.domain.WidgetItem("SEARCH", 4, "Search", "https://truecaller.com/d/global_search");

    private static final /* synthetic */ com.truecaller.widget_tc.domain.WidgetItem[] $values() {
        return new com.truecaller.widget_tc.domain.WidgetItem[]{DIAL, MESSAGES, CALLS, PROFILE, SEARCH};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [i73.bar, java.lang.Object] */
    static {
        com.truecaller.widget_tc.domain.WidgetItem[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        gf3.bar entries = getEntries();
        int b = kotlin.collections.q0.b(kotlin.collections.z.q(entries, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (java.lang.Object obj : entries) {
            java.lang.String lowerCase = kotlin.text.StringsKt.u0(((com.truecaller.widget_tc.domain.WidgetItem) obj).item).toString().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, obj);
        }
        byItem = linkedHashMap;
    }

    private WidgetItem(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.item = str2;
        this.deepLink = str3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.widget_tc.domain.WidgetItem valueOf(java.lang.String str) {
        return (com.truecaller.widget_tc.domain.WidgetItem) java.lang.Enum.valueOf(com.truecaller.widget_tc.domain.WidgetItem.class, str);
    }

    public static com.truecaller.widget_tc.domain.WidgetItem[] values() {
        return (com.truecaller.widget_tc.domain.WidgetItem[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeepLink() {
        return this.deepLink;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItem() {
        return this.item;
    }
}
