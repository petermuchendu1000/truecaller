package com.truecaller.premium.ui.embedded;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/truecaller/premium/ui/embedded/EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState", "", "Lcom/truecaller/premium/ui/embedded/EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState;", "<init>", "(Ljava/lang/String;I)V", "FETCH_PRODUCTS_IN_PROGRESS", "FETCH_PRODUCTS_SUCCEEDED", "FETCH_PRODUCTS_FAILED", "PURCHASE_INITIATED", "PURCHASE_VERIFICATION_INITIATED", "PURCHASE_ABORTED", "PURCHASE_COMPLETED", "PURCHASE_PENDING", "FULL_PAYWALL_REQUESTED", "DEEPLINK_LAUNCH_REQUESTED", "ERROR_PURCHASE_NOT_SUPPORTED", "USER_IS_PREMIUM", "ERROR_NO_CONNECTION", "ERROR_USER_IS_PREMIUM_CANNOT_UPGRADE", "ERROR_UNKNOWN", "ERROR_PRODUCT_LIST_EMPTY", "ERROR_EMPTY_LAUNCH_CONTEXT", "DISMISS_SCREEN_REQUESTED", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[] $VALUES;
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState FETCH_PRODUCTS_IN_PROGRESS = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("FETCH_PRODUCTS_IN_PROGRESS", 0);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState FETCH_PRODUCTS_SUCCEEDED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("FETCH_PRODUCTS_SUCCEEDED", 1);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState FETCH_PRODUCTS_FAILED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("FETCH_PRODUCTS_FAILED", 2);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState PURCHASE_INITIATED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("PURCHASE_INITIATED", 3);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState PURCHASE_VERIFICATION_INITIATED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("PURCHASE_VERIFICATION_INITIATED", 4);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState PURCHASE_ABORTED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("PURCHASE_ABORTED", 5);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState PURCHASE_COMPLETED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("PURCHASE_COMPLETED", 6);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState PURCHASE_PENDING = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("PURCHASE_PENDING", 7);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState FULL_PAYWALL_REQUESTED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("FULL_PAYWALL_REQUESTED", 8);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState DEEPLINK_LAUNCH_REQUESTED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("DEEPLINK_LAUNCH_REQUESTED", 9);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_PURCHASE_NOT_SUPPORTED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_PURCHASE_NOT_SUPPORTED", 10);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState USER_IS_PREMIUM = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("USER_IS_PREMIUM", 11);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_NO_CONNECTION = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_NO_CONNECTION", 12);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_USER_IS_PREMIUM_CANNOT_UPGRADE = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_USER_IS_PREMIUM_CANNOT_UPGRADE", 13);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_UNKNOWN = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_UNKNOWN", 14);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_PRODUCT_LIST_EMPTY = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_PRODUCT_LIST_EMPTY", 15);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState ERROR_EMPTY_LAUNCH_CONTEXT = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("ERROR_EMPTY_LAUNCH_CONTEXT", 16);
    public static final com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState DISMISS_SCREEN_REQUESTED = new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState("DISMISS_SCREEN_REQUESTED", 17);

    private static final /* synthetic */ com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[] $values() {
        return new com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[]{FETCH_PRODUCTS_IN_PROGRESS, FETCH_PRODUCTS_SUCCEEDED, FETCH_PRODUCTS_FAILED, PURCHASE_INITIATED, PURCHASE_VERIFICATION_INITIATED, PURCHASE_ABORTED, PURCHASE_COMPLETED, PURCHASE_PENDING, FULL_PAYWALL_REQUESTED, DEEPLINK_LAUNCH_REQUESTED, ERROR_PURCHASE_NOT_SUPPORTED, USER_IS_PREMIUM, ERROR_NO_CONNECTION, ERROR_USER_IS_PREMIUM_CANNOT_UPGRADE, ERROR_UNKNOWN, ERROR_PRODUCT_LIST_EMPTY, ERROR_EMPTY_LAUNCH_CONTEXT, DISMISS_SCREEN_REQUESTED};
    }

    static {
        com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState) java.lang.Enum.valueOf(com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState.class, str);
    }

    public static com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[] values() {
        return (com.truecaller.premium.ui.embedded.EmbeddedPurchaseViewStateListener$EmbeddedPurchaseViewState[]) $VALUES.clone();
    }
}
