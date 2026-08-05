package com.truecaller.surveys.helper;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcom/truecaller/surveys/helper/PassthroughKey;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UNDEFINED", "SEARCH_CONTEXT_CALL_REASON", "SEARCH_DISPLAYED_NAME", "SEARCHED_PHONE", "ELECTED_SOURCE", "NAME_ELECTION_ALGO", "EXTERNAL_SEARCH_PROVIDER", "SEARCH_CONTEXT_RULE_ID", "NAME_FEEDBACK_SOURCE", "PROFILE_FULL_NAME", "PROFILE_ALT_NAME", "PROFILE_AVATAR_URL", "PROFILE_TAG", "PROFILE_ADDRESS", "PROFILE_COMPANY", "PROFILE_JOB_TITLE", "PROFILE_URL", "PROFILE_ABOUT_ME", "PROFILE_BADGES", "PROFILE_PRIVATE_TC_ID", "UNSUPPORTED", "surveys_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class PassthroughKey {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.surveys.helper.PassthroughKey[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.surveys.helper.PassthroughKey UNDEFINED = new com.truecaller.surveys.helper.PassthroughKey("UNDEFINED", 0, "0");
    public static final com.truecaller.surveys.helper.PassthroughKey SEARCH_CONTEXT_CALL_REASON = new com.truecaller.surveys.helper.PassthroughKey("SEARCH_CONTEXT_CALL_REASON", 1, com.unity3d.services.UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    public static final com.truecaller.surveys.helper.PassthroughKey SEARCH_DISPLAYED_NAME = new com.truecaller.surveys.helper.PassthroughKey("SEARCH_DISPLAYED_NAME", 2, com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    public static final com.truecaller.surveys.helper.PassthroughKey SEARCHED_PHONE = new com.truecaller.surveys.helper.PassthroughKey("SEARCHED_PHONE", 3, "3");
    public static final com.truecaller.surveys.helper.PassthroughKey ELECTED_SOURCE = new com.truecaller.surveys.helper.PassthroughKey("ELECTED_SOURCE", 4, "4");
    public static final com.truecaller.surveys.helper.PassthroughKey NAME_ELECTION_ALGO = new com.truecaller.surveys.helper.PassthroughKey("NAME_ELECTION_ALGO", 5, "5");
    public static final com.truecaller.surveys.helper.PassthroughKey EXTERNAL_SEARCH_PROVIDER = new com.truecaller.surveys.helper.PassthroughKey("EXTERNAL_SEARCH_PROVIDER", 6, "6");
    public static final com.truecaller.surveys.helper.PassthroughKey SEARCH_CONTEXT_RULE_ID = new com.truecaller.surveys.helper.PassthroughKey("SEARCH_CONTEXT_RULE_ID", 7, "7");
    public static final com.truecaller.surveys.helper.PassthroughKey NAME_FEEDBACK_SOURCE = new com.truecaller.surveys.helper.PassthroughKey("NAME_FEEDBACK_SOURCE", 8, "8");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_FULL_NAME = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_FULL_NAME", 9, "9");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_ALT_NAME = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_ALT_NAME", 10, "10");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_AVATAR_URL = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_AVATAR_URL", 11, "11");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_TAG = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_TAG", 12, "12");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_ADDRESS = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_ADDRESS", 13, "13");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_COMPANY = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_COMPANY", 14, "14");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_JOB_TITLE = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_JOB_TITLE", 15, "15");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_URL = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_URL", 16, "16");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_ABOUT_ME = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_ABOUT_ME", 17, "17");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_BADGES = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_BADGES", 18, "18");
    public static final com.truecaller.surveys.helper.PassthroughKey PROFILE_PRIVATE_TC_ID = new com.truecaller.surveys.helper.PassthroughKey("PROFILE_PRIVATE_TC_ID", 19, "19");
    public static final com.truecaller.surveys.helper.PassthroughKey UNSUPPORTED = new com.truecaller.surveys.helper.PassthroughKey("UNSUPPORTED", 20, "999");

    private static final /* synthetic */ com.truecaller.surveys.helper.PassthroughKey[] $values() {
        return new com.truecaller.surveys.helper.PassthroughKey[]{UNDEFINED, SEARCH_CONTEXT_CALL_REASON, SEARCH_DISPLAYED_NAME, SEARCHED_PHONE, ELECTED_SOURCE, NAME_ELECTION_ALGO, EXTERNAL_SEARCH_PROVIDER, SEARCH_CONTEXT_RULE_ID, NAME_FEEDBACK_SOURCE, PROFILE_FULL_NAME, PROFILE_ALT_NAME, PROFILE_AVATAR_URL, PROFILE_TAG, PROFILE_ADDRESS, PROFILE_COMPANY, PROFILE_JOB_TITLE, PROFILE_URL, PROFILE_ABOUT_ME, PROFILE_BADGES, PROFILE_PRIVATE_TC_ID, UNSUPPORTED};
    }

    static {
        com.truecaller.surveys.helper.PassthroughKey[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PassthroughKey(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.surveys.helper.PassthroughKey valueOf(java.lang.String str) {
        return (com.truecaller.surveys.helper.PassthroughKey) java.lang.Enum.valueOf(com.truecaller.surveys.helper.PassthroughKey.class, str);
    }

    public static com.truecaller.surveys.helper.PassthroughKey[] values() {
        return (com.truecaller.surveys.helper.PassthroughKey[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
