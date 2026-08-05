package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$OrderSubStatus", "", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$OrderSubStatus;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ft1/qux", "ArrivalOnTime", "ArrivingToday", "ArrivingTomorrow", "ArrivingEarly", "ArrivingDelay", "FailedDelivery", "SelfPickup", "Exchange", "Pickup", "PickedUp", "RescheduleReturn", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeliveryDomainConstants$OrderSubStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ft1.qux Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus ArrivalOnTime = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("ArrivalOnTime", 0, "arrvontm");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus ArrivingToday = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("ArrivingToday", 1, "arrvtdy");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus ArrivingTomorrow = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("ArrivingTomorrow", 2, "arrvtom");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus ArrivingEarly = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("ArrivingEarly", 3, "arrvearly");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus ArrivingDelay = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("ArrivingDelay", 4, "arrvdelay");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus FailedDelivery = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("FailedDelivery", 5, "faileddlvry");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus SelfPickup = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("SelfPickup", 6, "selfpickup");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus Exchange = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("Exchange", 7, "exchange");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus Pickup = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("Pickup", 8, "pickup");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus PickedUp = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("PickedUp", 9, "pickedup");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus RescheduleReturn = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus("RescheduleReturn", 10, "reschreturn");

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[] $values() {
        return new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[]{ArrivalOnTime, ArrivingToday, ArrivingTomorrow, ArrivingEarly, ArrivingDelay, FailedDelivery, SelfPickup, Exchange, Pickup, PickedUp, RescheduleReturn};
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, ft1.qux] */
    static {
        com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus deliveryDomainConstants$OrderSubStatus : values) {
            linkedHashMap.put(deliveryDomainConstants$OrderSubStatus.value, deliveryDomainConstants$OrderSubStatus);
        }
        map = linkedHashMap;
    }

    private DeliveryDomainConstants$OrderSubStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[] values() {
        return (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$OrderSubStatus[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
