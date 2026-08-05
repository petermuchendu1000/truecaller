package com.truecaller.insights.core.llm.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/insights/core/llm/model/LlmActionType;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Companion", "tt1/k", "ACTION", "URI", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LlmActionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.llm.model.LlmActionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final tt1.k Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.core.llm.model.LlmActionType> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.core.llm.model.LlmActionType ACTION = new com.truecaller.insights.core.llm.model.LlmActionType("ACTION", 0, "ACTION");
    public static final com.truecaller.insights.core.llm.model.LlmActionType URI = new com.truecaller.insights.core.llm.model.LlmActionType("URI", 1, "URI");

    private static final /* synthetic */ com.truecaller.insights.core.llm.model.LlmActionType[] $values() {
        return new com.truecaller.insights.core.llm.model.LlmActionType[]{ACTION, URI};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [tt1.k, java.lang.Object] */
    static {
        com.truecaller.insights.core.llm.model.LlmActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        gf3.bar entries = getEntries();
        int b = kotlin.collections.q0.b(kotlin.collections.z.q(entries, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (java.lang.Object obj : entries) {
            linkedHashMap.put(((com.truecaller.insights.core.llm.model.LlmActionType) obj).key, obj);
        }
        map = linkedHashMap;
    }

    private LlmActionType(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.llm.model.LlmActionType valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.llm.model.LlmActionType) java.lang.Enum.valueOf(com.truecaller.insights.core.llm.model.LlmActionType.class, str);
    }

    public static com.truecaller.insights.core.llm.model.LlmActionType[] values() {
        return (com.truecaller.insights.core.llm.model.LlmActionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
