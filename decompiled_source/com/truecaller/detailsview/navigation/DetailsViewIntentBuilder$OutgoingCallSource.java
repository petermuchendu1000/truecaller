package com.truecaller.detailsview.navigation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/truecaller/detailsview/navigation/DetailsViewIntentBuilder$OutgoingCallSource", "", "Lcom/truecaller/detailsview/navigation/DetailsViewIntentBuilder$OutgoingCallSource;", "<init>", "(Ljava/lang/String;I)V", "CallLog", "Dialpad", "T9Search", "navigation_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DetailsViewIntentBuilder$OutgoingCallSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[] $VALUES;
    public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource CallLog = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource("CallLog", 0);
    public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource Dialpad = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource("Dialpad", 1);
    public static final com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource T9Search = new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource("T9Search", 2);

    private static final /* synthetic */ com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[] $values() {
        return new com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[]{CallLog, Dialpad, T9Search};
    }

    static {
        com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DetailsViewIntentBuilder$OutgoingCallSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource) java.lang.Enum.valueOf(com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource.class, str);
    }

    public static com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[] values() {
        return (com.truecaller.detailsview.navigation.DetailsViewIntentBuilder$OutgoingCallSource[]) $VALUES.clone();
    }
}
