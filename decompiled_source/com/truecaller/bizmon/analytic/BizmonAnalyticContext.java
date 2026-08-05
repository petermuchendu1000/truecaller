package com.truecaller.bizmon.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/truecaller/bizmon/analytic/BizmonAnalyticContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DETAILS_VIEW_CALL_REASON", "FULL_CALLER_ID_CALL_REASON", "FULL_CALLER_ID_CALL_REASON_V2", "POPUP_CALLER_ID_CALL_REASON", "FACS_ACS_CALL_REASON", "PACS_ACS_CALL_REASON", "BUSINESS_CALL_FINISHED", "PACS_FEEDBACK", "FACS_FEEDBACK", "DETAILED_VIEW", "DETAILED_VIEW_UNBLOCK_CLICKED", "DETAILED_VIEW_BLOCK_CLICKED", "PACS_UNBLOCK_CLICKED", "PACS_BLOCK_CLICKED", "FACS_UNBLOCK_CLICKED", "FACS_BLOCK_CLICKED", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizmonAnalyticContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizmonAnalyticContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext DETAILS_VIEW_CALL_REASON = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("DETAILS_VIEW_CALL_REASON", 0, "DetailsViewCallReason");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FULL_CALLER_ID_CALL_REASON = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FULL_CALLER_ID_CALL_REASON", 1, "FullCallerIDCallReason");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FULL_CALLER_ID_CALL_REASON_V2 = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FULL_CALLER_ID_CALL_REASON_V2", 2, "FullCallerIDCallReasonv2");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext POPUP_CALLER_ID_CALL_REASON = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("POPUP_CALLER_ID_CALL_REASON", 3, "PopupCallerIDCallReason");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FACS_ACS_CALL_REASON = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FACS_ACS_CALL_REASON", 4, "FacsAcsCallReason");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext PACS_ACS_CALL_REASON = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("PACS_ACS_CALL_REASON", 5, "PacsAcsCallReason");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext BUSINESS_CALL_FINISHED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("BUSINESS_CALL_FINISHED", 6, "BusinessCallFinished");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext PACS_FEEDBACK = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("PACS_FEEDBACK", 7, "PacsFeedback");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FACS_FEEDBACK = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FACS_FEEDBACK", 8, "FacsFeedback");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext DETAILED_VIEW = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("DETAILED_VIEW", 9, "DetailedView");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext DETAILED_VIEW_UNBLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("DETAILED_VIEW_UNBLOCK_CLICKED", 10, "DetailedViewUnblockClicked");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext DETAILED_VIEW_BLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("DETAILED_VIEW_BLOCK_CLICKED", 11, "DetailedViewBlockClicked");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext PACS_UNBLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("PACS_UNBLOCK_CLICKED", 12, "PacsUnblockClicked");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext PACS_BLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("PACS_BLOCK_CLICKED", 13, "PacsBlockClicked");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FACS_UNBLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FACS_UNBLOCK_CLICKED", 14, "FacsUnblockClicked");
    public static final com.truecaller.bizmon.analytic.BizmonAnalyticContext FACS_BLOCK_CLICKED = new com.truecaller.bizmon.analytic.BizmonAnalyticContext("FACS_BLOCK_CLICKED", 15, "FacsBlockClicked");

    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizmonAnalyticContext[] $values() {
        return new com.truecaller.bizmon.analytic.BizmonAnalyticContext[]{DETAILS_VIEW_CALL_REASON, FULL_CALLER_ID_CALL_REASON, FULL_CALLER_ID_CALL_REASON_V2, POPUP_CALLER_ID_CALL_REASON, FACS_ACS_CALL_REASON, PACS_ACS_CALL_REASON, BUSINESS_CALL_FINISHED, PACS_FEEDBACK, FACS_FEEDBACK, DETAILED_VIEW, DETAILED_VIEW_UNBLOCK_CLICKED, DETAILED_VIEW_BLOCK_CLICKED, PACS_UNBLOCK_CLICKED, PACS_BLOCK_CLICKED, FACS_UNBLOCK_CLICKED, FACS_BLOCK_CLICKED};
    }

    static {
        com.truecaller.bizmon.analytic.BizmonAnalyticContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizmonAnalyticContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.analytic.BizmonAnalyticContext valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.analytic.BizmonAnalyticContext) java.lang.Enum.valueOf(com.truecaller.bizmon.analytic.BizmonAnalyticContext.class, str);
    }

    public static com.truecaller.bizmon.analytic.BizmonAnalyticContext[] values() {
        return (com.truecaller.bizmon.analytic.BizmonAnalyticContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
