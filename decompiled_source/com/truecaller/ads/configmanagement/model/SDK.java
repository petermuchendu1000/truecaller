package com.truecaller.ads.configmanagement.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/configmanagement/model/SDK;", "", "<init>", "(Ljava/lang/String;I)V", "GAM", "TCAdServer", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class SDK {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.configmanagement.model.SDK[] $VALUES;

    @bw.qux("GAM")
    public static final com.truecaller.ads.configmanagement.model.SDK GAM = new com.truecaller.ads.configmanagement.model.SDK("GAM", 0);

    @bw.qux("TcAdServer")
    public static final com.truecaller.ads.configmanagement.model.SDK TCAdServer = new com.truecaller.ads.configmanagement.model.SDK("TCAdServer", 1);

    private static final /* synthetic */ com.truecaller.ads.configmanagement.model.SDK[] $values() {
        return new com.truecaller.ads.configmanagement.model.SDK[]{GAM, TCAdServer};
    }

    static {
        com.truecaller.ads.configmanagement.model.SDK[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SDK(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.configmanagement.model.SDK valueOf(java.lang.String str) {
        return (com.truecaller.ads.configmanagement.model.SDK) java.lang.Enum.valueOf(com.truecaller.ads.configmanagement.model.SDK.class, str);
    }

    public static com.truecaller.ads.configmanagement.model.SDK[] values() {
        return (com.truecaller.ads.configmanagement.model.SDK[]) $VALUES.clone();
    }
}
