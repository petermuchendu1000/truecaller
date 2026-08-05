package com.truecaller.blocking.api.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/truecaller/blocking/api/model/TrackingType;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "fj0/d", "PHONE_NUMBER", "WILDCARD", "COUNTRY", "IM_ID", "CALLER_NAME", "OTHER", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class TrackingType {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.blocking.api.model.TrackingType[] $VALUES;

    @org.jetbrains.annotations.NotNull
    public static final fj0.d Companion;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.blocking.api.model.TrackingType PHONE_NUMBER = new com.truecaller.blocking.api.model.TrackingType("PHONE_NUMBER", 0, "PHONE_NUMBER");
    public static final com.truecaller.blocking.api.model.TrackingType WILDCARD = new com.truecaller.blocking.api.model.TrackingType("WILDCARD", 1, "REG_EXP");
    public static final com.truecaller.blocking.api.model.TrackingType COUNTRY = new com.truecaller.blocking.api.model.TrackingType("COUNTRY", 2, "COUNTRY_CODE");
    public static final com.truecaller.blocking.api.model.TrackingType IM_ID = new com.truecaller.blocking.api.model.TrackingType("IM_ID", 3, "IM_ID");
    public static final com.truecaller.blocking.api.model.TrackingType CALLER_NAME = new com.truecaller.blocking.api.model.TrackingType("CALLER_NAME", 4, "CALLER_NAME");
    public static final com.truecaller.blocking.api.model.TrackingType OTHER = new com.truecaller.blocking.api.model.TrackingType("OTHER", 5, "OTHER");

    private static final /* synthetic */ com.truecaller.blocking.api.model.TrackingType[] $values() {
        return new com.truecaller.blocking.api.model.TrackingType[]{PHONE_NUMBER, WILDCARD, COUNTRY, IM_ID, CALLER_NAME, OTHER};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, fj0.d] */
    static {
        com.truecaller.blocking.api.model.TrackingType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
        Companion = new java.lang.Object();
    }

    private TrackingType(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.blocking.api.model.TrackingType valueOf(java.lang.String str) {
        return (com.truecaller.blocking.api.model.TrackingType) java.lang.Enum.valueOf(com.truecaller.blocking.api.model.TrackingType.class, str);
    }

    public static com.truecaller.blocking.api.model.TrackingType[] values() {
        return (com.truecaller.blocking.api.model.TrackingType[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
