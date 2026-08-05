package com.truecaller.ads.adsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/adsrules/model/NeoRuleEnabledProperty;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_TYPE", "DURATION", "AD_AVAILABILITY", "AD_TYPE", "CONNECTION_TYPE", "DEVICE_LOCKED_STATUS", "IS_PHONEBOOK_CONTACT", "IS_SPAM", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class NeoRuleEnabledProperty {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty CALL_TYPE = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("CALL_TYPE", 0, "direction");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty DURATION = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("DURATION", 1, "duration");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty AD_AVAILABILITY = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("AD_AVAILABILITY", 2, "fill");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty AD_TYPE = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("AD_TYPE", 3, "adType");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty CONNECTION_TYPE = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("CONNECTION_TYPE", 4, "network");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty DEVICE_LOCKED_STATUS = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("DEVICE_LOCKED_STATUS", 5, "lock");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty IS_PHONEBOOK_CONTACT = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("IS_PHONEBOOK_CONTACT", 6, "pb");
    public static final com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty IS_SPAM = new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty("IS_SPAM", 7, "spam");

    private static final /* synthetic */ com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[] $values() {
        return new com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[]{CALL_TYPE, DURATION, AD_AVAILABILITY, AD_TYPE, CONNECTION_TYPE, DEVICE_LOCKED_STATUS, IS_PHONEBOOK_CONTACT, IS_SPAM};
    }

    static {
        com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NeoRuleEnabledProperty(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty) java.lang.Enum.valueOf(com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty.class, str);
    }

    public static com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[] values() {
        return (com.truecaller.ads.adsrules.model.NeoRuleEnabledProperty[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
