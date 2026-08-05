package com.truecaller.ads.mraid;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/ads/mraid/MraidDialogRequestType;", "", "<init>", "(Ljava/lang/String;I)V", "LOCATION_SETTINGS", "CAMERA", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class MraidDialogRequestType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.mraid.MraidDialogRequestType[] $VALUES;
    public static final com.truecaller.ads.mraid.MraidDialogRequestType LOCATION_SETTINGS = new com.truecaller.ads.mraid.MraidDialogRequestType("LOCATION_SETTINGS", 0);
    public static final com.truecaller.ads.mraid.MraidDialogRequestType CAMERA = new com.truecaller.ads.mraid.MraidDialogRequestType("CAMERA", 1);

    private static final /* synthetic */ com.truecaller.ads.mraid.MraidDialogRequestType[] $values() {
        return new com.truecaller.ads.mraid.MraidDialogRequestType[]{LOCATION_SETTINGS, CAMERA};
    }

    static {
        com.truecaller.ads.mraid.MraidDialogRequestType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private MraidDialogRequestType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.mraid.MraidDialogRequestType valueOf(java.lang.String str) {
        return (com.truecaller.ads.mraid.MraidDialogRequestType) java.lang.Enum.valueOf(com.truecaller.ads.mraid.MraidDialogRequestType.class, str);
    }

    public static com.truecaller.ads.mraid.MraidDialogRequestType[] values() {
        return (com.truecaller.ads.mraid.MraidDialogRequestType[]) $VALUES.clone();
    }
}
