package com.truecaller.insights.core.llm.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/truecaller/insights/core/llm/model/LlmUseCaseTokenMappingFailure;", "", "errorCode", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getErrorCode", "()Ljava/lang/String;", "TITLE_MAPPING_FAILED", "SUBTITLE_MAPPING_FAILED", "STATUS_MAPPING_FAILED", "ACTION_MAPPING_FAILED", "TITLE_AND_SUBTITLE_FAILED", "TITLE_AND_STATUS_FAILED", "TITLE_AND_ACTION_FAILED", "SUBTITLE_AND_STATUS_FAILED", "SUBTITLE_AND_ACTION_FAILED", "STATUS_AND_ACTION_FAILED", "TITLE_SUBTITLE_AND_STATUS_FAILED", "TITLE_SUBTITLE_AND_ACTION_FAILED", "TITLE_STATUS_AND_ACTION_FAILED", "SUBTITLE_STATUS_AND_ACTION_FAILED", "ALL_MAPPING_FAILED", "NO_FAILURE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LlmUseCaseTokenMappingFailure {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String errorCode;
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_MAPPING_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_MAPPING_FAILED", 0, "1000");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure SUBTITLE_MAPPING_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("SUBTITLE_MAPPING_FAILED", 1, "1001");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure STATUS_MAPPING_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("STATUS_MAPPING_FAILED", 2, "1002");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure ACTION_MAPPING_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("ACTION_MAPPING_FAILED", 3, "1003");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_AND_SUBTITLE_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_AND_SUBTITLE_FAILED", 4, "2001");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_AND_STATUS_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_AND_STATUS_FAILED", 5, "2002");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_AND_ACTION_FAILED", 6, "2003");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure SUBTITLE_AND_STATUS_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("SUBTITLE_AND_STATUS_FAILED", 7, "2004");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure SUBTITLE_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("SUBTITLE_AND_ACTION_FAILED", 8, "2005");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure STATUS_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("STATUS_AND_ACTION_FAILED", 9, "2006");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_SUBTITLE_AND_STATUS_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_SUBTITLE_AND_STATUS_FAILED", 10, "3001");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_SUBTITLE_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_SUBTITLE_AND_ACTION_FAILED", 11, "3002");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure TITLE_STATUS_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("TITLE_STATUS_AND_ACTION_FAILED", 12, "3003");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure SUBTITLE_STATUS_AND_ACTION_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("SUBTITLE_STATUS_AND_ACTION_FAILED", 13, "3004");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure ALL_MAPPING_FAILED = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("ALL_MAPPING_FAILED", 14, "4000");
    public static final com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure NO_FAILURE = new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure("NO_FAILURE", 15, "5000");

    private static final /* synthetic */ com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[] $values() {
        return new com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[]{TITLE_MAPPING_FAILED, SUBTITLE_MAPPING_FAILED, STATUS_MAPPING_FAILED, ACTION_MAPPING_FAILED, TITLE_AND_SUBTITLE_FAILED, TITLE_AND_STATUS_FAILED, TITLE_AND_ACTION_FAILED, SUBTITLE_AND_STATUS_FAILED, SUBTITLE_AND_ACTION_FAILED, STATUS_AND_ACTION_FAILED, TITLE_SUBTITLE_AND_STATUS_FAILED, TITLE_SUBTITLE_AND_ACTION_FAILED, TITLE_STATUS_AND_ACTION_FAILED, SUBTITLE_STATUS_AND_ACTION_FAILED, ALL_MAPPING_FAILED, NO_FAILURE};
    }

    static {
        com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private LlmUseCaseTokenMappingFailure(java.lang.String str, int i, java.lang.String str2) {
        this.errorCode = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure) java.lang.Enum.valueOf(com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure.class, str);
    }

    public static com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[] values() {
        return (com.truecaller.insights.core.llm.model.LlmUseCaseTokenMappingFailure[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorCode() {
        return this.errorCode;
    }
}
