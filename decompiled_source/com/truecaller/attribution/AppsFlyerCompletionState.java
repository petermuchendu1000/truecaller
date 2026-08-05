package com.truecaller.attribution;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/attribution/AppsFlyerCompletionState;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "PERMISSION_ASKED", "WIZARD_ONBOARDING_COMPLETED", "STARTUP_PREMIUM_SCREEN_SHOWN", "HOME_SCREEN_SHOWN", "attribution_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppsFlyerCompletionState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.attribution.AppsFlyerCompletionState[] $VALUES;
    public static final com.truecaller.attribution.AppsFlyerCompletionState NONE = new com.truecaller.attribution.AppsFlyerCompletionState("NONE", 0);
    public static final com.truecaller.attribution.AppsFlyerCompletionState PERMISSION_ASKED = new com.truecaller.attribution.AppsFlyerCompletionState("PERMISSION_ASKED", 1);
    public static final com.truecaller.attribution.AppsFlyerCompletionState WIZARD_ONBOARDING_COMPLETED = new com.truecaller.attribution.AppsFlyerCompletionState("WIZARD_ONBOARDING_COMPLETED", 2);
    public static final com.truecaller.attribution.AppsFlyerCompletionState STARTUP_PREMIUM_SCREEN_SHOWN = new com.truecaller.attribution.AppsFlyerCompletionState("STARTUP_PREMIUM_SCREEN_SHOWN", 3);
    public static final com.truecaller.attribution.AppsFlyerCompletionState HOME_SCREEN_SHOWN = new com.truecaller.attribution.AppsFlyerCompletionState("HOME_SCREEN_SHOWN", 4);

    private static final /* synthetic */ com.truecaller.attribution.AppsFlyerCompletionState[] $values() {
        return new com.truecaller.attribution.AppsFlyerCompletionState[]{NONE, PERMISSION_ASKED, WIZARD_ONBOARDING_COMPLETED, STARTUP_PREMIUM_SCREEN_SHOWN, HOME_SCREEN_SHOWN};
    }

    static {
        com.truecaller.attribution.AppsFlyerCompletionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AppsFlyerCompletionState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.attribution.AppsFlyerCompletionState valueOf(java.lang.String str) {
        return (com.truecaller.attribution.AppsFlyerCompletionState) java.lang.Enum.valueOf(com.truecaller.attribution.AppsFlyerCompletionState.class, str);
    }

    public static com.truecaller.attribution.AppsFlyerCompletionState[] values() {
        return (com.truecaller.attribution.AppsFlyerCompletionState[]) $VALUES.clone();
    }
}
