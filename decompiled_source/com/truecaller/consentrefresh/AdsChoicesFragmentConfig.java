package com.truecaller.consentrefresh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/consentrefresh/AdsChoicesFragmentConfig;", "", "", com.ironsource.C0889d4.h.X, "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "c61/qux", "SETTINGS", "CONSENT_REFRESH", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes4.dex */
public final class AdsChoicesFragmentConfig {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.consentrefresh.AdsChoicesFragmentConfig[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final c61.qux Companion;
    private final int value;
    public static final com.truecaller.consentrefresh.AdsChoicesFragmentConfig SETTINGS = new com.truecaller.consentrefresh.AdsChoicesFragmentConfig("SETTINGS", 0, 1);
    public static final com.truecaller.consentrefresh.AdsChoicesFragmentConfig CONSENT_REFRESH = new com.truecaller.consentrefresh.AdsChoicesFragmentConfig("CONSENT_REFRESH", 1, 2);

    private static final /* synthetic */ com.truecaller.consentrefresh.AdsChoicesFragmentConfig[] $values() {
        return new com.truecaller.consentrefresh.AdsChoicesFragmentConfig[]{SETTINGS, CONSENT_REFRESH};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c61.qux, java.lang.Object] */
    static {
        com.truecaller.consentrefresh.AdsChoicesFragmentConfig[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private AdsChoicesFragmentConfig(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.consentrefresh.AdsChoicesFragmentConfig valueOf(java.lang.String str) {
        return (com.truecaller.consentrefresh.AdsChoicesFragmentConfig) java.lang.Enum.valueOf(com.truecaller.consentrefresh.AdsChoicesFragmentConfig.class, str);
    }

    public static com.truecaller.consentrefresh.AdsChoicesFragmentConfig[] values() {
        return (com.truecaller.consentrefresh.AdsChoicesFragmentConfig[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
