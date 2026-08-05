package com.truecaller.dialpad_view.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/dialpad_view/data/DialpadState;", "", "scale", "", "colorAttr", "", "drawable", "<init>", "(Ljava/lang/String;IFII)V", "getScale", "()F", "getColorAttr", "()I", "getDrawable", "DIALPAD_DOWN", "NUMBER_ENTERED", "dialpad-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DialpadState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.dialpad_view.data.DialpadState[] $VALUES;
    public static final com.truecaller.dialpad_view.data.DialpadState DIALPAD_DOWN = new com.truecaller.dialpad_view.data.DialpadState("DIALPAD_DOWN", 0, 0.85f, 2130970634, 2131233660);
    public static final com.truecaller.dialpad_view.data.DialpadState NUMBER_ENTERED = new com.truecaller.dialpad_view.data.DialpadState("NUMBER_ENTERED", 1, 1.0f, 2130970569, 2131233348);
    private final int colorAttr;
    private final int drawable;
    private final float scale;

    private static final /* synthetic */ com.truecaller.dialpad_view.data.DialpadState[] $values() {
        return new com.truecaller.dialpad_view.data.DialpadState[]{DIALPAD_DOWN, NUMBER_ENTERED};
    }

    static {
        com.truecaller.dialpad_view.data.DialpadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DialpadState(java.lang.String str, int i, float f, int i2, int i3) {
        this.scale = f;
        this.colorAttr = i2;
        this.drawable = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.dialpad_view.data.DialpadState valueOf(java.lang.String str) {
        return (com.truecaller.dialpad_view.data.DialpadState) java.lang.Enum.valueOf(com.truecaller.dialpad_view.data.DialpadState.class, str);
    }

    public static com.truecaller.dialpad_view.data.DialpadState[] values() {
        return (com.truecaller.dialpad_view.data.DialpadState[]) $VALUES.clone();
    }

    public final int getColorAttr() {
        return this.colorAttr;
    }

    public final int getDrawable() {
        return this.drawable;
    }

    public final float getScale() {
        return this.scale;
    }
}
