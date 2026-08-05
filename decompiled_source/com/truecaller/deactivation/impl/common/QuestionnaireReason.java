package com.truecaller.deactivation.impl.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/deactivation/impl/common/QuestionnaireReason;", "", "<init>", "(Ljava/lang/String;I)V", "UNUSED_NUMBER", "INEFFECTIVE_TC", "HIDE_NAME", "UNUSED_APP", "STORAGE_SPACE", "SPAM_CALLS", "UNUSED_APP_OTHER", "OTHER", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QuestionnaireReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.deactivation.impl.common.QuestionnaireReason[] $VALUES;
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason UNUSED_NUMBER = new com.truecaller.deactivation.impl.common.QuestionnaireReason("UNUSED_NUMBER", 0);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason INEFFECTIVE_TC = new com.truecaller.deactivation.impl.common.QuestionnaireReason("INEFFECTIVE_TC", 1);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason HIDE_NAME = new com.truecaller.deactivation.impl.common.QuestionnaireReason("HIDE_NAME", 2);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason UNUSED_APP = new com.truecaller.deactivation.impl.common.QuestionnaireReason("UNUSED_APP", 3);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason STORAGE_SPACE = new com.truecaller.deactivation.impl.common.QuestionnaireReason("STORAGE_SPACE", 4);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason SPAM_CALLS = new com.truecaller.deactivation.impl.common.QuestionnaireReason("SPAM_CALLS", 5);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason UNUSED_APP_OTHER = new com.truecaller.deactivation.impl.common.QuestionnaireReason("UNUSED_APP_OTHER", 6);
    public static final com.truecaller.deactivation.impl.common.QuestionnaireReason OTHER = new com.truecaller.deactivation.impl.common.QuestionnaireReason("OTHER", 7);

    private static final /* synthetic */ com.truecaller.deactivation.impl.common.QuestionnaireReason[] $values() {
        return new com.truecaller.deactivation.impl.common.QuestionnaireReason[]{UNUSED_NUMBER, INEFFECTIVE_TC, HIDE_NAME, UNUSED_APP, STORAGE_SPACE, SPAM_CALLS, UNUSED_APP_OTHER, OTHER};
    }

    static {
        com.truecaller.deactivation.impl.common.QuestionnaireReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private QuestionnaireReason(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.deactivation.impl.common.QuestionnaireReason valueOf(java.lang.String str) {
        return (com.truecaller.deactivation.impl.common.QuestionnaireReason) java.lang.Enum.valueOf(com.truecaller.deactivation.impl.common.QuestionnaireReason.class, str);
    }

    public static com.truecaller.deactivation.impl.common.QuestionnaireReason[] values() {
        return (com.truecaller.deactivation.impl.common.QuestionnaireReason[]) $VALUES.clone();
    }
}
