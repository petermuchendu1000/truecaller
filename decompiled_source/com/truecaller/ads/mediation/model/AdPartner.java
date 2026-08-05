package com.truecaller.ads.mediation.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/ads/mediation/model/AdPartner;", "", "<init>", "(Ljava/lang/String;I)V", "FACEBOOK", "AMAZON", "APPNEXT", "GOOGLE", "INMOBI", "CRACKLE", "VERVE", "MOLOCO", "FYBER", "LIFTOFF", "VUNGLE", "TAS", "DIGITALTURBINE", "MINTEGRAL", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdPartner {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.mediation.model.AdPartner[] $VALUES;
    public static final com.truecaller.ads.mediation.model.AdPartner FACEBOOK = new com.truecaller.ads.mediation.model.AdPartner("FACEBOOK", 0);
    public static final com.truecaller.ads.mediation.model.AdPartner AMAZON = new com.truecaller.ads.mediation.model.AdPartner("AMAZON", 1);
    public static final com.truecaller.ads.mediation.model.AdPartner APPNEXT = new com.truecaller.ads.mediation.model.AdPartner("APPNEXT", 2);
    public static final com.truecaller.ads.mediation.model.AdPartner GOOGLE = new com.truecaller.ads.mediation.model.AdPartner("GOOGLE", 3);
    public static final com.truecaller.ads.mediation.model.AdPartner INMOBI = new com.truecaller.ads.mediation.model.AdPartner("INMOBI", 4);
    public static final com.truecaller.ads.mediation.model.AdPartner CRACKLE = new com.truecaller.ads.mediation.model.AdPartner("CRACKLE", 5);
    public static final com.truecaller.ads.mediation.model.AdPartner VERVE = new com.truecaller.ads.mediation.model.AdPartner("VERVE", 6);
    public static final com.truecaller.ads.mediation.model.AdPartner MOLOCO = new com.truecaller.ads.mediation.model.AdPartner("MOLOCO", 7);
    public static final com.truecaller.ads.mediation.model.AdPartner FYBER = new com.truecaller.ads.mediation.model.AdPartner("FYBER", 8);
    public static final com.truecaller.ads.mediation.model.AdPartner LIFTOFF = new com.truecaller.ads.mediation.model.AdPartner("LIFTOFF", 9);
    public static final com.truecaller.ads.mediation.model.AdPartner VUNGLE = new com.truecaller.ads.mediation.model.AdPartner("VUNGLE", 10);
    public static final com.truecaller.ads.mediation.model.AdPartner TAS = new com.truecaller.ads.mediation.model.AdPartner("TAS", 11);
    public static final com.truecaller.ads.mediation.model.AdPartner DIGITALTURBINE = new com.truecaller.ads.mediation.model.AdPartner("DIGITALTURBINE", 12);
    public static final com.truecaller.ads.mediation.model.AdPartner MINTEGRAL = new com.truecaller.ads.mediation.model.AdPartner("MINTEGRAL", 13);

    private static final /* synthetic */ com.truecaller.ads.mediation.model.AdPartner[] $values() {
        return new com.truecaller.ads.mediation.model.AdPartner[]{FACEBOOK, AMAZON, APPNEXT, GOOGLE, INMOBI, CRACKLE, VERVE, MOLOCO, FYBER, LIFTOFF, VUNGLE, TAS, DIGITALTURBINE, MINTEGRAL};
    }

    static {
        com.truecaller.ads.mediation.model.AdPartner[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdPartner(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.mediation.model.AdPartner valueOf(java.lang.String str) {
        return (com.truecaller.ads.mediation.model.AdPartner) java.lang.Enum.valueOf(com.truecaller.ads.mediation.model.AdPartner.class, str);
    }

    public static com.truecaller.ads.mediation.model.AdPartner[] values() {
        return (com.truecaller.ads.mediation.model.AdPartner[]) $VALUES.clone();
    }
}
