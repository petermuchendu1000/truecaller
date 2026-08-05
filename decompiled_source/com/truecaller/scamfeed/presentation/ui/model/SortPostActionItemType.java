package com.truecaller.scamfeed.presentation.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/scamfeed/presentation/ui/model/SortPostActionItemType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "co2/i0", "New", "Popular", "Trending", "NearBy", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SortPostActionItemType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final co2.i0 Companion;
    public static final com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType New = new com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType("New", 0);
    public static final com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType Popular = new com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType("Popular", 1);
    public static final com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType Trending = new com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType("Trending", 2);
    public static final com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType NearBy = new com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType("NearBy", 3);

    private static final /* synthetic */ com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[] $values() {
        return new com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[]{New, Popular, Trending, NearBy};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, co2.i0] */
    static {
        com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private SortPostActionItemType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType valueOf(java.lang.String str) {
        return (com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType) java.lang.Enum.valueOf(com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType.class, str);
    }

    public static com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[] values() {
        return (com.truecaller.scamfeed.presentation.ui.model.SortPostActionItemType[]) $VALUES.clone();
    }
}
