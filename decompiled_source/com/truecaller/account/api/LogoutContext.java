package com.truecaller.account.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/truecaller/account/api/LogoutContext;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "EXCHANGE_CREDENTIALS", "CHECK_CREDENTIALS", "DEACTIVATE", "AUTO_LOGIN", "QA_MENU", "CHANGE_NUMBER", "api"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: /home/user/tc_decoded/classes5.dex */
public final class LogoutContext {
    private static final /* synthetic */ gf3.bar $ENTRIES;
    private static final /* synthetic */ com.truecaller.account.api.LogoutContext[] $VALUES;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String value;
    public static final com.truecaller.account.api.LogoutContext EXCHANGE_CREDENTIALS = new com.truecaller.account.api.LogoutContext("EXCHANGE_CREDENTIALS", 0, "ExchangeCredentials");
    public static final com.truecaller.account.api.LogoutContext CHECK_CREDENTIALS = new com.truecaller.account.api.LogoutContext("CHECK_CREDENTIALS", 1, "CheckCredentials");
    public static final com.truecaller.account.api.LogoutContext DEACTIVATE = new com.truecaller.account.api.LogoutContext("DEACTIVATE", 2, "Deactivate");
    public static final com.truecaller.account.api.LogoutContext AUTO_LOGIN = new com.truecaller.account.api.LogoutContext("AUTO_LOGIN", 3, "AutoLogin");
    public static final com.truecaller.account.api.LogoutContext QA_MENU = new com.truecaller.account.api.LogoutContext("QA_MENU", 4, "QaMenu");
    public static final com.truecaller.account.api.LogoutContext CHANGE_NUMBER = new com.truecaller.account.api.LogoutContext("CHANGE_NUMBER", 5, "ChangeNumber");

    private static final /* synthetic */ com.truecaller.account.api.LogoutContext[] $values() {
        return new com.truecaller.account.api.LogoutContext[]{EXCHANGE_CREDENTIALS, CHECK_CREDENTIALS, DEACTIVATE, AUTO_LOGIN, QA_MENU, CHANGE_NUMBER};
    }

    static {
        com.truecaller.account.api.LogoutContext[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ge0.i.u($values);
    }

    private LogoutContext(java.lang.String str, int i, java.lang.String str2) {
        this.value = str2;
    }

    @org.jetbrains.annotations.NotNull
    public static gf3.bar getEntries() {
        return $ENTRIES;
    }

    public static com.truecaller.account.api.LogoutContext valueOf(java.lang.String str) {
        return (com.truecaller.account.api.LogoutContext) java.lang.Enum.valueOf(com.truecaller.account.api.LogoutContext.class, str);
    }

    public static com.truecaller.account.api.LogoutContext[] values() {
        return (com.truecaller.account.api.LogoutContext[]) $VALUES.clone();
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getValue() {
        return this.value;
    }
}
