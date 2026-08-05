package com.truecaller.details_view.ui.numbers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/truecaller/details_view/ui/numbers/SimData;", "", "icon", "", "slot", "<init>", "(Ljava/lang/String;III)V", "getIcon", "()I", "getSlot", "SIM_1", "SIM_2", "SIM_UNKNOWN", "details-view_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class SimData {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.details_view.ui.numbers.SimData[] $VALUES;
    public static final com.truecaller.details_view.ui.numbers.SimData SIM_1 = new com.truecaller.details_view.ui.numbers.SimData("SIM_1", 0, 2131233350, 0);
    public static final com.truecaller.details_view.ui.numbers.SimData SIM_2 = new com.truecaller.details_view.ui.numbers.SimData("SIM_2", 1, 2131233352, 1);
    public static final com.truecaller.details_view.ui.numbers.SimData SIM_UNKNOWN = new com.truecaller.details_view.ui.numbers.SimData("SIM_UNKNOWN", 2, 2131233348, -1);
    private final int icon;
    private final int slot;

    private static final /* synthetic */ com.truecaller.details_view.ui.numbers.SimData[] $values() {
        return new com.truecaller.details_view.ui.numbers.SimData[]{SIM_1, SIM_2, SIM_UNKNOWN};
    }

    static {
        com.truecaller.details_view.ui.numbers.SimData[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private SimData(java.lang.String str, int i, int i2, int i3) {
        this.icon = i2;
        this.slot = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.details_view.ui.numbers.SimData valueOf(java.lang.String str) {
        return (com.truecaller.details_view.ui.numbers.SimData) java.lang.Enum.valueOf(com.truecaller.details_view.ui.numbers.SimData.class, str);
    }

    public static com.truecaller.details_view.ui.numbers.SimData[] values() {
        return (com.truecaller.details_view.ui.numbers.SimData[]) $VALUES.clone();
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getSlot() {
        return this.slot;
    }
}
