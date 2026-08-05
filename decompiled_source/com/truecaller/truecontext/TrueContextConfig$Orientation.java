package com.truecaller.truecontext;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/truecaller/truecontext/TrueContextConfig$Orientation", "", "Lcom/truecaller/truecontext/TrueContextConfig$Orientation;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Start", "Center", "truecontext_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class TrueContextConfig$Orientation {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.truecontext.TrueContextConfig$Orientation[] $VALUES;
    private final int value;
    public static final com.truecaller.truecontext.TrueContextConfig$Orientation Start = new com.truecaller.truecontext.TrueContextConfig$Orientation("Start", 0, 0);
    public static final com.truecaller.truecontext.TrueContextConfig$Orientation Center = new com.truecaller.truecontext.TrueContextConfig$Orientation("Center", 1, 1);

    private static final /* synthetic */ com.truecaller.truecontext.TrueContextConfig$Orientation[] $values() {
        return new com.truecaller.truecontext.TrueContextConfig$Orientation[]{Start, Center};
    }

    static {
        com.truecaller.truecontext.TrueContextConfig$Orientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private TrueContextConfig$Orientation(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.truecontext.TrueContextConfig$Orientation valueOf(java.lang.String str) {
        return (com.truecaller.truecontext.TrueContextConfig$Orientation) java.lang.Enum.valueOf(com.truecaller.truecontext.TrueContextConfig$Orientation.class, str);
    }

    public static com.truecaller.truecontext.TrueContextConfig$Orientation[] values() {
        return (com.truecaller.truecontext.TrueContextConfig$Orientation[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
