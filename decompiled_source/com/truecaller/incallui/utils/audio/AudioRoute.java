package com.truecaller.incallui.utils.audio;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/incallui/utils/audio/AudioRoute;", "", "<init>", "(Ljava/lang/String;I)V", "EARPIECE", "BLUETOOTH", "WIRED_HEADSET", "SPEAKER", "incallui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class AudioRoute {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.incallui.utils.audio.AudioRoute[] $VALUES;
    public static final com.truecaller.incallui.utils.audio.AudioRoute EARPIECE = new com.truecaller.incallui.utils.audio.AudioRoute("EARPIECE", 0);
    public static final com.truecaller.incallui.utils.audio.AudioRoute BLUETOOTH = new com.truecaller.incallui.utils.audio.AudioRoute("BLUETOOTH", 1);
    public static final com.truecaller.incallui.utils.audio.AudioRoute WIRED_HEADSET = new com.truecaller.incallui.utils.audio.AudioRoute("WIRED_HEADSET", 2);
    public static final com.truecaller.incallui.utils.audio.AudioRoute SPEAKER = new com.truecaller.incallui.utils.audio.AudioRoute("SPEAKER", 3);

    private static final /* synthetic */ com.truecaller.incallui.utils.audio.AudioRoute[] $values() {
        return new com.truecaller.incallui.utils.audio.AudioRoute[]{EARPIECE, BLUETOOTH, WIRED_HEADSET, SPEAKER};
    }

    static {
        com.truecaller.incallui.utils.audio.AudioRoute[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AudioRoute(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.incallui.utils.audio.AudioRoute valueOf(java.lang.String str) {
        return (com.truecaller.incallui.utils.audio.AudioRoute) java.lang.Enum.valueOf(com.truecaller.incallui.utils.audio.AudioRoute.class, str);
    }

    public static com.truecaller.incallui.utils.audio.AudioRoute[] values() {
        return (com.truecaller.incallui.utils.audio.AudioRoute[]) $VALUES.clone();
    }
}
