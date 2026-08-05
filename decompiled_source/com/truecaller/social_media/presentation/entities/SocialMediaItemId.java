package com.truecaller.social_media.presentation.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/truecaller/social_media/presentation/entities/SocialMediaItemId;", "", "<init>", "(Ljava/lang/String;I)V", "TWITTER", "FACEBOOK", "INSTAGRAM", "YOUTUBE", "TIKTOK", "TRUECALLER_BLOG", "social-media_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SocialMediaItemId {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.social_media.presentation.entities.SocialMediaItemId[] $VALUES;
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId TWITTER = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("TWITTER", 0);
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId FACEBOOK = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("FACEBOOK", 1);
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId INSTAGRAM = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("INSTAGRAM", 2);
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId YOUTUBE = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("YOUTUBE", 3);
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId TIKTOK = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("TIKTOK", 4);
    public static final com.truecaller.social_media.presentation.entities.SocialMediaItemId TRUECALLER_BLOG = new com.truecaller.social_media.presentation.entities.SocialMediaItemId("TRUECALLER_BLOG", 5);

    private static final /* synthetic */ com.truecaller.social_media.presentation.entities.SocialMediaItemId[] $values() {
        return new com.truecaller.social_media.presentation.entities.SocialMediaItemId[]{TWITTER, FACEBOOK, INSTAGRAM, YOUTUBE, TIKTOK, TRUECALLER_BLOG};
    }

    static {
        com.truecaller.social_media.presentation.entities.SocialMediaItemId[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SocialMediaItemId(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.social_media.presentation.entities.SocialMediaItemId valueOf(java.lang.String str) {
        return (com.truecaller.social_media.presentation.entities.SocialMediaItemId) java.lang.Enum.valueOf(com.truecaller.social_media.presentation.entities.SocialMediaItemId.class, str);
    }

    public static com.truecaller.social_media.presentation.entities.SocialMediaItemId[] values() {
        return (com.truecaller.social_media.presentation.entities.SocialMediaItemId[]) $VALUES.clone();
    }
}
