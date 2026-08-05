package com.truecaller.rewardprogram;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/rewardprogram/RewardProgramNotificationType;", "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "<init>", "(Ljava/lang/String;II)V", "getPriority", "()I", "MISSED_PERMISSION", "PAUSED_PERMISSION", "UNCOMPLETED_ACTION", "CLAIM_DAILY_POINTS", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramNotificationType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.RewardProgramNotificationType[] $VALUES;
    private final int priority;
    public static final com.truecaller.rewardprogram.RewardProgramNotificationType MISSED_PERMISSION = new com.truecaller.rewardprogram.RewardProgramNotificationType("MISSED_PERMISSION", 0, 10);
    public static final com.truecaller.rewardprogram.RewardProgramNotificationType PAUSED_PERMISSION = new com.truecaller.rewardprogram.RewardProgramNotificationType("PAUSED_PERMISSION", 1, 9);
    public static final com.truecaller.rewardprogram.RewardProgramNotificationType UNCOMPLETED_ACTION = new com.truecaller.rewardprogram.RewardProgramNotificationType("UNCOMPLETED_ACTION", 2, 8);
    public static final com.truecaller.rewardprogram.RewardProgramNotificationType CLAIM_DAILY_POINTS = new com.truecaller.rewardprogram.RewardProgramNotificationType("CLAIM_DAILY_POINTS", 3, 7);

    private static final /* synthetic */ com.truecaller.rewardprogram.RewardProgramNotificationType[] $values() {
        return new com.truecaller.rewardprogram.RewardProgramNotificationType[]{MISSED_PERMISSION, PAUSED_PERMISSION, UNCOMPLETED_ACTION, CLAIM_DAILY_POINTS};
    }

    static {
        com.truecaller.rewardprogram.RewardProgramNotificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RewardProgramNotificationType(java.lang.String str, int i, int i2) {
        this.priority = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.RewardProgramNotificationType valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.RewardProgramNotificationType) java.lang.Enum.valueOf(com.truecaller.rewardprogram.RewardProgramNotificationType.class, str);
    }

    public static com.truecaller.rewardprogram.RewardProgramNotificationType[] values() {
        return (com.truecaller.rewardprogram.RewardProgramNotificationType[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}
