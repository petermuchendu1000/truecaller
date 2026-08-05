package com.truecaller.neo.acs.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/neo/acs/ui/NeoAcsLayoutType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "REVERSE", "neo-acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NeoAcsLayoutType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.neo.acs.ui.NeoAcsLayoutType[] $VALUES;
    public static final com.truecaller.neo.acs.ui.NeoAcsLayoutType NORMAL = new com.truecaller.neo.acs.ui.NeoAcsLayoutType("NORMAL", 0, 0);
    public static final com.truecaller.neo.acs.ui.NeoAcsLayoutType REVERSE = new com.truecaller.neo.acs.ui.NeoAcsLayoutType("REVERSE", 1, 1);
    private final int value;

    private static final /* synthetic */ com.truecaller.neo.acs.ui.NeoAcsLayoutType[] $values() {
        return new com.truecaller.neo.acs.ui.NeoAcsLayoutType[]{NORMAL, REVERSE};
    }

    static {
        com.truecaller.neo.acs.ui.NeoAcsLayoutType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NeoAcsLayoutType(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.neo.acs.ui.NeoAcsLayoutType valueOf(java.lang.String str) {
        return (com.truecaller.neo.acs.ui.NeoAcsLayoutType) java.lang.Enum.valueOf(com.truecaller.neo.acs.ui.NeoAcsLayoutType.class, str);
    }

    public static com.truecaller.neo.acs.ui.NeoAcsLayoutType[] values() {
        return (com.truecaller.neo.acs.ui.NeoAcsLayoutType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
