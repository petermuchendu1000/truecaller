package com.truecaller.contactrequest.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/contactrequest/utils/ContactDataType;", "", "<init>", "(Ljava/lang/String;I)V", "Address", "Email", "Website", "Job", "Facebook", "Twitter", "About", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactDataType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contactrequest.utils.ContactDataType[] $VALUES;
    public static final com.truecaller.contactrequest.utils.ContactDataType Address = new com.truecaller.contactrequest.utils.ContactDataType("Address", 0);
    public static final com.truecaller.contactrequest.utils.ContactDataType Email = new com.truecaller.contactrequest.utils.ContactDataType("Email", 1);
    public static final com.truecaller.contactrequest.utils.ContactDataType Website = new com.truecaller.contactrequest.utils.ContactDataType("Website", 2);
    public static final com.truecaller.contactrequest.utils.ContactDataType Job = new com.truecaller.contactrequest.utils.ContactDataType("Job", 3);
    public static final com.truecaller.contactrequest.utils.ContactDataType Facebook = new com.truecaller.contactrequest.utils.ContactDataType("Facebook", 4);
    public static final com.truecaller.contactrequest.utils.ContactDataType Twitter = new com.truecaller.contactrequest.utils.ContactDataType("Twitter", 5);
    public static final com.truecaller.contactrequest.utils.ContactDataType About = new com.truecaller.contactrequest.utils.ContactDataType("About", 6);

    private static final /* synthetic */ com.truecaller.contactrequest.utils.ContactDataType[] $values() {
        return new com.truecaller.contactrequest.utils.ContactDataType[]{Address, Email, Website, Job, Facebook, Twitter, About};
    }

    static {
        com.truecaller.contactrequest.utils.ContactDataType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactDataType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contactrequest.utils.ContactDataType valueOf(java.lang.String str) {
        return (com.truecaller.contactrequest.utils.ContactDataType) java.lang.Enum.valueOf(com.truecaller.contactrequest.utils.ContactDataType.class, str);
    }

    public static com.truecaller.contactrequest.utils.ContactDataType[] values() {
        return (com.truecaller.contactrequest.utils.ContactDataType[]) $VALUES.clone();
    }
}
