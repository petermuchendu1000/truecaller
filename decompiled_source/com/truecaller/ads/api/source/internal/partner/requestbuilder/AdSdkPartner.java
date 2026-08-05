package com.truecaller.ads.api.source.internal.partner.requestbuilder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/truecaller/ads/api/source/internal/partner/requestbuilder/AdSdkPartner;", "", "", "sdkName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSdkName", "()Ljava/lang/String;", "Companion", "r30/bar", "AMAZON", "INMOBI", "APPNEXT", "VERVE", "MOLOCO", "CRACKLE", "FYBER", "LIFTOFF", "DIGITAL_TURBINE", "MINTEGRAL", "api-source_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdSdkPartner {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final r30.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sdkName;
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner AMAZON = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("AMAZON", 0, "Amazon");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner INMOBI = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("INMOBI", 1, "InMobi");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner APPNEXT = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("APPNEXT", 2, "AppNext");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner VERVE = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("VERVE", 3, "Verve");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner MOLOCO = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("MOLOCO", 4, "Moloco");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner CRACKLE = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("CRACKLE", 5, "Crackle");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner FYBER = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("FYBER", 6, "Fyber");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner LIFTOFF = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("LIFTOFF", 7, "Liftoff");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner DIGITAL_TURBINE = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("DIGITAL_TURBINE", 8, "DigitalTurbine");
    public static final com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner MINTEGRAL = new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner("MINTEGRAL", 9, "Mintegral");

    private static final /* synthetic */ com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[] $values() {
        return new com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[]{AMAZON, INMOBI, APPNEXT, VERVE, MOLOCO, CRACKLE, FYBER, LIFTOFF, DIGITAL_TURBINE, MINTEGRAL};
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, r30.bar] */
    static {
        com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AdSdkPartner(java.lang.String str, int i, java.lang.String str2) {
        this.sdkName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner) java.lang.Enum.valueOf(com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner.class, str);
    }

    public static com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[] values() {
        return (com.truecaller.ads.api.source.internal.partner.requestbuilder.AdSdkPartner[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSdkName() {
        return this.sdkName;
    }
}
