package com.truecaller.ads.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ads/mraid/MraidState;", "", "state", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getState", "()Ljava/lang/String;", "LOADING", "READY", "HIDDEN", "RESIZED", "EXPANDED", "DEFAULT", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MraidState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.mraid.MraidState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String state;
    public static final com.truecaller.ads.mraid.MraidState LOADING = new com.truecaller.ads.mraid.MraidState("LOADING", 0, "loading");
    public static final com.truecaller.ads.mraid.MraidState READY = new com.truecaller.ads.mraid.MraidState("READY", 1, "ready");
    public static final com.truecaller.ads.mraid.MraidState HIDDEN = new com.truecaller.ads.mraid.MraidState("HIDDEN", 2, "hidden");
    public static final com.truecaller.ads.mraid.MraidState RESIZED = new com.truecaller.ads.mraid.MraidState("RESIZED", 3, "resized");
    public static final com.truecaller.ads.mraid.MraidState EXPANDED = new com.truecaller.ads.mraid.MraidState("EXPANDED", 4, "expanded");
    public static final com.truecaller.ads.mraid.MraidState DEFAULT = new com.truecaller.ads.mraid.MraidState("DEFAULT", 5, "default");

    private static final /* synthetic */ com.truecaller.ads.mraid.MraidState[] $values() {
        return new com.truecaller.ads.mraid.MraidState[]{LOADING, READY, HIDDEN, RESIZED, EXPANDED, DEFAULT};
    }

    static {
        com.truecaller.ads.mraid.MraidState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MraidState(java.lang.String str, int i, java.lang.String str2) {
        this.state = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.mraid.MraidState valueOf(java.lang.String str) {
        return (com.truecaller.ads.mraid.MraidState) java.lang.Enum.valueOf(com.truecaller.ads.mraid.MraidState.class, str);
    }

    public static com.truecaller.ads.mraid.MraidState[] values() {
        return (com.truecaller.ads.mraid.MraidState[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getState() {
        return this.state;
    }
}
