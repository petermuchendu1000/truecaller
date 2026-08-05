package com.truecaller.familyprotect.domain.remotereject.notification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/truecaller/familyprotect/domain/remotereject/notification/NotificationStyle;", "", "<init>", "(Ljava/lang/String;I)V", "HEADS_UP", "SILENT", "domain_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class NotificationStyle {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[] $VALUES;
    public static final com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle HEADS_UP = new com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle("HEADS_UP", 0);
    public static final com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle SILENT = new com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle("SILENT", 1);

    private static final /* synthetic */ com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[] $values() {
        return new com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[]{HEADS_UP, SILENT};
    }

    static {
        com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private NotificationStyle(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle valueOf(java.lang.String str) {
        return (com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle) java.lang.Enum.valueOf(com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle.class, str);
    }

    public static com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[] values() {
        return (com.truecaller.familyprotect.domain.remotereject.notification.NotificationStyle[]) $VALUES.clone();
    }
}
