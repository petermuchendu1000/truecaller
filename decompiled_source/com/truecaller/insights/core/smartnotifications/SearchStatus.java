package com.truecaller.insights.core.smartnotifications;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/insights/core/smartnotifications/SearchStatus;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "EMPTY", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SearchStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.smartnotifications.SearchStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String key;
    public static final com.truecaller.insights.core.smartnotifications.SearchStatus SUCCESS = new com.truecaller.insights.core.smartnotifications.SearchStatus("SUCCESS", 0, "success");
    public static final com.truecaller.insights.core.smartnotifications.SearchStatus FAILURE = new com.truecaller.insights.core.smartnotifications.SearchStatus("FAILURE", 1, "failure");
    public static final com.truecaller.insights.core.smartnotifications.SearchStatus EMPTY = new com.truecaller.insights.core.smartnotifications.SearchStatus("EMPTY", 2, "empty");

    private static final /* synthetic */ com.truecaller.insights.core.smartnotifications.SearchStatus[] $values() {
        return new com.truecaller.insights.core.smartnotifications.SearchStatus[]{SUCCESS, FAILURE, EMPTY};
    }

    static {
        com.truecaller.insights.core.smartnotifications.SearchStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SearchStatus(java.lang.String str, int i, java.lang.String str2) {
        this.key = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.smartnotifications.SearchStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.smartnotifications.SearchStatus) java.lang.Enum.valueOf(com.truecaller.insights.core.smartnotifications.SearchStatus.class, str);
    }

    public static com.truecaller.insights.core.smartnotifications.SearchStatus[] values() {
        return (com.truecaller.insights.core.smartnotifications.SearchStatus[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getKey() {
        return this.key;
    }
}
