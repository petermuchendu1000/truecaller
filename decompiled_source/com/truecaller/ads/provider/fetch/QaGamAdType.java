package com.truecaller.ads.provider.fetch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/ads/provider/fetch/QaGamAdType;", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.TYPE_COLUMN, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NATIVE", "BANNER", "CUSTOM_TEMPLATE", "NONE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class QaGamAdType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.provider.fetch.QaGamAdType[] $VALUES;
    public static final com.truecaller.ads.provider.fetch.QaGamAdType NATIVE = new com.truecaller.ads.provider.fetch.QaGamAdType("NATIVE", 0, "native");
    public static final com.truecaller.ads.provider.fetch.QaGamAdType BANNER = new com.truecaller.ads.provider.fetch.QaGamAdType("BANNER", 1, "banner");
    public static final com.truecaller.ads.provider.fetch.QaGamAdType CUSTOM_TEMPLATE = new com.truecaller.ads.provider.fetch.QaGamAdType("CUSTOM_TEMPLATE", 2, "customTemplate");
    public static final com.truecaller.ads.provider.fetch.QaGamAdType NONE = new com.truecaller.ads.provider.fetch.QaGamAdType("NONE", 3, "none");

    private static final /* synthetic */ com.truecaller.ads.provider.fetch.QaGamAdType[] $values() {
        return new com.truecaller.ads.provider.fetch.QaGamAdType[]{NATIVE, BANNER, CUSTOM_TEMPLATE, NONE};
    }

    static {
        com.truecaller.ads.provider.fetch.QaGamAdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private QaGamAdType(java.lang.String str, int i, java.lang.String str2) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.provider.fetch.QaGamAdType valueOf(java.lang.String str) {
        return (com.truecaller.ads.provider.fetch.QaGamAdType) java.lang.Enum.valueOf(com.truecaller.ads.provider.fetch.QaGamAdType.class, str);
    }

    public static com.truecaller.ads.provider.fetch.QaGamAdType[] values() {
        return (com.truecaller.ads.provider.fetch.QaGamAdType[]) $VALUES.clone();
    }
}
