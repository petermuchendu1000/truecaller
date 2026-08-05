package com.truecaller.compose.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/compose/ui/components/TrueAlert$TrueAlertStyle", "", "Lcom/truecaller/compose/ui/components/TrueAlert$TrueAlertStyle;", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "WARNING", "NEGATIVE", "CRITICAL", "BUSINESS", "PRIORITY", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TrueAlert$TrueAlertStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[] $VALUES;
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle NEUTRAL = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("NEUTRAL", 0);
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle WARNING = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("WARNING", 1);
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle NEGATIVE = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("NEGATIVE", 2);
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle CRITICAL = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("CRITICAL", 3);
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle BUSINESS = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("BUSINESS", 4);
    public static final com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle PRIORITY = new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle("PRIORITY", 5);

    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[] $values() {
        return new com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[]{NEUTRAL, WARNING, NEGATIVE, CRITICAL, BUSINESS, PRIORITY};
    }

    static {
        com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TrueAlert$TrueAlertStyle(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle.class, str);
    }

    public static com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[] values() {
        return (com.truecaller.compose.ui.components.TrueAlert$TrueAlertStyle[]) $VALUES.clone();
    }
}
