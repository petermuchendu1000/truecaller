package com.truecaller.compose.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/compose/ui/components/TrueDialog$ActionLayout", "", "Lcom/truecaller/compose/ui/components/TrueDialog$ActionLayout;", "<init>", "(Ljava/lang/String;I)V", "VERTICAL", "HORIZONTAL", "ui-components_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class TrueDialog$ActionLayout {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueDialog$ActionLayout[] $VALUES;
    public static final com.truecaller.compose.ui.components.TrueDialog$ActionLayout VERTICAL = new com.truecaller.compose.ui.components.TrueDialog$ActionLayout("VERTICAL", 0);
    public static final com.truecaller.compose.ui.components.TrueDialog$ActionLayout HORIZONTAL = new com.truecaller.compose.ui.components.TrueDialog$ActionLayout("HORIZONTAL", 1);

    private static final /* synthetic */ com.truecaller.compose.ui.components.TrueDialog$ActionLayout[] $values() {
        return new com.truecaller.compose.ui.components.TrueDialog$ActionLayout[]{VERTICAL, HORIZONTAL};
    }

    static {
        com.truecaller.compose.ui.components.TrueDialog$ActionLayout[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TrueDialog$ActionLayout(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.compose.ui.components.TrueDialog$ActionLayout valueOf(java.lang.String str) {
        return (com.truecaller.compose.ui.components.TrueDialog$ActionLayout) java.lang.Enum.valueOf(com.truecaller.compose.ui.components.TrueDialog$ActionLayout.class, str);
    }

    public static com.truecaller.compose.ui.components.TrueDialog$ActionLayout[] values() {
        return (com.truecaller.compose.ui.components.TrueDialog$ActionLayout[]) $VALUES.clone();
    }
}
