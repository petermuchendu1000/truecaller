package com.truecaller.whatsapp_caller_id.external.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/whatsapp_caller_id/external/model/ActiveWhatsAppCall$State", "", "Lcom/truecaller/whatsapp_caller_id/external/model/ActiveWhatsAppCall$State;", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "ENDED", "whatsapp-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ActiveWhatsAppCall$State {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[] $VALUES;
    public static final com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State IN_PROGRESS = new com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State("IN_PROGRESS", 0);
    public static final com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State ENDED = new com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State("ENDED", 1);

    private static final /* synthetic */ com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[] $values() {
        return new com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[]{IN_PROGRESS, ENDED};
    }

    static {
        com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActiveWhatsAppCall$State(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State valueOf(java.lang.String str) {
        return (com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State) java.lang.Enum.valueOf(com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State.class, str);
    }

    public static com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[] values() {
        return (com.truecaller.whatsapp_caller_id.external.model.ActiveWhatsAppCall$State[]) $VALUES.clone();
    }
}
