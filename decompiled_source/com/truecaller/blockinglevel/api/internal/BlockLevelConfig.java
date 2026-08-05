package com.truecaller.blockinglevel.api.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/blockinglevel/api/internal/BlockLevelConfig;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "tj0/bar", "CONTROL", "DEFAULT_OFF", "DEFAULT_BASIC", "DEFAULT_MAX", "DEFAULT_OFF_BUTTON", "DEFAULT_BASIC_BUTTON", "DEFAULT_MAX_BUTTON", "DEFAULT_OFF_CARD", "DEFAULT_BASIC_CARD", "DEFAULT_MAX_CARD", "DEFAULT_OFF_FRAUD", "DEFAULT_BASIC_FRAUD", "DEFAULT_MAX_FRAUD", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockLevelConfig {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockinglevel.api.internal.BlockLevelConfig[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate;

    @org.jetbrains.annotations.NotNull
    public static final tj0.bar Companion;
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig CONTROL = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("CONTROL", 0);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_OFF = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_OFF", 1);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_BASIC = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_BASIC", 2);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_MAX = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_MAX", 3);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_OFF_BUTTON = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_OFF_BUTTON", 4);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_BASIC_BUTTON = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_BASIC_BUTTON", 5);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_MAX_BUTTON = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_MAX_BUTTON", 6);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_OFF_CARD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_OFF_CARD", 7);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_BASIC_CARD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_BASIC_CARD", 8);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_MAX_CARD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_MAX_CARD", 9);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_OFF_FRAUD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_OFF_FRAUD", 10);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_BASIC_FRAUD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_BASIC_FRAUD", 11);
    public static final com.truecaller.blockinglevel.api.internal.BlockLevelConfig DEFAULT_MAX_FRAUD = new com.truecaller.blockinglevel.api.internal.BlockLevelConfig("DEFAULT_MAX_FRAUD", 12);

    private static final /* synthetic */ com.truecaller.blockinglevel.api.internal.BlockLevelConfig[] $values() {
        return new com.truecaller.blockinglevel.api.internal.BlockLevelConfig[]{CONTROL, DEFAULT_OFF, DEFAULT_BASIC, DEFAULT_MAX, DEFAULT_OFF_BUTTON, DEFAULT_BASIC_BUTTON, DEFAULT_MAX_BUTTON, DEFAULT_OFF_CARD, DEFAULT_BASIC_CARD, DEFAULT_MAX_CARD, DEFAULT_OFF_FRAUD, DEFAULT_BASIC_FRAUD, DEFAULT_MAX_FRAUD};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [tj0.bar, java.lang.Object] */
    static {
        com.truecaller.blockinglevel.api.internal.BlockLevelConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new t22.s0(24));
    }

    private BlockLevelConfig(java.lang.String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
        return yg3.w0.e("com.truecaller.blockinglevel.api.internal.BlockLevelConfig", values(), new java.lang.String[]{"Control", "DefaultOff", "DefaultBasic", "DefaultMax", "DefaultOffButton", "DefaultBasicButton", "DefaultMaxButton", "DefaultOffCard", "DefaultBasicCard", "DefaultMaxCard", "DefaultOffFraud", "DefaultBasicFraud", "DefaultMaxFraud"}, new java.lang.annotation.Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockinglevel.api.internal.BlockLevelConfig valueOf(java.lang.String str) {
        return (com.truecaller.blockinglevel.api.internal.BlockLevelConfig) java.lang.Enum.valueOf(com.truecaller.blockinglevel.api.internal.BlockLevelConfig.class, str);
    }

    public static com.truecaller.blockinglevel.api.internal.BlockLevelConfig[] values() {
        return (com.truecaller.blockinglevel.api.internal.BlockLevelConfig[]) $VALUES.clone();
    }
}
