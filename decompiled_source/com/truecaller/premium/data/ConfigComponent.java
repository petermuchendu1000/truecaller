package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/premium/data/ConfigComponent;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "INTERSTITIAL", "STATIC_SCREEN", "CATALOG", "SPOTLIGHT", "BANNER", "BOTTOM_SHEET", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ConfigComponent {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.ConfigComponent[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.ConfigComponent INTERSTITIAL = new com.truecaller.premium.data.ConfigComponent("INTERSTITIAL", 0, "interstitial");
    public static final com.truecaller.premium.data.ConfigComponent STATIC_SCREEN = new com.truecaller.premium.data.ConfigComponent("STATIC_SCREEN", 1, "static_screen");
    public static final com.truecaller.premium.data.ConfigComponent CATALOG = new com.truecaller.premium.data.ConfigComponent("CATALOG", 2, "catalog");
    public static final com.truecaller.premium.data.ConfigComponent SPOTLIGHT = new com.truecaller.premium.data.ConfigComponent("SPOTLIGHT", 3, "spotlight");
    public static final com.truecaller.premium.data.ConfigComponent BANNER = new com.truecaller.premium.data.ConfigComponent("BANNER", 4, "banner");
    public static final com.truecaller.premium.data.ConfigComponent BOTTOM_SHEET = new com.truecaller.premium.data.ConfigComponent("BOTTOM_SHEET", 5, "bottom_sheet");

    private static final /* synthetic */ com.truecaller.premium.data.ConfigComponent[] $values() {
        return new com.truecaller.premium.data.ConfigComponent[]{INTERSTITIAL, STATIC_SCREEN, CATALOG, SPOTLIGHT, BANNER, BOTTOM_SHEET};
    }

    static {
        com.truecaller.premium.data.ConfigComponent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ConfigComponent(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.ConfigComponent valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.ConfigComponent) java.lang.Enum.valueOf(com.truecaller.premium.data.ConfigComponent.class, str);
    }

    public static com.truecaller.premium.data.ConfigComponent[] values() {
        return (com.truecaller.premium.data.ConfigComponent[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
