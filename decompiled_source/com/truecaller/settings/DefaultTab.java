package com.truecaller.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007j\u0002\b\u0004j\u0002\b\u0005¨\u0006\b"}, d2 = {"Lcom/truecaller/settings/DefaultTab;", "", "<init>", "(Ljava/lang/String;I)V", "CALLS", "MESSAGES", "toBottomBarButtonType", "Lcom/truecaller/bottombar/BottomBarButtonType;", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class DefaultTab {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.DefaultTab[] $VALUES;
    public static final com.truecaller.settings.DefaultTab CALLS = new com.truecaller.settings.DefaultTab("CALLS", 0);
    public static final com.truecaller.settings.DefaultTab MESSAGES = new com.truecaller.settings.DefaultTab("MESSAGES", 1);

    private static final /* synthetic */ com.truecaller.settings.DefaultTab[] $values() {
        return new com.truecaller.settings.DefaultTab[]{CALLS, MESSAGES};
    }

    static {
        com.truecaller.settings.DefaultTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DefaultTab(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.DefaultTab valueOf(java.lang.String str) {
        return (com.truecaller.settings.DefaultTab) java.lang.Enum.valueOf(com.truecaller.settings.DefaultTab.class, str);
    }

    public static com.truecaller.settings.DefaultTab[] values() {
        return (com.truecaller.settings.DefaultTab[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final com.truecaller.bottombar.BottomBarButtonType toBottomBarButtonType() {
        int i = jq2.baz.a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return com.truecaller.bottombar.BottomBarButtonType.MESSAGES;
            }
            throw new java.lang.RuntimeException();
        }
        return com.truecaller.bottombar.BottomBarButtonType.CALLS;
    }
}
