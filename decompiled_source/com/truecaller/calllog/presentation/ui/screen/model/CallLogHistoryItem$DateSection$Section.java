package com.truecaller.calllog.presentation.ui.screen.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$DateSection$Section", "", "Lcom/truecaller/calllog/presentation/ui/screen/model/CallLogHistoryItem$DateSection$Section;", "<init>", "(Ljava/lang/String;I)V", "TODAY", "YESTERDAY", "LAST_WEEK", "OLDER", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallLogHistoryItem$DateSection$Section {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[] $VALUES;
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section TODAY = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section("TODAY", 0);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section YESTERDAY = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section("YESTERDAY", 1);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section LAST_WEEK = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section("LAST_WEEK", 2);
    public static final com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section OLDER = new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section("OLDER", 3);

    private static final /* synthetic */ com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[] $values() {
        return new com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[]{TODAY, YESTERDAY, LAST_WEEK, OLDER};
    }

    static {
        com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallLogHistoryItem$DateSection$Section(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section valueOf(java.lang.String str) {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section) java.lang.Enum.valueOf(com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section.class, str);
    }

    public static com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[] values() {
        return (com.truecaller.calllog.presentation.ui.screen.model.CallLogHistoryItem$DateSection$Section[]) $VALUES.clone();
    }
}
