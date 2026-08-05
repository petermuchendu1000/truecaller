package com.truecaller.callui.api.internal.analytics.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/callui/api/internal/analytics/model/CallUIDetailsViewAction;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCEPT", "REJECT", "HANGUP", "BACK_TO_CALL", "SWIPE_DISMISS", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallUIDetailsViewAction {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction ACCEPT = new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction("ACCEPT", 0, "Accept");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction REJECT = new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction("REJECT", 1, "Reject");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction HANGUP = new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction("HANGUP", 2, "Hangup");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction BACK_TO_CALL = new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction("BACK_TO_CALL", 3, "BackToCall");
    public static final com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction SWIPE_DISMISS = new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction("SWIPE_DISMISS", 4, "SwipeDismiss");

    private static final /* synthetic */ com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[] $values() {
        return new com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[]{ACCEPT, REJECT, HANGUP, BACK_TO_CALL, SWIPE_DISMISS};
    }

    static {
        com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallUIDetailsViewAction(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction valueOf(java.lang.String str) {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction) java.lang.Enum.valueOf(com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction.class, str);
    }

    public static com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[] values() {
        return (com.truecaller.callui.api.internal.analytics.model.CallUIDetailsViewAction[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
