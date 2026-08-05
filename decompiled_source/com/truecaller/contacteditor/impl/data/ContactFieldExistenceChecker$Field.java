package com.truecaller.contacteditor.impl.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/contacteditor/impl/data/ContactFieldExistenceChecker$Field", "", "Lcom/truecaller/contacteditor/impl/data/ContactFieldExistenceChecker$Field;", "<init>", "(Ljava/lang/String;I)V", "STRUCTURED_NAME", "PHONE_NUMBER", "PHOTO", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactFieldExistenceChecker$Field {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[] $VALUES;
    public static final com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field STRUCTURED_NAME = new com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field("STRUCTURED_NAME", 0);
    public static final com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field PHONE_NUMBER = new com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field("PHONE_NUMBER", 1);
    public static final com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field PHOTO = new com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field("PHOTO", 2);

    private static final /* synthetic */ com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[] $values() {
        return new com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[]{STRUCTURED_NAME, PHONE_NUMBER, PHOTO};
    }

    static {
        com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ContactFieldExistenceChecker$Field(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field valueOf(java.lang.String str) {
        return (com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field) java.lang.Enum.valueOf(com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field.class, str);
    }

    public static com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[] values() {
        return (com.truecaller.contacteditor.impl.data.ContactFieldExistenceChecker$Field[]) $VALUES.clone();
    }
}
