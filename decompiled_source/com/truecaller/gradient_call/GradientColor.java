package com.truecaller.gradient_call;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/truecaller/gradient_call/GradientColor;", "", "colorsRes", "", "position", "", "<init>", "(Ljava/lang/String;II[F)V", "getColorsRes", "()I", "getPosition", "()[F", "GOLD", "SPAM", "PRIORITY", "VERIFIED_BUSINESS", "IDENTIFIED", "SMALL_BUSINESS", "FULL_SCREEN_PROFILE_PICTURE", "gradient-call_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GradientColor {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.gradient_call.GradientColor[] $VALUES;
    private final int colorsRes;

    @org.jetbrains.annotations.Nullable
    private final float[] position;
    public static final com.truecaller.gradient_call.GradientColor GOLD = new com.truecaller.gradient_call.GradientColor("GOLD", 0, 2130903052, new float[]{0.0f, 0.18f, 0.35f, 1.0f});
    public static final com.truecaller.gradient_call.GradientColor SPAM = new com.truecaller.gradient_call.GradientColor("SPAM", 1, 2130903056, null, 2, null);
    public static final com.truecaller.gradient_call.GradientColor PRIORITY = new com.truecaller.gradient_call.GradientColor("PRIORITY", 2, 2130903054, null, 2, null);
    public static final com.truecaller.gradient_call.GradientColor VERIFIED_BUSINESS = new com.truecaller.gradient_call.GradientColor("VERIFIED_BUSINESS", 3, 2130903057, null, 2, null);
    public static final com.truecaller.gradient_call.GradientColor IDENTIFIED = new com.truecaller.gradient_call.GradientColor("IDENTIFIED", 4, 2130903053, null);
    public static final com.truecaller.gradient_call.GradientColor SMALL_BUSINESS = new com.truecaller.gradient_call.GradientColor("SMALL_BUSINESS", 5, 2130903055, null, 2, null);
    public static final com.truecaller.gradient_call.GradientColor FULL_SCREEN_PROFILE_PICTURE = new com.truecaller.gradient_call.GradientColor("FULL_SCREEN_PROFILE_PICTURE", 6, 2130903071, new float[]{0.0f, 0.49f, 1.0f});

    private static final /* synthetic */ com.truecaller.gradient_call.GradientColor[] $values() {
        return new com.truecaller.gradient_call.GradientColor[]{GOLD, SPAM, PRIORITY, VERIFIED_BUSINESS, IDENTIFIED, SMALL_BUSINESS, FULL_SCREEN_PROFILE_PICTURE};
    }

    static {
        com.truecaller.gradient_call.GradientColor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private GradientColor(java.lang.String str, int i, int i2, float[] fArr) {
        this.colorsRes = i2;
        this.position = fArr;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.gradient_call.GradientColor valueOf(java.lang.String str) {
        return (com.truecaller.gradient_call.GradientColor) java.lang.Enum.valueOf(com.truecaller.gradient_call.GradientColor.class, str);
    }

    public static com.truecaller.gradient_call.GradientColor[] values() {
        return (com.truecaller.gradient_call.GradientColor[]) $VALUES.clone();
    }

    public final int getColorsRes() {
        return this.colorsRes;
    }

    @org.jetbrains.annotations.Nullable
    public final float[] getPosition() {
        return this.position;
    }

    public /* synthetic */ GradientColor(java.lang.String str, int i, int i2, float[] fArr, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? rq1.e.a : fArr);
    }
}
