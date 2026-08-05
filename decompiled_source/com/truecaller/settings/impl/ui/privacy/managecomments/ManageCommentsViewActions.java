package com.truecaller.settings.impl.ui.privacy.managecomments;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/settings/impl/ui/privacy/managecomments/ManageCommentsViewActions;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MANAGE_COMMENTS", "REMOVE_COMMENT", "CANCEL_REMOVE_COMMENT", "CONFIRM_REMOVE_COMMENT", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ManageCommentsViewActions {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions MANAGE_COMMENTS = new com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions("MANAGE_COMMENTS", 0, "ManageComments");
    public static final com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions REMOVE_COMMENT = new com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions("REMOVE_COMMENT", 1, "RemoveComments");
    public static final com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions CANCEL_REMOVE_COMMENT = new com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions("CANCEL_REMOVE_COMMENT", 2, "CancelRemoveComment");
    public static final com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions CONFIRM_REMOVE_COMMENT = new com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions("CONFIRM_REMOVE_COMMENT", 3, "ConfirmRemoveComment");

    private static final /* synthetic */ com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[] $values() {
        return new com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[]{MANAGE_COMMENTS, REMOVE_COMMENT, CANCEL_REMOVE_COMMENT, CONFIRM_REMOVE_COMMENT};
    }

    static {
        com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ManageCommentsViewActions(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions.class, str);
    }

    public static com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[] values() {
        return (com.truecaller.settings.impl.ui.privacy.managecomments.ManageCommentsViewActions[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
