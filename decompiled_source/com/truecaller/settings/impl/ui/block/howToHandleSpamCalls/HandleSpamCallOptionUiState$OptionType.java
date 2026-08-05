package com.truecaller.settings.impl.ui.block.howToHandleSpamCalls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/settings/impl/ui/block/howToHandleSpamCalls/HandleSpamCallOptionUiState$OptionType", "", "Lcom/truecaller/settings/impl/ui/block/howToHandleSpamCalls/HandleSpamCallOptionUiState$OptionType;", "<init>", "(Ljava/lang/String;I)V", "BLOCK", "ASSISTANT", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class HandleSpamCallOptionUiState$OptionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[] $VALUES;
    public static final com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType BLOCK = new com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType("BLOCK", 0);
    public static final com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType ASSISTANT = new com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType("ASSISTANT", 1);

    private static final /* synthetic */ com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[] $values() {
        return new com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[]{BLOCK, ASSISTANT};
    }

    static {
        com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private HandleSpamCallOptionUiState$OptionType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType.class, str);
    }

    public static com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[] values() {
        return (com.truecaller.settings.impl.ui.block.howToHandleSpamCalls.HandleSpamCallOptionUiState$OptionType[]) $VALUES.clone();
    }
}
