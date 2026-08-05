package com.truecaller.ads.calluiads.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/truecaller/ads/calluiads/ui/AdSize;", "", "Lh5/c;", "height", "<init>", "(Ljava/lang/String;IF)V", "F", "getHeight-D9Ej5fM", "()F", "LARGE", "MEDIUM", "SMALL", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.calluiads.ui.AdSize[] $VALUES;
    public static final com.truecaller.ads.calluiads.ui.AdSize LARGE = new com.truecaller.ads.calluiads.ui.AdSize("LARGE", 0, 150);
    public static final com.truecaller.ads.calluiads.ui.AdSize MEDIUM = new com.truecaller.ads.calluiads.ui.AdSize("MEDIUM", 1, 100);
    public static final com.truecaller.ads.calluiads.ui.AdSize SMALL = new com.truecaller.ads.calluiads.ui.AdSize("SMALL", 2, 50);
    private final float height;

    private static final /* synthetic */ com.truecaller.ads.calluiads.ui.AdSize[] $values() {
        return new com.truecaller.ads.calluiads.ui.AdSize[]{LARGE, MEDIUM, SMALL};
    }

    static {
        com.truecaller.ads.calluiads.ui.AdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdSize(java.lang.String str, int i, float f) {
        this.height = f;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.calluiads.ui.AdSize valueOf(java.lang.String str) {
        return (com.truecaller.ads.calluiads.ui.AdSize) java.lang.Enum.valueOf(com.truecaller.ads.calluiads.ui.AdSize.class, str);
    }

    public static com.truecaller.ads.calluiads.ui.AdSize[] values() {
        return (com.truecaller.ads.calluiads.ui.AdSize[]) $VALUES.clone();
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }
}
