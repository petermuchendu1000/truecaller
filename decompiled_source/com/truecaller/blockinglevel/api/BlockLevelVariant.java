package com.truecaller.blockinglevel.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/blockinglevel/api/BlockLevelVariant;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "BUTTON", "CARD", "FRAUD", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockLevelVariant {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockinglevel.api.BlockLevelVariant[] $VALUES;
    public static final com.truecaller.blockinglevel.api.BlockLevelVariant DEFAULT = new com.truecaller.blockinglevel.api.BlockLevelVariant("DEFAULT", 0);
    public static final com.truecaller.blockinglevel.api.BlockLevelVariant BUTTON = new com.truecaller.blockinglevel.api.BlockLevelVariant("BUTTON", 1);
    public static final com.truecaller.blockinglevel.api.BlockLevelVariant CARD = new com.truecaller.blockinglevel.api.BlockLevelVariant("CARD", 2);
    public static final com.truecaller.blockinglevel.api.BlockLevelVariant FRAUD = new com.truecaller.blockinglevel.api.BlockLevelVariant("FRAUD", 3);

    private static final /* synthetic */ com.truecaller.blockinglevel.api.BlockLevelVariant[] $values() {
        return new com.truecaller.blockinglevel.api.BlockLevelVariant[]{DEFAULT, BUTTON, CARD, FRAUD};
    }

    static {
        com.truecaller.blockinglevel.api.BlockLevelVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BlockLevelVariant(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockinglevel.api.BlockLevelVariant valueOf(java.lang.String str) {
        return (com.truecaller.blockinglevel.api.BlockLevelVariant) java.lang.Enum.valueOf(com.truecaller.blockinglevel.api.BlockLevelVariant.class, str);
    }

    public static com.truecaller.blockinglevel.api.BlockLevelVariant[] values() {
        return (com.truecaller.blockinglevel.api.BlockLevelVariant[]) $VALUES.clone();
    }
}
