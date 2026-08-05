package com.truecaller.surveys.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/surveys/analytics/SurveySource;", "", "source", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSource", "()Ljava/lang/String;", "PACS", "FACS", "DETAILS_VIEW", "REWARD_PROGRAM", "BLOCK", "FAMILY_PROTECTION", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SurveySource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.surveys.analytics.SurveySource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String source;
    public static final com.truecaller.surveys.analytics.SurveySource PACS = new com.truecaller.surveys.analytics.SurveySource("PACS", 0, "PACS");
    public static final com.truecaller.surveys.analytics.SurveySource FACS = new com.truecaller.surveys.analytics.SurveySource("FACS", 1, "FACS");
    public static final com.truecaller.surveys.analytics.SurveySource DETAILS_VIEW = new com.truecaller.surveys.analytics.SurveySource("DETAILS_VIEW", 2, "DetailsViewV2");
    public static final com.truecaller.surveys.analytics.SurveySource REWARD_PROGRAM = new com.truecaller.surveys.analytics.SurveySource("REWARD_PROGRAM", 3, "RewardProgram");
    public static final com.truecaller.surveys.analytics.SurveySource BLOCK = new com.truecaller.surveys.analytics.SurveySource("BLOCK", 4, "Block");
    public static final com.truecaller.surveys.analytics.SurveySource FAMILY_PROTECTION = new com.truecaller.surveys.analytics.SurveySource("FAMILY_PROTECTION", 5, "FamilyProtection");

    private static final /* synthetic */ com.truecaller.surveys.analytics.SurveySource[] $values() {
        return new com.truecaller.surveys.analytics.SurveySource[]{PACS, FACS, DETAILS_VIEW, REWARD_PROGRAM, BLOCK, FAMILY_PROTECTION};
    }

    static {
        com.truecaller.surveys.analytics.SurveySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SurveySource(java.lang.String str, int i, java.lang.String str2) {
        this.source = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.surveys.analytics.SurveySource valueOf(java.lang.String str) {
        return (com.truecaller.surveys.analytics.SurveySource) java.lang.Enum.valueOf(com.truecaller.surveys.analytics.SurveySource.class, str);
    }

    public static com.truecaller.surveys.analytics.SurveySource[] values() {
        return (com.truecaller.surveys.analytics.SurveySource[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSource() {
        return this.source;
    }
}
