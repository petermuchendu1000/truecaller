package com.truecaller.premium.ui.interstitial;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/premium/ui/interstitial/Interstitial$MediaType", "", "Lcom/truecaller/premium/ui/interstitial/Interstitial$MediaType;", "<init>", "(Ljava/lang/String;I)V", "ANIMATION", "VIDEO", "IMAGE", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Interstitial$MediaType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.ui.interstitial.Interstitial$MediaType[] $VALUES;
    public static final com.truecaller.premium.ui.interstitial.Interstitial$MediaType ANIMATION = new com.truecaller.premium.ui.interstitial.Interstitial$MediaType("ANIMATION", 0);
    public static final com.truecaller.premium.ui.interstitial.Interstitial$MediaType VIDEO = new com.truecaller.premium.ui.interstitial.Interstitial$MediaType("VIDEO", 1);
    public static final com.truecaller.premium.ui.interstitial.Interstitial$MediaType IMAGE = new com.truecaller.premium.ui.interstitial.Interstitial$MediaType("IMAGE", 2);

    private static final /* synthetic */ com.truecaller.premium.ui.interstitial.Interstitial$MediaType[] $values() {
        return new com.truecaller.premium.ui.interstitial.Interstitial$MediaType[]{ANIMATION, VIDEO, IMAGE};
    }

    static {
        com.truecaller.premium.ui.interstitial.Interstitial$MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Interstitial$MediaType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.ui.interstitial.Interstitial$MediaType valueOf(java.lang.String str) {
        return (com.truecaller.premium.ui.interstitial.Interstitial$MediaType) java.lang.Enum.valueOf(com.truecaller.premium.ui.interstitial.Interstitial$MediaType.class, str);
    }

    public static com.truecaller.premium.ui.interstitial.Interstitial$MediaType[] values() {
        return (com.truecaller.premium.ui.interstitial.Interstitial$MediaType[]) $VALUES.clone();
    }
}
