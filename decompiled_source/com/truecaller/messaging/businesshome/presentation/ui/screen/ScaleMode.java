package com.truecaller.messaging.businesshome.presentation.ui.screen;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/messaging/businesshome/presentation/ui/screen/ScaleMode;", "", "<init>", "(Ljava/lang/String;I)V", "Width", "Height", "MinSide", "MaxSide", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class ScaleMode {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[] $VALUES;
    public static final com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode Width = new com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode("Width", 0);
    public static final com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode Height = new com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode("Height", 1);
    public static final com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode MinSide = new com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode("MinSide", 2);
    public static final com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode MaxSide = new com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode("MaxSide", 3);

    private static final /* synthetic */ com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[] $values() {
        return new com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[]{Width, Height, MinSide, MaxSide};
    }

    static {
        com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ScaleMode(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode valueOf(java.lang.String str) {
        return (com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode) java.lang.Enum.valueOf(com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode.class, str);
    }

    public static com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[] values() {
        return (com.truecaller.messaging.businesshome.presentation.ui.screen.ScaleMode[]) $VALUES.clone();
    }
}
