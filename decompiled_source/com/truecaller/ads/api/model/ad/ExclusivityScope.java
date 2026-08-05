package com.truecaller.ads.api.model.ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/ads/api/model/ad/ExclusivityScope;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Placement", "Screen", "Session", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ExclusivityScope {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.model.ad.ExclusivityScope[] $VALUES;
    public static final com.truecaller.ads.api.model.ad.ExclusivityScope None = new com.truecaller.ads.api.model.ad.ExclusivityScope("None", 0);
    public static final com.truecaller.ads.api.model.ad.ExclusivityScope Placement = new com.truecaller.ads.api.model.ad.ExclusivityScope("Placement", 1);
    public static final com.truecaller.ads.api.model.ad.ExclusivityScope Screen = new com.truecaller.ads.api.model.ad.ExclusivityScope("Screen", 2);
    public static final com.truecaller.ads.api.model.ad.ExclusivityScope Session = new com.truecaller.ads.api.model.ad.ExclusivityScope("Session", 3);

    private static final /* synthetic */ com.truecaller.ads.api.model.ad.ExclusivityScope[] $values() {
        return new com.truecaller.ads.api.model.ad.ExclusivityScope[]{None, Placement, Screen, Session};
    }

    static {
        com.truecaller.ads.api.model.ad.ExclusivityScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ExclusivityScope(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.model.ad.ExclusivityScope valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.model.ad.ExclusivityScope) java.lang.Enum.valueOf(com.truecaller.ads.api.model.ad.ExclusivityScope.class, str);
    }

    public static com.truecaller.ads.api.model.ad.ExclusivityScope[] values() {
        return (com.truecaller.ads.api.model.ad.ExclusivityScope[]) $VALUES.clone();
    }
}
