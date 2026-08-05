package com.truecaller.ads.acsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000e"}, d2 = {"Lcom/truecaller/ads/acsrules/model/CallDirection;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OUTGOING", "INCOMING", "UNKNOWN", "MISSED", "getInt", "", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallDirection {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.acsrules.model.CallDirection[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.ads.acsrules.model.CallDirection OUTGOING = new com.truecaller.ads.acsrules.model.CallDirection("OUTGOING", 0, "outgoing");
    public static final com.truecaller.ads.acsrules.model.CallDirection INCOMING = new com.truecaller.ads.acsrules.model.CallDirection("INCOMING", 1, "incoming");
    public static final com.truecaller.ads.acsrules.model.CallDirection UNKNOWN = new com.truecaller.ads.acsrules.model.CallDirection("UNKNOWN", 2, "unknown");
    public static final com.truecaller.ads.acsrules.model.CallDirection MISSED = new com.truecaller.ads.acsrules.model.CallDirection("MISSED", 3, "missed");

    private static final /* synthetic */ com.truecaller.ads.acsrules.model.CallDirection[] $values() {
        return new com.truecaller.ads.acsrules.model.CallDirection[]{OUTGOING, INCOMING, UNKNOWN, MISSED};
    }

    static {
        com.truecaller.ads.acsrules.model.CallDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallDirection(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.acsrules.model.CallDirection valueOf(java.lang.String str) {
        return (com.truecaller.ads.acsrules.model.CallDirection) java.lang.Enum.valueOf(com.truecaller.ads.acsrules.model.CallDirection.class, str);
    }

    public static com.truecaller.ads.acsrules.model.CallDirection[] values() {
        return (com.truecaller.ads.acsrules.model.CallDirection[]) $VALUES.clone();
    }

    public final int getInt() {
        int i = s00.j.a[ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i == 4) {
                return -1;
            }
            throw new java.lang.RuntimeException();
        }
        return 0;
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
