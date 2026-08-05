package com.truecaller.settings.api.block.spamlist;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/settings/api/block/spamlist/SpamProtectionUiState$ACSType", "", "Lcom/truecaller/settings/api/block/spamlist/SpamProtectionUiState$ACSType;", "<init>", "(Ljava/lang/String;I)V", "PACS", "FACS", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SpamProtectionUiState$ACSType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[] $VALUES;
    public static final com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType PACS = new com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType("PACS", 0);
    public static final com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType FACS = new com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType("FACS", 1);

    private static final /* synthetic */ com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[] $values() {
        return new com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[]{PACS, FACS};
    }

    static {
        com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SpamProtectionUiState$ACSType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType valueOf(java.lang.String str) {
        return (com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType) java.lang.Enum.valueOf(com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType.class, str);
    }

    public static com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[] values() {
        return (com.truecaller.settings.api.block.spamlist.SpamProtectionUiState$ACSType[]) $VALUES.clone();
    }
}
