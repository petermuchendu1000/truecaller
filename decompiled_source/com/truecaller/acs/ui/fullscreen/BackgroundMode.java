package com.truecaller.acs.ui.fullscreen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/acs/ui/fullscreen/BackgroundMode;", "", "<init>", "(Ljava/lang/String;I)V", "FULL_SCREEN_PROFILE_PICTURE", "FULL_SCREEN_VIDEO", "FULL_SCREEN_BACKGROUND", "NONE", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class BackgroundMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.ui.fullscreen.BackgroundMode[] $VALUES;
    public static final com.truecaller.acs.ui.fullscreen.BackgroundMode FULL_SCREEN_PROFILE_PICTURE = new com.truecaller.acs.ui.fullscreen.BackgroundMode("FULL_SCREEN_PROFILE_PICTURE", 0);
    public static final com.truecaller.acs.ui.fullscreen.BackgroundMode FULL_SCREEN_VIDEO = new com.truecaller.acs.ui.fullscreen.BackgroundMode("FULL_SCREEN_VIDEO", 1);
    public static final com.truecaller.acs.ui.fullscreen.BackgroundMode FULL_SCREEN_BACKGROUND = new com.truecaller.acs.ui.fullscreen.BackgroundMode("FULL_SCREEN_BACKGROUND", 2);
    public static final com.truecaller.acs.ui.fullscreen.BackgroundMode NONE = new com.truecaller.acs.ui.fullscreen.BackgroundMode("NONE", 3);

    private static final /* synthetic */ com.truecaller.acs.ui.fullscreen.BackgroundMode[] $values() {
        return new com.truecaller.acs.ui.fullscreen.BackgroundMode[]{FULL_SCREEN_PROFILE_PICTURE, FULL_SCREEN_VIDEO, FULL_SCREEN_BACKGROUND, NONE};
    }

    static {
        com.truecaller.acs.ui.fullscreen.BackgroundMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private BackgroundMode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.ui.fullscreen.BackgroundMode valueOf(java.lang.String str) {
        return (com.truecaller.acs.ui.fullscreen.BackgroundMode) java.lang.Enum.valueOf(com.truecaller.acs.ui.fullscreen.BackgroundMode.class, str);
    }

    public static com.truecaller.acs.ui.fullscreen.BackgroundMode[] values() {
        return (com.truecaller.acs.ui.fullscreen.BackgroundMode[]) $VALUES.clone();
    }
}
