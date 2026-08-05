package com.truecaller.adschoices;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/adschoices/Source;", "", "", "sourceName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSourceName", "()Ljava/lang/String;", "Companion", "yb0/u", "WizardScreen", "SettingsScreen", "PremiumInnerScreen", "Unknown", "adschoices_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class Source {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.adschoices.Source[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final yb0.u Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String sourceName;
    public static final com.truecaller.adschoices.Source WizardScreen = new com.truecaller.adschoices.Source("WizardScreen", 0, "wizard");
    public static final com.truecaller.adschoices.Source SettingsScreen = new com.truecaller.adschoices.Source("SettingsScreen", 1, "settings_screen");
    public static final com.truecaller.adschoices.Source PremiumInnerScreen = new com.truecaller.adschoices.Source("PremiumInnerScreen", 2, "featureInnerScreen");
    public static final com.truecaller.adschoices.Source Unknown = new com.truecaller.adschoices.Source("Unknown", 3, "Unknown");

    private static final /* synthetic */ com.truecaller.adschoices.Source[] $values() {
        return new com.truecaller.adschoices.Source[]{WizardScreen, SettingsScreen, PremiumInnerScreen, Unknown};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [yb0.u, java.lang.Object] */
    static {
        com.truecaller.adschoices.Source[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private Source(java.lang.String str, int i, java.lang.String str2) {
        this.sourceName = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.adschoices.Source valueOf(java.lang.String str) {
        return (com.truecaller.adschoices.Source) java.lang.Enum.valueOf(com.truecaller.adschoices.Source.class, str);
    }

    public static com.truecaller.adschoices.Source[] values() {
        return (com.truecaller.adschoices.Source[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSourceName() {
        return this.sourceName;
    }
}
