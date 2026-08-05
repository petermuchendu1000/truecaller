package com.truecaller.filters.blockedevents.blockname;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/filters/blockedevents/blockname/FilterUiState$Status", "", "Lcom/truecaller/filters/blockedevents/blockname/FilterUiState$Status;", "<init>", "(Ljava/lang/String;I)V", "Companion", "wo1/y", "Default", "Error", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FilterUiState$Status {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final wo1.y Companion;
    public static final com.truecaller.filters.blockedevents.blockname.FilterUiState$Status Default = new com.truecaller.filters.blockedevents.blockname.FilterUiState$Status("Default", 0);
    public static final com.truecaller.filters.blockedevents.blockname.FilterUiState$Status Error = new com.truecaller.filters.blockedevents.blockname.FilterUiState$Status("Error", 1);

    private static final /* synthetic */ com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[] $values() {
        return new com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[]{Default, Error};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [wo1.y, java.lang.Object] */
    static {
        com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private FilterUiState$Status(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.filters.blockedevents.blockname.FilterUiState$Status valueOf(java.lang.String str) {
        return (com.truecaller.filters.blockedevents.blockname.FilterUiState$Status) java.lang.Enum.valueOf(com.truecaller.filters.blockedevents.blockname.FilterUiState$Status.class, str);
    }

    public static com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[] values() {
        return (com.truecaller.filters.blockedevents.blockname.FilterUiState$Status[]) $VALUES.clone();
    }
}
