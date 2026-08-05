package com.truecaller.voicemail.presentation.tab.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/voicemail/presentation/tab/ui/ExpandedMenu;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "MORE", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class ExpandedMenu {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[] $VALUES;
    public static final com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu NONE = new com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu("NONE", 0);
    public static final com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu MORE = new com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu("MORE", 1);

    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[] $values() {
        return new com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[]{NONE, MORE};
    }

    static {
        com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ExpandedMenu(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu) java.lang.Enum.valueOf(com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu.class, str);
    }

    public static com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[] values() {
        return (com.truecaller.voicemail.presentation.tab.ui.ExpandedMenu[]) $VALUES.clone();
    }
}
