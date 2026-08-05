package com.truecaller.rewardprogram.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/rewardprogram/api/model/RewardProgramNameSuggestionSource;", "", "<init>", "(Ljava/lang/String;I)V", "PACS", "FACS", "DETAILS_VIEW", "CONVERSATION_LIST", "CONVERSATION", "CALL_HISTORY", "SCREENED_CALL_CHAT", "ASSISTANT_SPAM_BUTTON", "ASSISTANT_LIVE_CALL", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramNameSuggestionSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[] $VALUES;
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource PACS = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("PACS", 0);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource FACS = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("FACS", 1);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource DETAILS_VIEW = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("DETAILS_VIEW", 2);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource CONVERSATION_LIST = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("CONVERSATION_LIST", 3);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource CONVERSATION = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("CONVERSATION", 4);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource CALL_HISTORY = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("CALL_HISTORY", 5);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource SCREENED_CALL_CHAT = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("SCREENED_CALL_CHAT", 6);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource ASSISTANT_SPAM_BUTTON = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("ASSISTANT_SPAM_BUTTON", 7);
    public static final com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource ASSISTANT_LIVE_CALL = new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource("ASSISTANT_LIVE_CALL", 8);

    private static final /* synthetic */ com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[] $values() {
        return new com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[]{PACS, FACS, DETAILS_VIEW, CONVERSATION_LIST, CONVERSATION, CALL_HISTORY, SCREENED_CALL_CHAT, ASSISTANT_SPAM_BUTTON, ASSISTANT_LIVE_CALL};
    }

    static {
        com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RewardProgramNameSuggestionSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource) java.lang.Enum.valueOf(com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource.class, str);
    }

    public static com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[] values() {
        return (com.truecaller.rewardprogram.api.model.RewardProgramNameSuggestionSource[]) $VALUES.clone();
    }
}
