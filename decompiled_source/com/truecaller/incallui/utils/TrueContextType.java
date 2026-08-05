package com.truecaller.incallui.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/incallui/utils/TrueContextType;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH_WARNINGS", "BUSINESS_CALL_REASON", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class TrueContextType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.utils.TrueContextType[] $VALUES;
    public static final com.truecaller.incallui.utils.TrueContextType SEARCH_WARNINGS = new com.truecaller.incallui.utils.TrueContextType("SEARCH_WARNINGS", 0);
    public static final com.truecaller.incallui.utils.TrueContextType BUSINESS_CALL_REASON = new com.truecaller.incallui.utils.TrueContextType("BUSINESS_CALL_REASON", 1);

    private static final /* synthetic */ com.truecaller.incallui.utils.TrueContextType[] $values() {
        return new com.truecaller.incallui.utils.TrueContextType[]{SEARCH_WARNINGS, BUSINESS_CALL_REASON};
    }

    static {
        com.truecaller.incallui.utils.TrueContextType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TrueContextType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.utils.TrueContextType valueOf(java.lang.String str) {
        return (com.truecaller.incallui.utils.TrueContextType) java.lang.Enum.valueOf(com.truecaller.incallui.utils.TrueContextType.class, str);
    }

    public static com.truecaller.incallui.utils.TrueContextType[] values() {
        return (com.truecaller.incallui.utils.TrueContextType[]) $VALUES.clone();
    }
}
