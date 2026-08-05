package com.truecaller.scamfeed.data.transport.posts.entities;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/scamfeed/data/transport/posts/entities/StatsTypeRemote;", "", "<init>", "(Ljava/lang/String;I)V", "USER_LEADERBOARD", "TOP_QUIZZES", "MOST_LIKED_POSTS", "WEEKLY_HIGHLIGHTS", "UNKNOWN", "scam-feed_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StatsTypeRemote {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[] $VALUES;
    public static final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote USER_LEADERBOARD = new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote("USER_LEADERBOARD", 0);
    public static final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote TOP_QUIZZES = new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote("TOP_QUIZZES", 1);
    public static final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote MOST_LIKED_POSTS = new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote("MOST_LIKED_POSTS", 2);
    public static final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote WEEKLY_HIGHLIGHTS = new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote("WEEKLY_HIGHLIGHTS", 3);
    public static final com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote UNKNOWN = new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote("UNKNOWN", 4);

    private static final /* synthetic */ com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[] $values() {
        return new com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[]{USER_LEADERBOARD, TOP_QUIZZES, MOST_LIKED_POSTS, WEEKLY_HIGHLIGHTS, UNKNOWN};
    }

    static {
        com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StatsTypeRemote(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote valueOf(java.lang.String str) {
        return (com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote) java.lang.Enum.valueOf(com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote.class, str);
    }

    public static com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[] values() {
        return (com.truecaller.scamfeed.data.transport.posts.entities.StatsTypeRemote[]) $VALUES.clone();
    }
}
