package com.truecaller.acs.analytics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/truecaller/acs/analytics/AppAcsStateEvent$FamilyProtectReminderStats$Type", "", "Lcom/truecaller/acs/analytics/AppAcsStateEvent$FamilyProtectReminderStats$Type;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "InvitedByAdmin", "RemindMember", "Generic1", "Generic2", "Generic3", "acs_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class AppAcsStateEvent$FamilyProtectReminderStats$Type {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type InvitedByAdmin = new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type("InvitedByAdmin", 0, "InvitedByAdmin");
    public static final com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type RemindMember = new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type("RemindMember", 1, "RemindMember");
    public static final com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type Generic1 = new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type("Generic1", 2, "Generic1");
    public static final com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type Generic2 = new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type("Generic2", 3, "Generic2");
    public static final com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type Generic3 = new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type("Generic3", 4, "Generic3");

    private static final /* synthetic */ com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[] $values() {
        return new com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[]{InvitedByAdmin, RemindMember, Generic1, Generic2, Generic3};
    }

    static {
        com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private AppAcsStateEvent$FamilyProtectReminderStats$Type(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type valueOf(java.lang.String str) {
        return (com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type) java.lang.Enum.valueOf(com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type.class, str);
    }

    public static com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[] values() {
        return (com.truecaller.acs.analytics.AppAcsStateEvent$FamilyProtectReminderStats$Type[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
