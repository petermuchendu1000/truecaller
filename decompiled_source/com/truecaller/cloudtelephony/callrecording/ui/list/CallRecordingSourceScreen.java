package com.truecaller.cloudtelephony.callrecording.ui.list;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/ui/list/CallRecordingSourceScreen;", "", "<init>", "(Ljava/lang/String;I)V", "MAIN_SCREEN", "PROFILE", "PREMIUM", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingSourceScreen {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[] $VALUES;
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen MAIN_SCREEN = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen("MAIN_SCREEN", 0);
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen PROFILE = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen("PROFILE", 1);
    public static final com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen PREMIUM = new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen("PREMIUM", 2);

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[]{MAIN_SCREEN, PROFILE, PREMIUM};
    }

    static {
        com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallRecordingSourceScreen(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[] values() {
        return (com.truecaller.cloudtelephony.callrecording.ui.list.CallRecordingSourceScreen[]) $VALUES.clone();
    }
}
