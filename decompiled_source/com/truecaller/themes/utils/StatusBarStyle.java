package com.truecaller.themes.utils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/themes/utils/StatusBarStyle;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "LIGHT", "DARK", "themes_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class StatusBarStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.themes.utils.StatusBarStyle[] $VALUES;
    public static final com.truecaller.themes.utils.StatusBarStyle AUTO = new com.truecaller.themes.utils.StatusBarStyle("AUTO", 0);
    public static final com.truecaller.themes.utils.StatusBarStyle LIGHT = new com.truecaller.themes.utils.StatusBarStyle("LIGHT", 1);
    public static final com.truecaller.themes.utils.StatusBarStyle DARK = new com.truecaller.themes.utils.StatusBarStyle("DARK", 2);

    private static final /* synthetic */ com.truecaller.themes.utils.StatusBarStyle[] $values() {
        return new com.truecaller.themes.utils.StatusBarStyle[]{AUTO, LIGHT, DARK};
    }

    static {
        com.truecaller.themes.utils.StatusBarStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private StatusBarStyle(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.themes.utils.StatusBarStyle valueOf(java.lang.String str) {
        return (com.truecaller.themes.utils.StatusBarStyle) java.lang.Enum.valueOf(com.truecaller.themes.utils.StatusBarStyle.class, str);
    }

    public static com.truecaller.themes.utils.StatusBarStyle[] values() {
        return (com.truecaller.themes.utils.StatusBarStyle[]) $VALUES.clone();
    }
}
