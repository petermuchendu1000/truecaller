package com.truecaller.bizmon.analytic;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/bizmon/analytic/BizAppViewVisitedV2ViewId;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "BIZ_LANDSCAPE_VIDEO", "BIZ_VIDEO_BUTTON", "BIZ_CALL_ME_BACK", "BIZ_CALL_ME_BACK_WITH_SLOTS", "BIZ_CALL_ME_BACK_SUCCESS", "BIZ_SURVEY_CARD", "BIZ_SURVEY_CARD_SINGLE", "BIZ_SURVEY_BOTTOM_SHEET", "bizmon_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BizAppViewVisitedV2ViewId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_LANDSCAPE_VIDEO = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_LANDSCAPE_VIDEO", 0, "BizLandscapeVideo");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_VIDEO_BUTTON = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_VIDEO_BUTTON", 1, "BizVideoButton");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_CALL_ME_BACK = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_CALL_ME_BACK", 2, "BizCallMeBack");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_CALL_ME_BACK_WITH_SLOTS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_CALL_ME_BACK_WITH_SLOTS", 3, "BizCallMeBackWithSlots");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_CALL_ME_BACK_SUCCESS = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_CALL_ME_BACK_SUCCESS", 4, "BizCallMeBackSuccess");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_SURVEY_CARD = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_SURVEY_CARD", 5, "BizSurveyCard");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_SURVEY_CARD_SINGLE = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_SURVEY_CARD_SINGLE", 6, "BizSurveyCardSingle");
    public static final com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId BIZ_SURVEY_BOTTOM_SHEET = new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId("BIZ_SURVEY_BOTTOM_SHEET", 7, "BizSurveyBottomSheet");

    private static final /* synthetic */ com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[] $values() {
        return new com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[]{BIZ_LANDSCAPE_VIDEO, BIZ_VIDEO_BUTTON, BIZ_CALL_ME_BACK, BIZ_CALL_ME_BACK_WITH_SLOTS, BIZ_CALL_ME_BACK_SUCCESS, BIZ_SURVEY_CARD, BIZ_SURVEY_CARD_SINGLE, BIZ_SURVEY_BOTTOM_SHEET};
    }

    static {
        com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BizAppViewVisitedV2ViewId(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId valueOf(java.lang.String str) {
        return (com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId) java.lang.Enum.valueOf(com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId.class, str);
    }

    public static com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[] values() {
        return (com.truecaller.bizmon.analytic.BizAppViewVisitedV2ViewId[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
