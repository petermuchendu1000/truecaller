package com.truecaller.premium.data.component.spotlight;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/truecaller/premium/data/component/spotlight/SpotlightSubComponentType;", "", "stringValue", "", "defaultRank", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getStringValue", "()Ljava/lang/String;", "getDefaultRank", "()I", "GIVEAWAY", "CAMPAIGN", "GOLD_GIFT", "WVM_FEATURE", "WSFM_FEATURE", "CONTACT_REQUEST", "NEW_FEATURE", "UPGRADE", "FAMILY", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SpotlightSubComponentType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[] $VALUES;
    private final int defaultRank;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String stringValue;
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType GIVEAWAY = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("GIVEAWAY", 0, "giveaway", 1);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType CAMPAIGN = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("CAMPAIGN", 1, "campaign", 2);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType GOLD_GIFT = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("GOLD_GIFT", 2, "gold_gift", 3);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType WVM_FEATURE = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("WVM_FEATURE", 3, "wvm_feature", 4);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType WSFM_FEATURE = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("WSFM_FEATURE", 4, "wsfm_feature", 5);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType CONTACT_REQUEST = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("CONTACT_REQUEST", 5, "contact_request", 6);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType NEW_FEATURE = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("NEW_FEATURE", 6, "new_feature", 7);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType UPGRADE = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("UPGRADE", 7, "upgrade_path", 8);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType FAMILY = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("FAMILY", 8, "family", 9);
    public static final com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType UNKNOWN = new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType("UNKNOWN", 9, "Unknown", -1);

    private static final /* synthetic */ com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[] $values() {
        return new com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[]{GIVEAWAY, CAMPAIGN, GOLD_GIFT, WVM_FEATURE, WSFM_FEATURE, CONTACT_REQUEST, NEW_FEATURE, UPGRADE, FAMILY, UNKNOWN};
    }

    static {
        com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SpotlightSubComponentType(java.lang.String str, int i, java.lang.String str2, int i2) {
        this.stringValue = str2;
        this.defaultRank = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType) java.lang.Enum.valueOf(com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType.class, str);
    }

    public static com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[] values() {
        return (com.truecaller.premium.data.component.spotlight.SpotlightSubComponentType[]) $VALUES.clone();
    }

    public final int getDefaultRank() {
        return this.defaultRank;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStringValue() {
        return this.stringValue;
    }
}
