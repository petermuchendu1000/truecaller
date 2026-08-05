package com.truecaller.insights.commons.utils.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"com/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$UrlTypes", "", "Lcom/truecaller/insights/commons/utils/domain/DeliveryDomainConstants$UrlTypes;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "ft1/a", "ManageDelivery", "TrackDelivery", "BookDelivery", "PickDelivery", "Acknowledge", "Feedback", "commons_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeliveryDomainConstants$UrlTypes {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ft1.a Companion;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes> map;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes ManageDelivery = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("ManageDelivery", 0, "managedlvry");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes TrackDelivery = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("TrackDelivery", 1, "trackdlvry");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes BookDelivery = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("BookDelivery", 2, "bookdlvry");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes PickDelivery = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("PickDelivery", 3, "pickdlvry");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes Acknowledge = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("Acknowledge", 4, "acknwlg");
    public static final com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes Feedback = new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes("Feedback", 5, "feedback");

    private static final /* synthetic */ com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[] $values() {
        return new com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[]{ManageDelivery, TrackDelivery, BookDelivery, PickDelivery, Acknowledge, Feedback};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [ft1.a, java.lang.Object] */
    static {
        com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[] values = values();
        int b = kotlin.collections.q0.b(values.length);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(b < 16 ? 16 : b);
        for (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes deliveryDomainConstants$UrlTypes : values) {
            linkedHashMap.put(deliveryDomainConstants$UrlTypes.value, deliveryDomainConstants$UrlTypes);
        }
        map = linkedHashMap;
    }

    private DeliveryDomainConstants$UrlTypes(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes valueOf(java.lang.String str) {
        return (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes) java.lang.Enum.valueOf(com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes.class, str);
    }

    public static com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[] values() {
        return (com.truecaller.insights.commons.utils.domain.DeliveryDomainConstants$UrlTypes[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
