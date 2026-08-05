package com.truecaller.data.entity.assistant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/data/entity/assistant/CallClassificationType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "r81/bar", "Fraud", "Promotional", "Spam", "ServiceSupport", "Transactional", "SurveyFeedback", "Personal", "AppointmentReminders", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CallClassificationType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.data.entity.assistant.CallClassificationType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final r81.bar Companion;
    private final int value;
    public static final com.truecaller.data.entity.assistant.CallClassificationType Fraud = new com.truecaller.data.entity.assistant.CallClassificationType("Fraud", 0, 0);
    public static final com.truecaller.data.entity.assistant.CallClassificationType Promotional = new com.truecaller.data.entity.assistant.CallClassificationType("Promotional", 1, 1);
    public static final com.truecaller.data.entity.assistant.CallClassificationType Spam = new com.truecaller.data.entity.assistant.CallClassificationType("Spam", 2, 2);
    public static final com.truecaller.data.entity.assistant.CallClassificationType ServiceSupport = new com.truecaller.data.entity.assistant.CallClassificationType("ServiceSupport", 3, 3);
    public static final com.truecaller.data.entity.assistant.CallClassificationType Transactional = new com.truecaller.data.entity.assistant.CallClassificationType("Transactional", 4, 4);
    public static final com.truecaller.data.entity.assistant.CallClassificationType SurveyFeedback = new com.truecaller.data.entity.assistant.CallClassificationType("SurveyFeedback", 5, 5);
    public static final com.truecaller.data.entity.assistant.CallClassificationType Personal = new com.truecaller.data.entity.assistant.CallClassificationType("Personal", 6, 6);
    public static final com.truecaller.data.entity.assistant.CallClassificationType AppointmentReminders = new com.truecaller.data.entity.assistant.CallClassificationType("AppointmentReminders", 7, 7);

    private static final /* synthetic */ com.truecaller.data.entity.assistant.CallClassificationType[] $values() {
        return new com.truecaller.data.entity.assistant.CallClassificationType[]{Fraud, Promotional, Spam, ServiceSupport, Transactional, SurveyFeedback, Personal, AppointmentReminders};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, r81.bar] */
    static {
        com.truecaller.data.entity.assistant.CallClassificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CallClassificationType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.data.entity.assistant.CallClassificationType valueOf(java.lang.String str) {
        return (com.truecaller.data.entity.assistant.CallClassificationType) java.lang.Enum.valueOf(com.truecaller.data.entity.assistant.CallClassificationType.class, str);
    }

    public static com.truecaller.data.entity.assistant.CallClassificationType[] values() {
        return (com.truecaller.data.entity.assistant.CallClassificationType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
