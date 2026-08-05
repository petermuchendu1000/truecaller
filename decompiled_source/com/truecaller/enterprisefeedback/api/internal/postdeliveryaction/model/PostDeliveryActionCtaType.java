package com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/enterprisefeedback/api/internal/postdeliveryaction/model/PostDeliveryActionCtaType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CALL_IN_15_MINS", "RESCHEDULE", "SHARE_LOCATION", "CANCEL_DELIVERY", "LEAVE_AT_DOOR", "TRACK_ORDER", "UNKNOWN", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class PostDeliveryActionCtaType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType CALL_IN_15_MINS = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("CALL_IN_15_MINS", 0, "CALL_IN_15_MINS");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType RESCHEDULE = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("RESCHEDULE", 1, "RESCHEDULE");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType SHARE_LOCATION = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("SHARE_LOCATION", 2, "SHARE_LOCATION");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType CANCEL_DELIVERY = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("CANCEL_DELIVERY", 3, "CANCEL_DELIVERY");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType LEAVE_AT_DOOR = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("LEAVE_AT_DOOR", 4, "LEAVE_AT_DOOR");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType TRACK_ORDER = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("TRACK_ORDER", 5, "TRACK_ORDER");
    public static final com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType UNKNOWN = new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType("UNKNOWN", 6, "Unknown");

    private static final /* synthetic */ com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[] $values() {
        return new com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[]{CALL_IN_15_MINS, RESCHEDULE, SHARE_LOCATION, CANCEL_DELIVERY, LEAVE_AT_DOOR, TRACK_ORDER, UNKNOWN};
    }

    static {
        com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PostDeliveryActionCtaType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType valueOf(java.lang.String str) {
        return (com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType) java.lang.Enum.valueOf(com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType.class, str);
    }

    public static com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[] values() {
        return (com.truecaller.enterprisefeedback.api.internal.postdeliveryaction.model.PostDeliveryActionCtaType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
