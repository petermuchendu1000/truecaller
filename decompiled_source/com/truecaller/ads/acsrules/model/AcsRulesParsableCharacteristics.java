package com.truecaller.ads.acsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/acsrules/model/AcsRulesParsableCharacteristics;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_DIRECTION", "CALL_ANSWERED", "CALL_DURATION", "IS_PHONEBOOK", "IS_SPAM", "BADGE", "IS_AD_AVAILABLE", "AD_TYPE", "CONNECTION_TYPE", "IS_DEVICE_LOCKED", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AcsRulesParsableCharacteristics {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics CALL_DIRECTION = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("CALL_DIRECTION", 0, "direction");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics CALL_ANSWERED = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("CALL_ANSWERED", 1, "answered");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics CALL_DURATION = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("CALL_DURATION", 2, "duration");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics IS_PHONEBOOK = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("IS_PHONEBOOK", 3, "phonebook");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics IS_SPAM = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("IS_SPAM", 4, "spam");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics BADGE = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("BADGE", 5, "badge");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics IS_AD_AVAILABLE = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("IS_AD_AVAILABLE", 6, "ad_available");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics AD_TYPE = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("AD_TYPE", 7, "ad_type");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics CONNECTION_TYPE = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("CONNECTION_TYPE", 8, "connection_type");
    public static final com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics IS_DEVICE_LOCKED = new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics("IS_DEVICE_LOCKED", 9, "device_locked");

    private static final /* synthetic */ com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[] $values() {
        return new com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[]{CALL_DIRECTION, CALL_ANSWERED, CALL_DURATION, IS_PHONEBOOK, IS_SPAM, BADGE, IS_AD_AVAILABLE, AD_TYPE, CONNECTION_TYPE, IS_DEVICE_LOCKED};
    }

    static {
        com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AcsRulesParsableCharacteristics(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics valueOf(java.lang.String str) {
        return (com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics) java.lang.Enum.valueOf(com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics.class, str);
    }

    public static com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[] values() {
        return (com.truecaller.ads.acsrules.model.AcsRulesParsableCharacteristics[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
