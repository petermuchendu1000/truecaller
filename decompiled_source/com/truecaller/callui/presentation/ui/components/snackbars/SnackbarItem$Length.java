package com.truecaller.callui.presentation.ui.components.snackbars;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/callui/presentation/ui/components/snackbars/SnackbarItem$Length", "", "Lcom/truecaller/callui/presentation/ui/components/snackbars/SnackbarItem$Length;", "<init>", "(Ljava/lang/String;I)V", "LENGTH_SHORT", "LENGTH_LONG", "LENGTH_INDEFINITE", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SnackbarItem$Length {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length LENGTH_SHORT = new com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length("LENGTH_SHORT", 0);
    public static final com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length LENGTH_LONG = new com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length("LENGTH_LONG", 1);
    public static final com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length LENGTH_INDEFINITE = new com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length("LENGTH_INDEFINITE", 2);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[] $values() {
        return new com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[]{LENGTH_SHORT, LENGTH_LONG, LENGTH_INDEFINITE};
    }

    static {
        com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SnackbarItem$Length(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length.class, str);
    }

    public static com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[] values() {
        return (com.truecaller.callui.presentation.ui.components.snackbars.SnackbarItem$Length[]) $VALUES.clone();
    }
}
