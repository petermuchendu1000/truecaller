package com.truecaller.ads.api.internal.logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/internal/logger/AdLogAction;", "", "<init>", "(Ljava/lang/String;I)V", "IGNORE", "LOG_FILE", "REPORT", "CRASH", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdLogAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.internal.logger.AdLogAction[] $VALUES;
    public static final com.truecaller.ads.api.internal.logger.AdLogAction IGNORE = new com.truecaller.ads.api.internal.logger.AdLogAction("IGNORE", 0);
    public static final com.truecaller.ads.api.internal.logger.AdLogAction LOG_FILE = new com.truecaller.ads.api.internal.logger.AdLogAction("LOG_FILE", 1);
    public static final com.truecaller.ads.api.internal.logger.AdLogAction REPORT = new com.truecaller.ads.api.internal.logger.AdLogAction("REPORT", 2);
    public static final com.truecaller.ads.api.internal.logger.AdLogAction CRASH = new com.truecaller.ads.api.internal.logger.AdLogAction("CRASH", 3);

    private static final /* synthetic */ com.truecaller.ads.api.internal.logger.AdLogAction[] $values() {
        return new com.truecaller.ads.api.internal.logger.AdLogAction[]{IGNORE, LOG_FILE, REPORT, CRASH};
    }

    static {
        com.truecaller.ads.api.internal.logger.AdLogAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdLogAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.internal.logger.AdLogAction valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.internal.logger.AdLogAction) java.lang.Enum.valueOf(com.truecaller.ads.api.internal.logger.AdLogAction.class, str);
    }

    public static com.truecaller.ads.api.internal.logger.AdLogAction[] values() {
        return (com.truecaller.ads.api.internal.logger.AdLogAction[]) $VALUES.clone();
    }
}
