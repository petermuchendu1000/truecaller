package com.truecaller.deeplink.cloudtelephony.voicemail;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/deeplink/cloudtelephony/voicemail/VoicemailSubView;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "y91/bar", "ONBOARDING", "ITEM_PREVIEW", "SETTINGS", "SETTINGS_CUSTOM_GREETING", "common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class VoicemailSubView {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final y91.bar Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView ONBOARDING = new com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView("ONBOARDING", 0, "onboarding");
    public static final com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView ITEM_PREVIEW = new com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView("ITEM_PREVIEW", 1, "item_preview");
    public static final com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView SETTINGS = new com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView("SETTINGS", 2, "settings");
    public static final com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView SETTINGS_CUSTOM_GREETING = new com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView("SETTINGS_CUSTOM_GREETING", 3, "settings_custom_greeting");

    private static final /* synthetic */ com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[] $values() {
        return new com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[]{ONBOARDING, ITEM_PREVIEW, SETTINGS, SETTINGS_CUSTOM_GREETING};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [y91.bar, java.lang.Object] */
    static {
        com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private VoicemailSubView(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView valueOf(java.lang.String str) {
        return (com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView) java.lang.Enum.valueOf(com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView.class, str);
    }

    public static com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[] values() {
        return (com.truecaller.deeplink.cloudtelephony.voicemail.VoicemailSubView[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
