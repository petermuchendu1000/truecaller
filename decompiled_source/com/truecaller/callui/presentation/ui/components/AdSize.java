package com.truecaller.callui.presentation.ui.components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/callui/presentation/ui/components/AdSize;", "", "Lh5/c;", "height", "<init>", "(Ljava/lang/String;IF)V", "F", "getHeight-D9Ej5fM", "()F", "Companion", "my0/bar", "LARGE", "MEDIUM", "SMALL", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdSize {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.AdSize[] $VALUES;
    private static final float BOTTOM_PADDING;

    @org.jetbrains.annotations.NotNull
    public static final my0.bar Companion;
    public static final com.truecaller.callui.presentation.ui.components.AdSize LARGE = new com.truecaller.callui.presentation.ui.components.AdSize("LARGE", 0, 150);
    public static final com.truecaller.callui.presentation.ui.components.AdSize MEDIUM = new com.truecaller.callui.presentation.ui.components.AdSize("MEDIUM", 1, 100);
    public static final com.truecaller.callui.presentation.ui.components.AdSize SMALL = new com.truecaller.callui.presentation.ui.components.AdSize("SMALL", 2, 50);
    private static final float TOP_PADDING;
    private final float height;

    private static final /* synthetic */ com.truecaller.callui.presentation.ui.components.AdSize[] $values() {
        return new com.truecaller.callui.presentation.ui.components.AdSize[]{LARGE, MEDIUM, SMALL};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [my0.bar, java.lang.Object] */
    static {
        com.truecaller.callui.presentation.ui.components.AdSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
        TOP_PADDING = 24;
        BOTTOM_PADDING = 32;
    }

    private AdSize(java.lang.String str, int i, float f) {
        this.height = f;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.callui.presentation.ui.components.AdSize valueOf(java.lang.String str) {
        return (com.truecaller.callui.presentation.ui.components.AdSize) java.lang.Enum.valueOf(com.truecaller.callui.presentation.ui.components.AdSize.class, str);
    }

    public static com.truecaller.callui.presentation.ui.components.AdSize[] values() {
        return (com.truecaller.callui.presentation.ui.components.AdSize[]) $VALUES.clone();
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHeight() {
        return this.height;
    }
}
