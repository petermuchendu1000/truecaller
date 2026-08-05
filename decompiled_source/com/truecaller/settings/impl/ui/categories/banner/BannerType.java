package com.truecaller.settings.impl.ui.categories.banner;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/settings/impl/ui/categories/banner/BannerType;", "", "<init>", "(Ljava/lang/String;I)V", "CALLER_ID", "DEFAULT_DIALER", "DRAW_OVER_OTHER_APPS", "BATTERY_OPTIMIZATION", "NONE", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BannerType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.categories.banner.BannerType[] $VALUES;
    public static final com.truecaller.settings.impl.ui.categories.banner.BannerType CALLER_ID = new com.truecaller.settings.impl.ui.categories.banner.BannerType("CALLER_ID", 0);
    public static final com.truecaller.settings.impl.ui.categories.banner.BannerType DEFAULT_DIALER = new com.truecaller.settings.impl.ui.categories.banner.BannerType("DEFAULT_DIALER", 1);
    public static final com.truecaller.settings.impl.ui.categories.banner.BannerType DRAW_OVER_OTHER_APPS = new com.truecaller.settings.impl.ui.categories.banner.BannerType("DRAW_OVER_OTHER_APPS", 2);
    public static final com.truecaller.settings.impl.ui.categories.banner.BannerType BATTERY_OPTIMIZATION = new com.truecaller.settings.impl.ui.categories.banner.BannerType("BATTERY_OPTIMIZATION", 3);
    public static final com.truecaller.settings.impl.ui.categories.banner.BannerType NONE = new com.truecaller.settings.impl.ui.categories.banner.BannerType("NONE", 4);

    private static final /* synthetic */ com.truecaller.settings.impl.ui.categories.banner.BannerType[] $values() {
        return new com.truecaller.settings.impl.ui.categories.banner.BannerType[]{CALLER_ID, DEFAULT_DIALER, DRAW_OVER_OTHER_APPS, BATTERY_OPTIMIZATION, NONE};
    }

    static {
        com.truecaller.settings.impl.ui.categories.banner.BannerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BannerType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.categories.banner.BannerType valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.categories.banner.BannerType) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.categories.banner.BannerType.class, str);
    }

    public static com.truecaller.settings.impl.ui.categories.banner.BannerType[] values() {
        return (com.truecaller.settings.impl.ui.categories.banner.BannerType[]) $VALUES.clone();
    }
}
