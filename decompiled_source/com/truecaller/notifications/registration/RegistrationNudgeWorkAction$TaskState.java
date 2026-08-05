package com.truecaller.notifications.registration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/truecaller/notifications/registration/RegistrationNudgeWorkAction$TaskState", "", "Lcom/truecaller/notifications/registration/RegistrationNudgeWorkAction$TaskState;", "", "interval", "", "title", "text", "<init>", "(Ljava/lang/String;IJII)V", "J", "getInterval", "()J", "I", "getTitle", "()I", "getText", "INIT", "FIRST", "SECOND", "THIRD", "DONE", "truecaller_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class RegistrationNudgeWorkAction$TaskState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[] $VALUES;
    private final long interval;
    private final int text;
    private final int title;
    public static final com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState INIT = new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState("INIT", 0, 0, 2132018124, 2132018123);
    public static final com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState FIRST = new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState("FIRST", 1, 3600, 2132018124, 2132018123);
    public static final com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState SECOND = new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState("SECOND", 2, 86400, 2132018126, 2132018125);
    public static final com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState THIRD = new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState("THIRD", 3, 604800, 2132018128, 2132018127);
    public static final com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState DONE = new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState("DONE", 4, -1, 2132018124, 2132018123);

    private static final /* synthetic */ com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[] $values() {
        return new com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[]{INIT, FIRST, SECOND, THIRD, DONE};
    }

    static {
        com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private RegistrationNudgeWorkAction$TaskState(java.lang.String str, int i, long j, int i2, int i3) {
        this.interval = j;
        this.title = i2;
        this.text = i3;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState valueOf(java.lang.String str) {
        return (com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState) java.lang.Enum.valueOf(com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState.class, str);
    }

    public static com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[] values() {
        return (com.truecaller.notifications.registration.RegistrationNudgeWorkAction$TaskState[]) $VALUES.clone();
    }

    public final long getInterval() {
        return this.interval;
    }

    public final int getText() {
        return this.text;
    }

    public final int getTitle() {
        return this.title;
    }
}
