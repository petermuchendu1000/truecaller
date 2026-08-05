package com.truecaller.deactivation.impl.ui.questionnaire.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/questionnaire/models/QuestionType;", "", "<init>", "(Ljava/lang/String;I)V", "UNUSED_NUMBER", "UNUSED_APP", "INEFFECTIVE_TC", "STORAGE_SPACE", "SPAM_CALLS", "HIDE_NAME", "OTHER", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class QuestionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[] $VALUES;
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType UNUSED_NUMBER = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("UNUSED_NUMBER", 0);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType UNUSED_APP = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("UNUSED_APP", 1);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType INEFFECTIVE_TC = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("INEFFECTIVE_TC", 2);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType STORAGE_SPACE = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("STORAGE_SPACE", 3);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType SPAM_CALLS = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("SPAM_CALLS", 4);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType HIDE_NAME = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("HIDE_NAME", 5);
    public static final com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType OTHER = new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType("OTHER", 6);

    private static final /* synthetic */ com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[] $values() {
        return new com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[]{UNUSED_NUMBER, UNUSED_APP, INEFFECTIVE_TC, STORAGE_SPACE, SPAM_CALLS, HIDE_NAME, OTHER};
    }

    static {
        com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private QuestionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType valueOf(java.lang.String str) {
        return (com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType) java.lang.Enum.valueOf(com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType.class, str);
    }

    public static com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[] values() {
        return (com.truecaller.deactivation.impl.ui.questionnaire.models.QuestionType[]) $VALUES.clone();
    }
}
