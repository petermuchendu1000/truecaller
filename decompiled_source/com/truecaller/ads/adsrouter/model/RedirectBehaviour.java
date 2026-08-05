package com.truecaller.ads.adsrouter.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/adsrouter/model/RedirectBehaviour;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IN_APP_WEB_VIEW", "IN_APP_BROWSER", "EXTERNAL_BROWSER", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class RedirectBehaviour {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.RedirectBehaviour[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    @bw.qux("InAppWebView")
    public static final com.truecaller.ads.adsrouter.model.RedirectBehaviour IN_APP_WEB_VIEW = new com.truecaller.ads.adsrouter.model.RedirectBehaviour("IN_APP_WEB_VIEW", 0, "InAppWebView");

    @bw.qux("InAppBrowser")
    public static final com.truecaller.ads.adsrouter.model.RedirectBehaviour IN_APP_BROWSER = new com.truecaller.ads.adsrouter.model.RedirectBehaviour("IN_APP_BROWSER", 1, "InAppBrowser");

    @bw.qux("ExternalBrowser")
    public static final com.truecaller.ads.adsrouter.model.RedirectBehaviour EXTERNAL_BROWSER = new com.truecaller.ads.adsrouter.model.RedirectBehaviour("EXTERNAL_BROWSER", 2, "ExternalBrowser");

    private static final /* synthetic */ com.truecaller.ads.adsrouter.model.RedirectBehaviour[] $values() {
        return new com.truecaller.ads.adsrouter.model.RedirectBehaviour[]{IN_APP_WEB_VIEW, IN_APP_BROWSER, EXTERNAL_BROWSER};
    }

    static {
        com.truecaller.ads.adsrouter.model.RedirectBehaviour[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RedirectBehaviour(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.adsrouter.model.RedirectBehaviour valueOf(java.lang.String str) {
        return (com.truecaller.ads.adsrouter.model.RedirectBehaviour) java.lang.Enum.valueOf(com.truecaller.ads.adsrouter.model.RedirectBehaviour.class, str);
    }

    public static com.truecaller.ads.adsrouter.model.RedirectBehaviour[] values() {
        return (com.truecaller.ads.adsrouter.model.RedirectBehaviour[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
