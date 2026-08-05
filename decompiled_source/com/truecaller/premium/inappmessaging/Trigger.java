package com.truecaller.premium.inappmessaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/truecaller/premium/inappmessaging/Trigger;", "", "<init>", "(Ljava/lang/String;I)V", "LAUNCH", "CLICK", "SUCCESS", "FAILURE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Trigger {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.inappmessaging.Trigger[] $VALUES;
    public static final com.truecaller.premium.inappmessaging.Trigger LAUNCH = new com.truecaller.premium.inappmessaging.Trigger("LAUNCH", 0);
    public static final com.truecaller.premium.inappmessaging.Trigger CLICK = new com.truecaller.premium.inappmessaging.Trigger("CLICK", 1);
    public static final com.truecaller.premium.inappmessaging.Trigger SUCCESS = new com.truecaller.premium.inappmessaging.Trigger("SUCCESS", 2);
    public static final com.truecaller.premium.inappmessaging.Trigger FAILURE = new com.truecaller.premium.inappmessaging.Trigger("FAILURE", 3);

    private static final /* synthetic */ com.truecaller.premium.inappmessaging.Trigger[] $values() {
        return new com.truecaller.premium.inappmessaging.Trigger[]{LAUNCH, CLICK, SUCCESS, FAILURE};
    }

    static {
        com.truecaller.premium.inappmessaging.Trigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Trigger(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.inappmessaging.Trigger valueOf(java.lang.String str) {
        return (com.truecaller.premium.inappmessaging.Trigger) java.lang.Enum.valueOf(com.truecaller.premium.inappmessaging.Trigger.class, str);
    }

    public static com.truecaller.premium.inappmessaging.Trigger[] values() {
        return (com.truecaller.premium.inappmessaging.Trigger[]) $VALUES.clone();
    }
}
