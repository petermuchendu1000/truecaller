package com.truecaller.acs.ui.popup.footersection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BE\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"Lcom/truecaller/acs/ui/popup/footersection/ReminderOption;", "", "titleRes", "", "confirmationRes", "icon", "delay", "", "unit", "Ljava/util/concurrent/TimeUnit;", "hour", "<init>", "(Ljava/lang/String;IIILjava/lang/Integer;JLjava/util/concurrent/TimeUnit;Ljava/lang/Integer;)V", "getTitleRes", "()I", "getConfirmationRes", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDelay", "()J", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "getHour", "IN_30_MINS", "IN_1_HOUR", "IN_3_HOURS", "AT_5_PM", "AT_17_00", "AT_9_AM_TOMORROW", "AT_09_00_TOMORROW", "SNOOZE", "DISMISS", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class ReminderOption {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.ui.popup.footersection.ReminderOption[] $VALUES;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption AT_09_00_TOMORROW;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption AT_17_00;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption AT_5_PM;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption AT_9_AM_TOMORROW;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption DISMISS;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption IN_1_HOUR;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption IN_30_MINS = new com.truecaller.acs.ui.popup.footersection.ReminderOption("IN_30_MINS", 0, 2132019370, 2132019361, null, 30, java.util.concurrent.TimeUnit.MINUTES, null, 36, null);
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption IN_3_HOURS;
    public static final com.truecaller.acs.ui.popup.footersection.ReminderOption SNOOZE;
    private final int confirmationRes;
    private final long delay;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer hour;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer icon;
    private final int titleRes;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.TimeUnit unit;

    private static final /* synthetic */ com.truecaller.acs.ui.popup.footersection.ReminderOption[] $values() {
        return new com.truecaller.acs.ui.popup.footersection.ReminderOption[]{IN_30_MINS, IN_1_HOUR, IN_3_HOURS, AT_5_PM, AT_17_00, AT_9_AM_TOMORROW, AT_09_00_TOMORROW, SNOOZE, DISMISS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        IN_1_HOUR = new com.truecaller.acs.ui.popup.footersection.ReminderOption("IN_1_HOUR", 1, 2132019369, 2132019360, null, 1L, timeUnit, null, 36, null);
        IN_3_HOURS = new com.truecaller.acs.ui.popup.footersection.ReminderOption("IN_3_HOURS", 2, 2132019371, 2132019362, null, 3L, timeUnit, null, 36, null);
        int i = 17;
        AT_5_PM = new com.truecaller.acs.ui.popup.footersection.ReminderOption("AT_5_PM", 3, 2132019372, 2132019363, null, 0L, null, i, 28, null);
        AT_17_00 = new com.truecaller.acs.ui.popup.footersection.ReminderOption("AT_17_00", 4, 2132019368, 2132019359, null, 0L, null, i, 28, null);
        int i2 = 9;
        AT_9_AM_TOMORROW = new com.truecaller.acs.ui.popup.footersection.ReminderOption("AT_9_AM_TOMORROW", 5, 2132019373, 2132019364, null, 0L, null, i2, 28, null);
        AT_09_00_TOMORROW = new com.truecaller.acs.ui.popup.footersection.ReminderOption("AT_09_00_TOMORROW", 6, 2132019367, 2132019358, null, 0L, null, i2, 28, null);
        SNOOZE = new com.truecaller.acs.ui.popup.footersection.ReminderOption("SNOOZE", 7, 2132019355, 2132019360, 2131232914, 1L, timeUnit, null, 32, null);
        DISMISS = new com.truecaller.acs.ui.popup.footersection.ReminderOption("DISMISS", 8, 2132019354, 2132019365, 2131232913, 0L, null == true ? 1 : 0, null, 56, null);
        com.truecaller.acs.ui.popup.footersection.ReminderOption[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private ReminderOption(java.lang.String str, int i, int i2, int i3, java.lang.Integer num, long j, java.util.concurrent.TimeUnit timeUnit, java.lang.Integer num2) {
        this.titleRes = i2;
        this.confirmationRes = i3;
        this.icon = num;
        this.delay = j;
        this.unit = timeUnit;
        this.hour = num2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.ui.popup.footersection.ReminderOption valueOf(java.lang.String str) {
        return (com.truecaller.acs.ui.popup.footersection.ReminderOption) java.lang.Enum.valueOf(com.truecaller.acs.ui.popup.footersection.ReminderOption.class, str);
    }

    public static com.truecaller.acs.ui.popup.footersection.ReminderOption[] values() {
        return (com.truecaller.acs.ui.popup.footersection.ReminderOption[]) $VALUES.clone();
    }

    public final int getConfirmationRes() {
        return this.confirmationRes;
    }

    public final long getDelay() {
        return this.delay;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getHour() {
        return this.hour;
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIcon() {
        return this.icon;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.TimeUnit getUnit() {
        return this.unit;
    }

    public /* synthetic */ ReminderOption(java.lang.String str, int i, int i2, int i3, java.lang.Integer num, long j, java.util.concurrent.TimeUnit timeUnit, java.lang.Integer num2, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? java.util.concurrent.TimeUnit.HOURS : timeUnit, (i4 & 32) != 0 ? null : num2);
    }
}
