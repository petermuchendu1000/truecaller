package com.truecaller.common_call_log.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/common_call_log/ui/CallIconColor;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "BLUE", "RED", "common-call-log_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class CallIconColor {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common_call_log.ui.CallIconColor[] $VALUES;
    public static final com.truecaller.common_call_log.ui.CallIconColor DEFAULT = new com.truecaller.common_call_log.ui.CallIconColor("DEFAULT", 0);
    public static final com.truecaller.common_call_log.ui.CallIconColor BLUE = new com.truecaller.common_call_log.ui.CallIconColor("BLUE", 1);
    public static final com.truecaller.common_call_log.ui.CallIconColor RED = new com.truecaller.common_call_log.ui.CallIconColor("RED", 2);

    private static final /* synthetic */ com.truecaller.common_call_log.ui.CallIconColor[] $values() {
        return new com.truecaller.common_call_log.ui.CallIconColor[]{DEFAULT, BLUE, RED};
    }

    static {
        com.truecaller.common_call_log.ui.CallIconColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallIconColor(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common_call_log.ui.CallIconColor valueOf(java.lang.String str) {
        return (com.truecaller.common_call_log.ui.CallIconColor) java.lang.Enum.valueOf(com.truecaller.common_call_log.ui.CallIconColor.class, str);
    }

    public static com.truecaller.common_call_log.ui.CallIconColor[] values() {
        return (com.truecaller.common_call_log.ui.CallIconColor[]) $VALUES.clone();
    }
}
