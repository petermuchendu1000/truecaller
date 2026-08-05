package com.truecaller.contactrequest.tabscontainer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/contactrequest/tabscontainer/ContactRequestTab;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "u71/baz", "PENDING", "UPDATES", "contact-request_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ContactRequestTab {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contactrequest.tabscontainer.ContactRequestTab[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final u71.baz Companion;
    public static final com.truecaller.contactrequest.tabscontainer.ContactRequestTab PENDING = new com.truecaller.contactrequest.tabscontainer.ContactRequestTab("PENDING", 0);
    public static final com.truecaller.contactrequest.tabscontainer.ContactRequestTab UPDATES = new com.truecaller.contactrequest.tabscontainer.ContactRequestTab("UPDATES", 1);

    private static final /* synthetic */ com.truecaller.contactrequest.tabscontainer.ContactRequestTab[] $values() {
        return new com.truecaller.contactrequest.tabscontainer.ContactRequestTab[]{PENDING, UPDATES};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [u71.baz, java.lang.Object] */
    static {
        com.truecaller.contactrequest.tabscontainer.ContactRequestTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ContactRequestTab(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.contactrequest.tabscontainer.ContactRequestTab fromPosition(int i) {
        Companion.getClass();
        if (i == 0) {
            return PENDING;
        }
        return UPDATES;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contactrequest.tabscontainer.ContactRequestTab valueOf(java.lang.String str) {
        return (com.truecaller.contactrequest.tabscontainer.ContactRequestTab) java.lang.Enum.valueOf(com.truecaller.contactrequest.tabscontainer.ContactRequestTab.class, str);
    }

    public static com.truecaller.contactrequest.tabscontainer.ContactRequestTab[] values() {
        return (com.truecaller.contactrequest.tabscontainer.ContactRequestTab[]) $VALUES.clone();
    }
}
