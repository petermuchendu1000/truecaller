package com.truecaller.messaging.mediamanager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/mediamanager/SortOption;", "", "<init>", "(Ljava/lang/String;I)V", "DATE_DESC", "DATE_ASC", "SIZE_DESC", "SIZE_ASC", "messaging-storage_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SortOption {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.mediamanager.SortOption[] $VALUES;
    public static final com.truecaller.messaging.mediamanager.SortOption DATE_DESC = new com.truecaller.messaging.mediamanager.SortOption("DATE_DESC", 0);
    public static final com.truecaller.messaging.mediamanager.SortOption DATE_ASC = new com.truecaller.messaging.mediamanager.SortOption("DATE_ASC", 1);
    public static final com.truecaller.messaging.mediamanager.SortOption SIZE_DESC = new com.truecaller.messaging.mediamanager.SortOption("SIZE_DESC", 2);
    public static final com.truecaller.messaging.mediamanager.SortOption SIZE_ASC = new com.truecaller.messaging.mediamanager.SortOption("SIZE_ASC", 3);

    private static final /* synthetic */ com.truecaller.messaging.mediamanager.SortOption[] $values() {
        return new com.truecaller.messaging.mediamanager.SortOption[]{DATE_DESC, DATE_ASC, SIZE_DESC, SIZE_ASC};
    }

    static {
        com.truecaller.messaging.mediamanager.SortOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SortOption(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.mediamanager.SortOption valueOf(java.lang.String str) {
        return (com.truecaller.messaging.mediamanager.SortOption) java.lang.Enum.valueOf(com.truecaller.messaging.mediamanager.SortOption.class, str);
    }

    public static com.truecaller.messaging.mediamanager.SortOption[] values() {
        return (com.truecaller.messaging.mediamanager.SortOption[]) $VALUES.clone();
    }
}
