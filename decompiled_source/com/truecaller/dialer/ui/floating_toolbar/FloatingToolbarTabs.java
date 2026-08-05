package com.truecaller.dialer.ui.floating_toolbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/dialer/ui/floating_toolbar/FloatingToolbarTabs;", "", "index", "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "CALLS", "CONTACTS", "FAVORITE", "dialer_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class FloatingToolbarTabs {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[] $VALUES;
    public static final com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs CALLS = new com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs("CALLS", 0, 0);
    public static final com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs CONTACTS = new com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs("CONTACTS", 1, 1);
    public static final com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs FAVORITE = new com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs("FAVORITE", 2, 2);
    private final int index;

    private static final /* synthetic */ com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[] $values() {
        return new com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[]{CALLS, CONTACTS, FAVORITE};
    }

    static {
        com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private FloatingToolbarTabs(java.lang.String str, int i, int i2) {
        this.index = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs valueOf(java.lang.String str) {
        return (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs) java.lang.Enum.valueOf(com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs.class, str);
    }

    public static com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[] values() {
        return (com.truecaller.dialer.ui.floating_toolbar.FloatingToolbarTabs[]) $VALUES.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
