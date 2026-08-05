package com.truecaller.callerid.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/callerid/window/InfoLineStyle;", "", "<init>", "(Ljava/lang/String;I)V", "NORMAL", "PRIORITY", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class InfoLineStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callerid.window.InfoLineStyle[] $VALUES;
    public static final com.truecaller.callerid.window.InfoLineStyle NORMAL = new com.truecaller.callerid.window.InfoLineStyle("NORMAL", 0);
    public static final com.truecaller.callerid.window.InfoLineStyle PRIORITY = new com.truecaller.callerid.window.InfoLineStyle("PRIORITY", 1);

    private static final /* synthetic */ com.truecaller.callerid.window.InfoLineStyle[] $values() {
        return new com.truecaller.callerid.window.InfoLineStyle[]{NORMAL, PRIORITY};
    }

    static {
        com.truecaller.callerid.window.InfoLineStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InfoLineStyle(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callerid.window.InfoLineStyle valueOf(java.lang.String str) {
        return (com.truecaller.callerid.window.InfoLineStyle) java.lang.Enum.valueOf(com.truecaller.callerid.window.InfoLineStyle.class, str);
    }

    public static com.truecaller.callerid.window.InfoLineStyle[] values() {
        return (com.truecaller.callerid.window.InfoLineStyle[]) $VALUES.clone();
    }
}
