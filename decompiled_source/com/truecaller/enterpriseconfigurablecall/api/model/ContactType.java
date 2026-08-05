package com.truecaller.enterpriseconfigurablecall.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/enterpriseconfigurablecall/api/model/ContactType;", "", "<init>", "(Ljava/lang/String;I)V", "Default", "Premium", "Gold", "Private", "Priority", "VerifiedBusiness", "SmallBusiness", "PrivateImBusiness", "RCS", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.model.ContactType[] $VALUES;
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType Default = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("Default", 0);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType Premium = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("Premium", 1);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType Gold = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("Gold", 2);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType Private = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("Private", 3);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType Priority = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("Priority", 4);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType VerifiedBusiness = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("VerifiedBusiness", 5);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType SmallBusiness = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("SmallBusiness", 6);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType PrivateImBusiness = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("PrivateImBusiness", 7);
    public static final com.truecaller.enterpriseconfigurablecall.api.model.ContactType RCS = new com.truecaller.enterpriseconfigurablecall.api.model.ContactType("RCS", 8);

    private static final /* synthetic */ com.truecaller.enterpriseconfigurablecall.api.model.ContactType[] $values() {
        return new com.truecaller.enterpriseconfigurablecall.api.model.ContactType[]{Default, Premium, Gold, Private, Priority, VerifiedBusiness, SmallBusiness, PrivateImBusiness, RCS};
    }

    static {
        com.truecaller.enterpriseconfigurablecall.api.model.ContactType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterpriseconfigurablecall.api.model.ContactType valueOf(java.lang.String str) {
        return (com.truecaller.enterpriseconfigurablecall.api.model.ContactType) java.lang.Enum.valueOf(com.truecaller.enterpriseconfigurablecall.api.model.ContactType.class, str);
    }

    public static com.truecaller.enterpriseconfigurablecall.api.model.ContactType[] values() {
        return (com.truecaller.enterpriseconfigurablecall.api.model.ContactType[]) $VALUES.clone();
    }
}
