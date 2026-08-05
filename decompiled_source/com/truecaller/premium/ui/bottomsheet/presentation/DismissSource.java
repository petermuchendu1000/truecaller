package com.truecaller.premium.ui.bottomsheet.presentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/premium/ui/bottomsheet/presentation/DismissSource;", "", "<init>", "(Ljava/lang/String;I)V", "BUTTON_CLICK", "OUTSIDE_TAP", "PROGRAMMATIC", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DismissSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[] $VALUES;
    public static final com.truecaller.premium.ui.bottomsheet.presentation.DismissSource BUTTON_CLICK = new com.truecaller.premium.ui.bottomsheet.presentation.DismissSource("BUTTON_CLICK", 0);
    public static final com.truecaller.premium.ui.bottomsheet.presentation.DismissSource OUTSIDE_TAP = new com.truecaller.premium.ui.bottomsheet.presentation.DismissSource("OUTSIDE_TAP", 1);
    public static final com.truecaller.premium.ui.bottomsheet.presentation.DismissSource PROGRAMMATIC = new com.truecaller.premium.ui.bottomsheet.presentation.DismissSource("PROGRAMMATIC", 2);

    private static final /* synthetic */ com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[] $values() {
        return new com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[]{BUTTON_CLICK, OUTSIDE_TAP, PROGRAMMATIC};
    }

    static {
        com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DismissSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.bottomsheet.presentation.DismissSource valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.bottomsheet.presentation.DismissSource) java.lang.Enum.valueOf(com.truecaller.premium.ui.bottomsheet.presentation.DismissSource.class, str);
    }

    public static com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[] values() {
        return (com.truecaller.premium.ui.bottomsheet.presentation.DismissSource[]) $VALUES.clone();
    }
}
