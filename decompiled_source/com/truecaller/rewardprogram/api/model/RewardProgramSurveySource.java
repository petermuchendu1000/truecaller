package com.truecaller.rewardprogram.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/rewardprogram/api/model/RewardProgramSurveySource;", "", "<init>", "(Ljava/lang/String;I)V", "PACS", "FACS", "DETAILS_VIEW", "REWARD_PROGRAM", "BLOCK", "FAMILY_PROTECTION", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramSurveySource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[] $VALUES;
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource PACS = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("PACS", 0);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource FACS = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("FACS", 1);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource DETAILS_VIEW = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("DETAILS_VIEW", 2);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource REWARD_PROGRAM = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("REWARD_PROGRAM", 3);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource BLOCK = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("BLOCK", 4);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramSurveySource FAMILY_PROTECTION = new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource("FAMILY_PROTECTION", 5);

    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[] $values() {
        return new com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[]{PACS, FACS, DETAILS_VIEW, REWARD_PROGRAM, BLOCK, FAMILY_PROTECTION};
    }

    static {
        com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RewardProgramSurveySource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.api.model.RewardProgramSurveySource valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.api.model.RewardProgramSurveySource) java.lang.Enum.valueOf(com.truecaller.rewardprogram.api.model.RewardProgramSurveySource.class, str);
    }

    public static com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[] values() {
        return (com.truecaller.rewardprogram.api.model.RewardProgramSurveySource[]) $VALUES.clone();
    }
}
