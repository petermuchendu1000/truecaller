package com.truecaller.calllog.presentation.ui.screen.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/truecaller/calllog/presentation/ui/screen/model/FiltersState$CallHistoryFilter$FilterType", "", "Lcom/truecaller/calllog/presentation/ui/screen/model/FiltersState$CallHistoryFilter$FilterType;", "<init>", "(Ljava/lang/String;I)V", "ALL", "INCOMING", "OUTGOING", "MISSED", "BLOCKED_AND_SPAM", "RECORDINGS", "VERIFIED_BUSINESS", "NOT_SPAM", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FiltersState$CallHistoryFilter$FilterType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[] $VALUES;
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType ALL = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("ALL", 0);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType INCOMING = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("INCOMING", 1);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType OUTGOING = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("OUTGOING", 2);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType MISSED = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("MISSED", 3);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType BLOCKED_AND_SPAM = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("BLOCKED_AND_SPAM", 4);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType RECORDINGS = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("RECORDINGS", 5);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType VERIFIED_BUSINESS = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("VERIFIED_BUSINESS", 6);
    public static final com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType NOT_SPAM = new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType("NOT_SPAM", 7);

    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[] $values() {
        return new com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[]{ALL, INCOMING, OUTGOING, MISSED, BLOCKED_AND_SPAM, RECORDINGS, VERIFIED_BUSINESS, NOT_SPAM};
    }

    static {
        com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FiltersState$CallHistoryFilter$FilterType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType valueOf(java.lang.String str) {
        return (com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType) java.lang.Enum.valueOf(com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType.class, str);
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[] values() {
        return (com.truecaller.calllog.presentation.ui.screen.model.FiltersState$CallHistoryFilter$FilterType[]) $VALUES.clone();
    }
}
