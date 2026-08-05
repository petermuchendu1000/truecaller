package com.truecaller.premium.ui.dialogs.assistant.carrier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/premium/ui/dialogs/assistant/carrier/CarrierDialogMvp$ScreenType", "", "Lcom/truecaller/premium/ui/dialogs/assistant/carrier/CarrierDialogMvp$ScreenType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ne2/a", "CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS", "CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CarrierDialogMvp$ScreenType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final ne2.a Companion;
    public static final com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS = new com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType("CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS", 0);
    public static final com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL = new com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType("CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL", 1);
    public static final com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType UNKNOWN = new com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType("UNKNOWN", 2);

    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[] $values() {
        return new com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[]{CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS, CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [ne2.a, java.lang.Object] */
    static {
        com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CarrierDialogMvp$ScreenType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return ne2.a.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType) java.lang.Enum.valueOf(com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType.class, str);
    }

    public static com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[] values() {
        return (com.truecaller.premium.ui.dialogs.assistant.carrier.CarrierDialogMvp$ScreenType[]) $VALUES.clone();
    }
}
