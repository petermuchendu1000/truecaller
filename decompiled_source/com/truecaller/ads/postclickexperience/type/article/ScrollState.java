package com.truecaller.ads.postclickexperience.type.article;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/postclickexperience/type/article/ScrollState;", "", "progress", "", "<init>", "(Ljava/lang/String;II)V", "getProgress", "()I", "SCROLL_25", "SCROLL_50", "SCROLL_75", "SCROLL_100", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ScrollState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.postclickexperience.type.article.ScrollState[] $VALUES;
    private final int progress;
    public static final com.truecaller.ads.postclickexperience.type.article.ScrollState SCROLL_25 = new com.truecaller.ads.postclickexperience.type.article.ScrollState("SCROLL_25", 0, 25);
    public static final com.truecaller.ads.postclickexperience.type.article.ScrollState SCROLL_50 = new com.truecaller.ads.postclickexperience.type.article.ScrollState("SCROLL_50", 1, 50);
    public static final com.truecaller.ads.postclickexperience.type.article.ScrollState SCROLL_75 = new com.truecaller.ads.postclickexperience.type.article.ScrollState("SCROLL_75", 2, 75);
    public static final com.truecaller.ads.postclickexperience.type.article.ScrollState SCROLL_100 = new com.truecaller.ads.postclickexperience.type.article.ScrollState("SCROLL_100", 3, 100);

    private static final /* synthetic */ com.truecaller.ads.postclickexperience.type.article.ScrollState[] $values() {
        return new com.truecaller.ads.postclickexperience.type.article.ScrollState[]{SCROLL_25, SCROLL_50, SCROLL_75, SCROLL_100};
    }

    static {
        com.truecaller.ads.postclickexperience.type.article.ScrollState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScrollState(java.lang.String str, int i, int i2) {
        this.progress = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.postclickexperience.type.article.ScrollState valueOf(java.lang.String str) {
        return (com.truecaller.ads.postclickexperience.type.article.ScrollState) java.lang.Enum.valueOf(com.truecaller.ads.postclickexperience.type.article.ScrollState.class, str);
    }

    public static com.truecaller.ads.postclickexperience.type.article.ScrollState[] values() {
        return (com.truecaller.ads.postclickexperience.type.article.ScrollState[]) $VALUES.clone();
    }

    public final int getProgress() {
        return this.progress;
    }
}
