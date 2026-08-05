package com.truecaller.suspension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/suspension/AccountSuspendedNotificationConfigurations;", "", "id", "", "daysInterval", "title", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "<init>", "(Ljava/lang/String;IIIII)V", "getId", "()I", "getDaysInterval", "getTitle", "getContent", "IMMEDIATE", "ONE_DAY", "ONE_WEEK", "WEEKLY", "account-suspension_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class AccountSuspendedNotificationConfigurations {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.suspension.AccountSuspendedNotificationConfigurations[] $VALUES;
    public static final com.truecaller.suspension.AccountSuspendedNotificationConfigurations IMMEDIATE = new com.truecaller.suspension.AccountSuspendedNotificationConfigurations("IMMEDIATE", 0, 0, 0, 2132019288, 2132019290);
    public static final com.truecaller.suspension.AccountSuspendedNotificationConfigurations ONE_DAY = new com.truecaller.suspension.AccountSuspendedNotificationConfigurations("ONE_DAY", 1, 1, 1, 2132019288, 2132019290);
    public static final com.truecaller.suspension.AccountSuspendedNotificationConfigurations ONE_WEEK = new com.truecaller.suspension.AccountSuspendedNotificationConfigurations("ONE_WEEK", 2, 2, 6, 2132019287, 2132019292);
    public static final com.truecaller.suspension.AccountSuspendedNotificationConfigurations WEEKLY = new com.truecaller.suspension.AccountSuspendedNotificationConfigurations("WEEKLY", 3, 3, 7, 2132019287, 2132019292);
    private final int content;
    private final int daysInterval;
    private final int id;
    private final int title;

    private static final /* synthetic */ com.truecaller.suspension.AccountSuspendedNotificationConfigurations[] $values() {
        return new com.truecaller.suspension.AccountSuspendedNotificationConfigurations[]{IMMEDIATE, ONE_DAY, ONE_WEEK, WEEKLY};
    }

    static {
        com.truecaller.suspension.AccountSuspendedNotificationConfigurations[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AccountSuspendedNotificationConfigurations(java.lang.String str, int i, int i2, int i3, int i4, int i5) {
        this.id = i2;
        this.daysInterval = i3;
        this.title = i4;
        this.content = i5;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.suspension.AccountSuspendedNotificationConfigurations valueOf(java.lang.String str) {
        return (com.truecaller.suspension.AccountSuspendedNotificationConfigurations) java.lang.Enum.valueOf(com.truecaller.suspension.AccountSuspendedNotificationConfigurations.class, str);
    }

    public static com.truecaller.suspension.AccountSuspendedNotificationConfigurations[] values() {
        return (com.truecaller.suspension.AccountSuspendedNotificationConfigurations[]) $VALUES.clone();
    }

    public final int getContent() {
        return this.content;
    }

    public final int getDaysInterval() {
        return this.daysInterval;
    }

    public final int getId() {
        return this.id;
    }

    public final int getTitle() {
        return this.title;
    }
}
