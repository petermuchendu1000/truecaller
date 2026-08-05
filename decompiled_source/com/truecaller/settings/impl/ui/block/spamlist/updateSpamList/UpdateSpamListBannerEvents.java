package com.truecaller.settings.impl.ui.block.spamlist.updateSpamList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/settings/impl/ui/block/spamlist/updateSpamList/UpdateSpamListBannerEvents;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATE_SPAM_LIST", "OPEN_PREMIUM_PAYWALL", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class UpdateSpamListBannerEvents {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[] $VALUES;
    public static final com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents UPDATE_SPAM_LIST = new com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents("UPDATE_SPAM_LIST", 0);
    public static final com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents OPEN_PREMIUM_PAYWALL = new com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents("OPEN_PREMIUM_PAYWALL", 1);

    private static final /* synthetic */ com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[] $values() {
        return new com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[]{UPDATE_SPAM_LIST, OPEN_PREMIUM_PAYWALL};
    }

    static {
        com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UpdateSpamListBannerEvents(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents.class, str);
    }

    public static com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[] values() {
        return (com.truecaller.settings.impl.ui.block.spamlist.updateSpamList.UpdateSpamListBannerEvents[]) $VALUES.clone();
    }
}
