package com.truecaller.analytics.common.event;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b&\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"com/truecaller/analytics/common/event/UserInteractionEvent$Action", "", "Lcom/truecaller/analytics/common/event/UserInteractionEvent$Action;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SUGGESTED_NAME", "CALLED", "SMS", "ADDED_TAG", "SAVED_CONTACT", "EDITED_CONTACT", "WARNED_FRIENDS", "BLOCKED", "UNBLOCKED", "RATED_US", "OPENED_DETAIL_VIEW", "MANUALLY_DISMISSED", "LIST_ITEM_CLICKED", "POSITIVE_BUTTON", "NEGATIVE_BUTTON", "OPEN_APP", "PAYMENT", "RECHARGE", "CHANGE_PASSWORD", "FLASH_BUTTON", "REQUEST_MONEY", "GET_PAYMENT_LINK", "SEND_PAY_REQUEST", "CREATE_SMS_SHORTCUT", "CREATE_SMS_SHORTCUT_DISMISSED", "VIEWED", "ACCEPTED", "IM_PROMO_CLICKED", "IM_PROMO_DISMISSED", "PRIMARY_ACTION", "SECONDARY_ACTION", "common-analytics_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class UserInteractionEvent$Action {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.analytics.common.event.UserInteractionEvent$Action[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action SUGGESTED_NAME = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("SUGGESTED_NAME", 0, "suggestedName");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action CALLED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("CALLED", 1, "called");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action SMS = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("SMS", 2, com.truecaller.account.network.TokenResponseDto.METHOD_SMS);
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action ADDED_TAG = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("ADDED_TAG", 3, "addedTag");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action SAVED_CONTACT = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("SAVED_CONTACT", 4, "savedContact");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action EDITED_CONTACT = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("EDITED_CONTACT", 5, "editedContact");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action WARNED_FRIENDS = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("WARNED_FRIENDS", 6, "warnedFriends");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action BLOCKED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("BLOCKED", 7, "blocked");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action UNBLOCKED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("UNBLOCKED", 8, "unblocked");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action RATED_US = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("RATED_US", 9, "ratedUs");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action OPENED_DETAIL_VIEW = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("OPENED_DETAIL_VIEW", 10, "openedDetailView");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action MANUALLY_DISMISSED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("MANUALLY_DISMISSED", 11, "manuallyDismissed");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action LIST_ITEM_CLICKED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("LIST_ITEM_CLICKED", 12, "listItemClicked");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action POSITIVE_BUTTON = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("POSITIVE_BUTTON", 13, "positiveButton");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action NEGATIVE_BUTTON = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("NEGATIVE_BUTTON", 14, "negativeButton");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action OPEN_APP = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("OPEN_APP", 15, "openApp");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action PAYMENT = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("PAYMENT", 16, "payment");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action RECHARGE = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("RECHARGE", 17, "recharge");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action CHANGE_PASSWORD = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("CHANGE_PASSWORD", 18, "changePassword");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action FLASH_BUTTON = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("FLASH_BUTTON", 19, "flashButton");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action REQUEST_MONEY = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("REQUEST_MONEY", 20, "requestMoney");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action GET_PAYMENT_LINK = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("GET_PAYMENT_LINK", 21, "getPayLink");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action SEND_PAY_REQUEST = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("SEND_PAY_REQUEST", 22, "sendPayRequest");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action CREATE_SMS_SHORTCUT = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("CREATE_SMS_SHORTCUT", 23, "createSMSShortcut");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action CREATE_SMS_SHORTCUT_DISMISSED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("CREATE_SMS_SHORTCUT_DISMISSED", 24, "smsShortcutDismissed");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action VIEWED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("VIEWED", 25, "viewed");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action ACCEPTED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("ACCEPTED", 26, com.truecaller.account.network.ExchangeCredentialsResponseDto.STATE_ACCEPTED);
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action IM_PROMO_CLICKED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("IM_PROMO_CLICKED", 27, "imPromoClicked");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action IM_PROMO_DISMISSED = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("IM_PROMO_DISMISSED", 28, "imPromoDismissed");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action PRIMARY_ACTION = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("PRIMARY_ACTION", 29, "primaryAction");
    public static final com.truecaller.analytics.common.event.UserInteractionEvent$Action SECONDARY_ACTION = new com.truecaller.analytics.common.event.UserInteractionEvent$Action("SECONDARY_ACTION", 30, "secondaryAction");

    private static final /* synthetic */ com.truecaller.analytics.common.event.UserInteractionEvent$Action[] $values() {
        return new com.truecaller.analytics.common.event.UserInteractionEvent$Action[]{SUGGESTED_NAME, CALLED, SMS, ADDED_TAG, SAVED_CONTACT, EDITED_CONTACT, WARNED_FRIENDS, BLOCKED, UNBLOCKED, RATED_US, OPENED_DETAIL_VIEW, MANUALLY_DISMISSED, LIST_ITEM_CLICKED, POSITIVE_BUTTON, NEGATIVE_BUTTON, OPEN_APP, PAYMENT, RECHARGE, CHANGE_PASSWORD, FLASH_BUTTON, REQUEST_MONEY, GET_PAYMENT_LINK, SEND_PAY_REQUEST, CREATE_SMS_SHORTCUT, CREATE_SMS_SHORTCUT_DISMISSED, VIEWED, ACCEPTED, IM_PROMO_CLICKED, IM_PROMO_DISMISSED, PRIMARY_ACTION, SECONDARY_ACTION};
    }

    static {
        com.truecaller.analytics.common.event.UserInteractionEvent$Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UserInteractionEvent$Action(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.analytics.common.event.UserInteractionEvent$Action valueOf(java.lang.String str) {
        return (com.truecaller.analytics.common.event.UserInteractionEvent$Action) java.lang.Enum.valueOf(com.truecaller.analytics.common.event.UserInteractionEvent$Action.class, str);
    }

    public static com.truecaller.analytics.common.event.UserInteractionEvent$Action[] values() {
        return (com.truecaller.analytics.common.event.UserInteractionEvent$Action[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
