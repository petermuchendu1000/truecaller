package com.truecaller.detailsview.api.internal.contact;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/truecaller/detailsview/api/internal/contact/Contact$Number$Type", "", "Lcom/truecaller/detailsview/api/internal/contact/Contact$Number$Type;", "<init>", "(Ljava/lang/String;I)V", "FixedLine", "Mobile", "FixedLineOrMobile", "TollFree", "PremiumRate", "SharedCost", "PersonalNumber", "Pager", "Uan", "Voicemail", "Unknown", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Contact$Number$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type FixedLine = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("FixedLine", 0);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type Mobile = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("Mobile", 1);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type FixedLineOrMobile = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("FixedLineOrMobile", 2);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type TollFree = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("TollFree", 3);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type PremiumRate = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("PremiumRate", 4);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type SharedCost = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("SharedCost", 5);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type PersonalNumber = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("PersonalNumber", 6);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type Pager = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("Pager", 7);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type Uan = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("Uan", 8);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type Voicemail = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("Voicemail", 9);
    public static final com.truecaller.detailsview.api.internal.contact.Contact$Number$Type Unknown = new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type("Unknown", 10);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[] $values() {
        return new com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[]{FixedLine, Mobile, FixedLineOrMobile, TollFree, PremiumRate, SharedCost, PersonalNumber, Pager, Uan, Voicemail, Unknown};
    }

    static {
        com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Contact$Number$Type(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.contact.Contact$Number$Type valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.contact.Contact$Number$Type) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.contact.Contact$Number$Type.class, str);
    }

    public static com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[] values() {
        return (com.truecaller.detailsview.api.internal.contact.Contact$Number$Type[]) $VALUES.clone();
    }
}
