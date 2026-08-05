package com.truecaller.scamfeed.domain.entities.feed;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/scamfeed/domain/entities/feed/ScamAnnouncementIcon;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "CELEBRATION", "TRANSLATE", "TIPS_AND_UPDATES", "AUTO_AWESOME", "FORUM", "NOTIFICATIONS_ACTIVE", "ANNOUNCEMENT", "ROCKET_LAUNCH", "PRIVACY_TIP", "PEOPLE", "EMOJI_PEOPLE", "TUNE", "INSERT_EMOTICON", "SECURITY", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ScamAnnouncementIcon {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[] $VALUES;
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon INFO = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("INFO", 0);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon CELEBRATION = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("CELEBRATION", 1);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon TRANSLATE = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("TRANSLATE", 2);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon TIPS_AND_UPDATES = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("TIPS_AND_UPDATES", 3);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon AUTO_AWESOME = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("AUTO_AWESOME", 4);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon FORUM = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("FORUM", 5);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon NOTIFICATIONS_ACTIVE = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("NOTIFICATIONS_ACTIVE", 6);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon ANNOUNCEMENT = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("ANNOUNCEMENT", 7);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon ROCKET_LAUNCH = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("ROCKET_LAUNCH", 8);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon PRIVACY_TIP = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("PRIVACY_TIP", 9);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon PEOPLE = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("PEOPLE", 10);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon EMOJI_PEOPLE = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("EMOJI_PEOPLE", 11);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon TUNE = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("TUNE", 12);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon INSERT_EMOTICON = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("INSERT_EMOTICON", 13);
    public static final com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon SECURITY = new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon("SECURITY", 14);

    private static final /* synthetic */ com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[] $values() {
        return new com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[]{INFO, CELEBRATION, TRANSLATE, TIPS_AND_UPDATES, AUTO_AWESOME, FORUM, NOTIFICATIONS_ACTIVE, ANNOUNCEMENT, ROCKET_LAUNCH, PRIVACY_TIP, PEOPLE, EMOJI_PEOPLE, TUNE, INSERT_EMOTICON, SECURITY};
    }

    static {
        com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScamAnnouncementIcon(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon valueOf(java.lang.String str) {
        return (com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon) java.lang.Enum.valueOf(com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon.class, str);
    }

    public static com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[] values() {
        return (com.truecaller.scamfeed.domain.entities.feed.ScamAnnouncementIcon[]) $VALUES.clone();
    }
}
