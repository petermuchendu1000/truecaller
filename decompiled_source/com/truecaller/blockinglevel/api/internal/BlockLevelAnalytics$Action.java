package com.truecaller.blockinglevel.api.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/blockinglevel/api/internal/BlockLevelAnalytics$Action", "", "Lcom/truecaller/blockinglevel/api/internal/BlockLevelAnalytics$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "DialogSeen", "DialogConverted", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockLevelAnalytics$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action DialogSeen = new com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action("DialogSeen", 0, "Seen");
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action DialogConverted = new com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action("DialogConverted", 1, "Converted");

    private static final /* synthetic */ com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[] $values() {
        return new com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[]{DialogSeen, DialogConverted};
    }

    static {
        com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BlockLevelAnalytics$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action valueOf(java.lang.String str) {
        return (com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action) java.lang.Enum.valueOf(com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action.class, str);
    }

    public static com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[] values() {
        return (com.truecaller.blockinglevel.api.internal.BlockLevelAnalytics$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
