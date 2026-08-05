package com.truecaller.utils.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/truecaller/utils/ui/LinkClickMovementMethod$LinkType", "", "Lcom/truecaller/utils/ui/LinkClickMovementMethod$LinkType;", "<init>", "(Ljava/lang/String;I)V", "PHONE", "WEB_URL", "EMAIL_ADDRESS", "MENTION", "DEEPLINK", "NONE", "generic_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class LinkClickMovementMethod$LinkType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[] $VALUES;
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType PHONE = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("PHONE", 0);
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType WEB_URL = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("WEB_URL", 1);
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType EMAIL_ADDRESS = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("EMAIL_ADDRESS", 2);
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType MENTION = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("MENTION", 3);
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType DEEPLINK = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("DEEPLINK", 4);
    public static final com.truecaller.utils.ui.LinkClickMovementMethod$LinkType NONE = new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType("NONE", 5);

    private static final /* synthetic */ com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[] $values() {
        return new com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[]{PHONE, WEB_URL, EMAIL_ADDRESS, MENTION, DEEPLINK, NONE};
    }

    static {
        com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private LinkClickMovementMethod$LinkType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.utils.ui.LinkClickMovementMethod$LinkType valueOf(java.lang.String str) {
        return (com.truecaller.utils.ui.LinkClickMovementMethod$LinkType) java.lang.Enum.valueOf(com.truecaller.utils.ui.LinkClickMovementMethod$LinkType.class, str);
    }

    public static com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[] values() {
        return (com.truecaller.utils.ui.LinkClickMovementMethod$LinkType[]) $VALUES.clone();
    }
}
