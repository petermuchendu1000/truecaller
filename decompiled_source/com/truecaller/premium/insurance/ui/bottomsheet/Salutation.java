package com.truecaller.premium.insurance.ui.bottomsheet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/premium/insurance/ui/bottomsheet/Salutation;", "", "stringRes", "", "<init>", "(Ljava/lang/String;II)V", "getStringRes", "()I", "MR", "MRS", "MS", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Salutation {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.insurance.ui.bottomsheet.Salutation[] $VALUES;
    public static final com.truecaller.premium.insurance.ui.bottomsheet.Salutation MR = new com.truecaller.premium.insurance.ui.bottomsheet.Salutation("MR", 0, 2132018869);
    public static final com.truecaller.premium.insurance.ui.bottomsheet.Salutation MRS = new com.truecaller.premium.insurance.ui.bottomsheet.Salutation("MRS", 1, 2132018870);
    public static final com.truecaller.premium.insurance.ui.bottomsheet.Salutation MS = new com.truecaller.premium.insurance.ui.bottomsheet.Salutation("MS", 2, 2132018871);
    private final int stringRes;

    private static final /* synthetic */ com.truecaller.premium.insurance.ui.bottomsheet.Salutation[] $values() {
        return new com.truecaller.premium.insurance.ui.bottomsheet.Salutation[]{MR, MRS, MS};
    }

    static {
        com.truecaller.premium.insurance.ui.bottomsheet.Salutation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Salutation(java.lang.String str, int i, int i2) {
        this.stringRes = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.insurance.ui.bottomsheet.Salutation valueOf(java.lang.String str) {
        return (com.truecaller.premium.insurance.ui.bottomsheet.Salutation) java.lang.Enum.valueOf(com.truecaller.premium.insurance.ui.bottomsheet.Salutation.class, str);
    }

    public static com.truecaller.premium.insurance.ui.bottomsheet.Salutation[] values() {
        return (com.truecaller.premium.insurance.ui.bottomsheet.Salutation[]) $VALUES.clone();
    }

    public final int getStringRes() {
        return this.stringRes;
    }
}
