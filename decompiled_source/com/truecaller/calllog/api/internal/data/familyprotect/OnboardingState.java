package com.truecaller.calllog.api.internal.data.familyprotect;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/calllog/api/internal/data/familyprotect/OnboardingState;", "", "<init>", "(Ljava/lang/String;I)V", "HIDDEN", "COLLAPSED", "EXPANDED", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class OnboardingState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[] $VALUES;
    public static final com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState HIDDEN = new com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState("HIDDEN", 0);
    public static final com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState COLLAPSED = new com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState("COLLAPSED", 1);
    public static final com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState EXPANDED = new com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState("EXPANDED", 2);

    private static final /* synthetic */ com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[] $values() {
        return new com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[]{HIDDEN, COLLAPSED, EXPANDED};
    }

    static {
        com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private OnboardingState(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState valueOf(java.lang.String str) {
        return (com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState) java.lang.Enum.valueOf(com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState.class, str);
    }

    public static com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[] values() {
        return (com.truecaller.calllog.api.internal.data.familyprotect.OnboardingState[]) $VALUES.clone();
    }
}
