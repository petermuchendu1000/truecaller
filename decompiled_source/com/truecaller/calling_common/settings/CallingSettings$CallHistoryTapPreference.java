package com.truecaller.calling_common.settings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/truecaller/calling_common/settings/CallingSettings$CallHistoryTapPreference", "", "Lcom/truecaller/calling_common/settings/CallingSettings$CallHistoryTapPreference;", "<init>", "(Ljava/lang/String;I)V", "TapOnCallHistoryToCall", "TapOnCallButtonToCall", "calling-common_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallingSettings$CallHistoryTapPreference {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[] $VALUES;
    public static final com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference TapOnCallHistoryToCall = new com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference("TapOnCallHistoryToCall", 0);
    public static final com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference TapOnCallButtonToCall = new com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference("TapOnCallButtonToCall", 1);

    private static final /* synthetic */ com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[] $values() {
        return new com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[]{TapOnCallHistoryToCall, TapOnCallButtonToCall};
    }

    static {
        com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallingSettings$CallHistoryTapPreference(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference valueOf(java.lang.String str) {
        return (com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference) java.lang.Enum.valueOf(com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference.class, str);
    }

    public static com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[] values() {
        return (com.truecaller.calling_common.settings.CallingSettings$CallHistoryTapPreference[]) $VALUES.clone();
    }
}
