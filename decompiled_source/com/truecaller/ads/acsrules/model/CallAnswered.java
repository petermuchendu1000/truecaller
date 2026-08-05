package com.truecaller.ads.acsrules.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@androidx.annotation.Keep
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/truecaller/ads/acsrules/model/CallAnswered;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANSWERED", "NOT_ANSWERED", "UNKNOWN", "ads-legacy_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallAnswered {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.ads.acsrules.model.CallAnswered[] $VALUES;
    public static final com.truecaller.ads.acsrules.model.CallAnswered ANSWERED = new com.truecaller.ads.acsrules.model.CallAnswered("ANSWERED", 0, "answered");
    public static final com.truecaller.ads.acsrules.model.CallAnswered NOT_ANSWERED = new com.truecaller.ads.acsrules.model.CallAnswered("NOT_ANSWERED", 1, "not_answered");
    public static final com.truecaller.ads.acsrules.model.CallAnswered UNKNOWN = new com.truecaller.ads.acsrules.model.CallAnswered("UNKNOWN", 2, "unknown");

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;

    private static final /* synthetic */ com.truecaller.ads.acsrules.model.CallAnswered[] $values() {
        return new com.truecaller.ads.acsrules.model.CallAnswered[]{ANSWERED, NOT_ANSWERED, UNKNOWN};
    }

    static {
        com.truecaller.ads.acsrules.model.CallAnswered[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallAnswered(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.ads.acsrules.model.CallAnswered valueOf(java.lang.String str) {
        return (com.truecaller.ads.acsrules.model.CallAnswered) java.lang.Enum.valueOf(com.truecaller.ads.acsrules.model.CallAnswered.class, str);
    }

    public static com.truecaller.ads.acsrules.model.CallAnswered[] values() {
        return (com.truecaller.ads.acsrules.model.CallAnswered[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
