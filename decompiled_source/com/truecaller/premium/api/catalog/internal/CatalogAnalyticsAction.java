package com.truecaller.premium.api.catalog.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/premium/api/catalog/internal/CatalogAnalyticsAction;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCHED", "ITEM_CLICKED", "INNER_SCREEN_VIEWED", "PROMO_CODE_COPIED", "BACK_CLICKED", "BUTTON_CLICKED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class CatalogAnalyticsAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[] $VALUES;
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction LAUNCHED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("LAUNCHED", 0);
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction ITEM_CLICKED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("ITEM_CLICKED", 1);
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction INNER_SCREEN_VIEWED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("INNER_SCREEN_VIEWED", 2);
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction PROMO_CODE_COPIED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("PROMO_CODE_COPIED", 3);
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction BACK_CLICKED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("BACK_CLICKED", 4);
    public static final com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction BUTTON_CLICKED = new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction("BUTTON_CLICKED", 5);

    private static final /* synthetic */ com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[] $values() {
        return new com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[]{LAUNCHED, ITEM_CLICKED, INNER_SCREEN_VIEWED, PROMO_CODE_COPIED, BACK_CLICKED, BUTTON_CLICKED};
    }

    static {
        com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CatalogAnalyticsAction(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction) java.lang.Enum.valueOf(com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction.class, str);
    }

    public static com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[] values() {
        return (com.truecaller.premium.api.catalog.internal.CatalogAnalyticsAction[]) $VALUES.clone();
    }
}
