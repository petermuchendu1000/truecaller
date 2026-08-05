package com.truecaller.ads.postclickexperience.type;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/postclickexperience/type/PostClickExperienceType;", "", "<init>", "(Ljava/lang/String;I)V", "OFFLINE_LEADGEN", "ONLINE_LEADGEN", "OFFLINE_ARTICLE_PAGE", "ONLINE_ARTICLE_PAGE", "ONLINE_HTML_PAGE", "ONLINE_NATIVE_PORTRAIT_VIDEO", "ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class PostClickExperienceType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.postclickexperience.type.PostClickExperienceType[] $VALUES;
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType OFFLINE_LEADGEN = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("OFFLINE_LEADGEN", 0);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType ONLINE_LEADGEN = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("ONLINE_LEADGEN", 1);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType OFFLINE_ARTICLE_PAGE = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("OFFLINE_ARTICLE_PAGE", 2);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType ONLINE_ARTICLE_PAGE = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("ONLINE_ARTICLE_PAGE", 3);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType ONLINE_HTML_PAGE = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("ONLINE_HTML_PAGE", 4);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType ONLINE_NATIVE_PORTRAIT_VIDEO = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("ONLINE_NATIVE_PORTRAIT_VIDEO", 5);
    public static final com.truecaller.ads.postclickexperience.type.PostClickExperienceType ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE = new com.truecaller.ads.postclickexperience.type.PostClickExperienceType("ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE", 6);

    private static final /* synthetic */ com.truecaller.ads.postclickexperience.type.PostClickExperienceType[] $values() {
        return new com.truecaller.ads.postclickexperience.type.PostClickExperienceType[]{OFFLINE_LEADGEN, ONLINE_LEADGEN, OFFLINE_ARTICLE_PAGE, ONLINE_ARTICLE_PAGE, ONLINE_HTML_PAGE, ONLINE_NATIVE_PORTRAIT_VIDEO, ONLINE_NATIVE_PORTRAIT_VIDEO_WITH_IMAGE};
    }

    static {
        com.truecaller.ads.postclickexperience.type.PostClickExperienceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private PostClickExperienceType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.postclickexperience.type.PostClickExperienceType valueOf(java.lang.String str) {
        return (com.truecaller.ads.postclickexperience.type.PostClickExperienceType) java.lang.Enum.valueOf(com.truecaller.ads.postclickexperience.type.PostClickExperienceType.class, str);
    }

    public static com.truecaller.ads.postclickexperience.type.PostClickExperienceType[] values() {
        return (com.truecaller.ads.postclickexperience.type.PostClickExperienceType[]) $VALUES.clone();
    }
}
