package com.truecaller.premium.ui.dialogs.cancelwebsubscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/premium/ui/dialogs/cancelwebsubscription/CancelWebSubscriptionAction;", "", "", "actionCode", "<init>", "(Ljava/lang/String;II)V", "I", "getActionCode", "()I", "Companion", "oe2/bar", "CANCEL_WEB_SUBSCRIPTION", "RETRY_CANCEL_WEB_SUBSCRIPTION", "CANCEL_WEB_SUBSCRIPTION_SUCCESS_POP_UP_DISMISSED", "DISMISS", "DISMISS_ERROR", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class CancelWebSubscriptionAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final oe2.bar Companion;
    private final int actionCode;
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction CANCEL_WEB_SUBSCRIPTION = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("CANCEL_WEB_SUBSCRIPTION", 0, 0);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction RETRY_CANCEL_WEB_SUBSCRIPTION = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("RETRY_CANCEL_WEB_SUBSCRIPTION", 1, 1);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction CANCEL_WEB_SUBSCRIPTION_SUCCESS_POP_UP_DISMISSED = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("CANCEL_WEB_SUBSCRIPTION_SUCCESS_POP_UP_DISMISSED", 2, 2);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction DISMISS = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("DISMISS", 3, 3);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction DISMISS_ERROR = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("DISMISS_ERROR", 4, 4);
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction UNKNOWN = new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction("UNKNOWN", 5, -1);

    private static final /* synthetic */ com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[] $values() {
        return new com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[]{CANCEL_WEB_SUBSCRIPTION, RETRY_CANCEL_WEB_SUBSCRIPTION, CANCEL_WEB_SUBSCRIPTION_SUCCESS_POP_UP_DISMISSED, DISMISS, DISMISS_ERROR, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [oe2.bar, java.lang.Object] */
    static {
        com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CancelWebSubscriptionAction(java.lang.String str, int i, int i2) {
        this.actionCode = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction fromActionCode(@org.jetbrains.annotations.Nullable java.lang.Integer num) {
        Companion.getClass();
        return oe2.bar.a(num);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction) java.lang.Enum.valueOf(com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction.class, str);
    }

    public static com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[] values() {
        return (com.truecaller.premium.ui.dialogs.cancelwebsubscription.CancelWebSubscriptionAction[]) $VALUES.clone();
    }

    public final int getActionCode() {
        return this.actionCode;
    }
}
