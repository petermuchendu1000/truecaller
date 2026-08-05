package com.truecaller.bizmon.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/bizmon/analytic/BizAppViewVisitedV2Context;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IN_CALL_UI", "PCID", "FACS", "PACS", "NEO_FACS", "NEO_PACS", "DETAILS_VIEW_V2", "DETAILS_VIEW_BOTTOM_SHEET", "DETAILS_VIEW_NOTIFICATION", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizAppViewVisitedV2Context {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context IN_CALL_UI = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("IN_CALL_UI", 0, "InCallUI");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context PCID = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("PCID", 1, "PopupCallerId");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context FACS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("FACS", 2, "FullScreenAcs");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context PACS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("PACS", 3, "PopupAcs");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context NEO_FACS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("NEO_FACS", 4, "FullScreenNeoAcs");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context NEO_PACS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("NEO_PACS", 5, "PopupNeoAcs");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context DETAILS_VIEW_V2 = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("DETAILS_VIEW_V2", 6, "DetailsViewV2");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context DETAILS_VIEW_BOTTOM_SHEET = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("DETAILS_VIEW_BOTTOM_SHEET", 7, "DetailsViewBottomSheet");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context DETAILS_VIEW_NOTIFICATION = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context("DETAILS_VIEW_NOTIFICATION", 8, "DetailsViewNotification");

    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[] $values() {
        return new com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[]{IN_CALL_UI, PCID, FACS, PACS, NEO_FACS, NEO_PACS, DETAILS_VIEW_V2, DETAILS_VIEW_BOTTOM_SHEET, DETAILS_VIEW_NOTIFICATION};
    }

    static {
        com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizAppViewVisitedV2Context(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context) java.lang.Enum.valueOf(com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context.class, str);
    }

    public static com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[] values() {
        return (com.truecaller.bizmon.analytic.BizAppViewVisitedV2Context[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
