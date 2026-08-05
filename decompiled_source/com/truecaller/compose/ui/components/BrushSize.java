package com.truecaller.compose.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/compose/ui/components/BrushSize;", "", "<init>", "(Ljava/lang/String;I)V", "COMPOSABLE", "SCREEN", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class BrushSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.BrushSize[] $VALUES;
    public static final com.truecaller.compose.ui.components.BrushSize COMPOSABLE = new com.truecaller.compose.ui.components.BrushSize("COMPOSABLE", 0);
    public static final com.truecaller.compose.ui.components.BrushSize SCREEN = new com.truecaller.compose.ui.components.BrushSize("SCREEN", 1);

    private static final /* synthetic */ com.truecaller.compose.ui.components.BrushSize[] $values() {
        return new com.truecaller.compose.ui.components.BrushSize[]{COMPOSABLE, SCREEN};
    }

    static {
        com.truecaller.compose.ui.components.BrushSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BrushSize(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.BrushSize valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.BrushSize) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.BrushSize.class, str);
    }

    public static com.truecaller.compose.ui.components.BrushSize[] values() {
        return (com.truecaller.compose.ui.components.BrushSize[]) $VALUES.clone();
    }
}
