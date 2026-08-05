package com.truecaller.insights.tracking.utils.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/insights/tracking/utils/api/model/ExecutionActionType;", "", "", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "Companion", "nx1/bar", "SEND", "RECEIVE", "CREATE", "DELETE", "UPDATE", "IMPRESSION", "DISMISS", "REGEX_COMPILATION", "tracking-utils_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ExecutionActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final nx1.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String action;
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType SEND = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("SEND", 0, "send");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType RECEIVE = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("RECEIVE", 1, "receive");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType CREATE = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("CREATE", 2, "create");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType DELETE = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("DELETE", 3, "delete");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType UPDATE = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("UPDATE", 4, "update");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType IMPRESSION = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("IMPRESSION", 5, "impression");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType DISMISS = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("DISMISS", 6, "dismiss");
    public static final com.truecaller.insights.tracking.utils.api.model.ExecutionActionType REGEX_COMPILATION = new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType("REGEX_COMPILATION", 7, "regex_compilation");

    private static final /* synthetic */ com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[] $values() {
        return new com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[]{SEND, RECEIVE, CREATE, DELETE, UPDATE, IMPRESSION, DISMISS, REGEX_COMPILATION};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [nx1.bar, java.lang.Object] */
    static {
        com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ExecutionActionType(java.lang.String str, int i, java.lang.String str2) {
        this.action = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.tracking.utils.api.model.ExecutionActionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.tracking.utils.api.model.ExecutionActionType) java.lang.Enum.valueOf(com.truecaller.insights.tracking.utils.api.model.ExecutionActionType.class, str);
    }

    public static com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[] values() {
        return (com.truecaller.insights.tracking.utils.api.model.ExecutionActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAction() {
        return this.action;
    }
}
