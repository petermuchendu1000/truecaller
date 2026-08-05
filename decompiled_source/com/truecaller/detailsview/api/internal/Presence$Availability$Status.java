package com.truecaller.detailsview.api.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/truecaller/detailsview/api/internal/Presence$Availability$Status", "", "Lcom/truecaller/detailsview/api/internal/Presence$Availability$Status;", "<init>", "(Ljava/lang/String;I)V", "Unknown", "Available", "Busy", "Disabled", "Unrecognized", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class Presence$Availability$Status {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.detailsview.api.internal.Presence$Availability$Status[] $VALUES;
    public static final com.truecaller.detailsview.api.internal.Presence$Availability$Status Unknown = new com.truecaller.detailsview.api.internal.Presence$Availability$Status("Unknown", 0);
    public static final com.truecaller.detailsview.api.internal.Presence$Availability$Status Available = new com.truecaller.detailsview.api.internal.Presence$Availability$Status("Available", 1);
    public static final com.truecaller.detailsview.api.internal.Presence$Availability$Status Busy = new com.truecaller.detailsview.api.internal.Presence$Availability$Status("Busy", 2);
    public static final com.truecaller.detailsview.api.internal.Presence$Availability$Status Disabled = new com.truecaller.detailsview.api.internal.Presence$Availability$Status("Disabled", 3);
    public static final com.truecaller.detailsview.api.internal.Presence$Availability$Status Unrecognized = new com.truecaller.detailsview.api.internal.Presence$Availability$Status("Unrecognized", 4);

    private static final /* synthetic */ com.truecaller.detailsview.api.internal.Presence$Availability$Status[] $values() {
        return new com.truecaller.detailsview.api.internal.Presence$Availability$Status[]{Unknown, Available, Busy, Disabled, Unrecognized};
    }

    static {
        com.truecaller.detailsview.api.internal.Presence$Availability$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private Presence$Availability$Status(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.detailsview.api.internal.Presence$Availability$Status valueOf(java.lang.String str) {
        return (com.truecaller.detailsview.api.internal.Presence$Availability$Status) java.lang.Enum.valueOf(com.truecaller.detailsview.api.internal.Presence$Availability$Status.class, str);
    }

    public static com.truecaller.detailsview.api.internal.Presence$Availability$Status[] values() {
        return (com.truecaller.detailsview.api.internal.Presence$Availability$Status[]) $VALUES.clone();
    }
}
