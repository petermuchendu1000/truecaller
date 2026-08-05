package com.truecaller.common.ui.tooltip;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/common/ui/tooltip/TooltipDirection;", "", "<init>", "(Ljava/lang/String;I)V", "START", "TOP", "END", "BOTTOM", "TOP_END", "TOP_FAR_END", "TOP_FAR_START", "BOTTOM_END", "BOTTOM_START", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TooltipDirection {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.ui.tooltip.TooltipDirection[] $VALUES;
    public static final com.truecaller.common.ui.tooltip.TooltipDirection START = new com.truecaller.common.ui.tooltip.TooltipDirection("START", 0);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection TOP = new com.truecaller.common.ui.tooltip.TooltipDirection("TOP", 1);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection END = new com.truecaller.common.ui.tooltip.TooltipDirection("END", 2);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection BOTTOM = new com.truecaller.common.ui.tooltip.TooltipDirection("BOTTOM", 3);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection TOP_END = new com.truecaller.common.ui.tooltip.TooltipDirection("TOP_END", 4);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection TOP_FAR_END = new com.truecaller.common.ui.tooltip.TooltipDirection("TOP_FAR_END", 5);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection TOP_FAR_START = new com.truecaller.common.ui.tooltip.TooltipDirection("TOP_FAR_START", 6);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection BOTTOM_END = new com.truecaller.common.ui.tooltip.TooltipDirection("BOTTOM_END", 7);
    public static final com.truecaller.common.ui.tooltip.TooltipDirection BOTTOM_START = new com.truecaller.common.ui.tooltip.TooltipDirection("BOTTOM_START", 8);

    private static final /* synthetic */ com.truecaller.common.ui.tooltip.TooltipDirection[] $values() {
        return new com.truecaller.common.ui.tooltip.TooltipDirection[]{START, TOP, END, BOTTOM, TOP_END, TOP_FAR_END, TOP_FAR_START, BOTTOM_END, BOTTOM_START};
    }

    static {
        com.truecaller.common.ui.tooltip.TooltipDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TooltipDirection(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.ui.tooltip.TooltipDirection valueOf(java.lang.String str) {
        return (com.truecaller.common.ui.tooltip.TooltipDirection) java.lang.Enum.valueOf(com.truecaller.common.ui.tooltip.TooltipDirection.class, str);
    }

    public static com.truecaller.common.ui.tooltip.TooltipDirection[] values() {
        return (com.truecaller.common.ui.tooltip.TooltipDirection[]) $VALUES.clone();
    }
}
