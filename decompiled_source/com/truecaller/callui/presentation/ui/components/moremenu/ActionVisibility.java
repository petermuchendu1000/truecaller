package com.truecaller.callui.presentation.ui.components.moremenu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/callui/presentation/ui/components/moremenu/ActionVisibility;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "IF_ROOM", "MENU", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ActionVisibility {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[] $VALUES;
    public static final com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility PRIMARY = new com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility("PRIMARY", 0);
    public static final com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility IF_ROOM = new com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility("IF_ROOM", 1);
    public static final com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility MENU = new com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility("MENU", 2);

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[] $values() {
        return new com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[]{PRIMARY, IF_ROOM, MENU};
    }

    static {
        com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ActionVisibility(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility.class, str);
    }

    public static com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[] values() {
        return (com.truecaller.callui.presentation.ui.components.moremenu.ActionVisibility[]) $VALUES.clone();
    }
}
