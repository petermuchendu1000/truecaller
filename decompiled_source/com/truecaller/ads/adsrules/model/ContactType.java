package com.truecaller.ads.adsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/adsrules/model/ContactType;", "", "<init>", "(Ljava/lang/String;I)V", "PHONEBOOK", "NON_PHONEBOOK", "SPAM", "UNKNOWN", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ContactType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrules.model.ContactType[] $VALUES;
    public static final com.truecaller.ads.adsrules.model.ContactType PHONEBOOK = new com.truecaller.ads.adsrules.model.ContactType("PHONEBOOK", 0);
    public static final com.truecaller.ads.adsrules.model.ContactType NON_PHONEBOOK = new com.truecaller.ads.adsrules.model.ContactType("NON_PHONEBOOK", 1);
    public static final com.truecaller.ads.adsrules.model.ContactType SPAM = new com.truecaller.ads.adsrules.model.ContactType("SPAM", 2);
    public static final com.truecaller.ads.adsrules.model.ContactType UNKNOWN = new com.truecaller.ads.adsrules.model.ContactType("UNKNOWN", 3);

    private static final /* synthetic */ com.truecaller.ads.adsrules.model.ContactType[] $values() {
        return new com.truecaller.ads.adsrules.model.ContactType[]{PHONEBOOK, NON_PHONEBOOK, SPAM, UNKNOWN};
    }

    static {
        com.truecaller.ads.adsrules.model.ContactType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrules.model.ContactType valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrules.model.ContactType) java.lang.Enum.valueOf(com.truecaller.ads.adsrules.model.ContactType.class, str);
    }

    public static com.truecaller.ads.adsrules.model.ContactType[] values() {
        return (com.truecaller.ads.adsrules.model.ContactType[]) $VALUES.clone();
    }
}
