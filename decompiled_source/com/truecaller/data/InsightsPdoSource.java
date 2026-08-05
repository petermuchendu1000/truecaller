package com.truecaller.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/data/InsightsPdoSource;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "o81/e", "UNDETERMINED", "CLIENT", "BACKEND", "data_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsightsPdoSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.data.InsightsPdoSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final o81.e Companion;
    private final int value;
    public static final com.truecaller.data.InsightsPdoSource UNDETERMINED = new com.truecaller.data.InsightsPdoSource("UNDETERMINED", 0, 0);
    public static final com.truecaller.data.InsightsPdoSource CLIENT = new com.truecaller.data.InsightsPdoSource("CLIENT", 1, 1);
    public static final com.truecaller.data.InsightsPdoSource BACKEND = new com.truecaller.data.InsightsPdoSource("BACKEND", 2, 2);

    private static final /* synthetic */ com.truecaller.data.InsightsPdoSource[] $values() {
        return new com.truecaller.data.InsightsPdoSource[]{UNDETERMINED, CLIENT, BACKEND};
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [o81.e, java.lang.Object] */
    static {
        com.truecaller.data.InsightsPdoSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private InsightsPdoSource(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.data.InsightsPdoSource valueOf(java.lang.String str) {
        return (com.truecaller.data.InsightsPdoSource) java.lang.Enum.valueOf(com.truecaller.data.InsightsPdoSource.class, str);
    }

    public static com.truecaller.data.InsightsPdoSource[] values() {
        return (com.truecaller.data.InsightsPdoSource[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
