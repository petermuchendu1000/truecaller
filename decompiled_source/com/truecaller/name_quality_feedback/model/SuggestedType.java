package com.truecaller.name_quality_feedback.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/name_quality_feedback/model/SuggestedType;", "", "<init>", "(Ljava/lang/String;I)V", "PRIVATE", "BUSINESS", "name-quality-feedback_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SuggestedType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.name_quality_feedback.model.SuggestedType[] $VALUES;
    public static final com.truecaller.name_quality_feedback.model.SuggestedType PRIVATE = new com.truecaller.name_quality_feedback.model.SuggestedType("PRIVATE", 0);
    public static final com.truecaller.name_quality_feedback.model.SuggestedType BUSINESS = new com.truecaller.name_quality_feedback.model.SuggestedType("BUSINESS", 1);

    private static final /* synthetic */ com.truecaller.name_quality_feedback.model.SuggestedType[] $values() {
        return new com.truecaller.name_quality_feedback.model.SuggestedType[]{PRIVATE, BUSINESS};
    }

    static {
        com.truecaller.name_quality_feedback.model.SuggestedType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SuggestedType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.name_quality_feedback.model.SuggestedType valueOf(java.lang.String str) {
        return (com.truecaller.name_quality_feedback.model.SuggestedType) java.lang.Enum.valueOf(com.truecaller.name_quality_feedback.model.SuggestedType.class, str);
    }

    public static com.truecaller.name_quality_feedback.model.SuggestedType[] values() {
        return (com.truecaller.name_quality_feedback.model.SuggestedType[]) $VALUES.clone();
    }
}
