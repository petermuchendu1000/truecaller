package com.truecaller.settings.impl.ui.search;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/truecaller/settings/impl/ui/search/SettingCategory;", "", "<init>", "(Ljava/lang/String;I)V", "CALL", "BLOCK", "FAMILY_PROTECT", "ABOUT", "GENERAL", "PRIVACY", "PREMIUM", "MESSAGING", "WATCH", "CALL_ASSISTANT", "HELP", "VOICEMAIL", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class SettingCategory {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.settings.impl.ui.search.SettingCategory[] $VALUES;
    public static final com.truecaller.settings.impl.ui.search.SettingCategory CALL = new com.truecaller.settings.impl.ui.search.SettingCategory("CALL", 0);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory BLOCK = new com.truecaller.settings.impl.ui.search.SettingCategory("BLOCK", 1);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory FAMILY_PROTECT = new com.truecaller.settings.impl.ui.search.SettingCategory("FAMILY_PROTECT", 2);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory ABOUT = new com.truecaller.settings.impl.ui.search.SettingCategory("ABOUT", 3);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory GENERAL = new com.truecaller.settings.impl.ui.search.SettingCategory("GENERAL", 4);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory PRIVACY = new com.truecaller.settings.impl.ui.search.SettingCategory("PRIVACY", 5);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory PREMIUM = new com.truecaller.settings.impl.ui.search.SettingCategory("PREMIUM", 6);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory MESSAGING = new com.truecaller.settings.impl.ui.search.SettingCategory("MESSAGING", 7);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory WATCH = new com.truecaller.settings.impl.ui.search.SettingCategory("WATCH", 8);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory CALL_ASSISTANT = new com.truecaller.settings.impl.ui.search.SettingCategory("CALL_ASSISTANT", 9);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory HELP = new com.truecaller.settings.impl.ui.search.SettingCategory("HELP", 10);
    public static final com.truecaller.settings.impl.ui.search.SettingCategory VOICEMAIL = new com.truecaller.settings.impl.ui.search.SettingCategory("VOICEMAIL", 11);

    private static final /* synthetic */ com.truecaller.settings.impl.ui.search.SettingCategory[] $values() {
        return new com.truecaller.settings.impl.ui.search.SettingCategory[]{CALL, BLOCK, FAMILY_PROTECT, ABOUT, GENERAL, PRIVACY, PREMIUM, MESSAGING, WATCH, CALL_ASSISTANT, HELP, VOICEMAIL};
    }

    static {
        com.truecaller.settings.impl.ui.search.SettingCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SettingCategory(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.settings.impl.ui.search.SettingCategory valueOf(java.lang.String str) {
        return (com.truecaller.settings.impl.ui.search.SettingCategory) java.lang.Enum.valueOf(com.truecaller.settings.impl.ui.search.SettingCategory.class, str);
    }

    public static com.truecaller.settings.impl.ui.search.SettingCategory[] values() {
        return (com.truecaller.settings.impl.ui.search.SettingCategory[]) $VALUES.clone();
    }
}
