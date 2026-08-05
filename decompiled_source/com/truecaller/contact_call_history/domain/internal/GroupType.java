package com.truecaller.contact_call_history.domain.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/contact_call_history/domain/internal/GroupType;", "", "<init>", "(Ljava/lang/String;I)V", "OneItemGroup", "Header", "Body", "Last", "contact-call-history_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class GroupType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.contact_call_history.domain.internal.GroupType[] $VALUES;
    public static final com.truecaller.contact_call_history.domain.internal.GroupType OneItemGroup = new com.truecaller.contact_call_history.domain.internal.GroupType("OneItemGroup", 0);
    public static final com.truecaller.contact_call_history.domain.internal.GroupType Header = new com.truecaller.contact_call_history.domain.internal.GroupType("Header", 1);
    public static final com.truecaller.contact_call_history.domain.internal.GroupType Body = new com.truecaller.contact_call_history.domain.internal.GroupType("Body", 2);
    public static final com.truecaller.contact_call_history.domain.internal.GroupType Last = new com.truecaller.contact_call_history.domain.internal.GroupType("Last", 3);

    private static final /* synthetic */ com.truecaller.contact_call_history.domain.internal.GroupType[] $values() {
        return new com.truecaller.contact_call_history.domain.internal.GroupType[]{OneItemGroup, Header, Body, Last};
    }

    static {
        com.truecaller.contact_call_history.domain.internal.GroupType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private GroupType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.contact_call_history.domain.internal.GroupType valueOf(java.lang.String str) {
        return (com.truecaller.contact_call_history.domain.internal.GroupType) java.lang.Enum.valueOf(com.truecaller.contact_call_history.domain.internal.GroupType.class, str);
    }

    public static com.truecaller.contact_call_history.domain.internal.GroupType[] values() {
        return (com.truecaller.contact_call_history.domain.internal.GroupType[]) $VALUES.clone();
    }
}
