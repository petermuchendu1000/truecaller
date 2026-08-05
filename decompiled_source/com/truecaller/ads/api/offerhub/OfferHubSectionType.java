package com.truecaller.ads.api.offerhub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ads/api/offerhub/OfferHubSectionType;", "", "", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "Companion", "e30/baz", "CAROUSEL", "GRID", "BANNER_LIST", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class OfferHubSectionType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.api.offerhub.OfferHubSectionType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final e30.baz Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String typeName;
    public static final com.truecaller.ads.api.offerhub.OfferHubSectionType CAROUSEL = new com.truecaller.ads.api.offerhub.OfferHubSectionType("CAROUSEL", 0, "carousel");
    public static final com.truecaller.ads.api.offerhub.OfferHubSectionType GRID = new com.truecaller.ads.api.offerhub.OfferHubSectionType("GRID", 1, "grid");
    public static final com.truecaller.ads.api.offerhub.OfferHubSectionType BANNER_LIST = new com.truecaller.ads.api.offerhub.OfferHubSectionType("BANNER_LIST", 2, "banner_list");

    private static final /* synthetic */ com.truecaller.ads.api.offerhub.OfferHubSectionType[] $values() {
        return new com.truecaller.ads.api.offerhub.OfferHubSectionType[]{CAROUSEL, GRID, BANNER_LIST};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [e30.baz, java.lang.Object] */
    static {
        com.truecaller.ads.api.offerhub.OfferHubSectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private OfferHubSectionType(java.lang.String str, int i, java.lang.String str2) {
        this.typeName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.api.offerhub.OfferHubSectionType valueOf(java.lang.String str) {
        return (com.truecaller.ads.api.offerhub.OfferHubSectionType) java.lang.Enum.valueOf(com.truecaller.ads.api.offerhub.OfferHubSectionType.class, str);
    }

    public static com.truecaller.ads.api.offerhub.OfferHubSectionType[] values() {
        return (com.truecaller.ads.api.offerhub.OfferHubSectionType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTypeName() {
        return this.typeName;
    }
}
