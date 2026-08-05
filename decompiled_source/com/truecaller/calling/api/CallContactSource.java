package com.truecaller.calling.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/truecaller/calling/api/CallContactSource;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PHONEBOOK", "TOP_SPAMMER", "USER_SPAMMER", "USER_WHITELIST", "SERVER", "NO_HIT", "BIZ_DYNAMIC_CONTACT", "api_googlePlayRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class CallContactSource {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.calling.api.CallContactSource[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.calling.api.CallContactSource PHONEBOOK = new com.truecaller.calling.api.CallContactSource("PHONEBOOK", 0, "fromPhonebook");
    public static final com.truecaller.calling.api.CallContactSource TOP_SPAMMER = new com.truecaller.calling.api.CallContactSource("TOP_SPAMMER", 1, "fromTopSpammerList");
    public static final com.truecaller.calling.api.CallContactSource USER_SPAMMER = new com.truecaller.calling.api.CallContactSource("USER_SPAMMER", 2, "fromUserSpammerList");
    public static final com.truecaller.calling.api.CallContactSource USER_WHITELIST = new com.truecaller.calling.api.CallContactSource("USER_WHITELIST", 3, "fromUserWhiteList");
    public static final com.truecaller.calling.api.CallContactSource SERVER = new com.truecaller.calling.api.CallContactSource("SERVER", 4, "fromServer");
    public static final com.truecaller.calling.api.CallContactSource NO_HIT = new com.truecaller.calling.api.CallContactSource("NO_HIT", 5, "noHit");
    public static final com.truecaller.calling.api.CallContactSource BIZ_DYNAMIC_CONTACT = new com.truecaller.calling.api.CallContactSource("BIZ_DYNAMIC_CONTACT", 6, "BizDynamicContact");

    private static final /* synthetic */ com.truecaller.calling.api.CallContactSource[] $values() {
        return new com.truecaller.calling.api.CallContactSource[]{PHONEBOOK, TOP_SPAMMER, USER_SPAMMER, USER_WHITELIST, SERVER, NO_HIT, BIZ_DYNAMIC_CONTACT};
    }

    static {
        com.truecaller.calling.api.CallContactSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private CallContactSource(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.calling.api.CallContactSource valueOf(java.lang.String str) {
        return (com.truecaller.calling.api.CallContactSource) java.lang.Enum.valueOf(com.truecaller.calling.api.CallContactSource.class, str);
    }

    public static com.truecaller.calling.api.CallContactSource[] values() {
        return (com.truecaller.calling.api.CallContactSource[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
