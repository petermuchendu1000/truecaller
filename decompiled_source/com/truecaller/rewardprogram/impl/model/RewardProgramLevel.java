package com.truecaller.rewardprogram.impl.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/rewardprogram/impl/model/RewardProgramLevel;", "", "Li82/r;", "launchContext", "<init>", "(Ljava/lang/String;ILi82/r;)V", "Li82/r;", "getLaunchContext", "()Li82/r;", "Companion", "vk2/baz", "LEVEL_1", "LEVEL_2", "LEVEL_3", "LEVEL_4", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class RewardProgramLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.rewardprogram.impl.model.RewardProgramLevel[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final vk2.baz Companion;
    public static final com.truecaller.rewardprogram.impl.model.RewardProgramLevel LEVEL_1 = new com.truecaller.rewardprogram.impl.model.RewardProgramLevel("LEVEL_1", 0, i82.r.i9);
    public static final com.truecaller.rewardprogram.impl.model.RewardProgramLevel LEVEL_2 = new com.truecaller.rewardprogram.impl.model.RewardProgramLevel("LEVEL_2", 1, i82.r.j9);
    public static final com.truecaller.rewardprogram.impl.model.RewardProgramLevel LEVEL_3 = new com.truecaller.rewardprogram.impl.model.RewardProgramLevel("LEVEL_3", 2, i82.r.k9);
    public static final com.truecaller.rewardprogram.impl.model.RewardProgramLevel LEVEL_4 = new com.truecaller.rewardprogram.impl.model.RewardProgramLevel("LEVEL_4", 3, i82.r.l9);

    @org.jetbrains.annotations.NotNull
    private final i82.r launchContext;

    private static final /* synthetic */ com.truecaller.rewardprogram.impl.model.RewardProgramLevel[] $values() {
        return new com.truecaller.rewardprogram.impl.model.RewardProgramLevel[]{LEVEL_1, LEVEL_2, LEVEL_3, LEVEL_4};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [vk2.baz, java.lang.Object] */
    static {
        com.truecaller.rewardprogram.impl.model.RewardProgramLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private RewardProgramLevel(java.lang.String str, int i, i82.r rVar) {
        this.launchContext = rVar;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.rewardprogram.impl.model.RewardProgramLevel valueOf(java.lang.String str) {
        return (com.truecaller.rewardprogram.impl.model.RewardProgramLevel) java.lang.Enum.valueOf(com.truecaller.rewardprogram.impl.model.RewardProgramLevel.class, str);
    }

    public static com.truecaller.rewardprogram.impl.model.RewardProgramLevel[] values() {
        return (com.truecaller.rewardprogram.impl.model.RewardProgramLevel[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final i82.r getLaunchContext() {
        return this.launchContext;
    }
}
