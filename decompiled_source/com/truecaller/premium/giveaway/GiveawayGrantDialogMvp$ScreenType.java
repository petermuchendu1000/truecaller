package com.truecaller.premium.giveaway;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/truecaller/premium/giveaway/GiveawayGrantDialogMvp$ScreenType", "", "Lcom/truecaller/premium/giveaway/GiveawayGrantDialogMvp$ScreenType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "cb2/f", "ALREADY_GRANTED", "UPGRADE_FAILED", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GiveawayGrantDialogMvp$ScreenType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final cb2.f Companion;
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType ALREADY_GRANTED = new com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType("ALREADY_GRANTED", 0);
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType UPGRADE_FAILED = new com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType("UPGRADE_FAILED", 1);

    private static final /* synthetic */ com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[] $values() {
        return new com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[]{ALREADY_GRANTED, UPGRADE_FAILED};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, cb2.f] */
    static {
        com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private GiveawayGrantDialogMvp$ScreenType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.Nullable
    public static final com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        for (com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType giveawayGrantDialogMvp$ScreenType : values()) {
            if (kotlin.jvm.internal.Intrinsics.b(giveawayGrantDialogMvp$ScreenType.name(), str)) {
                return giveawayGrantDialogMvp$ScreenType;
            }
        }
        return null;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType valueOf(java.lang.String str) {
        return (com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType) java.lang.Enum.valueOf(com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType.class, str);
    }

    public static com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[] values() {
        return (com.truecaller.premium.giveaway.GiveawayGrantDialogMvp$ScreenType[]) $VALUES.clone();
    }
}
