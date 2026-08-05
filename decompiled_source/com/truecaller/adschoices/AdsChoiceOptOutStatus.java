package com.truecaller.adschoices;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/adschoices/AdsChoiceOptOutStatus;", "", "<init>", "(Ljava/lang/String;I)V", "OPTED_OUT", "OPTED_IN", "UNKNOWN", "adschoices_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AdsChoiceOptOutStatus {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.adschoices.AdsChoiceOptOutStatus[] $VALUES;
    public static final com.truecaller.adschoices.AdsChoiceOptOutStatus OPTED_OUT = new com.truecaller.adschoices.AdsChoiceOptOutStatus("OPTED_OUT", 0);
    public static final com.truecaller.adschoices.AdsChoiceOptOutStatus OPTED_IN = new com.truecaller.adschoices.AdsChoiceOptOutStatus("OPTED_IN", 1);
    public static final com.truecaller.adschoices.AdsChoiceOptOutStatus UNKNOWN = new com.truecaller.adschoices.AdsChoiceOptOutStatus("UNKNOWN", 2);

    private static final /* synthetic */ com.truecaller.adschoices.AdsChoiceOptOutStatus[] $values() {
        return new com.truecaller.adschoices.AdsChoiceOptOutStatus[]{OPTED_OUT, OPTED_IN, UNKNOWN};
    }

    static {
        com.truecaller.adschoices.AdsChoiceOptOutStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AdsChoiceOptOutStatus(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.adschoices.AdsChoiceOptOutStatus valueOf(java.lang.String str) {
        return (com.truecaller.adschoices.AdsChoiceOptOutStatus) java.lang.Enum.valueOf(com.truecaller.adschoices.AdsChoiceOptOutStatus.class, str);
    }

    public static com.truecaller.adschoices.AdsChoiceOptOutStatus[] values() {
        return (com.truecaller.adschoices.AdsChoiceOptOutStatus[]) $VALUES.clone();
    }
}
