package com.truecaller.call_assistant.core.callslist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/call_assistant/core/callslist/FilterTab;", "", "titleResId", "", "iconResId", "<init>", "(Ljava/lang/String;III)V", "getTitleResId", "()I", "getIconResId", "ALL", "CALLER_REPLIED", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class FilterTab {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.call_assistant.core.callslist.FilterTab[] $VALUES;
    public static final com.truecaller.call_assistant.core.callslist.FilterTab ALL = new com.truecaller.call_assistant.core.callslist.FilterTab("ALL", 0, 2132018876, 2131232664);
    public static final com.truecaller.call_assistant.core.callslist.FilterTab CALLER_REPLIED = new com.truecaller.call_assistant.core.callslist.FilterTab("CALLER_REPLIED", 1, 2132018877, 2131232577);
    private final int iconResId;
    private final int titleResId;

    private static final /* synthetic */ com.truecaller.call_assistant.core.callslist.FilterTab[] $values() {
        return new com.truecaller.call_assistant.core.callslist.FilterTab[]{ALL, CALLER_REPLIED};
    }

    static {
        com.truecaller.call_assistant.core.callslist.FilterTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FilterTab(java.lang.String str, int i, int i2, int i3) {
        this.titleResId = i2;
        this.iconResId = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.call_assistant.core.callslist.FilterTab valueOf(java.lang.String str) {
        return (com.truecaller.call_assistant.core.callslist.FilterTab) java.lang.Enum.valueOf(com.truecaller.call_assistant.core.callslist.FilterTab.class, str);
    }

    public static com.truecaller.call_assistant.core.callslist.FilterTab[] values() {
        return (com.truecaller.call_assistant.core.callslist.FilterTab[]) $VALUES.clone();
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }
}
