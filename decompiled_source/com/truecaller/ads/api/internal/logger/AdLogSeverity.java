package com.truecaller.ads.api.internal.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/ads/api/internal/logger/AdLogSeverity;", "", "<init>", "(Ljava/lang/String;I)V", "DEBUG", "INFO", "WARNING", "ERROR", "CRITICAL", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdLogSeverity {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.logger.AdLogSeverity[] $VALUES;
    public static final com.truecaller.ads.api.internal.logger.AdLogSeverity DEBUG = new com.truecaller.ads.api.internal.logger.AdLogSeverity("DEBUG", 0);
    public static final com.truecaller.ads.api.internal.logger.AdLogSeverity INFO = new com.truecaller.ads.api.internal.logger.AdLogSeverity("INFO", 1);
    public static final com.truecaller.ads.api.internal.logger.AdLogSeverity WARNING = new com.truecaller.ads.api.internal.logger.AdLogSeverity("WARNING", 2);
    public static final com.truecaller.ads.api.internal.logger.AdLogSeverity ERROR = new com.truecaller.ads.api.internal.logger.AdLogSeverity("ERROR", 3);
    public static final com.truecaller.ads.api.internal.logger.AdLogSeverity CRITICAL = new com.truecaller.ads.api.internal.logger.AdLogSeverity("CRITICAL", 4);

    private static final /* synthetic */ com.truecaller.ads.api.internal.logger.AdLogSeverity[] $values() {
        return new com.truecaller.ads.api.internal.logger.AdLogSeverity[]{DEBUG, INFO, WARNING, ERROR, CRITICAL};
    }

    static {
        com.truecaller.ads.api.internal.logger.AdLogSeverity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdLogSeverity(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.logger.AdLogSeverity valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.logger.AdLogSeverity) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.logger.AdLogSeverity.class, str);
    }

    public static com.truecaller.ads.api.internal.logger.AdLogSeverity[] values() {
        return (com.truecaller.ads.api.internal.logger.AdLogSeverity[]) $VALUES.clone();
    }
}
