package com.truecaller.gov_services.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/gov_services/data/GovLevel;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "CENTRAL", "STATE", "STATE_HELPLINE", "gov-services_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class GovLevel {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.gov_services.data.GovLevel[] $VALUES;
    public static final com.truecaller.gov_services.data.GovLevel CENTRAL = new com.truecaller.gov_services.data.GovLevel("CENTRAL", 0, 1);
    public static final com.truecaller.gov_services.data.GovLevel STATE = new com.truecaller.gov_services.data.GovLevel("STATE", 1, 2);
    public static final com.truecaller.gov_services.data.GovLevel STATE_HELPLINE = new com.truecaller.gov_services.data.GovLevel("STATE_HELPLINE", 2, 3);
    private final int id;

    private static final /* synthetic */ com.truecaller.gov_services.data.GovLevel[] $values() {
        return new com.truecaller.gov_services.data.GovLevel[]{CENTRAL, STATE, STATE_HELPLINE};
    }

    static {
        com.truecaller.gov_services.data.GovLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private GovLevel(java.lang.String str, int i, int i2) {
        this.id = i2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.gov_services.data.GovLevel valueOf(java.lang.String str) {
        return (com.truecaller.gov_services.data.GovLevel) java.lang.Enum.valueOf(com.truecaller.gov_services.data.GovLevel.class, str);
    }

    public static com.truecaller.gov_services.data.GovLevel[] values() {
        return (com.truecaller.gov_services.data.GovLevel[]) $VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }
}
