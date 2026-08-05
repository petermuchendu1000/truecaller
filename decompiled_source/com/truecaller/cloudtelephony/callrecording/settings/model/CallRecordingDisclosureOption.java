package com.truecaller.cloudtelephony.callrecording.settings.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/truecaller/cloudtelephony/callrecording/settings/model/CallRecordingDisclosureOption;", "", "", "code", "title", "subtitle", "<init>", "(Ljava/lang/String;IIII)V", "I", "getCode", "()I", "getTitle", "getSubtitle", "Companion", "yz0/bar", "NONE", "BEEP", "INTRO", "callrecording_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallRecordingDisclosureOption {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final yz0.bar Companion;
    private final int code;
    private final int subtitle;
    private final int title;
    public static final com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption NONE = new com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption("NONE", 0, 0, 2132018953, 2132018952);
    public static final com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption BEEP = new com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption("BEEP", 1, 1, 2132018945, 2132018944);
    public static final com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption INTRO = new com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption("INTRO", 2, 2, 2132018957, 2132018956);

    private static final /* synthetic */ com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[] $values() {
        return new com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[]{NONE, BEEP, INTRO};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [yz0.bar, java.lang.Object] */
    static {
        com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private CallRecordingDisclosureOption(java.lang.String str, int i, int i2, int i3, int i4) {
        this.code = i2;
        this.title = i3;
        this.subtitle = i4;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption valueOf(java.lang.String str) {
        return (com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption) java.lang.Enum.valueOf(com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption.class, str);
    }

    public static com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[] values() {
        return (com.truecaller.cloudtelephony.callrecording.settings.model.CallRecordingDisclosureOption[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getTitle() {
        return this.title;
    }
}
