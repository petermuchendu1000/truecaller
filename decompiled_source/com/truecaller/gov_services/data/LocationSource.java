package com.truecaller.gov_services.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/truecaller/gov_services/data/LocationSource;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "DEVICE", "USER", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class LocationSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.gov_services.data.LocationSource[] $VALUES;
    public static final com.truecaller.gov_services.data.LocationSource UNKNOWN = new com.truecaller.gov_services.data.LocationSource("UNKNOWN", 0);
    public static final com.truecaller.gov_services.data.LocationSource DEVICE = new com.truecaller.gov_services.data.LocationSource("DEVICE", 1);
    public static final com.truecaller.gov_services.data.LocationSource USER = new com.truecaller.gov_services.data.LocationSource("USER", 2);

    private static final /* synthetic */ com.truecaller.gov_services.data.LocationSource[] $values() {
        return new com.truecaller.gov_services.data.LocationSource[]{UNKNOWN, DEVICE, USER};
    }

    static {
        com.truecaller.gov_services.data.LocationSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private LocationSource(java.lang.String str, int i) {
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.gov_services.data.LocationSource valueOf(java.lang.String str) {
        return (com.truecaller.gov_services.data.LocationSource) java.lang.Enum.valueOf(com.truecaller.gov_services.data.LocationSource.class, str);
    }

    public static com.truecaller.gov_services.data.LocationSource[] values() {
        return (com.truecaller.gov_services.data.LocationSource[]) $VALUES.clone();
    }
}
