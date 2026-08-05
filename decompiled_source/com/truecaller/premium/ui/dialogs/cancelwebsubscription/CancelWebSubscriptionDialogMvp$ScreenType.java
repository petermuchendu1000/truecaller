package com.truecaller.premium.ui.dialogs.cancelwebsubscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/premium/ui/dialogs/cancelwebsubscription/CancelWebSubscriptionDialogMvp$ScreenType", "", "Lcom/truecaller/premium/ui/dialogs/cancelwebsubscription/CancelWebSubscriptionDialogMvp$ScreenType;", "<init>", "(Ljava/lang/String;I)V", "Companion", "oe2/b", "CANCEL_WEB_SUBSCRIPTION_CONFIRMATION_PROMPT", "CANCEL_WEB_SUBSCRIPTION_STATUS_SUCCESS", "CANCEL_WEB_SUBSCRIPTION_STATUS_ERROR", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CancelWebSubscriptionDialogMvp$ScreenType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final oe2.b Companion;
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType CANCEL_WEB_SUBSCRIPTION_CONFIRMATION_PROMPT = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType("CANCEL_WEB_SUBSCRIPTION_CONFIRMATION_PROMPT", 0);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType CANCEL_WEB_SUBSCRIPTION_STATUS_SUCCESS = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType("CANCEL_WEB_SUBSCRIPTION_STATUS_SUCCESS", 1);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType CANCEL_WEB_SUBSCRIPTION_STATUS_ERROR = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType("CANCEL_WEB_SUBSCRIPTION_STATUS_ERROR", 2);

    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[] $values() {
        return new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[]{CANCEL_WEB_SUBSCRIPTION_CONFIRMATION_PROMPT, CANCEL_WEB_SUBSCRIPTION_STATUS_SUCCESS, CANCEL_WEB_SUBSCRIPTION_STATUS_ERROR};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oe2.b] */
    static {
        com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CancelWebSubscriptionDialogMvp$ScreenType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.Nullable
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        for (com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType cancelWebSubscriptionDialogMvp$ScreenType : values()) {
            if (kotlin.jvm.internal.Intrinsics.b(cancelWebSubscriptionDialogMvp$ScreenType.name(), str)) {
                return cancelWebSubscriptionDialogMvp$ScreenType;
            }
        }
        return null;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType) java.lang.Enum.valueOf(com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType.class, str);
    }

    public static com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[] values() {
        return (com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionDialogMvp$ScreenType[]) $VALUES.clone();
    }
}
