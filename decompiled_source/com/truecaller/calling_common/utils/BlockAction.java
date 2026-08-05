package com.truecaller.calling_common.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/calling_common/utils/BlockAction;", "", "<init>", "(Ljava/lang/String;I)V", "MUTE", "HANG_UP", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.utils.BlockAction[] $VALUES;
    public static final com.truecaller.calling_common.utils.BlockAction MUTE = new com.truecaller.calling_common.utils.BlockAction("MUTE", 0);
    public static final com.truecaller.calling_common.utils.BlockAction HANG_UP = new com.truecaller.calling_common.utils.BlockAction("HANG_UP", 1);

    private static final /* synthetic */ com.truecaller.calling_common.utils.BlockAction[] $values() {
        return new com.truecaller.calling_common.utils.BlockAction[]{MUTE, HANG_UP};
    }

    static {
        com.truecaller.calling_common.utils.BlockAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BlockAction(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.utils.BlockAction valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.utils.BlockAction) java.lang.Enum.valueOf(com.truecaller.calling_common.utils.BlockAction.class, str);
    }

    public static com.truecaller.calling_common.utils.BlockAction[] values() {
        return (com.truecaller.calling_common.utils.BlockAction[]) $VALUES.clone();
    }
}
