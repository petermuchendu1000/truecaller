package com.truecaller.premium.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/premium/data/InsuranceState;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "w82/c0", "ACTIVE", "NOT_ELIGIBLE", "ELIGIBLE", "PROCESSING", "MISMATCH", "UNKNOWN", "legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes6.dex */
public final class InsuranceState {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.premium.data.InsuranceState[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final w82.c0 Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String id;
    public static final com.truecaller.premium.data.InsuranceState ACTIVE = new com.truecaller.premium.data.InsuranceState("ACTIVE", 0, "active");
    public static final com.truecaller.premium.data.InsuranceState NOT_ELIGIBLE = new com.truecaller.premium.data.InsuranceState("NOT_ELIGIBLE", 1, "noteligible");
    public static final com.truecaller.premium.data.InsuranceState ELIGIBLE = new com.truecaller.premium.data.InsuranceState("ELIGIBLE", 2, "eligible");
    public static final com.truecaller.premium.data.InsuranceState PROCESSING = new com.truecaller.premium.data.InsuranceState("PROCESSING", 3, "processing");
    public static final com.truecaller.premium.data.InsuranceState MISMATCH = new com.truecaller.premium.data.InsuranceState("MISMATCH", 4, "mismatch");
    public static final com.truecaller.premium.data.InsuranceState UNKNOWN = new com.truecaller.premium.data.InsuranceState("UNKNOWN", 5, "UNKNOWN");

    private static final /* synthetic */ com.truecaller.premium.data.InsuranceState[] $values() {
        return new com.truecaller.premium.data.InsuranceState[]{ACTIVE, NOT_ELIGIBLE, ELIGIBLE, PROCESSING, MISMATCH, UNKNOWN};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [w82.c0, java.lang.Object] */
    static {
        com.truecaller.premium.data.InsuranceState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private InsuranceState(java.lang.String str, int i, java.lang.String str2) {
        this.id = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static final com.truecaller.premium.data.InsuranceState fromString(@org.jetbrains.annotations.Nullable java.lang.String str) {
        Companion.getClass();
        return w82.c0.a(str);
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.premium.data.InsuranceState valueOf(java.lang.String str) {
        return (com.truecaller.premium.data.InsuranceState) java.lang.Enum.valueOf(com.truecaller.premium.data.InsuranceState.class, str);
    }

    public static com.truecaller.premium.data.InsuranceState[] values() {
        return (com.truecaller.premium.data.InsuranceState[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return this.id;
    }
}
