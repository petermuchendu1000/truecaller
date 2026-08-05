package com.truecaller.details_view.ui.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/details_view/ui/ads/OverlayAdSize;", "", "heightPx", "", "widthPx", "<init>", "(Ljava/lang/String;III)V", "getHeightPx", "()I", "getWidthPx", "LARGE", "NORMAL", "SMALL", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class OverlayAdSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.ui.ads.OverlayAdSize[] $VALUES;
    public static final com.truecaller.details_view.ui.ads.OverlayAdSize LARGE = new com.truecaller.details_view.ui.ads.OverlayAdSize("LARGE", 0, 1920, 1080);
    public static final com.truecaller.details_view.ui.ads.OverlayAdSize NORMAL = new com.truecaller.details_view.ui.ads.OverlayAdSize("NORMAL", 1, 1280, 720);
    public static final com.truecaller.details_view.ui.ads.OverlayAdSize SMALL = new com.truecaller.details_view.ui.ads.OverlayAdSize("SMALL", 2, 250, 320);
    private final int heightPx;
    private final int widthPx;

    private static final /* synthetic */ com.truecaller.details_view.ui.ads.OverlayAdSize[] $values() {
        return new com.truecaller.details_view.ui.ads.OverlayAdSize[]{LARGE, NORMAL, SMALL};
    }

    static {
        com.truecaller.details_view.ui.ads.OverlayAdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OverlayAdSize(java.lang.String str, int i, int i2, int i3) {
        this.heightPx = i2;
        this.widthPx = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.ui.ads.OverlayAdSize valueOf(java.lang.String str) {
        return (com.truecaller.details_view.ui.ads.OverlayAdSize) java.lang.Enum.valueOf(com.truecaller.details_view.ui.ads.OverlayAdSize.class, str);
    }

    public static com.truecaller.details_view.ui.ads.OverlayAdSize[] values() {
        return (com.truecaller.details_view.ui.ads.OverlayAdSize[]) $VALUES.clone();
    }

    public final int getHeightPx() {
        return this.heightPx;
    }

    public final int getWidthPx() {
        return this.widthPx;
    }
}
