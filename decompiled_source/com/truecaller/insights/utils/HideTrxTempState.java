package com.truecaller.insights.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lcom/truecaller/insights/utils/HideTrxTempState;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "SHOWN", "HIDDEN", "isDefault", "", "isShown", "core_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class HideTrxTempState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.insights.utils.HideTrxTempState[] $VALUES;
    public static final com.truecaller.insights.utils.HideTrxTempState DEFAULT = new com.truecaller.insights.utils.HideTrxTempState("DEFAULT", 0);
    public static final com.truecaller.insights.utils.HideTrxTempState SHOWN = new com.truecaller.insights.utils.HideTrxTempState("SHOWN", 1);
    public static final com.truecaller.insights.utils.HideTrxTempState HIDDEN = new com.truecaller.insights.utils.HideTrxTempState("HIDDEN", 2);

    private static final /* synthetic */ com.truecaller.insights.utils.HideTrxTempState[] $values() {
        return new com.truecaller.insights.utils.HideTrxTempState[]{DEFAULT, SHOWN, HIDDEN};
    }

    static {
        com.truecaller.insights.utils.HideTrxTempState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private HideTrxTempState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.insights.utils.HideTrxTempState valueOf(java.lang.String str) {
        return (com.truecaller.insights.utils.HideTrxTempState) java.lang.Enum.valueOf(com.truecaller.insights.utils.HideTrxTempState.class, str);
    }

    public static com.truecaller.insights.utils.HideTrxTempState[] values() {
        return (com.truecaller.insights.utils.HideTrxTempState[]) $VALUES.clone();
    }

    public final boolean isDefault() {
        if (this == DEFAULT) {
            return true;
        }
        return false;
    }

    public final boolean isShown() {
        if (this == SHOWN) {
            return true;
        }
        return false;
    }
}
