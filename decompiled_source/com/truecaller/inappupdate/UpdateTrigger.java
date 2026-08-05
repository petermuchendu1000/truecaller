package com.truecaller.inappupdate;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/inappupdate/UpdateTrigger;", "", "<init>", "(Ljava/lang/String;I)V", "AfterAppLaunch", "AfterACSDismiss", "forced-update_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class UpdateTrigger {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.inappupdate.UpdateTrigger[] $VALUES;
    public static final com.truecaller.inappupdate.UpdateTrigger AfterAppLaunch = new com.truecaller.inappupdate.UpdateTrigger("AfterAppLaunch", 0);
    public static final com.truecaller.inappupdate.UpdateTrigger AfterACSDismiss = new com.truecaller.inappupdate.UpdateTrigger("AfterACSDismiss", 1);

    private static final /* synthetic */ com.truecaller.inappupdate.UpdateTrigger[] $values() {
        return new com.truecaller.inappupdate.UpdateTrigger[]{AfterAppLaunch, AfterACSDismiss};
    }

    static {
        com.truecaller.inappupdate.UpdateTrigger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private UpdateTrigger(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.inappupdate.UpdateTrigger valueOf(java.lang.String str) {
        return (com.truecaller.inappupdate.UpdateTrigger) java.lang.Enum.valueOf(com.truecaller.inappupdate.UpdateTrigger.class, str);
    }

    public static com.truecaller.inappupdate.UpdateTrigger[] values() {
        return (com.truecaller.inappupdate.UpdateTrigger[]) $VALUES.clone();
    }
}
