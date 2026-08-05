package com.truecaller.compose.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/compose/ui/components/TrueButton$ButtonStyleSecondary", "", "Lcom/truecaller/compose/ui/components/TrueButton$ButtonStyleSecondary;", "<init>", "(Ljava/lang/String;I)V", "SECONDARY", "SECONDARY_FILLED", "DEACTIVATED", "DESTRUCTIVE", "ACTION", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TrueButton$ButtonStyleSecondary {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[] $VALUES;
    public static final com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary SECONDARY = new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary("SECONDARY", 0);
    public static final com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary SECONDARY_FILLED = new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary("SECONDARY_FILLED", 1);
    public static final com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary DEACTIVATED = new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary("DEACTIVATED", 2);
    public static final com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary DESTRUCTIVE = new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary("DESTRUCTIVE", 3);
    public static final com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary ACTION = new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary("ACTION", 4);

    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[] $values() {
        return new com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[]{SECONDARY, SECONDARY_FILLED, DEACTIVATED, DESTRUCTIVE, ACTION};
    }

    static {
        com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TrueButton$ButtonStyleSecondary(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary.class, str);
    }

    public static com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[] values() {
        return (com.truecaller.compose.ui.components.TrueButton$ButtonStyleSecondary[]) $VALUES.clone();
    }
}
