package com.truecaller.common.ui.insets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/common/ui/insets/InsetType;", "", "<init>", "(Ljava/lang/String;I)V", "StatusBar", "NavigationBar", "SystemBars", "Ime", "common-ui_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.LOWPOWERMODE_FIELD_NUMBER)
/* loaded from: /home/user/tc_decoded/classes2.dex */
public final class InsetType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.common.ui.insets.InsetType[] $VALUES;
    public static final com.truecaller.common.ui.insets.InsetType StatusBar = new com.truecaller.common.ui.insets.InsetType("StatusBar", 0);
    public static final com.truecaller.common.ui.insets.InsetType NavigationBar = new com.truecaller.common.ui.insets.InsetType("NavigationBar", 1);
    public static final com.truecaller.common.ui.insets.InsetType SystemBars = new com.truecaller.common.ui.insets.InsetType("SystemBars", 2);
    public static final com.truecaller.common.ui.insets.InsetType Ime = new com.truecaller.common.ui.insets.InsetType("Ime", 3);

    private static final /* synthetic */ com.truecaller.common.ui.insets.InsetType[] $values() {
        return new com.truecaller.common.ui.insets.InsetType[]{StatusBar, NavigationBar, SystemBars, Ime};
    }

    static {
        com.truecaller.common.ui.insets.InsetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private InsetType(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.common.ui.insets.InsetType valueOf(java.lang.String str) {
        return (com.truecaller.common.ui.insets.InsetType) java.lang.Enum.valueOf(com.truecaller.common.ui.insets.InsetType.class, str);
    }

    public static com.truecaller.common.ui.insets.InsetType[] values() {
        return (com.truecaller.common.ui.insets.InsetType[]) $VALUES.clone();
    }
}
