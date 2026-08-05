package com.truecaller.deactivation.impl.ui.intro;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/truecaller/deactivation/impl/ui/intro/DeactivationCheck;", "", "<init>", "(Ljava/lang/String;I)V", "CALLER_ID", "SPAM_PROTECTION", "TRUECALLER_ACCOUNT", "ASSISTANT", "VOICEMAIL", "impl_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class DeactivationCheck {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[] $VALUES;
    public static final com.truecaller.deactivation.impl.ui.intro.DeactivationCheck CALLER_ID = new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck("CALLER_ID", 0);
    public static final com.truecaller.deactivation.impl.ui.intro.DeactivationCheck SPAM_PROTECTION = new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck("SPAM_PROTECTION", 1);
    public static final com.truecaller.deactivation.impl.ui.intro.DeactivationCheck TRUECALLER_ACCOUNT = new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck("TRUECALLER_ACCOUNT", 2);
    public static final com.truecaller.deactivation.impl.ui.intro.DeactivationCheck ASSISTANT = new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck("ASSISTANT", 3);
    public static final com.truecaller.deactivation.impl.ui.intro.DeactivationCheck VOICEMAIL = new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck("VOICEMAIL", 4);

    private static final /* synthetic */ com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[] $values() {
        return new com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[]{CALLER_ID, SPAM_PROTECTION, TRUECALLER_ACCOUNT, ASSISTANT, VOICEMAIL};
    }

    static {
        com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private DeactivationCheck(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.deactivation.impl.ui.intro.DeactivationCheck valueOf(java.lang.String str) {
        return (com.truecaller.deactivation.impl.ui.intro.DeactivationCheck) java.lang.Enum.valueOf(com.truecaller.deactivation.impl.ui.intro.DeactivationCheck.class, str);
    }

    public static com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[] values() {
        return (com.truecaller.deactivation.impl.ui.intro.DeactivationCheck[]) $VALUES.clone();
    }
}
