package com.truecaller.ads.api.model.ad;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/ads/api/model/ad/AdSource;", "", "", com.truecaller.call_decline_messages.db.CallDeclineMessageDbContract.ID_COLUMN, "<init>", "(Ljava/lang/String;II)V", "I", "getId", "()I", "Companion", "c30/e", "GAM", "TAS", "PARTNER", "HOUSE", "PLACEHOLDER", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.model.ad.AdSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final c30.e Companion;
    private final int id;
    public static final com.truecaller.ads.api.model.ad.AdSource GAM = new com.truecaller.ads.api.model.ad.AdSource("GAM", 0, 0);
    public static final com.truecaller.ads.api.model.ad.AdSource TAS = new com.truecaller.ads.api.model.ad.AdSource("TAS", 1, 1);
    public static final com.truecaller.ads.api.model.ad.AdSource PARTNER = new com.truecaller.ads.api.model.ad.AdSource("PARTNER", 2, 2);
    public static final com.truecaller.ads.api.model.ad.AdSource HOUSE = new com.truecaller.ads.api.model.ad.AdSource("HOUSE", 3, 3);
    public static final com.truecaller.ads.api.model.ad.AdSource PLACEHOLDER = new com.truecaller.ads.api.model.ad.AdSource("PLACEHOLDER", 4, 4);

    private static final /* synthetic */ com.truecaller.ads.api.model.ad.AdSource[] $values() {
        return new com.truecaller.ads.api.model.ad.AdSource[]{GAM, TAS, PARTNER, HOUSE, PLACEHOLDER};
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, c30.e] */
    static {
        com.truecaller.ads.api.model.ad.AdSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AdSource(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.model.ad.AdSource valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.model.ad.AdSource) java.lang.Enum.valueOf(com.truecaller.ads.api.model.ad.AdSource.class, str);
    }

    public static com.truecaller.ads.api.model.ad.AdSource[] values() {
        return (com.truecaller.ads.api.model.ad.AdSource[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
