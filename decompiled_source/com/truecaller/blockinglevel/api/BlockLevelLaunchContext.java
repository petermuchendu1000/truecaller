package com.truecaller.blockinglevel.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/blockinglevel/api/BlockLevelLaunchContext;", "", "<init>", "(Ljava/lang/String;I)V", "DEEPLINK", "POST_REGISTRATION", "ACS_MAX", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BlockLevelLaunchContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockinglevel.api.BlockLevelLaunchContext[] $VALUES;
    public static final com.truecaller.blockinglevel.api.BlockLevelLaunchContext DEEPLINK = new com.truecaller.blockinglevel.api.BlockLevelLaunchContext("DEEPLINK", 0);
    public static final com.truecaller.blockinglevel.api.BlockLevelLaunchContext POST_REGISTRATION = new com.truecaller.blockinglevel.api.BlockLevelLaunchContext("POST_REGISTRATION", 1);
    public static final com.truecaller.blockinglevel.api.BlockLevelLaunchContext ACS_MAX = new com.truecaller.blockinglevel.api.BlockLevelLaunchContext("ACS_MAX", 2);

    private static final /* synthetic */ com.truecaller.blockinglevel.api.BlockLevelLaunchContext[] $values() {
        return new com.truecaller.blockinglevel.api.BlockLevelLaunchContext[]{DEEPLINK, POST_REGISTRATION, ACS_MAX};
    }

    static {
        com.truecaller.blockinglevel.api.BlockLevelLaunchContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BlockLevelLaunchContext(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockinglevel.api.BlockLevelLaunchContext valueOf(java.lang.String str) {
        return (com.truecaller.blockinglevel.api.BlockLevelLaunchContext) java.lang.Enum.valueOf(com.truecaller.blockinglevel.api.BlockLevelLaunchContext.class, str);
    }

    public static com.truecaller.blockinglevel.api.BlockLevelLaunchContext[] values() {
        return (com.truecaller.blockinglevel.api.BlockLevelLaunchContext[]) $VALUES.clone();
    }
}
