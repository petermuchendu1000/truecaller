package com.truecaller.videocallerid.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/videocallerid/data/VideoType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "f23/b", "PredefinedVideo", "SelfieVideo", "None", "SpamVideo", "video-caller-id_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VideoType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.videocallerid.data.VideoType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final f23.b Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.videocallerid.data.VideoType PredefinedVideo = new com.truecaller.videocallerid.data.VideoType("PredefinedVideo", 0, "predefined");
    public static final com.truecaller.videocallerid.data.VideoType SelfieVideo = new com.truecaller.videocallerid.data.VideoType("SelfieVideo", 1, "selfie");
    public static final com.truecaller.videocallerid.data.VideoType None = new com.truecaller.videocallerid.data.VideoType("None", 2, "none");
    public static final com.truecaller.videocallerid.data.VideoType SpamVideo = new com.truecaller.videocallerid.data.VideoType("SpamVideo", 3, "spam");

    private static final /* synthetic */ com.truecaller.videocallerid.data.VideoType[] $values() {
        return new com.truecaller.videocallerid.data.VideoType[]{PredefinedVideo, SelfieVideo, None, SpamVideo};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, f23.b] */
    static {
        com.truecaller.videocallerid.data.VideoType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private VideoType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.videocallerid.data.VideoType fromString(@org.jetbrains.annotations.NotNull java.lang.String str) {
        Companion.getClass();
        return f23.b.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.videocallerid.data.VideoType valueOf(java.lang.String str) {
        return (com.truecaller.videocallerid.data.VideoType) java.lang.Enum.valueOf(com.truecaller.videocallerid.data.VideoType.class, str);
    }

    public static com.truecaller.videocallerid.data.VideoType[] values() {
        return (com.truecaller.videocallerid.data.VideoType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
