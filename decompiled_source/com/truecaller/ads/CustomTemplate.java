package com.truecaller.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/ads/CustomTemplate;", "", "", "templateId", "", "openUrl", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Ljava/lang/String;", "Z", "Companion", "o00/u", "NATIVE_BANNER", "NATIVE_BANNER_DUAL_TRACKER", "MEGA_NATIVE_BANNER_DUAL_TRACKER", "CLICK_TO_PLAY_VIDEO", "VIDEO_WITH_FALLBACK_IMAGE", "NATIVE_CONTENT_DUAL_TRACKER", "ACS_PLUS_NATIVE_BANNER", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CustomTemplate {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.CustomTemplate[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final o00.u Companion;
    public final boolean openUrl;

    @org.jetbrains.annotations.NotNull
    public final java.lang.String templateId;
    public static final com.truecaller.ads.CustomTemplate NATIVE_BANNER = new com.truecaller.ads.CustomTemplate("NATIVE_BANNER", 0, "11726661", true);
    public static final com.truecaller.ads.CustomTemplate NATIVE_BANNER_DUAL_TRACKER = new com.truecaller.ads.CustomTemplate("NATIVE_BANNER_DUAL_TRACKER", 1, "11788491", true);
    public static final com.truecaller.ads.CustomTemplate MEGA_NATIVE_BANNER_DUAL_TRACKER = new com.truecaller.ads.CustomTemplate("MEGA_NATIVE_BANNER_DUAL_TRACKER", 2, "11976407", true);
    public static final com.truecaller.ads.CustomTemplate CLICK_TO_PLAY_VIDEO = new com.truecaller.ads.CustomTemplate("CLICK_TO_PLAY_VIDEO", 3, "11732026", false);
    public static final com.truecaller.ads.CustomTemplate VIDEO_WITH_FALLBACK_IMAGE = new com.truecaller.ads.CustomTemplate("VIDEO_WITH_FALLBACK_IMAGE", 4, "11777280", true);
    public static final com.truecaller.ads.CustomTemplate NATIVE_CONTENT_DUAL_TRACKER = new com.truecaller.ads.CustomTemplate("NATIVE_CONTENT_DUAL_TRACKER", 5, "11788194", true);
    public static final com.truecaller.ads.CustomTemplate ACS_PLUS_NATIVE_BANNER = new com.truecaller.ads.CustomTemplate("ACS_PLUS_NATIVE_BANNER", 6, "12370853", true);

    private static final /* synthetic */ com.truecaller.ads.CustomTemplate[] $values() {
        return new com.truecaller.ads.CustomTemplate[]{NATIVE_BANNER, NATIVE_BANNER_DUAL_TRACKER, MEGA_NATIVE_BANNER_DUAL_TRACKER, CLICK_TO_PLAY_VIDEO, VIDEO_WITH_FALLBACK_IMAGE, NATIVE_CONTENT_DUAL_TRACKER, ACS_PLUS_NATIVE_BANNER};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [o00.u, java.lang.Object] */
    static {
        com.truecaller.ads.CustomTemplate[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CustomTemplate(java.lang.String str, int i, java.lang.String str2, boolean z) {
        this.templateId = str2;
        this.openUrl = z;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.CustomTemplate valueOf(java.lang.String str) {
        return (com.truecaller.ads.CustomTemplate) java.lang.Enum.valueOf(com.truecaller.ads.CustomTemplate.class, str);
    }

    public static com.truecaller.ads.CustomTemplate[] values() {
        return (com.truecaller.ads.CustomTemplate[]) $VALUES.clone();
    }
}
