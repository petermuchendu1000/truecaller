package com.truecaller.insights.core.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/insights/core/notification/MaliciousSignal;", "", "<init>", "(Ljava/lang/String;I)V", "NON_MALICIOUS", "SPAM", "FRAUD", "SUPPRESS_MALICIOUS", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class MaliciousSignal {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.core.notification.MaliciousSignal[] $VALUES;
    public static final com.truecaller.insights.core.notification.MaliciousSignal NON_MALICIOUS = new com.truecaller.insights.core.notification.MaliciousSignal("NON_MALICIOUS", 0);
    public static final com.truecaller.insights.core.notification.MaliciousSignal SPAM = new com.truecaller.insights.core.notification.MaliciousSignal("SPAM", 1);
    public static final com.truecaller.insights.core.notification.MaliciousSignal FRAUD = new com.truecaller.insights.core.notification.MaliciousSignal("FRAUD", 2);
    public static final com.truecaller.insights.core.notification.MaliciousSignal SUPPRESS_MALICIOUS = new com.truecaller.insights.core.notification.MaliciousSignal("SUPPRESS_MALICIOUS", 3);

    private static final /* synthetic */ com.truecaller.insights.core.notification.MaliciousSignal[] $values() {
        return new com.truecaller.insights.core.notification.MaliciousSignal[]{NON_MALICIOUS, SPAM, FRAUD, SUPPRESS_MALICIOUS};
    }

    static {
        com.truecaller.insights.core.notification.MaliciousSignal[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MaliciousSignal(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.core.notification.MaliciousSignal valueOf(java.lang.String str) {
        return (com.truecaller.insights.core.notification.MaliciousSignal) java.lang.Enum.valueOf(com.truecaller.insights.core.notification.MaliciousSignal.class, str);
    }

    public static com.truecaller.insights.core.notification.MaliciousSignal[] values() {
        return (com.truecaller.insights.core.notification.MaliciousSignal[]) $VALUES.clone();
    }
}
