package com.truecaller.premium.ui.subscription.buttons;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/premium/ui/subscription/buttons/ButtonConfig$Type", "", "Lcom/truecaller/premium/ui/subscription/buttons/ButtonConfig$Type;", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "xe2/baz", "BUTTON_V1", "GIVEAWAY", "ENGAGEMENT", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ButtonConfig$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final xe2.baz Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type BUTTON_V1 = new com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type("BUTTON_V1", 0, "button_v1");
    public static final com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type GIVEAWAY = new com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type("GIVEAWAY", 1, "giveaway");
    public static final com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type ENGAGEMENT = new com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type("ENGAGEMENT", 2, "engagement");

    private static final /* synthetic */ com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[] $values() {
        return new com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[]{BUTTON_V1, GIVEAWAY, ENGAGEMENT};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, xe2.baz] */
    static {
        com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private ButtonConfig$Type(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type) java.lang.Enum.valueOf(com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type.class, str);
    }

    public static com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[] values() {
        return (com.truecaller.premium.ui.subscription.buttons.ButtonConfig$Type[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
