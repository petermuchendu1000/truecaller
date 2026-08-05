package com.truecaller.call_assistant.core.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/call_assistant/core/data/RecordingFetchFailureReason;", "", "analyticsSuffix", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsSuffix", "()Ljava/lang/String;", "NETWORK_DNS", "CANCELED", "NETWORK_TIMEOUT", "NETWORK_IO", "EMPTY_URL", "HTTP_NOT_FOUND", "HTTP_OTHER", "RETRY_EXHAUSTED", "UNKNOWN", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RecordingFetchFailureReason {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String analyticsSuffix;
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason NETWORK_DNS = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("NETWORK_DNS", 0, "net_dns");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason CANCELED = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("CANCELED", 1, "canceled");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason NETWORK_TIMEOUT = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("NETWORK_TIMEOUT", 2, "net_timeout");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason NETWORK_IO = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("NETWORK_IO", 3, "net_io");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason EMPTY_URL = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("EMPTY_URL", 4, "empty_url");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason HTTP_NOT_FOUND = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("HTTP_NOT_FOUND", 5, "http_404");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason HTTP_OTHER = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("HTTP_OTHER", 6, "http_other");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason RETRY_EXHAUSTED = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("RETRY_EXHAUSTED", 7, "retry_exhausted");
    public static final com.truecaller.call_assistant.core.data.RecordingFetchFailureReason UNKNOWN = new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason("UNKNOWN", 8, "unknown");

    private static final /* synthetic */ com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[] $values() {
        return new com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[]{NETWORK_DNS, CANCELED, NETWORK_TIMEOUT, NETWORK_IO, EMPTY_URL, HTTP_NOT_FOUND, HTTP_OTHER, RETRY_EXHAUSTED, UNKNOWN};
    }

    static {
        com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RecordingFetchFailureReason(java.lang.String str, int i, java.lang.String str2) {
        this.analyticsSuffix = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.data.RecordingFetchFailureReason valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.data.RecordingFetchFailureReason) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.data.RecordingFetchFailureReason.class, str);
    }

    public static com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[] values() {
        return (com.truecaller.call_assistant.core.data.RecordingFetchFailureReason[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAnalyticsSuffix() {
        return this.analyticsSuffix;
    }
}
