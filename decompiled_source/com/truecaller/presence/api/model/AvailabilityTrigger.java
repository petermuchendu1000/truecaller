package com.truecaller.presence.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/presence/api/model/AvailabilityTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "RECURRING_TASK", "USER_ACTION", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes.dex */
public final class AvailabilityTrigger {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.presence.api.model.AvailabilityTrigger[] $VALUES;
    public static final com.truecaller.presence.api.model.AvailabilityTrigger RECURRING_TASK = new com.truecaller.presence.api.model.AvailabilityTrigger("RECURRING_TASK", 0);
    public static final com.truecaller.presence.api.model.AvailabilityTrigger USER_ACTION = new com.truecaller.presence.api.model.AvailabilityTrigger("USER_ACTION", 1);

    private static final /* synthetic */ com.truecaller.presence.api.model.AvailabilityTrigger[] $values() {
        return new com.truecaller.presence.api.model.AvailabilityTrigger[]{RECURRING_TASK, USER_ACTION};
    }

    static {
        com.truecaller.presence.api.model.AvailabilityTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AvailabilityTrigger(java.lang.String str, int i10) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.presence.api.model.AvailabilityTrigger valueOf(java.lang.String str) {
        return (com.truecaller.presence.api.model.AvailabilityTrigger) java.lang.Enum.valueOf(com.truecaller.presence.api.model.AvailabilityTrigger.class, str);
    }

    public static com.truecaller.presence.api.model.AvailabilityTrigger[] values() {
        return (com.truecaller.presence.api.model.AvailabilityTrigger[]) $VALUES.clone();
    }
}
