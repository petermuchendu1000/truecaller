package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/insights/commons/utils/domain/OrderStatus;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ft1/b", "OrderConfirmed", "OrderPacked", "OrderShipped", "OrderCancelled", "Returned", "Transit", "ActionRequired", "Undelivered", "Delivered", "Return", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OrderStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.OrderStatus[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ft1.b Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.commons.utils.domain.OrderStatus> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus OrderConfirmed = new com.truecaller.insights.commons.utils.domain.OrderStatus("OrderConfirmed", 0, "ordrcv");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus OrderPacked = new com.truecaller.insights.commons.utils.domain.OrderStatus("OrderPacked", 1, "ordpck");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus OrderShipped = new com.truecaller.insights.commons.utils.domain.OrderStatus("OrderShipped", 2, "ordshp");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus OrderCancelled = new com.truecaller.insights.commons.utils.domain.OrderStatus("OrderCancelled", 3, "ordcancl");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus Returned = new com.truecaller.insights.commons.utils.domain.OrderStatus("Returned", 4, "returned");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus Transit = new com.truecaller.insights.commons.utils.domain.OrderStatus("Transit", 5, "transit");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus ActionRequired = new com.truecaller.insights.commons.utils.domain.OrderStatus("ActionRequired", 6, "actionrqd");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus Undelivered = new com.truecaller.insights.commons.utils.domain.OrderStatus("Undelivered", 7, "undelivered");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus Delivered = new com.truecaller.insights.commons.utils.domain.OrderStatus("Delivered", 8, "delvrd");
    public static final com.truecaller.insights.commons.utils.domain.OrderStatus Return = new com.truecaller.insights.commons.utils.domain.OrderStatus("Return", 9, "return");

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.OrderStatus[] $values() {
        return new com.truecaller.insights.commons.utils.domain.OrderStatus[]{OrderConfirmed, OrderPacked, OrderShipped, OrderCancelled, Returned, Transit, ActionRequired, Undelivered, Delivered, Return};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ft1.b, java.lang.Object] */
    static {
        com.truecaller.insights.commons.utils.domain.OrderStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.commons.utils.domain.OrderStatus[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (com.truecaller.insights.commons.utils.domain.OrderStatus orderStatus : values) {
            linkedHashMap.put(orderStatus.value, orderStatus);
        }
        map = linkedHashMap;
    }

    private OrderStatus(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.OrderStatus valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.OrderStatus) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.OrderStatus.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.OrderStatus[] values() {
        return (com.truecaller.insights.commons.utils.domain.OrderStatus[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
