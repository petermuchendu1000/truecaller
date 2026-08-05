package com.truecaller.incallui.callui.enablePromo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/incallui/callui/enablePromo/Action;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DialogShown", "NegativeBtnClicked", "PositiveBtnClicked", "DefaultDialerRejected", "InCallUIEnabled", "DialogCancelled", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.callui.enablePromo.Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.incallui.callui.enablePromo.Action DialogShown = new com.truecaller.incallui.callui.enablePromo.Action("DialogShown", 0, "Shown");
    public static final com.truecaller.incallui.callui.enablePromo.Action NegativeBtnClicked = new com.truecaller.incallui.callui.enablePromo.Action("NegativeBtnClicked", 1, "NegativeBtnClicked");
    public static final com.truecaller.incallui.callui.enablePromo.Action PositiveBtnClicked = new com.truecaller.incallui.callui.enablePromo.Action("PositiveBtnClicked", 2, "PositiveBtnClicked");
    public static final com.truecaller.incallui.callui.enablePromo.Action DefaultDialerRejected = new com.truecaller.incallui.callui.enablePromo.Action("DefaultDialerRejected", 3, "Disabled");
    public static final com.truecaller.incallui.callui.enablePromo.Action InCallUIEnabled = new com.truecaller.incallui.callui.enablePromo.Action("InCallUIEnabled", 4, "Enabled");
    public static final com.truecaller.incallui.callui.enablePromo.Action DialogCancelled = new com.truecaller.incallui.callui.enablePromo.Action("DialogCancelled", 5, "DialogCancelled");

    private static final /* synthetic */ com.truecaller.incallui.callui.enablePromo.Action[] $values() {
        return new com.truecaller.incallui.callui.enablePromo.Action[]{DialogShown, NegativeBtnClicked, PositiveBtnClicked, DefaultDialerRejected, InCallUIEnabled, DialogCancelled};
    }

    static {
        com.truecaller.incallui.callui.enablePromo.Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.callui.enablePromo.Action valueOf(java.lang.String str) {
        return (com.truecaller.incallui.callui.enablePromo.Action) java.lang.Enum.valueOf(com.truecaller.incallui.callui.enablePromo.Action.class, str);
    }

    public static com.truecaller.incallui.callui.enablePromo.Action[] values() {
        return (com.truecaller.incallui.callui.enablePromo.Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
