package com.truecaller.voicemail.presentation.tab.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/voicemail/presentation/tab/ui/VoicemailTabStatus;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "INACTIVE", "ACTIVE", "PENDING", "PAUSED", "presentation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.AD_SHOW_TO_VALIDATION_DURATION_MS_VALUE)
/* loaded from: /home/user/tc_decoded/classes7.dex */
public final class VoicemailTabStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[] $VALUES;
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus LOADING = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus("LOADING", 0);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus INACTIVE = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus("INACTIVE", 1);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus ACTIVE = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus("ACTIVE", 2);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus PENDING = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus("PENDING", 3);
    public static final com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus PAUSED = new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus("PAUSED", 4);

    private static final /* synthetic */ com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[] $values() {
        return new com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[]{LOADING, INACTIVE, ACTIVE, PENDING, PAUSED};
    }

    static {
        com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private VoicemailTabStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus valueOf(java.lang.String str) {
        return (com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus) java.lang.Enum.valueOf(com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus.class, str);
    }

    public static com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[] values() {
        return (com.truecaller.voicemail.presentation.tab.ui.VoicemailTabStatus[]) $VALUES.clone();
    }
}
