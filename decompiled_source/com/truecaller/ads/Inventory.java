package com.truecaller.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/ads/Inventory;", "", "inventoryType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getInventoryType", "()Ljava/lang/String;", "CHAT_LIST", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Inventory {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.Inventory[] $VALUES;
    public static final com.truecaller.ads.Inventory CHAT_LIST = new com.truecaller.ads.Inventory("CHAT_LIST", 0, "ChatList");

    @org.jetbrains.annotations.Nullable
    private final java.lang.String inventoryType;

    private static final /* synthetic */ com.truecaller.ads.Inventory[] $values() {
        return new com.truecaller.ads.Inventory[]{CHAT_LIST};
    }

    static {
        com.truecaller.ads.Inventory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Inventory(java.lang.String str, int i, java.lang.String str2) {
        this.inventoryType = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.Inventory valueOf(java.lang.String str) {
        return (com.truecaller.ads.Inventory) java.lang.Enum.valueOf(com.truecaller.ads.Inventory.class, str);
    }

    public static com.truecaller.ads.Inventory[] values() {
        return (com.truecaller.ads.Inventory[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getInventoryType() {
        return this.inventoryType;
    }
}
