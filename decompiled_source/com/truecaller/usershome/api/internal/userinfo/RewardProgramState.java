package com.truecaller.usershome.api.internal.userinfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/usershome/api/internal/userinfo/RewardProgramState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_AVAILABLE", "JOIN", "CLAIM", "EARNED_REWARD", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.usershome.api.internal.userinfo.RewardProgramState[] $VALUES;
    public static final com.truecaller.usershome.api.internal.userinfo.RewardProgramState NOT_AVAILABLE = new com.truecaller.usershome.api.internal.userinfo.RewardProgramState("NOT_AVAILABLE", 0);
    public static final com.truecaller.usershome.api.internal.userinfo.RewardProgramState JOIN = new com.truecaller.usershome.api.internal.userinfo.RewardProgramState("JOIN", 1);
    public static final com.truecaller.usershome.api.internal.userinfo.RewardProgramState CLAIM = new com.truecaller.usershome.api.internal.userinfo.RewardProgramState("CLAIM", 2);
    public static final com.truecaller.usershome.api.internal.userinfo.RewardProgramState EARNED_REWARD = new com.truecaller.usershome.api.internal.userinfo.RewardProgramState("EARNED_REWARD", 3);

    private static final /* synthetic */ com.truecaller.usershome.api.internal.userinfo.RewardProgramState[] $values() {
        return new com.truecaller.usershome.api.internal.userinfo.RewardProgramState[]{NOT_AVAILABLE, JOIN, CLAIM, EARNED_REWARD};
    }

    static {
        com.truecaller.usershome.api.internal.userinfo.RewardProgramState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RewardProgramState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.usershome.api.internal.userinfo.RewardProgramState valueOf(java.lang.String str) {
        return (com.truecaller.usershome.api.internal.userinfo.RewardProgramState) java.lang.Enum.valueOf(com.truecaller.usershome.api.internal.userinfo.RewardProgramState.class, str);
    }

    public static com.truecaller.usershome.api.internal.userinfo.RewardProgramState[] values() {
        return (com.truecaller.usershome.api.internal.userinfo.RewardProgramState[]) $VALUES.clone();
    }
}
