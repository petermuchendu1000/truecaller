package com.truecaller.insights.fraud.content.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/insights/fraud/content/api/ResultDelivery;", "", "<init>", "(Ljava/lang/String;I)V", "DELIVERED", "TIMED_OUT", "CANCELLED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ResultDelivery {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.fraud.content.api.ResultDelivery[] $VALUES;
    public static final com.truecaller.insights.fraud.content.api.ResultDelivery DELIVERED = new com.truecaller.insights.fraud.content.api.ResultDelivery("DELIVERED", 0);
    public static final com.truecaller.insights.fraud.content.api.ResultDelivery TIMED_OUT = new com.truecaller.insights.fraud.content.api.ResultDelivery("TIMED_OUT", 1);
    public static final com.truecaller.insights.fraud.content.api.ResultDelivery CANCELLED = new com.truecaller.insights.fraud.content.api.ResultDelivery("CANCELLED", 2);

    private static final /* synthetic */ com.truecaller.insights.fraud.content.api.ResultDelivery[] $values() {
        return new com.truecaller.insights.fraud.content.api.ResultDelivery[]{DELIVERED, TIMED_OUT, CANCELLED};
    }

    static {
        com.truecaller.insights.fraud.content.api.ResultDelivery[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ResultDelivery(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.fraud.content.api.ResultDelivery valueOf(java.lang.String str) {
        return (com.truecaller.insights.fraud.content.api.ResultDelivery) java.lang.Enum.valueOf(com.truecaller.insights.fraud.content.api.ResultDelivery.class, str);
    }

    public static com.truecaller.insights.fraud.content.api.ResultDelivery[] values() {
        return (com.truecaller.insights.fraud.content.api.ResultDelivery[]) $VALUES.clone();
    }
}
