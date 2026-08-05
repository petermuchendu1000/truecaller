package com.truecaller.insights.messageprocessedmeta;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/insights/messageprocessedmeta/ProcessingPhase;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "NEW_MESSAGE", "HISTORIC_MESSAGE", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ProcessingPhase {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.messageprocessedmeta.ProcessingPhase[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.messageprocessedmeta.ProcessingPhase NEW_MESSAGE = new com.truecaller.insights.messageprocessedmeta.ProcessingPhase("NEW_MESSAGE", 0, "new_message");
    public static final com.truecaller.insights.messageprocessedmeta.ProcessingPhase HISTORIC_MESSAGE = new com.truecaller.insights.messageprocessedmeta.ProcessingPhase("HISTORIC_MESSAGE", 1, "historic_message");

    private static final /* synthetic */ com.truecaller.insights.messageprocessedmeta.ProcessingPhase[] $values() {
        return new com.truecaller.insights.messageprocessedmeta.ProcessingPhase[]{NEW_MESSAGE, HISTORIC_MESSAGE};
    }

    static {
        com.truecaller.insights.messageprocessedmeta.ProcessingPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ProcessingPhase(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.messageprocessedmeta.ProcessingPhase valueOf(java.lang.String str) {
        return (com.truecaller.insights.messageprocessedmeta.ProcessingPhase) java.lang.Enum.valueOf(com.truecaller.insights.messageprocessedmeta.ProcessingPhase.class, str);
    }

    public static com.truecaller.insights.messageprocessedmeta.ProcessingPhase[] values() {
        return (com.truecaller.insights.messageprocessedmeta.ProcessingPhase[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
