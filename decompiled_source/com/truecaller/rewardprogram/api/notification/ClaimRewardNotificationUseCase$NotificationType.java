package com.truecaller.rewardprogram.api.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/rewardprogram/api/notification/ClaimRewardNotificationUseCase$NotificationType", "", "Lcom/truecaller/rewardprogram/api/notification/ClaimRewardNotificationUseCase$NotificationType;", "<init>", "(Ljava/lang/String;I)V", "REPEATING", "LAST_CHANCE", "LAST_CALL", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ClaimRewardNotificationUseCase$NotificationType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[] $VALUES;
    public static final com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType REPEATING = new com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType("REPEATING", 0);
    public static final com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType LAST_CHANCE = new com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType("LAST_CHANCE", 1);
    public static final com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType LAST_CALL = new com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType("LAST_CALL", 2);

    private static final /* synthetic */ com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[] $values() {
        return new com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[]{REPEATING, LAST_CHANCE, LAST_CALL};
    }

    static {
        com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ClaimRewardNotificationUseCase$NotificationType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType) java.lang.Enum.valueOf(com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType.class, str);
    }

    public static com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[] values() {
        return (com.truecaller.rewardprogram.api.notification.ClaimRewardNotificationUseCase$NotificationType[]) $VALUES.clone();
    }
}
