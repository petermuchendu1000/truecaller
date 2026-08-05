package com.truecaller.wizard.api.blocklevel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/wizard/api/blocklevel/BlockLevelConfig;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "f83/bar", "CONTROL", "DEFAULT_OFF", "DEFAULT_BASIC", "DEFAULT_MAX", "api"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class BlockLevelConfig {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.wizard.api.blocklevel.BlockLevelConfig[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate;

    @org.jetbrains.annotations.NotNull
    public static final f83.bar Companion;
    public static final com.truecaller.wizard.api.blocklevel.BlockLevelConfig CONTROL = new com.truecaller.wizard.api.blocklevel.BlockLevelConfig("CONTROL", 0);
    public static final com.truecaller.wizard.api.blocklevel.BlockLevelConfig DEFAULT_OFF = new com.truecaller.wizard.api.blocklevel.BlockLevelConfig("DEFAULT_OFF", 1);
    public static final com.truecaller.wizard.api.blocklevel.BlockLevelConfig DEFAULT_BASIC = new com.truecaller.wizard.api.blocklevel.BlockLevelConfig("DEFAULT_BASIC", 2);
    public static final com.truecaller.wizard.api.blocklevel.BlockLevelConfig DEFAULT_MAX = new com.truecaller.wizard.api.blocklevel.BlockLevelConfig("DEFAULT_MAX", 3);

    private static final /* synthetic */ com.truecaller.wizard.api.blocklevel.BlockLevelConfig[] $values() {
        return new com.truecaller.wizard.api.blocklevel.BlockLevelConfig[]{CONTROL, DEFAULT_OFF, DEFAULT_BASIC, DEFAULT_MAX};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [f83.bar, java.lang.Object] */
    static {
        com.truecaller.wizard.api.blocklevel.BlockLevelConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new e41.s(29));
    }

    private BlockLevelConfig(java.lang.String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
        return yg3.w0.e("com.truecaller.wizard.api.blocklevel.BlockLevelConfig", values(), new java.lang.String[]{"Control", "DefaultOff", "DefaultBasic", "DefaultMax"}, new java.lang.annotation.Annotation[][]{null, null, null, null});
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.wizard.api.blocklevel.BlockLevelConfig valueOf(java.lang.String str) {
        return (com.truecaller.wizard.api.blocklevel.BlockLevelConfig) java.lang.Enum.valueOf(com.truecaller.wizard.api.blocklevel.BlockLevelConfig.class, str);
    }

    public static com.truecaller.wizard.api.blocklevel.BlockLevelConfig[] values() {
        return (com.truecaller.wizard.api.blocklevel.BlockLevelConfig[]) $VALUES.clone();
    }
}
