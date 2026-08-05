package com.truecaller.compose.ui.components.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/compose/ui/components/messaging/SubTitleColor;", "", "<init>", "(Ljava/lang/String;I)V", "COLOR_BLUE", "COLOR_RED", "COLOR_NONE", "compose-ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class SubTitleColor {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleColor[] $VALUES;
    public static final com.truecaller.compose.ui.components.messaging.SubTitleColor COLOR_BLUE = new com.truecaller.compose.ui.components.messaging.SubTitleColor("COLOR_BLUE", 0);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleColor COLOR_RED = new com.truecaller.compose.ui.components.messaging.SubTitleColor("COLOR_RED", 1);
    public static final com.truecaller.compose.ui.components.messaging.SubTitleColor COLOR_NONE = new com.truecaller.compose.ui.components.messaging.SubTitleColor("COLOR_NONE", 2);

    private static final /* synthetic */ com.truecaller.compose.ui.components.messaging.SubTitleColor[] $values() {
        return new com.truecaller.compose.ui.components.messaging.SubTitleColor[]{COLOR_BLUE, COLOR_RED, COLOR_NONE};
    }

    static {
        com.truecaller.compose.ui.components.messaging.SubTitleColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SubTitleColor(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleColor valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.messaging.SubTitleColor) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.messaging.SubTitleColor.class, str);
    }

    public static com.truecaller.compose.ui.components.messaging.SubTitleColor[] values() {
        return (com.truecaller.compose.ui.components.messaging.SubTitleColor[]) $VALUES.clone();
    }
}
