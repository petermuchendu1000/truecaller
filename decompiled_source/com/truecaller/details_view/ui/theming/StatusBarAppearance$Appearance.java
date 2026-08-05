package com.truecaller.details_view.ui.theming;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/details_view/ui/theming/StatusBarAppearance$Appearance", "", "Lcom/truecaller/details_view/ui/theming/StatusBarAppearance$Appearance;", "<init>", "(Ljava/lang/String;I)V", "LIGHT", "DARK", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class StatusBarAppearance$Appearance {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[] $VALUES;
    public static final com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance LIGHT = new com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance("LIGHT", 0);
    public static final com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance DARK = new com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance("DARK", 1);

    private static final /* synthetic */ com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[] $values() {
        return new com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[]{LIGHT, DARK};
    }

    static {
        com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StatusBarAppearance$Appearance(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance valueOf(java.lang.String str) {
        return (com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance) java.lang.Enum.valueOf(com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance.class, str);
    }

    public static com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[] values() {
        return (com.truecaller.details_view.ui.theming.StatusBarAppearance$Appearance[]) $VALUES.clone();
    }
}
