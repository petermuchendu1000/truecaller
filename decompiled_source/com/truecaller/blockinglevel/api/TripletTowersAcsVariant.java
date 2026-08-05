package com.truecaller.blockinglevel.api;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/blockinglevel/api/TripletTowersAcsVariant;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "sj0/a", "INTERSTITIAL", "DEFAULT_OFF", "DEFAULT_BASIC", "DEFAULT_MAX", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ug3.d
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TripletTowersAcsVariant extends java.lang.Enum<com.truecaller.blockinglevel.api.TripletTowersAcsVariant> {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blockinglevel.api.TripletTowersAcsVariant[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer> $cachedSerializer$delegate;

    @org.jetbrains.annotations.NotNull
    public static final sj0.a Companion;
    public static final com.truecaller.blockinglevel.api.TripletTowersAcsVariant INTERSTITIAL = new com.truecaller.blockinglevel.api.TripletTowersAcsVariant("INTERSTITIAL", 0);
    public static final com.truecaller.blockinglevel.api.TripletTowersAcsVariant DEFAULT_OFF = new com.truecaller.blockinglevel.api.TripletTowersAcsVariant("DEFAULT_OFF", 1);
    public static final com.truecaller.blockinglevel.api.TripletTowersAcsVariant DEFAULT_BASIC = new com.truecaller.blockinglevel.api.TripletTowersAcsVariant("DEFAULT_BASIC", 2);
    public static final com.truecaller.blockinglevel.api.TripletTowersAcsVariant DEFAULT_MAX = new com.truecaller.blockinglevel.api.TripletTowersAcsVariant("DEFAULT_MAX", 3);

    private static final /* synthetic */ com.truecaller.blockinglevel.api.TripletTowersAcsVariant[] $values() {
        return new com.truecaller.blockinglevel.api.TripletTowersAcsVariant[]{INTERSTITIAL, DEFAULT_OFF, DEFAULT_BASIC, DEFAULT_MAX};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [sj0.a, java.lang.Object] */
    static {
        com.truecaller.blockinglevel.api.TripletTowersAcsVariant[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.k.b, new s20.bar(12));
    }

    private TripletTowersAcsVariant(java.lang.String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ kotlinx.serialization.KSerializer _init_$_anonymous_() {
        return yg3.w0.e("com.truecaller.blockinglevel.api.TripletTowersAcsVariant", values(), new java.lang.String[]{"interstitial", "DefaultOff", "DefaultBasic", "DefaultMax"}, new java.lang.annotation.Annotation[][]{null, null, null, null});
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer d() {
        return _init_$_anonymous_();
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blockinglevel.api.TripletTowersAcsVariant valueOf(java.lang.String str) {
        return (com.truecaller.blockinglevel.api.TripletTowersAcsVariant) java.lang.Enum.valueOf(com.truecaller.blockinglevel.api.TripletTowersAcsVariant.class, str);
    }

    public static com.truecaller.blockinglevel.api.TripletTowersAcsVariant[] values() {
        return (com.truecaller.blockinglevel.api.TripletTowersAcsVariant[]) $VALUES.clone();
    }
}
