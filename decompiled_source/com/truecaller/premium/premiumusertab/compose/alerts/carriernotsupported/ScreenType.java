package com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/premium/premiumusertab/compose/alerts/carriernotsupported/ScreenType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "yb2/f", "CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS", "CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL", "UNKNOWN", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ScreenType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final yb2.f Companion;
    public static final com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS = new com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType("CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS", 0);
    public static final com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL = new com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType("CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL", 1);
    public static final com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType UNKNOWN = new com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType("UNKNOWN", 2);

    private static final /* synthetic */ com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[] $values() {
        return new com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[]{CARRIER_NON_SUPPORT_BUT_OTHER_OPTIONS, CARRIER_NON_SUPPORT_FOR_HARD_PAYWALL, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [yb2.f, java.lang.Object] */
    static {
        com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ScreenType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType screenType;
        Companion.getClass();
        com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                screenType = values[i];
                if (kotlin.jvm.internal.Intrinsics.b(screenType.name(), str)) {
                    break;
                }
                i++;
            } else {
                screenType = null;
                break;
            }
        }
        if (screenType == null) {
            return UNKNOWN;
        }
        return screenType;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType valueOf(java.lang.String str) {
        return (com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType) java.lang.Enum.valueOf(com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType.class, str);
    }

    public static com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[] values() {
        return (com.truecaller.premium.premiumusertab.compose.alerts.carriernotsupported.ScreenType[]) $VALUES.clone();
    }
}
